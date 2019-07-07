package webscanner;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;

public class JwtFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		
		String header = httpRequest.getHeader("authorization");
		if(header == null || !header.startsWith("Bearer ")) {
			throw new ServletException("Missing header");
		}
		else {
			try {
				String tokenString = header.substring(7);
				Claims claims = Jwts.parser().setSigningKey("Przybylski").parseClaimsJws(tokenString).getBody();
				httpRequest.setAttribute("claims", claims);
				
			}
			catch(final SignatureException e){
				throw new ServletException("Bad header");
			}
		}
		chain.doFilter(httpRequest, response);
	}

}
