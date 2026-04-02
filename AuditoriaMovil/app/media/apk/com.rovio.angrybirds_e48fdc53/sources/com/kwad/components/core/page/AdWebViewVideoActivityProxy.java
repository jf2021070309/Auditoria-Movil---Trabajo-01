package com.kwad.components.core.page;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.kwad.components.core.b.a;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.o.f;
import com.kwad.components.core.page.widget.a;
import com.kwad.sdk.R;
import com.kwad.sdk.api.core.KsAdSdkDynamicImpl;
import com.kwad.sdk.api.core.fragment.KsFragment;
import com.kwad.sdk.api.core.fragment.KsFragmentTransaction;
import com.kwad.sdk.api.proxy.app.AdWebViewActivity;
import com.kwad.sdk.api.proxy.app.BaseFragmentActivity;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.widget.DownloadProgressBar;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import org.json.JSONObject;
@KsAdSdkDynamicImpl(AdWebViewActivity.class)
/* loaded from: classes.dex */
public class AdWebViewVideoActivityProxy extends f {
    public static final String KEY_REPORTED = "key_reported";
    public static final String KEY_TEMPLATE = "key_template_json";
    public static boolean showingAdWebViewVideoActivity = false;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private b mFragment;
    private Dialog mKsExitInterceptDialog;
    private DownloadProgressBar mProgressbar;
    private com.kwad.components.core.page.splitLandingPage.a mSplitLandingPage;
    private com.kwad.components.core.b.a mTitleBarHelper;
    private ViewGroup mWebDownloadContainer;

    private com.kwad.components.core.page.widget.a buildDialog() {
        return new com.kwad.components.core.page.widget.a(getActivity(), new a.InterfaceC0209a() { // from class: com.kwad.components.core.page.AdWebViewVideoActivityProxy.4
            @Override // com.kwad.components.core.page.widget.a.InterfaceC0209a
            public final void a(DialogInterface dialogInterface) {
                com.kwad.sdk.core.report.a.q(AdWebViewVideoActivityProxy.this.mAdTemplate, 104);
                dialogInterface.dismiss();
            }

            @Override // com.kwad.components.core.page.widget.a.InterfaceC0209a
            public final void b(DialogInterface dialogInterface) {
                AdWebViewVideoActivityProxy.super.onBackPressed();
                com.kwad.sdk.core.report.a.q(AdWebViewVideoActivityProxy.this.mAdTemplate, 105);
            }

            @Override // com.kwad.components.core.page.widget.a.InterfaceC0209a
            public final void c(DialogInterface dialogInterface) {
                com.kwad.sdk.core.report.a.q(AdWebViewVideoActivityProxy.this.mAdTemplate, 106);
                dialogInterface.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a.C0197a getAdClickConfig(boolean z) {
        return new a.C0197a(getActivity()).al(z).aq(true).am(false).S(this.mAdTemplate).ao(false);
    }

    private void initView() {
        KsFragmentTransaction beginTransaction;
        KsFragment ksFragment;
        this.mProgressbar = (DownloadProgressBar) findViewById(R.id.ksad_web_download_progress);
        this.mWebDownloadContainer = (ViewGroup) findViewById(R.id.ksad_web_download_container);
        final AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        if (com.kwad.sdk.core.response.b.a.ax(ck)) {
            this.mWebDownloadContainer.setVisibility(0);
            this.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate, new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.core.page.AdWebViewVideoActivityProxy.1
                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onDownloadFailed() {
                    AdWebViewVideoActivityProxy.this.mProgressbar.setProgress(100.0f);
                    AdWebViewVideoActivityProxy.this.mProgressbar.setText(com.kwad.sdk.core.response.b.a.aw(ck));
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onDownloadFinished() {
                    AdWebViewVideoActivityProxy.this.mProgressbar.setProgress(100.0f);
                    AdWebViewVideoActivityProxy.this.mProgressbar.setText(com.kwad.sdk.core.response.b.a.aQ(AdWebViewVideoActivityProxy.this.mAdTemplate));
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onIdle() {
                    AdWebViewVideoActivityProxy.this.mProgressbar.setProgress(100.0f);
                    AdWebViewVideoActivityProxy.this.mProgressbar.setText(com.kwad.sdk.core.response.b.a.aw(ck));
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onInstalled() {
                    AdWebViewVideoActivityProxy.this.mProgressbar.setProgress(100.0f);
                    AdWebViewVideoActivityProxy.this.mProgressbar.setText(com.kwad.sdk.core.response.b.a.U(ck));
                }

                @Override // com.kwad.sdk.core.download.a.a
                public final void onPaused(int i) {
                    AdWebViewVideoActivityProxy.this.mProgressbar.setProgress(i);
                    AdWebViewVideoActivityProxy.this.mProgressbar.setText(com.kwad.sdk.core.response.b.a.cw(i));
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onProgressUpdate(int i) {
                    AdWebViewVideoActivityProxy.this.mProgressbar.setProgress(i);
                    AdWebViewVideoActivityProxy.this.mProgressbar.setText(com.kwad.sdk.core.response.b.a.cv(i));
                }
            });
            this.mProgressbar.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.AdWebViewVideoActivityProxy.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.kwad.sdk.core.report.a.a(AdWebViewVideoActivityProxy.this.mAdTemplate, 50, (ac.a) null);
                    com.kwad.components.core.e.d.a.a(AdWebViewVideoActivityProxy.this.getAdClickConfig(true));
                }
            });
        } else {
            this.mWebDownloadContainer.setVisibility(8);
        }
        String bO = (this.mAdTemplate.adInfoList == null || this.mAdTemplate.adInfoList.size() <= 0 || this.mAdTemplate.adInfoList.get(0) == null) ? "详情页面" : com.kwad.sdk.core.response.b.a.bO(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
        com.kwad.components.core.b.a aVar = new com.kwad.components.core.b.a((ViewGroup) findViewById(R.id.ksad_kwad_web_title_bar));
        this.mTitleBarHelper = aVar;
        aVar.a(new a.InterfaceC0185a() { // from class: com.kwad.components.core.page.AdWebViewVideoActivityProxy.3
            @Override // com.kwad.components.core.b.a.InterfaceC0185a
            public final void t(View view) {
                AdWebViewVideoActivityProxy.this.onBackPressed();
            }

            @Override // com.kwad.components.core.b.a.InterfaceC0185a
            public final void u(View view) {
                AdWebViewVideoActivityProxy.this.finish();
            }
        });
        this.mTitleBarHelper.a(new com.kwad.components.core.b.b(bO));
        ai.cn(getActivity());
        com.kwad.components.core.t.d.a(getActivity(), 0, true);
        int i = R.id.ksad_recycler_container;
        if (com.kwad.sdk.core.config.d.yV() != 0) {
            com.kwad.components.core.page.splitLandingPage.a W = com.kwad.components.core.page.splitLandingPage.a.W(this.mAdTemplate);
            this.mSplitLandingPage = W;
            W.setApkDownloadHelper(this.mApkDownloadHelper);
            beginTransaction = getSupportFragmentManager().beginTransaction();
            ksFragment = this.mSplitLandingPage;
        } else {
            b U = b.U(this.mAdTemplate);
            this.mFragment = U;
            U.setApkDownloadHelper(this.mApkDownloadHelper);
            beginTransaction = getSupportFragmentManager().beginTransaction();
            ksFragment = this.mFragment;
        }
        beginTransaction.replace(i, ksFragment).commitAllowingStateLoss();
    }

    private boolean isFormAdExitInterceptEnable() {
        if (this.mAdTemplate == null) {
            return false;
        }
        if (com.kwad.sdk.core.config.d.zw() && this.mAdTemplate.mIsFromContent) {
            return true;
        }
        return com.kwad.sdk.core.config.d.zx() && !this.mAdTemplate.mIsFromContent;
    }

    public static void launch(Context context, AdTemplate adTemplate) {
        if (context == null || adTemplate == null) {
            return;
        }
        Intent intent = new Intent(context, BaseFragmentActivity.FragmentActivity3.class);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("key_template_json", adTemplate.toJson().toString());
        intent.putExtra(KEY_REPORTED, adTemplate.mPvReported);
        context.startActivity(intent);
        Activity dt = l.dt(context);
        if (dt != null) {
            dt.overridePendingTransition(0, 0);
        }
    }

    public static void register() {
        com.kwad.sdk.service.b.a(BaseFragmentActivity.FragmentActivity3.class, AdWebViewVideoActivityProxy.class);
    }

    private void showDialog() {
        if (this.mKsExitInterceptDialog == null) {
            this.mKsExitInterceptDialog = buildDialog();
        }
        com.kwad.sdk.core.report.a.b(this.mAdTemplate, 103, (JSONObject) null);
        this.mKsExitInterceptDialog.show();
    }

    private void showWaitDialog() {
        if (isFormAdExitInterceptEnable()) {
            showDialog();
        } else {
            finish();
        }
    }

    @Override // com.kwad.components.core.o.f
    public String getPageName() {
        return "AdWebViewVideoActivityProxy";
    }

    @Override // com.kwad.components.core.o.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
        com.kwad.components.core.page.splitLandingPage.a aVar = this.mSplitLandingPage;
        if (aVar == null || !aVar.bQ()) {
            com.kwad.components.core.page.splitLandingPage.a aVar2 = this.mSplitLandingPage;
            if (aVar2 != null) {
                aVar2.pq();
            }
            b bVar = this.mFragment;
            if (bVar == null || !bVar.bQ()) {
                showWaitDialog();
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override // com.kwad.components.core.o.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ksad_activity_ad_video_webview);
        showingAdWebViewVideoActivity = true;
        try {
            String stringExtra = getIntent().getStringExtra("key_template_json");
            AdTemplate adTemplate = new AdTemplate();
            adTemplate.parseJson(new JSONObject(stringExtra));
            this.mAdTemplate = adTemplate;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
        AdTemplate adTemplate2 = this.mAdTemplate;
        if (adTemplate2 == null) {
            finish();
            return;
        }
        adTemplate2.mPvReported = getIntent().getBooleanExtra(KEY_REPORTED, false);
        initView();
    }

    @Override // com.kwad.components.core.o.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
        Dialog dialog = this.mKsExitInterceptDialog;
        if (dialog != null && dialog.isShowing()) {
            this.mKsExitInterceptDialog.dismiss();
        }
        super.onDestroy();
        showingAdWebViewVideoActivity = false;
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.clear();
        }
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
        showingAdWebViewVideoActivity = false;
        overridePendingTransition(0, 0);
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onPreCreate(Bundle bundle) {
        super.onPreCreate(bundle);
        try {
            getIntent().removeExtra("key_template");
        } catch (Throwable th) {
        }
    }

    @Override // com.kwad.components.core.o.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
        super.onResume();
        showingAdWebViewVideoActivity = true;
    }
}
