package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Set;
/* loaded from: classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    private String a;
    private WebView b;
    private EventListener c;

    /* loaded from: classes.dex */
    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.c = eventListener;
        WebView webView = this.b;
        if (webView == null) {
            this.a = str;
        } else {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.c;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            r.i("AppLovinWebViewActivity", "No SDK key specified");
        } else {
            final k kVar = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).coreSdk;
            try {
                WebView webView = new WebView(this);
                this.b = webView;
                setContentView(webView);
                WebSettings settings = this.b.getSettings();
                settings.setSupportMultipleWindows(false);
                settings.setJavaScriptEnabled(true);
                this.b.setVerticalScrollBarEnabled(true);
                this.b.setHorizontalScrollBarEnabled(true);
                this.b.setScrollBarStyle(33554432);
                this.b.setWebViewClient(new WebViewClient() { // from class: com.applovin.sdk.AppLovinWebViewActivity.1
                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                        Uri parse = Uri.parse(str);
                        String scheme = parse.getScheme();
                        String host = parse.getHost();
                        String path = parse.getPath();
                        r z = kVar.z();
                        z.b("AppLovinWebViewActivity", "Handling url load: " + str);
                        if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && AppLovinWebViewActivity.this.c != null) {
                            if (path.endsWith("webview_event")) {
                                Set<String> queryParameterNames = parse.getQueryParameterNames();
                                String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
                                if (!StringUtils.isValidString(str2)) {
                                    kVar.z().e("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                                    return true;
                                }
                                String queryParameter = parse.getQueryParameter(str2);
                                r z2 = kVar.z();
                                z2.b("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
                                AppLovinWebViewActivity.this.c.onReceivedEvent(queryParameter);
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
                    this.b.loadUrl(this.a);
                    return;
                }
                return;
            } catch (Throwable th) {
                kVar.z().b("AppLovinWebViewActivity", "Failed to initialize WebView.", th);
            }
        }
        finish();
    }
}
