package com.amazon.aps.iva.j5;

import androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3;
import androidx.lifecycle.g;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e2;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.ob0.h;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.f;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
/* compiled from: FlowExt.kt */
@e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1", f = "FlowExt.kt", l = {171}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends i implements p<e2<Object>, d<? super q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ g j;
    public final /* synthetic */ g.b k;
    public final /* synthetic */ com.amazon.aps.iva.ob0.g l;
    public final /* synthetic */ f<Object> m;

    /* compiled from: FlowExt.kt */
    @e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {173, 174}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.j5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0398a extends i implements p<g0, d<? super q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.ob0.g i;
        public final /* synthetic */ f<Object> j;
        public final /* synthetic */ e2<Object> k;

        /* compiled from: FlowExt.kt */
        /* renamed from: com.amazon.aps.iva.j5.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0399a implements com.amazon.aps.iva.ve0.g<Object> {
            public final /* synthetic */ e2<Object> b;

            public C0399a(e2<Object> e2Var) {
                this.b = e2Var;
            }

            @Override // com.amazon.aps.iva.ve0.g
            public final Object a(Object obj, d<? super q> dVar) {
                this.b.setValue(obj);
                return q.a;
            }
        }

        /* compiled from: FlowExt.kt */
        @e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2", f = "FlowExt.kt", l = {175}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.j5.a$a$b */
        /* loaded from: classes.dex */
        public static final class b extends i implements p<g0, d<? super q>, Object> {
            public int h;
            public final /* synthetic */ f<Object> i;
            public final /* synthetic */ e2<Object> j;

            /* compiled from: FlowExt.kt */
            /* renamed from: com.amazon.aps.iva.j5.a$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0400a implements com.amazon.aps.iva.ve0.g<Object> {
                public final /* synthetic */ e2<Object> b;

                public C0400a(e2<Object> e2Var) {
                    this.b = e2Var;
                }

                @Override // com.amazon.aps.iva.ve0.g
                public final Object a(Object obj, d<? super q> dVar) {
                    this.b.setValue(obj);
                    return q.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f<Object> fVar, e2<Object> e2Var, d<? super b> dVar) {
                super(2, dVar);
                this.i = fVar;
                this.j = e2Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final d<q> create(Object obj, d<?> dVar) {
                return new b(this.i, this.j, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, d<? super q> dVar) {
                return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
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
                    C0400a c0400a = new C0400a(this.j);
                    this.h = 1;
                    if (this.i.c(c0400a, this) == aVar) {
                        return aVar;
                    }
                }
                return q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0398a(com.amazon.aps.iva.ob0.g gVar, f<Object> fVar, e2<Object> e2Var, d<? super C0398a> dVar) {
            super(2, dVar);
            this.i = gVar;
            this.j = fVar;
            this.k = e2Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            return new C0398a(this.i, this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super q> dVar) {
            return ((C0398a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                h hVar = h.b;
                com.amazon.aps.iva.ob0.g gVar = this.i;
                boolean a = j.a(gVar, hVar);
                e2<Object> e2Var = this.k;
                f<Object> fVar = this.j;
                if (a) {
                    C0399a c0399a = new C0399a(e2Var);
                    this.h = 1;
                    if (fVar.c(c0399a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    b bVar = new b(fVar, e2Var, null);
                    this.h = 2;
                    if (com.amazon.aps.iva.se0.i.g(this, gVar, bVar) == aVar) {
                        return aVar;
                    }
                }
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, g.b bVar, com.amazon.aps.iva.ob0.g gVar2, f<Object> fVar, d<? super a> dVar) {
        super(2, dVar);
        this.j = gVar;
        this.k = bVar;
        this.l = gVar2;
        this.m = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        a aVar = new a(this.j, this.k, this.l, this.m, dVar);
        aVar.i = obj;
        return aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(e2<Object> e2Var, d<? super q> dVar) {
        return ((a) create(e2Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object p;
        Object obj2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            C0398a c0398a = new C0398a(this.l, this.m, (e2) this.i, null);
            this.h = 1;
            g.b bVar = g.b.INITIALIZED;
            g.b bVar2 = this.k;
            if (bVar2 == bVar) {
                z = false;
            }
            if (z) {
                g gVar = this.j;
                if (gVar.getCurrentState() == g.b.DESTROYED) {
                    p = q.a;
                } else {
                    p = z.p(new RepeatOnLifecycleKt$repeatOnLifecycle$3(gVar, bVar2, c0398a, null), this);
                    if (p != obj2) {
                        p = q.a;
                    }
                }
                if (p == obj2) {
                    return obj2;
                }
            } else {
                throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
            }
        }
        return q.a;
    }
}
