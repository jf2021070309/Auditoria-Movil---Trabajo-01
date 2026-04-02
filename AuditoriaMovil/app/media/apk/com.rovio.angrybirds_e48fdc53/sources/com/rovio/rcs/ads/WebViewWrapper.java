package com.rovio.rcs.ads;

import android.content.Intent;
import android.util.Log;
import com.rovio.fusion.Globals;
import com.rovio.fusion.IActivityListener;
import com.rovio.rcs.ads.WebViewAd;
import java.nio.charset.StandardCharsets;
/* loaded from: classes4.dex */
public class WebViewWrapper implements IActivityListener, WebViewAd.WebViewAdListener {
    static final String TAG = "WebViewWrapper";
    private long a;
    private WebViewAd b;

    /* JADX INFO: Access modifiers changed from: private */
    public native void linkClickedCallback(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void rovioTrackEvent(long j, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void urlLoadedCallback(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void videoEnded(long j, String str, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public native void videoStarted(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void viewCollapsedCallback(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void viewExpandedCallback(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void viewHiddenCallback(long j);

    public WebViewWrapper(long j) {
        this.a = j;
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                WebViewWrapper.this.b = new WebViewAd(WebViewWrapper.this, Globals.getActivity(), Globals.getRootViewGroup());
            }
        });
    }

    public void setGeometry(final int i, final int i2, final int i3, final int i4) {
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                WebViewWrapper.this.b.a(i, i2, i3, i4);
            }
        });
    }

    public void setScale(final float f) {
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                WebViewWrapper.this.b.a(f);
            }
        });
    }

    public void setUIProperties(final String str) {
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                WebViewWrapper.this.b.a(str);
            }
        });
    }

    public void setRichMediaStandard(final String str) {
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.5
            @Override // java.lang.Runnable
            public void run() {
                WebViewWrapper.this.b.b(str);
            }
        });
    }

    public void destroy() {
        this.a = 0L;
        Globals.unregisterActivityListener(this);
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.6
            @Override // java.lang.Runnable
            public void run() {
                WebViewWrapper.this.b.b();
            }
        });
    }

    public void loadUrl(final String str) {
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    WebViewWrapper.this.b.c(str);
                } catch (Throwable th) {
                    if (th != null) {
                        Log.e(WebViewWrapper.TAG, th.getMessage());
                    }
                    WebViewWrapper.this.onUrlLoaded(false);
                }
            }
        });
    }

    public void loadHtml(final byte[] bArr) {
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    WebViewWrapper.this.b.d(new String(bArr, StandardCharsets.UTF_8));
                } catch (Throwable th) {
                    if (th != null) {
                        Log.e(WebViewWrapper.TAG, th.getMessage());
                    }
                    WebViewWrapper.this.onUrlLoaded(false);
                }
            }
        });
    }

    public void reload() {
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.9
            @Override // java.lang.Runnable
            public void run() {
                WebViewWrapper.this.b.c();
            }
        });
    }

    public void show() {
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.10
            @Override // java.lang.Runnable
            public void run() {
                WebViewWrapper.this.b.d();
            }
        });
    }

    public void hide(final boolean z) {
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.11
            @Override // java.lang.Runnable
            public void run() {
                WebViewWrapper.this.b.a(z);
            }
        });
    }

    public void asyncExecuteJavaScript(final String str) {
        a(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.12
            @Override // java.lang.Runnable
            public void run() {
                WebViewWrapper.this.b.e(str);
            }
        });
    }

    private void a(Runnable runnable) {
        Globals.getActivity().runOnUiThread(runnable);
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onResume() {
        this.b.e();
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

    @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
    public void onUrlLoaded(final boolean z) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.13
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != 0) {
                    WebViewWrapper.this.urlLoadedCallback(WebViewWrapper.this.a, z);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
    public void onLinkClicked(final String str) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.14
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != 0) {
                    WebViewWrapper.this.linkClickedCallback(WebViewWrapper.this.a, str);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
    public void onRovioTrackEvent(final String str, final String str2) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.15
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != 0) {
                    WebViewWrapper.this.rovioTrackEvent(WebViewWrapper.this.a, str, str2);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
    public void onVideoEnded(final String str, final float f) {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.16
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != 0) {
                    WebViewWrapper.this.videoEnded(WebViewWrapper.this.a, str, f);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
    public void onVideoStarted() {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.17
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != 0) {
                    WebViewWrapper.this.videoStarted(WebViewWrapper.this.a);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
    public void onViewVisible() {
    }

    @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
    public void onViewHidden() {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.18
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != 0) {
                    WebViewWrapper.this.viewHiddenCallback(WebViewWrapper.this.a);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
    public void onViewExpanded() {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.19
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != 0) {
                    WebViewWrapper.this.viewExpandedCallback(WebViewWrapper.this.a);
                }
            }
        });
    }

    @Override // com.rovio.rcs.ads.WebViewAd.WebViewAdListener
    public void onViewCollapsed() {
        Globals.runOnAppThread(new Runnable() { // from class: com.rovio.rcs.ads.WebViewWrapper.20
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewWrapper.this.a != 0) {
                    WebViewWrapper.this.viewCollapsedCallback(WebViewWrapper.this.a);
                }
            }
        });
    }
}
