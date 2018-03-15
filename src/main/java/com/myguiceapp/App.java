package com.myguiceapp;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.myguiceapp.sample.SampleStoreInterface;
import com.myguiceapp.sample.SampleModule;

public class App 
{
    public static void main( String[] args )
    {
        Injector injector = Guice.createInjector(new SampleModule());

        SampleStoreInterface sampleStore = injector.getInstance(SampleStoreInterface.class);

        System.out.println("Foo: " + sampleStore.get("foo"));
        System.out.println("Bar: " + sampleStore.get("bar"));
    }
}
