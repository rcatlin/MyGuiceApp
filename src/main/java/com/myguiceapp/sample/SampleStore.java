package com.myguiceapp.sample;

import com.google.inject.Singleton;
import java.util.HashMap;

@Singleton
public class SampleStore implements SampleStoreInterface {
    private HashMap<String, Sample> samples = new HashMap<String, Sample>();

    public SampleStore() {
        samples.put("foo", Sample.builder()
            .client("Foo")
            .name("foo")
            .build());
        samples.put("bar", Sample.builder()
            .client("Bar")
            .name("bar")
            .build());
    }

    public Sample get(String name) {
        return samples.get(name);
    }
}
