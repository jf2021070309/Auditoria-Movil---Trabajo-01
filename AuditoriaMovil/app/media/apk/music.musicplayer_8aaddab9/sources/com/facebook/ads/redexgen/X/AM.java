package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* loaded from: assets/audience_network.dex */
public final class AM extends Exception {
    public final int A00;
    public final int A01;

    public AM(int i2, String str, Throwable th, int i3) {
        super(str, th);
        this.A01 = i2;
        this.A00 = i3;
    }

    public static AM A00(IOException iOException) {
        return new AM(0, null, iOException, -1);
    }

    public static AM A01(Exception exc, int i2) {
        return new AM(1, null, exc, i2);
    }

    public static AM A02(RuntimeException runtimeException) {
        return new AM(2, null, runtimeException, -1);
    }
}
