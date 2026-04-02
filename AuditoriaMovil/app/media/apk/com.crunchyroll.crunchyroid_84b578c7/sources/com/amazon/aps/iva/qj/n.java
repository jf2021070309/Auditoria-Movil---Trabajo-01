package com.amazon.aps.iva.qj;

import com.amazon.aps.iva.o0.t1;
/* compiled from: VideoError.kt */
/* loaded from: classes.dex */
public final class n {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public n(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.a == nVar.a && com.amazon.aps.iva.yb0.j.a(this.b, nVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, nVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, nVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return b + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoError(errorCode=");
        sb.append(this.a);
        sb.append(", errorCodeWithGroup=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", dumpId=");
        return t1.b(sb, this.d, ')');
    }
}
