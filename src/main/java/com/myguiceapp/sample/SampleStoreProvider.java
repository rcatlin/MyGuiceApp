package com.myguiceapp.sample;

import com.google.inject.Provider;

public class SampleStoreProvider implements Provider<SampleStore> {
    public SampleStore get() {
        return new SampleStore();
    }
}
