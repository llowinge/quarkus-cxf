package io.quarkiverse.cxf.features.logging.deployment;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.feature.Features;

/**
 * The simplest Hello service implementation.
 */
@WebService(serviceName = "HelloService")
@Features(classes = { LoggingFeature.class })
public class HelloServiceImpl implements HelloService {

    @WebMethod
    @Override
    public String hello(String text) {
        return "Hello " + text + "!";
    }

}
