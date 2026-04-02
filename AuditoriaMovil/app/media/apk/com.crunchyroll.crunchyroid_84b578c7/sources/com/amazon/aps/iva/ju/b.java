package com.amazon.aps.iva.ju;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.commenting.comments.pendingstate.banner.PendingStateBannerLayout;
/* compiled from: PendingStateBannerPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<d> implements com.amazon.aps.iva.ju.a {
    public final com.amazon.aps.iva.iu.c b;
    public final com.amazon.aps.iva.iu.a c;
    public final com.amazon.aps.iva.lu.b d;

    /* compiled from: PendingStateBannerPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<c, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c cVar) {
            c cVar2 = cVar;
            boolean z = cVar2.b;
            b bVar = b.this;
            if (z) {
                bVar.getView().Ia();
            } else {
                bVar.getView().Hd();
            }
            boolean z2 = cVar2.a;
            if (z2) {
                bVar.getView().Vf();
            } else {
                bVar.getView().Tg();
            }
            bVar.getClass();
            boolean z3 = cVar2.b;
            if (z3 && z2) {
                bVar.getView().mo21if();
            } else {
                bVar.getView().tc();
            }
            if (!z3 && !z2) {
                bVar.getView().hh();
            } else {
                bVar.getView().f3();
            }
            return q.a;
        }
    }

    /* compiled from: PendingStateBannerPresenter.kt */
    /* renamed from: com.amazon.aps.iva.ju.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0424b implements w, f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public C0424b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.a, ((f) obj).getFunctionDelegate());
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

    public b(PendingStateBannerLayout pendingStateBannerLayout, com.amazon.aps.iva.iu.c cVar, com.amazon.aps.iva.iu.a aVar, com.amazon.aps.iva.lu.b bVar) {
        super(pendingStateBannerLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = cVar;
        this.c = aVar;
        this.d = bVar;
    }

    @Override // com.amazon.aps.iva.ju.a
    public final void D0(com.amazon.aps.iva.fs.b bVar) {
        this.c.b1(bVar);
    }

    @Override // com.amazon.aps.iva.ju.a
    public final void M5() {
        this.d.a(com.amazon.aps.iva.lu.a.h);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.b().e(getView(), new C0424b(new a()));
    }
}
