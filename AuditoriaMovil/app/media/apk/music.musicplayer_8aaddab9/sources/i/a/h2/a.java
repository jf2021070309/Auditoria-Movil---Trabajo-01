package i.a.h2;

import ch.qos.logback.classic.Level;
/* loaded from: classes2.dex */
public final class a<T> implements b<T> {
    public final b<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final h.o.b.l<T, Object> f8998b;

    /* renamed from: c  reason: collision with root package name */
    public final h.o.b.p<Object, Object, Boolean> f8999c;

    /* renamed from: i.a.h2.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0204a implements c<T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h.o.c.q f9000b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c f9001c;

        @h.m.i.a.e(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$$inlined$collect$1", f = "Distinct.kt", l = {139}, m = "emit")
        /* renamed from: i.a.h2.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0205a extends h.m.i.a.c {
            public /* synthetic */ Object a;

            /* renamed from: b  reason: collision with root package name */
            public int f9002b;

            public C0205a(h.m.d dVar) {
                super(dVar);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.f9002b |= Level.ALL_INT;
                return C0204a.this.b(null, this);
            }
        }

        public C0204a(h.o.c.q qVar, c cVar) {
            this.f9000b = qVar;
            this.f9001c = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // i.a.h2.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(T r6, h.m.d<? super h.k> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof i.a.h2.a.C0204a.C0205a
                if (r0 == 0) goto L13
                r0 = r7
                i.a.h2.a$a$a r0 = (i.a.h2.a.C0204a.C0205a) r0
                int r1 = r0.f9002b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f9002b = r1
                goto L18
            L13:
                i.a.h2.a$a$a r0 = new i.a.h2.a$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.a
                h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
                int r2 = r0.f9002b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                e.j.d.w.E0(r7)
                goto L61
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                e.j.d.w.E0(r7)
                i.a.h2.a r7 = i.a.h2.a.this
                h.o.b.l<T, java.lang.Object> r7 = r7.f8998b
                java.lang.Object r7 = r7.invoke(r6)
                h.o.c.q r2 = r5.f9000b
                T r2 = r2.a
                i.a.i2.q r4 = i.a.h2.w.g.a
                if (r2 == r4) goto L52
                i.a.h2.a r4 = i.a.h2.a.this
                h.o.b.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f8999c
                java.lang.Object r2 = r4.i(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L61
            L52:
                h.o.c.q r2 = r5.f9000b
                r2.a = r7
                i.a.h2.c r7 = r5.f9001c
                r0.f9002b = r3
                java.lang.Object r6 = r7.b(r6, r0)
                if (r6 != r1) goto L61
                return r1
            L61:
                h.k r6 = h.k.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: i.a.h2.a.C0204a.b(java.lang.Object, h.m.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(b<? extends T> bVar, h.o.b.l<? super T, ? extends Object> lVar, h.o.b.p<Object, Object, Boolean> pVar) {
        this.a = bVar;
        this.f8998b = lVar;
        this.f8999c = pVar;
    }

    @Override // i.a.h2.b
    public Object a(c<? super T> cVar, h.m.d<? super h.k> dVar) {
        h.o.c.q qVar = new h.o.c.q();
        qVar.a = (T) i.a.h2.w.g.a;
        Object a = this.a.a(new C0204a(qVar, cVar), dVar);
        return a == h.m.h.a.COROUTINE_SUSPENDED ? a : h.k.a;
    }
}
