package com.amazon.aps.iva.bw;

import com.amazon.aps.iva.sv.o2;
import com.ellation.crunchyroll.api.etp.download.DownloadService;
/* compiled from: SecureDownloadingStreamsInteractor.kt */
/* loaded from: classes2.dex */
public final class p implements com.amazon.aps.iva.vg.a {
    public final DownloadService a;
    public final com.amazon.aps.iva.wg.a b;
    public final o2 c;

    public p(com.amazon.aps.iva.rw.e eVar, DownloadService downloadService, o2 o2Var) {
        this.a = downloadService;
        this.b = eVar;
        this.c = o2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.amazon.aps.iva.vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r13, com.amazon.aps.iva.ob0.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.amazon.aps.iva.bw.o
            if (r0 == 0) goto L13
            r0 = r14
            com.amazon.aps.iva.bw.o r0 = (com.amazon.aps.iva.bw.o) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.bw.o r0 = new com.amazon.aps.iva.bw.o
            r0.<init>(r12, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.i
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r6.k
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.String r13 = r6.h
            com.amazon.aps.iva.ab.x.i0(r14)
        L29:
            r9 = r13
            goto L58
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            com.amazon.aps.iva.ab.x.i0(r14)
            com.ellation.crunchyroll.api.etp.download.DownloadService r1 = r12.a
            com.amazon.aps.iva.wg.a r14 = r12.b
            com.amazon.aps.iva.wg.b r14 = r14.J()
            int r3 = r14.getHeight()
            com.amazon.aps.iva.sv.o2 r14 = r12.c
            r14.f()
            r4 = 0
            r14.c()
            r5 = 0
            r6.h = r13
            r6.k = r2
            r2 = r13
            java.lang.Object r14 = r1.getDownloadToken(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L29
            return r0
        L58:
            com.ellation.crunchyroll.api.etp.download.model.DownloadResponse r14 = (com.ellation.crunchyroll.api.etp.download.model.DownloadResponse) r14
            com.ellation.crunchyroll.api.cms.model.streams.Stream r13 = new com.ellation.crunchyroll.api.cms.model.streams.Stream
            r1 = 0
            java.lang.String r2 = r14.getManifestUrl()
            r3 = 0
            java.lang.String r4 = r14.getVideoToken()
            r5 = 0
            r6 = 21
            r7 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.amazon.aps.iva.kb0.j r0 = new com.amazon.aps.iva.kb0.j
            java.lang.String r1 = ""
            r0.<init>(r1, r13)
            java.util.Map r13 = com.amazon.aps.iva.aq.k.x(r0)
            com.amazon.aps.iva.kb0.j r0 = new com.amazon.aps.iva.kb0.j
            java.lang.String r1 = "download_dash"
            r0.<init>(r1, r13)
            java.util.Map r3 = com.amazon.aps.iva.aq.k.x(r0)
            java.util.Map r5 = r14.getSubtitles()
            java.util.Map r6 = r14.getCaptions()
            java.lang.String r13 = r14.getBifs()
            java.util.List r7 = com.amazon.aps.iva.ee0.f1.L(r13)
            com.ellation.crunchyroll.api.cms.model.streams.Streams r13 = new com.ellation.crunchyroll.api.cms.model.streams.Streams
            r2 = 0
            r4 = 0
            r8 = 0
            r10 = 69
            r11 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bw.p.a(java.lang.String, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }
}
