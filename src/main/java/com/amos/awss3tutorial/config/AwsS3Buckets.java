package com.amos.awss3tutorial.config;

import lombok.Getter;

@Getter
public enum AwsS3Buckets {
    ImageFilesBucket("amos-aniwange");
    private final String BUCKET_NAME;

    AwsS3Buckets(String name) {
        this.BUCKET_NAME = name;
    }

}
