/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *	   Sam Padgett	       - initial API and implementation
 *     Michael Fiedler     - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/

package se.rende.lyo.test.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

import se.rende.lyo.test.servlet.ServletListener; 
import se.rende.lyo.test.DagtestConstants;

// Start of user code imports
// End of user code

@OslcNamespace(DagtestConstants.GREJ_NAMSPACE)
@OslcName(DagtestConstants.MOJ) 
@OslcResourceShape(title = "Moj Resource Shape", describes = DagtestConstants.TYPE_MOJ)
public class Moj
	extends AbstractResource
	implements IMoj
{

private String name;  

public Moj()
       throws URISyntaxException
{
    super();

	// Start of user code constructor1
	// End of user code
}

public Moj(final URI about)
       throws URISyntaxException
{
    super(about);

	// Start of user code constructor2
	// End of user code
}

public Moj(final String serviceProviderId, final String mojId)
       throws URISyntaxException
{
	this (constructURI(serviceProviderId, mojId));
	// Start of user code constructor3
	// End of user code
}
public static URI constructURI(final String serviceProviderId, final String mojId)
{
    String basePath = ServletListener.getServicesBase();
    Map<String, Object> pathParameters = new HashMap<String, Object>();
    pathParameters.put("serviceProviderId", serviceProviderId);
    pathParameters.put("mojId", mojId);
    String instanceURI = "serviceProviders/{serviceProviderId}/mojs/{mojId}";
  
    final UriBuilder builder = UriBuilder.fromUri(basePath);
    return builder.path(instanceURI).buildFromMap(pathParameters);
}

public static Link constructLink(final String serviceProviderId, final String mojId , final String label)
{
	return new Link(constructURI(serviceProviderId, mojId), label);
}

public static Link constructLink(final String serviceProviderId, final String mojId)
{
	return new Link(constructURI(serviceProviderId, mojId));
}

public String toString()
{
	return toString(false);
}

public String toString(boolean asLocalResource)
{
		String result = "";
		// Start of user code toString_init
		// End of user code

		if (asLocalResource) {
			result = result + "{a Local Moj Resource} - update Moj.toString() to present resource as desired.";
			// Start of user code toString_bodyForLocalResource
			// End of user code
		}
		else {
			result = getAbout().toString();
		}

		// Start of user code toString_finalize
		// End of user code

		return result;
}

public String toHtml()
{
	return toHtml(false);
}

public String toHtml(boolean asLocalResource)
{
		String result = "";
		// Start of user code toHtml_init
		// End of user code

		if (asLocalResource) {
			result = toString(true);
			// Start of user code toHtml_bodyForLocalResource
			// End of user code
		}
		else {
			result = "<a href=\"" + getAbout() + "\">" + toString() + "</a>";
		}

		// Start of user code toHtml_finalize
		// End of user code

		return result;
}


	@OslcName("name")
	@OslcPropertyDefinition(DagtestConstants.GREJ_NAMSPACE + "name")
	@OslcDescription("")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcValueType(ValueType.String)
	@OslcReadOnly(false)
	@OslcTitle("name")
    public String getName()
    {
        return name;
    }


    public void setName(final String name )
    {
        this.name = name;
    }

    static public String nameToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
    	String s = "";
    
    	// Start of user code "Init:nameToHtmlForCreation(...)"
    	// End of user code
    
    	s = s + "<label for=\"name\">name: </LABEL>";
    
    	// Start of user code "Mid:nameToHtmlForCreation(...)"
    	// End of user code
    
    	s= s + "<input name=\"name\" type=\"text\" style=\"width: 400px\" id=\"name\" >";
    	// Start of user code "Finalize:nameToHtmlForCreation(...)"
    	// End of user code
    
    	return s; 
    }

    static public String nameToHtmlForCreation1 (final HttpServletRequest httpServletRequest, final String serviceProviderId)
    {
    	String s = "";
    
    	// Start of user code "Init:nameToHtmlForCreation1(...final String serviceProviderId)"
    	// End of user code
    
    	s = s + "<label for=\"name\">name: </LABEL>";
    
    	// Start of user code "Mid:nameToHtmlForCreation1(...final String serviceProviderId)"
    	// End of user code
    
    	s= s + "<input name=\"name\" type=\"text\" style=\"width: 400px\" id=\"name\" >";
    	// Start of user code "Finalize:nameToHtmlForCreation1(...final String serviceProviderId)"
    	// End of user code
    
    	return s; 
    }


    public String nameToHtml()
    {
		String s = "";

		// Start of user code nametoHtml_init
		// End of user code

		s = s + "<label for=\"name\"><strong>name</strong>: </LABEL>";

		// Start of user code nametoHtml_mid
		// End of user code

		try {
				if (name == null) {
					s= s + "<em>null</em>";				
				}
				else {
					s= s + name.toString();				
				}
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

		// Start of user code nametoHtml_finalize
		// End of user code

		return s; 
    }
}