package com.amazon.aps.iva.ru;

import com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModelImpl;
/* compiled from: CommentRepliesModule.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.wt.h> {
    public final /* synthetic */ r h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar) {
        super(0);
        this.h = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.wt.h invoke() {
        r rVar = this.h;
        b bVar = rVar.a;
        com.amazon.aps.iva.fc0.l<?> lVar = r.s[5];
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        com.amazon.aps.iva.iu.a aVar = rVar.j;
        com.amazon.aps.iva.yb0.j.f(aVar, "pendingStateRouter");
        return new com.amazon.aps.iva.wt.i(bVar, (CommentActionViewModelImpl) rVar.m.getValue(rVar, lVar), aVar);
    }
}
