package com.amazon.aps.iva.h2;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.ee0.f1;
import com.google.android.gms.cast.MediaError;
import java.util.List;
/* compiled from: FontWeight.kt */
/* loaded from: classes.dex */
public final class y implements Comparable<y> {
    public static final y c;
    public static final y d;
    public static final y e;
    public static final y f;
    public static final y g;
    public static final y h;
    public static final y i;
    public static final List<y> j;
    public final int b;

    static {
        y yVar = new y(100);
        y yVar2 = new y(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
        y yVar3 = new y(300);
        y yVar4 = new y(MediaError.DetailedErrorCode.MANIFEST_UNKNOWN);
        c = yVar4;
        y yVar5 = new y(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN);
        d = yVar5;
        y yVar6 = new y(MediaError.DetailedErrorCode.TEXT_UNKNOWN);
        e = yVar6;
        y yVar7 = new y(700);
        y yVar8 = new y(800);
        y yVar9 = new y(MediaError.DetailedErrorCode.APP);
        f = yVar3;
        g = yVar4;
        h = yVar5;
        i = yVar7;
        j = f1.K(yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9);
    }

    public y(int i2) {
        this.b = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Font weight can be in range [1, 1000]. Current value: ", i2).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(y yVar) {
        com.amazon.aps.iva.yb0.j.f(yVar, "other");
        return com.amazon.aps.iva.yb0.j.h(this.b, yVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        if (this.b == ((y) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return b2.b(new StringBuilder("FontWeight(weight="), this.b, ')');
    }
}
