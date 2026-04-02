package com.amazon.aps.iva.wt;

import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModelImpl;
import java.io.IOException;
/* compiled from: CommentActionViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModelImpl$deleteComment$1", f = "CommentActionViewModel.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ CommentActionViewModelImpl i;
    public final /* synthetic */ x j;

    /* compiled from: CommentActionViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.vt.h, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ x h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar) {
            super(1);
            this.h = xVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.vt.h hVar) {
            com.amazon.aps.iva.vt.h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "$this$notify");
            hVar2.o(this.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentActionViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.COMMENT_HARD_DELETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.COMMENT_DELETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CommentActionViewModelImpl commentActionViewModelImpl, x xVar, com.amazon.aps.iva.ob0.d<? super p> dVar) {
        super(2, dVar);
        this.i = commentActionViewModelImpl;
        this.j = xVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new p(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((p) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Enum N;
        x a2;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        CommentActionViewModelImpl commentActionViewModelImpl = this.i;
        try {
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    N = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.ez.h.d(commentActionViewModelImpl.h);
                d dVar = commentActionViewModelImpl.b;
                String str = this.j.b;
                this.h = 1;
                N = dVar.N(str, this);
                if (N == aVar) {
                    return aVar;
                }
            }
            int i2 = b.a[((c) N).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    a2 = x.a(this.j, 0, false, 0, false, false, false, true, false, false, false, 221183);
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
            } else {
                commentActionViewModelImpl.c.Z5();
                a2 = x.a(this.j, 0, false, 0, false, false, false, false, true, false, false, 229375);
            }
            commentActionViewModelImpl.h.k(new com.amazon.aps.iva.ez.d<>(new g.c(a2, null)));
            commentActionViewModelImpl.d.a(a2);
            commentActionViewModelImpl.notify(new a(a2));
        } catch (IOException e) {
            commentActionViewModelImpl.h.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
