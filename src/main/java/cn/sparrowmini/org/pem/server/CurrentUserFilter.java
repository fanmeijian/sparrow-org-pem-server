package cn.sparrowmini.org.pem.server;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import cn.sparrowmini.common.CurrentUser;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CurrentUserFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		// 用于设置hibernate获取操作用户日志使用
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication != null) {
			String username = authentication.getName();
			CurrentUser.logIn(username);
		} else {
			CurrentUser.logOut();
		}

		filterChain.doFilter(request, response);
	}
}
