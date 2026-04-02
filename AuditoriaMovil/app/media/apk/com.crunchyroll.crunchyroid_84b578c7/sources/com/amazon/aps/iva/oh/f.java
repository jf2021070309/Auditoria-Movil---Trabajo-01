package com.amazon.aps.iva.oh;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import java.util.List;
/* compiled from: MarkAsWatchedToggleInteractor.kt */
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.wy.i implements e {
    public final EtpContentService b;
    public final com.amazon.aps.iva.nz.b c;

    /* compiled from: MarkAsWatchedToggleInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.markaswatched.toggle.MarkAsWatchedToggleInteractorImpl", f = "MarkAsWatchedToggleInteractor.kt", l = {28}, m = "markAsWatched")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public f h;
        public List i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return f.this.T(null, this);
        }
    }

    /* compiled from: MarkAsWatchedToggleInteractor.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nz.a, CharSequence> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(com.amazon.aps.iva.nz.a aVar) {
            com.amazon.aps.iva.nz.a aVar2 = aVar;
            j.f(aVar2, "it");
            return aVar2.a;
        }
    }

    /* compiled from: MarkAsWatchedToggleInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.markaswatched.toggle.MarkAsWatchedToggleInteractorImpl", f = "MarkAsWatchedToggleInteractor.kt", l = {35}, m = "markParentAsWatched")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public f h;
        public List i;
        public /* synthetic */ Object j;
        public int l;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return f.this.O1(null, this);
        }
    }

    /* compiled from: MarkAsWatchedToggleInteractor.kt */
    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nz.a, CharSequence> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(com.amazon.aps.iva.nz.a aVar) {
            com.amazon.aps.iva.nz.a aVar2 = aVar;
            j.f(aVar2, "it");
            return aVar2.b;
        }
    }

    public f(EtpContentService etpContentService, com.amazon.aps.iva.nz.b bVar) {
        j.f(etpContentService, "etpContentService");
        this.b = etpContentService;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.amazon.aps.iva.oh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O1(java.util.List<com.amazon.aps.iva.nz.a> r11, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.oh.f.c
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.oh.f$c r0 = (com.amazon.aps.iva.oh.f.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.oh.f$c r0 = new com.amazon.aps.iva.oh.f$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.List r11 = r0.i
            java.util.List r11 = (java.util.List) r11
            com.amazon.aps.iva.oh.f r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L5a
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            com.amazon.aps.iva.ab.x.i0(r12)
            r4 = r11
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            com.amazon.aps.iva.oh.f$d r8 = com.amazon.aps.iva.oh.f.d.h
            r9 = 30
            java.lang.String r12 = com.amazon.aps.iva.lb0.x.B0(r4, r5, r6, r7, r8, r9)
            r0.h = r10
            r2 = r11
            java.util.List r2 = (java.util.List) r2
            r0.i = r2
            r0.l = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r10.b
            java.lang.Object r12 = r2.markAsWatched(r12, r0)
            if (r12 != r1) goto L59
            return r1
        L59:
            r0 = r10
        L5a:
            com.amazon.aps.iva.nz.b r12 = r0.c
            java.util.Collection r11 = (java.util.Collection) r11
            r0 = 0
            com.amazon.aps.iva.nz.a[] r0 = new com.amazon.aps.iva.nz.a[r0]
            java.lang.Object[] r11 = r11.toArray(r0)
            com.amazon.aps.iva.nz.a[] r11 = (com.amazon.aps.iva.nz.a[]) r11
            int r0 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r0)
            com.amazon.aps.iva.nz.a[] r11 = (com.amazon.aps.iva.nz.a[]) r11
            r12.b(r11)
            com.amazon.aps.iva.kb0.q r11 = com.amazon.aps.iva.kb0.q.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oh.f.O1(java.util.List, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.amazon.aps.iva.oh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(java.util.List<com.amazon.aps.iva.nz.a> r11, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.oh.f.a
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.oh.f$a r0 = (com.amazon.aps.iva.oh.f.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.oh.f$a r0 = new com.amazon.aps.iva.oh.f$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.List r11 = r0.i
            java.util.List r11 = (java.util.List) r11
            com.amazon.aps.iva.oh.f r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L5a
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            com.amazon.aps.iva.ab.x.i0(r12)
            r4 = r11
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            com.amazon.aps.iva.oh.f$b r8 = com.amazon.aps.iva.oh.f.b.h
            r9 = 30
            java.lang.String r12 = com.amazon.aps.iva.lb0.x.B0(r4, r5, r6, r7, r8, r9)
            r0.h = r10
            r2 = r11
            java.util.List r2 = (java.util.List) r2
            r0.i = r2
            r0.l = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r10.b
            java.lang.Object r12 = r2.markAsWatched(r12, r0)
            if (r12 != r1) goto L59
            return r1
        L59:
            r0 = r10
        L5a:
            com.amazon.aps.iva.nz.b r12 = r0.c
            java.util.Collection r11 = (java.util.Collection) r11
            r0 = 0
            com.amazon.aps.iva.nz.a[] r0 = new com.amazon.aps.iva.nz.a[r0]
            java.lang.Object[] r11 = r11.toArray(r0)
            com.amazon.aps.iva.nz.a[] r11 = (com.amazon.aps.iva.nz.a[]) r11
            int r0 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r0)
            com.amazon.aps.iva.nz.a[] r11 = (com.amazon.aps.iva.nz.a[]) r11
            r12.b(r11)
            com.amazon.aps.iva.kb0.q r11 = com.amazon.aps.iva.kb0.q.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oh.f.T(java.util.List, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
