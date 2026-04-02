package com.kwad.components.ad.h;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.b.m;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.b.h;
import com.kwad.components.core.webview.b.i;
import com.kwad.components.core.webview.b.j;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.r;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.components.l;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public final class d extends KSFrameLayout implements i, com.kwad.sdk.core.h.c {
    public static String og = "PUSH_VIEW_TAG";
    private final com.kwad.components.core.widget.a.b bG;
    private ap cG;
    private h lt;
    private AdTemplate oh;
    private com.kwad.components.ad.b.a.b oi;
    private boolean oj;
    private ViewGroup ok;
    private boolean ol;

    public d(Context context, AdTemplate adTemplate) {
        super(context);
        this.oj = false;
        setTag(og);
        this.oh = adTemplate;
        this.bG = new com.kwad.components.core.widget.a.b(this, 100);
        h hVar = new h(-1L, getContext()) { // from class: com.kwad.components.ad.h.d.1
            {
                super(-1L, r4);
            }

            @Override // com.kwad.components.core.webview.b.h
            public final void a(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, l lVar, ViewGroup viewGroup) {
                super.a(bVar, cVar, lVar, viewGroup);
                lVar.c(new r(bVar, cVar, this) { // from class: com.kwad.components.ad.h.d.1.1
                    @Override // com.kwad.components.core.webview.jshandler.r
                    public final void J(int i) {
                        super.J(i);
                        if (i == 1) {
                            d.this.b((WebCloseStatus) null);
                        }
                    }
                });
            }
        };
        this.lt = hVar;
        hVar.a((Activity) null, this.oh, this);
    }

    private void destroy() {
        this.lt.jx();
        ViewGroup viewGroup = this.ok;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fk() {
        if (this.ol) {
            return;
        }
        this.ol = true;
        fn();
        destroy();
    }

    private void fl() {
        com.kwad.components.ad.b.a.b bVar = this.oi;
        if (bVar != null) {
            bVar.T();
        }
        ap apVar = this.cG;
        if (apVar != null) {
            apVar.rC();
            this.cG.rD();
        }
    }

    private void fn() {
        com.kwad.components.ad.b.a.b bVar = this.oi;
        if (bVar != null) {
            bVar.U();
        }
        ap apVar = this.cG;
        if (apVar != null) {
            apVar.rE();
            this.cG.rF();
        }
    }

    private boolean fo() {
        try {
            com.kwad.sdk.core.c.b.AT();
            final Activity currentActivity = com.kwad.sdk.core.c.b.getCurrentActivity();
            if (currentActivity != null && !currentActivity.isFinishing()) {
                View findViewById = currentActivity.getWindow().getDecorView().findViewById(16908290);
                if (findViewById instanceof ViewGroup) {
                    this.ok = (ViewGroup) findViewById;
                    this.ok.addView(this, new ViewGroup.LayoutParams(-1, -1));
                    com.kwad.sdk.core.c.b.AT();
                    com.kwad.sdk.core.c.b.a(new com.kwad.sdk.core.c.d() { // from class: com.kwad.components.ad.h.d.2
                        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
                        /* renamed from: onActivityDestroyed */
                        public final void d(Activity activity) {
                            super.d(activity);
                            com.kwad.sdk.core.c.b.AT();
                            com.kwad.sdk.core.c.b.b((com.kwad.sdk.core.c.c) this);
                            if (activity.equals(currentActivity)) {
                                d.this.fk();
                            }
                        }
                    });
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
            return false;
        }
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(o oVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(p pVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(t tVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
        com.kwad.sdk.core.e.c.d("PushAdView", "onAdClicked");
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aK() {
        com.kwad.sdk.core.e.c.d("PushAdView", "onPageVisible: ");
        ap apVar = this.cG;
        if (apVar != null) {
            apVar.rG();
        }
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aL() {
        com.kwad.sdk.core.e.c.d("PushAdView", "onPageInvisible: ");
        ap apVar = this.cG;
        if (apVar != null) {
            apVar.rH();
        }
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
        super.aa();
        this.bG.a(this);
        this.bG.sB();
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
        super.ab();
        this.bG.release();
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(m mVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(ap apVar) {
        this.cG = apVar;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        float aJ = com.kwad.sdk.d.a.a.aJ(getContext());
        aVar.width = (int) ((com.kwad.sdk.d.a.a.getScreenWidth(getContext()) / aJ) + 0.5f);
        aVar.height = (int) ((com.kwad.sdk.d.a.a.getScreenHeight(getContext()) / aJ) + 0.5f);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(WebCloseStatus webCloseStatus) {
        fk();
    }

    public final boolean c(com.kwad.components.ad.b.a.b bVar) {
        this.oi = bVar;
        if (this.oj && fo()) {
            fl();
            return true;
        }
        return false;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void cd() {
        com.kwad.sdk.core.e.c.d("PushAdView", "onTkLoadFailed");
        this.oj = false;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void ej() {
        com.kwad.sdk.core.e.c.d("PushAdView", "onTkLoadSuccess");
        this.oj = true;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void eo() {
    }

    public final boolean fm() {
        return this.oj;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return j.b("ksad-push-card", this.oh);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final com.kwad.sdk.widget.e getTouchCoordsView() {
        return this;
    }
}
