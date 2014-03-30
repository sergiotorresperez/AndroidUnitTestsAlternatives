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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.testingfun.R;
import com.example.android.testingfun.lesson3.ClickFunActivity;

/**
 * Tests for ClickFunActivity. Introduces touch mode, test size annotations and
 * TouchUtils.
 */
@RunWith(RobolectricTestRunner.class)
public class ClickFunActivityTest {

    ClickFunActivity mActivity;

    @Before
    public void mActivity() {
        mActivity = Robolectric.buildActivity(ClickFunActivity.class)
                               .create()
                               .get();
    }

    @Test
    public void testClickMeButton_labelText() {
        String expected = mActivity.getString(R.string.label_click_me);
        String found = ((TextView) mActivity.findViewById(R.id.launch_next_activity_button)).getText()
                                                                                            .toString();
        assertEquals(expected, found);
    }

    @Test
    public void testInfoTextViewText_isEmpty() {
        // Verify that the mInfoTextView is initialized with the correct default
        // value

        TextView textView = (TextView) mActivity.findViewById(R.id.info_text_view);
        assertTrue(TextUtils.isEmpty(textView.getText()));
    }

    @Test
    public void testClickMeButton_clickButtonAndExpectInfoText2() {

        Button btn = (Button) mActivity.findViewById(R.id.launch_next_activity_button);
        TextView textView = (TextView) mActivity.findViewById(R.id.info_text_view);

        btn.performClick();

        assertEquals(View.VISIBLE, textView.getVisibility());
        assertEquals(mActivity.getString(R.string.info_text), textView.getText());

    }
}
