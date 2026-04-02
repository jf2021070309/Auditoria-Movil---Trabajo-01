package com.amazon.aps.iva.i30;
/* compiled from: DowngradeSuccessAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ds.a a = com.amazon.aps.iva.ds.c.b;
    public final com.amazon.aps.iva.fs.c b;

    public b(com.amazon.aps.iva.fs.c cVar) {
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.i30.a
    public final void a() {
        this.a.c(i.s(com.amazon.aps.iva.ls.a.DOWNGRADE_COMPLETE, this.b.a(), null, null, null, new com.amazon.aps.iva.is.a[0], 28));
    }
}
