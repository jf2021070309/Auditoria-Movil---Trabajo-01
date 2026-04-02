package com.amazon.aps.iva.d40;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.y30.h;
import com.amazon.aps.iva.y30.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: MaturityRestrictionsSettingsPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> implements com.amazon.aps.iva.d40.c {
    public final f b;
    public final h c;

    /* compiled from: MaturityRestrictionsSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.d40.a>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends com.amazon.aps.iva.d40.a> list) {
            List<? extends com.amazon.aps.iva.d40.a> list2 = list;
            j.e(list2, "it");
            d.this.getView().a3(list2);
            return q.a;
        }
    }

    /* compiled from: MaturityRestrictionsSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.d40.a, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.d40.a aVar) {
            com.amazon.aps.iva.d40.a aVar2 = aVar;
            j.e(aVar2, "it");
            d.this.getView().s8(aVar2);
            return q.a;
        }
    }

    /* compiled from: MaturityRestrictionsSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(com.amazon.aps.iva.xb0.l lVar) {
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

    public d(com.amazon.aps.iva.d40.b bVar, f fVar, i iVar) {
        super(bVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = fVar;
        this.c = iVar;
    }

    @Override // com.amazon.aps.iva.d40.c
    public final void O5(com.amazon.aps.iva.d40.a aVar) {
        j.f(aVar, "option");
        f fVar = this.b;
        fVar.F7(aVar);
        com.amazon.aps.iva.d40.a aVar2 = (com.amazon.aps.iva.d40.a) fVar.getExtendedMaturityRating().d();
        if (aVar2 == null) {
            aVar2 = com.amazon.aps.iva.d40.a.MATURITY_RESTRICTION_16;
        }
        j.e(aVar2, "viewModel.extendedMaturi…: MATURITY_RESTRICTION_16");
        this.c.z(aVar2, aVar);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        f fVar = this.b;
        fVar.getOptions().e(getView(), new c(new a()));
        fVar.getExtendedMaturityRating().e(getView(), new c(new b()));
    }
}
