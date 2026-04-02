package com.amazon.aps.iva.z3;

import com.amazon.aps.iva.ve0.z0;
import com.amazon.aps.iva.z3.q;
/* compiled from: SingleProcessDataStore.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ve0.g<Object>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ q<Object> j;

    /* compiled from: SingleProcessDataStore.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<b0<Object>, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
        public /* synthetic */ Object h;
        public final /* synthetic */ b0<Object> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0<Object> b0Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = b0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.i, dVar);
            aVar.h = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(b0<Object> b0Var, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            b0<Object> b0Var = (b0) this.h;
            b0<Object> b0Var2 = this.i;
            boolean z = false;
            if (!(b0Var2 instanceof c) && !(b0Var2 instanceof j) && b0Var == b0Var2) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q<Object> qVar, com.amazon.aps.iva.ob0.d<? super u> dVar) {
        super(2, dVar);
        this.j = qVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        u uVar = new u(this.j, dVar);
        uVar.i = obj;
        return uVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.ve0.g<Object> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((u) create(gVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            com.amazon.aps.iva.ve0.g gVar = (com.amazon.aps.iva.ve0.g) this.i;
            q<Object> qVar = this.j;
            b0 b0Var = (b0) qVar.h.getValue();
            if (!(b0Var instanceof c)) {
                qVar.j.a(new q.a.C0909a(b0Var));
            }
            a aVar2 = new a(b0Var, null);
            this.h = 1;
            if (!(gVar instanceof z0)) {
                Object c = qVar.h.c(new com.amazon.aps.iva.ve0.p(new com.amazon.aps.iva.yb0.z(), new v(gVar), aVar2), this);
                if (c != aVar) {
                    c = com.amazon.aps.iva.kb0.q.a;
                }
                if (c != aVar) {
                    c = com.amazon.aps.iva.kb0.q.a;
                }
                if (c != aVar) {
                    c = com.amazon.aps.iva.kb0.q.a;
                }
                if (c == aVar) {
                    return aVar;
                }
            } else {
                ((z0) gVar).getClass();
                throw null;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
