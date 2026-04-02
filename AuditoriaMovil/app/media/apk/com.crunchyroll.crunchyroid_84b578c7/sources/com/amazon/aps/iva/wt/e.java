package com.amazon.aps.iva.wt;
/* compiled from: CommentActionInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.action.CommentActionInteractorImpl", f = "CommentActionInteractor.kt", l = {65}, m = "deleteComment")
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.qb0.c {
    public /* synthetic */ Object h;
    public final /* synthetic */ f i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
        super(dVar);
        this.i = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.N(null, this);
    }
}
