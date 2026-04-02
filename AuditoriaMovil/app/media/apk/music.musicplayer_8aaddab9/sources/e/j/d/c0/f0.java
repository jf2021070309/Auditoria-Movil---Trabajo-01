package e.j.d.c0;
/* loaded from: classes2.dex */
public final class f0 {
    public static final a a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public final long f8637b;

    /* renamed from: c  reason: collision with root package name */
    public long f8638c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8639d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a(h.o.c.f fVar) {
        }
    }

    public f0(long j2, long j3, boolean z) {
        this.f8637b = j2;
        this.f8638c = j3;
        this.f8639d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(h.o.b.a<h.k> r9, h.o.b.a<h.k> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "onSuccess"
            h.o.c.j.e(r9, r0)
            java.lang.String r0 = "onCapped"
            h.o.c.j.e(r10, r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.f8637b
            r4 = 0
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L18
            goto L26
        L18:
            long r5 = r8.f8638c
            long r0 = r0 - r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L28
            boolean r0 = r8.f8639d
            if (r0 == 0) goto L26
            r8.b()
        L26:
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L2f
            r9.invoke()
            goto L5f
        L2f:
            java.lang.String r9 = "TimeCapping"
            n.a.a$c r9 = n.a.a.b(r9)
            java.lang.String r0 = "Skipped due to capping. Next in "
            java.lang.StringBuilder r0 = e.a.d.a.a.y(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r8.f8638c
            long r5 = r8.f8637b
            long r2 = r2 + r5
            long r5 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r5
            long r1 = r1.toSeconds(r2)
            r0.append(r1)
            java.lang.String r1 = "sec."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r9.g(r0, r1)
            r10.invoke()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.f0.a(h.o.b.a, h.o.b.a):void");
    }

    public final void b() {
        this.f8638c = System.currentTimeMillis();
    }
}
