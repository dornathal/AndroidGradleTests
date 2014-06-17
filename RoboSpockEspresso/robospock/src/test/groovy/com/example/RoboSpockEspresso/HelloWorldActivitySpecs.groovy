package com.example.RoboSpockEspresso

import org.robolectric.Robolectric
import pl.polidea.robospock.RoboSpecification

class HelloWorldActivitySpecs extends RoboSpecification {


/*
    '''
    TODO fix RoboSpock returning a proper activity title
    activity.getTitle() == null
    So this test actually doesn't work
    '''

    def "should have title as RoboSpock"(){
        given:
        def activity = Robolectric.buildActivity(HelloWorldActivity).create().visible().get()

        when:
        activity.findViewById(R.id.button).performClick()

        then:
        activity.getTitle() == "RoboSpock"
    }
*/

    def "should button change the text"(){
        given:
        def activity = Robolectric.buildActivity(HelloWorldActivity).create().visible().get()

        when:
        activity.findViewById(R.id.button).performClick()

        then:
        activity.text.getText() == "ButtonClicked"
    }

}