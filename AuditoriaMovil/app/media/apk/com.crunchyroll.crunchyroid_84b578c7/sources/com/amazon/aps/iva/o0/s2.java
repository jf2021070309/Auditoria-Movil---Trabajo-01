package com.amazon.aps.iva.o0;
/* compiled from: Recomposer.kt */
/* loaded from: classes.dex */
public final class s2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o0 h;
    public final /* synthetic */ com.amazon.aps.iva.p0.c<Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(o0 o0Var, com.amazon.aps.iva.p0.c<Object> cVar) {
        super(1);
        this.h = o0Var;
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "value");
        this.h.p(obj);
        com.amazon.aps.iva.p0.c<Object> cVar = this.i;
        if (cVar != null) {
            cVar.add(obj);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
