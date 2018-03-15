package com.myguiceapp.sample;

import junit.framework.TestCase;

public class SampleTest extends TestCase {
    public void testBuilderAndGetters()
    {
        Sample sample = Sample.builder()
                .client("client")
                .name("name")
                .build();

        assertEquals(sample.getClient(), "client");
        assertEquals(sample.getName(), "name");
    }
}
