package com.gateway.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.factory.TokenRelayGatewayFilterFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceRouteConfiguration {

    private TokenRelayGatewayFilterFactory filterFactory;

    @Autowired
    public ServiceRouteConfiguration(TokenRelayGatewayFilterFactory filterFactory) {
        this.filterFactory = filterFactory;
    }
}
