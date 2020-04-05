package com.amos.awss3tutorial.bucket;

import lombok.Getter;

@Getter
public enum AwsS3BucketName {
    PROFILE_IMAGE_BUCKET("amos-aniwange");
    private final String bucketName;

    AwsS3BucketName(String name) {
        this.bucketName = name;
    }

}
