package com.amazon.aps.iva.tz;
/* compiled from: BrowseAllDataSource.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ f h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, int i) {
        super(1);
        this.h = fVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "it");
        this.h.j.invoke(Integer.valueOf(this.i), th2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
