package com.amazon.aps.iva.w40;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: SimulcastInteractor.kt */
/* loaded from: classes2.dex */
public final class y extends com.amazon.aps.iva.wy.a implements x {
    public final EtpContentService b;
    public final String c;
    public final LinkedHashMap d;

    /* compiled from: SimulcastInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.simulcast.SimulcastInteractorImpl", f = "SimulcastInteractor.kt", l = {37}, m = "getPanelsRange")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public y h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return y.this.x0(0, 0, this);
        }
    }

    public y(EtpContentService etpContentService, String str) {
        this.b = etpContentService;
        this.c = str;
        com.amazon.aps.iva.a00.b bVar = com.amazon.aps.iva.a00.b.Popularity;
        com.amazon.aps.iva.yb0.j.f(bVar, "option");
        if (!(!bVar.getOrderOptions().isEmpty())) {
            com.amazon.aps.iva.tz.q0 q0Var = com.amazon.aps.iva.tz.q0.e;
            com.amazon.aps.iva.yb0.j.f(q0Var, "filters");
            q0Var.b().isEmpty();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(q0Var.b());
            arrayList.add(bVar);
            arrayList.add(null);
            Iterator it = com.amazon.aps.iva.lb0.x.r0(arrayList).iterator();
            while (it.hasNext()) {
                linkedHashMap.putAll(((com.amazon.aps.iva.mn.l) it.next()).getUrlParams());
            }
            this.d = linkedHashMap;
            return;
        }
        List<com.amazon.aps.iva.mn.n> orderOptions = bVar.getOrderOptions();
        throw new IllegalArgumentException("Null order has been provided when the option " + bVar + " expects one of the " + orderOptions + " values");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    @Override // com.amazon.aps.iva.w40.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x0(int r12, int r13, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.etp.content.ContentApiResponse<com.ellation.crunchyroll.model.Panel, com.ellation.crunchyroll.api.etp.content.EmptyMeta>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.amazon.aps.iva.w40.y.a
            if (r0 == 0) goto L13
            r0 = r14
            com.amazon.aps.iva.w40.y$a r0 = (com.amazon.aps.iva.w40.y.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.w40.y$a r0 = new com.amazon.aps.iva.w40.y$a
            r0.<init>(r14)
        L18:
            r8 = r0
            java.lang.Object r14 = r8.i
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r8.k
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            com.amazon.aps.iva.w40.y r12 = r8.h
            com.amazon.aps.iva.ab.x.i0(r14)
            goto L57
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            com.amazon.aps.iva.ab.x.i0(r14)
            com.ellation.crunchyroll.api.etp.content.EtpContentService r1 = r11.b
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r12)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r13)
            r4 = 0
            java.util.LinkedHashMap r5 = r11.d
            r6 = 0
            java.lang.String r7 = r11.c
            r9 = 20
            r10 = 0
            r8.h = r11
            r8.k = r2
            r2 = r14
            java.lang.Object r14 = com.ellation.crunchyroll.api.etp.content.EtpContentService.DefaultImpls.getBrowseAll$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r14 != r0) goto L56
            return r0
        L56:
            r12 = r11
        L57:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r14 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r14
            java.util.List r13 = r14.getData()
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L64
            return r14
        L64:
            com.amazon.aps.iva.w40.f r13 = new com.amazon.aps.iva.w40.f
            java.lang.String r14 = r12.c
            java.util.LinkedHashMap r12 = r12.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Simulcast panels cannot be empty for season "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = " and "
            r0.append(r14)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.w40.y.x0(int, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
