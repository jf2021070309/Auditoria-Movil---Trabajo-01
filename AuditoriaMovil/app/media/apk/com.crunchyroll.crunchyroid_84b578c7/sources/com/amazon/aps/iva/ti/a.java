package com.amazon.aps.iva.ti;

import androidx.lifecycle.p;
import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.f;
import com.amazon.aps.iva.ve0.f0;
import com.amazon.aps.iva.ve0.g;
import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.yb0.j;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.Serializable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: SavedStateHandleFlow.kt */
/* loaded from: classes.dex */
public final class a<T> implements f, f0<T> {
    public final String b;
    public final p c;
    public final T d;
    public final g0 e;
    public final f0<T> f;

    /* compiled from: SavedStateHandleFlow.kt */
    @e(c = "com.crunchyroll.mvvm.flow.SavedStateHandleFlowImpl", f = "SavedStateHandleFlow.kt", l = {Encoder.DEFAULT_EC_PERCENT, 34}, m = "collect")
    /* renamed from: com.amazon.aps.iva.ti.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0741a extends c {
        public a h;
        public g i;
        public /* synthetic */ Object j;
        public final /* synthetic */ a<T> k;
        public int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0741a(a<T> aVar, d<? super C0741a> dVar) {
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

    /* compiled from: SavedStateHandleFlow.kt */
    @e(c = "com.crunchyroll.mvvm.flow.SavedStateHandleFlowImpl$update$1", f = "SavedStateHandleFlow.kt", l = {28}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends i implements com.amazon.aps.iva.xb0.p<g0, d<? super q>, Object> {
        public int h;
        public final /* synthetic */ a<T> i;
        public final /* synthetic */ T j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<T> aVar, T t, d<? super b> dVar) {
            super(2, dVar);
            this.i = aVar;
            this.j = t;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            return new b(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
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
                f0<T> f0Var = this.i.f;
                this.h = 1;
                if (f0Var.a(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, p pVar, Serializable serializable, g0 g0Var) {
        l0 g = t.g(0, 0, null, 7);
        j.f(pVar, "savedStateHandle");
        this.b = str;
        this.c = pVar;
        this.d = serializable;
        this.e = g0Var;
        this.f = g;
    }

    @Override // com.amazon.aps.iva.ve0.f0, com.amazon.aps.iva.ve0.g
    public final Object a(T t, d<? super q> dVar) {
        return this.f.a(t, dVar);
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final boolean b(T t) {
        return this.f.b(t);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    @Override // com.amazon.aps.iva.ve0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.amazon.aps.iva.ve0.g<? super T> r6, com.amazon.aps.iva.ob0.d<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.ti.a.C0741a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.ti.a$a r0 = (com.amazon.aps.iva.ti.a.C0741a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.ti.a$a r0 = new com.amazon.aps.iva.ti.a$a
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
            goto L5f
        L32:
            com.amazon.aps.iva.ve0.g r6 = r0.i
            com.amazon.aps.iva.ti.a r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4f
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            java.lang.Object r7 = r5.getValue()
            r0.h = r5
            r0.i = r6
            r0.l = r4
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            com.amazon.aps.iva.ve0.f0<T> r7 = r2.f
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.l = r3
            java.lang.Object r6 = r7.c(r6, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            com.amazon.aps.iva.la.a r6 = new com.amazon.aps.iva.la.a
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ti.a.c(com.amazon.aps.iva.ve0.g, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final void d(T t) {
        this.c.d(t, this.b);
        com.amazon.aps.iva.se0.i.d(this.e, null, null, new b(this, t, null), 3);
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final u0<Integer> f() {
        return this.f.f();
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final void g() {
        this.f.g();
    }

    public final T getValue() {
        T t = (T) this.c.b(this.b);
        if (t == null) {
            return this.d;
        }
        return t;
    }
}
