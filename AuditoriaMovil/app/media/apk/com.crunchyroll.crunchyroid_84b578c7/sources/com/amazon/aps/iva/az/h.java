package com.amazon.aps.iva.az;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ve0.f0;
import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: StateSharedFlow.kt */
/* loaded from: classes2.dex */
public class h<T> implements f0<T>, a<T> {
    public final f0<T> b;
    public final e<T> c;

    public h(Object obj, int i) {
        obj = (i & 1) != 0 ? null : obj;
        l0 g = (i & 2) != 0 ? t.g(0, 0, null, 7) : null;
        j.f(g, "actualFlow");
        this.b = g;
        this.c = new e<>(obj, g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.pb0.a d(com.amazon.aps.iva.az.h r5, com.amazon.aps.iva.ve0.g r6, com.amazon.aps.iva.ob0.d r7) {
        /*
            boolean r0 = r7 instanceof com.amazon.aps.iva.az.g
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.az.g r0 = (com.amazon.aps.iva.az.g) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.az.g r0 = new com.amazon.aps.iva.az.g
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
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2e:
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L60
        L32:
            com.amazon.aps.iva.ve0.g r6 = r0.i
            com.amazon.aps.iva.az.h r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L50
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.az.e<T> r7 = r5.c
            T r7 = r7.c
            if (r7 == 0) goto L50
            r0.h = r5
            r0.i = r6
            r0.l = r4
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            com.amazon.aps.iva.ve0.f0<T> r5 = r5.b
            r7 = 0
            r0.h = r7
            r0.i = r7
            r0.l = r3
            java.lang.Object r5 = r5.c(r6, r0)
            if (r5 != r1) goto L60
            return r1
        L60:
            com.amazon.aps.iva.la.a r5 = new com.amazon.aps.iva.la.a
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.az.h.d(com.amazon.aps.iva.az.h, com.amazon.aps.iva.ve0.g, com.amazon.aps.iva.ob0.d):com.amazon.aps.iva.pb0.a");
    }

    @Override // com.amazon.aps.iva.ve0.f0, com.amazon.aps.iva.ve0.g
    public final Object a(T t, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        Object a = this.c.a(t, dVar);
        if (a != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return q.a;
        }
        return a;
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final boolean b(T t) {
        return this.b.b(t);
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super T> gVar, com.amazon.aps.iva.ob0.d<?> dVar) {
        return d(this, gVar, dVar);
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
        return this.c.c;
    }
}
