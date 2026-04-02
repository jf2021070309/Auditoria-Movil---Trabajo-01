package com.amazon.aps.iva.es;
/* compiled from: CheckoutSuccessCtaSelectedEvent.kt */
/* loaded from: classes2.dex */
public final class s extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.js.u uVar, com.amazon.aps.iva.js.v vVar, com.amazon.aps.iva.js.t tVar, int i, int i2, com.amazon.aps.iva.ks.n nVar) {
        super("Panel Selected", new com.amazon.aps.iva.js.f0(aVar.toString()), new p0("panelContent", uVar), new p0("contextType", vVar), new p0("containerRepresentation", tVar), new p0("containerPosition", Integer.valueOf(i)), new p0("positionInContainer", Integer.valueOf(i2)), new p0("eventSource", null), nVar);
        com.amazon.aps.iva.yb0.j.f(aVar, "screenName");
        com.amazon.aps.iva.yb0.j.f(uVar, "panelContent");
        com.amazon.aps.iva.yb0.j.f(vVar, "contextType");
        com.amazon.aps.iva.yb0.j.f(tVar, "containerType");
        com.amazon.aps.iva.yb0.j.f(nVar, "panelContextObject");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(com.amazon.aps.iva.ls.a r4, com.amazon.aps.iva.ks.i r5, com.amazon.aps.iva.ks.e r6, int r7, int r8, java.lang.String r9, java.lang.String r10, com.amazon.aps.iva.ks.v r11, com.amazon.aps.iva.js.i r12, int r13) {
        /*
            r3 = this;
            r0 = r13 & 32
            java.lang.String r1 = ""
            if (r0 == 0) goto L7
            r9 = r1
        L7:
            r0 = r13 & 64
            if (r0 == 0) goto Lc
            r10 = r1
        Lc:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r1 = 0
            if (r0 == 0) goto L12
            r11 = r1
        L12:
            r13 = r13 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L17
            r12 = r1
        L17:
            java.lang.String r13 = "screenName"
            com.amazon.aps.iva.yb0.j.f(r4, r13)
            java.lang.String r13 = "sourceMediaId"
            com.amazon.aps.iva.yb0.j.f(r9, r13)
            java.lang.String r13 = "sourceMediaTitle"
            com.amazon.aps.iva.yb0.j.f(r10, r13)
            r0 = 10
            com.amazon.aps.iva.is.a[] r0 = new com.amazon.aps.iva.is.a[r0]
            com.amazon.aps.iva.js.f0 r2 = new com.amazon.aps.iva.js.f0
            java.lang.String r4 = r4.toString()
            r2.<init>(r4)
            r4 = 0
            r0[r4] = r2
            r4 = 1
            r0[r4] = r5
            r4 = 2
            r0[r4] = r6
            r4 = 3
            r0[r4] = r11
            r4 = 4
            r0[r4] = r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            com.amazon.aps.iva.es.p0 r5 = new com.amazon.aps.iva.es.p0
            java.lang.String r6 = "positionOfFeed"
            r5.<init>(r6, r4)
            r4 = 5
            r0[r4] = r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            com.amazon.aps.iva.es.p0 r5 = new com.amazon.aps.iva.es.p0
            java.lang.String r6 = "positionOfPanelInFeed"
            r5.<init>(r6, r4)
            r4 = 6
            r0[r4] = r5
            com.amazon.aps.iva.es.p0 r4 = new com.amazon.aps.iva.es.p0
            java.lang.String r5 = "sourceMediaID"
            r4.<init>(r5, r9)
            r5 = 7
            r0[r5] = r4
            com.amazon.aps.iva.es.p0 r4 = new com.amazon.aps.iva.es.p0
            r4.<init>(r13, r10)
            r5 = 8
            r0[r5] = r4
            com.amazon.aps.iva.es.p0 r4 = new com.amazon.aps.iva.es.p0
            java.lang.String r5 = "eventSource"
            r4.<init>(r5, r12)
            r5 = 9
            r0[r5] = r4
            java.lang.String r4 = "Panel Selected"
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.es.s.<init>(com.amazon.aps.iva.ls.a, com.amazon.aps.iva.ks.i, com.amazon.aps.iva.ks.e, int, int, java.lang.String, java.lang.String, com.amazon.aps.iva.ks.v, com.amazon.aps.iva.js.i, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.js.c cVar, com.amazon.aps.iva.js.i iVar) {
        super("Checkout Success CTA Selected", new p0("checkoutSuccessAction", cVar), aVar, new p0("eventSource", iVar));
        com.amazon.aps.iva.yb0.j.f(cVar, "checkoutSuccessActionProperty");
    }

    public s(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.js.i iVar) {
        super("Preview Game Selected", aVar, new p0("eventSource", iVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.amazon.aps.iva.ks.w wVar, e eVar, int i, int i2, float f, float f2) {
        super("Video Ad Impression", wVar, new p0("breakType", eVar), new p0("breakPosition", Integer.valueOf(i)), new p0("slotPosition", Integer.valueOf(i2)), new p0("playheadTime", Float.valueOf(f)), new p0("duration", Float.valueOf(f2)), new p0("playerSdk", "native"));
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMedia");
        com.amazon.aps.iva.yb0.j.f(eVar, "breakType");
    }
}
