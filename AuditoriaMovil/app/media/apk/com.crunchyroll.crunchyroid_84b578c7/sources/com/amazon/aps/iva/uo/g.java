package com.amazon.aps.iva.uo;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.wo.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WatchScreenAssetsFactory.kt */
/* loaded from: classes2.dex */
public final class g implements f {
    public final b a;
    public final d b;

    /* compiled from: WatchScreenAssetsFactory.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.assets.factories.WatchScreenAssetsFactoryImpl", f = "WatchScreenAssetsFactory.kt", l = {36}, m = "create")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public ArrayList h;
        public ArrayList i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return g.this.a(null, this);
        }
    }

    public g(c cVar, d dVar) {
        this.a = cVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.amazon.aps.iva.uo.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.vo.c r6, com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.amazon.aps.iva.wo.g>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.uo.g.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.uo.g$a r0 = (com.amazon.aps.iva.uo.g.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.uo.g$a r0 = new com.amazon.aps.iva.uo.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.ArrayList r6 = r0.i
            java.util.ArrayList r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L6d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            com.amazon.aps.iva.ab.x.i0(r7)
            java.util.List<com.ellation.crunchyroll.model.PlayableAsset> r7 = r6.a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L41
            com.amazon.aps.iva.lb0.z r6 = com.amazon.aps.iva.lb0.z.b
            return r6
        L41:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List<com.ellation.crunchyroll.model.PlayableAsset> r2 = r6.a
            java.lang.Object r2 = com.amazon.aps.iva.lb0.x.t0(r2)
            com.ellation.crunchyroll.model.PlayableAsset r2 = (com.ellation.crunchyroll.model.PlayableAsset) r2
            com.amazon.aps.iva.x50.t r2 = r2.getParentType()
            com.amazon.aps.iva.uo.d r4 = r5.b
            com.amazon.aps.iva.wo.i r2 = r4.a(r2)
            r7.add(r2)
            r0.h = r7
            r0.i = r7
            r0.l = r3
            com.amazon.aps.iva.uo.b r2 = r5.a
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            r0 = r7
            r7 = r6
            r6 = r0
        L6d:
            java.util.Collection r7 = (java.util.Collection) r7
            r6.addAll(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.uo.g.a(com.amazon.aps.iva.vo.c, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.uo.f
    public final List<com.amazon.aps.iva.wo.g> b() {
        return f1.K(this.b.a(null), new j("0"));
    }
}
