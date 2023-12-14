package fr.morgan.webapp.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFacade {

	public Authentication getAuthentication() {
		System.err.println(SecurityContextHolder.getContext().getAuthentication());
		return SecurityContextHolder.getContext().getAuthentication();
	}
}
