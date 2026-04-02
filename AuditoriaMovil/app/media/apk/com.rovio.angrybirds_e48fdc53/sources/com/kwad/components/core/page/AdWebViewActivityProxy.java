package com.kwad.components.core.page;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.kwad.components.core.page.widget.a;
import com.kwad.components.core.webview.b.c.d;
import com.kwad.sdk.R;
import com.kwad.sdk.api.core.KsAdSdkDynamicImpl;
import com.kwad.sdk.api.proxy.app.AdWebViewActivity;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import org.json.JSONObject;
@KsAdSdkDynamicImpl(AdWebViewActivity.class)
/* loaded from: classes.dex */
public class AdWebViewActivityProxy extends com.kwad.components.core.o.c {
    private static final String KEY_IS_AUTO_SHOW = "key_is_auto_show";
    private static final String KEY_PAGE_TITLE = "key_page_title";
    private static final String KEY_PAGE_URL = "key_page_url";
    private static final String KEY_SHOW_PERMISSION = "key_show_permission";
    public static final String KEY_TEMPLATE = "key_template_json";
    private AdTemplate mAdTemplate;
    private boolean mAutoShow;
    private com.kwad.components.core.r.b mDialogFragment;
    private Dialog mKsExitInterceptDialog;
    private Dialog mKsExitInterceptDialogV2;
    private c mLandingPageView;
    private String mPageTitle;
    private String mPageUrl;
    private boolean mShowPermission;
    private volatile boolean destroyed = false;
    private com.kwad.sdk.core.webview.d.a.b mWebCardCloseListener = new com.kwad.sdk.core.webview.d.a.b() { // from class: com.kwad.components.core.page.AdWebViewActivityProxy.1
        @Override // com.kwad.sdk.core.webview.d.a.b
        public final void a(WebCloseStatus webCloseStatus) {
            AdWebViewActivityProxy.this.finish();
        }
    };
    private com.kwad.components.core.page.a.a mLandPageViewListener = new com.kwad.components.core.page.a.a() { // from class: com.kwad.components.core.page.AdWebViewActivityProxy.2
        @Override // com.kwad.components.core.page.a.a
        public final void dG() {
            AdWebViewActivityProxy.this.onBackPressed();
        }

        @Override // com.kwad.components.core.page.a.a
        public final void dH() {
            if (AdWebViewActivityProxy.this.mLandingPageView != null && AdWebViewActivityProxy.this.mLandingPageView.getCanInterceptBackClick()) {
                AdWebViewActivityProxy.this.mLandingPageView.oG();
            } else if (AdWebViewActivityProxy.this.mAdTemplate.mIsForceJumpLandingPage) {
                AdWebViewActivityProxy.this.finish();
            } else {
                if (com.kwad.sdk.core.response.b.a.aG(com.kwad.sdk.core.response.b.d.ck(AdWebViewActivityProxy.this.mAdTemplate)) && com.kwad.components.core.r.a.pU().pV() == 1 && com.kwad.components.core.r.a.pU().qa() && !com.kwad.components.core.r.a.pU().pX()) {
                    if (!com.kwad.components.core.r.a.pU().pW()) {
                        AdWebViewActivityProxy adWebViewActivityProxy = AdWebViewActivityProxy.this;
                        adWebViewActivityProxy.mDialogFragment = adWebViewActivityProxy.getTkDialogFragment();
                        com.kwad.components.core.r.b.a(AdWebViewActivityProxy.this.mDialogFragment, AdWebViewActivityProxy.this.getActivity(), AdWebViewActivityProxy.this.mBaseDialogListener);
                        return;
                    }
                } else if (AdWebViewActivityProxy.this.isFormAdExitInterceptEnable()) {
                    AdWebViewActivityProxy.this.showDialog();
                    return;
                }
                AdWebViewActivityProxy.this.finish();
            }
        }
    };
    private com.kwad.components.core.webview.b.e.c mBaseDialogListener = new com.kwad.components.core.webview.b.e.c() { // from class: com.kwad.components.core.page.AdWebViewActivityProxy.3
        @Override // com.kwad.components.core.webview.b.e.c
        public final void G(boolean z) {
        }

        @Override // com.kwad.components.core.webview.b.e.c
        public final void gi() {
            com.kwad.components.core.r.a.pU().aG(true);
        }

        @Override // com.kwad.components.core.webview.b.e.c
        public final void gq() {
            com.kwad.components.core.r.a.pU().aG(false);
        }

        @Override // com.kwad.components.core.webview.b.e.c
        public final void gr() {
        }
    };

    /* loaded from: classes.dex */
    public static class a {
        private String MH;
        private String MI;
        private boolean MJ;
        private boolean MK;
        private AdTemplate adTemplate;

        /* renamed from: com.kwad.components.core.page.AdWebViewActivityProxy$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0206a {
            private String MH;
            private String MI;
            private boolean MK;
            private boolean ML;
            private AdTemplate adTemplate;

            public final C0206a V(AdTemplate adTemplate) {
                this.adTemplate = adTemplate;
                return this;
            }

            public final C0206a as(String str) {
                this.MH = str;
                return this;
            }

            public final C0206a at(String str) {
                this.MI = str;
                return this;
            }

            public final C0206a ax(boolean z) {
                this.ML = z;
                return this;
            }

            public final C0206a ay(boolean z) {
                this.MK = z;
                return this;
            }

            public final a oE() {
                return new a(this.MH, this.MI, this.adTemplate, this.ML, this.MK, (byte) 0);
            }
        }

        private a(String str, String str2, AdTemplate adTemplate, boolean z, boolean z2) {
            this.MH = str;
            this.MI = str2;
            this.adTemplate = adTemplate;
            this.MJ = z;
            this.MK = z2;
        }

        /* synthetic */ a(String str, String str2, AdTemplate adTemplate, boolean z, boolean z2, byte b) {
            this(str, str2, adTemplate, z, z2);
        }

        public final AdTemplate getAdTemplate() {
            return this.adTemplate;
        }

        public final String oA() {
            return this.MH;
        }

        public final String oB() {
            return this.MI;
        }

        public final boolean oC() {
            return this.MJ;
        }

        public final boolean oD() {
            return this.MK;
        }
    }

    private com.kwad.components.core.page.widget.a buildDialog() {
        return new com.kwad.components.core.page.widget.a(getActivity(), new a.InterfaceC0209a() { // from class: com.kwad.components.core.page.AdWebViewActivityProxy.5
            @Override // com.kwad.components.core.page.widget.a.InterfaceC0209a
            public final void a(DialogInterface dialogInterface) {
                com.kwad.sdk.core.report.a.q(AdWebViewActivityProxy.this.mAdTemplate, 104);
                dialogInterface.dismiss();
            }

            @Override // com.kwad.components.core.page.widget.a.InterfaceC0209a
            public final void b(DialogInterface dialogInterface) {
                try {
                    AdWebViewActivityProxy.super.onBackPressed();
                } catch (Throwable th) {
                }
                com.kwad.sdk.core.report.a.q(AdWebViewActivityProxy.this.mAdTemplate, 105);
            }

            @Override // com.kwad.components.core.page.widget.a.InterfaceC0209a
            public final void c(DialogInterface dialogInterface) {
                com.kwad.sdk.core.report.a.q(AdWebViewActivityProxy.this.mAdTemplate, 106);
                dialogInterface.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.kwad.components.core.r.b getTkDialogFragment() {
        d.b bVar = new d.b();
        bVar.setAdTemplate(this.mAdTemplate);
        bVar.aP("ksad-video-web-close-card");
        bVar.aP(false);
        bVar.aQ(true);
        return com.kwad.components.core.r.b.a(bVar);
    }

    private void initContentView() {
        c b = c.b(this.mContext, new a.C0206a().as(this.mPageTitle).at(this.mPageUrl).V(this.mAdTemplate).ax(this.mShowPermission).ay(this.mAutoShow).oE());
        this.mLandingPageView = b;
        b.setLandPageViewListener(this.mLandPageViewListener);
        this.mLandingPageView.setWebCardCloseListener(this.mWebCardCloseListener);
        ((ViewGroup) findViewById(R.id.ksad_land_page_root)).addView(this.mLandingPageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFormAdExitInterceptEnable() {
        AdTemplate adTemplate;
        if (this.mShowPermission || (adTemplate = this.mAdTemplate) == null || com.kwad.sdk.core.response.b.d.u(adTemplate)) {
            return false;
        }
        if (com.kwad.sdk.core.config.d.zw() && this.mAdTemplate.mIsFromContent) {
            return true;
        }
        return com.kwad.sdk.core.config.d.zx() && !this.mAdTemplate.mIsFromContent;
    }

    public static void launch(Context context, a aVar) {
        BusinessType cs = aVar.adTemplate.mAdScene != null ? KSLoggerReporter.cs(aVar.adTemplate.mAdScene.getAdStyle()) : null;
        if (TextUtils.isEmpty(aVar.MI) || aVar.MI.contains(" ") || !aVar.MI.startsWith("http")) {
            KSLoggerReporter.ReportClient.RESPONE_MONITOR.buildNormalApmReporter().dx("response_biz_error_convert").aO(aVar.adTemplate).T("h5UrlError", aVar.MI).report();
        }
        if (context == null || TextUtils.isEmpty(aVar.MI)) {
            return;
        }
        com.kwad.sdk.i.a.g("all", "convert", "launch_landing_page");
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(cs, "startH5Page").report();
        com.kwad.sdk.service.b.a(AdWebViewActivity.class, AdWebViewActivityProxy.class);
        Intent intent = new Intent(context, AdWebViewActivity.class);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra(KEY_PAGE_TITLE, aVar.MH);
        intent.putExtra(KEY_PAGE_URL, aVar.MI);
        intent.putExtra(KEY_IS_AUTO_SHOW, aVar.MK);
        intent.putExtra("key_template_json", aVar.adTemplate.toJson().toString());
        intent.putExtra(KEY_SHOW_PERMISSION, aVar.MJ);
        context.startActivity(intent);
        com.kwad.sdk.i.a.h("all", "convert", "launch_landing_page");
    }

    public static void launch(Context context, AdTemplate adTemplate) {
        launch(context, new a.C0206a().at(com.kwad.sdk.core.response.b.b.bq(adTemplate)).V(adTemplate).oE());
    }

    public static void register() {
        com.kwad.sdk.service.b.a(AdWebViewActivity.class, AdWebViewActivityProxy.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDialog() {
        if (this.mKsExitInterceptDialog == null) {
            this.mKsExitInterceptDialog = buildDialog();
        }
        com.kwad.sdk.core.report.a.b(this.mAdTemplate, 103, (JSONObject) null);
        this.mKsExitInterceptDialog.show();
    }

    @Override // com.kwad.components.core.o.c
    public boolean checkIntentData(Intent intent) {
        try {
            String stringExtra = getIntent().getStringExtra("key_template_json");
            AdTemplate adTemplate = new AdTemplate();
            adTemplate.parseJson(new JSONObject(stringExtra));
            this.mAdTemplate = adTemplate;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
        return this.mAdTemplate != null;
    }

    @Override // com.kwad.components.core.o.c
    public int getLayoutId() {
        return 0;
    }

    @Override // com.kwad.components.core.o.c
    public String getPageName() {
        return "AdWebViewActivityProxy";
    }

    @Override // com.kwad.components.core.o.c
    public void initData() {
        this.destroyed = false;
        String stringExtra = getIntent().getStringExtra("key_template_json");
        this.mPageTitle = getIntent().getStringExtra(KEY_PAGE_TITLE);
        this.mPageUrl = getIntent().getStringExtra(KEY_PAGE_URL);
        this.mAutoShow = getIntent().getBooleanExtra(KEY_IS_AUTO_SHOW, false);
        this.mShowPermission = getIntent().getBooleanExtra(KEY_SHOW_PERMISSION, false);
        try {
            AdTemplate adTemplate = new AdTemplate();
            adTemplate.parseJson(new JSONObject(stringExtra));
            this.mAdTemplate = adTemplate;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }

    @Override // com.kwad.components.core.o.c
    public void initView() {
        setContentView(R.layout.ksad_activity_landpage);
        initContentView();
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
        c cVar = this.mLandingPageView;
        if (cVar != null && cVar.getCanInterceptBackClick()) {
            this.mLandingPageView.oG();
            return;
        }
        AdTemplate adTemplate = this.mAdTemplate;
        if (adTemplate == null || adTemplate.mIsForceJumpLandingPage) {
            super.onBackPressed();
        } else if (com.kwad.sdk.core.response.b.a.aG(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)) && com.kwad.components.core.r.a.pU().pV() == 1 && com.kwad.components.core.r.a.pU().qa() && !com.kwad.components.core.r.a.pU().pX()) {
            if (com.kwad.components.core.r.a.pU().pW()) {
                super.onBackPressed();
                return;
            }
            com.kwad.components.core.r.b tkDialogFragment = getTkDialogFragment();
            this.mDialogFragment = tkDialogFragment;
            com.kwad.components.core.r.b.a(tkDialogFragment, getActivity(), this.mBaseDialogListener);
        } else {
            if (isFormAdExitInterceptEnable()) {
                try {
                    if (this.mKsExitInterceptDialogV2 == null) {
                        this.mKsExitInterceptDialogV2 = new com.kwad.components.core.page.widget.a(getActivity(), new a.InterfaceC0209a() { // from class: com.kwad.components.core.page.AdWebViewActivityProxy.4
                            @Override // com.kwad.components.core.page.widget.a.InterfaceC0209a
                            public final void a(DialogInterface dialogInterface) {
                                com.kwad.sdk.core.report.a.q(AdWebViewActivityProxy.this.mAdTemplate, 104);
                                dialogInterface.dismiss();
                            }

                            @Override // com.kwad.components.core.page.widget.a.InterfaceC0209a
                            public final void b(DialogInterface dialogInterface) {
                                if (!AdWebViewActivityProxy.this.destroyed) {
                                    try {
                                        AdWebViewActivityProxy.super.onBackPressed();
                                    } catch (Throwable th) {
                                        com.kwad.sdk.core.e.c.printStackTrace(th);
                                    }
                                }
                                com.kwad.sdk.core.report.a.q(AdWebViewActivityProxy.this.mAdTemplate, 105);
                            }

                            @Override // com.kwad.components.core.page.widget.a.InterfaceC0209a
                            public final void c(DialogInterface dialogInterface) {
                                com.kwad.sdk.core.report.a.q(AdWebViewActivityProxy.this.mAdTemplate, 106);
                                dialogInterface.dismiss();
                            }
                        });
                    }
                    com.kwad.sdk.core.report.a.b(this.mAdTemplate, 103, (JSONObject) null);
                    this.mKsExitInterceptDialogV2.show();
                    return;
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
            super.onBackPressed();
        }
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AdTemplate adTemplate = this.mAdTemplate;
        KSLoggerReporter.ReportClient.CONVERT_H5WEB.buildMethodCheck((adTemplate == null || adTemplate.mAdScene == null) ? null : KSLoggerReporter.cs(this.mAdTemplate.mAdScene.getAdStyle()), "h5PageCreate").report();
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
        this.destroyed = true;
        Dialog dialog = this.mKsExitInterceptDialog;
        if (dialog != null && dialog.isShowing()) {
            this.mKsExitInterceptDialog.dismiss();
        }
        Dialog dialog2 = this.mKsExitInterceptDialogV2;
        if (dialog2 != null && dialog2.isShowing()) {
            this.mKsExitInterceptDialogV2.dismiss();
        }
        super.onDestroy();
        AdTemplate adTemplate = this.mAdTemplate;
        if (adTemplate != null) {
            adTemplate.interactLandingPageShowing = false;
            this.mAdTemplate.mIsForceJumpLandingPage = false;
        }
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPreCreate(Bundle bundle) {
        super.onPreCreate(bundle);
        try {
            getIntent().removeExtra("key_template");
        } catch (Throwable th) {
        }
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
        super.onResume();
    }
}
