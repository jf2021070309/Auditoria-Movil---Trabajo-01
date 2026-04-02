package com.amazon.aps.iva.ru;

import com.google.android.gms.cast.MediaError;
/* compiled from: CommentRepliesViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.replies.CommentRepliesViewModelImpl", f = "CommentRepliesViewModel.kt", l = {MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED}, m = "reloadParentCommentData")
/* loaded from: classes2.dex */
public final class k0 extends com.amazon.aps.iva.qb0.c {
    public h0 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ h0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(h0 h0Var, com.amazon.aps.iva.ob0.d<? super k0> dVar) {
        super(dVar);
        this.j = h0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return h0.N8(this.j, this);
    }
}
