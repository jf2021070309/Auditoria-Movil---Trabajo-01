package com.amazon.aps.iva.v1;

import android.os.Parcel;
/* compiled from: AndroidClipboardManager.android.kt */
/* loaded from: classes.dex */
public final class m1 {
    public Parcel a;

    public m1() {
        Parcel obtain = Parcel.obtain();
        com.amazon.aps.iva.yb0.j.e(obtain, "obtain()");
        this.a = obtain;
    }

    public final void a(byte b) {
        this.a.writeByte(b);
    }

    public final void b(float f) {
        this.a.writeFloat(f);
    }

    public final void c(long j) {
        long b = com.amazon.aps.iva.o2.m.b(j);
        byte b2 = 0;
        if (!com.amazon.aps.iva.o2.n.a(b, 0L)) {
            if (com.amazon.aps.iva.o2.n.a(b, 4294967296L)) {
                b2 = 1;
            } else if (com.amazon.aps.iva.o2.n.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        a(b2);
        if (!com.amazon.aps.iva.o2.n.a(com.amazon.aps.iva.o2.m.b(j), 0L)) {
            b(com.amazon.aps.iva.o2.m.c(j));
        }
    }
}
