// 
// Decompiled by Procyon v0.5.36
// 

package com.webapp.test;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;

public class TestRunner
{
    public static void main(final String[] args) {
        final Result result = JUnitCore.runClasses(new Class[] { TestAboutLink.class });
        for (final Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
