package com.amazon.aps.iva.i9;

import java.util.Objects;
/* compiled from: WebMessageCompat.java */
/* loaded from: classes.dex */
public final class d {
    public final e[] a;
    public final String b;
    public final int c;

    public d(String str, e[] eVarArr) {
        this.b = str;
        this.a = eVarArr;
        this.c = 0;
    }

    public final String a() {
        String str;
        int i = this.c;
        if (i == 0) {
            return this.b;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        if (i == 0) {
            str = "String";
        } else if (i != 1) {
            str = "Unknown";
        } else {
            str = "ArrayBuffer";
        }
        throw new IllegalStateException(com.amazon.aps.iva.n4.a.a(sb, str, " expected, but got ", "String"));
    }

    public d(byte[] bArr, e[] eVarArr) {
        Objects.requireNonNull(bArr);
        this.b = null;
        this.a = eVarArr;
        this.c = 1;
    }
}
