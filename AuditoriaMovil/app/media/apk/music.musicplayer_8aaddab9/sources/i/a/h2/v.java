package i.a.h2;

import ch.qos.logback.classic.Level;
/* loaded from: classes2.dex */
public final class v<T> implements c<T> {

    @h.m.i.a.e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {410, 414}, m = "onSubscription")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Object f9046b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f9047c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ v<T> f9048d;

        /* renamed from: e  reason: collision with root package name */
        public int f9049e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v<T> vVar, h.m.d<? super a> dVar) {
            super(dVar);
            this.f9048d = vVar;
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f9047c = obj;
            this.f9049e |= Level.ALL_INT;
            return this.f9048d.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Type inference failed for: r1v1, types: [i.a.h2.w.h, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.m.d<? super h.k> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof i.a.h2.v.a
            if (r0 == 0) goto L13
            r0 = r5
            i.a.h2.v$a r0 = (i.a.h2.v.a) r0
            int r1 = r0.f9049e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9049e = r1
            goto L18
        L13:
            i.a.h2.v$a r0 = new i.a.h2.v$a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f9047c
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r1 = r0.f9049e
            r2 = 1
            if (r1 == 0) goto L46
            if (r1 == r2) goto L34
            r0 = 2
            if (r1 != r0) goto L2c
            e.j.d.w.E0(r5)
        L29:
            h.k r5 = h.k.a
            return r5
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L34:
            java.lang.Object r1 = r0.f9046b
            i.a.h2.w.h r1 = (i.a.h2.w.h) r1
            java.lang.Object r0 = r0.a
            i.a.h2.v r0 = (i.a.h2.v) r0
            e.j.d.w.E0(r5)     // Catch: java.lang.Throwable -> L5a
            r1.releaseIntercepted()
            java.util.Objects.requireNonNull(r0)
            goto L29
        L46:
            e.j.d.w.E0(r5)
            i.a.h2.w.h r1 = new i.a.h2.w.h
            h.m.f r5 = r0.getContext()
            r3 = 0
            r1.<init>(r3, r5)
            r0.a = r4     // Catch: java.lang.Throwable -> L5a
            r0.f9046b = r1     // Catch: java.lang.Throwable -> L5a
            r0.f9049e = r2     // Catch: java.lang.Throwable -> L5a
            throw r3     // Catch: java.lang.Throwable -> L5a
        L5a:
            r5 = move-exception
            r1.releaseIntercepted()
            goto L60
        L5f:
            throw r5
        L60:
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.h2.v.a(h.m.d):java.lang.Object");
    }

    @Override // i.a.h2.c
    public Object b(T t, h.m.d<? super h.k> dVar) {
        throw null;
    }
}
