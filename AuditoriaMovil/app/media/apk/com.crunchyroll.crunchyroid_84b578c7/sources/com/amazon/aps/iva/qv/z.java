package com.amazon.aps.iva.qv;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.qv.v;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CreatedCustomList;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareState;
import java.io.IOException;
/* compiled from: ModifyCrunchylistViewModel.kt */
/* loaded from: classes2.dex */
public final class z extends com.amazon.aps.iva.ez.b implements y, v {
    public final g b;
    public final /* synthetic */ w c;

    /* compiled from: ModifyCrunchylistViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.modifycrunchylist.ModifyCrunchylistViewModelImpl$createCrunchylist$1", f = "ModifyCrunchylistViewModel.kt", l = {32}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            String str = this.j;
            z zVar = z.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    g gVar = zVar.b;
                    this.h = 1;
                    obj = gVar.Q(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                CreatedCustomList createdCustomList = (CreatedCustomList) obj;
                LifecycleAwareState<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.nv.e>> lifecycleAwareState = zVar.c.b;
                com.amazon.aps.iva.yb0.j.f(createdCustomList, "<this>");
                com.amazon.aps.iva.yb0.j.f(str, "listTitle");
                lifecycleAwareState.b(new g.c(new com.amazon.aps.iva.nv.e("", createdCustomList.getListId(), str, 0, createdCustomList.getModifiedAt()), null));
            } catch (IOException e) {
                zVar.c.b.b(new g.a(null, e));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ModifyCrunchylistViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.modifycrunchylist.ModifyCrunchylistViewModelImpl$deleteCrunchylist$1", f = "ModifyCrunchylistViewModel.kt", l = {64}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.nv.e j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.nv.e eVar, int i, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = eVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            com.amazon.aps.iva.nv.e eVar = this.j;
            z zVar = z.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    zVar.c.d.b(new g.b(eVar));
                    g gVar = zVar.b;
                    String str = eVar.d;
                    this.h = 1;
                    if (gVar.V0(str, this) == aVar) {
                        return aVar;
                    }
                }
                zVar.c.d.b(new g.c(eVar, null));
            } catch (IOException e) {
                zVar.c.d.b(new g.a(null, new com.amazon.aps.iva.pv.a(eVar, this.k, e)));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ModifyCrunchylistViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.modifycrunchylist.ModifyCrunchylistViewModelImpl$renameCrunchylist$1", f = "ModifyCrunchylistViewModel.kt", l = {47}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.nv.e j;
        public final /* synthetic */ String k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.nv.e eVar, String str, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.j = eVar;
            this.k = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            String str = this.k;
            com.amazon.aps.iva.nv.e eVar = this.j;
            z zVar = z.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    g gVar = zVar.b;
                    String str2 = eVar.d;
                    this.h = 1;
                    if (gVar.z(str2, str, this) == aVar) {
                        return aVar;
                    }
                }
                zVar.c.c.b(new g.c(com.amazon.aps.iva.nv.e.b(eVar, str), null));
            } catch (IOException e) {
                zVar.c.c.b(new g.a(null, e));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(h hVar) {
        super(hVar);
        com.amazon.aps.iva.yb0.j.f(hVar, "interactor");
        this.b = hVar;
        v.l0.getClass();
        this.c = v.a.b;
    }

    @Override // com.amazon.aps.iva.qv.y
    public final void H3(String str, com.amazon.aps.iva.nv.e eVar) {
        com.amazon.aps.iva.yb0.j.f(str, "listName");
        com.amazon.aps.iva.yb0.j.f(eVar, "crunchylistItemUiModel");
        this.c.c.b(new g.b(null));
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new c(eVar, str, null), 3);
    }

    @Override // com.amazon.aps.iva.qv.y
    public final void M2(com.amazon.aps.iva.nv.e eVar, int i) {
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new b(eVar, i, null), 3);
    }

    @Override // com.amazon.aps.iva.qv.v
    public final LifecycleAwareState<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.nv.e>> d5() {
        return this.c.c;
    }

    @Override // com.amazon.aps.iva.qv.v
    public final LifecycleAwareState<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.nv.e>> v0() {
        return this.c.b;
    }

    @Override // com.amazon.aps.iva.qv.y
    public final void x1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "listName");
        this.c.b.b(new g.b(null));
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(str, null), 3);
    }

    @Override // com.amazon.aps.iva.qv.v
    public final LifecycleAwareState<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.nv.e>> z4() {
        return this.c.d;
    }
}
