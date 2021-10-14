package com.seriouszyx;

import org.junit.Assert;
import org.junit.Test;

public class MavenReleaseTest {

    @Test
    public void testHelloMavenRelease() {
        String expected = "Hello Maven Repository";
        Assert.assertEquals(expected, HelloMavenRelease.helloMvnRepo());
    }


}
