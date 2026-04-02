package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Set;
/* loaded from: classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private WebView f4456b;

    /* renamed from: c  reason: collision with root package name */
    private EventListener f4457c;

    /* loaded from: classes.dex */
    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f4457c = eventListener;
        WebView webView = this.f4456b;
        if (webView == null) {
            this.a = str;
        } else {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f4457c;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            v.i("AppLovinWebViewActivity", "No SDK key specified");
        } else {
            final m mVar = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).coreSdk;
            try {
                WebView webView = new WebView(this);
                this.f4456b = webView;
                setContentView(webView);
                WebSettings settings = this.f4456b.getSettings();
                settings.setSupportMultipleWindows(false);
                settings.setJavaScriptEnabled(true);
                this.f4456b.setVerticalScrollBarEnabled(true);
                this.f4456b.setHorizontalScrollBarEnabled(true);
                this.f4456b.setScrollBarStyle(33554432);
                this.f4456b.setWebViewClient(new WebViewClient() { // from class: com.applovin.sdk.AppLovinWebViewActivity.1
                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                        Uri parse = Uri.parse(str);
                        String scheme = parse.getScheme();
                        String host = parse.getHost();
                        String path = parse.getPath();
                        v B = mVar.B();
                        B.b("AppLovinWebViewActivity", "Handling url load: " + str);
                        if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && AppLovinWebViewActivity.this.f4457c != null) {
                            if (path.endsWith("webview_event")) {
                                Set<String> queryParameterNames = parse.getQueryParameterNames();
                                String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
                                if (!StringUtils.isValidString(str2)) {
                                    mVar.B().e("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                                    return true;
                                }
                                String queryParameter = parse.getQueryParameter(str2);
                                v B2 = mVar.B();
                                B2.b("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
                                AppLovinWebViewActivity.this.f4457c.onReceivedEvent(queryParameter);
                                return true;
                            }
                            return true;
                        }
                        return super.shouldOverrideUrlLoading(webView2, str);
                    }
                });
                if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
                    getWindow().getDecorView().setSystemUiVisibility(5894);
                }
                if (StringUtils.isValidString(this.a)) {
                    this.f4456b.loadUrl(this.a);
                    return;
                }
                return;
            } catch (Throwable th) {
                mVar.B().b("AppLovinWebViewActivity", "Failed to initialize WebView.", th);
            }
        }
        finish();
    }
}
