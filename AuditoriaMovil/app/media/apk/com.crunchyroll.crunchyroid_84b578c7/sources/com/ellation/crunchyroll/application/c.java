package com.ellation.crunchyroll.application;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
/* compiled from: AppConfigUpdater.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.ys.c {
    public final com.amazon.aps.iva.ms.a b;

    /* compiled from: AppConfigUpdater.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends i implements l<Throwable, q> {
        public a(a.C0515a c0515a) {
            super(1, c0515a, a.C0515a.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Throwable th) {
            ((a.C0515a) this.receiver).d(th);
            return q.a;
        }
    }

    public c(com.amazon.aps.iva.ms.c cVar, d dVar) {
        this.b = cVar;
        ((AppLifecycleImpl) dVar).Lf(this);
    }

    @Override // com.amazon.aps.iva.ys.c
    public final void h2() {
        this.b.a(new a(com.amazon.aps.iva.mf0.a.a));
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        h2();
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
    }
}
