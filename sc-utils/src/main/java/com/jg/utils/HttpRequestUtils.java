package com.jg.utils;

import javax.servlet.http.HttpServletRequest;

public class HttpRequestUtils {
	public static boolean isAjax(HttpServletRequest request) {
		if (request != null
				&& "XMLHttpRequest".equalsIgnoreCase(request
						.getHeader("X-Requested-With")))
			return true;
		return false;
	}
}
