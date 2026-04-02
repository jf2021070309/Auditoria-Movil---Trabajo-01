package com.amazon.aps.iva.dh;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: InAppReviewEligibilityEventHandlerImpl.kt */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.dh.c, com.amazon.aps.iva.ys.d {
    public final com.amazon.aps.iva.fh.c b;
    public final com.amazon.aps.iva.hh.b c;
    public final com.amazon.aps.iva.gh.a d;
    public final g e;
    public final e f;

    /* compiled from: InAppReviewEligibilityEventHandlerImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            com.amazon.aps.iva.hh.b bVar = d.this.c;
            bVar.a(bVar.b() + 1);
            return q.a;
        }
    }

    /* compiled from: InAppReviewEligibilityEventHandlerImpl.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            d.this.b.r();
            return q.a;
        }
    }

    /* compiled from: InAppReviewEligibilityEventHandlerImpl.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            com.amazon.aps.iva.gh.a aVar = d.this.d;
            aVar.a(aVar.b() + 1);
            return q.a;
        }
    }

    /* compiled from: InAppReviewEligibilityEventHandlerImpl.kt */
    /* renamed from: com.amazon.aps.iva.dh.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0196d extends l implements com.amazon.aps.iva.xb0.a<q> {
        public C0196d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            d.this.d.a(0);
            return q.a;
        }
    }

    public d(com.amazon.aps.iva.fh.d dVar, com.amazon.aps.iva.hh.c cVar, com.amazon.aps.iva.gh.b bVar, h hVar, f fVar, com.ellation.crunchyroll.application.d dVar2) {
        j.f(dVar2, "appLifecycle");
        this.b = dVar;
        this.c = cVar;
        this.d = bVar;
        this.e = hVar;
        this.f = fVar;
        dVar2.Lf(this);
    }

    @Override // com.amazon.aps.iva.dh.c
    public final void a() {
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
    }

    @Override // com.amazon.aps.iva.dh.c
    public final void b() {
        new C0196d().invoke();
        this.f.a();
    }

    @Override // com.amazon.aps.iva.dh.c
    public final void c() {
        new c().invoke();
        this.f.a();
    }

    @Override // com.amazon.aps.iva.dh.c
    public final void onAddToWatchlist() {
        new a().invoke();
        this.f.a();
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        new b().invoke();
        this.f.a();
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
    }
}
