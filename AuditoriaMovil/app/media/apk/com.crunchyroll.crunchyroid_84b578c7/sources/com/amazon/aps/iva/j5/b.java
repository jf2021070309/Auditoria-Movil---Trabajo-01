package com.amazon.aps.iva.j5;

import androidx.compose.ui.platform.d;
import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.k3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.ob0.h;
import com.amazon.aps.iva.ve0.f;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.yb0.j;
import java.util.Arrays;
/* compiled from: FlowExt.kt */
/* loaded from: classes.dex */
public final class b {
    public static final q1 a(f fVar, Object obj, g gVar, g.b bVar, com.amazon.aps.iva.ob0.g gVar2, i iVar) {
        j.f(fVar, "<this>");
        j.f(gVar, "lifecycle");
        iVar.s(1977777920);
        Object[] objArr = {fVar, gVar, bVar, gVar2};
        a aVar = new a(gVar, bVar, gVar2, fVar, null);
        iVar.s(490154582);
        e0.b bVar2 = e0.a;
        iVar.s(-492369756);
        Object t = iVar.t();
        if (t == i.a.a) {
            t = com.amazon.aps.iva.cq.b.c0(obj);
            iVar.n(t);
        }
        iVar.G();
        q1 q1Var = (q1) t;
        x0.e(Arrays.copyOf(objArr, 4), new k3(aVar, q1Var, null), iVar);
        iVar.G();
        iVar.G();
        return q1Var;
    }

    public static final q1 b(u0 u0Var, i iVar) {
        j.f(u0Var, "<this>");
        iVar.s(743249048);
        q1 a = a(u0Var, u0Var.getValue(), ((o) iVar.i(d.d)).getLifecycle(), g.b.STARTED, h.b, iVar);
        iVar.G();
        return a;
    }
}
