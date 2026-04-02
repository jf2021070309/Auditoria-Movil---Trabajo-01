package com.fyber.inneractive.sdk.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.fyber.inneractive.mraidkit.R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.m.c;
import com.fyber.inneractive.sdk.m.d;
import com.fyber.inneractive.sdk.mraid.w;
import com.fyber.inneractive.sdk.mraid.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.m;
/* loaded from: classes.dex */
public class IAmraidWebViewController extends d<d.c> {
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private d.EnumC0045d K;
    private final Runnable L;
    private final Runnable M;
    public boolean a;

    public IAmraidWebViewController(Context context, boolean z, d.EnumC0045d enumC0045d, int i, int i2, boolean z2) {
        super(context, z, enumC0045d, i, i2);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = true;
        this.J = false;
        this.L = new Runnable() { // from class: com.fyber.inneractive.sdk.ui.IAmraidWebViewController.1
            @Override // java.lang.Runnable
            public final void run() {
                if (IAmraidWebViewController.this.c != null) {
                    IAmraidWebViewController.this.c.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.fyber.inneractive.sdk.ui.IAmraidWebViewController.1.1
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public final boolean onPreDraw() {
                            if (IAmraidWebViewController.this.c != null) {
                                IAmraidWebViewController.this.c.getViewTreeObserver().removeOnPreDrawListener(this);
                                IAmraidWebViewController.this.a();
                                IAmraidWebViewController.this.a(new w(IAmraidWebViewController.this.K));
                                if (IAmraidWebViewController.this.K == d.EnumC0045d.INTERSTITIAL) {
                                    IAmraidWebViewController.this.b("showInterstitial();");
                                }
                                IAmraidWebViewController.this.w();
                                IAmraidWebViewController iAmraidWebViewController = IAmraidWebViewController.this;
                                iAmraidWebViewController.b(iAmraidWebViewController.v());
                                IAmraidWebViewController.this.z();
                                return false;
                            }
                            return false;
                        }
                    });
                }
            }
        };
        this.M = new Runnable() { // from class: com.fyber.inneractive.sdk.ui.IAmraidWebViewController.2
            @Override // java.lang.Runnable
            public final void run() {
                if (IAmraidWebViewController.this.c != null) {
                    IAmraidWebViewController.this.c.a("if (FyMraidVideo.getCurrentTime() < 0.2) { var ifr = document.createElement('iframe'); var container = document.body || document.documentElement; container.appendChild(ifr); ifr.setAttribute('sandbox', ''); ifr.setAttribute('style', 'position: fixed; bottom: -20px; border: none; visibility: hidden; height: 20px; z-index: -99999'); ifr.setAttribute('src','FyMraidVideo://fyMraidVideoAdPlaybackFailure'); console.log('dispatched closure event'); } else { console.log('video has progressed'); };");
                }
            }
        };
        this.a = z2;
        this.c.setId(R.id.inneractive_webview_mraid);
        this.K = enumC0045d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.m.a
    public final String a(String str, String str2, String str3) {
        System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            IAlog.b("loadHtml called with an empty HTML!", new Object[0]);
            return null;
        }
        sb.append("<html><head>");
        sb.append("<link rel=\"icon\" href=\"data:,\">");
        if (this.a) {
            sb.append(l.e("ia_js_load_monitor.txt"));
        }
        sb.append("<script> window.iaPreCachedAd = true; </script>");
        boolean a = IAConfigManager.c().a.a("use_js_inline", false);
        if (a && IAConfigManager.r().a != null) {
            sb.append("<script type=\"text/javascript\">");
            sb.append(IAConfigManager.r().a);
            sb.append("</script>");
        } else {
            sb.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/MRAID-VIDEO.js\"></script>");
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        sb.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script>");
        sb.append("</head>");
        sb.append("<style>body{text-align:center !important;margin:0;padding:0;}");
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
        }
        sb.append("</style>");
        sb.append("<body id=\"iaBody\">");
        if (this.I) {
            if (((d) this).v != null && ((d) this).v.equals(d.EnumC0045d.INTERSTITIAL)) {
                z = true;
            }
            if (z) {
                if (a && IAConfigManager.r().b != null) {
                    sb.append("<style type=\"text/css\">");
                    sb.append(IAConfigManager.r().b);
                    sb.append("</style>");
                } else {
                    sb.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                }
                if (a && IAConfigManager.r().c != null) {
                    sb.append("<script type=\"text/javascript\">");
                    sb.append(IAConfigManager.r().c);
                    sb.append("</script>");
                } else {
                    sb.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                }
            }
        }
        String e = l.e("ia_mraid_bridge.txt");
        sb.append("<div id='iaScriptBr' style='display:none;'>");
        sb.append(e);
        sb.append("</div>");
        if (IAlog.a >= 2) {
            sb.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
        }
        sb.append(str);
        sb.append("</body></html>");
        return sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.m.d, com.fyber.inneractive.sdk.m.a
    public final boolean a(String str, aj ajVar) {
        Uri parse = Uri.parse(str);
        String uri = parse.toString();
        parse.getScheme();
        if (uri.startsWith("iaadfinishedloading")) {
            if (uri.endsWith("success")) {
                IAlog.a("received iaadfinishedloading success", new Object[0]);
                if (!this.b && this.f != null && this.c != null) {
                    this.c.a();
                    this.b = true;
                    n();
                }
            }
            return true;
        }
        return super.a(str, ajVar);
    }

    @Override // com.fyber.inneractive.sdk.m.d
    public final void a(String str) {
        if (this.g != 0) {
            ((d.c) this.g).a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.m.d
    public final void a() {
        super.a();
        boolean a = (this.c == null || this.c.getContext() == null) ? false : k.a(new Intent(this.c.getContext(), InneractiveRichMediaVideoPlayerActivityCore.class));
        z zVar = new z();
        zVar.b = k.j();
        zVar.a = k.k();
        zVar.c = k.m();
        zVar.e = a;
        zVar.d = k.l();
        a(zVar);
    }

    public final void b() {
        if (this.c != null) {
            this.F = true;
            if (Build.VERSION.SDK_INT >= 17 && this.H) {
                this.c.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            m.a().postDelayed(this.L, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.F && this.G && this.H && this.c != null) {
            this.c.a("FyMraidVideo.play()");
            if (this.M != null) {
                m.a().postDelayed(this.M, 5000L);
            }
            if (this.J) {
                this.c.a("FyMraidVideo.mute(true)");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.m.d, com.fyber.inneractive.sdk.m.a, com.fyber.inneractive.sdk.m.b
    public final boolean a(WebView webView, String str) {
        IAlog.b("IAmraidWebViewController: handleUrl = %s", str);
        if (this.c == null) {
            IAlog.b("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        } else if (str != null && str.toLowerCase().startsWith("FyMraidVideo".toLowerCase())) {
            if (!str.toLowerCase().endsWith("fyMraidVideoAd".toLowerCase())) {
                if (str.toLowerCase().endsWith("fyMraidVideoAdPlaybackFailure".toLowerCase())) {
                    IAlog.e("MRAID Video has not started in a timely fashion, showing close button", new Object[0]);
                    if (this.g != 0) {
                        c(false);
                        new n.a(com.fyber.inneractive.sdk.h.l.MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION, this.s, this.t == null ? null : this.t.f(), this.t == null ? null : this.t.i().b()).a("video_timeout_in_msecs", "5000").b(null);
                    }
                    if (this.g != 0) {
                        ((d.c) this.g).a(new MraidVideoFailedToDisplayError("an MRAID video has not started playing in a timely fashion"));
                    }
                }
            } else {
                IAlog.a("Dispatching MRAID Video detection event", new Object[0]);
                new n.a(com.fyber.inneractive.sdk.h.m.MRAID_VIDEO_DETECTED, this.s, this.t == null ? null : this.t.f(), this.t == null ? null : this.t.i().b()).b(null);
                this.G = true;
                z();
            }
            return true;
        } else {
            return super.a(webView, str);
        }
    }

    @Override // com.fyber.inneractive.sdk.m.d, com.fyber.inneractive.sdk.m.a, com.fyber.inneractive.sdk.m.c.a
    public final void a(boolean z) {
        super.a(z);
        if (this.G && this.F && this.H && this.c != null) {
            c cVar = this.c;
            StringBuilder sb = new StringBuilder("FyMraidVideo.");
            sb.append(z ? "play" : "pause");
            sb.append("();");
            cVar.a(sb.toString());
        }
        if (this.c == null || !z) {
            return;
        }
        m.a().post(new Runnable() { // from class: com.fyber.inneractive.sdk.ui.IAmraidWebViewController.3
            @Override // java.lang.Runnable
            public final void run() {
                if (IAmraidWebViewController.this.c != null) {
                    try {
                        IAmraidWebViewController.this.c.invalidate();
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* loaded from: classes.dex */
    public static class MraidVideoFailedToDisplayError extends InneractiveUnitController.AdDisplayError {
        MraidVideoFailedToDisplayError(String str) {
            super(str);
        }
    }

    public void setAutoplayMRAIDVideos(boolean z) {
        this.H = z;
    }

    public void setCenteringTagsRequired(boolean z) {
        this.I = z;
    }

    @Override // com.fyber.inneractive.sdk.m.a
    public final void c() {
        super.c();
        m.a().removeCallbacks(this.M);
        m.a().removeCallbacks(this.L);
    }

    public void setMuteMraidVideo(boolean z) {
        this.J = z;
    }
}
