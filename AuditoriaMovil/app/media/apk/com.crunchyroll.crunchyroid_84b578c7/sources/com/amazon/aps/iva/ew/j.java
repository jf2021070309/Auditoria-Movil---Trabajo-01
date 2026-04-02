package com.amazon.aps.iva.ew;

import com.amazon.aps.iva.t50.c;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: ContentExpirationProvider.kt */
/* loaded from: classes2.dex */
public final class j implements i {
    public final com.amazon.aps.iva.ew.b b;
    public final com.amazon.aps.iva.t50.c c;

    /* compiled from: ContentExpirationProvider.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.expiration.ContentExpirationProviderImpl", f = "ContentExpirationProvider.kt", l = {36}, m = "getExpiredContentIds")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public j h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return j.this.m(this);
        }
    }

    /* compiled from: ContentExpirationProvider.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.expiration.ContentExpirationProviderImpl", f = "ContentExpirationProvider.kt", l = {25}, m = "isExpired")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public j h;
        public /* synthetic */ Object i;
        public int k;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return j.this.q(null, this);
        }
    }

    /* compiled from: ContentExpirationProvider.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.expiration.ContentExpirationProviderImpl", f = "ContentExpirationProvider.kt", l = {29}, m = "verifyExpiration")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public e0 h;
        public /* synthetic */ Object i;
        public int k;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return j.this.p(null, this);
        }
    }

    public j(com.amazon.aps.iva.ew.c cVar) {
        c.b bVar = c.b.a;
        this.b = cVar;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[LOOP:1: B:28:0x0081->B:30:0x0087, LOOP_END] */
    @Override // com.amazon.aps.iva.ew.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.amazon.aps.iva.ob0.d<? super java.util.List<java.lang.String>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.ew.j.a
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.ew.j$a r0 = (com.amazon.aps.iva.ew.j.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.ew.j$a r0 = new com.amazon.aps.iva.ew.j$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.ew.j r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L42
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            com.amazon.aps.iva.ab.x.i0(r9)
            r0.h = r8
            r0.k = r3
            com.amazon.aps.iva.ew.b r9 = r8.b
            java.lang.Object r9 = r9.readAllItems(r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            r0 = r8
        L42:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L4d:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L74
            java.lang.Object r2 = r9.next()
            r4 = r2
            com.amazon.aps.iva.ew.a r4 = (com.amazon.aps.iva.ew.a) r4
            r0.getClass()
            long r4 = r4.b()
            com.amazon.aps.iva.t50.c r6 = r0.c
            long r6 = r6.a()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L6d
            r4 = r3
            goto L6e
        L6d:
            r4 = 0
        L6e:
            if (r4 == 0) goto L4d
            r1.add(r2)
            goto L4d
        L74:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r0 = com.amazon.aps.iva.lb0.r.Y(r1)
            r9.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L81:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r0.next()
            com.amazon.aps.iva.ew.a r1 = (com.amazon.aps.iva.ew.a) r1
            java.lang.String r1 = r1.a()
            r9.add(r1)
            goto L81
        L95:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ew.j.m(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.ew.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(com.ellation.crunchyroll.downloading.e0 r5, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.downloading.e0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.ew.j.c
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.ew.j$c r0 = (com.amazon.aps.iva.ew.j.c) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.ew.j$c r0 = new com.amazon.aps.iva.ew.j$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.ellation.crunchyroll.downloading.e0 r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            boolean r6 = r5.i()
            if (r6 == 0) goto L57
            java.lang.String r6 = r5.e()
            r0.h = r5
            r0.k = r3
            java.lang.Object r6 = r4.q(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L57
            com.ellation.crunchyroll.downloading.e0$b r6 = com.ellation.crunchyroll.downloading.e0.b.EXPIRED
            com.ellation.crunchyroll.downloading.e0 r5 = r5.n(r6)
        L57:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ew.j.p(com.ellation.crunchyroll.downloading.e0, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r5 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    @Override // com.amazon.aps.iva.ew.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.ew.j.b
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.ew.j$b r0 = (com.amazon.aps.iva.ew.j.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.ew.j$b r0 = new com.amazon.aps.iva.ew.j$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.ew.j r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r4
            r0.k = r3
            com.amazon.aps.iva.ew.b r6 = r4.b
            java.lang.Object r6 = r6.readItem(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            com.amazon.aps.iva.ew.a r6 = (com.amazon.aps.iva.ew.a) r6
            r0 = 0
            if (r6 == 0) goto L5e
            r5.getClass()
            long r1 = r6.b()
            com.amazon.aps.iva.t50.c r5 = r5.c
            long r5 = r5.a()
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 > 0) goto L5a
            r5 = r3
            goto L5b
        L5a:
            r5 = r0
        L5b:
            if (r5 == 0) goto L5e
            goto L5f
        L5e:
            r3 = r0
        L5f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ew.j.q(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
