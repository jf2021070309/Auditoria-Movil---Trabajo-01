package com.amazon.aps.iva.xw;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
/* compiled from: LifecycleExtensions.kt */
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.i.a<Object, Integer>, com.amazon.aps.iva.h.b<Integer>, com.amazon.aps.iva.h.c<Object>> {
    public final /* synthetic */ com.amazon.aps.iva.i5.o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.amazon.aps.iva.i5.o oVar) {
        super(2);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.h.c<Object> invoke(com.amazon.aps.iva.i.a<Object, Integer> aVar, com.amazon.aps.iva.h.b<Integer> bVar) {
        com.amazon.aps.iva.i.a<Object, Integer> aVar2 = aVar;
        com.amazon.aps.iva.h.b<Integer> bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "contract");
        com.amazon.aps.iva.yb0.j.f(bVar2, "result");
        com.amazon.aps.iva.i5.o oVar = this.h;
        if (oVar instanceof Fragment) {
            com.amazon.aps.iva.h.c<Object> registerForActivityResult = ((Fragment) oVar).registerForActivityResult(aVar2, bVar2);
            com.amazon.aps.iva.yb0.j.e(registerForActivityResult, "{\n            this.regis…ntract, result)\n        }");
            return registerForActivityResult;
        }
        com.amazon.aps.iva.yb0.j.d(oVar, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        com.amazon.aps.iva.h.c<Object> registerForActivityResult2 = ((ComponentActivity) oVar).registerForActivityResult(aVar2, bVar2);
        com.amazon.aps.iva.yb0.j.e(registerForActivityResult2, "{\n            (this as C…ntract, result)\n        }");
        return registerForActivityResult2;
    }
}
