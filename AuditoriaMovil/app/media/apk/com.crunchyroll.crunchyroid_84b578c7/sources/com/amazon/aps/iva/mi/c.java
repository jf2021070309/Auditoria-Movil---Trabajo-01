package com.amazon.aps.iva.mi;

import com.amazon.aps.iva.cj.j0;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
/* compiled from: SecureWatchMusicStreamsInteractor.kt */
/* loaded from: classes.dex */
public final class c implements a {
    public final PlayService a;
    public final j0 b;

    public c(PlayService playService, j0 j0Var) {
        this.a = playService;
        this.b = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // com.amazon.aps.iva.mi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r17, boolean r18, com.amazon.aps.iva.ob0.d r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            boolean r3 = r2 instanceof com.amazon.aps.iva.mi.b
            if (r3 == 0) goto L19
            r3 = r2
            com.amazon.aps.iva.mi.b r3 = (com.amazon.aps.iva.mi.b) r3
            int r4 = r3.k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.k = r4
            goto L1e
        L19:
            com.amazon.aps.iva.mi.b r3 = new com.amazon.aps.iva.mi.b
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.i
            com.amazon.aps.iva.pb0.a r4 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r5 = r3.k
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            java.lang.String r1 = r3.h
            com.amazon.aps.iva.ab.x.i0(r2)
            goto L4f
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            com.amazon.aps.iva.ab.x.i0(r2)
            com.amazon.aps.iva.cj.j0 r2 = r0.b
            boolean r2 = r2.isEnabled()
            r3.h = r1
            r3.k = r6
            com.ellation.crunchyroll.api.etp.playback.PlayService r5 = r0.a
            r6 = r18
            java.lang.Object r2 = r5.getMusicPlayStream(r1, r2, r6, r3)
            if (r2 != r4) goto L4f
            return r4
        L4f:
            r13 = r1
            com.ellation.crunchyroll.api.etp.playback.model.PlayResponse r2 = (com.ellation.crunchyroll.api.etp.playback.model.PlayResponse) r2
            com.ellation.crunchyroll.api.cms.model.streams.Stream r1 = new com.ellation.crunchyroll.api.cms.model.streams.Stream
            r4 = 0
            java.lang.String r5 = r2.getUrl()
            r6 = 0
            java.lang.String r7 = r2.getVideoToken()
            r8 = 0
            r9 = 21
            r10 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.amazon.aps.iva.kb0.j r3 = new com.amazon.aps.iva.kb0.j
            java.lang.String r4 = ""
            r3.<init>(r4, r1)
            java.util.Map r1 = com.amazon.aps.iva.aq.k.x(r3)
            com.amazon.aps.iva.kb0.j r3 = new com.amazon.aps.iva.kb0.j
            java.lang.String r4 = "drm_adaptive_dash"
            r3.<init>(r4, r1)
            java.util.Map r7 = com.amazon.aps.iva.aq.k.x(r3)
            java.util.Map r9 = r2.getSubtitles()
            java.util.Map r10 = r2.getCaptions()
            java.lang.String r1 = r2.getBifs()
            java.util.List r11 = com.amazon.aps.iva.ee0.f1.L(r1)
            com.ellation.crunchyroll.api.etp.playback.model.SessionState r12 = r2.getSession()
            com.ellation.crunchyroll.api.cms.model.streams.Streams r1 = new com.ellation.crunchyroll.api.cms.model.streams.Streams
            r8 = 0
            r14 = 5
            r15 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.mi.c.a(java.lang.String, boolean, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }
}
