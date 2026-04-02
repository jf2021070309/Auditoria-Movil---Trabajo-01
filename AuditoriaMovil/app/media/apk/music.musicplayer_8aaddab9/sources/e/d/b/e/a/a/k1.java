package e.d.b.e.a.a;
/* loaded from: classes2.dex */
public final class k1 {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("ExtractorTaskFinder");

    /* renamed from: b  reason: collision with root package name */
    public final h1 f6827b;

    /* renamed from: c  reason: collision with root package name */
    public final z f6828c;

    /* renamed from: d  reason: collision with root package name */
    public final f0 f6829d;

    public k1(h1 h1Var, z zVar, f0 f0Var) {
        this.f6827b = h1Var;
        this.f6828c = zVar;
        this.f6829d = f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x042b, code lost:
        if (r0 != null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0224, code lost:
        r0 = e.d.b.e.a.a.k1.a;
        r4 = new java.lang.Object[r5];
        r4[r7] = java.lang.Integer.valueOf(r9.a);
        r4[1] = r9.f6773c.a;
        r4[r6] = r11.a;
        r0.a(r5, "Found extraction task for patch for session %s, pack %s, slice %s.", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0240, code lost:
        r4 = r32.f6828c;
        r10 = r9.f6773c;
        r0 = new java.io.FileInputStream(r4.l(r10.a, r9.f6772b, r10.f6754b, r11.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x025f, code lost:
        r10 = r9.a;
        r12 = r9.f6773c;
        r4 = new e.d.b.e.a.a.m0(r10, r12.a, r9.f6772b, r12.f6754b, r11.a, 0, 0, 1, r12.f6756d, r12.f6755c, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x028e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x028f, code lost:
        r3 = new java.lang.Object[r5];
        r3[0] = java.lang.Integer.valueOf(r9.a);
        r3[1] = r9.f6773c.a;
        r3[2] = r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b3, code lost:
        throw new e.d.b.e.a.a.p0(java.lang.String.format("Error finding patch, session %s packName %s sliceId %s", r3), r0, r9.a);
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e.d.b.e.a.a.j1 a() {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.b.e.a.a.k1.a():e.d.b.e.a.a.j1");
    }

    public final boolean b(e1 e1Var, f1 f1Var) {
        z zVar = this.f6828c;
        d1 d1Var = e1Var.f6773c;
        return zVar.l(d1Var.a, e1Var.f6772b, d1Var.f6754b, f1Var.a).exists();
    }
}
