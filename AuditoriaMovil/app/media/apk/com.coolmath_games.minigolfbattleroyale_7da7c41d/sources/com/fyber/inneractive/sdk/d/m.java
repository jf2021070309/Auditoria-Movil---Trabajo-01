package com.fyber.inneractive.sdk.d;

import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
/* loaded from: classes.dex */
public final class m extends g<com.fyber.inneractive.sdk.j.f> {
    public IAmraidWebViewController a;

    @Override // com.fyber.inneractive.sdk.d.g
    public final boolean isVideoAd() {
        return false;
    }

    public m(u uVar, com.fyber.inneractive.sdk.config.a.s sVar) {
        super(uVar, sVar);
    }

    @Override // com.fyber.inneractive.sdk.d.g
    public final void b() {
        IAmraidWebViewController iAmraidWebViewController = this.a;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.c();
            this.a = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.d.g
    public final boolean d() {
        IAmraidWebViewController iAmraidWebViewController = this.a;
        return iAmraidWebViewController != null && iAmraidWebViewController.d();
    }

    @Override // com.fyber.inneractive.sdk.d.g
    public final boolean a_() {
        if (this.i == null || this.i.h() == null || this.i.h().a() == null) {
            return false;
        }
        return this.i.h().a().isFullscreenUnit();
    }
}
