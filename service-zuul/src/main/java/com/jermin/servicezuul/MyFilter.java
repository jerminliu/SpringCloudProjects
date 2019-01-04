package com.jermin.servicezuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Email s_zmliu@hotmail.com
 *
 * @author jerminliu
 * Create 25 Dec 2018
 */
@Component
public class MyFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContent = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = requestContent.getRequest();
        logger.info(String.format("%s >>> %s", httpServletRequest.getMethod(), httpServletRequest.getRequestURL().toString()));

        Object accessToken = httpServletRequest.getParameter("token");
        if (accessToken == null) {
            logger.warn("token is empty");
            requestContent.setSendZuulResponse(false);
            requestContent.setResponseStatusCode(401);
            try {
                requestContent.getResponse().getWriter().write("token is empty");
            } catch (Exception e){

            }
        }
        logger.info("ok");
        return null;
    }
}
