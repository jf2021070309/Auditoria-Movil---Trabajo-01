package com.amazon.aps.iva.v20;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.yb0.j;
/* compiled from: MembershipCardUiModel.kt */
/* loaded from: classes2.dex */
public final class f {
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final int e;
    public final int f;
    public final Integer g;

    public f(String str, int i, String str2, long j, int i2, int i3, Integer num) {
        j.f(str2, "userId");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
        this.e = i2;
        this.f = i3;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (j.a(this.a, fVar.a) && this.b == fVar.b && j.a(this.c, fVar.c) && x.c(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f && j.a(this.g, fVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.c, r.a(this.b, this.a.hashCode() * 31, 31), 31);
        int i = x.h;
        int a = r.a(this.f, r.a(this.e, i.a(this.d, b, 31), 31), 31);
        Integer num = this.g;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        String i = x.i(this.d);
        StringBuilder sb = new StringBuilder("MembershipCardUiModel(email=");
        sb.append(this.a);
        sb.append(", accountCreationYear=");
        sb.append(this.b);
        sb.append(", userId=");
        com.amazon.aps.iva.m80.a.c(sb, this.c, ", accentColor=", i, ", toolbarTitle=");
        sb.append(this.e);
        sb.append(", backgroundImage=");
        sb.append(this.f);
        sb.append(", crownIcon=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
