package com.amazon.aps.iva.mt;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.j0;
/* compiled from: ContinueWatchingCarousel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.cards.continuewatching.ContinueWatchingCarousel$Content$1$3", f = "ContinueWatchingCarousel.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ com.amazon.aps.iva.e0.g0 i;
    public final /* synthetic */ i j;

    /* compiled from: ContinueWatchingCarousel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Integer> {
        public final /* synthetic */ com.amazon.aps.iva.e0.g0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.e0.g0 g0Var) {
            super(0);
            this.h = g0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Integer invoke() {
            return Integer.valueOf(this.h.a.a.t());
        }
    }

    /* compiled from: ContinueWatchingCarousel.kt */
    /* loaded from: classes2.dex */
    public static final class b implements com.amazon.aps.iva.ve0.g<Integer> {
        public final /* synthetic */ i b;

        public b(i iVar) {
            this.b = iVar;
        }

        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(Integer num, com.amazon.aps.iva.ob0.d dVar) {
            this.b.setScrollPosition(new k(num.intValue(), false));
            return q.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes2.dex */
    public static final class c implements com.amazon.aps.iva.ve0.f<Integer> {
        public final /* synthetic */ com.amazon.aps.iva.ve0.f b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes2.dex */
        public static final class a<T> implements com.amazon.aps.iva.ve0.g {
            public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

            /* compiled from: Emitters.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.cards.continuewatching.ContinueWatchingCarousel$Content$1$3$invokeSuspend$$inlined$filter$1$2", f = "ContinueWatchingCarousel.kt", l = {223}, m = "emit")
            /* renamed from: com.amazon.aps.iva.mt.h$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0521a extends com.amazon.aps.iva.qb0.c {
                public /* synthetic */ Object h;
                public int i;

                public C0521a(com.amazon.aps.iva.ob0.d dVar) {
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
            public final java.lang.Object a(java.lang.Object r5, com.amazon.aps.iva.ob0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.amazon.aps.iva.mt.h.c.a.C0521a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.amazon.aps.iva.mt.h$c$a$a r0 = (com.amazon.aps.iva.mt.h.c.a.C0521a) r0
                    int r1 = r0.i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.i = r1
                    goto L18
                L13:
                    com.amazon.aps.iva.mt.h$c$a$a r0 = new com.amazon.aps.iva.mt.h$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.h
                    com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r2 = r0.i
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    com.amazon.aps.iva.ab.x.i0(r6)
                    goto L4b
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    com.amazon.aps.iva.ab.x.i0(r6)
                    r6 = r5
                    java.lang.Number r6 = (java.lang.Number) r6
                    int r6 = r6.intValue()
                    if (r6 <= 0) goto L3d
                    r6 = r3
                    goto L3e
                L3d:
                    r6 = 0
                L3e:
                    if (r6 == 0) goto L4b
                    r0.i = r3
                    com.amazon.aps.iva.ve0.g r6 = r4.b
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.mt.h.c.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
            }
        }

        public c(j0 j0Var) {
            this.b = j0Var;
        }

        @Override // com.amazon.aps.iva.ve0.f
        public final Object c(com.amazon.aps.iva.ve0.g<? super Integer> gVar, com.amazon.aps.iva.ob0.d dVar) {
            Object c = this.b.c(new a(gVar), dVar);
            if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return c;
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.amazon.aps.iva.e0.g0 g0Var, i iVar, com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(2, dVar);
        this.i = g0Var;
        this.j = iVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new h(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((h) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            com.amazon.aps.iva.ve0.f m = com.amazon.aps.iva.dg.b.m(new c(com.amazon.aps.iva.cq.b.m0(new a(this.i))));
            b bVar = new b(this.j);
            this.h = 1;
            if (m.c(bVar, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
