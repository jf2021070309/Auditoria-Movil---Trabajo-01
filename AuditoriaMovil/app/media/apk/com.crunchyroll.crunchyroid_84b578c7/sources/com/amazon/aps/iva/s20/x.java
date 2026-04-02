package com.amazon.aps.iva.s20;

import java.util.List;
/* compiled from: UpgradeViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeViewModelImpl$upsellTiers$1$1", f = "UpgradeViewModel.kt", l = {68, 70, 82, 84, 86, 89, 90}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.i5.s<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>>>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> j;
    public final /* synthetic */ z k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> gVar, z zVar, com.amazon.aps.iva.ob0.d<? super x> dVar) {
        super(2, dVar);
        this.j = gVar;
        this.k = zVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        x xVar = new x(this.j, this.k, dVar);
        xVar.i = obj;
        return xVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.i5.s<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>>> sVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((x) create(sVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[Catch: c -> 0x0082, b -> 0x0094, a -> 0x00a6, TryCatch #3 {a -> 0x00a6, b -> 0x0094, c -> 0x0082, blocks: (B:8:0x001e, B:28:0x006d, B:30:0x0071, B:32:0x0075, B:11:0x0026, B:20:0x0045, B:25:0x005d, B:24:0x0059, B:15:0x0036, B:17:0x003a), top: B:60:0x000a }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.amazon.aps.iva.i5.s] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.amazon.aps.iva.i5.s] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.amazon.aps.iva.i5.s] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s20.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
