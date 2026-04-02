package com.amazon.aps.iva.g40;

import com.amazon.aps.iva.i5.s;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.p;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
/* compiled from: PremiumMembershipViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.settings.membership.premium.viewmodel.PremiumMembershipViewModelImpl$createBillingProductLiveData$1$1", f = "PremiumMembershipViewModel.kt", l = {83, ModuleDescriptor.MODULE_VERSION, 95}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<s<com.amazon.aps.iva.ez.g<? extends a>>, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.rs.g j;
    public final /* synthetic */ com.amazon.aps.iva.rs.f k;
    public final /* synthetic */ String l;
    public final /* synthetic */ g m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.rs.g gVar, com.amazon.aps.iva.rs.f fVar, String str, g gVar2, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(2, dVar);
        this.j = gVar;
        this.k = fVar;
        this.l = str;
        this.m = gVar2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        c cVar = new c(this.j, this.k, this.l, this.m, dVar);
        cVar.i = obj;
        return cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(s<com.amazon.aps.iva.ez.g<? extends a>> sVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((c) create(sVar, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.amazon.aps.iva.i5.s] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.amazon.aps.iva.i5.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.amazon.aps.iva.i5.s] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r8.h
            r2 = 0
            java.lang.String r3 = r8.l
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L20
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L97
        L20:
            java.lang.Object r1 = r8.i
            com.amazon.aps.iva.i5.s r1 = (com.amazon.aps.iva.i5.s) r1
            com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.lang.Throwable -> L46
            goto L43
        L28:
            com.amazon.aps.iva.ab.x.i0(r9)
            java.lang.Object r9 = r8.i
            r1 = r9
            com.amazon.aps.iva.i5.s r1 = (com.amazon.aps.iva.i5.s) r1
            com.amazon.aps.iva.rs.g r9 = r8.j
            boolean r7 = r9 instanceof com.amazon.aps.iva.rs.g.a
            if (r7 == 0) goto L79
            com.amazon.aps.iva.rs.f r9 = r8.k
            r8.i = r1     // Catch: java.lang.Throwable -> L46
            r8.h = r6     // Catch: java.lang.Throwable -> L46
            java.lang.Object r9 = r9.b(r3, r8)     // Catch: java.lang.Throwable -> L46
            if (r9 != r0) goto L43
            return r0
        L43:
            com.amazon.aps.iva.rs.o r9 = (com.amazon.aps.iva.rs.o) r9     // Catch: java.lang.Throwable -> L46
            goto L4b
        L46:
            r9 = move-exception
            com.amazon.aps.iva.kb0.k$a r9 = com.amazon.aps.iva.ab.x.H(r9)
        L4b:
            boolean r4 = r9 instanceof com.amazon.aps.iva.kb0.k.a
            r4 = r4 ^ r6
            if (r4 == 0) goto L6a
            com.amazon.aps.iva.rs.o r9 = (com.amazon.aps.iva.rs.o) r9
            com.amazon.aps.iva.g40.a r4 = new com.amazon.aps.iva.g40.a
            com.amazon.aps.iva.rs.n r9 = r9.d
            java.lang.String r9 = r9.b
            com.amazon.aps.iva.g40.g r6 = r8.m
            com.amazon.aps.iva.rs.q r7 = r6.d
            java.util.Date r7 = r7.v6()
            com.amazon.aps.iva.rs.q r6 = r6.d
            boolean r6 = r6.O0()
            r4.<init>(r3, r9, r7, r6)
            r9 = r4
        L6a:
            com.amazon.aps.iva.ez.g r9 = com.amazon.aps.iva.ez.h.e(r9)
            r8.i = r2
            r8.h = r5
            java.lang.Object r9 = r1.a(r9, r8)
            if (r9 != r0) goto L97
            return r0
        L79:
            boolean r3 = r9 instanceof com.amazon.aps.iva.rs.g.c
            if (r3 == 0) goto L7e
            goto L80
        L7e:
            boolean r6 = r9 instanceof com.amazon.aps.iva.rs.g.d
        L80:
            if (r6 == 0) goto L97
            com.amazon.aps.iva.ez.g$a r9 = new com.amazon.aps.iva.ez.g$a
            com.amazon.aps.iva.rs.h r3 = new com.amazon.aps.iva.rs.h
            java.lang.String r5 = "Could not fetch BillingProduct"
            r3.<init>(r5)
            r9.<init>(r2, r3)
            r8.h = r4
            java.lang.Object r9 = r1.a(r9, r8)
            if (r9 != r0) goto L97
            return r0
        L97:
            com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g40.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
