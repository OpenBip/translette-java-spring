/**
 * 
 */
package org.bipsterite;

import org.bipsterite.user.AuthenticationService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author bippy
 */
public class AuthenticationServiceTests {
    @Test
    public void testBasic() {
        AuthenticationService service = new AuthenticationService();
        Assert.assertTrue(service.authenticateUser("bippy", "bippy"));
    }
}
