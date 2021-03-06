/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.refactoring.impl;

import static com.google.common.collect.Maps.*;
import static org.eclipse.xtext.util.Strings.*;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ui.refactoring.IRenameStrategy;
import org.eclipse.xtext.ui.refactoring.IRenamedElementTracker;

/**
 * Renames an element without loosing track of the element and dependent elements.
 * 
 * @author Jan Koehnlein - Initial contribution and API
 */
public class RenamedElementTracker implements IRenamedElementTracker {

	public Map<URI, URI> renameAndTrack(Iterable<URI> renamedElementURIs, String newName, ResourceSet resourceSet, IRenameStrategy renameStrategy, IProgressMonitor monitor) {
		SubMonitor progress = SubMonitor.convert(monitor).setWorkRemaining(3);
		Map<EObject, URI> renamedElement2oldURI = resolveRenamedElements(renamedElementURIs, resourceSet);
		progress.worked(1);
		renameStrategy.applyDeclarationChange(newName, resourceSet);
		progress.worked(1);
		Map<URI, URI> old2newURI = relocateRenamedElements(renamedElement2oldURI);
		progress.worked(1);
		renameStrategy.revertDeclarationChange(resourceSet);
		return old2newURI;
	}

	protected Map<EObject, URI> resolveRenamedElements(Iterable<URI> renamedElementURIs, ResourceSet resourceSet) {
		Map<EObject, URI> renamedElement2oldURI = newHashMap();
		for (URI renamedElementURI : renamedElementURIs) {
			EObject renamedElement = resourceSet.getEObject(renamedElementURI, true);
			if (renamedElement == null)
				throw new RefactoringException("Cannot resolve dependent element " + notNull(renamedElementURI));
			renamedElement2oldURI.put(renamedElement, renamedElementURI);
		}
		return renamedElement2oldURI;
	}

	protected Map<URI, URI> relocateRenamedElements(Map<EObject, URI> renamedElement2oldURI) {
		Map<URI, URI> old2newURI = newHashMap();
		for (Map.Entry<EObject, URI> entry : renamedElement2oldURI.entrySet()) {
			URI newURI = EcoreUtil.getURI(entry.getKey());
			old2newURI.put(entry.getValue(), newURI);
		}
		return old2newURI;
	}

}
