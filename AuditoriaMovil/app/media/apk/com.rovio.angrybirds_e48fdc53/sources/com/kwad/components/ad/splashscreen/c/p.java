package com.kwad.components.ad.splashscreen.c;

import android.content.Context;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.renderscript.ScriptIntrinsicBLAS;
import com.kwad.components.ad.splashscreen.h;
import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.ar;
import com.kwad.components.core.webview.jshandler.as;
import com.kwad.components.core.webview.jshandler.r;
import com.kwad.components.core.webview.jshandler.u;
import com.kwad.components.core.webview.jshandler.x;
import com.kwad.sdk.R;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.utils.bj;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class p extends e implements com.kwad.components.ad.splashscreen.e, com.kwad.components.ad.splashscreen.g {
    private com.kwad.components.ad.splashscreen.f.b DM;
    private boolean DN;
    private long DP;
    private ap DQ;
    private ViewGroup DS;
    private KsAdWebView cB;
    private com.kwad.components.core.webview.a cD;
    private com.kwad.sdk.core.webview.b cE;
    private com.kwad.sdk.core.g.d dO;
    private Vibrator dP;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private long mStartTime;
    private boolean DO = false;
    private boolean DR = false;
    private final Runnable DT = new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.p.1
        @Override // java.lang.Runnable
        public final void run() {
            p.a(p.this, true);
            com.kwad.components.ad.splashscreen.monitor.b.a(com.kwad.sdk.core.response.b.b.aX(p.this.mAdTemplate), SystemClock.elapsedRealtime() - p.this.DP, 1, "");
            p.this.lv();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public Vibrator F(Context context) {
        if (context != null) {
            return (Vibrator) getContext().getSystemService("vibrator");
        }
        return null;
    }

    private void a(WebView webView, String str) {
        ay();
        webView.getSettings().setAllowFileAccess(true);
        com.kwad.components.core.webview.a aVar = new com.kwad.components.core.webview.a(webView);
        this.cD = aVar;
        a(aVar, str);
        webView.addJavascriptInterface(this.cD, "KwaiAd");
    }

    private void a(com.kwad.components.core.webview.a aVar, final String str) {
        aVar.a(new as(this.cE, this.CS.mApkDownloadHelper));
        aVar.a(dv());
        aVar.a(du());
        aVar.a(new x(this.cE));
        aVar.a(new com.kwad.components.core.webview.b.a.f());
        aVar.a(new ak(new ak.b() { // from class: com.kwad.components.ad.splashscreen.c.p.7
            @Override // com.kwad.components.core.webview.jshandler.ak.b
            public final void a(ak.a aVar2) {
                com.kwad.sdk.core.e.c.d("SplashWebViewPresenter", "updatePageStatus: " + aVar2);
                bj.b(p.this.DT);
                if (aVar2.status != 1) {
                    com.kwad.components.ad.splashscreen.monitor.b.a(str, SystemClock.elapsedRealtime() - p.this.DP, 3, "");
                    p.this.lv();
                    return;
                }
                p.this.CS.Cy = SystemClock.elapsedRealtime() - p.this.mStartTime;
                if (p.this.DR) {
                    p.this.CS.isWebTimeout = true;
                } else if (p.this.DQ != null) {
                    p.this.DQ.rC();
                    p.this.DQ.rD();
                }
                if (com.kwad.sdk.core.response.b.b.m19do(p.this.mAdInfo)) {
                    p.this.lu();
                }
            }
        }, str));
        aVar.a(new ar(new ar.a() { // from class: com.kwad.components.ad.splashscreen.c.p.8
            @Override // com.kwad.components.core.webview.jshandler.ar.a
            public final void bA() {
                p.this.bs();
            }
        }));
        aVar.a(new ae(this.cE));
        ap apVar = new ap();
        this.DQ = apVar;
        aVar.a(apVar);
    }

    private void a(KsAdWebView ksAdWebView, final String str) {
        ksAdWebView.setBackgroundColor(0);
        ksAdWebView.setVisibility(0);
        av();
        a((WebView) ksAdWebView, str);
        ksAdWebView.setClientConfig(ksAdWebView.getClientConfig().cC(this.CS.mAdTemplate).b(new com.kwad.sdk.core.webview.f() { // from class: com.kwad.components.ad.splashscreen.c.p.6
            @Override // com.kwad.sdk.core.webview.f, com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageFinished() {
                super.onPageFinished();
                com.kwad.components.ad.splashscreen.monitor.b.d(str, SystemClock.elapsedRealtime() - p.this.DP);
            }

            @Override // com.kwad.sdk.core.webview.f, com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onReceivedHttpError(int i, String str2, String str3) {
                super.onReceivedHttpError(i, str2, str3);
                bj.b(p.this.DT);
                p.this.lv();
                com.kwad.components.ad.splashscreen.monitor.b.a(str, SystemClock.elapsedRealtime() - p.this.DP, 2, str2);
            }
        }));
        com.kwad.components.ad.splashscreen.monitor.b.Y(str);
        if (!com.kwad.sdk.core.config.d.a(com.kwad.components.ad.splashscreen.b.a.CF)) {
            ksAdWebView.loadUrl(str);
            return;
        }
        try {
            ksAdWebView.loadUrl(str);
        } catch (Throwable th) {
            lv();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r9, int r10, com.kwad.sdk.core.report.z.b r11, int r12) {
        /*
            r8 = this;
            com.kwad.components.ad.splashscreen.h r0 = r8.CS
            r0.kG()
            r0 = 0
            r1 = 1
            if (r11 == 0) goto Lb
            r2 = r1
            goto Lc
        Lb:
            r2 = r0
        Lc:
            if (r10 != r1) goto L10
            r3 = r1
            goto L11
        L10:
            r3 = r0
        L11:
            if (r2 != 0) goto L51
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            com.kwad.components.ad.splashscreen.h r5 = r8.CS     // Catch: org.json.JSONException -> L4b
            if (r5 == 0) goto L51
            com.kwad.components.ad.splashscreen.h r5 = r8.CS     // Catch: org.json.JSONException -> L4b
            com.kwad.components.ad.splashscreen.e.a r5 = r5.Ch     // Catch: org.json.JSONException -> L4b
            if (r5 == 0) goto L2f
            java.lang.String r5 = "duration"
            com.kwad.components.ad.splashscreen.h r6 = r8.CS     // Catch: org.json.JSONException -> L4b
            com.kwad.components.ad.splashscreen.e.a r6 = r6.Ch     // Catch: org.json.JSONException -> L4b
            long r6 = r6.getCurrentPosition()     // Catch: org.json.JSONException -> L4b
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L4b
        L2f:
            if (r9 == 0) goto L34
            r0 = 153(0x99, float:2.14E-43)
            goto L38
        L34:
            if (r3 == 0) goto L38
            r0 = 132(0x84, float:1.85E-43)
        L38:
            com.kwad.sdk.core.report.j r9 = new com.kwad.sdk.core.report.j     // Catch: org.json.JSONException -> L49
            r9.<init>()     // Catch: org.json.JSONException -> L49
            com.kwad.sdk.core.report.j r9 = r9.cg(r0)     // Catch: org.json.JSONException -> L49
            com.kwad.components.ad.splashscreen.h r5 = r8.CS     // Catch: org.json.JSONException -> L49
            com.kwad.sdk.core.response.model.AdTemplate r5 = r5.mAdTemplate     // Catch: org.json.JSONException -> L49
            com.kwad.sdk.core.report.a.a(r5, r9, r4)     // Catch: org.json.JSONException -> L49
            goto L52
        L49:
            r9 = move-exception
            goto L4d
        L4b:
            r9 = move-exception
            r0 = r12
        L4d:
            com.kwad.sdk.core.e.c.printStackTrace(r9)
            goto L52
        L51:
            r0 = r12
        L52:
            com.kwad.components.core.e.d.a$a r9 = new com.kwad.components.core.e.d.a$a
            com.kwad.components.ad.splashscreen.h r4 = r8.CS
            com.kwad.sdk.core.view.AdBaseFrameLayout r4 = r4.mRootContainer
            android.content.Context r4 = r4.getContext()
            r9.<init>(r4)
            com.kwad.components.ad.splashscreen.h r4 = r8.CS
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.mAdTemplate
            com.kwad.components.core.e.d.a$a r9 = r9.S(r4)
            com.kwad.components.ad.splashscreen.h r4 = r8.CS
            com.kwad.components.core.e.d.c r4 = r4.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r9 = r9.b(r4)
            com.kwad.components.core.e.d.a$a r9 = r9.al(r3)
            com.kwad.components.core.e.d.a$a r9 = r9.ao(r10)
            com.kwad.components.core.e.d.a$a r9 = r9.a(r11)
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r12 = r0
        L7f:
            com.kwad.components.core.e.d.a$a r9 = r9.an(r12)
            com.kwad.components.core.e.d.a$a r9 = r9.am(r1)
            com.kwad.components.core.e.d.a$a r9 = r9.an(r2)
            com.kwad.components.ad.splashscreen.c.p$5 r10 = new com.kwad.components.ad.splashscreen.c.p$5
            r10.<init>()
            com.kwad.components.core.e.d.a$a r9 = r9.a(r10)
            com.kwad.components.core.e.d.a.a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.splashscreen.c.p.a(boolean, int, com.kwad.sdk.core.report.z$b, int):void");
    }

    static /* synthetic */ boolean a(p pVar, boolean z) {
        pVar.DR = true;
        return true;
    }

    private void av() {
        com.kwad.sdk.core.webview.b bVar = new com.kwad.sdk.core.webview.b();
        this.cE = bVar;
        bVar.setAdTemplate(this.mAdTemplate);
        this.cE.mScreenOrientation = 0;
        this.cE.aym = this.CS.mRootContainer;
        this.cE.MZ = this.CS.mRootContainer;
        this.cE.My = this.cB;
        this.cE.mReportExtData = null;
        this.cE.ayo = false;
        this.cE.ayp = com.kwad.components.ad.splashscreen.h.m(this.mAdInfo);
    }

    private void ay() {
        com.kwad.components.core.webview.a aVar = this.cD;
        if (aVar != null) {
            aVar.destroy();
            this.cD = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        if (this.dO != null || this.DO) {
            return;
        }
        com.kwad.sdk.core.g.d dVar = new com.kwad.sdk.core.g.d(com.kwad.sdk.core.response.b.b.bH(this.CS.mAdTemplate));
        this.dO = dVar;
        dVar.a(new com.kwad.sdk.core.g.b() { // from class: com.kwad.components.ad.splashscreen.c.p.9
            @Override // com.kwad.sdk.core.g.b
            public final void a(double d) {
                boolean nd = com.kwad.components.core.e.c.b.nd();
                if (!p.this.CS.Cj.sE() || nd) {
                    p.this.lt();
                    return;
                }
                p.this.h(d);
                p.this.lt();
                if (p.this.dP == null) {
                    p pVar = p.this;
                    pVar.dP = pVar.F(pVar.getContext());
                }
                bj.a(p.this.getContext(), p.this.dP);
            }

            @Override // com.kwad.sdk.core.g.b
            public final void aT() {
            }
        });
        this.dO.bi(getContext());
    }

    private r du() {
        return new r(this.cE, this.CS.mApkDownloadHelper, new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.splashscreen.c.p.3
            @Override // com.kwad.sdk.core.webview.d.a.a
            public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
                if (com.kwad.sdk.d.a.a.yA()) {
                    return;
                }
                if (aVar.Ej() || com.kwad.components.ad.splashscreen.h.m(p.this.mAdInfo)) {
                    z.b bVar = new z.b();
                    bVar.US = aVar.Vd.US;
                    p.this.a(false, aVar.Vc, bVar, aVar.jI);
                }
            }
        });
    }

    private u dv() {
        return new u(this.cE, this.CS.mApkDownloadHelper, new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.splashscreen.c.p.4
            @Override // com.kwad.sdk.core.webview.d.a.a
            public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
                if (aVar.Va || !com.kwad.components.ad.splashscreen.h.m(p.this.mAdInfo)) {
                    p.this.a(false, aVar.Va ? 1 : 3, null, aVar.jI);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(final double d) {
        if (this.CS != null) {
            this.CS.a(1, getContext(), 157, 2, new h.a() { // from class: com.kwad.components.ad.splashscreen.c.p.11
                @Override // com.kwad.components.ad.splashscreen.h.a
                public final void b(com.kwad.sdk.core.report.j jVar) {
                    jVar.i(d);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lt() {
        bj.a(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.p.10
            @Override // java.lang.Runnable
            public final void run() {
                p.this.dO.CF();
            }
        }, null, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lv() {
        Runnable runnable;
        this.DO = true;
        KsAdWebView ksAdWebView = this.cB;
        if (ksAdWebView != null) {
            ksAdWebView.setVisibility(8);
        }
        ViewGroup viewGroup = this.DS;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        if (com.kwad.sdk.core.response.b.b.dg(this.mAdInfo)) {
            runnable = new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.p.12
                @Override // java.lang.Runnable
                public final void run() {
                    p.this.a((Presenter) new m(), true);
                }
            };
        } else if (com.kwad.sdk.core.response.b.b.di(this.mAdInfo)) {
            runnable = new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.p.13
                @Override // java.lang.Runnable
                public final void run() {
                    p.this.a((Presenter) new l(), true);
                }
            };
        } else if (!com.kwad.sdk.core.response.b.b.dl(this.mAdInfo)) {
            lw();
            return;
        } else {
            runnable = new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.p.2
                @Override // java.lang.Runnable
                public final void run() {
                    p.this.a((Presenter) new n(), true);
                }
            };
        }
        bj.postOnUiThread(runnable);
    }

    private void lw() {
        lu();
        boolean bZ = com.kwad.sdk.core.response.b.c.bZ(this.mAdTemplate);
        com.kwad.components.ad.splashscreen.f.b bVar = new com.kwad.components.ad.splashscreen.f.b((ViewGroup) getRootView(), (ViewStub) findViewById(R.id.ksad_splash_actionbar_native_stub), bZ, this.CS.mApkDownloadHelper);
        this.DM = bVar;
        bVar.J(this.mAdTemplate);
        this.DM.a(this);
        this.DM.lv();
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void X(int i) {
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.mStartTime = SystemClock.elapsedRealtime();
        if (com.kwad.sdk.core.config.d.a(com.kwad.components.ad.splashscreen.b.a.CF)) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ksad_splash_webview_container);
            this.DS = viewGroup;
            viewGroup.setVisibility(0);
            try {
                this.cB = new KsAdWebView(getContext());
                this.cB.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.DS.addView(this.cB);
            } catch (Throwable th) {
            }
        } else {
            this.cB = (KsAdWebView) findViewById(R.id.ksad_splash_web_card_webView);
        }
        AdTemplate adTemplate = this.CS.mAdTemplate;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.DN = false;
        this.DO = false;
        String aX = com.kwad.sdk.core.response.b.b.aX(this.mAdTemplate);
        if (this.cB == null || TextUtils.isEmpty(aX) || this.CS.Cn) {
            lv();
        } else {
            this.DP = SystemClock.elapsedRealtime();
            com.kwad.components.ad.splashscreen.monitor.b.kR();
            a(this.cB, aX);
            bj.a(this.DT, null, com.kwad.sdk.core.response.b.b.dq(this.mAdInfo));
        }
        this.CS.a(this);
    }

    @Override // com.kwad.components.ad.splashscreen.e
    public final void f(boolean z, boolean z2) {
        com.kwad.sdk.core.e.c.d("SplashWebViewPresenter", "isClick: " + z + ", isActionBar: " + z2);
        a(!z, z2 ? 1 : 2, null, ScriptIntrinsicBLAS.UNIT);
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void kF() {
        com.kwad.sdk.core.g.d dVar = this.dO;
        if (dVar != null) {
            dVar.bj(getContext());
        }
    }

    public final void lu() {
        if (this.DN) {
            return;
        }
        this.DN = true;
        z.b bVar = new z.b();
        z.a aVar = new z.a();
        aVar.asQ = com.kwad.components.ad.splashscreen.local.b.q(this.mAdInfo);
        bVar.atA = aVar;
        com.kwad.sdk.core.report.a.a(this.CS.mAdTemplate, 123, bVar, (JSONObject) null);
        com.kwad.components.core.webview.b.d.a.se().aR(123);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.ad.splashscreen.f.b bVar = this.DM;
        if (bVar != null) {
            bVar.onUnbind();
        }
        com.kwad.sdk.core.g.d dVar = this.dO;
        if (dVar != null) {
            dVar.bj(getContext());
        }
        ap apVar = this.DQ;
        if (apVar != null) {
            apVar.rE();
            this.DQ.rF();
        }
        ay();
    }
}
