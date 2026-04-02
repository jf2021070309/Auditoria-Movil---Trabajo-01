package com.amazon.aps.iva.vk;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yk.f;
import com.crunchyroll.player.presentation.controls.PlayerControlsLayout;
/* compiled from: PlayerControlsPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> implements com.amazon.aps.iva.vk.c {
    public final com.amazon.aps.iva.hj.a b;
    public final com.amazon.aps.iva.ij.c c;
    public final com.amazon.aps.iva.yk.c d;
    public final com.amazon.aps.iva.vk.a e;

    /* compiled from: PlayerControlsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.yk.f, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.yk.f fVar) {
            com.amazon.aps.iva.yk.f fVar2 = fVar;
            e q6 = d.q6(d.this);
            j.e(fVar2, "it");
            q6.W5(fVar2);
            return q.a;
        }
    }

    /* compiled from: PlayerControlsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ij.b, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ij.b bVar) {
            com.amazon.aps.iva.ij.b bVar2 = bVar;
            boolean z = bVar2.d;
            d dVar = d.this;
            if (z) {
                d.q6(dVar).C8();
            } else {
                d.q6(dVar).ff();
            }
            if (bVar2.a) {
                d.q6(dVar).E0();
            } else {
                d.q6(dVar).v1();
            }
            return q.a;
        }
    }

    /* compiled from: PlayerControlsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<String, q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(String str) {
            d.q6(d.this).z7(str);
            return q.a;
        }
    }

    /* compiled from: PlayerControlsPresenter.kt */
    /* renamed from: com.amazon.aps.iva.vk.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0803d implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public C0803d(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
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

    public d(PlayerControlsLayout playerControlsLayout, com.amazon.aps.iva.hj.a aVar, com.amazon.aps.iva.ij.f fVar, com.amazon.aps.iva.yk.e eVar, com.amazon.aps.iva.vk.b bVar) {
        super(playerControlsLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = aVar;
        this.c = fVar;
        this.d = eVar;
        this.e = bVar;
    }

    public static final /* synthetic */ e q6(d dVar) {
        return dVar.getView();
    }

    @Override // com.amazon.aps.iva.vk.c
    public final void C() {
        getView().n();
    }

    @Override // com.amazon.aps.iva.vk.c
    public final void I4(f fVar) {
        j.f(fVar, "visibilityController");
        fVar.N1();
    }

    @Override // com.amazon.aps.iva.vk.c
    public final void W3() {
        this.b.j();
        this.e.d();
    }

    @Override // com.amazon.aps.iva.vk.c
    public final void d1(long j, f fVar) {
        j.f(fVar, "visibilityController");
        this.b.c(j);
        fVar.O4();
    }

    @Override // com.amazon.aps.iva.vk.c
    public final void d4() {
        com.amazon.aps.iva.yk.f fVar = (com.amazon.aps.iva.yk.f) this.d.a().d();
        boolean a2 = j.a(fVar, f.b.c);
        com.amazon.aps.iva.hj.a aVar = this.b;
        if (a2) {
            aVar.b();
        } else if (j.a(fVar, f.a.c)) {
            aVar.pause();
        } else if (j.a(fVar, f.c.c)) {
            aVar.a();
        }
    }

    @Override // com.amazon.aps.iva.vk.c
    public final void k6() {
        this.b.d();
        this.e.c();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.d.a().e(getView(), new C0803d(new a()));
        com.amazon.aps.iva.ij.c cVar = this.c;
        cVar.a().e(getView(), new C0803d(new b()));
        cVar.b().e(getView(), new C0803d(new c()));
    }
}
