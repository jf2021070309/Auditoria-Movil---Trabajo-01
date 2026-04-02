package com.amazon.aps.iva.so;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ue0.s;
import com.amazon.aps.iva.xb0.p;
/* compiled from: WatchScreenAssetsViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.assets.WatchScreenAssetsViewModelImpl$1", f = "WatchScreenAssetsViewModel.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public n h;
    public s i;
    public com.amazon.aps.iva.ue0.h j;
    public int k;
    public final /* synthetic */ n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(2, dVar);
        this.l = nVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new j(this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((j) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: all -> 0x0087, TryCatch #1 {all -> 0x0087, blocks: (B:18:0x004a, B:20:0x0053, B:22:0x0063, B:24:0x0069, B:27:0x0070, B:29:0x0078, B:31:0x007c), top: B:45:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.amazon.aps.iva.ue0.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0043 -> B:45:0x004a). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r12.k
            r2 = 1
            if (r1 == 0) goto L23
            if (r1 != r2) goto L1b
            com.amazon.aps.iva.ue0.h r1 = r12.j
            com.amazon.aps.iva.ue0.s r3 = r12.i
            com.amazon.aps.iva.so.n r4 = r12.h
            com.amazon.aps.iva.ab.x.i0(r13)     // Catch: java.lang.Throwable -> L18
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r12
            goto L4a
        L18:
            r13 = move-exception
            goto L95
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            com.amazon.aps.iva.ab.x.i0(r13)
            com.amazon.aps.iva.so.n r13 = r12.l
            com.amazon.aps.iva.ue0.a r3 = r13.e
            r3.getClass()     // Catch: java.lang.Throwable -> L18
            com.amazon.aps.iva.ue0.a$a r1 = new com.amazon.aps.iva.ue0.a$a     // Catch: java.lang.Throwable -> L18
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L18
            r4 = r13
            r13 = r12
        L34:
            r13.h = r4     // Catch: java.lang.Throwable -> L18
            r13.i = r3     // Catch: java.lang.Throwable -> L18
            r13.j = r1     // Catch: java.lang.Throwable -> L18
            r13.k = r2     // Catch: java.lang.Throwable -> L18
            java.lang.Object r5 = r1.a(r13)     // Catch: java.lang.Throwable -> L18
            if (r5 != r0) goto L43
            return r0
        L43:
            r11 = r0
            r0 = r13
            r13 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r11
        L4a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L87
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L87
            r6 = 0
            if (r13 == 0) goto L8f
            java.lang.Object r13 = r3.next()     // Catch: java.lang.Throwable -> L87
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L87
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<java.util.List<com.amazon.aps.iva.wo.g>>> r7 = r5.f     // Catch: java.lang.Throwable -> L87
            java.lang.Object r8 = r7.d()     // Catch: java.lang.Throwable -> L87
            com.amazon.aps.iva.ez.g r8 = (com.amazon.aps.iva.ez.g) r8     // Catch: java.lang.Throwable -> L87
            if (r8 == 0) goto L89
            com.amazon.aps.iva.ez.g$c r8 = r8.a()     // Catch: java.lang.Throwable -> L87
            if (r8 == 0) goto L89
            T r8 = r8.a     // Catch: java.lang.Throwable -> L87
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L87
            if (r8 != 0) goto L70
            goto L89
        L70:
            com.amazon.aps.iva.ez.g$c r9 = new com.amazon.aps.iva.ez.g$c     // Catch: java.lang.Throwable -> L87
            com.amazon.aps.iva.vo.c r10 = r5.V0()     // Catch: java.lang.Throwable -> L87
            if (r10 == 0) goto L7b
            java.util.List<com.ellation.crunchyroll.model.PlayableAsset> r10 = r10.a     // Catch: java.lang.Throwable -> L87
            goto L7c
        L7b:
            r10 = r6
        L7c:
            java.util.ArrayList r13 = com.amazon.aps.iva.gr.n.G(r8, r13, r10)     // Catch: java.lang.Throwable -> L87
            r9.<init>(r13, r6)     // Catch: java.lang.Throwable -> L87
            r7.k(r9)     // Catch: java.lang.Throwable -> L87
            goto L89
        L87:
            r13 = move-exception
            goto L96
        L89:
            r13 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            goto L34
        L8f:
            com.amazon.aps.iva.ee0.f1.n(r4, r6)
            com.amazon.aps.iva.kb0.q r13 = com.amazon.aps.iva.kb0.q.a
            return r13
        L95:
            r4 = r3
        L96:
            throw r13     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = move-exception
            com.amazon.aps.iva.ee0.f1.n(r4, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.so.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
