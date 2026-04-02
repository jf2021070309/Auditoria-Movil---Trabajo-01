package com.amazon.aps.iva.z3;

import java.util.Iterator;
import java.util.List;
/* compiled from: DataMigrationInitializer.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<Object, com.amazon.aps.iva.ob0.d<Object>, Object> {
    public Iterator h;
    public d i;
    public Object j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ List<d<Object>> m;
    public final /* synthetic */ List<com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object>> n;

    /* compiled from: DataMigrationInitializer.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ d<Object> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<Object> dVar, com.amazon.aps.iva.ob0.d<? super a> dVar2) {
            super(1, dVar2);
            this.i = dVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                this.h = 1;
                if (this.i.cleanUp() == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends d<Object>> list, List<com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object>> list2, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(2, dVar);
        this.m = list;
        this.n = list2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        g gVar = new g(this.m, this.n, dVar);
        gVar.l = obj;
        return gVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(Object obj, com.amazon.aps.iva.ob0.d<Object> dVar) {
        return ((g) create(obj, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0085 -> B:12:0x003d). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r11.k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r11.h
            java.lang.Object r4 = r11.l
            java.util.List r4 = (java.util.List) r4
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L3c
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            java.lang.Object r1 = r11.j
            com.amazon.aps.iva.z3.d r4 = r11.i
            java.util.Iterator r5 = r11.h
            java.lang.Object r6 = r11.l
            java.util.List r6 = (java.util.List) r6
            com.amazon.aps.iva.ab.x.i0(r12)
            r7 = r11
            goto L62
        L2d:
            com.amazon.aps.iva.ab.x.i0(r12)
            java.lang.Object r12 = r11.l
            java.util.List<com.amazon.aps.iva.z3.d<java.lang.Object>> r1 = r11.m
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.List<com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, java.lang.Object>> r4 = r11.n
        L3c:
            r5 = r11
        L3d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L89
            java.lang.Object r6 = r1.next()
            com.amazon.aps.iva.z3.d r6 = (com.amazon.aps.iva.z3.d) r6
            r5.l = r4
            r5.h = r1
            r5.i = r6
            r5.j = r12
            r5.k = r3
            java.lang.Object r7 = r6.b(r12, r5)
            if (r7 != r0) goto L5a
            return r0
        L5a:
            r9 = r1
            r1 = r12
            r12 = r7
            r7 = r5
            r5 = r9
            r10 = r6
            r6 = r4
            r4 = r10
        L62:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L84
            com.amazon.aps.iva.z3.g$a r12 = new com.amazon.aps.iva.z3.g$a
            r8 = 0
            r12.<init>(r4, r8)
            r6.add(r12)
            r7.l = r6
            r7.h = r5
            r7.i = r8
            r7.j = r8
            r7.k = r2
            java.lang.Object r12 = r4.a(r1, r7)
            if (r12 != r0) goto L85
            return r0
        L84:
            r12 = r1
        L85:
            r1 = r5
            r4 = r6
            r5 = r7
            goto L3d
        L89:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
