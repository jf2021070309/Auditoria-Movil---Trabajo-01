package com.kwad.components.core.webview.b.c;

import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.b.m;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.b.h;
import com.kwad.components.core.webview.b.i;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.components.l;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.widget.e;
/* loaded from: classes.dex */
public abstract class a extends Presenter implements i {
    protected b Xr;
    protected h lt;

    @Override // com.kwad.components.core.webview.b.i
    public final void a(o oVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public void a(p pVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public void a(t tVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(b bVar) {
    }

    public void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
    }

    public void a(com.kwad.sdk.core.webview.d.b.a aVar) {
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void ah() {
        super.ah();
        b bVar = (b) Gh();
        this.Xr = bVar;
        a(bVar);
        if (this.lt == null) {
            this.lt = hW();
        }
        if (this.Xr.QP != null) {
            this.lt.a(this.Xr.QP);
        }
        this.lt.a(this.Xr.mActivity, this.Xr.mAdTemplate, this);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(m mVar) {
    }

    public void b(WebCloseStatus webCloseStatus) {
        if (this.Xr.VS != null) {
            this.Xr.VS.dismiss();
        }
    }

    @Override // com.kwad.components.core.webview.b.i
    public void eo() {
    }

    @Override // com.kwad.components.core.webview.b.i
    public e getTouchCoordsView() {
        return this.Xr.Xs;
    }

    protected h hW() {
        return new h(this.Xr.xM, getContext());
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.lt.jx();
        this.lt = null;
    }
}
