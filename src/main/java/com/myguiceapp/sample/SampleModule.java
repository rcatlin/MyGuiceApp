package com.myguiceapp.sample;

import com.google.inject.AbstractModule;

public class SampleModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SampleStoreInterface.class).to(SampleStore.class);
    }
}
