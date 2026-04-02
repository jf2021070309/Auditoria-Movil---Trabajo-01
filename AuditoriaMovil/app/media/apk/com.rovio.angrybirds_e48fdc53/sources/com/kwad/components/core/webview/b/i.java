package com.kwad.components.core.webview.b;

import android.widget.FrameLayout;
import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.b.m;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.components.l;
/* loaded from: classes.dex */
public interface i {
    void a(o oVar);

    void a(p pVar);

    void a(t tVar);

    void a(l lVar, com.kwad.sdk.core.webview.b bVar);

    void a(com.kwad.sdk.core.webview.d.b.a aVar);

    void b(m mVar);

    void b(ap apVar);

    void b(w.a aVar);

    void b(WebCloseStatus webCloseStatus);

    void cd();

    void ej();

    void eo();

    FrameLayout getTKContainer();

    String getTkTemplateId();

    com.kwad.sdk.widget.e getTouchCoordsView();
}
