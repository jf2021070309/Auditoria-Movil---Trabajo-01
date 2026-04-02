package com.amazon.aps.iva.io;

import com.amazon.aps.iva.co.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.mh.j;
import com.amazon.aps.iva.mh.k;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.usermigration.terms.AcceptTermsAndPrivacyPolicyActivity;
/* compiled from: AcceptTermsAndPrivacyPolicyModule.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public final AcceptTermsAndPrivacyPolicyActivity b;
    public final m c = com.amazon.aps.iva.kb0.f.b(new b());
    public final m d = com.amazon.aps.iva.kb0.f.b(new a());

    /* compiled from: AcceptTermsAndPrivacyPolicyModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<j> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final j invoke() {
            f fVar = f.this;
            AcceptTermsAndPrivacyPolicyActivity acceptTermsAndPrivacyPolicyActivity = fVar.b;
            com.amazon.aps.iva.co.e eVar = f.a.a;
            if (eVar != null) {
                com.amazon.aps.iva.cx.b i = eVar.i();
                com.amazon.aps.iva.yb0.j.f(acceptTermsAndPrivacyPolicyActivity, "context");
                com.amazon.aps.iva.yb0.j.f(i, "links");
                com.amazon.aps.iva.mh.f fVar2 = new com.amazon.aps.iva.mh.f(acceptTermsAndPrivacyPolicyActivity, i);
                com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.TERMS_AND_PRIVACY_POLICY;
                com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                com.amazon.aps.iva.yb0.j.f(aVar, "screen");
                com.amazon.aps.iva.mh.i iVar = new com.amazon.aps.iva.mh.i(cVar, aVar);
                AcceptTermsAndPrivacyPolicyActivity acceptTermsAndPrivacyPolicyActivity2 = fVar.b;
                com.amazon.aps.iva.yb0.j.f(acceptTermsAndPrivacyPolicyActivity2, "view");
                return new k(fVar2, iVar, acceptTermsAndPrivacyPolicyActivity2);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: AcceptTermsAndPrivacyPolicyModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<g> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final g invoke() {
            AcceptTermsAndPrivacyPolicyActivity acceptTermsAndPrivacyPolicyActivity = f.this.b;
            com.amazon.aps.iva.co.e eVar = f.a.a;
            if (eVar != null) {
                com.amazon.aps.iva.co.i f = eVar.f();
                com.amazon.aps.iva.eo.b bVar = f.a.b;
                if (bVar != null) {
                    com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                    com.amazon.aps.iva.io.a aVar = com.amazon.aps.iva.io.a.h;
                    com.amazon.aps.iva.yb0.j.f(aVar, "createTimer");
                    c cVar2 = new c(cVar, aVar);
                    com.amazon.aps.iva.yb0.j.f(acceptTermsAndPrivacyPolicyActivity, "view");
                    com.amazon.aps.iva.yb0.j.f(f, "userMigrationSignOutInteractor");
                    return new h(acceptTermsAndPrivacyPolicyActivity, f, bVar, cVar2);
                }
                com.amazon.aps.iva.yb0.j.m("funUserStore");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    public f(AcceptTermsAndPrivacyPolicyActivity acceptTermsAndPrivacyPolicyActivity) {
        this.b = acceptTermsAndPrivacyPolicyActivity;
    }

    @Override // com.amazon.aps.iva.io.e
    public final j a() {
        return (j) this.d.getValue();
    }

    @Override // com.amazon.aps.iva.io.e
    public final g getPresenter() {
        return (g) this.c.getValue();
    }
}
