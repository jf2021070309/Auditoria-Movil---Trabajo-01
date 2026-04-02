package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.m2;
import java.util.Set;
/* compiled from: Recomposer.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {945}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r2 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public com.amazon.aps.iva.y0.g h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ m2 k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.se0.g0, i1, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> l;
    public final /* synthetic */ i1 m;

    /* compiled from: Recomposer.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {946}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.se0.g0, i1, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> j;
        public final /* synthetic */ i1 k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.se0.g0, ? super i1, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, i1 i1Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = qVar;
            this.k = i1Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, this.k, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                if (this.j.invoke((com.amazon.aps.iva.se0.g0) this.i, this.k, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Set<? extends Object>, com.amazon.aps.iva.y0.h, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ m2 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m2 m2Var) {
            super(2);
            this.h = m2Var;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(Set<? extends Object> set, com.amazon.aps.iva.y0.h hVar) {
            com.amazon.aps.iva.se0.m<com.amazon.aps.iva.kb0.q> mVar;
            Set<? extends Object> set2 = set;
            com.amazon.aps.iva.yb0.j.f(set2, "changed");
            com.amazon.aps.iva.yb0.j.f(hVar, "<anonymous parameter 1>");
            m2 m2Var = this.h;
            synchronized (m2Var.b) {
                if (((m2.d) m2Var.r.getValue()).compareTo(m2.d.Idle) >= 0) {
                    m2Var.f.b(set2);
                    mVar = m2Var.u();
                } else {
                    mVar = null;
                }
            }
            if (mVar != null) {
                mVar.resumeWith(com.amazon.aps.iva.kb0.q.a);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r2(m2 m2Var, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.se0.g0, ? super i1, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, i1 i1Var, com.amazon.aps.iva.ob0.d<? super r2> dVar) {
        super(2, dVar);
        this.k = m2Var;
        this.l = qVar;
        this.m = i1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        r2 r2Var = new r2(this.k, this.l, this.m, dVar);
        r2Var.j = obj;
        return r2Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((r2) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.r2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
