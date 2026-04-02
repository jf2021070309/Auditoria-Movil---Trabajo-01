package com.amazon.aps.iva.a6;

import android.text.TextUtils;
/* compiled from: DecoderReuseEvaluation.java */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public final com.amazon.aps.iva.q5.v b;
    public final com.amazon.aps.iva.q5.v c;
    public final int d;
    public final int e;

    public g(String str, com.amazon.aps.iva.q5.v vVar, com.amazon.aps.iva.q5.v vVar2, int i, int i2) {
        boolean z;
        if (i != 0 && i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        com.amazon.aps.iva.cq.b.t(z);
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            vVar.getClass();
            this.b = vVar;
            vVar2.getClass();
            this.c = vVar2;
            this.d = i;
            this.e = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.d == gVar.d && this.e == gVar.e && this.a.equals(gVar.a) && this.b.equals(gVar.b) && this.c.equals(gVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = com.amazon.aps.iva.c80.a.b(this.a, (((this.d + 527) * 31) + this.e) * 31, 31);
        return this.c.hashCode() + ((this.b.hashCode() + b) * 31);
    }
}
