package com.fyber.inneractive.sdk.player.c;

import java.io.IOException;
/* loaded from: classes.dex */
public final class d extends Exception {
    public final int a;
    public final int b;

    public static d a(Exception exc, int i) {
        return new d(1, exc, i);
    }

    public static d a(IOException iOException) {
        return new d(0, iOException, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(RuntimeException runtimeException) {
        return new d(2, runtimeException, -1);
    }

    private d(int i, Throwable th, int i2) {
        super(null, th);
        this.a = i;
        this.b = i2;
    }
}
