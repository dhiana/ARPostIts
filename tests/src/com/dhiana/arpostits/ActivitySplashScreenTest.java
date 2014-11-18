package com.dhiana.arpostits;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.dhiana.arpostits.ActivitySplashScreenTest \
 * com.dhiana.arpostits.tests/android.test.InstrumentationTestRunner
 */
public class ActivitySplashScreenTest extends ActivityInstrumentationTestCase2<ActivitySplashScreen> {

    public ActivitySplashScreenTest() {
        super("com.dhiana.arpostits", ActivitySplashScreen.class);
    }

}
