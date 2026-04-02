package com.amazon.aps.iva.nu;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import java.io.IOException;
/* compiled from: CommentsTotalCountViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.commentscount.CommentsTotalCountViewModelImpl$loadCommentsCount$1", f = "CommentsTotalCountViewModel.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public v h;
    public int i;
    public final /* synthetic */ i j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str, com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(2, dVar);
        this.j = iVar;
        this.k = str;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new h(this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((h) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        v<com.amazon.aps.iva.ez.g<Integer>> vVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.i;
        i iVar = this.j;
        try {
            if (i != 0) {
                if (i == 1) {
                    vVar = this.h;
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                v<com.amazon.aps.iva.ez.g<Integer>> vVar2 = iVar.c;
                com.amazon.aps.iva.qu.a aVar2 = iVar.b;
                String str = this.k;
                this.h = vVar2;
                this.i = 1;
                Object U = aVar2.U(str, this);
                if (U == aVar) {
                    return aVar;
                }
                vVar = vVar2;
                obj = U;
            }
            vVar.k(new g.c(obj, null));
        } catch (IOException e) {
            com.amazon.aps.iva.e4.e.g(null, e, iVar.c);
        }
        return q.a;
    }
}
