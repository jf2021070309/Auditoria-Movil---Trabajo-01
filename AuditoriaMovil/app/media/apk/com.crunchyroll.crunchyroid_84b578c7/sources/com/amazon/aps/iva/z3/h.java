package com.amazon.aps.iva.z3;
/* compiled from: DataMigrationInitializer.kt */
/* loaded from: classes.dex */
public final class h<T> {
    public static final a a = new a();

    /* compiled from: DataMigrationInitializer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Throwable, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0087 -> B:23:0x0069). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008a -> B:23:0x0069). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object a(com.amazon.aps.iva.z3.h.a r5, java.util.List r6, com.amazon.aps.iva.z3.k r7, com.amazon.aps.iva.ob0.d r8) {
            /*
                r5.getClass()
                boolean r0 = r8 instanceof com.amazon.aps.iva.z3.f
                if (r0 == 0) goto L16
                r0 = r8
                com.amazon.aps.iva.z3.f r0 = (com.amazon.aps.iva.z3.f) r0
                int r1 = r0.l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                int r1 = r1 - r2
                r0.l = r1
                goto L1b
            L16:
                com.amazon.aps.iva.z3.f r0 = new com.amazon.aps.iva.z3.f
                r0.<init>(r5, r8)
            L1b:
                java.lang.Object r5 = r0.j
                com.amazon.aps.iva.pb0.a r8 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r0.l
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L43
                if (r1 == r3) goto L3b
                if (r1 != r2) goto L33
                java.util.Iterator r6 = r0.i
                java.io.Serializable r7 = r0.h
                com.amazon.aps.iva.yb0.d0 r7 = (com.amazon.aps.iva.yb0.d0) r7
                com.amazon.aps.iva.ab.x.i0(r5)     // Catch: java.lang.Throwable -> L82
                goto L69
            L33:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3b:
                java.io.Serializable r6 = r0.h
                java.util.List r6 = (java.util.List) r6
                com.amazon.aps.iva.ab.x.i0(r5)
                goto L5d
            L43:
                com.amazon.aps.iva.ab.x.i0(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                com.amazon.aps.iva.z3.g r1 = new com.amazon.aps.iva.z3.g
                r4 = 0
                r1.<init>(r6, r5, r4)
                r0.h = r5
                r0.l = r3
                java.lang.Object r6 = r7.a(r1, r0)
                if (r6 != r8) goto L5c
                goto L98
            L5c:
                r6 = r5
            L5d:
                com.amazon.aps.iva.yb0.d0 r5 = new com.amazon.aps.iva.yb0.d0
                r5.<init>()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L69:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L90
                java.lang.Object r5 = r6.next()
                com.amazon.aps.iva.xb0.l r5 = (com.amazon.aps.iva.xb0.l) r5
                r0.h = r7     // Catch: java.lang.Throwable -> L82
                r0.i = r6     // Catch: java.lang.Throwable -> L82
                r0.l = r2     // Catch: java.lang.Throwable -> L82
                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L82
                if (r5 != r8) goto L69
                goto L98
            L82:
                r5 = move-exception
                T r1 = r7.b
                if (r1 != 0) goto L8a
                r7.b = r5
                goto L69
            L8a:
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                com.amazon.aps.iva.aq.k.f(r1, r5)
                goto L69
            L90:
                T r5 = r7.b
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto L99
                com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            L98:
                return r8
            L99:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.h.a.a(com.amazon.aps.iva.z3.h$a, java.util.List, com.amazon.aps.iva.z3.k, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }
}
