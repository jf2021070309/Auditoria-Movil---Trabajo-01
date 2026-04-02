package com.amazon.aps.iva.qe;

import java.io.Serializable;
/* compiled from: InGraceNotificationInput.kt */
/* loaded from: classes.dex */
public abstract class d implements Serializable {
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;

    public d(int i, int i2, long j, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = z;
    }

    public long a() {
        return this.d;
    }

    public boolean b() {
        return this.e;
    }
}
