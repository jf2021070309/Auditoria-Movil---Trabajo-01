package com.kwad.components.ad.splashscreen.c.c;

import android.app.Activity;
import com.kwad.components.ad.splashscreen.c.e;
import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.b.m;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.b.i;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.components.l;
/* loaded from: classes.dex */
public abstract class b extends e implements i {
    private a EM;

    @Override // com.kwad.components.core.webview.b.i
    public final void a(o oVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(p pVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(t tVar) {
    }

    public void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public void ah() {
        super.ah();
        int lC = lC();
        a aVar = new a(getContext(), lC, lC);
        this.EM = aVar;
        aVar.a((Activity) null, this.CS.mAdTemplate, this);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(m mVar) {
    }

    public void b(ap apVar) {
    }

    public void b(WebCloseStatus webCloseStatus) {
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void eo() {
    }

    @Override // com.kwad.components.core.webview.b.i
    public com.kwad.sdk.widget.e getTouchCoordsView() {
        return this.CS.mRootContainer;
    }

    protected int lC() {
        return 1000;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public void onUnbind() {
        super.onUnbind();
        this.EM.jx();
    }
}
