package com.rovio.fusion;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.facebook.internal.ServerProtocol;
/* loaded from: classes2.dex */
public class WebViewWrapper extends WebViewClient implements IActivityListener {
    private WebView a;
    private long b;
    private boolean c;
    private JavaScriptReturnValue d;
    private LinkClickedReturnValue e;
    private final int f = -1;
    private final int g = 0;
    private final int h = 1;
    private final int i = 2;
    private final boolean j = false;
    private final boolean k = false;

    /* JADX INFO: Access modifiers changed from: private */
    public native void callNativeFunction(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native int linkClickedCallback(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void urlLoadedCallback(long j, boolean z, String str);

    public WebViewWrapper(final int i, final int i2, final int i3, final int i4, final boolean z, final long j) {
        a(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                WebViewWrapper.this.b = j;
                WebViewWrapper.this.c = false;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
                layoutParams.leftMargin = i;
                layoutParams.topMargin = i2;
                WebViewWrapper.this.a = new WebView(Globals.getActivity());
                WebViewWrapper.this.a.setVisibility(8);
                WebViewWrapper.this.a.setLayoutParams(layoutParams);
                WebViewWrapper.this.a.setWebViewClient(WebViewWrapper.this);
                if (z) {
                    if (Build.VERSION.SDK_INT >= 11) {
                        WebViewWrapper.this.a.setBackgroundColor(16777216);
                    } else {
                        WebViewWrapper.this.a.setBackgroundColor(0);
                    }
                }
                WebViewWrapper.this.a.getSettings().setJavaScriptEnabled(true);
                if (Build.VERSION.SDK_INT >= 19) {
                    WebViewWrapper.this.a.getSettings().setUseWideViewPort(true);
                }
                WebViewWrapper.this.a.setScrollBarStyle(0);
                WebViewWrapper.this.a.requestFocus(130);
                WebViewWrapper.this.a.setOnTouchListener(new View.OnTouchListener() { // from class: com.rovio.fusion.WebViewWrapper.1.1
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        switch (motionEvent.getAction()) {
                            case 0:
                            case 1:
                                if (!view.hasFocus()) {
                                    view.requestFocus();
                                    return false;
                                }
                                return false;
                            default:
                                return false;
                        }
                    }
                });
                WebViewWrapper.this.a.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
                WebViewWrapper.this.d = new JavaScriptReturnValue();
                WebViewWrapper.this.a.addJavascriptInterface(WebViewWrapper.this.d, "JavaScriptReturnValue");
                WebViewWrapper.this.a.addJavascriptInterface(new NativeInterface(WebViewWrapper.this), "NativeInterface");
                WebViewWrapper.this.a.addJavascriptInterface(new WebViewInterface(WebViewWrapper.this), "WebViewInterface");
                WebViewWrapper.this.e = new LinkClickedReturnValue();
                Globals.getRootViewGroup().addView(WebViewWrapper.this.a);
                Globals.registerActivityListener(WebViewWrapper.this);
            }
        });
    }

    public void destroy() {
        this.b = 0L;
        Globals.unregisterActivityListener(this);
        a(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != null) {
                    Globals.getRootViewGroup().removeView(WebViewWrapper.this.a);
                    WebViewWrapper.this.a = null;
                }
            }
        });
    }

    public void loadUrl(final String str) {
        a(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != null) {
                    WebViewWrapper.this.c = false;
                    WebViewWrapper.this.a.loadUrl(str);
                }
            }
        });
    }

    public void reload() {
        a(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != null) {
                    WebViewWrapper.this.c = false;
                    WebViewWrapper.this.a.reload();
                }
            }
        });
    }

    public void show() {
        a(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.5
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != null && WebViewWrapper.this.a.getVisibility() != 0) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(500L);
                    alphaAnimation.setInterpolator(new LinearInterpolator());
                    WebViewWrapper.this.a.startAnimation(alphaAnimation);
                    WebViewWrapper.this.a.setVisibility(0);
                    WebViewWrapper.this.b(true);
                }
            }
        });
    }

    public void hide() {
        a(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.6
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != null) {
                    WebViewWrapper.this.a.clearAnimation();
                    WebViewWrapper.this.a.setVisibility(8);
                    WebViewWrapper.this.b(false);
                }
            }
        });
    }

    public void setPosition(final int i, final int i2) {
        a(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.7
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != null) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(WebViewWrapper.this.a.getLayoutParams().width, WebViewWrapper.this.a.getLayoutParams().height);
                    layoutParams.leftMargin = i;
                    layoutParams.topMargin = i2;
                    WebViewWrapper.this.a.setLayoutParams(layoutParams);
                }
            }
        });
    }

    public void setSize(final int i, final int i2) {
        a(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.8
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) WebViewWrapper.this.a.getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i2);
                    layoutParams2.leftMargin = layoutParams.leftMargin;
                    layoutParams2.topMargin = layoutParams.topMargin;
                    WebViewWrapper.this.a.setLayoutParams(layoutParams2);
                }
            }
        });
    }

    public String executeJavaScript(final String str) {
        a(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.9
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("javascript:");
                    stringBuffer.append("window['r_v_c'] = function() {");
                    stringBuffer.append("var i;");
                    stringBuffer.append("try { i = ");
                    stringBuffer.append(str);
                    stringBuffer.append("; }");
                    stringBuffer.append("catch(err) { i = '' + err; }");
                    stringBuffer.append("if (typeof i == 'undefined') { i = ''; }");
                    stringBuffer.append("return i; };");
                    WebViewWrapper.this.a.loadUrl(stringBuffer.toString());
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("javascript:");
                    stringBuffer2.append("JavaScriptReturnValue.setValue(r_v_c != null ? r_v_c() : 'error: invalid JavaScript');");
                    stringBuffer2.append("window['r_v_c'] = null;");
                    WebViewWrapper.this.a.loadUrl(stringBuffer2.toString());
                }
            }
        });
        return this.d.getAndResetValue();
    }

    public void asyncExecuteJavaScript(final String str) {
        a(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.10
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != null) {
                    StringBuffer stringBuffer = new StringBuffer("javascript:");
                    stringBuffer.append(str);
                    WebViewWrapper.this.a.loadUrl(stringBuffer.toString());
                }
            }
        });
    }

    public void disableHardwareAcceleration() {
        if (Build.VERSION.SDK_INT >= 11) {
            a(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.11
                @Override // java.lang.Runnable
                public void run() {
                    if (WebViewWrapper.this.a != null) {
                        WebViewWrapper.this.a.setLayerType(1, null);
                    }
                }
            });
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, final String str) {
        new Thread(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.12
            @Override // java.lang.Runnable
            public void run() {
                Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.12.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (WebViewWrapper.this.b != 0) {
                            WebViewWrapper.this.e.setValue(WebViewWrapper.this.linkClickedCallback(WebViewWrapper.this.b, str));
                        }
                    }
                });
                int andResetValue = WebViewWrapper.this.e.getAndResetValue();
                if (andResetValue == 1) {
                    WebViewWrapper.this.loadUrl(str);
                } else if (andResetValue == 2) {
                    WebViewWrapper.this.a(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.12.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                Globals.getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            } catch (ActivityNotFoundException e) {
                            }
                        }
                    });
                }
            }
        }).start();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.a != null && !this.c) {
            this.a.loadUrl("javascript:function callNativeFunction(message) { NativeInterface.callNativeFunction(message); };");
            StringBuffer stringBuffer = new StringBuffer("if (typeof(Rovio) == 'undefined') { Rovio = {}; };");
            stringBuffer.append("if (typeof(Rovio.Platform) == 'undefined') { Rovio.Platform = {}; };");
            stringBuffer.append("if (typeof(Rovio.Platform.WebView) == 'undefined') { Rovio.Platform.WebView = {}; };");
            stringBuffer.append("Rovio.Platform.WebView.version = 1;");
            stringBuffer.append("Rovio.Platform.WebView.show = function() { WebViewInterface.show(); };");
            stringBuffer.append("Rovio.Platform.WebView.hide = function() { WebViewInterface.hide(); };");
            this.a.loadUrl("javascript:" + ((Object) stringBuffer));
        }
        a(true);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.c = true;
        a(false);
    }

    private void a(final boolean z) {
        if (this.a != null) {
            final String title = z ? this.a.getTitle() : "";
            if (title == null) {
                title = "";
            }
            Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.13
                @Override // java.lang.Runnable
                public void run() {
                    if (WebViewWrapper.this.b != 0) {
                        WebViewWrapper.this.urlLoadedCallback(WebViewWrapper.this.b, z, title);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        asyncExecuteJavaScript("if (typeof Rovio.Platform.WebView.onVisibilityChanged === 'function') {Rovio.Platform.WebView.onVisibilityChanged(" + (z ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false") + ");}");
    }

    /* loaded from: classes2.dex */
    private class JavaScriptReturnValue {
        private String b;

        private JavaScriptReturnValue() {
        }

        @JavascriptInterface
        public synchronized void setValue(String str) {
            if (str == null) {
                str = new String();
            }
            this.b = str;
            notify();
        }

        public String getAndResetValue() {
            synchronized (this) {
                while (this.b == null) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            String str = this.b;
            this.b = null;
            return str;
        }
    }

    /* loaded from: classes2.dex */
    class LinkClickedReturnValue {
        private int b = -1;

        LinkClickedReturnValue() {
        }

        public synchronized void setValue(int i) {
            this.b = i;
            notify();
        }

        public int getAndResetValue() {
            synchronized (this) {
                while (this.b == -1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            int i = this.b;
            this.b = -1;
            return i;
        }
    }

    /* loaded from: classes2.dex */
    class NativeInterface {
        private WebViewWrapper b;

        public NativeInterface(WebViewWrapper webViewWrapper) {
            this.b = webViewWrapper;
        }

        @JavascriptInterface
        public void callNativeFunction(final String str) {
            Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.NativeInterface.1
                @Override // java.lang.Runnable
                public void run() {
                    if (NativeInterface.this.b.b != 0) {
                        NativeInterface.this.b.callNativeFunction(NativeInterface.this.b.b, str);
                    }
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    class WebViewInterface {
        private WebViewWrapper b;

        public WebViewInterface(WebViewWrapper webViewWrapper) {
            this.b = webViewWrapper;
        }

        @JavascriptInterface
        public void show() {
            Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.WebViewInterface.1
                @Override // java.lang.Runnable
                public void run() {
                    WebViewInterface.this.b.show();
                }
            });
        }

        @JavascriptInterface
        public void hide() {
            Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.WebViewWrapper.WebViewInterface.2
                @Override // java.lang.Runnable
                public void run() {
                    WebViewInterface.this.b.hide();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        Globals.getActivity().runOnUiThread(runnable);
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onResume() {
        if (this.a != null) {
            this.a.resumeTimers();
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onPause() {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onDestroy() {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onNewIntent(Intent intent) {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onActivityResult(int i, int i2, Intent intent) {
    }
}
