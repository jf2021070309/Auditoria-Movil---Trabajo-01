package com.kwad.components.ad.k;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.core.webview.a.c;
/* loaded from: classes.dex */
public final class a {
    private KsAdWebView GX;
    private boolean GY;
    private boolean GZ;
    protected AdBaseFrameLayout Ha;
    private InterfaceC0160a Hb;
    private b Hf;
    private com.kwad.sdk.core.webview.d.a.a cH;
    private FrameLayout cQ;
    private AdBaseFrameLayout dr;
    private c.a jZ;
    private Activity mActivity;
    private AdTemplate mAdTemplate;
    private ImageView mBackIcon;
    private long mLastDown;
    private boolean GW = true;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean Hc = false;
    private boolean Hd = false;
    private boolean He = false;

    /* renamed from: com.kwad.components.ad.k.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0160a {
        void S(boolean z);
    }

    /* loaded from: classes.dex */
    public interface b {
        void iC();
    }

    static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.Hd = true;
        return true;
    }

    static /* synthetic */ boolean b(a aVar, boolean z) {
        aVar.GW = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bv() {
        return this.He ? !this.GW : (this.GW || this.Hc || this.Hd) ? false : true;
    }

    static /* synthetic */ boolean c(a aVar, boolean z) {
        aVar.Hc = true;
        return true;
    }

    static /* synthetic */ boolean d(a aVar, boolean z) {
        aVar.GY = true;
        return true;
    }

    private KsAdWebView.d dd() {
        return new KsAdWebView.d() { // from class: com.kwad.components.ad.k.a.3
            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageFinished() {
                if (a.this.Hb != null) {
                    a.this.Hb.S(a.this.bv());
                }
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageStart() {
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onReceivedHttpError(int i, String str, String str2) {
                a.b(a.this, true);
                if (a.this.Hb != null) {
                    a.this.Hb.S(a.this.bv());
                }
            }
        };
    }

    private void fC() {
        this.cQ.removeAllViews();
        this.cQ.setVisibility(4);
        this.Ha = (AdBaseFrameLayout) ((ViewGroup) com.kwad.sdk.d.a.a.a((ViewGroup) this.cQ, R.layout.ksad_ad_landingpage_layout, true)).findViewById(R.id.ksad_web_card_frame);
        KsAdWebView ksAdWebView = (KsAdWebView) this.cQ.findViewById(R.id.ksad_web_card_webView);
        this.GX = ksAdWebView;
        ksAdWebView.setBackgroundColor(-1);
        z.b bVar = new z.b();
        bVar.atp = 1;
        c.a b2 = this.GX.getClientConfig().bk(false).bm(true).bl(false).b(bVar).cC(this.mAdTemplate).a(lX()).b(dd());
        this.jZ = b2;
        this.GX.setClientConfig(b2);
        this.GX.setDownloadListener(new DownloadListener() { // from class: com.kwad.components.ad.k.a.1
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                a.a(a.this, true);
                if (a.this.Hb != null) {
                    a.this.Hb.S(a.this.bv());
                }
            }
        });
        ImageView imageView = (ImageView) this.Ha.findViewById(R.id.ksad_end_close_btn);
        this.mBackIcon = imageView;
        imageView.setVisibility(8);
        this.mBackIcon.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.k.a.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (a.this.Hf != null) {
                    a.this.Hf.iC();
                }
            }
        });
    }

    private KsAdWebView.b lX() {
        return new KsAdWebView.b() { // from class: com.kwad.components.ad.k.a.4
            @Override // com.kwad.sdk.core.webview.KsAdWebView.b
            public final void onFailed() {
                a.c(a.this, true);
                if (a.this.Hb != null) {
                    a.this.Hb.S(a.this.bv());
                }
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.b
            public final void onSuccess() {
                a.c(a.this, true);
                if (a.this.Hb != null) {
                    a.this.Hb.S(a.this.bv());
                }
            }
        };
    }

    private boolean lY() {
        if (!bv()) {
            FrameLayout frameLayout = this.cQ;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            return false;
        }
        FrameLayout frameLayout2 = this.cQ;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
            return true;
        }
        return true;
    }

    private static String q(AdTemplate adTemplate) {
        return com.kwad.sdk.core.response.b.a.aK(d.ck(adTemplate));
    }

    public final void a(FrameLayout frameLayout, AdBaseFrameLayout adBaseFrameLayout, AdTemplate adTemplate) {
        this.cQ = frameLayout;
        this.dr = adBaseFrameLayout;
        this.mAdTemplate = adTemplate;
        fC();
        this.GW = false;
    }

    public final void a(InterfaceC0160a interfaceC0160a) {
        this.Hb = interfaceC0160a;
    }

    public final void a(b bVar) {
        this.Hf = bVar;
    }

    public final void a(com.kwad.sdk.core.webview.d.a.a aVar) {
        this.cH = aVar;
    }

    public final a ag(boolean z) {
        this.GZ = z;
        return this;
    }

    public final boolean ap() {
        boolean lY = lY();
        this.He = true;
        if (lY && this.mActivity != null) {
            if (this.GX.getClientConfig() != null) {
                this.GX.getClientConfig().bk(true);
                this.GX.getClientConfig().bl(true);
            }
            this.Ha.a(new View.OnTouchListener() { // from class: com.kwad.components.ad.k.a.5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getX() > a.this.mBackIcon.getX() && motionEvent.getX() - a.this.mBackIcon.getX() < a.this.mBackIcon.getWidth() && motionEvent.getY() > a.this.mBackIcon.getY() && motionEvent.getY() - a.this.mBackIcon.getY() < a.this.mBackIcon.getHeight()) {
                        com.kwad.sdk.core.e.c.d("LandingPageWebCard", "onClick backIcon");
                        return false;
                    }
                    if (motionEvent.getAction() == 0) {
                        a.this.mLastDown = SystemClock.elapsedRealtime();
                    } else if (motionEvent.getAction() == 1) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.mLastDown;
                        if (a.this.mLastDown > 0 && elapsedRealtime > 30 && elapsedRealtime < 500) {
                            com.kwad.sdk.core.report.a.a(a.this.mAdTemplate, 155, a.this.dr.getTouchCoords());
                            if (!a.this.GY) {
                                a.d(a.this, true);
                                if (a.this.cH != null) {
                                    com.kwad.sdk.core.webview.d.b.a aVar = new com.kwad.sdk.core.webview.d.b.a();
                                    aVar.Vc = 3;
                                    a.this.cH.a(aVar);
                                }
                            }
                        }
                        a.this.mLastDown = 0L;
                    }
                    return false;
                }
            });
            long ae = com.kwad.sdk.core.response.b.a.ae(d.ck(this.mAdTemplate));
            if (ae == 0 || !this.GZ) {
                this.mBackIcon.setVisibility(0);
            } else {
                this.mHandler.postDelayed(new Runnable() { // from class: com.kwad.components.ad.k.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (a.this.mActivity == null || a.this.mActivity.isFinishing()) {
                            return;
                        }
                        a.this.mBackIcon.setVisibility(0);
                        a.this.mBackIcon.setAlpha(0.0f);
                        a.this.mBackIcon.animate().alpha(1.0f).setDuration(500L).start();
                    }
                }, ae);
            }
            KsAdWebView ksAdWebView = this.GX;
            if (ksAdWebView != null) {
                ksAdWebView.onActivityCreate();
            }
        }
        return lY;
    }

    public final void aw() {
        this.cQ.setVisibility(4);
        String q = q(this.mAdTemplate);
        if (TextUtils.isEmpty(q)) {
            return;
        }
        this.GX.loadUrl(q);
    }

    public final void setActivity(Activity activity) {
        this.mActivity = activity;
    }
}
