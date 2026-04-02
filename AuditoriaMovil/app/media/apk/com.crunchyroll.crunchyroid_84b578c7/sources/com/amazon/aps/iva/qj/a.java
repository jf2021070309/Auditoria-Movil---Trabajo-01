package com.amazon.aps.iva.qj;

import com.amazon.aps.iva.d0.b2;
/* compiled from: AssetImage.kt */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final int b;
    public final int c;

    public a() {
        this(null, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.c) + com.amazon.aps.iva.a0.r.a(this.b, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetImage(url=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return b2.b(sb, this.c, ')');
    }

    public a(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }
}
