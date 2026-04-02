package com.amazon.aps.iva.j40;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.y30.h;
import com.amazon.aps.iva.y30.i;
import com.amazon.aps.iva.y30.l0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SyncQualitySettingsPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<f> implements d {
    public final l0 b;
    public final h c;
    public final com.amazon.aps.iva.j40.a d;

    /* compiled from: SyncQualitySettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.wg.b, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.wg.b bVar) {
            com.amazon.aps.iva.wg.b bVar2 = bVar;
            j.e(bVar2, "option");
            e.this.getView().p9(bVar2);
            return q.a;
        }
    }

    /* compiled from: SyncQualitySettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
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

    public e(c cVar, l0 l0Var, i iVar, com.amazon.aps.iva.j40.b bVar) {
        super(cVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = l0Var;
        this.c = iVar;
        this.d = bVar;
    }

    @Override // com.amazon.aps.iva.j40.d
    public final void P4(com.amazon.aps.iva.wg.b bVar) {
        j.f(bVar, "selectedOption");
        l0 l0Var = this.b;
        this.c.G(l0Var.J(), bVar);
        l0Var.n0(bVar);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        getView().pg(this.d.getOptions());
        this.b.T().e(getView(), new b(new a()));
    }
}
