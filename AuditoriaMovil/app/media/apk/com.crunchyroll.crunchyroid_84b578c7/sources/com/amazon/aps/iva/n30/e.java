package com.amazon.aps.iva.n30;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.y30.l0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
/* compiled from: UserProfilePresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<f> implements com.amazon.aps.iva.n30.b {
    public final l0 b;

    /* compiled from: UserProfilePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<g<? extends ProfileApiModel>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g<? extends ProfileApiModel> gVar) {
            g<? extends ProfileApiModel> gVar2 = gVar;
            e eVar = e.this;
            gVar2.c(new com.amazon.aps.iva.n30.c(eVar));
            gVar2.e(new com.amazon.aps.iva.n30.d(eVar));
            return q.a;
        }
    }

    /* compiled from: UserProfilePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<String, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(String str) {
            String str2 = str;
            f q6 = e.q6(e.this);
            j.e(str2, "avatarUrl");
            q6.fb(str2);
            return q.a;
        }
    }

    /* compiled from: UserProfilePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            j.e(bool2, "hasAnyBenefits");
            boolean booleanValue = bool2.booleanValue();
            e eVar = e.this;
            if (booleanValue) {
                e.q6(eVar).xg();
            } else {
                e.q6(eVar).C6();
            }
            return q.a;
        }
    }

    /* compiled from: UserProfilePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public d(com.amazon.aps.iva.xb0.l lVar) {
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

    public e(com.amazon.aps.iva.n30.a aVar, l0 l0Var) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = l0Var;
    }

    public static final /* synthetic */ f q6(e eVar) {
        return eVar.getView();
    }

    @Override // com.amazon.aps.iva.n30.b
    public final void L() {
        T d2 = this.b.j0().d();
        j.c(d2);
        g.c a2 = ((g) d2).a();
        j.c(a2);
        getView().Xc((ProfileApiModel) a2.a);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        l0 l0Var = this.b;
        l0Var.j0().e(getView(), new d(new a()));
        l0Var.j3().e(getView(), new d(new b()));
        l0Var.E2().e(getView(), new d(new c()));
    }
}
