package com.amazon.aps.iva.sv;
/* compiled from: SkipEventsDownloader.kt */
/* loaded from: classes2.dex */
public final class r2 implements q2 {
    public final com.amazon.aps.iva.ow.a a;
    public final com.amazon.aps.iva.fg.e b;
    public final com.amazon.aps.iva.se0.g0 c;

    /* compiled from: SkipEventsDownloader.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.SkipEventsDownloaderImpl", f = "SkipEventsDownloader.kt", l = {29, 30}, m = "download")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public r2 h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return r2.this.a(null, this);
        }
    }

    /* compiled from: SkipEventsDownloader.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.SkipEventsDownloaderImpl$remove$1", f = "SkipEventsDownloader.kt", l = {36}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.ow.a aVar2 = r2.this.a;
                this.h = 1;
                if (aVar2.deleteItem(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public r2(com.amazon.aps.iva.ow.b bVar, s2 s2Var, d dVar) {
        this.a = bVar;
        this.b = s2Var;
        this.c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // com.amazon.aps.iva.sv.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.sv.r2.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.sv.r2$a r0 = (com.amazon.aps.iva.sv.r2.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.r2$a r0 = new com.amazon.aps.iva.sv.r2$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.amazon.aps.iva.sv.r2 r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L49
        L38:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.k = r4
            com.amazon.aps.iva.fg.e r7 = r5.b
            java.lang.Object r7 = r7.getSkipEvents(r6, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r6 = r5
        L49:
            com.ellation.crunchyroll.api.etp.playback.model.SkipEvents r7 = (com.ellation.crunchyroll.api.etp.playback.model.SkipEvents) r7
            if (r7 == 0) goto L5b
            com.amazon.aps.iva.ow.a r6 = r6.a
            r2 = 0
            r0.h = r2
            r0.k = r3
            java.lang.Object r6 = r6.saveItem(r7, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.r2.a(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.sv.q2
    public final void remove(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.se0.i.d(this.c, null, null, new b(str, null), 3);
    }
}
