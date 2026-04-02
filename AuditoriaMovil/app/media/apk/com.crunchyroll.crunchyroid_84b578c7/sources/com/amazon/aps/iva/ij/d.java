package com.amazon.aps.iva.ij;

import com.amazon.aps.iva.kb0.q;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.ve0.f<b> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.f b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.data.PlaybackStateProviderImpl$special$$inlined$map$1$2", f = "PlaybackStateProvider.kt", l = {223}, m = "emit")
        /* renamed from: com.amazon.aps.iva.ij.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0377a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;

            public C0377a(com.amazon.aps.iva.ob0.d dVar) {
                super(dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                this.h = obj;
                this.i |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(com.amazon.aps.iva.ve0.g gVar) {
            this.b = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // com.amazon.aps.iva.ve0.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r9, com.amazon.aps.iva.ob0.d r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.amazon.aps.iva.ij.d.a.C0377a
                if (r0 == 0) goto L13
                r0 = r10
                com.amazon.aps.iva.ij.d$a$a r0 = (com.amazon.aps.iva.ij.d.a.C0377a) r0
                int r1 = r0.i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i = r1
                goto L18
            L13:
                com.amazon.aps.iva.ij.d$a$a r0 = new com.amazon.aps.iva.ij.d$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.i
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r10)
                goto L5d
            L27:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L2f:
                com.amazon.aps.iva.ab.x.i0(r10)
                com.amazon.aps.iva.nk.j r9 = (com.amazon.aps.iva.nk.j) r9
                com.amazon.aps.iva.ij.b r10 = new com.amazon.aps.iva.ij.b
                com.amazon.aps.iva.nk.c r2 = r9.m
                boolean r2 = r2.b
                com.amazon.aps.iva.nk.e r4 = com.amazon.aps.iva.nk.e.END_OF_MEDIA_ITEM
                r5 = 0
                com.amazon.aps.iva.nk.e r6 = r9.g
                if (r6 != r4) goto L43
                r4 = r3
                goto L44
            L43:
                r4 = r5
            L44:
                com.amazon.aps.iva.nk.e r7 = com.amazon.aps.iva.nk.e.BUFFERING
                if (r6 == r7) goto L4c
                com.amazon.aps.iva.nk.e r7 = com.amazon.aps.iva.nk.e.VIDEO_SETTING_CHANGE
                if (r6 != r7) goto L4d
            L4c:
                r5 = r3
            L4d:
                boolean r9 = r9.a
                r10.<init>(r2, r9, r4, r5)
                r0.i = r3
                com.amazon.aps.iva.ve0.g r9 = r8.b
                java.lang.Object r9 = r9.a(r10, r0)
                if (r9 != r1) goto L5d
                return r1
            L5d:
                com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ij.d.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public d(com.amazon.aps.iva.ve0.f fVar) {
        this.b = fVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super b> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return q.a;
    }
}
