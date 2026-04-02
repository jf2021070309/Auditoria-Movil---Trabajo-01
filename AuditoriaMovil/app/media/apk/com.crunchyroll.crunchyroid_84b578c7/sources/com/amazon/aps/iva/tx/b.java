package com.amazon.aps.iva.tx;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.Arrays;
import java.util.Map;
/* compiled from: WatchScreenInteractorImpl.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.bp.b {
    public final com.amazon.aps.iva.o40.c a;

    /* compiled from: WatchScreenInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.features.watchscreen.interactor.WatchScreenInteractorImpl", f = "WatchScreenInteractorImpl.kt", l = {38}, m = "getMovies")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return b.this.g(null, this);
        }
    }

    /* compiled from: WatchScreenInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.features.watchscreen.interactor.WatchScreenInteractorImpl", f = "WatchScreenInteractorImpl.kt", l = {22}, m = "getUpNext")
    /* renamed from: com.amazon.aps.iva.tx.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0750b extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public C0750b(com.amazon.aps.iva.ob0.d<? super C0750b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return b.this.t(this);
        }
    }

    public b(com.amazon.aps.iva.o40.c cVar) {
        j.f(cVar, "showContentInteractor");
        this.a = cVar;
    }

    @Override // com.amazon.aps.iva.bp.b
    public final Object f(com.amazon.aps.iva.ob0.d<? super ContentContainer> dVar) {
        return this.a.f(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.bp.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.ellation.crunchyroll.model.ContentContainer r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.vo.c> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.tx.b.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.tx.b$a r0 = (com.amazon.aps.iva.tx.b.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.tx.b$a r0 = new com.amazon.aps.iva.tx.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.j = r3
            com.amazon.aps.iva.o40.c r6 = r4.a
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.amazon.aps.iva.e00.a r6 = (com.amazon.aps.iva.e00.a) r6
            com.amazon.aps.iva.vo.c r5 = new com.amazon.aps.iva.vo.c
            java.util.List<com.ellation.crunchyroll.model.PlayableAsset> r0 = r6.a
            java.util.Map<java.lang.String, com.ellation.crunchyroll.api.etp.content.model.Playhead> r1 = r6.b
            java.util.Map<java.lang.String, com.ellation.crunchyroll.api.etp.commenting.model.Guestbook> r6 = r6.c
            r5.<init>(r0, r1, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.tx.b.g(com.ellation.crunchyroll.model.ContentContainer, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.bp.b
    public final Object n(String str, com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar) {
        return this.a.n(str, dVar);
    }

    @Override // com.amazon.aps.iva.bp.b
    public final Object o(String[] strArr, com.amazon.aps.iva.ob0.d<? super Map<String, Playhead>> dVar) {
        return this.a.o((String[]) Arrays.copyOf(strArr, strArr.length), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.bp.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.no.b> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.amazon.aps.iva.tx.b.C0750b
            if (r0 == 0) goto L13
            r0 = r11
            com.amazon.aps.iva.tx.b$b r0 = (com.amazon.aps.iva.tx.b.C0750b) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.tx.b$b r0 = new com.amazon.aps.iva.tx.b$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L3d
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2f:
            com.amazon.aps.iva.ab.x.i0(r11)
            r0.j = r3
            com.amazon.aps.iva.o40.c r11 = r10.a
            java.lang.Object r11 = r11.t(r0)
            if (r11 != r1) goto L3d
            return r1
        L3d:
            com.amazon.aps.iva.o00.e r11 = (com.amazon.aps.iva.o00.e) r11
            com.amazon.aps.iva.no.b r9 = new com.amazon.aps.iva.no.b
            com.ellation.crunchyroll.model.PlayableAsset r1 = r11.a
            boolean r2 = r11.b
            boolean r3 = r11.c
            boolean r4 = r11.d
            long r5 = r11.e
            r7 = 0
            r8 = 32
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.tx.b.t(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.bp.b
    public final void u() {
        this.a.u();
    }
}
