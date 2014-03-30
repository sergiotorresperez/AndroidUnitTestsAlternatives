/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.testingfun.tests.lesson3;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;

import com.example.android.testingfun.R;
import com.example.android.testingfun.lesson3.ClickFunActivity;
import com.google.android.apps.common.testing.ui.espresso.Espresso;
import com.google.android.apps.common.testing.ui.espresso.action.ViewActions;
import com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions;
import com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers;

/**
 * Tests for ClickFunActivity. Introduces touch mode, test size annotations and
 * TouchUtils.
 */
public class ClickFunActivityTest extends ActivityInstrumentationTestCase2<ClickFunActivity> {

    public ClickFunActivityTest() {
        super(ClickFunActivity.class);
    }

    /**
     * Sets up the test fixture for this test case. This method is always called
     * before every test run.
     */
    @Override
    protected void setUp()
            throws Exception {
        super.setUp();

        getActivity();
    }

    @MediumTest
    public void testClickMeButton_labelText() {
        Espresso.onView(ViewMatchers.withId(R.id.launch_next_activity_button))
                .check(ViewAssertions.matches(ViewMatchers.withText(R.string.label_click_me)));
    }

    //
    @MediumTest
    public void testInfoTextViewText_isEmpty() {
        // Verify that the mInfoTextView is initialized with the correct default
        // value

        Espresso.onView(ViewMatchers.withId(R.id.info_text_view))
                .check(ViewAssertions.matches(ViewMatchers.withText("")));
    }

    @MediumTest
    public void testClickMeButton_clickButtonAndExpectInfoText2() {
        Espresso.onView(ViewMatchers.withId(R.id.launch_next_activity_button))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.info_text_view))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(R.id.info_text_view))
                .check(ViewAssertions.matches(ViewMatchers.withText(R.string.info_text)));
    }
}
