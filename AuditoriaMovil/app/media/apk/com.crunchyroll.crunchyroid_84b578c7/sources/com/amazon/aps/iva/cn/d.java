package com.amazon.aps.iva.cn;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.yb0.j;
/* compiled from: AvatarIconStyleV2.kt */
/* loaded from: classes2.dex */
public final class d {
    public final int a;
    public final long b;
    public final x c;

    public d(int i, long j, x xVar) {
        this.a = i;
        this.b = j;
        this.c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && x.c(this.b, dVar.b) && j.a(this.c, dVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = x.h;
        int a = i.a(this.b, Integer.hashCode(this.a) * 31, 31);
        x xVar = this.c;
        if (xVar == null) {
            hashCode = 0;
        } else {
            hashCode = Long.hashCode(xVar.a);
        }
        return a + hashCode;
    }

    public final String toString() {
        String i = x.i(this.b);
        return "AvatarStatusIcon(imageResId=" + this.a + ", backgroundColor=" + i + ", borderColor=" + this.c + ")";
    }
}
