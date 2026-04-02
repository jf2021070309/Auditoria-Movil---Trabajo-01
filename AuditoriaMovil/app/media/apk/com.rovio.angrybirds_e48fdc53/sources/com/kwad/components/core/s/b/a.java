package com.kwad.components.core.s.b;

import android.widget.FrameLayout;
import com.kwad.components.core.o.c;
import com.kwad.components.core.s.a.b;
import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.b.m;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.b.h;
import com.kwad.components.core.webview.b.i;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.components.l;
import com.kwad.sdk.core.webview.c.g;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.utils.be;
import com.kwad.sdk.widget.e;
/* loaded from: classes.dex */
public final class a extends Presenter implements i {
    private FrameLayout QX;
    private ap QY;
    protected boolean QZ;
    protected b Ra;
    private com.kwad.components.core.l.a.a Rb = new com.kwad.components.core.l.a.a() { // from class: com.kwad.components.core.s.b.a.1
        @Override // com.kwad.components.core.l.a.a
        public final void c(c cVar) {
            a.this.qg();
        }

        @Override // com.kwad.components.core.l.a.a
        public final void d(c cVar) {
            a.this.qh();
        }

        @Override // com.kwad.components.core.l.a.a
        public final void gg() {
        }

        @Override // com.kwad.components.core.l.a.a
        public final void gh() {
            a.this.qi();
        }
    };
    private h lt;

    private void qf() {
        ap apVar = this.QY;
        if (apVar == null) {
            return;
        }
        if (this.QZ) {
            apVar.rG();
            return;
        }
        apVar.rC();
        this.QY.rD();
        this.QZ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qg() {
        qf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qh() {
        ap apVar = this.QY;
        if (apVar == null || !this.QZ) {
            return;
        }
        apVar.rH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qi() {
        ap apVar = this.QY;
        if (apVar == null || !this.QZ) {
            return;
        }
        apVar.rE();
        this.QY.rF();
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
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.Ra = (b) Gh();
        this.QX = (FrameLayout) findViewById(R.id.ksad_js_container);
        h hVar = new h(getContext(), 1000, 0);
        this.lt = hVar;
        hVar.a(this.Ra.QP);
        if (this.Ra.QS != null) {
            this.Ra.QS.a(this.lt);
            this.lt.a(new g() { // from class: com.kwad.components.core.s.b.a.2
                @Override // com.kwad.sdk.core.webview.c.g
                public final void callTKBridge(String str) {
                    if (a.this.Ra.QS != null) {
                        a.this.Ra.QS.callTKBridge(str);
                    }
                }
            });
            this.lt.a("hasTKBridge", Boolean.TRUE);
        }
        this.lt.a(getActivity(), this.Ra.mAdTemplate, this);
        this.Ra.Lm.add(this.Rb);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(m mVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(ap apVar) {
        this.QY = apVar;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        float aJ = com.kwad.sdk.d.a.a.aJ(getContext());
        aVar.width = (int) ((be.getScreenWidth(getContext()) / aJ) + 0.5f);
        aVar.height = (int) ((be.getScreenHeight(getContext()) / aJ) + 0.5f);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(WebCloseStatus webCloseStatus) {
        getActivity().finish();
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void cd() {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void ej() {
        qf();
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void eo() {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this.QX;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return this.Ra.QP.templateId;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final e getTouchCoordsView() {
        return this.Ra.mRootContainer;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        qi();
        this.lt.jx();
        this.Ra.Lm.remove(this.Rb);
    }
}
