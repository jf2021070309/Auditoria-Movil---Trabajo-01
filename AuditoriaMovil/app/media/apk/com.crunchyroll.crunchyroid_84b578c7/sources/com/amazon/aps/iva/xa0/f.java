package com.amazon.aps.iva.xa0;

import com.amazon.aps.iva.xa0.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: InsetterDsl.kt */
/* loaded from: classes4.dex */
public final class f {
    public a.C0849a a = new a.C0849a();

    public static void a(f fVar, boolean z, boolean z2, boolean z3, boolean z4, l lVar, int i) {
        int i2;
        boolean z5 = false;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        fVar.getClass();
        j.f(lVar, "f");
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (z2) {
            i2 |= 2;
        }
        if (z3) {
            i2 |= 1;
        }
        if (z4) {
            i2 |= 128;
        }
        if (i2 != 0) {
            z5 = true;
        }
        if (z5) {
            e eVar = new e(i2, fVar.a);
            lVar.invoke(eVar);
            fVar.a = eVar.b;
            return;
        }
        throw new IllegalArgumentException("A type is required".toString());
    }
}
