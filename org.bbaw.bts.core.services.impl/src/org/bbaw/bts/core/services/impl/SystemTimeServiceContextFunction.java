package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.SystemTimeService;
import org.bbaw.bts.core.services.impl.services.SystemTimeServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class SystemTimeServiceContextFunction extends ContextFunction {
	
	@Override
	public Object compute(IEclipseContext context) {
		
		System.out.println("initialize system time service.");
		
		IEclipseContext ctx = context.get(MApplication.class) != null
				? context.get(MApplication.class).getContext()
						: context;
				
		SystemTimeService service = ContextInjectionFactory.make(SystemTimeServiceImpl.class, ctx);
		
		return service;
		
	}

}
