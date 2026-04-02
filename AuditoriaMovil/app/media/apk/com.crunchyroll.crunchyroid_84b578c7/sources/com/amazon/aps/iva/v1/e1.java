package com.amazon.aps.iva.v1;

import android.os.Parcel;
import android.util.Base64;
/* compiled from: AndroidClipboardManager.android.kt */
/* loaded from: classes.dex */
public final class e1 {
    public final Parcel a;

    public e1(String str) {
        Parcel obtain = Parcel.obtain();
        com.amazon.aps.iva.yb0.j.e(obtain, "obtain()");
        this.a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public final int a() {
        return this.a.dataAvail();
    }

    public final float b() {
        return this.a.readFloat();
    }

    public final long c() {
        long j;
        byte readByte = this.a.readByte();
        if (readByte == 1) {
            j = 4294967296L;
        } else if (readByte == 2) {
            j = 8589934592L;
        } else {
            j = 0;
        }
        if (com.amazon.aps.iva.o2.n.a(j, 0L)) {
            return com.amazon.aps.iva.o2.m.c;
        }
        return com.amazon.aps.iva.e.z.L(j, b());
    }
}
