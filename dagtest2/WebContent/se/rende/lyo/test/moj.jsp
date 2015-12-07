<!DOCTYPE html>
<%--
 Copyright (c) 2011, 2012 IBM Corporation and others.

 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 
 The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 and the Eclipse Distribution License is available at
 http://www.eclipse.org/org/documents/edl-v10.php.
 
 Contributors:
 
    Sam Padgett	  	- initial API and implementation
    Michael Fiedler	- adapted for OSLC4J
	Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)

 This file is generated by org.eclipse.lyo.oslc4j.codegenerator
--%>

<%@page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider"%>
<%@page import="java.util.List" %>
<%@page import="se.rende.lyo.test.resources.Moj"%>
<%--
Start of user code imports
--%>
<%-- 
End of user code 
--%>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8" %>

<%
    Moj aMoj = (Moj) request.getAttribute("aMoj");
%>
<%--
Start of user code getRequestAttributes
--%>
<%--
End of user code
--%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<title><%= aMoj.toHtml() %></title>
		<%-- 
Start of user code (RECOMMENDED) headStuff 
		--%>
		<%-- 
End of user code 
		--%>
	</head>
	<body onload="">
		<div id="header">
			<div id="banner"></div>
			<table border="0" cellspacing="0" cellpadding="0" id="titles">
				<tr>
					<td id="title">
						<p>
							<%= aMoj.toHtml() %>
						</p>
					</td>
					<td id="information">
						<p class="header_addl_info">
							version 0.1
						</p>
					</td>
				</tr>
			</table>
		</div>
		
		<div id="bugzilla-body">  
			<div id="page-index">
				<%-- 
Start of user code (RECOMMENDED) bodyStuff1 
				--%>
				<%-- 
End of user code 
				--%>

				<h1>Resource Presentation</h1>
                <p>Summary: <%= aMoj.toHtml() %><br /></p>
				<h2>Properties</h2>
				<table style="clear: both;">
					<tr>
						<td><%= aMoj.nameToHtml()%></td>
					</tr>
				</table>

			</div>
		</div>
		
		<div id="footer">
			<div class="intro"></div>
			<div class="outro">
				<div style="margin: 0 1em 1em 1em; line-height: 1.6em; text-align: left">
					<b>OSLC Tools Adapter Server 0.1</b> brought to you by <a href="http://eclipse.org/lyo">Eclipse Lyo</a><br />
				</div>
			</div>
		</div>
		

		
	</body>
</html>
