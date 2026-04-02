package com.kwad.components.core.e.a;

import android.app.Activity;
import android.widget.FrameLayout;
import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.b.m;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.b.i;
import com.kwad.components.core.webview.b.j;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.components.l;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class f extends Presenter implements i, com.kwad.sdk.core.h.c {
    private com.kwad.components.core.widget.a.b Ja;
    private a Jk;
    private ap cG;
    private com.kwad.components.core.webview.b.h lt;
    private AdTemplate mAdTemplate;

    private void aj(boolean z) {
        if (!z) {
            this.Jk.mO();
        }
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.e.a.f.2
            @Override // java.lang.Runnable
            public final void run() {
                f.this.Jk.Jb.mQ();
            }
        });
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
        com.kwad.sdk.core.e.c.d("InstalledActivatePresenter", "onAdClicked");
        aj(false);
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aK() {
        com.kwad.sdk.core.e.c.d("InstalledActivatePresenter", "onPageVisible");
        ap apVar = this.cG;
        if (apVar != null) {
            apVar.rG();
        }
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aL() {
        com.kwad.sdk.core.e.c.d("InstalledActivatePresenter", "onPageInvisible");
        ap apVar = this.cG;
        if (apVar != null) {
            apVar.rH();
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        a aVar = (a) Gh();
        this.Jk = aVar;
        this.mAdTemplate = aVar.mAdTemplate;
        this.Ja = this.Jk.Ja;
        com.kwad.components.core.webview.b.h hVar = new com.kwad.components.core.webview.b.h(getContext()) { // from class: com.kwad.components.core.e.a.f.1
            @Override // com.kwad.components.core.webview.b.h
            public final boolean mW() {
                return true;
            }
        };
        this.lt = hVar;
        hVar.a((Activity) null, this.mAdTemplate, this);
        this.Ja.a(this);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(m mVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(ap apVar) {
        this.cG = apVar;
        this.Jk.cG = apVar;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        float aJ = com.kwad.sdk.d.a.a.aJ(getContext());
        aVar.width = (int) ((com.kwad.sdk.d.a.a.getScreenWidth(getContext()) / aJ) + 0.5f);
        aVar.height = (int) ((com.kwad.sdk.d.a.a.getScreenHeight(getContext()) / aJ) + 0.5f);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(WebCloseStatus webCloseStatus) {
        aj(false);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void cd() {
        com.kwad.sdk.core.e.c.d("InstalledActivatePresenter", "onTkLoadFailed");
        aj(true);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void ej() {
        com.kwad.sdk.core.e.c.d("InstalledActivatePresenter", "onTkLoadSuccess");
        this.Jk.bt();
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void eo() {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this.Jk.IZ;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return j.b("ksad-installed-activate-card", this.mAdTemplate);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final com.kwad.sdk.widget.e getTouchCoordsView() {
        return this.Jk.IZ;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.lt.jx();
        this.Ja.b(this);
    }
}
