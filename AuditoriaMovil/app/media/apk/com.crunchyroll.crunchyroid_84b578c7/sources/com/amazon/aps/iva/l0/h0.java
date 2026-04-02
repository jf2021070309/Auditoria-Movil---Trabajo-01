package com.amazon.aps.iva.l0;

import android.os.Build;
import com.amazon.aps.iva.a0.d1;
import com.amazon.aps.iva.a0.e1;
import com.amazon.aps.iva.a0.f1;
import com.amazon.aps.iva.a0.r1;
import com.amazon.aps.iva.a0.s1;
import com.amazon.aps.iva.a0.v0;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.v1.t1;
/* compiled from: TextFieldSelectionManager.android.kt */
/* loaded from: classes.dex */
public final class h0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.e1.c>, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ com.amazon.aps.iva.o2.c h;
    public final /* synthetic */ q1<com.amazon.aps.iva.o2.j> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.amazon.aps.iva.o2.c cVar, q1<com.amazon.aps.iva.o2.j> q1Var) {
        super(1);
        this.h = cVar;
        this.i = q1Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.e1.c> aVar) {
        boolean z;
        com.amazon.aps.iva.a1.f fVar;
        r1 r1Var;
        com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.e1.c> aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "center");
        f.a aVar3 = f.a.c;
        f1 f1Var = f1.h;
        f0 f0Var = new f0(aVar2);
        g0 g0Var = new g0(this.h, this.i);
        com.amazon.aps.iva.a2.b0<com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.c>> b0Var = e1.a;
        v0 v0Var = v0.h;
        com.amazon.aps.iva.yb0.j.f(v0Var, "magnifierCenter");
        com.amazon.aps.iva.yb0.j.f(f1Var, "style");
        t1.a aVar4 = t1.a;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i >= 28) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i < 28) {
                z2 = false;
            }
            if (z2) {
                if (i == 28) {
                    r1Var = s1.a;
                } else {
                    r1Var = com.amazon.aps.iva.a0.t1.a;
                }
                fVar = com.amazon.aps.iva.a1.e.a(aVar3, t1.a, new d1(f0Var, v0Var, Float.NaN, g0Var, r1Var, f1Var));
            } else {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            }
        } else {
            fVar = aVar3;
        }
        return t1.a(aVar3, aVar4, fVar);
    }
}
