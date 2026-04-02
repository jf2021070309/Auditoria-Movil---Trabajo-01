package com.kwad.components.core.r;

import com.kwad.components.core.webview.b.b.w;
import com.kwad.components.core.webview.b.d;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.components.l;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.core.webview.b.c.c {
    private d qc() {
        return new d() { // from class: com.kwad.components.core.r.c.1
            @Override // com.kwad.components.core.webview.b.a.v, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                w wVar = new w();
                wVar.Xo = a.pU().qb() + 1;
                cVar.a(wVar);
            }
        };
    }

    @Override // com.kwad.components.core.webview.b.c.a, com.kwad.components.core.webview.b.i
    public final void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
        lVar.c(qc());
    }

    @Override // com.kwad.components.core.webview.b.c.c, com.kwad.components.core.webview.b.c.a, com.kwad.components.core.webview.b.i
    public final void b(WebCloseStatus webCloseStatus) {
        super.b(webCloseStatus);
        if (webCloseStatus.interactSuccess) {
            this.Xr.VS.dismiss();
        } else {
            this.Xr.mActivity.finish();
        }
    }

    @Override // com.kwad.components.core.webview.b.c.c, com.kwad.components.core.webview.b.i
    public final void cd() {
        super.cd();
    }
}
