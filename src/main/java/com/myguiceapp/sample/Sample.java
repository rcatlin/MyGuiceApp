package com.myguiceapp.sample;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Sample implements SampleInterface {
    private final String name;
    private final String client;
}
