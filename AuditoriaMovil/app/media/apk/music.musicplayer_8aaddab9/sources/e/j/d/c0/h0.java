package e.j.d.c0;
/* loaded from: classes2.dex */
public final class h0 {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public long f8644b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8645c;

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.TimeCappingSuspendable$runWithCapping$3", f = "TimeCappingSuspendable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.h implements h.o.b.l<h.m.d<? super h.k>, Object> {
        public a(h.m.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(h.m.d<?> dVar) {
            return new a(dVar);
        }

        @Override // h.o.b.l
        public Object invoke(h.m.d<? super h.k> dVar) {
            new a(dVar);
            h.k kVar = h.k.a;
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            e.j.d.w.E0(kVar);
            return kVar;
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            e.j.d.w.E0(obj);
            return h.k.a;
        }
    }

    public h0(long j2, long j3, boolean z) {
        this.a = j2;
        this.f8644b = j3;
        this.f8645c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.o.b.l<? super h.m.d<? super h.k>, ? extends java.lang.Object> r10, h.m.d<? super h.k> r11) {
        /*
            r9 = this;
            e.j.d.c0.h0$a r0 = new e.j.d.c0.h0$a
            r1 = 0
            r0.<init>(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r9.a
            r5 = 0
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L14
            goto L22
        L14:
            long r6 = r9.f8644b
            long r1 = r1 - r6
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L24
            boolean r1 = r9.f8645c
            if (r1 == 0) goto L22
            r9.b()
        L22:
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L33
            java.lang.Object r10 = r10.invoke(r11)
            h.m.h.a r11 = h.m.h.a.COROUTINE_SUSPENDED
            if (r10 != r11) goto L30
            goto L67
        L30:
            h.k r10 = h.k.a
            goto L67
        L33:
            java.lang.String r10 = "TimeCapping"
            n.a.a$c r10 = n.a.a.b(r10)
            java.lang.String r1 = "Skipped due to capping. Next in "
            java.lang.StringBuilder r1 = e.a.d.a.a.y(r1)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = r9.f8644b
            long r6 = r9.a
            long r3 = r3 + r6
            long r6 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r6
            long r2 = r2.toSeconds(r3)
            r1.append(r2)
            java.lang.String r2 = "sec."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r10.g(r1, r2)
            r0.invoke(r11)
            h.k r10 = h.k.a
            h.m.h.a r11 = h.m.h.a.COROUTINE_SUSPENDED
        L67:
            h.m.h.a r11 = h.m.h.a.COROUTINE_SUSPENDED
            if (r10 != r11) goto L6c
            return r10
        L6c:
            h.k r10 = h.k.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.h0.a(h.o.b.l, h.m.d):java.lang.Object");
    }

    public final void b() {
        this.f8644b = System.currentTimeMillis();
    }
}
