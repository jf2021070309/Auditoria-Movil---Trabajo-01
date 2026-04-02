package com.amazon.aps.iva.wt;

import com.ellation.crunchyroll.api.etp.commenting.body.VoteType;
import com.ellation.crunchyroll.api.etp.commenting.model.Comment;
/* compiled from: CommentActionInteractor.kt */
/* loaded from: classes2.dex */
public interface d extends com.amazon.aps.iva.wy.j {
    Enum N(String str, com.amazon.aps.iva.ob0.d dVar);

    Object S(String str, com.amazon.aps.iva.ob0.d<? super Comment> dVar);

    Object d1(String str, com.amazon.aps.iva.ob0.d<? super Comment> dVar);

    Object o1(String str, VoteType voteType, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    Object u1(String str, VoteType voteType, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);
}
