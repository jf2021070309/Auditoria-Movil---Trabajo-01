package com.ss.android.downloadlib.addownload.compliance;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.R;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.t;
/* loaded from: classes3.dex */
public class AppPrivacyPolicyActivity extends Activity {
    private ImageView dr;
    private long g;
    private WebView ge;
    private long o;
    private String q;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ttdownloader_activity_app_privacy_policy);
        if (dr()) {
            ge();
        } else {
            com.ss.android.socialbase.appdownloader.o.dr((Activity) this);
        }
    }

    public static void dr(Activity activity, long j) {
        Intent intent = new Intent(activity, AppPrivacyPolicyActivity.class);
        intent.putExtra("app_info_id", j);
        activity.startActivity(intent);
    }

    private boolean dr() {
        this.o = getIntent().getLongExtra("app_info_id", 0L);
        com.ss.android.downloadlib.addownload.ge.ge dr = o.dr().dr(this.o);
        if (dr == null) {
            return false;
        }
        this.g = dr.ge;
        String str = dr.ll;
        this.q = str;
        if (TextUtils.isEmpty(str)) {
            this.q = wb.ll().optString("ad_privacy_backup_url", "https://sf6-ttcdn-tos.pstatp.com/obj/ad-tetris-site/personal-privacy-page.html");
            return true;
        }
        return true;
    }

    private void ge() {
        this.dr = (ImageView) findViewById(R.id.iv_privacy_back);
        this.ge = (WebView) findViewById(R.id.privacy_webview);
        this.dr.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                q.dr("lp_app_privacy_click_close", AppPrivacyPolicyActivity.this.g);
                AppPrivacyPolicyActivity.this.finish();
            }
        });
        WebSettings settings = this.ge.getSettings();
        settings.setDefaultFontSize(16);
        settings.setCacheMode(-1);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        this.ge.setWebViewClient(new WebViewClient() { // from class: com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity.2
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                return dr(webResourceRequest.getUrl());
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return dr(Uri.parse(str));
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (Build.VERSION.SDK_INT < 26) {
                    return super.onRenderProcessGone(webView, renderProcessGoneDetail);
                }
                if (!renderProcessGoneDetail.didCrash()) {
                    t.dr("System killed the WebView rendering process to reclaim memory. Recreating...");
                    if (webView != null) {
                        ((ViewGroup) webView.getParent()).removeView(webView);
                        webView.destroy();
                    }
                    return true;
                }
                t.dr("The WebView rendering process crashed!");
                if (webView != null) {
                    ((ViewGroup) webView.getParent()).removeView(webView);
                    webView.destroy();
                }
                return true;
            }

            private boolean dr(Uri uri) {
                String scheme = uri.getScheme();
                if ("http".equals(scheme) || "https".equals(scheme)) {
                    return false;
                }
                return true;
            }
        });
        dr(this.ge);
        this.ge.setScrollBarStyle(0);
        this.ge.loadUrl(this.q);
    }

    private void dr(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        q.dr("lp_app_privacy_click_close", this.g);
        super.onBackPressed();
    }
}
