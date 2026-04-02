package com.amazon.aps.iva.o0;
/* compiled from: Recomposer.kt */
/* loaded from: classes.dex */
public final class p2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.p0.c<Object> h;
    public final /* synthetic */ o0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(o0 o0Var, com.amazon.aps.iva.p0.c cVar) {
        super(0);
        this.h = cVar;
        this.i = o0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        com.amazon.aps.iva.p0.c<Object> cVar = this.h;
        Object[] objArr = cVar.c;
        int i = cVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            this.i.p(obj);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
