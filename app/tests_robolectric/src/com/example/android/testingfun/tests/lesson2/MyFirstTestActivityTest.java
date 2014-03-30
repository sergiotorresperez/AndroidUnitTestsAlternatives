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

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import android.widget.TextView;

import com.example.android.testingfun.R;
import com.example.android.testingfun.lesson2.MyFirstTestActivity;

/**
 * Tests for MyFirstTestActivity.
 */
@RunWith(RobolectricTestRunner.class)
public class MyFirstTestActivityTest {

    MyFirstTestActivity mActivity;

    @Before
    public void mActivity() {
        mActivity = Robolectric.buildActivity(MyFirstTestActivity.class)
                               .create()
                               .get();
    }

    /**
     * Tests the correctness of the initial text.
     */
    @Test
    public void testMyFirstTestTextView_labelText() {
        String expected = mActivity.getString(R.string.my_first_test);
        String found = ((TextView) mActivity.findViewById(R.id.my_first_test_text_view)).getText()
                                                                                        .toString();
        assertEquals(expected, found);
    }

}