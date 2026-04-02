package com.amazon.aps.iva.oh;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.oh.b;
import com.amazon.aps.iva.se0.d1;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.v1;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.xb0.p;
import java.io.IOException;
import java.util.List;
/* compiled from: MarkAsWatchedToggleViewModelImpl.kt */
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.ez.b implements g {
    public final e b;
    public final com.amazon.aps.iva.nh.a c;
    public final g0 d;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.oh.b>> e;

    /* compiled from: MarkAsWatchedToggleViewModelImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.markaswatched.toggle.MarkAsWatchedToggleViewModelImpl$markAsWatched$1", f = "MarkAsWatchedToggleViewModelImpl.kt", l = {27}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.oh.a j;

        /* compiled from: MarkAsWatchedToggleViewModelImpl.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.markaswatched.toggle.MarkAsWatchedToggleViewModelImpl$markAsWatched$1$1", f = "MarkAsWatchedToggleViewModelImpl.kt", l = {29}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.oh.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0574a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
            public int h;
            public final /* synthetic */ h i;
            public final /* synthetic */ com.amazon.aps.iva.oh.a j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0574a(h hVar, com.amazon.aps.iva.oh.a aVar, com.amazon.aps.iva.ob0.d<? super C0574a> dVar) {
                super(2, dVar);
                this.i = hVar;
                this.j = aVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0574a(this.i, this.j, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
                return ((C0574a) create(g0Var, dVar)).invokeSuspend(q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                h hVar = this.i;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        x.i0(obj);
                        e eVar = hVar.b;
                        List<com.amazon.aps.iva.nz.a> list = this.j.a;
                        this.h = 1;
                        if (eVar.T(list, this) == aVar) {
                            return aVar;
                        }
                    }
                    hVar.c.c();
                } catch (IOException e) {
                    hVar.c.b(e);
                    hVar.e.i(new com.amazon.aps.iva.ez.d<>(b.a.a));
                }
                return q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.oh.a aVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
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
                v1 v1Var = v1.b;
                C0574a c0574a = new C0574a(h.this, this.j, null);
                this.h = 1;
                if (com.amazon.aps.iva.se0.i.g(this, v1Var, c0574a) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* compiled from: MarkAsWatchedToggleViewModelImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.markaswatched.toggle.MarkAsWatchedToggleViewModelImpl$markParentAsWatched$1", f = "MarkAsWatchedToggleViewModelImpl.kt", l = {49}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.oh.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.oh.a aVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            h hVar = h.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    e eVar = hVar.b;
                    List<com.amazon.aps.iva.nz.a> list = this.j.a;
                    this.h = 1;
                    if (eVar.O1(list, this) == aVar) {
                        return aVar;
                    }
                }
                hVar.c.c();
                hVar.e.i(new com.amazon.aps.iva.ez.d<>(b.C0573b.a));
            } catch (IOException e) {
                hVar.c.b(e);
                hVar.e.i(new com.amazon.aps.iva.ez.d<>(b.a.a));
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, com.amazon.aps.iva.nh.b bVar) {
        super(new j[0]);
        d1 d1Var = d1.b;
        this.b = fVar;
        this.c = bVar;
        this.d = d1Var;
        this.e = new v<>();
    }

    @Override // com.amazon.aps.iva.oh.g
    public final v E7() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.oh.g
    public final void H8(com.amazon.aps.iva.oh.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "data");
        this.c.a(aVar.b);
        com.amazon.aps.iva.se0.i.d(this.d, null, null, new b(aVar, null), 3);
    }

    @Override // com.amazon.aps.iva.oh.g
    public final void O7(String... strArr) {
        com.amazon.aps.iva.yb0.j.f(strArr, "assetId");
        this.e.k(new com.amazon.aps.iva.ez.d<>(new b.c(o.b0(strArr))));
    }

    @Override // com.amazon.aps.iva.oh.g
    public final void U4(com.amazon.aps.iva.oh.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "data");
        this.c.a(aVar.b);
        com.amazon.aps.iva.se0.i.d(this.d, null, null, new a(aVar, null), 3);
    }
}
