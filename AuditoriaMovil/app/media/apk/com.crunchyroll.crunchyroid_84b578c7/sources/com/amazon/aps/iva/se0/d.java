package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.se0.c;
import java.util.Collection;
import java.util.List;
/* compiled from: Await.kt */
/* loaded from: classes4.dex */
public final class d {

    /* compiled from: Await.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {54}, m = "joinAll")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public Object[] h;
        public int i;
        public int j;
        public /* synthetic */ Object k;
        public int l;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.l |= Integer.MIN_VALUE;
            return d.c(null, this);
        }
    }

    public static final <T> Object a(Collection<? extends m0<? extends T>> collection, com.amazon.aps.iva.ob0.d<? super List<? extends T>> dVar) {
        if (collection.isEmpty()) {
            return com.amazon.aps.iva.lb0.z.b;
        }
        Object[] array = collection.toArray(new m0[0]);
        if (array != null) {
            m0[] m0VarArr = (m0[]) array;
            c cVar = new c(m0VarArr);
            n nVar = new n(1, com.amazon.aps.iva.a60.b.s(dVar));
            nVar.r();
            int length = m0VarArr.length;
            c.a[] aVarArr = new c.a[length];
            for (int i = 0; i < length; i++) {
                m0 m0Var = m0VarArr[i];
                m0Var.start();
                c.a aVar = new c.a(nVar);
                aVar.g = m0Var.s0(aVar);
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                aVarArr[i] = aVar;
            }
            c<T>.b bVar = new c.b(aVarArr);
            for (int i2 = 0; i2 < length; i2++) {
                aVarArr[i2].s(bVar);
            }
            if (nVar.c()) {
                bVar.b();
            } else {
                nVar.w(bVar);
            }
            Object q = nVar.q();
            com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            return q;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.util.concurrent.CopyOnWriteArrayList r4, com.amazon.aps.iva.ob0.d r5) {
        /*
            boolean r0 = r5 instanceof com.amazon.aps.iva.se0.e
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.se0.e r0 = (com.amazon.aps.iva.se0.e) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.se0.e r0 = new com.amazon.aps.iva.se0.e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            com.amazon.aps.iva.ab.x.i0(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            com.amazon.aps.iva.se0.j1 r5 = (com.amazon.aps.iva.se0.j1) r5
            r0.h = r4
            r0.j = r3
            java.lang.Object r5 = r5.N(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            com.amazon.aps.iva.kb0.q r4 = com.amazon.aps.iva.kb0.q.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.se0.d.b(java.util.concurrent.CopyOnWriteArrayList, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.amazon.aps.iva.se0.j1[] r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            boolean r0 = r7 instanceof com.amazon.aps.iva.se0.d.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.se0.d$a r0 = (com.amazon.aps.iva.se0.d.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.se0.d$a r0 = new com.amazon.aps.iva.se0.d$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.j
            int r2 = r0.i
            java.lang.Object[] r4 = r0.h
            com.amazon.aps.iva.se0.j1[] r4 = (com.amazon.aps.iva.se0.j1[]) r4
            com.amazon.aps.iva.ab.x.i0(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            com.amazon.aps.iva.ab.x.i0(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.h = r7
            r0.i = r2
            r0.j = r6
            r0.l = r3
            java.lang.Object r4 = r4.N(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.se0.d.c(com.amazon.aps.iva.se0.j1[], com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
