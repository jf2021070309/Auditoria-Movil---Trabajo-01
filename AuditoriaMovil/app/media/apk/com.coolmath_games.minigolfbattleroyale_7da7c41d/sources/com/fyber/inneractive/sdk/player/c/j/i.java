package com.fyber.inneractive.sdk.player.c.j;

import android.net.Uri;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class i {
    public final Uri a;
    public final byte[] b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public i(Uri uri, long j, String str) {
        this(uri, j, j, -1L, str, 0);
    }

    public i(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public i(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, j, j2, j3, str, i, (byte) 0);
    }

    private i(Uri uri, long j, long j2, long j3, String str, int i, byte b) {
        boolean z = true;
        com.fyber.inneractive.sdk.player.c.k.a.a(j >= 0);
        com.fyber.inneractive.sdk.player.c.k.a.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        com.fyber.inneractive.sdk.player.c.k.a.a(z);
        this.a = uri;
        this.b = null;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = i;
    }

    public final boolean a(int i) {
        return (this.g & i) == i;
    }

    public final String toString() {
        return "DataSpec[" + this.a + ", " + Arrays.toString(this.b) + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + "]";
    }
}
