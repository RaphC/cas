package org.apereo.cas.oidc.claims;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apereo.cas.services.ReturnAllowedAttributeReleasePolicy;

import java.util.Arrays;
import java.util.List;

/**
 * This is {@link OidcEmailScopeAttributeReleasePolicy}.
 *
 * @author Misagh Moayyed
 * @since 5.1.0
 */
public class OidcEmailScopeAttributeReleasePolicy extends BaseOidcScopeAttributeReleasePolicy {
    private static final long serialVersionUID = 1532960981124784595L;

    private List<String> allowedAttributes = Arrays.asList("email", "email_verified");

    public OidcEmailScopeAttributeReleasePolicy() {
        super("email");
        setAllowedAttributes(allowedAttributes);
    }

    @JsonIgnore
    @Override
    public List<String> getAllowedAttributes() {
        return super.getAllowedAttributes();
    }
}
