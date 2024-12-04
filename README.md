Token exchange implementation that allows additional scopes to pass during token exchanges. This was possible in
Keycloak version 23 and earlier, but it changed in Keycloak 24. This basically revert the exchange token
behaviour to keycloak 23.

View <a href="https://github.com/keycloak/keycloak/issues/29614#issuecomment-2366821004">Keycloak issue</a>
