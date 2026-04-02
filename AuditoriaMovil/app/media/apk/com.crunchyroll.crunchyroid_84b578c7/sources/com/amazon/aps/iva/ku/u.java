package com.amazon.aps.iva.ku;

import com.amazon.aps.iva.e4.l1;
import com.ellation.crunchyroll.api.etp.commenting.model.Comment;
/* compiled from: PostCommentPresenter.kt */
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Comment, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Comment comment) {
        Comment comment2 = comment;
        com.amazon.aps.iva.yb0.j.f(comment2, "comment");
        v vVar = this.h;
        vVar.e.n1(l1.K(comment2, vVar.f.q()));
        vVar.q6();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
