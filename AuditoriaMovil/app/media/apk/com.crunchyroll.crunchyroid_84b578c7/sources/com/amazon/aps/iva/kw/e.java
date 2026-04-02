package com.amazon.aps.iva.kw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: OfflinePlayheadsSynchronizer.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.playheads.OfflinePlayheadsSynchronizer$pullOnlinePlayheads$2", f = "OfflinePlayheadsSynchronizer.kt", l = {80, 80, 83, 87, 87}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public Object h;
    public int i;
    public final /* synthetic */ g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
        super(2, dVar);
        this.j = gVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new e(this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((e) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[LOOP:0: B:23:0x007a->B:25:0x0080, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc A[RETURN] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.i
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            com.amazon.aps.iva.kw.g r9 = r0.j
            if (r2 == 0) goto L4a
            if (r2 == r8) goto L44
            if (r2 == r7) goto L3a
            if (r2 == r6) goto L33
            if (r2 == r5) goto L27
            if (r2 != r4) goto L1f
            com.amazon.aps.iva.ab.x.i0(r17)
            goto Lcd
        L1f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L27:
            java.lang.Object r2 = r0.h
            com.amazon.aps.iva.wv.b0 r2 = (com.amazon.aps.iva.wv.b0) r2
            com.amazon.aps.iva.ab.x.i0(r17)
            r6 = r2
            r2 = r17
            goto Lc0
        L33:
            com.amazon.aps.iva.ab.x.i0(r17)
            r2 = r17
            goto Lad
        L3a:
            java.lang.Object r2 = r0.h
            java.util.Collection r2 = (java.util.Collection) r2
            com.amazon.aps.iva.ab.x.i0(r17)
            r7 = r17
            goto L67
        L44:
            com.amazon.aps.iva.ab.x.i0(r17)
            r2 = r17
            goto L58
        L4a:
            com.amazon.aps.iva.ab.x.i0(r17)
            com.amazon.aps.iva.wv.j r2 = r9.d
            r0.i = r8
            java.lang.Object r2 = r2.readAllItems(r0)
            if (r2 != r1) goto L58
            return r1
        L58:
            java.util.Collection r2 = (java.util.Collection) r2
            com.amazon.aps.iva.wv.q r10 = r9.e
            r0.h = r2
            r0.i = r7
            java.lang.Object r7 = r10.readAllItems(r0)
            if (r7 != r1) goto L67
            return r1
        L67:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = com.amazon.aps.iva.lb0.x.L0(r7, r2)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r7 = com.amazon.aps.iva.lb0.r.Y(r2)
            r10.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L7a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L8e
            java.lang.Object r7 = r2.next()
            com.ellation.crunchyroll.model.PlayableAsset r7 = (com.ellation.crunchyroll.model.PlayableAsset) r7
            java.lang.String r7 = r7.getId()
            r10.add(r7)
            goto L7a
        L8e:
            boolean r2 = r10.isEmpty()
            r2 = r2 ^ r8
            if (r2 == 0) goto Lcd
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r9.a
            java.lang.String r11 = ","
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 62
            java.lang.String r7 = com.amazon.aps.iva.lb0.x.B0(r10, r11, r12, r13, r14, r15)
            r0.h = r3
            r0.i = r6
            java.lang.Object r2 = r2.getPlayheadsUnsynced(r7, r0)
            if (r2 != r1) goto Lad
            return r1
        Lad:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r2 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r2
            java.util.List r2 = r2.getData()
            com.amazon.aps.iva.wv.b0 r6 = r9.c
            r0.h = r6
            r0.i = r5
            java.lang.Object r2 = com.amazon.aps.iva.kw.g.e(r9, r2, r0)
            if (r2 != r1) goto Lc0
            return r1
        Lc0:
            java.util.List r2 = (java.util.List) r2
            r0.h = r3
            r0.i = r4
            java.lang.Object r2 = r6.saveItems(r2, r0)
            if (r2 != r1) goto Lcd
            return r1
        Lcd:
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.kw.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
