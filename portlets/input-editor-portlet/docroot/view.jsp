<%/** * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved. * * The contents of this file are subject to the terms of the Liferay Enterprise * Subscription License ("License"). You may not use this file except in * compliance with the License. You can obtain a copy of the License by * contacting Liferay, Inc. See the License for the specific language governing * permissions and limitations under the License, including but not limited to * distribution rights of the Software. * * * */%><%@ page import="com.liferay.portal.kernel.util.UnicodeFormatter" %><%@ page import="com.liferay.portal.kernel.util.ParamUtil" %><%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %><%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %><script>function openImageBrowser() {var imageBrowserUrl = "http://advait-liferay.com/html/js/editor/ckeditor/editor/filemanager/browser/liferay/browser.html?Connector=%2Fc%2Fportal%2Ffckeditor%3Fp_l_id%3D10157%26p_p_id%3D15%26CKEditor=i_c_ImageURL&CKEditorFuncNum=4&langCode=en&rohm_portal=true"	//var imageBrowserUrl = "http://advait-liferay.com/html/js/editor/ckeditor/editor/filemanager/browser/liferay/browser.html?Connector=%2Fc%2Fportal%2Ffckeditor%3Fp_l_id%3D10157%26p_p_id%3D15%26doAsUserId%3DZYjWuNf3b28%253D%26doAsGroupId%3D10162&CKEditor=i_c_ImageURL&CKEditorFuncNum=4&langCode=en"	window.open(imageBrowserUrl);}</script><portlet:defineObjects />This is the <b>input editor portlet</b> portlet.<form id="i_c_ImageBrowserForm"><input type="button" value="browse image" onclick="openImageBrowser()"/><textarea name="i_c_ImageURL" id="i_c_ImageURL"></textarea></form>