package com.amazon.aps.iva.z3;

import com.amazon.aps.iva.z3.q;
/* compiled from: SingleProcessDataStore.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<q.a<Object>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ q<Object> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q<Object> qVar, com.amazon.aps.iva.ob0.d<? super t> dVar) {
        super(2, dVar);
        this.j = qVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        t tVar = new t(this.j, dVar);
        tVar.i = obj;
        return tVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(q.a<Object> aVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((t) create(aVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063 A[RETURN] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r5.h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L7f
        L19:
            com.amazon.aps.iva.ab.x.i0(r6)
            java.lang.Object r6 = r5.i
            com.amazon.aps.iva.z3.q$a r6 = (com.amazon.aps.iva.z3.q.a) r6
            boolean r1 = r6 instanceof com.amazon.aps.iva.z3.q.a.C0909a
            com.amazon.aps.iva.z3.q<java.lang.Object> r4 = r5.j
            if (r1 == 0) goto L70
            com.amazon.aps.iva.z3.q$a$a r6 = (com.amazon.aps.iva.z3.q.a.C0909a) r6
            r5.h = r3
            com.amazon.aps.iva.ve0.v0 r1 = r4.h
            java.lang.Object r1 = r1.getValue()
            com.amazon.aps.iva.z3.b0 r1 = (com.amazon.aps.iva.z3.b0) r1
            boolean r2 = r1 instanceof com.amazon.aps.iva.z3.c
            if (r2 == 0) goto L37
            goto L5f
        L37:
            boolean r2 = r1 instanceof com.amazon.aps.iva.z3.l
            if (r2 == 0) goto L49
            com.amazon.aps.iva.z3.b0<T> r6 = r6.a
            if (r1 != r6) goto L5f
            java.lang.Object r6 = r4.f(r5)
            if (r6 != r0) goto L46
            goto L61
        L46:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            goto L61
        L49:
            com.amazon.aps.iva.z3.c0 r6 = com.amazon.aps.iva.z3.c0.a
            boolean r6 = com.amazon.aps.iva.yb0.j.a(r1, r6)
            if (r6 == 0) goto L5b
            java.lang.Object r6 = r4.f(r5)
            if (r6 != r0) goto L58
            goto L61
        L58:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            goto L61
        L5b:
            boolean r6 = r1 instanceof com.amazon.aps.iva.z3.j
            if (r6 != 0) goto L64
        L5f:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
        L61:
            if (r6 != r0) goto L7f
            return r0
        L64:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L70:
            boolean r1 = r6 instanceof com.amazon.aps.iva.z3.q.a.b
            if (r1 == 0) goto L7f
            com.amazon.aps.iva.z3.q$a$b r6 = (com.amazon.aps.iva.z3.q.a.b) r6
            r5.h = r2
            java.lang.Object r6 = com.amazon.aps.iva.z3.q.b(r4, r6, r5)
            if (r6 != r0) goto L7f
            return r0
        L7f:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
