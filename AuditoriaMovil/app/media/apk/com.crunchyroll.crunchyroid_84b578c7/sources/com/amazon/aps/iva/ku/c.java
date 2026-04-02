package com.amazon.aps.iva.ku;

import com.ellation.crunchyroll.api.etp.commenting.model.Comment;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: PostCommentAnalytics.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.ff.b b;

    public c(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.ff.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.ku.b
    public final void a(Comment comment) {
        com.amazon.aps.iva.yb0.j.f(comment, "comment");
        PlayableAsset d = this.b.getCurrentAsset().d();
        this.a.e(new com.amazon.aps.iva.es.t(new com.amazon.aps.iva.ks.c(comment.getId(), comment.getParentId(), comment.getComment(), comment.isFlaggedAsSpoiler()), (d == null || (r0 = d.getParentId()) == null) ? "" : ""));
    }
}
