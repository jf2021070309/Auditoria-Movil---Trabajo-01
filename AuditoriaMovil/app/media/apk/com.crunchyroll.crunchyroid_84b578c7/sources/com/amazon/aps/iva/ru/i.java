package com.amazon.aps.iva.ru;

import com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModelImpl;
/* compiled from: CommentRepliesModule.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, CommentActionViewModelImpl> {
    public final /* synthetic */ r h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar) {
        super(1);
        this.h = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final CommentActionViewModelImpl invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        r rVar = this.h;
        com.amazon.aps.iva.wt.f fVar = rVar.d;
        h0 g = rVar.g();
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.ff.b bVar = rVar.c;
        com.amazon.aps.iva.yb0.j.f(bVar, "currentAssetProvider");
        CommentActionViewModelImpl commentActionViewModelImpl = new CommentActionViewModelImpl(fVar, g, new com.amazon.aps.iva.wt.b(cVar, bVar));
        commentActionViewModelImpl.addEventListener(rVar.g());
        commentActionViewModelImpl.addEventListener((com.amazon.aps.iva.hu.h) rVar.f.getValue(rVar, r.s[1]));
        return commentActionViewModelImpl;
    }
}
