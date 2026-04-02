package com.amazon.aps.iva.z3;

import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.j0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.yb0.d0;
import com.google.android.gms.cast.MediaError;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: SingleProcessDataStore.kt */
/* loaded from: classes.dex */
public final class q<T> implements com.amazon.aps.iva.z3.i<T> {
    public static final LinkedHashSet k = new LinkedHashSet();
    public static final Object l = new Object();
    public final com.amazon.aps.iva.xb0.a<File> a;
    public final m<T> b;
    public final com.amazon.aps.iva.z3.b<T> c;
    public final g0 d;
    public final j0 e;
    public final String f;
    public final com.amazon.aps.iva.kb0.m g;
    public final v0 h;
    public List<? extends com.amazon.aps.iva.xb0.p<? super k<T>, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object>> i;
    public final p<a<T>> j;

    /* compiled from: SingleProcessDataStore.kt */
    /* loaded from: classes.dex */
    public static abstract class a<T> {

        /* compiled from: SingleProcessDataStore.kt */
        /* renamed from: com.amazon.aps.iva.z3.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0909a<T> extends a<T> {
            public final b0<T> a;

            public C0909a(b0<T> b0Var) {
                this.a = b0Var;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        /* loaded from: classes.dex */
        public static final class b<T> extends a<T> {
            public final com.amazon.aps.iva.xb0.p<T, com.amazon.aps.iva.ob0.d<? super T>, Object> a;
            public final com.amazon.aps.iva.se0.t<T> b;
            public final b0<T> c;
            public final com.amazon.aps.iva.ob0.g d;

            public b(com.amazon.aps.iva.xb0.p pVar, com.amazon.aps.iva.se0.u uVar, b0 b0Var, com.amazon.aps.iva.ob0.g gVar) {
                com.amazon.aps.iva.yb0.j.f(pVar, "transform");
                com.amazon.aps.iva.yb0.j.f(gVar, "callerContext");
                this.a = pVar;
                this.b = uVar;
                this.c = b0Var;
                this.d = gVar;
            }
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    /* loaded from: classes.dex */
    public static final class b extends OutputStream {
        public final FileOutputStream b;

        public b(FileOutputStream fileOutputStream) {
            this.b = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.b.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            this.b.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            com.amazon.aps.iva.yb0.j.f(bArr, "b");
            this.b.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(bArr, "bytes");
            this.b.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {MediaError.DetailedErrorCode.DASH_NO_INIT, 348, 505}, m = "readAndInit")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public q h;
        public Object i;
        public Serializable j;
        public Object k;
        public d l;
        public Iterator m;
        public /* synthetic */ Object n;
        public final /* synthetic */ q<T> o;
        public int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q<T> qVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
            this.o = qVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.n = obj;
            this.p |= Integer.MIN_VALUE;
            LinkedHashSet linkedHashSet = q.k;
            return this.o.d(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    /* loaded from: classes.dex */
    public static final class d implements k<T> {
        public final /* synthetic */ com.amazon.aps.iva.ze0.c a;
        public final /* synthetic */ com.amazon.aps.iva.yb0.z b;
        public final /* synthetic */ d0<T> c;
        public final /* synthetic */ q<T> d;

        public d(com.amazon.aps.iva.ze0.c cVar, com.amazon.aps.iva.yb0.z zVar, d0<T> d0Var, q<T> qVar) {
            this.a = cVar;
            this.b = zVar;
            this.c = d0Var;
            this.d = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:30:0x008f, B:32:0x0093, B:51:0x00d6, B:52:0x00dd), top: B:55:0x008f }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ab, B:38:0x00b3), top: B:56:0x0050 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00d6 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:30:0x008f, B:32:0x0093, B:51:0x00d6, B:52:0x00dd), top: B:55:0x008f }] */
        @Override // com.amazon.aps.iva.z3.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(com.amazon.aps.iva.z3.g r11, com.amazon.aps.iva.ob0.d r12) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.q.d.a(com.amazon.aps.iva.z3.g, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.qb0.c {
        public q h;
        public /* synthetic */ Object i;
        public final /* synthetic */ q<T> j;
        public int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q<T> qVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(dVar);
            this.j = qVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            LinkedHashSet linkedHashSet = q.k;
            return this.j.e(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {MediaError.DetailedErrorCode.HLS_NETWORK_MASTER_PLAYLIST}, m = "readAndInitOrPropagateFailure")
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.qb0.c {
        public q h;
        public /* synthetic */ Object i;
        public final /* synthetic */ q<T> j;
        public int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q<T> qVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(dVar);
            this.j = qVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            LinkedHashSet linkedHashSet = q.k;
            return this.j.f(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.qb0.c {
        public q h;
        public FileInputStream i;
        public /* synthetic */ Object j;
        public final /* synthetic */ q<T> k;
        public int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q<T> qVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(dVar);
            this.k = qVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            LinkedHashSet linkedHashSet = q.k;
            return this.k.g(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public Object i;
        public /* synthetic */ Object j;
        public final /* synthetic */ q<T> k;
        public int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q<T> qVar, com.amazon.aps.iva.ob0.d<? super h> dVar) {
            super(dVar);
            this.k = qVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            LinkedHashSet linkedHashSet = q.k;
            return this.k.h(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.qb0.c {
        public q h;
        public File i;
        public FileOutputStream j;
        public FileOutputStream k;
        public /* synthetic */ Object l;
        public final /* synthetic */ q<T> m;
        public int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(q<T> qVar, com.amazon.aps.iva.ob0.d<? super i> dVar) {
            super(dVar);
            this.m = qVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.n |= Integer.MIN_VALUE;
            return this.m.j(null, this);
        }
    }

    public q(com.amazon.aps.iva.xb0.a aVar, m mVar, List list, com.amazon.aps.iva.a4.a aVar2, g0 g0Var) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "scope");
        this.a = aVar;
        this.b = mVar;
        this.c = aVar2;
        this.d = g0Var;
        this.e = new j0(new u(this, null));
        this.f = ".tmp";
        this.g = com.amazon.aps.iva.kb0.f.b(new w(this));
        this.h = com.amazon.aps.iva.ab.x.e(c0.a);
        this.i = com.amazon.aps.iva.lb0.x.X0(list);
        this.j = new p<>(g0Var, new r(this), s.h, new t(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.amazon.aps.iva.z3.q r8, com.amazon.aps.iva.z3.q.a.b r9, com.amazon.aps.iva.ob0.d r10) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.q.b(com.amazon.aps.iva.z3.q, com.amazon.aps.iva.z3.q$a$b, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.z3.i
    public final Object a(com.amazon.aps.iva.xb0.p<? super T, ? super com.amazon.aps.iva.ob0.d<? super T>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super T> dVar) {
        com.amazon.aps.iva.se0.u e2 = com.amazon.aps.iva.a60.b.e();
        this.j.a(new a.b(pVar, e2, (b0) this.h.getValue(), dVar.getContext()));
        return e2.K(dVar);
    }

    public final File c() {
        return (File) this.g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.amazon.aps.iva.ze0.c] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.amazon.aps.iva.z3.q<T>, com.amazon.aps.iva.z3.q] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.amazon.aps.iva.ze0.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.q.d(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.z3.q.e
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.z3.q$e r0 = (com.amazon.aps.iva.z3.q.e) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.z3.q$e r0 = new com.amazon.aps.iva.z3.q$e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.z3.q r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.h = r4     // Catch: java.lang.Throwable -> L44
            r0.k = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L44
            if (r5 != r1) goto L41
            return r1
        L41:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        L44:
            r5 = move-exception
            r0 = r4
        L46:
            com.amazon.aps.iva.ve0.v0 r0 = r0.h
            com.amazon.aps.iva.z3.l r1 = new com.amazon.aps.iva.z3.l
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.q.e(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.z3.q.f
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.z3.q$f r0 = (com.amazon.aps.iva.z3.q.f) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.z3.q$f r0 = new com.amazon.aps.iva.z3.q$f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.z3.q r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r5 = move-exception
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.h = r4     // Catch: java.lang.Throwable -> L41
            r0.k = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 != r1) goto L4d
            return r1
        L41:
            r5 = move-exception
            r0 = r4
        L43:
            com.amazon.aps.iva.ve0.v0 r0 = r0.h
            com.amazon.aps.iva.z3.l r1 = new com.amazon.aps.iva.z3.l
            r1.<init>(r5)
            r0.setValue(r1)
        L4d:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.q.f(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.amazon.aps.iva.z3.q$g] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.amazon.aps.iva.ob0.d<? super T> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.z3.q.g
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.z3.q$g r0 = (com.amazon.aps.iva.z3.q.g) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.z3.q$g r0 = new com.amazon.aps.iva.z3.q$g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.i
            com.amazon.aps.iva.z3.q r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r5 = move-exception
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            com.amazon.aps.iva.ab.x.i0(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L64
            java.io.File r2 = r4.c()     // Catch: java.io.FileNotFoundException -> L64
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L64
            com.amazon.aps.iva.z3.m<T> r2 = r4.b     // Catch: java.lang.Throwable -> L5a
            r0.h = r4     // Catch: java.lang.Throwable -> L5a
            r0.i = r5     // Catch: java.lang.Throwable -> L5a
            r0.l = r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r0 = r2.a(r5)     // Catch: java.lang.Throwable -> L5a
            if (r0 != r1) goto L50
            return r1
        L50:
            r1 = r5
            r5 = r0
            r0 = r4
        L53:
            r2 = 0
            com.amazon.aps.iva.a60.b.k(r1, r2)     // Catch: java.io.FileNotFoundException -> L58
            return r5
        L58:
            r5 = move-exception
            goto L66
        L5a:
            r0 = move-exception
            r1 = r5
            r5 = r0
            r0 = r4
        L5e:
            throw r5     // Catch: java.lang.Throwable -> L5f
        L5f:
            r2 = move-exception
            com.amazon.aps.iva.a60.b.k(r1, r5)     // Catch: java.io.FileNotFoundException -> L58
            throw r2     // Catch: java.io.FileNotFoundException -> L58
        L64:
            r5 = move-exception
            r0 = r4
        L66:
            java.io.File r1 = r0.c()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L77
            com.amazon.aps.iva.z3.m<T> r5 = r0.b
            java.lang.Object r5 = r5.getDefaultValue()
            return r5
        L77:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.q.g(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.z3.i
    public final com.amazon.aps.iva.ve0.f<T> getData() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.amazon.aps.iva.ob0.d<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.z3.q.h
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.z3.q$h r0 = (com.amazon.aps.iva.z3.q.h) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.z3.q$h r0 = new com.amazon.aps.iva.z3.q$h
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.i
            java.lang.Object r0 = r0.h
            com.amazon.aps.iva.z3.a r0 = (com.amazon.aps.iva.z3.a) r0
            com.amazon.aps.iva.ab.x.i0(r8)     // Catch: java.io.IOException -> L33
            goto L85
        L33:
            r8 = move-exception
            goto L88
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.i
            com.amazon.aps.iva.z3.a r2 = (com.amazon.aps.iva.z3.a) r2
            java.lang.Object r4 = r0.h
            com.amazon.aps.iva.z3.q r4 = (com.amazon.aps.iva.z3.q) r4
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L77
        L49:
            java.lang.Object r2 = r0.h
            com.amazon.aps.iva.z3.q r2 = (com.amazon.aps.iva.z3.q) r2
            com.amazon.aps.iva.ab.x.i0(r8)     // Catch: com.amazon.aps.iva.z3.a -> L51
            goto L61
        L51:
            r8 = move-exception
            goto L64
        L53:
            com.amazon.aps.iva.ab.x.i0(r8)
            r0.h = r7     // Catch: com.amazon.aps.iva.z3.a -> L62
            r0.l = r5     // Catch: com.amazon.aps.iva.z3.a -> L62
            java.lang.Object r8 = r7.g(r0)     // Catch: com.amazon.aps.iva.z3.a -> L62
            if (r8 != r1) goto L61
            return r1
        L61:
            return r8
        L62:
            r8 = move-exception
            r2 = r7
        L64:
            com.amazon.aps.iva.z3.b<T> r5 = r2.c
            r0.h = r2
            r0.i = r8
            r0.l = r4
            java.lang.Object r4 = r5.a(r8)
            if (r4 != r1) goto L73
            return r1
        L73:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L77:
            r0.h = r2     // Catch: java.io.IOException -> L86
            r0.i = r8     // Catch: java.io.IOException -> L86
            r0.l = r3     // Catch: java.io.IOException -> L86
            java.lang.Object r0 = r4.j(r8, r0)     // Catch: java.io.IOException -> L86
            if (r0 != r1) goto L84
            return r1
        L84:
            r1 = r8
        L85:
            return r1
        L86:
            r8 = move-exception
            r0 = r2
        L88:
            com.amazon.aps.iva.aq.k.f(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.q.h(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.amazon.aps.iva.ob0.d r8, com.amazon.aps.iva.ob0.g r9, com.amazon.aps.iva.xb0.p r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.z3.z
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.z3.z r0 = (com.amazon.aps.iva.z3.z) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.z3.z r0 = new com.amazon.aps.iva.z3.z
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r9 = r0.i
            com.amazon.aps.iva.z3.q r10 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r9 = r0.j
            java.lang.Object r10 = r0.i
            com.amazon.aps.iva.z3.c r10 = (com.amazon.aps.iva.z3.c) r10
            com.amazon.aps.iva.z3.q r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L6b
        L43:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.amazon.aps.iva.ve0.v0 r8 = r7.h
            java.lang.Object r8 = r8.getValue()
            com.amazon.aps.iva.z3.c r8 = (com.amazon.aps.iva.z3.c) r8
            r8.a()
            com.amazon.aps.iva.z3.a0 r2 = new com.amazon.aps.iva.z3.a0
            T r6 = r8.a
            r2.<init>(r10, r6, r3)
            r0.h = r7
            r0.i = r8
            r0.j = r6
            r0.m = r5
            java.lang.Object r9 = com.amazon.aps.iva.se0.i.g(r0, r9, r2)
            if (r9 != r1) goto L67
            return r1
        L67:
            r2 = r7
            r10 = r8
            r8 = r9
            r9 = r6
        L6b:
            r10.a()
            boolean r10 = com.amazon.aps.iva.yb0.j.a(r9, r8)
            if (r10 == 0) goto L75
            goto L98
        L75:
            r0.h = r2
            r0.i = r8
            r0.j = r3
            r0.m = r4
            java.lang.Object r9 = r2.j(r8, r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            r9 = r8
            r10 = r2
        L86:
            com.amazon.aps.iva.ve0.v0 r8 = r10.h
            com.amazon.aps.iva.z3.c r10 = new com.amazon.aps.iva.z3.c
            if (r9 == 0) goto L91
            int r0 = r9.hashCode()
            goto L92
        L91:
            r0 = 0
        L92:
            r10.<init>(r9, r0)
            r8.setValue(r10)
        L98:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.q.i(com.amazon.aps.iva.ob0.d, com.amazon.aps.iva.ob0.g, com.amazon.aps.iva.xb0.p):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4 A[Catch: IOException -> 0x00bb, TRY_ENTER, TryCatch #2 {IOException -> 0x00bb, blocks: (B:31:0x0094, B:35:0x00a4, B:36:0x00ba, B:24:0x006a, B:41:0x00c0), top: B:53:0x006a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(T r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r9 instanceof com.amazon.aps.iva.z3.q.i
            if (r1 == 0) goto L15
            r1 = r9
            com.amazon.aps.iva.z3.q$i r1 = (com.amazon.aps.iva.z3.q.i) r1
            int r2 = r1.n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.n = r2
            goto L1a
        L15:
            com.amazon.aps.iva.z3.q$i r1 = new com.amazon.aps.iva.z3.q$i
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.l
            com.amazon.aps.iva.pb0.a r2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r3 = r1.n
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            java.io.FileOutputStream r8 = r1.k
            java.io.FileOutputStream r2 = r1.j
            java.io.File r3 = r1.i
            com.amazon.aps.iva.z3.q r1 = r1.h
            com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.lang.Throwable -> L31
            goto L8a
        L31:
            r8 = move-exception
            goto Lbd
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            com.amazon.aps.iva.ab.x.i0(r9)
            java.io.File r9 = r7.c()
            java.io.File r3 = r9.getCanonicalFile()
            java.io.File r3 = r3.getParentFile()
            if (r3 != 0) goto L4e
            goto L57
        L4e:
            r3.mkdirs()
            boolean r3 = r3.isDirectory()
            if (r3 == 0) goto Ld0
        L57:
            java.io.File r3 = new java.io.File
            java.io.File r9 = r7.c()
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.String r5 = r7.f
            java.lang.String r9 = com.amazon.aps.iva.yb0.j.k(r5, r9)
            r3.<init>(r9)
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lbb
            r9.<init>(r3)     // Catch: java.io.IOException -> Lbb
            com.amazon.aps.iva.z3.m<T> r5 = r7.b     // Catch: java.lang.Throwable -> Lbf
            com.amazon.aps.iva.z3.q$b r6 = new com.amazon.aps.iva.z3.q$b     // Catch: java.lang.Throwable -> Lbf
            r6.<init>(r9)     // Catch: java.lang.Throwable -> Lbf
            r1.h = r7     // Catch: java.lang.Throwable -> Lbf
            r1.i = r3     // Catch: java.lang.Throwable -> Lbf
            r1.j = r9     // Catch: java.lang.Throwable -> Lbf
            r1.k = r9     // Catch: java.lang.Throwable -> Lbf
            r1.n = r4     // Catch: java.lang.Throwable -> Lbf
            com.amazon.aps.iva.kb0.q r8 = r5.b(r8, r6)     // Catch: java.lang.Throwable -> Lbf
            if (r8 != r2) goto L87
            return r2
        L87:
            r1 = r7
            r8 = r9
            r2 = r8
        L8a:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L31
            r8.sync()     // Catch: java.lang.Throwable -> L31
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L31
            r8 = 0
            com.amazon.aps.iva.a60.b.k(r2, r8)     // Catch: java.io.IOException -> Lbb
            java.io.File r8 = r1.c()     // Catch: java.io.IOException -> Lbb
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lbb
            if (r8 == 0) goto La4
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        La4:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbb
            r9.<init>(r0)     // Catch: java.io.IOException -> Lbb
            r9.append(r3)     // Catch: java.io.IOException -> Lbb
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbb
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbb
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbb
            throw r8     // Catch: java.io.IOException -> Lbb
        Lbb:
            r8 = move-exception
            goto Lc6
        Lbd:
            r9 = r2
            goto Lc0
        Lbf:
            r8 = move-exception
        Lc0:
            throw r8     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            r0 = move-exception
            com.amazon.aps.iva.a60.b.k(r9, r8)     // Catch: java.io.IOException -> Lbb
            throw r0     // Catch: java.io.IOException -> Lbb
        Lc6:
            boolean r9 = r3.exists()
            if (r9 == 0) goto Lcf
            r3.delete()
        Lcf:
            throw r8
        Ld0:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Unable to create parent directories of "
            java.lang.String r9 = com.amazon.aps.iva.yb0.j.k(r9, r0)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.q.j(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
