package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.List;
/* loaded from: classes2.dex */
public class OpenUrlActivity extends Activity {
    private static final int a = SDKUtils.generateViewId();
    private static final int b = SDKUtils.generateViewId();
    private w d;
    private ProgressBar e;
    private boolean f;
    private RelativeLayout g;
    private String h;
    private WebView c = null;
    private Handler i = new Handler();
    private boolean j = false;
    private final Runnable k = new Runnable() { // from class: com.ironsource.sdk.controller.OpenUrlActivity.2
        @Override // java.lang.Runnable
        public final void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.j));
        }
    };

    /* loaded from: classes2.dex */
    class a extends WebViewClient {
        private a() {
        }

        /* synthetic */ a(OpenUrlActivity openUrlActivity, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.e.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.e.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e("OpenUrlActivity", "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> b = com.ironsource.sdk.utils.b.a().b();
            if (!b.isEmpty()) {
                for (String str2 : b) {
                    if (str.contains(str2)) {
                        try {
                            OpenUrlActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            OpenUrlActivity.this.d.b();
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            if (e instanceof ActivityNotFoundException) {
                                sb.append("no activity to handle url");
                            } else {
                                sb.append("activity failed to open with unspecified reason");
                            }
                            if (OpenUrlActivity.this.d != null) {
                                w wVar = OpenUrlActivity.this.d;
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str)) {
                                    str = "unknown url";
                                }
                                wVar.b(w.b("failedToStartStoreActivity", w.a("errMsg", TextUtils.isEmpty(sb2) ? "activity failed to open with unspecified reason" : sb2, "url", str, null, null, null, null, null, false)));
                            }
                        }
                        OpenUrlActivity.this.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        w wVar;
        if (this.f && (wVar = this.d) != null) {
            wVar.e("secondaryClose");
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.c.stopLoading();
        this.c.clearHistory();
        try {
            this.c.loadUrl(str);
        } catch (Throwable th) {
            Logger.e("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.c.canGoBack()) {
            this.c.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i("OpenUrlActivity", "onCreate()");
        try {
            this.d = (w) com.ironsource.sdk.d.b.a((Context) this).a.a;
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            Bundle extras = getIntent().getExtras();
            this.h = extras.getString(w.c);
            this.f = extras.getBoolean(w.d);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.j = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.ironsource.sdk.controller.OpenUrlActivity.1
                    @Override // android.view.View.OnSystemUiVisibilityChangeListener
                    public final void onSystemUiVisibilityChange(int i) {
                        if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                            OpenUrlActivity.this.i.removeCallbacks(OpenUrlActivity.this.k);
                            OpenUrlActivity.this.i.postDelayed(OpenUrlActivity.this.k, 500L);
                        }
                    }
                });
                runOnUiThread(this.k);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.g = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        WebView webView = this.c;
        if (webView != null) {
            webView.destroy();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.j && (i == 25 || i == 24)) {
            this.i.postDelayed(this.k, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        w wVar = this.d;
        if (wVar != null) {
            wVar.a(false, "secondary");
            if (this.g == null || (viewGroup = (ViewGroup) this.c.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(a) != null) {
                viewGroup.removeView(this.c);
            }
            if (viewGroup.findViewById(b) != null) {
                viewGroup.removeView(this.e);
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.c == null) {
            WebView webView = new WebView(getApplicationContext());
            this.c = webView;
            webView.setId(a);
            this.c.getSettings().setJavaScriptEnabled(true);
            this.c.setWebViewClient(new a(this, (byte) 0));
            loadUrl(this.h);
        }
        if (findViewById(a) == null) {
            this.g.addView(this.c, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (this.e == null) {
            this.e = Build.VERSION.SDK_INT >= 11 ? new ProgressBar(new ContextThemeWrapper(this, 16973939)) : new ProgressBar(this);
            this.e.setId(b);
        }
        if (findViewById(b) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.e.setLayoutParams(layoutParams);
            this.e.setVisibility(4);
            this.g.addView(this.e);
        }
        w wVar = this.d;
        if (wVar != null) {
            wVar.a(true, "secondary");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.j && z) {
            runOnUiThread(this.k);
        }
    }
}
