package com.kwad.components.ad.splashscreen.c.a;

import android.widget.FrameLayout;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.r;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.components.l;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.report.z;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g extends com.kwad.components.ad.splashscreen.c.c.b implements com.kwad.sdk.core.h.c {
    private FrameLayout lv;
    private ap wL;

    private r a(com.kwad.sdk.core.webview.b bVar) {
        return new r(bVar, this.CS.mApkDownloadHelper, new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.splashscreen.c.a.g.1
            @Override // com.kwad.sdk.core.webview.d.a.a
            public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
                if (aVar != null) {
                    g.this.CS.mRootContainer.post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.a.g.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.this.CS.kG();
                        }
                    });
                }
            }
        });
    }

    private void aa(int i) {
        z.a aVar = new z.a();
        if (this.CS.mTimerHelper != null) {
            aVar.duration = this.CS.mTimerHelper.getTime();
        }
        j a = new j().cm(6).a(aVar);
        a.ch(i == 2 ? 14 : 1);
        com.kwad.sdk.core.report.a.b(this.CS.mAdTemplate, a, (JSONObject) null);
    }

    private void lB() {
        this.CS.mRootContainer.findViewById(R.id.splash_play_card_view).setVisibility(8);
    }

    @Override // com.kwad.components.ad.splashscreen.c.c.b, com.kwad.components.core.webview.b.i
    public final void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
        super.a(lVar, bVar);
        lVar.c(a(bVar));
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aK() {
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rG();
        }
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aL() {
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rH();
        }
    }

    @Override // com.kwad.components.ad.splashscreen.c.c.b, com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.CS.Cj.a(this);
    }

    @Override // com.kwad.components.ad.splashscreen.c.c.b, com.kwad.components.core.webview.b.i
    public final void b(ap apVar) {
        super.b(apVar);
        this.wL = apVar;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        aVar.width = com.kwad.sdk.d.a.a.b(getContext(), this.CS.mRootContainer.getWidth());
        aVar.height = com.kwad.sdk.d.a.a.b(getContext(), this.CS.mRootContainer.getHeight());
    }

    @Override // com.kwad.components.ad.splashscreen.c.c.b, com.kwad.components.core.webview.b.i
    public final void b(WebCloseStatus webCloseStatus) {
        super.b(webCloseStatus);
        aa(webCloseStatus.closeType);
        if (webCloseStatus.closeType == 2) {
            this.CS.kO();
        } else {
            this.CS.kK();
        }
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void cd() {
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rE();
            this.wL.rF();
        }
        lB();
        this.lv.setVisibility(8);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void ej() {
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rC();
            this.wL.rD();
        }
        lB();
        this.lv.setVisibility(0);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this.lv;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return com.kwad.components.core.webview.b.j.b("ksad-splash-end-card", this.CS.mAdTemplate);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.lv = (FrameLayout) findViewById(R.id.splash_end_card_view);
    }

    @Override // com.kwad.components.ad.splashscreen.c.c.b, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rE();
            this.wL.rF();
        }
        super.onUnbind();
        this.CS.Cj.b(this);
    }
}
