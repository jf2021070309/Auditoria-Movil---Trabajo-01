package com.kwad.components.core.e.c;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import com.kwad.components.core.e.c.b;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.m.l;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public final class a extends KSFrameLayout {
    private final b Jw;
    private final b.C0196b Jx;
    private d Jy;
    private InterfaceC0195a Jz;
    private final AdTemplate mAdTemplate;
    private final Context mContext;
    private Presenter mPresenter;
    private final AdBaseFrameLayout mRootContainer;

    /* renamed from: com.kwad.components.core.e.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0195a {
        void nc();
    }

    public a(Context context, b bVar, b.C0196b c0196b) {
        super(context);
        this.mContext = context;
        this.Jw = bVar;
        this.Jx = c0196b;
        this.mAdTemplate = c0196b.adTemplate;
        l.inflate(context, R.layout.ksad_download_dialog_layout, this);
        AdBaseFrameLayout adBaseFrameLayout = (AdBaseFrameLayout) findViewById(R.id.ksad_root_container);
        this.mRootContainer = adBaseFrameLayout;
        a(adBaseFrameLayout, "rootView is null");
        a((KsAdWebView) adBaseFrameLayout.findViewById(R.id.ksad_download_tips_web_card_webView), "webView is null");
    }

    private void a(View view, String str) {
        if (view != null) {
            return;
        }
        throw new RuntimeException("inflateView fail " + str + "\n--viewCount:" + getChildCount() + "\n--context:" + this.mContext.getClass().getName() + "\n--LayoutInflater context: " + LayoutInflater.from(this.mContext).getContext().getClass().getName() + "\n--classloader:" + getClass().getClassLoader().getClass().getName());
    }

    private static Presenter ad() {
        Presenter presenter = new Presenter();
        presenter.a(new e());
        return presenter;
    }

    private d nb() {
        d dVar = new d();
        dVar.Jw = this.Jw;
        dVar.Jx = this.Jx;
        dVar.mAdTemplate = this.mAdTemplate;
        dVar.mRootContainer = this.mRootContainer;
        if (com.kwad.sdk.core.response.b.a.ax(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate))) {
            dVar.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate);
        }
        return dVar;
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
        super.aa();
        this.Jy = nb();
        Presenter ad = ad();
        this.mPresenter = ad;
        ad.F(this.mRootContainer);
        this.mPresenter.k(this.Jy);
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
        super.ab();
        d dVar = this.Jy;
        if (dVar != null) {
            dVar.release();
        }
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.destroy();
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        InterfaceC0195a interfaceC0195a = this.Jz;
        if (interfaceC0195a != null) {
            interfaceC0195a.nc();
        }
    }

    public final void setChangeListener(InterfaceC0195a interfaceC0195a) {
        this.Jz = interfaceC0195a;
    }
}
