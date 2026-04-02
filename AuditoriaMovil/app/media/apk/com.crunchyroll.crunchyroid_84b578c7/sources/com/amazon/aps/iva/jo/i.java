package com.amazon.aps.iva.jo;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.crunchyroll.usermigration.verification.CrOwnershipVerificationActivity;
import com.google.android.gms.common.Scopes;
/* compiled from: CrOwnershipVerificationPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.wy.b<j> implements e {
    public final k b;
    public final com.amazon.aps.iva.ho.a c;
    public final com.amazon.aps.iva.h70.c d;
    public final c e;

    /* compiled from: CrOwnershipVerificationPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends q>>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends q>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends q>> dVar2 = dVar;
            i iVar = i.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new f(iVar));
            com.amazon.aps.iva.ez.g<? extends q> a = dVar2.a();
            if (a != null) {
                a.e(new g(iVar));
                a.b(new h(iVar));
            }
            return q.a;
        }
    }

    /* compiled from: CrOwnershipVerificationPresenter.kt */
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

    public i(CrOwnershipVerificationActivity crOwnershipVerificationActivity, l lVar, com.amazon.aps.iva.ho.b bVar, com.amazon.aps.iva.h70.d dVar, d dVar2) {
        super(crOwnershipVerificationActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = lVar;
        this.c = bVar;
        this.d = dVar;
        this.e = dVar2;
    }

    @Override // com.amazon.aps.iva.jo.e
    public final void E2(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "emailText");
        getView().A1(str);
    }

    @Override // com.amazon.aps.iva.jo.e
    public final void O1(com.amazon.aps.iva.fs.b bVar, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        com.amazon.aps.iva.yb0.j.f(str2, "password");
        this.e.M(bVar);
        this.b.S(str, str2);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.e.c();
        this.b.E().e(getView(), new b(new a()));
    }

    @Override // com.amazon.aps.iva.jo.e
    public final void v(String str) {
        if (str != null) {
            getView().E1(str);
            getView().H1();
        }
    }
}
