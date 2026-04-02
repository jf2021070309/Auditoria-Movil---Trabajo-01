package androidx.lifecycle;

import androidx.lifecycle.g;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.se0.t1;
import com.amazon.aps.iva.yb0.d0;
/* compiled from: RepeatOnLifecycle.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ g j;
    public final /* synthetic */ g.b k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> l;

    /* compiled from: RepeatOnLifecycle.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public d0 h;
        public d0 i;
        public g0 j;
        public com.amazon.aps.iva.xb0.p k;
        public int l;
        public final /* synthetic */ g m;
        public final /* synthetic */ g.b n;
        public final /* synthetic */ g0 o;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(g gVar, g.b bVar, g0 g0Var, com.amazon.aps.iva.xb0.p<? super g0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.m = gVar;
            this.n = bVar;
            this.o = g0Var;
            this.p = pVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new AnonymousClass1(this.m, this.n, this.o, this.p, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((AnonymousClass1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
        /* JADX WARN: Type inference failed for: r15v0, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T, com.amazon.aps.iva.i5.n] */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r1.l
                r3 = 0
                androidx.lifecycle.g r4 = r1.m
                r5 = 1
                if (r2 == 0) goto L21
                if (r2 != r5) goto L19
                com.amazon.aps.iva.yb0.d0 r2 = r1.i
                com.amazon.aps.iva.yb0.d0 r5 = r1.h
                com.amazon.aps.iva.ab.x.i0(r17)     // Catch: java.lang.Throwable -> L16
                goto L7d
            L16:
                r0 = move-exception
                goto L95
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L21:
                com.amazon.aps.iva.ab.x.i0(r17)
                androidx.lifecycle.g$b r2 = r4.getCurrentState()
                androidx.lifecycle.g$b r6 = androidx.lifecycle.g.b.DESTROYED
                if (r2 != r6) goto L2f
                com.amazon.aps.iva.kb0.q r0 = com.amazon.aps.iva.kb0.q.a
                return r0
            L2f:
                com.amazon.aps.iva.yb0.d0 r2 = new com.amazon.aps.iva.yb0.d0
                r2.<init>()
                com.amazon.aps.iva.yb0.d0 r13 = new com.amazon.aps.iva.yb0.d0
                r13.<init>()
                androidx.lifecycle.g$b r6 = r1.n     // Catch: java.lang.Throwable -> L92
                com.amazon.aps.iva.se0.g0 r8 = r1.o     // Catch: java.lang.Throwable -> L92
                com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, java.lang.Object> r12 = r1.p     // Catch: java.lang.Throwable -> L92
                r1.h = r2     // Catch: java.lang.Throwable -> L92
                r1.i = r13     // Catch: java.lang.Throwable -> L92
                r1.j = r8     // Catch: java.lang.Throwable -> L92
                r1.k = r12     // Catch: java.lang.Throwable -> L92
                r1.l = r5     // Catch: java.lang.Throwable -> L92
                com.amazon.aps.iva.se0.n r14 = new com.amazon.aps.iva.se0.n     // Catch: java.lang.Throwable -> L92
                com.amazon.aps.iva.ob0.d r7 = com.amazon.aps.iva.a60.b.s(r16)     // Catch: java.lang.Throwable -> L92
                r14.<init>(r5, r7)     // Catch: java.lang.Throwable -> L92
                r14.r()     // Catch: java.lang.Throwable -> L92
                androidx.lifecycle.g$a$a r5 = androidx.lifecycle.g.a.Companion     // Catch: java.lang.Throwable -> L92
                r5.getClass()     // Catch: java.lang.Throwable -> L92
                androidx.lifecycle.g$a r7 = androidx.lifecycle.g.a.C0034a.c(r6)     // Catch: java.lang.Throwable -> L92
                androidx.lifecycle.g$a r9 = androidx.lifecycle.g.a.C0034a.a(r6)     // Catch: java.lang.Throwable -> L92
                com.amazon.aps.iva.ze0.d r11 = com.amazon.aps.iva.gy.t.d()     // Catch: java.lang.Throwable -> L92
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r15 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> L92
                r5 = r15
                r6 = r7
                r7 = r2
                r10 = r14
                r5.<init>()     // Catch: java.lang.Throwable -> L92
                r13.b = r15     // Catch: java.lang.Throwable -> L92
                r4.addObserver(r15)     // Catch: java.lang.Throwable -> L92
                java.lang.Object r5 = r14.q()     // Catch: java.lang.Throwable -> L92
                if (r5 != r0) goto L7b
                return r0
            L7b:
                r5 = r2
                r2 = r13
            L7d:
                T r0 = r5.b
                com.amazon.aps.iva.se0.j1 r0 = (com.amazon.aps.iva.se0.j1) r0
                if (r0 == 0) goto L86
                r0.a(r3)
            L86:
                T r0 = r2.b
                androidx.lifecycle.j r0 = (androidx.lifecycle.j) r0
                if (r0 == 0) goto L8f
                r4.removeObserver(r0)
            L8f:
                com.amazon.aps.iva.kb0.q r0 = com.amazon.aps.iva.kb0.q.a
                return r0
            L92:
                r0 = move-exception
                r5 = r2
                r2 = r13
            L95:
                T r5 = r5.b
                com.amazon.aps.iva.se0.j1 r5 = (com.amazon.aps.iva.se0.j1) r5
                if (r5 == 0) goto L9e
                r5.a(r3)
            L9e:
                T r2 = r2.b
                androidx.lifecycle.j r2 = (androidx.lifecycle.j) r2
                if (r2 == 0) goto La7
                r4.removeObserver(r2)
            La7:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(g gVar, g.b bVar, com.amazon.aps.iva.xb0.p<? super g0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dVar) {
        super(2, dVar);
        this.j = gVar;
        this.k = bVar;
        this.l = pVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.j, this.k, this.l, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.i = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            g0 g0Var = (g0) this.i;
            com.amazon.aps.iva.ye0.c cVar = r0.a;
            t1 C = com.amazon.aps.iva.xe0.k.a.C();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.j, this.k, g0Var, this.l, null);
            this.h = 1;
            if (com.amazon.aps.iva.se0.i.g(this, C, anonymousClass1) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
