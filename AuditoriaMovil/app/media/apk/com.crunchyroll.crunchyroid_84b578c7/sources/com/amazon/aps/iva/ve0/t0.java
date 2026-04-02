package com.amazon.aps.iva.ve0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.o0.t1;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* compiled from: SharingStarted.kt */
/* loaded from: classes4.dex */
public final class t0 implements q0 {
    public final long a;
    public final long b;

    /* compiled from: SharingStarted.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {178, 180, 182, 183, 185}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<g<? super o0>, Integer, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ g i;
        public /* synthetic */ int j;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(g<? super o0> gVar, Integer num, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            int intValue = num.intValue();
            a aVar = new a(dVar);
            aVar.i = gVar;
            aVar.j = intValue;
            return aVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[RETURN] */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r10.h
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                com.amazon.aps.iva.ve0.t0 r7 = com.amazon.aps.iva.ve0.t0.this
                if (r1 == 0) goto L36
                if (r1 == r6) goto L32
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L26
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L32
            L18:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L20:
                com.amazon.aps.iva.ve0.g r1 = r10.i
                com.amazon.aps.iva.ab.x.i0(r11)
                goto L7a
            L26:
                com.amazon.aps.iva.ve0.g r1 = r10.i
                com.amazon.aps.iva.ab.x.i0(r11)
                goto L6d
            L2c:
                com.amazon.aps.iva.ve0.g r1 = r10.i
                com.amazon.aps.iva.ab.x.i0(r11)
                goto L58
            L32:
                com.amazon.aps.iva.ab.x.i0(r11)
                goto L88
            L36:
                com.amazon.aps.iva.ab.x.i0(r11)
                com.amazon.aps.iva.ve0.g r11 = r10.i
                int r1 = r10.j
                if (r1 <= 0) goto L4a
                com.amazon.aps.iva.ve0.o0 r1 = com.amazon.aps.iva.ve0.o0.START
                r10.h = r6
                java.lang.Object r11 = r11.a(r1, r10)
                if (r11 != r0) goto L88
                return r0
            L4a:
                long r8 = r7.a
                r10.i = r11
                r10.h = r5
                java.lang.Object r1 = com.amazon.aps.iva.ab.t.l(r8, r10)
                if (r1 != r0) goto L57
                return r0
            L57:
                r1 = r11
            L58:
                long r5 = r7.b
                r8 = 0
                int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r11 <= 0) goto L7a
                com.amazon.aps.iva.ve0.o0 r11 = com.amazon.aps.iva.ve0.o0.STOP
                r10.i = r1
                r10.h = r4
                java.lang.Object r11 = r1.a(r11, r10)
                if (r11 != r0) goto L6d
                return r0
            L6d:
                long r4 = r7.b
                r10.i = r1
                r10.h = r3
                java.lang.Object r11 = com.amazon.aps.iva.ab.t.l(r4, r10)
                if (r11 != r0) goto L7a
                return r0
            L7a:
                com.amazon.aps.iva.ve0.o0 r11 = com.amazon.aps.iva.ve0.o0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r10.i = r3
                r10.h = r2
                java.lang.Object r11 = r1.a(r11, r10)
                if (r11 != r0) goto L88
                return r0
            L88:
                com.amazon.aps.iva.kb0.q r11 = com.amazon.aps.iva.kb0.q.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.t0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SharingStarted.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<o0, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
        public /* synthetic */ Object h;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.h = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(o0 o0Var, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            if (((o0) this.h) != o0.START) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public t0(long j, long j2) {
        boolean z;
        this.a = j;
        this.b = j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j2 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    @Override // com.amazon.aps.iva.ve0.q0
    public final f<o0> a(u0<Integer> u0Var) {
        a aVar = new a(null);
        int i = r.a;
        return com.amazon.aps.iva.dg.b.m(new o(new com.amazon.aps.iva.we0.i(aVar, u0Var, com.amazon.aps.iva.ob0.h.b, -2, com.amazon.aps.iva.ue0.e.SUSPEND), new b(null)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            if (this.a == t0Var.a && this.b == t0Var.b) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        com.amazon.aps.iva.mb0.a aVar = new com.amazon.aps.iva.mb0.a(2);
        long j = this.a;
        if (j > 0) {
            aVar.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            aVar.add("replayExpiration=" + j2 + "ms");
        }
        return t1.b(new StringBuilder("SharingStarted.WhileSubscribed("), com.amazon.aps.iva.lb0.x.B0(f1.l(aVar), null, null, null, null, 63), ')');
    }
}
