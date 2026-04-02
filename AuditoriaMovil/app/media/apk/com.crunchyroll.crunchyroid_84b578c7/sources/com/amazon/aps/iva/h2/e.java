package com.amazon.aps.iva.h2;

import com.amazon.aps.iva.h2.q0;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.y1;
import com.google.android.gms.cast.MediaError;
import java.util.List;
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* loaded from: classes.dex */
public final class e implements p3<Object> {
    public final List<j> b;
    public final n0 c;
    public final f d;
    public final com.amazon.aps.iva.xb0.l<q0.b, com.amazon.aps.iva.kb0.q> e;
    public final c0 f;
    public final y1 g;
    public boolean h;

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {268, 281}, m = "load")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public e h;
        public List i;
        public j j;
        public int k;
        public int l;
        public /* synthetic */ Object m;
        public int o;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.m = obj;
            this.o |= Integer.MIN_VALUE;
            return e.this.f(this);
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {269}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super Object>, Object> {
        public int h;
        public final /* synthetic */ j j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(1, dVar);
            this.j = jVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(com.amazon.aps.iva.ob0.d<? super Object> dVar) {
            return ((b) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                this.h = 1;
                obj = e.this.g(this.j, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {300}, m = "loadWithTimeoutOrNull$ui_text_release")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public j h;
        public /* synthetic */ Object i;
        public int k;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return e.this.g(null, this);
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {MediaError.DetailedErrorCode.SEGMENT_NETWORK}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super Object>, Object> {
        public int h;
        public final /* synthetic */ j j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j jVar, com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
            this.j = jVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super Object> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                c0 c0Var = e.this.f;
                this.h = 1;
                obj = c0Var.c(this.j, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends j> list, Object obj, n0 n0Var, f fVar, com.amazon.aps.iva.xb0.l<? super q0.b, com.amazon.aps.iva.kb0.q> lVar, c0 c0Var) {
        com.amazon.aps.iva.yb0.j.f(obj, "initialType");
        com.amazon.aps.iva.yb0.j.f(fVar, "asyncTypefaceCache");
        com.amazon.aps.iva.yb0.j.f(lVar, "onCompletion");
        this.b = list;
        this.c = n0Var;
        this.d = fVar;
        this.e = lVar;
        this.f = c0Var;
        this.g = com.amazon.aps.iva.cq.b.c0(obj);
        this.h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3 A[Catch: all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00cf, blocks: (B:37:0x00a3, B:42:0x00d1, B:20:0x0052), top: B:62:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1 A[Catch: all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00cf, blocks: (B:37:0x00a3, B:42:0x00d1, B:20:0x0052), top: B:62:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007a -> B:47:0x00ea). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e7 -> B:46:0x00e8). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h2.e.f(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.amazon.aps.iva.h2.j r7, com.amazon.aps.iva.ob0.d<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.h2.e.c
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.h2.e$c r0 = (com.amazon.aps.iva.h2.e.c) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.h2.e$c r0 = new com.amazon.aps.iva.h2.e$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.h2.j r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L73
            goto L47
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.amazon.aps.iva.h2.e$d r8 = new com.amazon.aps.iva.h2.e$d     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L73
            r8.<init>(r7, r4)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L73
            r0.h = r7     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L73
            r0.k = r3     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L73
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = com.amazon.aps.iva.p4.f.f(r2, r8, r0)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L73
            if (r8 != r1) goto L47
            return r1
        L47:
            r4 = r8
            goto L7e
        L49:
            r8 = move-exception
            com.amazon.aps.iva.ob0.g r1 = r0.getContext()
            kotlinx.coroutines.CoroutineExceptionHandler$a r2 = kotlinx.coroutines.CoroutineExceptionHandler.a.b
            com.amazon.aps.iva.ob0.g$b r1 = r1.get(r2)
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            if (r1 == 0) goto L7e
            com.amazon.aps.iva.ob0.g r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load font "
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L7e
        L73:
            r7 = move-exception
            com.amazon.aps.iva.ob0.g r8 = r0.getContext()
            boolean r8 = com.amazon.aps.iva.a60.b.t(r8)
            if (r8 == 0) goto L7f
        L7e:
            return r4
        L7f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h2.e.g(com.amazon.aps.iva.h2.j, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.o0.p3
    public final Object getValue() {
        return this.g.getValue();
    }
}
