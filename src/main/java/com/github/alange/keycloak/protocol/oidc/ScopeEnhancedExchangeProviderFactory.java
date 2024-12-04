package com.github.alange.keycloak.protocol.oidc;

import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.protocol.oidc.TokenExchangeProvider;
import org.keycloak.protocol.oidc.TokenExchangeProviderFactory;

public class ScopeEnhancedExchangeProviderFactory
    implements TokenExchangeProviderFactory {

    @Override
    public TokenExchangeProvider create(KeycloakSession session) {
        return new ScopeEnhancedTokenExchangeProvider();
    }

    @Override
    public void init(Config.Scope config) {
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
    }

    @Override
    public String getId() {
        return "scope-enhanced-token-exchange";
    }

    public void close() {
    }
}
