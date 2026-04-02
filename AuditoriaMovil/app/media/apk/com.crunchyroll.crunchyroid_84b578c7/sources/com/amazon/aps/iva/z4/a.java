package com.amazon.aps.iva.z4;

import android.content.Context;
import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.xb0.p;
import java.io.Serializable;
import java.util.LinkedHashMap;
import org.apache.commons.codec.binary.BaseNCodec;
/* compiled from: GlanceStateDefinition.kt */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();
    public static final com.amazon.aps.iva.ze0.d b = t.d();
    public static final LinkedHashMap c = new LinkedHashMap();

    /* compiled from: GlanceStateDefinition.kt */
    @e(c = "androidx.glance.state.GlanceState", f = "GlanceStateDefinition.kt", l = {141}, m = "deleteStore")
    /* renamed from: com.amazon.aps.iva.z4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0911a extends com.amazon.aps.iva.qb0.c {
        public Context h;
        public com.amazon.aps.iva.z4.b i;
        public String j;
        public com.amazon.aps.iva.ze0.d k;
        public /* synthetic */ Object l;
        public int n;

        public C0911a(com.amazon.aps.iva.ob0.d<? super C0911a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.n |= Integer.MIN_VALUE;
            return a.this.a(null, null, null, this);
        }
    }

    /* compiled from: GlanceStateDefinition.kt */
    @e(c = "androidx.glance.state.GlanceState", f = "GlanceStateDefinition.kt", l = {141, 115}, m = "getDataStore")
    /* loaded from: classes.dex */
    public static final class b<T> extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public Object i;
        public Serializable j;
        public com.amazon.aps.iva.ze0.d k;
        public /* synthetic */ Object l;
        public int n;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.n |= Integer.MIN_VALUE;
            a aVar = a.a;
            return a.this.b(null, null, null, this);
        }
    }

    /* compiled from: GlanceStateDefinition.kt */
    @e(c = "androidx.glance.state.GlanceState", f = "GlanceStateDefinition.kt", l = {BaseNCodec.MIME_CHUNK_SIZE, BaseNCodec.MIME_CHUNK_SIZE}, m = "getValue")
    /* loaded from: classes.dex */
    public static final class c<T> extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return a.this.c(null, null, null, this);
        }
    }

    /* compiled from: GlanceStateDefinition.kt */
    @e(c = "androidx.glance.state.GlanceState", f = "GlanceStateDefinition.kt", l = {90, 90}, m = "updateValue")
    /* loaded from: classes.dex */
    public static final class d<T> extends com.amazon.aps.iva.qb0.c {
        public p h;
        public /* synthetic */ Object i;
        public int k;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return a.this.d(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r6, com.amazon.aps.iva.z4.b<?> r7, java.lang.String r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.z4.a.C0911a
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.z4.a$a r0 = (com.amazon.aps.iva.z4.a.C0911a) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            com.amazon.aps.iva.z4.a$a r0 = new com.amazon.aps.iva.z4.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.l
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.n
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            com.amazon.aps.iva.ze0.d r6 = r0.k
            java.lang.String r8 = r0.j
            com.amazon.aps.iva.z4.b r7 = r0.i
            android.content.Context r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            r9 = r6
            r6 = r0
            goto L50
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            com.amazon.aps.iva.ab.x.i0(r9)
            r0.h = r6
            r0.i = r7
            r0.j = r8
            com.amazon.aps.iva.ze0.d r9 = com.amazon.aps.iva.z4.a.b
            r0.k = r9
            r0.n = r4
            java.lang.Object r0 = r9.a(r3, r0)
            if (r0 != r1) goto L50
            return r1
        L50:
            java.util.LinkedHashMap r0 = com.amazon.aps.iva.z4.a.c     // Catch: java.lang.Throwable -> L62
            r0.remove(r8)     // Catch: java.lang.Throwable -> L62
            java.io.File r6 = r7.a(r6, r8)     // Catch: java.lang.Throwable -> L62
            r6.delete()     // Catch: java.lang.Throwable -> L62
            r9.d(r3)
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L62:
            r6 = move-exception
            r9.d(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z4.a.a(android.content.Context, com.amazon.aps.iva.z4.b, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:24:0x006c, B:26:0x0074), top: B:40:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Type inference failed for: r9v16, types: [com.amazon.aps.iva.ze0.c] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.amazon.aps.iva.ze0.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object b(android.content.Context r8, com.amazon.aps.iva.z4.b<T> r9, java.lang.String r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.z3.i<T>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.amazon.aps.iva.z4.a.b
            if (r0 == 0) goto L13
            r0 = r11
            com.amazon.aps.iva.z4.a$b r0 = (com.amazon.aps.iva.z4.a.b) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            com.amazon.aps.iva.z4.a$b r0 = new com.amazon.aps.iva.z4.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.l
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.n
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L54
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.io.Serializable r8 = r0.j
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r9 = r0.i
            com.amazon.aps.iva.ze0.c r9 = (com.amazon.aps.iva.ze0.c) r9
            java.lang.Object r10 = r0.h
            java.lang.String r10 = (java.lang.String) r10
            com.amazon.aps.iva.ab.x.i0(r11)     // Catch: java.lang.Throwable -> L37
            goto L89
        L37:
            r8 = move-exception
            goto L9e
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            com.amazon.aps.iva.ze0.d r8 = r0.k
            java.io.Serializable r9 = r0.j
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.i
            com.amazon.aps.iva.z4.b r9 = (com.amazon.aps.iva.z4.b) r9
            java.lang.Object r2 = r0.h
            android.content.Context r2 = (android.content.Context) r2
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L6c
        L54:
            com.amazon.aps.iva.ab.x.i0(r11)
            r0.h = r8
            r0.i = r9
            r0.j = r10
            com.amazon.aps.iva.ze0.d r11 = com.amazon.aps.iva.z4.a.b
            r0.k = r11
            r0.n = r4
            java.lang.Object r2 = r11.a(r5, r0)
            if (r2 != r1) goto L6a
            return r1
        L6a:
            r2 = r8
            r8 = r11
        L6c:
            java.util.LinkedHashMap r11 = com.amazon.aps.iva.z4.a.c     // Catch: java.lang.Throwable -> L90
            java.lang.Object r4 = r11.get(r10)     // Catch: java.lang.Throwable -> L90
            if (r4 != 0) goto L92
            r0.h = r10     // Catch: java.lang.Throwable -> L90
            r0.i = r8     // Catch: java.lang.Throwable -> L90
            r0.j = r11     // Catch: java.lang.Throwable -> L90
            r0.k = r5     // Catch: java.lang.Throwable -> L90
            r0.n = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r9 = r9.b(r2, r10)     // Catch: java.lang.Throwable -> L90
            if (r9 != r1) goto L85
            return r1
        L85:
            r6 = r9
            r9 = r8
            r8 = r11
            r11 = r6
        L89:
            r4 = r11
            com.amazon.aps.iva.z3.i r4 = (com.amazon.aps.iva.z3.i) r4     // Catch: java.lang.Throwable -> L37
            r8.put(r10, r4)     // Catch: java.lang.Throwable -> L37
            goto L93
        L90:
            r9 = move-exception
            goto La1
        L92:
            r9 = r8
        L93:
            java.lang.String r8 = "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda-2>"
            com.amazon.aps.iva.yb0.j.d(r4, r8)     // Catch: java.lang.Throwable -> L37
            com.amazon.aps.iva.z3.i r4 = (com.amazon.aps.iva.z3.i) r4     // Catch: java.lang.Throwable -> L37
            r9.d(r5)
            return r4
        L9e:
            r6 = r9
            r9 = r8
            r8 = r6
        La1:
            r8.d(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z4.a.b(android.content.Context, com.amazon.aps.iva.z4.b, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[PHI: r9 
      PHI: (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:20:0x004e, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object c(android.content.Context r6, com.amazon.aps.iva.z4.b<T> r7, java.lang.String r8, com.amazon.aps.iva.ob0.d<? super T> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.z4.a.c
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.z4.a$c r0 = (com.amazon.aps.iva.z4.a.c) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.z4.a$c r0 = new com.amazon.aps.iva.z4.a$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L51
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L42
        L36:
            com.amazon.aps.iva.ab.x.i0(r9)
            r0.j = r4
            java.lang.Object r9 = r5.b(r6, r7, r8, r0)
            if (r9 != r1) goto L42
            return r1
        L42:
            com.amazon.aps.iva.z3.i r9 = (com.amazon.aps.iva.z3.i) r9
            com.amazon.aps.iva.ve0.f r6 = r9.getData()
            r0.j = r3
            java.lang.Object r9 = com.amazon.aps.iva.dg.b.q(r6, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z4.a.c(android.content.Context, com.amazon.aps.iva.z4.b, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[PHI: r10 
      PHI: (r10v6 java.lang.Object) = (r10v5 java.lang.Object), (r10v1 java.lang.Object) binds: [B:20:0x0051, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object d(android.content.Context r6, com.amazon.aps.iva.z4.b<T> r7, java.lang.String r8, com.amazon.aps.iva.xb0.p<? super T, ? super com.amazon.aps.iva.ob0.d<? super T>, ? extends java.lang.Object> r9, com.amazon.aps.iva.ob0.d<? super T> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.amazon.aps.iva.z4.a.d
            if (r0 == 0) goto L13
            r0 = r10
            com.amazon.aps.iva.z4.a$d r0 = (com.amazon.aps.iva.z4.a.d) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.z4.a$d r0 = new com.amazon.aps.iva.z4.a$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.amazon.aps.iva.xb0.p r9 = r0.h
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L46
        L38:
            com.amazon.aps.iva.ab.x.i0(r10)
            r0.h = r9
            r0.k = r4
            java.lang.Object r10 = r5.b(r6, r7, r8, r0)
            if (r10 != r1) goto L46
            return r1
        L46:
            com.amazon.aps.iva.z3.i r10 = (com.amazon.aps.iva.z3.i) r10
            r6 = 0
            r0.h = r6
            r0.k = r3
            java.lang.Object r10 = r10.a(r9, r0)
            if (r10 != r1) goto L54
            return r1
        L54:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z4.a.d(android.content.Context, com.amazon.aps.iva.z4.b, java.lang.String, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
