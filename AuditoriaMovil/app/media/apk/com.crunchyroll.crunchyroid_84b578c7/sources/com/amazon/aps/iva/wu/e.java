package com.amazon.aps.iva.wu;

import com.amazon.aps.iva.se0.m0;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: SingleJobRunner.kt */
/* loaded from: classes2.dex */
public final class e<K, T> {
    public final ConcurrentHashMap<K, m0<T>> a = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075 A[PHI: r13 
      PHI: (r13v7 java.lang.Object) = (r13v5 java.lang.Object), (r13v1 java.lang.Object) binds: [B:24:0x0072, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r12, com.amazon.aps.iva.ob0.d r13, com.amazon.aps.iva.xb0.l r14) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.amazon.aps.iva.wu.c
            if (r0 == 0) goto L13
            r0 = r13
            com.amazon.aps.iva.wu.c r0 = (com.amazon.aps.iva.wu.c) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.wu.c r0 = new com.amazon.aps.iva.wu.c
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r13)
            goto L75
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            com.amazon.aps.iva.yb0.d0 r12 = r0.h
            com.amazon.aps.iva.ab.x.i0(r13)
            goto L61
        L38:
            com.amazon.aps.iva.ab.x.i0(r13)
            com.amazon.aps.iva.yb0.d0 r13 = new com.amazon.aps.iva.yb0.d0
            r13.<init>()
            java.util.concurrent.ConcurrentHashMap<K, com.amazon.aps.iva.se0.m0<T>> r2 = r11.a
            java.lang.Object r2 = r2.get(r12)
            r13.b = r2
            if (r2 != 0) goto L62
            com.amazon.aps.iva.wu.d r2 = new com.amazon.aps.iva.wu.d
            r10 = 0
            r5 = r2
            r6 = r13
            r7 = r11
            r8 = r12
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r0.h = r13
            r0.k = r4
            java.lang.Object r12 = com.amazon.aps.iva.e.z.p(r2, r0)
            if (r12 != r1) goto L60
            return r1
        L60:
            r12 = r13
        L61:
            r13 = r12
        L62:
            T r12 = r13.b
            com.amazon.aps.iva.yb0.j.c(r12)
            com.amazon.aps.iva.se0.m0 r12 = (com.amazon.aps.iva.se0.m0) r12
            r13 = 0
            r0.h = r13
            r0.k = r3
            java.lang.Object r13 = r12.K(r0)
            if (r13 != r1) goto L75
            return r1
        L75:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wu.e.a(java.lang.Object, com.amazon.aps.iva.ob0.d, com.amazon.aps.iva.xb0.l):java.lang.Object");
    }
}
