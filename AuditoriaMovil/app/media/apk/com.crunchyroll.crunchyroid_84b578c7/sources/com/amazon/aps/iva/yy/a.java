package com.amazon.aps.iva.yy;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.ve0.f0;
import com.amazon.aps.iva.ve0.g;
import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: PreferencesFlowImpl.kt */
/* loaded from: classes2.dex */
public final class a<T> implements com.amazon.aps.iva.az.a<T>, f0<T> {
    public final f0<T> b;
    public final com.amazon.aps.iva.zy.a<T> c;

    /* compiled from: PreferencesFlowImpl.kt */
    @e(c = "com.ellation.crunchyroll.mvp.flow.preferences.PreferencesFlowImpl", f = "PreferencesFlowImpl.kt", l = {22, ConnectionResult.API_DISABLED}, m = "collect")
    /* renamed from: com.amazon.aps.iva.yy.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0901a extends c {
        public a h;
        public g i;
        public /* synthetic */ Object j;
        public final /* synthetic */ a<T> k;
        public int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0901a(a<T> aVar, d<? super C0901a> dVar) {
            super(dVar);
            this.k = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return this.k.c(null, this);
        }
    }

    public a(l0 l0Var, com.amazon.aps.iva.zy.a aVar) {
        this.b = l0Var;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.ve0.f0, com.amazon.aps.iva.ve0.g
    public final Object a(T t, d<? super q> dVar) {
        Object a = this.c.a(t, dVar);
        if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final boolean b(T t) {
        return this.b.b(t);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[RETURN] */
    @Override // com.amazon.aps.iva.ve0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.amazon.aps.iva.ve0.g<? super T> r6, com.amazon.aps.iva.ob0.d<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.yy.a.C0901a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.yy.a$a r0 = (com.amazon.aps.iva.yy.a.C0901a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.yy.a$a r0 = new com.amazon.aps.iva.yy.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L63
        L32:
            com.amazon.aps.iva.ve0.g r6 = r0.i
            com.amazon.aps.iva.yy.a r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L53
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.zy.a<T> r7 = r5.c
            java.lang.Object r7 = r7.getValue()
            if (r7 == 0) goto L52
            r0.h = r5
            r0.i = r6
            r0.l = r4
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            com.amazon.aps.iva.ve0.f0<T> r7 = r2.b
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.l = r3
            java.lang.Object r6 = r7.c(r6, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            com.amazon.aps.iva.la.a r6 = new com.amazon.aps.iva.la.a
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.yy.a.c(com.amazon.aps.iva.ve0.g, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final T d() {
        T value = getValue();
        j.c(value);
        return value;
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final u0<Integer> f() {
        return this.b.f();
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final void g() {
        this.b.g();
    }

    @Override // com.amazon.aps.iva.az.f
    public final T getValue() {
        return this.c.getValue();
    }
}
