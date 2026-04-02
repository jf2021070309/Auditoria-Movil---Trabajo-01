package com.amazon.aps.iva.ql;

import com.amazon.aps.iva.kb0.q;
/* compiled from: InternalPlayerSettingsInteractor.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.ql.a, d {
    public final c a;
    public final com.amazon.aps.iva.ml.c b;
    public final d c;

    /* compiled from: InternalPlayerSettingsInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.data.InternalPlayerSettingsInteractorImpl", f = "InternalPlayerSettingsInteractor.kt", l = {51}, m = "updateAutoPlay")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public b h;
        public boolean i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return b.this.c(false, this);
        }
    }

    /* compiled from: InternalPlayerSettingsInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.data.InternalPlayerSettingsInteractorImpl", f = "InternalPlayerSettingsInteractor.kt", l = {45}, m = "updatePreferredQuality")
    /* renamed from: com.amazon.aps.iva.ql.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0648b extends com.amazon.aps.iva.qb0.c {
        public b h;
        public com.amazon.aps.iva.rl.a i;
        public com.amazon.aps.iva.rl.a j;
        public /* synthetic */ Object k;
        public int m;

        public C0648b(com.amazon.aps.iva.ob0.d<? super C0648b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    public b(g gVar, com.amazon.aps.iva.ml.d dVar, e eVar) {
        this.a = gVar;
        this.b = dVar;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.amazon.aps.iva.ql.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.sl.g r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.amazon.aps.iva.ql.b.C0648b
            if (r0 == 0) goto L13
            r0 = r11
            com.amazon.aps.iva.ql.b$b r0 = (com.amazon.aps.iva.ql.b.C0648b) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.ql.b$b r0 = new com.amazon.aps.iva.ql.b$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.amazon.aps.iva.rl.a r10 = r0.j
            com.amazon.aps.iva.rl.a r1 = r0.i
            com.amazon.aps.iva.ql.b r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L8a
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            com.amazon.aps.iva.ab.x.i0(r11)
            com.amazon.aps.iva.ql.c r11 = r9.a
            com.amazon.aps.iva.yy.a r2 = r11.f()
            java.lang.Object r2 = r2.d()
            com.amazon.aps.iva.rl.a r2 = (com.amazon.aps.iva.rl.a) r2
            java.lang.String r4 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r10, r4)
            com.amazon.aps.iva.rl.a r4 = new com.amazon.aps.iva.rl.a
            int r5 = r10.d
            boolean r6 = r10.a
            int r7 = r10.b
            int r8 = r10.c
            r4.<init>(r7, r8, r5, r6)
            com.amazon.aps.iva.yy.a r5 = r11.f()
            java.lang.Object r5 = r5.getValue()
            boolean r5 = com.amazon.aps.iva.yb0.j.a(r5, r4)
            if (r5 == 0) goto L67
            com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
            return r10
        L67:
            com.amazon.aps.iva.yy.a r11 = r11.f()
            com.amazon.aps.iva.rl.a r5 = new com.amazon.aps.iva.rl.a
            int r6 = r10.d
            boolean r7 = r10.a
            int r8 = r10.b
            int r10 = r10.c
            r5.<init>(r8, r10, r6, r7)
            r0.h = r9
            r0.i = r2
            r0.j = r4
            r0.m = r3
            java.lang.Object r10 = r11.a(r5, r0)
            if (r10 != r1) goto L87
            return r1
        L87:
            r0 = r9
            r1 = r2
            r10 = r4
        L8a:
            com.amazon.aps.iva.ml.c r11 = r0.b
            r11.d(r1, r10)
            com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ql.b.a(com.amazon.aps.iva.sl.g, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.ql.d
    public final Object b(String str, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return this.c.b(str, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.amazon.aps.iva.ql.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.ql.b.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.ql.b$a r0 = (com.amazon.aps.iva.ql.b.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.ql.b$a r0 = new com.amazon.aps.iva.ql.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            boolean r6 = r0.i
            com.amazon.aps.iva.ql.b r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L63
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.ql.c r7 = r5.a
            com.amazon.aps.iva.yy.a r2 = r7.a()
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            boolean r2 = com.amazon.aps.iva.yb0.j.a(r2, r4)
            if (r2 == 0) goto L4d
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L4d:
            com.amazon.aps.iva.yy.a r7 = r7.a()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r0.h = r5
            r0.i = r6
            r0.l = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            r0 = r5
        L63:
            com.amazon.aps.iva.ml.c r7 = r0.b
            r7.a(r6)
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ql.b.c(boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.ql.d
    public final Object d(boolean z, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return this.c.d(z, dVar);
    }

    @Override // com.amazon.aps.iva.ql.d
    public final Object e(String str, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return this.c.e(str, dVar);
    }

    @Override // com.amazon.aps.iva.ql.d
    public final Object f(boolean z, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return this.c.f(z, dVar);
    }
}
