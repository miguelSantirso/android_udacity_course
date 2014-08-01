package com.pncil.com.pncil.sunshine.test;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;

/**
 * Created by miguel on 24/07/14.
 */
public class FullTestSuite
{

    public static Test suite()
    {
        return new TestSuiteBuilder(FullTestSuite.class).includeAllPackagesUnderHere().build();
    }


    public FullTestSuite() {
        super();
    }

}
