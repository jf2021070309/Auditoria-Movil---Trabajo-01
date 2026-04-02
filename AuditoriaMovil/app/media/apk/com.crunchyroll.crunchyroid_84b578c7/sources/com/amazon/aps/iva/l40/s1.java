package com.amazon.aps.iva.l40;

import com.amazon.aps.iva.ez.g;
import com.ellation.crunchyroll.model.ContentContainer;
/* compiled from: ShowPageViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.ShowPageViewModelImpl$loadScreen$1", f = "ShowPageViewModel.kt", l = {131, 132}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ v1 j;

    /* compiled from: ShowPageViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.ShowPageViewModelImpl$loadScreen$1$upNextJob$1", f = "ShowPageViewModel.kt", l = {130}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.o00.e>>, Object> {
        public int h;
        public final /* synthetic */ v1 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1 v1Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = v1Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.o00.e>> dVar) {
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
                obj = v1.O8(this.i, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(v1 v1Var, com.amazon.aps.iva.ob0.d<? super s1> dVar) {
        super(2, dVar);
        this.j = v1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        s1 s1Var = new s1(this.j, dVar);
        s1Var.i = obj;
        return s1Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((s1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.se0.m0 b;
        ContentContainer contentContainer;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        v1 v1Var = this.j;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    return com.amazon.aps.iva.kb0.q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b = (com.amazon.aps.iva.se0.m0) this.i;
            com.amazon.aps.iva.ab.x.i0(obj);
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            b = com.amazon.aps.iva.se0.i.b((com.amazon.aps.iva.se0.g0) this.i, null, null, new a(v1Var, null), 3);
            this.i = b;
            this.h = 1;
            obj = v1.N8(v1Var, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        g.c a2 = ((com.amazon.aps.iva.ez.g) obj).a();
        if (a2 != null && (contentContainer = (ContentContainer) a2.a) != null) {
            this.i = null;
            this.h = 2;
            if (v1.P8(v1Var, contentContainer, b, this) == aVar) {
                return aVar;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
