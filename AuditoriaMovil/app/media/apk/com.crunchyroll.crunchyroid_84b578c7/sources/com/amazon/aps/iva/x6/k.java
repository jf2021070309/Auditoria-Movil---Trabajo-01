package com.amazon.aps.iva.x6;

import java.io.Serializable;
/* compiled from: DolbyVisionConfig.java */
/* loaded from: classes.dex */
public final class k {
    public int a;
    public int b;
    public Serializable c;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[], java.io.Serializable] */
    public k() {
        this.c = new Object[16];
    }

    public static k a(com.amazon.aps.iva.t5.v vVar) {
        String str;
        vVar.G(2);
        int u = vVar.u();
        int i = u >> 1;
        int u2 = ((vVar.u() >> 3) & 31) | ((u & 1) << 5);
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i);
        if (u2 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(u2);
        return new k(i, u2, sb.toString());
    }

    public k(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }
}
