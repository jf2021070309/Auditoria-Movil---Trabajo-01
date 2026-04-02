package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.gd0.a;
import java.util.HashMap;
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* loaded from: classes4.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<t, a.C0300a<Object, Object>> {
    public final /* synthetic */ a<Object, Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a<Object, Object> aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final a.C0300a<Object, Object> invoke(t tVar) {
        t tVar2 = tVar;
        com.amazon.aps.iva.yb0.j.f(tVar2, "kotlinClass");
        a<Object, Object> aVar = this.h;
        aVar.getClass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        tVar2.c(new b(aVar, hashMap, tVar2, hashMap2));
        return new a.C0300a<>(hashMap, hashMap2, hashMap3);
    }
}
