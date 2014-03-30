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
package com.example.android.testingfun.tests.lesson2;

import android.test.ActivityInstrumentationTestCase2;

import com.example.android.testingfun.R;
import com.example.android.testingfun.lesson2.MyFirstTestActivity;
import com.google.android.apps.common.testing.ui.espresso.Espresso;
import com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions;
import com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers;

/**
 * Tests for MyFirstTestActivity.
 */
public class MyFirstTestActivityTest extends ActivityInstrumentationTestCase2<MyFirstTestActivity> {

    public MyFirstTestActivityTest() {
        super(MyFirstTestActivity.class);
    }

    @Override
    protected void setUp()
            throws Exception {
        super.setUp();
        getActivity();
    }

    /**
     * Tests the correctness of the initial text.
     */
    public void testMyFirstTestTextView_labelText() {
        Espresso.onView(ViewMatchers.withId(R.id.my_first_test_text_view))
                .check(ViewAssertions.matches(ViewMatchers.withText(R.string.my_first_test)));
    }
}