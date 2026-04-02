package com.kwad.components.core.page.b.a;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.kwad.components.core.b.a;
/* loaded from: classes.dex */
public final class f extends com.kwad.components.core.page.b.a.a {
    private boolean Nz;
    private com.kwad.components.core.b.a mTitleBarHelper;

    /* loaded from: classes.dex */
    public interface a {
        void ay(int i);
    }

    private String getTitle() {
        return !TextUtils.isEmpty(this.Nc.mPageTitle) ? this.Nc.mPageTitle : (this.Nc.mAdTemplate.adInfoList == null || this.Nc.mAdTemplate.adInfoList.size() <= 0 || this.Nc.mAdTemplate.adInfoList.get(0) == null) ? "详情页面" : com.kwad.sdk.core.response.b.a.bO(com.kwad.sdk.core.response.b.d.ck(this.Nc.mAdTemplate));
    }

    private void oX() {
        com.kwad.components.core.b.a aVar = new com.kwad.components.core.b.a(this.Nc.gi);
        this.mTitleBarHelper = aVar;
        aVar.a(new com.kwad.components.core.b.b(getTitle()));
        this.mTitleBarHelper.ai(true);
        this.mTitleBarHelper.a(new a.InterfaceC0185a() { // from class: com.kwad.components.core.page.b.a.f.1
            @Override // com.kwad.components.core.b.a.InterfaceC0185a
            public final void t(View view) {
                f.this.w(view);
            }

            @Override // com.kwad.components.core.b.a.InterfaceC0185a
            public final void u(View view) {
                f.this.x(view);
            }
        });
        ViewGroup gS = this.mTitleBarHelper.gS();
        int i = 0;
        if (!this.Nc.mAdTemplate.mIsForceJumpLandingPage && !com.kwad.sdk.core.response.b.b.cO(com.kwad.sdk.core.response.b.d.ck(this.Nc.mAdTemplate))) {
            i = 8;
        }
        gS.setVisibility(i);
        this.Nc.a(new a() { // from class: com.kwad.components.core.page.b.a.f.2
            @Override // com.kwad.components.core.page.b.a.f.a
            public final void ay(int i2) {
                f.this.mTitleBarHelper.gS().setVisibility(i2 == 1 ? 0 : 8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(View view) {
        if (this.Nc.mAdWebView == null || !this.Nc.mAdWebView.canGoBack()) {
            if (this.Nc.Nd != null) {
                this.Nc.Nd.dG();
                return;
            }
            return;
        }
        this.Nc.mAdWebView.goBack();
        if (this.Nz) {
            com.kwad.sdk.core.report.a.aF(this.Nc.mAdTemplate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(View view) {
        if (this.Nc.Nd != null) {
            this.Nc.Nd.dH();
        }
    }

    @Override // com.kwad.components.core.page.b.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.Nz = TextUtils.equals(this.Nc.mPageUrl, com.kwad.sdk.core.response.b.a.aK(com.kwad.sdk.core.response.b.d.ck(this.Nc.mAdTemplate)));
        oX();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }
}
