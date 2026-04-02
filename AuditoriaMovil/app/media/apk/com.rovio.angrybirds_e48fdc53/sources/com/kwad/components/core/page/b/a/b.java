package com.kwad.components.core.page.b.a;

import android.content.Context;
import android.view.ViewGroup;
import com.kwad.components.core.page.b.a.f;
import com.kwad.components.core.webview.jshandler.an;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.webview.KsAdWebView;
/* loaded from: classes.dex */
public final class b extends com.kwad.sdk.mvp.a {
    public com.kwad.components.core.page.a.a Nd;
    public KsAdWebView.c Ne;
    public f.a Nf;
    public an.b Ng;
    public boolean Nh = false;
    public boolean Ni = false;
    public ViewGroup gi;
    public AdTemplate mAdTemplate;
    public KsAdWebView mAdWebView;
    public boolean mAutoShow;
    public Context mContext;
    public String mPageTitle;
    public String mPageUrl;
    public boolean mShowPermission;
    public com.kwad.sdk.core.webview.d.a.b mWebCardCloseListener;

    private void aA(boolean z) {
        this.Ni = true;
    }

    public final void a(f.a aVar) {
        this.Nf = aVar;
    }

    public final void a(an.b bVar) {
        this.Ng = bVar;
        aA(true);
    }

    public final void a(KsAdWebView.c cVar) {
        this.Ne = cVar;
    }

    public final boolean oC() {
        return this.mShowPermission;
    }

    public final void oG() {
        an.b bVar = this.Ng;
        if (bVar != null) {
            bVar.oZ();
        }
    }

    public final boolean oN() {
        return this.Ni;
    }

    public final boolean oO() {
        return !oC();
    }

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
        this.Ne = null;
        this.Nf = null;
        this.mWebCardCloseListener = null;
        this.Ng = null;
    }

    public final void setWebCardCloseListener(com.kwad.sdk.core.webview.d.a.b bVar) {
        this.mWebCardCloseListener = bVar;
    }
}
