package com.amazon.aps.iva.pw;

import com.amazon.aps.iva.bw.g;
import com.amazon.aps.iva.sv.i;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.queue.j;
/* compiled from: StreamDataLoader.kt */
/* loaded from: classes2.dex */
public final class c implements a {
    public final com.amazon.aps.iva.xb0.a<InternalDownloadsManager> a;

    public c(i.d dVar) {
        this.a = dVar;
    }

    @Override // com.amazon.aps.iva.pw.a
    public final void a(String str, com.ellation.crunchyroll.downloading.queue.i iVar, j jVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        this.a.invoke().Q1(str, iVar, jVar);
    }

    @Override // com.amazon.aps.iva.pw.a
    public final void b(String str, g.d.a aVar, g.d.b bVar) {
        this.a.invoke().q7(str, aVar, new b(bVar));
    }
}
