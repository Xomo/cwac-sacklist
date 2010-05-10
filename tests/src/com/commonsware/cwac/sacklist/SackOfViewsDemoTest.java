package com.commonsware.cwac.sacklist;

import android.test.ActivityInstrumentationTestCase;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.commonsware.cwac.sacklist.SackOfViewsDemoTest \
 * com.commonsware.cwac.sacklist.tests/android.test.InstrumentationTestRunner
 */
public class SackOfViewsDemoTest extends ActivityInstrumentationTestCase<SackOfViewsDemo> {

    public SackOfViewsDemoTest() {
        super("com.commonsware.cwac.sacklist", SackOfViewsDemo.class);
    }

}
