package com.rohm.portal;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MobileServicePreAction extends Action {

	@Override
	public void run(HttpServletRequest request, HttpServletResponse response)
			throws ActionException {
		String userAgent = request.getHeader("user-agent");
		System.out.println("user-agent:" + request.getHeader("user-agent"));
		System.out.println("request.getRequestURI()=" + request.getRequestURI());
		if (!request.getRequestURI().contains("mobile-rohm") && !request.getRequestURI().contains("/c")) {
			if (userAgent.contains("iPhone")) {
				RequestDispatcher rd = request
						.getRequestDispatcher("/web/mobile-rohm/home");
				try {
					rd.forward(request, response);
					System.out.println("forward done");
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}