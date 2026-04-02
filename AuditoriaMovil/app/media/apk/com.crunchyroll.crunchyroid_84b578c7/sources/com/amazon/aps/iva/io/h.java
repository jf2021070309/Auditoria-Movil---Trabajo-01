package com.amazon.aps.iva.io;

import com.amazon.aps.iva.wy.j;
import com.crunchyroll.usermigration.terms.AcceptTermsAndPrivacyPolicyActivity;
/* compiled from: AcceptTermsAndPrivacyPolicyPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.wy.b<i> implements g {
    public final com.amazon.aps.iva.co.i b;
    public final com.amazon.aps.iva.eo.b c;
    public final b d;

    public h(AcceptTermsAndPrivacyPolicyActivity acceptTermsAndPrivacyPolicyActivity, com.amazon.aps.iva.co.i iVar, com.amazon.aps.iva.eo.b bVar, c cVar) {
        super(acceptTermsAndPrivacyPolicyActivity, new j[0]);
        this.b = iVar;
        this.c = bVar;
        this.d = cVar;
    }

    @Override // com.amazon.aps.iva.io.g
    public final void Y1(boolean z) {
        if (z) {
            getView().s5();
        } else {
            getView().Rf();
        }
    }

    @Override // com.amazon.aps.iva.io.g
    public final void a() {
        this.b.d();
        getView().finish();
    }

    @Override // com.amazon.aps.iva.io.g
    public final void h4(com.amazon.aps.iva.fs.b bVar) {
        this.d.m(bVar);
    }

    @Override // com.amazon.aps.iva.io.g
    public final void m() {
        com.amazon.aps.iva.eo.b bVar = this.c;
        bVar.setAcceptedTerms(true);
        bVar.setShouldShowTerms(false);
        getView().vb();
        getView().finish();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.d.c();
    }
}
