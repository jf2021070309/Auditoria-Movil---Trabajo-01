package com.amazon.aps.iva.ew;

import com.amazon.aps.iva.bw.m;
import com.amazon.aps.iva.bw.n;
import com.amazon.aps.iva.sv.o2;
import com.amazon.aps.iva.t50.c;
import com.ellation.crunchyroll.downloading.e0;
import java.util.List;
/* compiled from: ContentExpirationInteractor.kt */
/* loaded from: classes2.dex */
public final class e implements d, i {
    public final m b;
    public final com.amazon.aps.iva.ew.b c;
    public final i d;
    public final com.amazon.aps.iva.t50.c e;
    public final o2 f;

    /* compiled from: ContentExpirationInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.expiration.ContentExpirationInteractorImpl", f = "ContentExpirationInteractor.kt", l = {26, 32}, m = "saveItemAfterDownloadComplete")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public e h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return e.this.P1(null, this);
        }
    }

    /* compiled from: ContentExpirationInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.expiration.ContentExpirationInteractorImpl", f = "ContentExpirationInteractor.kt", l = {36, 37, 44}, m = "saveItemAfterPlayback")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public e h;
        public String i;
        public com.amazon.aps.iva.ew.a j;
        public /* synthetic */ Object k;
        public int m;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return e.this.E1(null, this);
        }
    }

    public e(n nVar, c cVar, j jVar) {
        c.b bVar = c.b.a;
        com.amazon.aps.iva.zv.b bVar2 = com.amazon.aps.iva.sv.e.e;
        if (bVar2 != null) {
            o2 h = bVar2.h();
            com.amazon.aps.iva.yb0.j.f(h, "configuration");
            this.b = nVar;
            this.c = cVar;
            this.d = jVar;
            this.e = bVar;
            this.f = h;
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    @Override // com.amazon.aps.iva.ew.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E1(java.lang.String r12, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.amazon.aps.iva.ew.e.b
            if (r0 == 0) goto L13
            r0 = r13
            com.amazon.aps.iva.ew.e$b r0 = (com.amazon.aps.iva.ew.e.b) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.ew.e$b r0 = new com.amazon.aps.iva.ew.e$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.amazon.aps.iva.ab.x.i0(r13)
            goto Lbc
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            com.amazon.aps.iva.ew.a r12 = r0.j
            java.lang.String r2 = r0.i
            com.amazon.aps.iva.ew.e r4 = r0.h
            com.amazon.aps.iva.ab.x.i0(r13)
            goto L75
        L40:
            java.lang.String r12 = r0.i
            com.amazon.aps.iva.ew.e r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r13)
            goto L5b
        L48:
            com.amazon.aps.iva.ab.x.i0(r13)
            r0.h = r11
            r0.i = r12
            r0.m = r5
            com.amazon.aps.iva.ew.b r13 = r11.c
            java.lang.Object r13 = r13.readItem(r12, r0)
            if (r13 != r1) goto L5a
            return r1
        L5a:
            r2 = r11
        L5b:
            com.amazon.aps.iva.ew.a r13 = (com.amazon.aps.iva.ew.a) r13
            if (r13 == 0) goto Lbc
            com.amazon.aps.iva.bw.m r5 = r2.b
            r0.h = r2
            r0.i = r12
            r0.j = r13
            r0.m = r4
            java.lang.Object r4 = r5.a(r12, r0)
            if (r4 != r1) goto L70
            return r1
        L70:
            r10 = r2
            r2 = r12
            r12 = r13
            r13 = r4
            r4 = r10
        L75:
            com.amazon.aps.iva.bw.l r13 = (com.amazon.aps.iva.bw.l) r13
            if (r13 == 0) goto L8c
            com.amazon.aps.iva.ew.a r5 = new com.amazon.aps.iva.ew.a
            com.amazon.aps.iva.t50.c r6 = r4.e
            long r6 = r6.a()
            long r8 = r13.b
            long r8 = com.amazon.aps.iva.gr.n.z(r8)
            long r8 = r8 + r6
            r5.<init>(r2, r8)
            goto L9e
        L8c:
            com.amazon.aps.iva.ew.a r5 = new com.amazon.aps.iva.ew.a
            com.amazon.aps.iva.t50.c r13 = r4.e
            long r6 = r13.a()
            com.amazon.aps.iva.sv.o2 r13 = r4.f
            long r8 = r13.g()
            long r8 = r8 + r6
            r5.<init>(r2, r8)
        L9e:
            long r6 = r5.b()
            long r12 = r12.b()
            int r12 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r12 >= 0) goto Lbc
            com.amazon.aps.iva.ew.b r12 = r4.c
            r13 = 0
            r0.h = r13
            r0.i = r13
            r0.j = r13
            r0.m = r3
            java.lang.Object r12 = r12.saveItem(r5, r0)
            if (r12 != r1) goto Lbc
            return r1
        Lbc:
            com.amazon.aps.iva.kb0.q r12 = com.amazon.aps.iva.kb0.q.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ew.e.E1(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[RETURN] */
    @Override // com.amazon.aps.iva.ew.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P1(java.lang.String r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.amazon.aps.iva.ew.e.a
            if (r0 == 0) goto L13
            r0 = r11
            com.amazon.aps.iva.ew.e$a r0 = (com.amazon.aps.iva.ew.e.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.ew.e$a r0 = new com.amazon.aps.iva.ew.e$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L86
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            java.lang.String r10 = r0.i
            com.amazon.aps.iva.ew.e r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L4d
        L3a:
            com.amazon.aps.iva.ab.x.i0(r11)
            r0.h = r9
            r0.i = r10
            r0.l = r4
            com.amazon.aps.iva.bw.m r11 = r9.b
            java.lang.Object r11 = r11.a(r10, r0)
            if (r11 != r1) goto L4c
            return r1
        L4c:
            r2 = r9
        L4d:
            com.amazon.aps.iva.bw.l r11 = (com.amazon.aps.iva.bw.l) r11
            if (r11 == 0) goto L64
            com.amazon.aps.iva.ew.a r4 = new com.amazon.aps.iva.ew.a
            com.amazon.aps.iva.t50.c r5 = r2.e
            long r5 = r5.a()
            long r7 = r11.a
            long r7 = com.amazon.aps.iva.gr.n.z(r7)
            long r7 = r7 + r5
            r4.<init>(r10, r7)
            goto L76
        L64:
            com.amazon.aps.iva.ew.a r4 = new com.amazon.aps.iva.ew.a
            com.amazon.aps.iva.t50.c r11 = r2.e
            long r5 = r11.a()
            com.amazon.aps.iva.sv.o2 r11 = r2.f
            long r7 = r11.i()
            long r7 = r7 + r5
            r4.<init>(r10, r7)
        L76:
            com.amazon.aps.iva.ew.b r10 = r2.c
            r11 = 0
            r0.h = r11
            r0.i = r11
            r0.l = r3
            java.lang.Object r10 = r10.saveItem(r4, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ew.e.P1(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
    }

    @Override // com.amazon.aps.iva.ew.i
    public final Object m(com.amazon.aps.iva.ob0.d<? super List<String>> dVar) {
        return this.d.m(dVar);
    }

    @Override // com.amazon.aps.iva.ew.i
    public final Object p(e0 e0Var, com.amazon.aps.iva.ob0.d<? super e0> dVar) {
        return this.d.p(e0Var, dVar);
    }

    @Override // com.amazon.aps.iva.ew.i
    public final Object q(String str, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
        return this.d.q(str, dVar);
    }
}
