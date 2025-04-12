package org.bukkit.support;

/**
 * If you are getting: java.lang.ExceptionInInitializerError
 * <p>
 * extend this class to solve it.
 */
public abstract class AbstractTestingBase {

    static {
        TestServer.setup();
    }
}
