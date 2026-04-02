package com.amazon.aps.iva.z3;
/* compiled from: SimpleActor.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ p<Object> i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<Object, Throwable, com.amazon.aps.iva.kb0.q> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, p pVar, s sVar) {
        super(1);
        this.h = rVar;
        this.i = pVar;
        this.j = sVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        com.amazon.aps.iva.kb0.q qVar;
        Throwable th2 = th;
        this.h.invoke(th2);
        p<Object> pVar = this.i;
        pVar.c.r(th2);
        do {
            Object a = com.amazon.aps.iva.ue0.i.a(pVar.c.q());
            if (a == null) {
                qVar = null;
                continue;
            } else {
                this.j.invoke(a, th2);
                qVar = com.amazon.aps.iva.kb0.q.a;
                continue;
            }
        } while (qVar != null);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
