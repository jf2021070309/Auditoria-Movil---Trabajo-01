package com.amazon.aps.iva.wt;

import com.amazon.aps.iva.ee0.f1;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.api.etp.commenting.body.VoteBody;
import com.ellation.crunchyroll.api.etp.commenting.body.VoteType;
import com.ellation.crunchyroll.api.etp.commenting.model.Comment;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentFlag;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentFlagUpdateBody;
/* compiled from: CommentActionInteractor.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.wy.a implements d {
    public final String b;
    public final TalkboxService c;

    public f(String str, TalkboxService talkboxService) {
        com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
        this.b = str;
        this.c = talkboxService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    @Override // com.amazon.aps.iva.wt.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum N(java.lang.String r8, com.amazon.aps.iva.ob0.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.wt.e
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.wt.e r0 = (com.amazon.aps.iva.wt.e) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.wt.e r0 = new com.amazon.aps.iva.wt.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L3f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            com.amazon.aps.iva.ab.x.i0(r9)
            r0.j = r3
            com.ellation.crunchyroll.api.etp.commenting.TalkboxService r9 = r7.c
            java.lang.String r2 = r7.b
            java.lang.Object r9 = r9.deleteComment(r2, r8, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            com.amazon.aps.iva.jf0.a0 r9 = (com.amazon.aps.iva.jf0.a0) r9
            java.lang.String r8 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r9, r8)
            com.amazon.aps.iva.wt.c[] r8 = com.amazon.aps.iva.wt.c.values()
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L4d:
            if (r2 >= r0) goto L66
            r4 = r8[r2]
            int r5 = r4.getCode()
            okhttp3.Response r6 = r9.a
            int r6 = r6.code()
            if (r5 != r6) goto L5f
            r5 = r3
            goto L60
        L5f:
            r5 = r1
        L60:
            if (r5 == 0) goto L63
            return r4
        L63:
            int r2 = r2 + 1
            goto L4d
        L66:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r9 = "Array contains no element matching the predicate."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wt.f.N(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Enum");
    }

    @Override // com.amazon.aps.iva.wt.d
    public final Object S(String str, com.amazon.aps.iva.ob0.d<? super Comment> dVar) {
        return this.c.updateCommentFlag(this.b, str, new CommentFlagUpdateBody(f1.J(CommentFlag.SPOILER), null, 2, null), dVar);
    }

    @Override // com.amazon.aps.iva.wt.d
    public final Object d1(String str, com.amazon.aps.iva.ob0.d<? super Comment> dVar) {
        return this.c.updateCommentFlag(this.b, str, new CommentFlagUpdateBody(null, f1.J(CommentFlag.SPOILER), 1, null), dVar);
    }

    @Override // com.amazon.aps.iva.wt.d
    public final Object o1(String str, VoteType voteType, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object voteComment = this.c.voteComment(this.b, str, new VoteBody(voteType), dVar);
        if (voteComment == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return voteComment;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.wt.d
    public final Object u1(String str, VoteType voteType, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object deleteCommentVote = this.c.deleteCommentVote(this.b, str, voteType, dVar);
        if (deleteCommentVote == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return deleteCommentVote;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
