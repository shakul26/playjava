package com.playjava.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * This is equivalent to web.xml
 * */

public class PlayJavaInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[]{PlayJavaConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @author Shakul
	 * Method getServletMappings(), identifies one or more paths that DispatcherServlet will be mapped to.
	 * */
	@Override
	protected String[] getServletMappings() {
		
		/**
		 * @author Shakul
		 * all incoming request will be handled by this default servlet
		 * */
		return new String[]{"/"};
		
	}

	
}
