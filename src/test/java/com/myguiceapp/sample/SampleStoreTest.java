package com.myguiceapp.sample;

import junit.framework.TestCase;

public class SampleStoreTest extends TestCase {
    private SampleStore store;

    public void setUp() throws Exception
    {
        super.setUp();
        store = new SampleStore();
    }

    public void testGetFoo()
    {
        Sample foo = store.get("foo");
        assertNotNull(foo);
    }

    public void testGetBar()
    {
        Sample bar = store.get("bar");
        assertNotNull(bar);
    }

    public void testNonexistantSample()
    {
        Sample none = store.get("none");
        assertNull(none);
    }
}
