package com.amazon.aps.iva.hl;

import com.ellation.crunchyroll.api.etp.model.Image;
import java.util.List;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class h0 implements com.amazon.aps.iva.ve0.f<List<? extends Image>> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.f b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.restrictionoverlay.RestrictionOverlayProviderImpl$getThumbnails$$inlined$map$1$2", f = "RestrictionOverlayProvider.kt", l = {223}, m = "emit")
        /* renamed from: com.amazon.aps.iva.hl.h0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0342a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;

            public C0342a(com.amazon.aps.iva.ob0.d dVar) {
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
        public final java.lang.Object a(java.lang.Object r8, com.amazon.aps.iva.ob0.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.amazon.aps.iva.hl.h0.a.C0342a
                if (r0 == 0) goto L13
                r0 = r9
                com.amazon.aps.iva.hl.h0$a$a r0 = (com.amazon.aps.iva.hl.h0.a.C0342a) r0
                int r1 = r0.i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i = r1
                goto L18
            L13:
                com.amazon.aps.iva.hl.h0$a$a r0 = new com.amazon.aps.iva.hl.h0$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.i
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r9)
                goto L72
            L27:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2f:
                com.amazon.aps.iva.ab.x.i0(r9)
                com.amazon.aps.iva.nk.j r8 = (com.amazon.aps.iva.nk.j) r8
                com.amazon.aps.iva.kk.c r8 = r8.h
                java.util.List<com.amazon.aps.iva.qj.a> r8 = r8.n
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.ArrayList r9 = new java.util.ArrayList
                int r2 = com.amazon.aps.iva.lb0.r.Y(r8)
                r9.<init>(r2)
                java.util.Iterator r8 = r8.iterator()
            L47:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L67
                java.lang.Object r2 = r8.next()
                com.amazon.aps.iva.qj.a r2 = (com.amazon.aps.iva.qj.a) r2
                java.lang.String r4 = "<this>"
                com.amazon.aps.iva.yb0.j.f(r2, r4)
                com.ellation.crunchyroll.api.etp.model.Image r4 = new com.ellation.crunchyroll.api.etp.model.Image
                int r5 = r2.c
                java.lang.String r6 = r2.a
                int r2 = r2.b
                r4.<init>(r6, r2, r5)
                r9.add(r4)
                goto L47
            L67:
                r0.i = r3
                com.amazon.aps.iva.ve0.g r8 = r7.b
                java.lang.Object r8 = r8.a(r9, r0)
                if (r8 != r1) goto L72
                return r1
            L72:
                com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.hl.h0.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public h0(com.amazon.aps.iva.ve0.f fVar) {
        this.b = fVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super List<? extends Image>> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
