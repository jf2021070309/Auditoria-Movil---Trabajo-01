package com.amazon.aps.iva.v1;

import com.amazon.aps.iva.x0.i;
import java.util.List;
import java.util.Map;
/* compiled from: DisposableSaveableStateRegistry.android.kt */
/* loaded from: classes.dex */
public final class g1 implements com.amazon.aps.iva.x0.i {
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> a;
    public final /* synthetic */ com.amazon.aps.iva.x0.i b;

    public g1(com.amazon.aps.iva.x0.j jVar, h1 h1Var) {
        this.a = h1Var;
        this.b = jVar;
    }

    @Override // com.amazon.aps.iva.x0.i
    public final boolean a(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "value");
        return this.b.a(obj);
    }

    @Override // com.amazon.aps.iva.x0.i
    public final i.a b(String str, com.amazon.aps.iva.xb0.a<? extends Object> aVar) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        return this.b.b(str, aVar);
    }

    @Override // com.amazon.aps.iva.x0.i
    public final Map<String, List<Object>> d() {
        return this.b.d();
    }

    @Override // com.amazon.aps.iva.x0.i
    public final Object e(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        return this.b.e(str);
    }
}
