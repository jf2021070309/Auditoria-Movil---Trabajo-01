package com.amazon.aps.iva.yi;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.crunchyroll.onboarding.OnboardingV2Activity;
/* compiled from: OnboardingV2Presenter.kt */
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.yi.k> implements com.amazon.aps.iva.yi.g {
    public final com.amazon.aps.iva.yi.l b;
    public final com.amazon.aps.iva.xb0.a<Boolean> c;
    public final com.amazon.aps.iva.yi.f d;
    public final com.amazon.aps.iva.yi.d e;
    public final n f;
    public final boolean g;
    public final com.amazon.aps.iva.yi.b h;
    public final com.amazon.aps.iva.wh.f i;
    public final com.amazon.aps.iva.xb0.a<Boolean> j;

    /* compiled from: OnboardingV2Presenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            com.amazon.aps.iva.yb0.j.e(bool2, "hasAnyOffers");
            if (bool2.booleanValue()) {
                h.this.getView().y8();
            }
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Presenter.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            h.this.d.A();
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Presenter.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            h.q6(h.this);
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Presenter.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public static final d h = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Presenter.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            h.this.d.A();
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Presenter.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            h.q6(h.this);
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Presenter.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public static final g h = new g();

        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Presenter.kt */
    /* renamed from: com.amazon.aps.iva.yi.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0891h extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<q> {
        public C0891h(Object obj) {
            super(0, obj, h.class, "onSkipped", "onSkipped()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            h hVar = (h) this.receiver;
            if (hVar.j.invoke().booleanValue()) {
                hVar.d.A();
            }
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Presenter.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class i extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<q> {
        public i(com.amazon.aps.iva.yi.f fVar) {
            super(0, fVar, com.amazon.aps.iva.yi.f.class, "openHomeScreen", "openHomeScreen()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ((com.amazon.aps.iva.yi.f) this.receiver).A();
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Presenter.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class j extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<q> {
        public j(com.amazon.aps.iva.yi.g gVar) {
            super(0, gVar, h.class, "onSkipped", "onSkipped()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            h hVar = (h) this.receiver;
            if (hVar.j.invoke().booleanValue()) {
                hVar.d.A();
            }
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Presenter.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class k extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<q> {
        public k(com.amazon.aps.iva.yi.f fVar) {
            super(0, fVar, com.amazon.aps.iva.yi.f.class, "openHomeScreen", "openHomeScreen()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ((com.amazon.aps.iva.yi.f) this.receiver).A();
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Presenter.kt */
    /* loaded from: classes.dex */
    public static final class l implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public l(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public h(OnboardingV2Activity onboardingV2Activity, m mVar, com.crunchyroll.onboarding.c cVar, com.amazon.aps.iva.yi.f fVar, com.amazon.aps.iva.yi.d dVar, n nVar, boolean z, com.amazon.aps.iva.yi.c cVar2, com.amazon.aps.iva.wh.f fVar2, com.amazon.aps.iva.xb0.a aVar) {
        super(onboardingV2Activity, new com.amazon.aps.iva.wy.j[0]);
        this.b = mVar;
        this.c = cVar;
        this.d = fVar;
        this.e = dVar;
        this.f = nVar;
        this.g = z;
        this.h = cVar2;
        this.i = fVar2;
        this.j = aVar;
    }

    public static final void q6(h hVar) {
        boolean a2 = hVar.i.a();
        com.amazon.aps.iva.yi.f fVar = hVar.d;
        if (a2) {
            fVar.A();
        } else {
            fVar.a(new com.amazon.aps.iva.yi.i(fVar), new com.amazon.aps.iva.yi.j(fVar));
        }
    }

    @Override // com.amazon.aps.iva.yi.g
    public final void c4(com.amazon.aps.iva.fs.b bVar) {
        this.h.d(bVar);
        this.e.a();
    }

    @Override // com.amazon.aps.iva.yi.g
    public final void j0(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.h.b(bVar);
        this.e.c();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        boolean booleanValue = this.c.invoke().booleanValue();
        n nVar = this.f;
        if (booleanValue) {
            nVar.a();
        }
        if (this.g) {
            getView().U4();
        } else {
            getView().hf();
        }
        this.b.d6().e(getView(), new l(new a()));
        this.e.b(new b(), new c(), d.h);
        nVar.b(new e(), new f(), g.h);
        C0891h c0891h = new C0891h(this);
        com.amazon.aps.iva.yi.f fVar = this.d;
        fVar.b(c0891h, new i(fVar));
        this.h.a();
    }

    @Override // com.amazon.aps.iva.yi.g
    public final void p6(com.amazon.aps.iva.fs.b bVar) {
        this.h.c(bVar);
        j jVar = new j(this);
        com.amazon.aps.iva.yi.f fVar = this.d;
        fVar.a(jVar, new k(fVar));
    }
}
