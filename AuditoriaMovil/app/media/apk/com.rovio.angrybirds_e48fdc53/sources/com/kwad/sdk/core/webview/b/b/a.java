package com.kwad.sdk.core.webview.b.b;

import com.kwad.framework.filedownloader.m;
import com.kwad.framework.filedownloader.r;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: com.kwad.sdk.core.webview.b.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0261a {
        void c(com.kwad.sdk.h.a.b bVar);

        void d(com.kwad.sdk.h.a.b bVar);

        void e(com.kwad.sdk.h.a.b bVar);
    }

    public static void a(final com.kwad.sdk.h.a.b bVar, final InterfaceC0261a interfaceC0261a) {
        c.d("HybridDownloader", "reportHybrid: download+++url " + bVar.packageUrl);
        interfaceC0261a.c(bVar);
        bVar.am(System.currentTimeMillis());
        com.kwad.sdk.core.webview.b.c.b.a(bVar, 1);
        r.an(l.KR());
        r.tZ();
        r.aY(bVar.packageUrl).e(bVar).aV(bVar.aCl).aU(true).a(new m() { // from class: com.kwad.sdk.core.webview.b.b.a.1
            @Override // com.kwad.framework.filedownloader.m, com.kwad.framework.filedownloader.i
            public final void a(com.kwad.framework.filedownloader.a aVar, Throwable th) {
                super.a(aVar, th);
                com.kwad.sdk.core.webview.b.c.b.a(bVar, 0, 1, th.getMessage());
                InterfaceC0261a.this.e((com.kwad.sdk.h.a.b) aVar.getTag());
            }

            @Override // com.kwad.framework.filedownloader.m, com.kwad.framework.filedownloader.i
            public final void c(com.kwad.framework.filedownloader.a aVar) {
                super.c(aVar);
                if (aVar.ta() == -3) {
                    InterfaceC0261a.this.d(bVar);
                    return;
                }
                InterfaceC0261a.this.e(bVar);
                com.kwad.sdk.h.a.b bVar2 = bVar;
                com.kwad.sdk.core.webview.b.c.b.a(bVar2, 0, 1, "task.getStatus()=" + ((int) aVar.ta()));
            }
        }).start();
    }
}
