package com.amazon.aps.iva.es;
/* compiled from: ContinueWatchingSelectedEvent.kt */
/* loaded from: classes2.dex */
public final class w extends i {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(java.lang.String r4, com.amazon.aps.iva.ls.a r5, com.amazon.aps.iva.ks.e r6, com.amazon.aps.iva.ks.g r7, java.lang.Long r8, int r9) {
        /*
            r3 = this;
            r0 = r9 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r0 = r9 & 8
            if (r0 == 0) goto Lb
            r6 = r1
        Lb:
            r0 = r9 & 16
            if (r0 == 0) goto L10
            r7 = r1
        L10:
            r9 = r9 & 32
            if (r9 == 0) goto L15
            r8 = r1
        L15:
            java.lang.String r9 = "error"
            com.amazon.aps.iva.yb0.j.f(r4, r9)
            r0 = 6
            com.amazon.aps.iva.is.a[] r0 = new com.amazon.aps.iva.is.a[r0]
            com.amazon.aps.iva.es.p0 r2 = new com.amazon.aps.iva.es.p0
            r2.<init>(r9, r4)
            r4 = 0
            r0[r4] = r2
            if (r5 == 0) goto L31
            com.amazon.aps.iva.js.f0 r4 = new com.amazon.aps.iva.js.f0
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            goto L32
        L31:
            r4 = r1
        L32:
            r5 = 1
            r0[r5] = r4
            com.amazon.aps.iva.es.p0 r4 = new com.amazon.aps.iva.es.p0
            java.lang.String r5 = "androidErrorData"
            r4.<init>(r5, r1)
            r5 = 2
            r0[r5] = r4
            r4 = 3
            r0[r4] = r6
            r4 = 4
            r0[r4] = r7
            com.amazon.aps.iva.es.p0 r4 = new com.amazon.aps.iva.es.p0
            java.lang.String r5 = "params"
            r4.<init>(r5, r8)
            r5 = 5
            r0[r5] = r4
            java.lang.String r4 = "Error"
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.es.w.<init>(java.lang.String, com.amazon.aps.iva.ls.a, com.amazon.aps.iva.ks.e, com.amazon.aps.iva.ks.g, java.lang.Long, int):void");
    }

    public w(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.e eVar) {
        super("Continue Watching Selected", aVar, eVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(com.amazon.aps.iva.ks.a r3, int r4) {
        /*
            r2 = this;
            r0 = 4
            r1 = 0
            if (r4 == r0) goto L24
            com.amazon.aps.iva.is.a[] r4 = new com.amazon.aps.iva.is.a[r1]
            com.amazon.aps.iva.ak.b r0 = new com.amazon.aps.iva.ak.b
            r1 = 2
            r0.<init>(r1)
            r0.a(r3)
            r0.b(r4)
            int r3 = r0.c()
            com.amazon.aps.iva.is.a[] r3 = new com.amazon.aps.iva.is.a[r3]
            java.lang.Object[] r3 = r0.d(r3)
            com.amazon.aps.iva.is.a[] r3 = (com.amazon.aps.iva.is.a[]) r3
            java.lang.String r4 = "Password Reset Requested"
            r2.<init>(r4, r3)
            return
        L24:
            r4 = 1
            com.amazon.aps.iva.is.a[] r4 = new com.amazon.aps.iva.is.a[r4]
            r4[r1] = r3
            java.lang.String r3 = "Redeem Code Selected"
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.es.w.<init>(com.amazon.aps.iva.ks.a, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.amazon.aps.iva.ks.w wVar, float f, float f2, com.amazon.aps.iva.js.z zVar) {
        super("Rewind Selected", wVar, new p0("playheadStartTime", Float.valueOf(f)), new p0("playheadEndTime", Float.valueOf(f2)), new p0("playerSdk", "native"), zVar);
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMediaProperty");
        com.amazon.aps.iva.yb0.j.f(zVar, "playbackSourceProperty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.amazon.aps.iva.js.y yVar, com.amazon.aps.iva.ks.w wVar, com.amazon.aps.iva.ks.o oVar, com.amazon.aps.iva.js.z zVar) {
        super("Video Play Requested", yVar, wVar, oVar, zVar, new p0("playerSdk", "native"));
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMedia");
        com.amazon.aps.iva.yb0.j.f(zVar, "playbackSource");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.amazon.aps.iva.ks.a aVar, String str) {
        super("Third-Party App Connection Requested", aVar, new p0("platformName", str));
        com.amazon.aps.iva.yb0.j.f(str, "platform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.amazon.aps.iva.ks.w wVar, com.amazon.aps.iva.js.i iVar) {
        super("Stream Limit Retry", new p0("eventSource", iVar), wVar);
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMedia");
    }

    public w(com.amazon.aps.iva.ks.s sVar) {
        super("Mobile Downgrade Flow Completed", sVar, null);
    }
}
