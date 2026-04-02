package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.h.m;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.h.o;
import com.fyber.inneractive.sdk.j.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.al;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.u;
import com.google.android.gms.drive.DriveFile;
import java.net.URL;
import java.net.URLDecoder;
/* loaded from: classes.dex */
public class InneractiveInternalBrowserActivity extends Activity {
    public static final String URL_EXTRA = "extra_url";
    private static InternalBrowserListener a;
    private LinearLayout b;
    private WebView c;
    private ImageButton d;
    private ImageButton e;
    private ImageButton f;
    private ImageButton g;
    private boolean h = false;

    /* loaded from: classes.dex */
    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    static /* synthetic */ boolean c(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        inneractiveInternalBrowserActivity.h = true;
        return true;
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        a = internalBrowserListener;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        InternalBrowserListener internalBrowserListener;
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        super.onCreate(bundle);
        try {
            this.b = new LinearLayout(this);
            this.b.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            this.b.setOrientation(1);
            this.b.setContentDescription("IAInternalBrowserView");
            RelativeLayout relativeLayout = new RelativeLayout(this);
            relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.b.addView(relativeLayout);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setId(1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, l.b(getResources().getInteger(R.integer.ia_ib_toolbar_height_dp)));
            layoutParams.addRule(12);
            linearLayout.setLayoutParams(layoutParams);
            l.a(linearLayout, l.c(R.drawable.ia_ib_background));
            relativeLayout.addView(linearLayout);
            this.d = a(l.c(R.drawable.ia_ib_left_arrow));
            this.e = a(l.c(R.drawable.ia_ib_right_arrow));
            this.f = a(l.c(R.drawable.ia_ib_refresh));
            this.g = a(l.c(R.drawable.ia_ib_close));
            linearLayout.addView(this.d);
            linearLayout.addView(this.e);
            linearLayout.addView(this.f);
            linearLayout.addView(this.g);
            WebView webView = new WebView(this);
            this.c = webView;
            webView.setId(R.id.inneractive_webview_internal_browser);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(2, 1);
            this.c.setLayoutParams(layoutParams2);
            relativeLayout.addView(this.c);
            setContentView(this.b);
            Intent intent = getIntent();
            WebSettings settings = this.c.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(this.c);
            this.c.setWebViewClient(new WebViewClient() { // from class: com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.1
                @Override // android.webkit.WebViewClient
                public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                    o.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
                    InneractiveInternalBrowserActivity.this.finish();
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView2, int i, String str, String str2) {
                    IAlog.d("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i), str, str2);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    if (str == null) {
                        return false;
                    }
                    if (al.a(str)) {
                        InneractiveInternalBrowserActivity.this.c.loadUrl("chrome://crash");
                        return true;
                    } else if (str == null) {
                        return false;
                    } else {
                        u.a a2 = u.a(InneractiveInternalBrowserActivity.this.getApplicationContext(), str, true, u.d.a);
                        if (a2.a == u.c.FAILED) {
                            return !str.startsWith("http");
                        }
                        if (InneractiveInternalBrowserActivity.a != null) {
                            InneractiveInternalBrowserActivity.a.onApplicationInBackground();
                        }
                        if (!InneractiveInternalBrowserActivity.this.h) {
                            InneractiveInternalBrowserActivity.c(InneractiveInternalBrowserActivity.this);
                            n.a aVar = new n.a(m.FYBER_SUCCESS_CLICK, (InneractiveAdRequest) null, (e) null);
                            aVar.a(new n.b().a("url", str).a("opened_from", a2.a.toString()).a("opened_by", "internal_browser"));
                            aVar.b(null);
                        }
                        InneractiveInternalBrowserActivity.this.finish();
                        return true;
                    }
                }

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                    super.onPageStarted(webView2, str, bitmap);
                    InneractiveInternalBrowserActivity.this.e.setImageDrawable(l.c(R.drawable.ia_ib_unright_arrow));
                }

                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView2, String str) {
                    Drawable c;
                    Drawable c2;
                    super.onPageFinished(webView2, str);
                    if (webView2.canGoBack()) {
                        c = l.c(R.drawable.ia_ib_left_arrow);
                    } else {
                        c = l.c(R.drawable.ia_ib_unleft_arrow);
                    }
                    InneractiveInternalBrowserActivity.this.d.setImageDrawable(c);
                    if (webView2.canGoForward()) {
                        c2 = l.c(R.drawable.ia_ib_right_arrow);
                    } else {
                        c2 = l.c(R.drawable.ia_ib_unright_arrow);
                    }
                    InneractiveInternalBrowserActivity.this.e.setImageDrawable(c2);
                }
            });
            this.c.setWebChromeClient(new WebChromeClient() { // from class: com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.2
                @Override // android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView2, int i) {
                    Activity activity = (Activity) webView2.getContext();
                    activity.setTitle("Page is Loading...");
                    activity.setProgress(i * 100);
                    if (i == 100) {
                        activity.setTitle(webView2.getUrl());
                    }
                }
            });
            String stringExtra = intent.getStringExtra(URL_EXTRA);
            if (u.a(stringExtra)) {
                if (u.b(stringExtra)) {
                    try {
                        String decode = URLDecoder.decode(stringExtra, "utf-8");
                        new URL(decode);
                        try {
                            this.c.loadUrl(decode);
                        } catch (Exception unused) {
                            stringExtra = decode;
                            IAlog.d("Failed to open Url: %s", stringExtra);
                            finish();
                            this.d.setBackgroundColor(0);
                            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    if (InneractiveInternalBrowserActivity.this.c.canGoBack()) {
                                        InneractiveInternalBrowserActivity.this.c.goBack();
                                    }
                                }
                            });
                            this.d.setContentDescription("IABackButton");
                            this.e.setBackgroundColor(0);
                            this.e.setOnClickListener(new View.OnClickListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.4
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    if (InneractiveInternalBrowserActivity.this.c.canGoForward()) {
                                        InneractiveInternalBrowserActivity.this.c.goForward();
                                    }
                                }
                            });
                            this.e.setContentDescription("IAForwardButton");
                            this.f.setBackgroundColor(0);
                            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.5
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    InneractiveInternalBrowserActivity.this.c.reload();
                                    IAlog.a(IAlog.b, "%s %s", "AD_INTERNAL_BROWSER_REFRESH", InneractiveInternalBrowserActivity.this.c.getUrl());
                                }
                            });
                            this.f.setContentDescription("IARefreshButton");
                            this.g.setBackgroundColor(0);
                            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.6
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    InneractiveInternalBrowserActivity.this.finish();
                                }
                            });
                            this.g.setContentDescription("IACloseButton");
                            l.t();
                            l.u();
                        }
                    } catch (Exception unused2) {
                    }
                } else {
                    if (a(stringExtra) && (internalBrowserListener = a) != null) {
                        internalBrowserListener.onApplicationInBackground();
                    }
                    finish();
                }
            } else {
                this.c.loadUrl(stringExtra);
            }
            this.d.setBackgroundColor(0);
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (InneractiveInternalBrowserActivity.this.c.canGoBack()) {
                        InneractiveInternalBrowserActivity.this.c.goBack();
                    }
                }
            });
            this.d.setContentDescription("IABackButton");
            this.e.setBackgroundColor(0);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (InneractiveInternalBrowserActivity.this.c.canGoForward()) {
                        InneractiveInternalBrowserActivity.this.c.goForward();
                    }
                }
            });
            this.e.setContentDescription("IAForwardButton");
            this.f.setBackgroundColor(0);
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InneractiveInternalBrowserActivity.this.c.reload();
                    IAlog.a(IAlog.b, "%s %s", "AD_INTERNAL_BROWSER_REFRESH", InneractiveInternalBrowserActivity.this.c.getUrl());
                }
            });
            this.f.setContentDescription("IARefreshButton");
            this.g.setBackgroundColor(0);
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InneractiveInternalBrowserActivity.this.finish();
                }
            });
            this.g.setContentDescription("IACloseButton");
            l.t();
            l.u();
        } catch (Exception unused3) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        l.v();
        this.h = false;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        l.u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.c;
        if (webView != null) {
            webView.destroy();
            this.c = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void finish() {
        InternalBrowserListener internalBrowserListener = a;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finish();
    }

    private boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(DriveFile.MODE_READ_ONLY);
        try {
            startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            IAlog.d("Failed to start activity for %s. Please ensure that your phone can handle this intent.", str);
            return false;
        }
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        l.a(webView);
    }

    private ImageButton a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(l.b(getResources().getInteger(R.integer.ia_ib_button_size_dp)), l.b(getResources().getInteger(R.integer.ia_ib_button_size_dp)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
