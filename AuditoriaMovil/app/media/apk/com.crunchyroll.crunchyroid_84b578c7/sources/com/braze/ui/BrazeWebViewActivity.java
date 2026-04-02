package com.braze.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.h;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.ViewUtils;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: BrazeWebViewActivity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/braze/ui/BrazeWebViewActivity;", "Landroidx/fragment/app/h;", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/amazon/aps/iva/kb0/q;", "onCreate", "Landroid/webkit/WebChromeClient;", "createWebChromeClient", "Landroid/webkit/WebViewClient;", "createWebViewClient", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes.dex */
public class BrazeWebViewActivity extends h {
    public WebChromeClient createWebChromeClient() {
        return new WebChromeClient() { // from class: com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1
            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                j.f(consoleMessage, "cm");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeWebViewActivity$createWebChromeClient$1$onConsoleMessage$1(consoleMessage), 3, (Object) null);
                return true;
            }
        };
    }

    public WebViewClient createWebViewClient() {
        return new WebViewClient() { // from class: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1
            private final Boolean handleUrlOverride(Context context, String str) {
                try {
                    if (x.m0(BrazeFileUtils.REMOTE_SCHEMES, Uri.parse(str).getScheme())) {
                        return null;
                    }
                    UriAction createUriActionFromUrlString = BrazeDeeplinkHandler.Companion.getInstance().createUriActionFromUrlString(str, BrazeWebViewActivity.this.getIntent().getExtras(), false, Channel.UNKNOWN);
                    if (createUriActionFromUrlString != null) {
                        createUriActionFromUrlString.execute(context);
                        BrazeWebViewActivity.this.finish();
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                } catch (Exception e) {
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new BrazeWebViewActivity$createWebViewClient$1$handleUrlOverride$1(str));
                    return null;
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                j.f(webView, "view");
                j.f(renderProcessGoneDetail, "detail");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, BrazeWebViewActivity$createWebViewClient$1$onRenderProcessGone$1.INSTANCE, 2, (Object) null);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                j.f(webView, "view");
                j.f(webResourceRequest, "request");
                Context context = webView.getContext();
                j.e(context, "view.context");
                String uri = webResourceRequest.getUrl().toString();
                j.e(uri, "request.url.toString()");
                Boolean handleUrlOverride = handleUrlOverride(context, uri);
                return handleUrlOverride != null ? handleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                j.f(webView, "view");
                j.f(str, ImagesContract.URL);
                Context context = webView.getContext();
                j.e(context, "view.context");
                Boolean handleUrlOverride = handleUrlOverride(context, str);
                return handleUrlOverride != null ? handleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(webView, str);
            }
        };
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        getWindow().setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        setContentView(R$layout.com_braze_webview_activity);
        WebView webView = (WebView) findViewById(R$id.com_braze_webview_activity_webview);
        webView.setLayerType(2, null);
        WebSettings settings = webView.getSettings();
        j.e(settings, "webView.settings");
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        Context applicationContext = getApplicationContext();
        j.e(applicationContext, "this.applicationContext");
        if (ViewUtils.isDeviceInNightMode(applicationContext)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                settings.setAlgorithmicDarkeningAllowed(true);
            } else if (i >= 29) {
                settings.setForceDark(2);
            }
        }
        webView.setWebChromeClient(createWebChromeClient());
        webView.setWebViewClient(createWebViewClient());
        Bundle extras = getIntent().getExtras();
        if (extras != null && (string = extras.getString(ImagesContract.URL)) != null) {
            webView.loadUrl(string);
        }
    }
}
