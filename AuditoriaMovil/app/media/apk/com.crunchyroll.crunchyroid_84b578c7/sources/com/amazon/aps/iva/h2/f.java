package com.amazon.aps.iva.h2;
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* loaded from: classes.dex */
public final class f {
    public final com.amazon.aps.iva.g2.a<b, a> a = new com.amazon.aps.iva.g2.a<>();
    public final com.amazon.aps.iva.g2.b<b, a> b = new com.amazon.aps.iva.g2.b<>(0);
    public final com.amazon.aps.iva.u0.b c = new com.amazon.aps.iva.u0.b(1);

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final Object a;

        public /* synthetic */ a(Object obj) {
            this.a = obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (!com.amazon.aps.iva.yb0.j.a(this.a, ((a) obj).a)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            Object obj = this.a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.a + ')';
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public final j a;
        public final Object b;

        public b(j jVar, Object obj) {
            com.amazon.aps.iva.yb0.j.f(jVar, "font");
            this.a = jVar;
            this.b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, bVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            Object obj = this.b;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(font=");
            sb.append(this.a);
            sb.append(", loaderKey=");
            return defpackage.b.b(sb, this.b, ')');
        }
    }

    public static void a(f fVar, j jVar, c0 c0Var, Object obj) {
        c0Var.b();
        b bVar = new b(jVar, null);
        synchronized (fVar.c) {
            try {
                if (obj == null) {
                    a aVar = (a) fVar.b.d(bVar, new a(null));
                } else {
                    fVar.a.b(bVar, new a(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.amazon.aps.iva.h2.j r7, com.amazon.aps.iva.h2.c0 r8, com.amazon.aps.iva.h2.e.b r9, com.amazon.aps.iva.ob0.d r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.amazon.aps.iva.h2.g
            if (r0 == 0) goto L13
            r0 = r10
            com.amazon.aps.iva.h2.g r0 = (com.amazon.aps.iva.h2.g) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.h2.g r0 = new com.amazon.aps.iva.h2.g
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            boolean r7 = r0.j
            com.amazon.aps.iva.h2.f$b r8 = r0.i
            com.amazon.aps.iva.h2.f r9 = r0.h
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L73
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            com.amazon.aps.iva.ab.x.i0(r10)
            com.amazon.aps.iva.h2.f$b r10 = new com.amazon.aps.iva.h2.f$b
            r8.b()
            r10.<init>(r7, r3)
            com.amazon.aps.iva.u0.b r7 = r6.c
            monitor-enter(r7)
            com.amazon.aps.iva.g2.a<com.amazon.aps.iva.h2.f$b, com.amazon.aps.iva.h2.f$a> r8 = r6.a     // Catch: java.lang.Throwable -> La2
            java.lang.Object r8 = r8.a(r10)     // Catch: java.lang.Throwable -> La2
            com.amazon.aps.iva.h2.f$a r8 = (com.amazon.aps.iva.h2.f.a) r8     // Catch: java.lang.Throwable -> La2
            if (r8 != 0) goto L56
            com.amazon.aps.iva.g2.b<com.amazon.aps.iva.h2.f$b, com.amazon.aps.iva.h2.f$a> r8 = r6.b     // Catch: java.lang.Throwable -> La2
            java.lang.Object r8 = r8.a(r10)     // Catch: java.lang.Throwable -> La2
            com.amazon.aps.iva.h2.f$a r8 = (com.amazon.aps.iva.h2.f.a) r8     // Catch: java.lang.Throwable -> La2
        L56:
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r8.a     // Catch: java.lang.Throwable -> La2
            monitor-exit(r7)
            return r8
        L5c:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> La2
            monitor-exit(r7)
            r0.h = r6
            r0.i = r10
            r7 = 0
            r0.j = r7
            r0.m = r4
            java.lang.Object r8 = r9.invoke(r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r6
            r5 = r10
            r10 = r8
            r8 = r5
        L73:
            com.amazon.aps.iva.u0.b r0 = r9.c
            monitor-enter(r0)
            if (r10 != 0) goto L85
            com.amazon.aps.iva.g2.b<com.amazon.aps.iva.h2.f$b, com.amazon.aps.iva.h2.f$a> r7 = r9.b     // Catch: java.lang.Throwable -> L83
            com.amazon.aps.iva.h2.f$a r9 = new com.amazon.aps.iva.h2.f$a     // Catch: java.lang.Throwable -> L83
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L83
            r7.d(r8, r9)     // Catch: java.lang.Throwable -> L83
            goto L9c
        L83:
            r7 = move-exception
            goto La0
        L85:
            if (r7 == 0) goto L92
            com.amazon.aps.iva.g2.b<com.amazon.aps.iva.h2.f$b, com.amazon.aps.iva.h2.f$a> r7 = r9.b     // Catch: java.lang.Throwable -> L83
            com.amazon.aps.iva.h2.f$a r9 = new com.amazon.aps.iva.h2.f$a     // Catch: java.lang.Throwable -> L83
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L83
            r7.d(r8, r9)     // Catch: java.lang.Throwable -> L83
            goto L9c
        L92:
            com.amazon.aps.iva.g2.a<com.amazon.aps.iva.h2.f$b, com.amazon.aps.iva.h2.f$a> r7 = r9.a     // Catch: java.lang.Throwable -> L83
            com.amazon.aps.iva.h2.f$a r9 = new com.amazon.aps.iva.h2.f$a     // Catch: java.lang.Throwable -> L83
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L83
            r7.b(r8, r9)     // Catch: java.lang.Throwable -> L83
        L9c:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L83
            monitor-exit(r0)
            return r10
        La0:
            monitor-exit(r0)
            throw r7
        La2:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h2.f.b(com.amazon.aps.iva.h2.j, com.amazon.aps.iva.h2.c0, com.amazon.aps.iva.h2.e$b, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
