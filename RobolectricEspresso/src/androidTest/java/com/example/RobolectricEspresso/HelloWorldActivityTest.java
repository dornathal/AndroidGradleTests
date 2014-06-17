package com.example.RobolectricEspresso;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
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
    public void testActivityNameIsRobolectricEspresso() throws Exception {
        assertThat(activity.getTitle().toString(), equalTo("RobolectricEspresso"));
    }

    @Test
    public void testWhenButtonIsClickedThenTextGetsChanged() throws Exception {
        final TextView textView = (TextView) activity.findViewById(R.id.text);
        final Button button = (Button) activity.findViewById(R.id.button);

        button.performClick();

        //noinspection ConstantConditions
        assertThat(textView.getText().toString(), equalTo("ButtonClicked"));
    }

    @After
    public void tearDown() throws Exception {

    }
}
