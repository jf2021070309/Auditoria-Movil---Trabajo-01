package com.amazon.aps.iva.i0;

import com.amazon.aps.iva.f1.k0;
import com.amazon.aps.iva.f1.u0;
import com.amazon.aps.iva.o2.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CornerBasedShape.kt */
/* loaded from: classes.dex */
public abstract class a implements u0 {
    public final b a;
    public final b b;
    public final b c;
    public final b d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        j.f(bVar, "topStart");
        j.f(bVar2, "topEnd");
        j.f(bVar3, "bottomEnd");
        j.f(bVar4, "bottomStart");
        this.a = bVar;
        this.b = bVar2;
        this.c = bVar3;
        this.d = bVar4;
    }

    @Override // com.amazon.aps.iva.f1.u0
    public final k0 a(long j, l lVar, com.amazon.aps.iva.o2.c cVar) {
        boolean z;
        j.f(lVar, "layoutDirection");
        j.f(cVar, "density");
        float a = this.a.a(j, cVar);
        float a2 = this.b.a(j, cVar);
        float a3 = this.c.a(j, cVar);
        float a4 = this.d.a(j, cVar);
        float c = com.amazon.aps.iva.e1.g.c(j);
        float f = a + a4;
        if (f > c) {
            float f2 = c / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a4;
        float f4 = a2 + a3;
        if (f4 > c) {
            float f5 = c / f4;
            a2 *= f5;
            a3 *= f5;
        }
        if (a >= 0.0f && a2 >= 0.0f && a3 >= 0.0f && f3 >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return c(j, a, a2, a3, f3, lVar);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + f3 + ")!").toString());
    }

    public abstract f b(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract k0 c(long j, float f, float f2, float f3, float f4, l lVar);
}
