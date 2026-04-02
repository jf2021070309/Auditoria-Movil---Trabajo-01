package com.amazon.aps.iva.q5;

import android.os.Bundle;
/* compiled from: DeviceInfo.java */
/* loaded from: classes.dex */
public final class q implements k {
    public static final q f = new a(0).a();
    public static final String g = com.amazon.aps.iva.t5.g0.L(0);
    public static final String h = com.amazon.aps.iva.t5.g0.L(1);
    public static final String i = com.amazon.aps.iva.t5.g0.L(2);
    public static final String j = com.amazon.aps.iva.t5.g0.L(3);
    public static final com.amazon.aps.iva.g1.e k = new com.amazon.aps.iva.g1.e(1);
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    /* compiled from: DeviceInfo.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public int b;
        public int c;
        public String d;

        public a(int i) {
            this.a = i;
        }

        public final q a() {
            boolean z;
            if (this.b <= this.c) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.t(z);
            return new q(this);
        }
    }

    public q(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && com.amazon.aps.iva.t5.g0.a(this.e, qVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i2 = (((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i2 + hashCode;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i2 = this.b;
        if (i2 != 0) {
            bundle.putInt(g, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            bundle.putInt(h, i3);
        }
        int i4 = this.d;
        if (i4 != 0) {
            bundle.putInt(i, i4);
        }
        String str = this.e;
        if (str != null) {
            bundle.putString(j, str);
        }
        return bundle;
    }
}
