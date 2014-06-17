package com.example.RobolectricEspresso;

import android.app.Activity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(FixedRobolectricTestRunner.class)
public class HelloWorldActivityTest {
    private Activity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(HelloWorldActivity.class).create().visible().get();
    }

    @Test
    public void testActivityNameIsHelloWorld() throws Exception {
        assertThat(activity.getTitle().toString(), equalTo("RobolectricEspresso"));
    }

    @After
    public void tearDown() throws Exception {

    }
}
