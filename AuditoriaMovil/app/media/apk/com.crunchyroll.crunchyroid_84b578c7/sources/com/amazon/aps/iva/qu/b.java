package com.amazon.aps.iva.qu;

import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
/* compiled from: CommentsEntryPointInteractor.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.a implements com.amazon.aps.iva.qu.a {
    public final TalkboxService b;

    /* compiled from: CommentsEntryPointInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.entrypoint.CommentsEntryPointInteractorImpl", f = "CommentsEntryPointInteractor.kt", l = {30}, m = "getGuestbooks")
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
            return b.this.Z(null, this);
        }
    }

    /* compiled from: CommentsEntryPointInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.entrypoint.CommentsEntryPointInteractorImpl", f = "CommentsEntryPointInteractor.kt", l = {25}, m = "getNumberOfComments")
    /* renamed from: com.amazon.aps.iva.qu.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0656b extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public C0656b(com.amazon.aps.iva.ob0.d<? super C0656b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return b.this.U(null, this);
        }
    }

    public b(TalkboxService talkboxService) {
        this.b = talkboxService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.qu.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super java.lang.Integer> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.qu.b.C0656b
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.qu.b$b r0 = (com.amazon.aps.iva.qu.b.C0656b) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.qu.b$b r0 = new com.amazon.aps.iva.qu.b$b
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
            com.ellation.crunchyroll.api.etp.commenting.TalkboxService r6 = r4.b
            java.lang.Object r6 = r6.getGuestbook(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.ellation.crunchyroll.api.etp.commenting.model.Guestbook r6 = (com.ellation.crunchyroll.api.etp.commenting.model.Guestbook) r6
            int r5 = r6.getTotalComments()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qu.b.U(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.qu.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z(java.lang.String[] r11, com.amazon.aps.iva.ob0.d<? super java.util.List<com.ellation.crunchyroll.api.etp.commenting.model.Guestbook>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.qu.b.a
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.qu.b$a r0 = (com.amazon.aps.iva.qu.b.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.qu.b$a r0 = new com.amazon.aps.iva.qu.b$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L49
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            com.amazon.aps.iva.ab.x.i0(r12)
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r4 = r11
            java.lang.String r11 = com.amazon.aps.iva.lb0.o.V(r4, r5, r6, r7, r8, r9)
            r0.j = r3
            com.ellation.crunchyroll.api.etp.commenting.TalkboxService r12 = r10.b
            java.lang.Object r12 = r12.getGuestbooks(r11, r0)
            if (r12 != r1) goto L49
            return r1
        L49:
            com.ellation.crunchyroll.api.etp.model.ApiCollection r12 = (com.ellation.crunchyroll.api.etp.model.ApiCollection) r12
            java.util.List r11 = r12.getItems()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qu.b.Z(java.lang.String[], com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
