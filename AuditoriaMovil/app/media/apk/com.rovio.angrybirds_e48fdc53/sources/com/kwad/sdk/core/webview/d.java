package com.kwad.sdk.core.webview;

import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.webview.a.c;
/* loaded from: classes.dex */
public final class d {
    private long ayy;
    private boolean ayz;

    public static void d(c.a aVar) {
        if (aVar != null) {
            com.kwad.sdk.core.report.a.e(aVar.getAdTemplate(), aVar.getClientParams());
        }
    }

    public final void a(c.a aVar) {
        if (aVar != null) {
            com.kwad.sdk.core.report.a.b(aVar.getAdTemplate(), aVar.getClientParams());
        }
        if (aVar != null) {
            this.ayy = System.currentTimeMillis();
        }
    }

    public final void b(c.a aVar) {
        if (aVar != null) {
            z.b clientParams = aVar.getClientParams();
            if (clientParams == null) {
                clientParams = new z.b();
            }
            clientParams.Ko = System.currentTimeMillis() - this.ayy;
            com.kwad.sdk.core.report.a.d(aVar.getAdTemplate(), clientParams);
        }
    }

    public final void c(c.a aVar) {
        if (aVar == null || this.ayz) {
            return;
        }
        this.ayz = true;
        if (this.ayy > 0) {
            if (aVar.getClientParams() == null) {
                aVar.b(new z.b());
            }
            aVar.getClientParams().atu = System.currentTimeMillis() - this.ayy;
            this.ayy = -1L;
        }
        com.kwad.sdk.core.report.a.c(aVar.getAdTemplate(), aVar.getClientParams());
    }
}
