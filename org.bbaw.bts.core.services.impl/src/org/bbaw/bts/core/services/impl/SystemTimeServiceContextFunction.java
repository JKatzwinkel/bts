package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.SystemTimeService;
import org.bbaw.bts.core.services.impl.services.SystemTimeServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class SystemTimeServiceContextFunction extends ContextFunction {
	
	@Override
	public Object compute(IEclipseContext context) {
		
		System.out.println("initialize system time service.");
				
		SystemTimeService service = ContextInjectionFactory.make(SystemTimeServiceImpl.class, context);
		
		return service;
		
	}

}
