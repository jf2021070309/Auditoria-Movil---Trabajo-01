package com.amazon.aps.iva.vx;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xw.f0;
import com.amazon.aps.iva.xx.c;
import com.ellation.crunchyroll.model.UpNext;
import java.util.ArrayList;
import java.util.List;
/* compiled from: HomeFeedViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.HomeFeedViewModelImpl$updateSingleShowCards$1$1", f = "HomeFeedViewModel.kt", l = {132}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ List<com.amazon.aps.iva.xx.l> i;
    public final /* synthetic */ a0 j;
    public final /* synthetic */ List<String> k;

    /* compiled from: HomeFeedViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.HomeFeedViewModelImpl$updateSingleShowCards$1$1$1", f = "HomeFeedViewModel.kt", l = {148}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ List<com.amazon.aps.iva.xx.l> j;
        public final /* synthetic */ a0 k;
        public final /* synthetic */ List<String> l;

        /* compiled from: HomeFeedViewModel.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.HomeFeedViewModelImpl$updateSingleShowCards$1$1$1$newItems$1$1", f = "HomeFeedViewModel.kt", l = {139}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.vx.b0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0811a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l>, Object> {
            public c.a h;
            public int i;
            public final /* synthetic */ com.amazon.aps.iva.xx.l j;
            public final /* synthetic */ List<String> k;
            public final /* synthetic */ a0 l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0811a(com.amazon.aps.iva.xx.l lVar, List<String> list, a0 a0Var, com.amazon.aps.iva.ob0.d<? super C0811a> dVar) {
                super(2, dVar);
                this.j = lVar;
                this.k = list;
                this.l = a0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0811a(this.j, this.k, this.l, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> dVar) {
                return ((C0811a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                c.a aVar;
                com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.i;
                if (i != 0) {
                    if (i == 1) {
                        aVar = this.h;
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.amazon.aps.iva.xx.l lVar = this.j;
                    if (lVar instanceof c.a) {
                        c.a aVar3 = (c.a) lVar;
                        if (this.k.contains(f0.a(aVar3.f))) {
                            com.amazon.aps.iva.gy.g gVar = this.l.c;
                            com.amazon.aps.iva.x50.t resourceType = aVar3.f.getResourceType();
                            String a = f0.a(aVar3.f);
                            this.h = aVar3;
                            this.i = 1;
                            obj = gVar.K(a, resourceType, this);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            aVar = aVar3;
                        } else {
                            return lVar;
                        }
                    } else {
                        return lVar;
                    }
                }
                return c.a.c(aVar, null, (UpNext) obj, 7);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends com.amazon.aps.iva.xx.l> list, a0 a0Var, List<String> list2, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = list;
            this.k = a0Var;
            this.l = list2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, this.k, this.l, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            a0 a0Var = this.k;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                g0 g0Var = (g0) this.i;
                List<com.amazon.aps.iva.xx.l> list = this.j;
                ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
                for (com.amazon.aps.iva.xx.l lVar : list) {
                    arrayList.add(com.amazon.aps.iva.se0.i.b(g0Var, null, null, new C0811a(lVar, this.l, a0Var, null), 3));
                }
                this.h = 1;
                obj = com.amazon.aps.iva.se0.d.a(arrayList, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            a0Var.e.k(new g.c((List) obj, null));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(List<? extends com.amazon.aps.iva.xx.l> list, a0 a0Var, List<String> list2, com.amazon.aps.iva.ob0.d<? super b0> dVar) {
        super(2, dVar);
        this.i = list;
        this.j = a0Var;
        this.k = list2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new b0(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((b0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            a aVar2 = new a(this.i, this.j, this.k, null);
            this.h = 1;
            if (com.amazon.aps.iva.e.z.p(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
