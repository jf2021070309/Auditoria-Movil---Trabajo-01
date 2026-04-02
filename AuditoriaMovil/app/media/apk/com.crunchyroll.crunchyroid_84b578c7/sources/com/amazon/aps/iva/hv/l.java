package com.amazon.aps.iva.hv;

import com.ellation.crunchyroll.api.etp.error.ConflictException;
/* compiled from: CrunchylistSearchPresenter.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar) {
        super(1);
        this.h = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "throwable");
        if (!(th2.getCause() instanceof ConflictException)) {
            j.q6(this.h).of();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
