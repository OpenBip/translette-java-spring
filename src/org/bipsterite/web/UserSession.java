/**
 * 
 */
package org.bipsterite.web;

/**
 * @author bippy
 *
 */
public class UserSession {
    private String username;

    public boolean isAuthenticated() {
        return (this.username == null);
    }
    
    public String getUsername() {
        return this.username;
    }
}
