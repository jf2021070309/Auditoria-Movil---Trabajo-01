package com.amazon.aps.iva.ol;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class h implements com.amazon.aps.iva.ve0.f<List<? extends com.amazon.aps.iva.nl.a>> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.f b;
    public final /* synthetic */ j c;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ com.amazon.aps.iva.ve0.g b;
        public final /* synthetic */ j c;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.audio.chromecast.PlayerAudioSettingsViewModelImpl$special$$inlined$map$1$2", f = "PlayerAudioSettingsViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.amazon.aps.iva.ol.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0579a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;

            public C0579a(com.amazon.aps.iva.ob0.d dVar) {
                super(dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                this.h = obj;
                this.i |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(com.amazon.aps.iva.ve0.g gVar, j jVar) {
            this.b = gVar;
            this.c = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
        @Override // com.amazon.aps.iva.ve0.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r19, com.amazon.aps.iva.ob0.d r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r20
                boolean r2 = r1 instanceof com.amazon.aps.iva.ol.h.a.C0579a
                if (r2 == 0) goto L17
                r2 = r1
                com.amazon.aps.iva.ol.h$a$a r2 = (com.amazon.aps.iva.ol.h.a.C0579a) r2
                int r3 = r2.i
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L17
                int r3 = r3 - r4
                r2.i = r3
                goto L1c
            L17:
                com.amazon.aps.iva.ol.h$a$a r2 = new com.amazon.aps.iva.ol.h$a$a
                r2.<init>(r1)
            L1c:
                java.lang.Object r1 = r2.h
                com.amazon.aps.iva.pb0.a r3 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r4 = r2.i
                r5 = 1
                if (r4 == 0) goto L34
                if (r4 != r5) goto L2c
                com.amazon.aps.iva.ab.x.i0(r1)
                goto Lc5
            L2c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L34:
                com.amazon.aps.iva.ab.x.i0(r1)
                r1 = r19
                com.amazon.aps.iva.ol.k r1 = (com.amazon.aps.iva.ol.k) r1
                com.amazon.aps.iva.ol.j r4 = r0.c
                com.amazon.aps.iva.kh.e r6 = r4.b
                com.amazon.aps.iva.xb0.a<java.lang.Boolean> r4 = r4.d
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.List r8 = r6.getOptions()
                java.util.Iterator r8 = r8.iterator()
            L4e:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto Lb6
                java.lang.Object r9 = r8.next()
                com.amazon.aps.iva.jh.f r9 = (com.amazon.aps.iva.jh.f) r9
                java.util.List<com.amazon.aps.iva.qj.l> r10 = r1.a
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.Iterator r10 = r10.iterator()
            L62:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L7c
                java.lang.Object r11 = r10.next()
                r12 = r11
                com.amazon.aps.iva.qj.l r12 = (com.amazon.aps.iva.qj.l) r12
                java.lang.String r12 = r12.f
                java.lang.String r13 = r9.a()
                boolean r12 = com.amazon.aps.iva.yb0.j.a(r12, r13)
                if (r12 == 0) goto L62
                goto L7d
            L7c:
                r11 = 0
            L7d:
                com.amazon.aps.iva.qj.l r11 = (com.amazon.aps.iva.qj.l) r11
                if (r11 != 0) goto L82
                goto L4e
            L82:
                com.amazon.aps.iva.nl.a r10 = new com.amazon.aps.iva.nl.a
                java.lang.String r13 = r11.c
                java.lang.String r9 = r9.a()
                java.lang.String r14 = r6.getTitleForLanguage(r9)
                boolean r9 = r11.b
                if (r9 == 0) goto La0
                java.lang.Object r9 = r4.invoke()
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto La0
                r15 = r5
                goto La2
            La0:
                r9 = 0
                r15 = r9
            La2:
                java.lang.String r9 = r11.c
                java.lang.String r12 = r1.b
                boolean r16 = com.amazon.aps.iva.yb0.j.a(r9, r12)
                boolean r9 = r11.d
                r12 = r10
                r17 = r9
                r12.<init>(r13, r14, r15, r16, r17)
                r7.add(r10)
                goto L4e
            Lb6:
                java.util.List r1 = com.amazon.aps.iva.lb0.x.X0(r7)
                r2.i = r5
                com.amazon.aps.iva.ve0.g r4 = r0.b
                java.lang.Object r1 = r4.a(r1, r2)
                if (r1 != r3) goto Lc5
                return r3
            Lc5:
                com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ol.h.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public h(com.amazon.aps.iva.ve0.f fVar, j jVar) {
        this.b = fVar;
        this.c = jVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super List<? extends com.amazon.aps.iva.nl.a>> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar, this.c), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return q.a;
    }
}
