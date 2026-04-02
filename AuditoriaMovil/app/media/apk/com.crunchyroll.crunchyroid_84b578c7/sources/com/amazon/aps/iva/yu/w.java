package com.amazon.aps.iva.yu;

import com.amazon.aps.iva.cv.u;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomLists;
import java.io.IOException;
/* compiled from: AddToCrunchylistViewModel.kt */
/* loaded from: classes2.dex */
public final class w extends com.amazon.aps.iva.ez.b implements v, com.amazon.aps.iva.cv.u {
    public final h b;
    public final String c;
    public final /* synthetic */ com.amazon.aps.iva.cv.v d;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<x>> e;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.q>> f;

    /* compiled from: AddToCrunchylistViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.addtocrunchylist.AddToCrunchylistViewModelImpl$addToCrunchylists$1", f = "AddToCrunchylistViewModel.kt", l = {55}, m = "invokeSuspend")
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
            w wVar = w.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    h hVar = wVar.b;
                    String str = this.j;
                    String str2 = wVar.c;
                    this.h = 1;
                    if (hVar.k(str, str2, this) == aVar) {
                        return aVar;
                    }
                }
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                wVar.f.k(new g.c(qVar, null));
                wVar.d.c.k(new com.amazon.aps.iva.ez.d<>(qVar));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, wVar.f);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AddToCrunchylistViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.addtocrunchylist.AddToCrunchylistViewModelImpl$loadCrunchylists$1", f = "AddToCrunchylistViewModel.kt", l = {44}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            w wVar = w.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    h hVar = wVar.b;
                    this.h = 1;
                    obj = hVar.getCustomLists(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                wVar.e.k(new g.c(com.amazon.aps.iva.e.w.U((CustomLists) obj, z.b), null));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, wVar.e);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.lifecycle.p pVar, i iVar, String str) {
        super(iVar);
        com.amazon.aps.iva.yb0.j.f(pVar, "savedStateHandle");
        com.amazon.aps.iva.yb0.j.f(iVar, "interactor");
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        this.b = iVar;
        this.c = str;
        com.amazon.aps.iva.cv.u.c0.getClass();
        this.d = u.a.b;
        this.e = new com.amazon.aps.iva.i5.v<>();
        this.f = new com.amazon.aps.iva.i5.v<>();
        X();
        pVar.d(str, "add_to_crunchylists_content_id");
    }

    @Override // com.amazon.aps.iva.yu.v
    public final com.amazon.aps.iva.i5.v H() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.cv.u
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.nv.e>> V6() {
        return this.d.b;
    }

    @Override // com.amazon.aps.iva.yu.v
    public final void X() {
        com.amazon.aps.iva.ez.h.c(this.e, null);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new b(null), 3);
    }

    @Override // com.amazon.aps.iva.cv.u
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> m5() {
        return this.d.c;
    }

    @Override // com.amazon.aps.iva.yu.v
    public final void o7(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "crunchylistId");
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(str, null), 3);
    }

    @Override // com.amazon.aps.iva.yu.v
    public final com.amazon.aps.iva.i5.v s() {
        return this.e;
    }
}
