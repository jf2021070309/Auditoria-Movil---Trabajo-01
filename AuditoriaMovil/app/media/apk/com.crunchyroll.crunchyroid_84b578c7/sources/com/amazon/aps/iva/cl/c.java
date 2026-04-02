package com.amazon.aps.iva.cl;

import com.amazon.aps.iva.el.p0;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.player.presentation.controls.toolbar.PlayerToolbar;
/* compiled from: PlayerToolbarPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.cl.d> {
    public final boolean b;
    public final com.amazon.aps.iva.cl.a c;
    public final com.amazon.aps.iva.vk.a d;
    public com.amazon.aps.iva.cl.b e;

    /* compiled from: PlayerToolbarPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.cl.e, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.cl.e eVar) {
            com.amazon.aps.iva.cl.e eVar2 = eVar;
            c cVar = c.this;
            if (eVar2 == null) {
                c.q6(cVar).hideSkipToNextButton();
            } else {
                c.q6(cVar).showSkipToNextButton();
            }
            return q.a;
        }
    }

    /* compiled from: PlayerToolbarPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            j.e(bool2, "isFullscreen");
            boolean booleanValue = bool2.booleanValue();
            c cVar = c.this;
            if (booleanValue) {
                c.q6(cVar).q9();
                c.q6(cVar).j0();
                c.q6(cVar).h4();
            } else {
                c.q6(cVar).N4();
                c.q6(cVar).i2();
                c.q6(cVar).l9();
            }
            return q.a;
        }
    }

    /* compiled from: PlayerToolbarPresenter.kt */
    /* renamed from: com.amazon.aps.iva.cl.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0180c extends l implements com.amazon.aps.iva.xb0.l<g, q> {
        public C0180c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g gVar) {
            g gVar2 = gVar;
            c cVar = c.this;
            c.q6(cVar).setToolbarTitle(gVar2.a);
            c.q6(cVar).setToolbarSubtitle(gVar2.b);
            return q.a;
        }
    }

    /* compiled from: PlayerToolbarPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            j.e(bool2, "isAdPlaying");
            boolean booleanValue = bool2.booleanValue();
            c cVar = c.this;
            if (booleanValue) {
                c.q6(cVar).E0();
                c.q6(cVar).Cb();
            } else {
                c.q6(cVar).v1();
                if (cVar.b) {
                    c.q6(cVar).wb();
                }
            }
            return q.a;
        }
    }

    /* compiled from: PlayerToolbarPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public e(com.amazon.aps.iva.xb0.l lVar) {
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

    public c(PlayerToolbar playerToolbar, boolean z, p0 p0Var, com.amazon.aps.iva.vk.b bVar) {
        super(playerToolbar, new com.amazon.aps.iva.wy.j[0]);
        this.b = z;
        this.c = p0Var;
        this.d = bVar;
    }

    public static final /* synthetic */ com.amazon.aps.iva.cl.d q6(c cVar) {
        return cVar.getView();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        getView().hideSkipToNextButton();
        if (this.b) {
            getView().wb();
        } else {
            getView().Cb();
        }
        com.amazon.aps.iva.cl.a aVar = this.c;
        aVar.S4().e(getView(), new e(new a()));
        aVar.D().e(getView(), new e(new b()));
        aVar.V1().e(getView(), new e(new C0180c()));
        aVar.N().e(getView(), new e(new d()));
    }
}
