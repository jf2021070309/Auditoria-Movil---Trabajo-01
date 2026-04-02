package com.vungle.publisher;
/* loaded from: classes4.dex */
public class zn {
    public static int a(int i, int i2, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException("retryCount must not be negative, retryCount = " + i);
        }
        if (i == 0) {
            return 0;
        }
        return (int) ze.a(i - 1, i2, i3);
    }
}
