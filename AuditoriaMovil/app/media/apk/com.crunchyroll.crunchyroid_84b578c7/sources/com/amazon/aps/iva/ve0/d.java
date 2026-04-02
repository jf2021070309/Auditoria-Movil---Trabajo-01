package com.amazon.aps.iva.ve0;

import com.amazon.aps.iva.ve0.k;
/* compiled from: Distinct.kt */
/* loaded from: classes4.dex */
public final class d<T> implements f<T> {
    public final f<T> b;
    public final com.amazon.aps.iva.xb0.l<T, Object> c;
    public final com.amazon.aps.iva.xb0.p<Object, Object, Boolean> d;

    /* compiled from: Distinct.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements g {
        public final /* synthetic */ d<T> b;
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<Object> c;
        public final /* synthetic */ g<T> d;

        /* compiled from: Distinct.kt */
        @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {81}, m = "emit")
        /* renamed from: com.amazon.aps.iva.ve0.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0799a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public final /* synthetic */ a<T> i;
            public int j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0799a(a<? super T> aVar, com.amazon.aps.iva.ob0.d<? super C0799a> dVar) {
                super(dVar);
                this.i = aVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                this.h = obj;
                this.j |= Integer.MIN_VALUE;
                return this.i.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(d<T> dVar, com.amazon.aps.iva.yb0.d0<Object> d0Var, g<? super T> gVar) {
            this.b = dVar;
            this.c = d0Var;
            this.d = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // com.amazon.aps.iva.ve0.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(T r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.amazon.aps.iva.ve0.d.a.C0799a
                if (r0 == 0) goto L13
                r0 = r9
                com.amazon.aps.iva.ve0.d$a$a r0 = (com.amazon.aps.iva.ve0.d.a.C0799a) r0
                int r1 = r0.j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.j = r1
                goto L18
            L13:
                com.amazon.aps.iva.ve0.d$a$a r0 = new com.amazon.aps.iva.ve0.d$a$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.j
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r9)
                goto L61
            L27:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2f:
                com.amazon.aps.iva.ab.x.i0(r9)
                com.amazon.aps.iva.ve0.d<T> r9 = r7.b
                com.amazon.aps.iva.xb0.l<T, java.lang.Object> r2 = r9.c
                java.lang.Object r2 = r2.invoke(r8)
                com.amazon.aps.iva.yb0.d0<java.lang.Object> r4 = r7.c
                T r5 = r4.b
                com.amazon.aps.iva.xe0.s r6 = com.amazon.aps.iva.gr.n.d
                if (r5 == r6) goto L54
                com.amazon.aps.iva.xb0.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r9 = r9.d
                java.lang.Object r9 = r9.invoke(r5, r2)
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L51
                goto L54
            L51:
                com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
                return r8
            L54:
                r4.b = r2
                r0.j = r3
                com.amazon.aps.iva.ve0.g<T> r9 = r7.d
                java.lang.Object r8 = r9.a(r8, r0)
                if (r8 != r1) goto L61
                return r1
            L61:
                com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.d.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public d(f fVar, com.amazon.aps.iva.xb0.p pVar) {
        k.b bVar = k.a;
        this.b = fVar;
        this.c = bVar;
        this.d = pVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(g<? super T> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
        d0Var.b = (T) com.amazon.aps.iva.gr.n.d;
        Object c = this.b.c(new a(this, d0Var, gVar), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
