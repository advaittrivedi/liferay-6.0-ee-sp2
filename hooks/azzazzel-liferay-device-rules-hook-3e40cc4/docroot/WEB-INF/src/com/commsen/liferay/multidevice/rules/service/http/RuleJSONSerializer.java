/**
 * Copyright (c) COMMSEN International. All rights reserved.
 *	
 * This library is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library.  If not, see http://www.gnu.org/licenses/lgpl.html.
 */

package com.commsen.liferay.multidevice.rules.service.http;

import com.commsen.liferay.multidevice.rules.model.Rule;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

import java.util.List;

/**
 * @author    Milen Dyankov
 * @generated
 */
public class RuleJSONSerializer {
	public static JSONObject toJSONObject(Rule model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("rid", model.getRid());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("layoutId", model.getLayoutId());
		jsonObj.put("brand", model.getBrand());
		jsonObj.put("model", model.getModel());
		jsonObj.put("os", model.getOs());
		jsonObj.put("osVersion", model.getOsVersion());
		jsonObj.put("browser", model.getBrowser());
		jsonObj.put("browserVersion", model.getBrowserVersion());
		jsonObj.put("pointingMethod", model.getPointingMethod());
		jsonObj.put("tablet", model.getTablet());
		jsonObj.put("qwertyKeyboad", model.getQwertyKeyboad());
		jsonObj.put("action", model.getAction());
		jsonObj.put("themeId", model.getThemeId());
		jsonObj.put("colorSchemeId", model.getColorSchemeId());
		jsonObj.put("url", model.getUrl());
		jsonObj.put("priority", model.getPriority());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.commsen.liferay.multidevice.rules.model.Rule[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Rule model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.commsen.liferay.multidevice.rules.model.Rule[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Rule[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.commsen.liferay.multidevice.rules.model.Rule> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Rule model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}