package com.kwad.components.core.page.b.a;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import com.kwad.components.core.webview.b;
import com.kwad.components.core.webview.b.b.k;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.an;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.av;
import com.kwad.sdk.R;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class g extends a {
    private ap ND;
    private an NE;
    private com.kwad.components.core.webview.b fG;
    private KsAdWebView mAdWebView;
    private boolean NC = false;
    private final com.kwad.sdk.core.c.c xn = new com.kwad.sdk.core.c.d() { // from class: com.kwad.components.core.page.b.a.g.1
        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
        /* renamed from: onActivityDestroyed */
        public final void d(Activity activity) {
            super.d(activity);
            if (g.this.mAdWebView == null || g.this.getActivity() == null || !g.this.getActivity().equals(activity)) {
                return;
            }
            g.this.mAdWebView.onActivityDestroy();
            g.a(g.this, (KsAdWebView) null);
        }

        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
        /* renamed from: onActivityPaused */
        public final void b(Activity activity) {
            super.b(activity);
            g.this.hide();
        }

        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
        /* renamed from: onActivityResumed */
        public final void c(Activity activity) {
            super.c(activity);
            g.this.show();
        }
    };
    private an.b Ng = new an.b() { // from class: com.kwad.components.core.page.b.a.g.2
        @Override // com.kwad.components.core.webview.jshandler.an.b
        public final void oZ() {
            if (g.this.NE != null) {
                g.this.NE.rB();
            }
        }
    };
    private com.kwad.components.core.webview.c fH = new com.kwad.components.core.webview.c() { // from class: com.kwad.components.core.page.b.a.g.3
        @Override // com.kwad.components.core.webview.c
        public final void a(com.kwad.components.core.webview.a aVar, com.kwad.sdk.core.webview.b bVar) {
            aVar.a(new av(new av.b() { // from class: com.kwad.components.core.page.b.a.g.3.1
                @Override // com.kwad.components.core.webview.jshandler.av.b
                public final void a(av.a aVar2) {
                    if (g.this.Nc.Nf == null || aVar2 == null) {
                        return;
                    }
                    g.this.Nc.Nf.ay(aVar2.visibility);
                }
            }));
            g.this.NE = new an(new an.c() { // from class: com.kwad.components.core.page.b.a.g.3.2
                @Override // com.kwad.components.core.webview.jshandler.an.c
                public final void pc() {
                    g.this.Nc.a(g.this.Ng);
                }
            });
            aVar.a(g.this.NE);
            aVar.a(new com.kwad.components.core.webview.b.a.b(bVar, g.this.Nc.mAdTemplate));
            k kVar = new k();
            kVar.Xe = g.this.Nc.mAutoShow ? 1 : 0;
            aVar.a(new com.kwad.components.core.webview.b.a.g(kVar));
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(ak.a aVar) {
            g.this.Nc.Nh = aVar.isSuccess();
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(ap apVar) {
            g.this.ND = apVar;
        }

        @Override // com.kwad.components.core.webview.c
        public final void b(WebCloseStatus webCloseStatus) {
            if (g.this.Nc.mWebCardCloseListener != null) {
                g.this.Nc.mWebCardCloseListener.a(webCloseStatus);
            }
        }

        @Override // com.kwad.components.core.webview.c
        public final void by() {
            g.this.NC = false;
        }

        @Override // com.kwad.components.core.webview.c
        public final void onPageFinished() {
            g.this.NC = true;
            if (g.this.Nc.oO()) {
                g.this.show();
            }
        }

        @Override // com.kwad.components.core.webview.c
        public final boolean pa() {
            return true;
        }

        @Override // com.kwad.components.core.webview.c
        public final boolean pb() {
            return true;
        }
    };

    static /* synthetic */ KsAdWebView a(g gVar, KsAdWebView ksAdWebView) {
        gVar.mAdWebView = null;
        return null;
    }

    private void eM() {
        this.fG = new com.kwad.components.core.webview.b();
        this.fG.a(new b.a().aa(this.Nc.mAdTemplate).aE(this.Nc.mPageUrl).d(this.mAdWebView).k(this.Nc.gi).a(this.fH).b(this.Nc.Ne));
        oY();
        this.mAdWebView.loadUrl(this.Nc.mPageUrl);
        this.mAdWebView.onActivityCreate();
    }

    private void oY() {
        KsAdWebView ksAdWebView;
        this.mAdWebView.setClientConfig(this.mAdWebView.getClientConfig().bm(true).cC(this.Nc.mAdTemplate).bk(false));
        if (com.kwad.sdk.core.response.b.a.bw(com.kwad.sdk.core.response.b.d.ck(this.Nc.mAdTemplate)) > 0) {
            bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.core.page.b.a.g.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (g.this.mAdWebView != null) {
                        g.this.mAdWebView.getClientConfig().bk(true);
                    }
                }
            }, com.kwad.sdk.core.response.b.a.bw(com.kwad.sdk.core.response.b.d.ck(this.Nc.mAdTemplate)));
        } else if (com.kwad.sdk.core.response.b.a.bw(com.kwad.sdk.core.response.b.d.ck(this.Nc.mAdTemplate)) == 0 && (ksAdWebView = this.mAdWebView) != null) {
            ksAdWebView.getClientConfig().bk(true);
        }
        if (com.kwad.sdk.core.response.b.a.bZ(com.kwad.sdk.core.response.b.d.ck(this.Nc.mAdTemplate)) > 0) {
            this.mAdWebView.getClientConfig().bk(this.Nc.mAdTemplate.converted);
        }
        this.mAdWebView.setOnTouchListener(new View.OnTouchListener() { // from class: com.kwad.components.core.page.b.a.g.5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    g.this.mAdWebView.getClientConfig().bk(true);
                    return false;
                }
                return false;
            }
        });
    }

    @Override // com.kwad.components.core.page.b.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        eM();
        com.kwad.sdk.core.c.b.AT();
        com.kwad.sdk.core.c.b.a(this.xn);
    }

    public final void hide() {
        ap apVar = this.ND;
        if (apVar != null) {
            apVar.rE();
        }
        if (this.Nc.mAdWebView != null) {
            this.Nc.mAdWebView.setVisibility(8);
        }
        ap apVar2 = this.ND;
        if (apVar2 != null) {
            apVar2.rF();
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.mAdWebView = (KsAdWebView) findViewById(R.id.ksad_video_webview);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.fG.jx();
        com.kwad.sdk.core.c.b.AT();
        com.kwad.sdk.core.c.b.b(this.xn);
    }

    public final void show() {
        if (this.NC) {
            ap apVar = this.ND;
            if (apVar != null) {
                apVar.rC();
            }
            try {
                if (this.Nc.mAdWebView != null) {
                    this.Nc.mAdWebView.setVisibility(0);
                }
            } catch (Exception e) {
                com.kwad.components.core.d.a.b(e);
            }
            ap apVar2 = this.ND;
            if (apVar2 != null) {
                apVar2.rD();
            }
        }
    }
}
