package com.kadirpasaoglu.jwt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Component
public class JwtAuthenticationFilter implements OncePerRequestFilter {

    @Autowired
    private JwtService jwtService;

   

}
