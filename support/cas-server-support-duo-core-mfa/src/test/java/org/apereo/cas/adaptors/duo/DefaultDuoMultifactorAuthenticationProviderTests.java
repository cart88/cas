package org.apereo.cas.adaptors.duo;

import org.apereo.cas.adaptors.duo.authn.DefaultDuoSecurityMultifactorAuthenticationProvider;
import org.apereo.cas.adaptors.duo.authn.DuoSecurityAuthenticationService;
import org.apereo.cas.authentication.AbstractMultifactorAuthenticationProvider;
import org.apereo.cas.authentication.BaseAbstractMultifactorAuthenticationProviderTests;

import static org.mockito.Mockito.*;

/**
 * This is {@link DefaultDuoMultifactorAuthenticationProviderTests}.
 *
 * @author Misagh Moayyed
 * @since 6.1.0
 */
public class DefaultDuoMultifactorAuthenticationProviderTests extends BaseAbstractMultifactorAuthenticationProviderTests {
    @Override
    public AbstractMultifactorAuthenticationProvider getMultifactorAuthenticationProvider() {
        return new DefaultDuoSecurityMultifactorAuthenticationProvider("https://www.example.org",
            mock(DuoSecurityAuthenticationService.class));
    }
}
