package com.example.RobolectricEspresso.espresso;

import android.test.ActivityInstrumentationTestCase2;
import com.example.RobolectricEspresso.HelloWorldActivity;
import com.example.RobolectricEspresso.R;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;

public class HelloWorldActivityTest extends ActivityInstrumentationTestCase2<HelloWorldActivity>{

    @SuppressWarnings("deprecation")
    public HelloWorldActivityTest() {
       // Support lower API levels even if constructor is deprecated.
       super("com.example.activity", HelloWorldActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        // We must launch an activity for espresso via getActivity().
        getActivity();
    }

    public void testTextIsDisplayed() throws Exception {
        onView(withId(R.id.text)).check(matches(isDisplayed()));
    }

    public void testButtonIsDisplayed() throws Exception {
        onView(withId(R.id.button)).check(matches(isDisplayed()));
    }
}
