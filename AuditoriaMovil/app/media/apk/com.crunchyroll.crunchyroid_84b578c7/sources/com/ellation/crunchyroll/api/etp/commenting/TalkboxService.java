package com.ellation.crunchyroll.api.etp.commenting;

import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lf0.a;
import com.amazon.aps.iva.lf0.b;
import com.amazon.aps.iva.lf0.f;
import com.amazon.aps.iva.lf0.n;
import com.amazon.aps.iva.lf0.o;
import com.amazon.aps.iva.lf0.s;
import com.amazon.aps.iva.lf0.t;
import com.amazon.aps.iva.ob0.d;
import com.ellation.crunchyroll.api.etp.commenting.body.VoteBody;
import com.ellation.crunchyroll.api.etp.commenting.body.VoteType;
import com.ellation.crunchyroll.api.etp.commenting.model.Comment;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentFlagUpdateBody;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentPostBody;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentPreview;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentsOrderingType;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentsSortingType;
import com.ellation.crunchyroll.api.etp.commenting.model.Guestbook;
import com.ellation.crunchyroll.api.etp.model.ApiCollection;
import kotlin.Metadata;
/* compiled from: TalkboxService.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006JE\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017JO\u0010\u0018\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b \u0010\u0017J7\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020!H§@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J7\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010&\u001a\u00020%H§@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J1\u0010*\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020)H§@ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/commenting/TalkboxService;", "", "", "guestbookKey", "Lcom/ellation/crunchyroll/api/etp/commenting/model/Guestbook;", "getGuestbook", "(Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "guestbookKeys", "Lcom/ellation/crunchyroll/api/etp/model/ApiCollection;", "getGuestbooks", "Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentsSortingType;", "sort", "Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentsOrderingType;", "order", "", "page", "pageSize", "Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentPreview;", "getComments", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentsSortingType;Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentsOrderingType;IILcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "commentId", "Lcom/ellation/crunchyroll/api/etp/commenting/model/Comment;", "getComment", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "getCommentReplies", "(Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentsSortingType;Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentsOrderingType;IILcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentPostBody;", "comment", "postComment", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentPostBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/amazon/aps/iva/jf0/a0;", "Lcom/amazon/aps/iva/kb0/q;", "deleteComment", "Lcom/ellation/crunchyroll/api/etp/commenting/body/VoteBody;", "body", "voteComment", "(Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/commenting/body/VoteBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/commenting/body/VoteType;", "voteType", "deleteCommentVote", "(Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/commenting/body/VoteType;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentFlagUpdateBody;", "updateCommentFlag", "(Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentFlagUpdateBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface TalkboxService {

    /* compiled from: TalkboxService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getCommentReplies$default(TalkboxService talkboxService, String str, String str2, CommentsSortingType commentsSortingType, CommentsOrderingType commentsOrderingType, int i, int i2, d dVar, int i3, Object obj) {
            CommentsSortingType commentsSortingType2;
            CommentsOrderingType commentsOrderingType2;
            int i4;
            int i5;
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    commentsSortingType2 = CommentsSortingType.DATE;
                } else {
                    commentsSortingType2 = commentsSortingType;
                }
                if ((i3 & 8) != 0) {
                    commentsOrderingType2 = CommentsOrderingType.ASCENDING;
                } else {
                    commentsOrderingType2 = commentsOrderingType;
                }
                if ((i3 & 16) != 0) {
                    i4 = 1;
                } else {
                    i4 = i;
                }
                if ((i3 & 32) != 0) {
                    i5 = 30;
                } else {
                    i5 = i2;
                }
                return talkboxService.getCommentReplies(str, str2, commentsSortingType2, commentsOrderingType2, i4, i5, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCommentReplies");
        }

        public static /* synthetic */ Object getComments$default(TalkboxService talkboxService, String str, CommentsSortingType commentsSortingType, CommentsOrderingType commentsOrderingType, int i, int i2, d dVar, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 2) != 0) {
                    commentsSortingType = CommentsSortingType.DATE;
                }
                CommentsSortingType commentsSortingType2 = commentsSortingType;
                if ((i3 & 4) != 0) {
                    commentsOrderingType = CommentsOrderingType.DESCENDING;
                }
                CommentsOrderingType commentsOrderingType2 = commentsOrderingType;
                if ((i3 & 8) != 0) {
                    i = 1;
                }
                int i4 = i;
                if ((i3 & 16) != 0) {
                    i2 = 50;
                }
                return talkboxService.getComments(str, commentsSortingType2, commentsOrderingType2, i4, i2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getComments");
        }
    }

    @b("/talkbox/guestbooks/{guestbook_key}/comments/{comment_id}")
    Object deleteComment(@s("guestbook_key") String str, @s("comment_id") String str2, d<? super a0<q>> dVar);

    @b("/talkbox/guestbooks/{guestbook_key}/comments/{comment_id}/votes")
    Object deleteCommentVote(@s("guestbook_key") String str, @s("comment_id") String str2, @t("vote_type") VoteType voteType, d<? super a0<q>> dVar);

    @f("talkbox/guestbooks/{guestbook_key}/comments/{comment_id}")
    Object getComment(@s("guestbook_key") String str, @s("comment_id") String str2, d<? super Comment> dVar);

    @f("/talkbox/guestbooks/{guestbook_key}/comments/{comment_id}/replies")
    Object getCommentReplies(@s("guestbook_key") String str, @s("comment_id") String str2, @t("sort") CommentsSortingType commentsSortingType, @t("order") CommentsOrderingType commentsOrderingType, @t("page") int i, @t("page_size") int i2, d<? super CommentPreview> dVar);

    @f("talkbox/guestbooks/{guestbook_key}/comments")
    Object getComments(@s("guestbook_key") String str, @t("sort") CommentsSortingType commentsSortingType, @t("order") CommentsOrderingType commentsOrderingType, @t("page") int i, @t("page_size") int i2, d<? super CommentPreview> dVar);

    @f("talkbox/guestbooks/{guestbook_key}")
    Object getGuestbook(@s("guestbook_key") String str, d<? super Guestbook> dVar);

    @f("talkbox/guestbooks")
    Object getGuestbooks(@t("guestbook_keys") String str, d<? super ApiCollection<Guestbook>> dVar);

    @o("/talkbox/guestbooks/{guestbook_key}/comments")
    Object postComment(@s("guestbook_key") String str, @a CommentPostBody commentPostBody, d<? super Comment> dVar);

    @n("/talkbox/guestbooks/{guestbook_key}/comments/{comment_id}/flags")
    Object updateCommentFlag(@s("guestbook_key") String str, @s("comment_id") String str2, @a CommentFlagUpdateBody commentFlagUpdateBody, d<? super Comment> dVar);

    @o("/talkbox/guestbooks/{guestbook_key}/comments/{comment_id}/votes")
    Object voteComment(@s("guestbook_key") String str, @s("comment_id") String str2, @a VoteBody voteBody, d<? super a0<q>> dVar);
}
