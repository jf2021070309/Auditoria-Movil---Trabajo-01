package com.amazon.aps.iva.y;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class f implements com.amazon.aps.iva.o0.u0 {
    public final /* synthetic */ com.amazon.aps.iva.y0.u a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ r c;

    public f(com.amazon.aps.iva.y0.u uVar, Object obj, r rVar) {
        this.a = uVar;
        this.b = obj;
        this.c = rVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        com.amazon.aps.iva.y0.u uVar = this.a;
        Object obj = this.b;
        uVar.remove(obj);
        this.c.d.remove(obj);
    }
}
