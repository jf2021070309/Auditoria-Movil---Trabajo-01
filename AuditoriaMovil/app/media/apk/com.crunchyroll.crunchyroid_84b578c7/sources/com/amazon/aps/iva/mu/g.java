package com.amazon.aps.iva.mu;

import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.commenting.body.VoteType;
import java.io.IOException;
/* compiled from: CommentsVoteViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.vote.CommentsVoteViewModelImpl$updateLikeState$1", f = "CommentsVoteViewModel.kt", l = {61, 63}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ h j;
    public final /* synthetic */ String k;
    public final /* synthetic */ x l;
    public final /* synthetic */ x m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z, h hVar, String str, x xVar, x xVar2, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(2, dVar);
        this.i = z;
        this.j = hVar;
        this.k = str;
        this.l = xVar;
        this.m = xVar2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new g(this.i, this.j, this.k, this.l, this.m, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((g) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x003f -> B:21:0x0060). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        boolean z = this.i;
        String str = this.k;
        h hVar = this.j;
        try {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                if (z) {
                    com.amazon.aps.iva.wt.d dVar = hVar.b;
                    VoteType voteType = VoteType.LIKE;
                    this.h = 1;
                    if (dVar.u1(str, voteType, this) == aVar) {
                        return aVar;
                    }
                } else {
                    com.amazon.aps.iva.wt.d dVar2 = hVar.b;
                    VoteType voteType2 = VoteType.LIKE;
                    this.h = 2;
                    if (dVar2.o1(str, voteType2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } catch (IOException e) {
            hVar.c.k(new com.amazon.aps.iva.ez.d<>(new g.c(this.l, null)));
            hVar.c.k(new com.amazon.aps.iva.ez.d<>(new g.a(null, e)));
        }
        Boolean remove = hVar.d.remove(str);
        if (remove != null && !j.a(Boolean.valueOf(z), remove)) {
            hVar.O8(this.m, remove.booleanValue());
        }
        return q.a;
    }
}
