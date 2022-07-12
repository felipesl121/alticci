package org.test.rest.json;

import java.math.BigInteger;

public class Sequence {

    public BigInteger value;
    public int nth;

    public long time;

    public Sequence() {
    }

    public Sequence(BigInteger value, int nth, long time) {
        this.value = value;
        this.nth = nth;
        this.time = time;
    }
}
