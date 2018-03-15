package com.myguiceapp.sample;

import com.google.inject.Guice;
import com.google.inject.Injector;
import junit.framework.TestCase;

public class SampleModuleTest extends TestCase {
    public void testProvides()
    {
        Injector injector = Guice.createInjector(new SampleModule());

        SampleStoreInterface sampleStore = injector.getInstance(SampleStoreInterface.class);

        assertNotNull(sampleStore);
    }
}
