package com.example.android.misc;

import junit.framework.TestCase;

public class MiscTest extends TestCase {

    public void testSimple_sdkIndependent() {
        int a = 2;
        assertEquals(2, a);
    }

    public void testSimple_sdkIndependent2() {
        int a = 3;
        assertEquals(3, a);
    }
}
