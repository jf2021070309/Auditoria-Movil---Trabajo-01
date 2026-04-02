package com.amazon.aps.iva.zl;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.ve0.f;
import com.amazon.aps.iva.ve0.g;
import java.util.List;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class a implements f<List<? extends com.amazon.aps.iva.em.a>> {
    public final /* synthetic */ f b;

    /* compiled from: Emitters.kt */
    /* renamed from: com.amazon.aps.iva.zl.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0921a<T> implements g {
        public final /* synthetic */ g b;

        /* compiled from: Emitters.kt */
        @e(c = "com.crunchyroll.profiles.data.ProfilesRepository$special$$inlined$mapNotNull$1$2", f = "ProfilesRepository.kt", l = {225}, m = "emit")
        /* renamed from: com.amazon.aps.iva.zl.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0922a extends c {
            public /* synthetic */ Object h;
            public int i;

            public C0922a(d dVar) {
                super(dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                this.h = obj;
                this.i |= Integer.MIN_VALUE;
                return C0921a.this.a(null, this);
            }
        }

        public C0921a(g gVar) {
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
                boolean r0 = r6 instanceof com.amazon.aps.iva.zl.a.C0921a.C0922a
                if (r0 == 0) goto L13
                r0 = r6
                com.amazon.aps.iva.zl.a$a$a r0 = (com.amazon.aps.iva.zl.a.C0921a.C0922a) r0
                int r1 = r0.i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i = r1
                goto L18
            L13:
                com.amazon.aps.iva.zl.a$a$a r0 = new com.amazon.aps.iva.zl.a$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.i
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r6)
                goto L54
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                com.amazon.aps.iva.ab.x.i0(r6)
                com.amazon.aps.iva.ez.g r5 = (com.amazon.aps.iva.ez.g) r5
                boolean r6 = r5 instanceof com.amazon.aps.iva.ez.g.c
                r2 = 0
                if (r6 == 0) goto L3c
                com.amazon.aps.iva.ez.g$c r5 = (com.amazon.aps.iva.ez.g.c) r5
                goto L3d
            L3c:
                r5 = r2
            L3d:
                if (r5 == 0) goto L47
                T r5 = r5.a
                com.amazon.aps.iva.em.b r5 = (com.amazon.aps.iva.em.b) r5
                if (r5 == 0) goto L47
                java.util.List<com.amazon.aps.iva.em.a> r2 = r5.b
            L47:
                if (r2 == 0) goto L54
                r0.i = r3
                com.amazon.aps.iva.ve0.g r5 = r4.b
                java.lang.Object r5 = r5.a(r2, r0)
                if (r5 != r1) goto L54
                return r1
            L54:
                com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zl.a.C0921a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public a(com.amazon.aps.iva.bm.c cVar) {
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(g<? super List<? extends com.amazon.aps.iva.em.a>> gVar, d dVar) {
        Object c = this.b.c(new C0921a(gVar), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return q.a;
    }
}
