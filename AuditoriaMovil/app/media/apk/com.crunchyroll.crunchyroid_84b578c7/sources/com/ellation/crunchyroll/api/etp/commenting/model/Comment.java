package com.ellation.crunchyroll.api.etp.commenting.model;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.google.android.gms.ads.AdRequest;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Comment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0002\u0010\u0018J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0012HÆ\u0003J\t\u0010>\u001a\u00020\u0014HÆ\u0003J\t\u0010?\u001a\u00020\u0016HÆ\u0003J\t\u0010@\u001a\u00020\u0016HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0013\u0010G\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rHÂ\u0003J\u0013\u0010H\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rHÂ\u0003J¯\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001J\u0013\u0010J\u001a\u00020\u00122\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\u0014HÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010,\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0011\u0010/\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u00100\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0011\u00101\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b1\u0010-R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010-R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0016\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006N"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/commenting/model/Comment;", "", "id", "", "guestbookKey", "comment", "parentId", "locale", "votes", "Lcom/ellation/crunchyroll/api/etp/commenting/model/Votes;", "author", "Lcom/ellation/crunchyroll/api/etp/commenting/model/Author;", "_flags", "", "Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentFlag;", "_userVotes", "deleteReason", "isOwner", "", "repliesCount", "", "created", "Ljava/util/Date;", "modified", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/commenting/model/Votes;Lcom/ellation/crunchyroll/api/etp/commenting/model/Author;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZILjava/util/Date;Ljava/util/Date;)V", "getAuthor", "()Lcom/ellation/crunchyroll/api/etp/commenting/model/Author;", "authorAvatars", "Lcom/ellation/crunchyroll/api/etp/model/Image;", "getAuthorAvatars", "()Ljava/util/List;", "authorKey", "getAuthorKey", "()Ljava/lang/String;", "authorUsername", "getAuthorUsername", "getComment", "getCreated", "()Ljava/util/Date;", "getDeleteReason", "flags", "getFlags", "getGuestbookKey", "getId", "isDeleted", "()Z", "isFlaggedAsInappropriateByUser", "isFlaggedAsSpoiler", "isFlaggedAsSpoilerByUser", "isLikedByUser", "getLocale", "getModified", "getParentId", "getRepliesCount", "()I", "userVotes", "getUserVotes", "getVotes", "()Lcom/ellation/crunchyroll/api/etp/commenting/model/Votes;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Comment {
    public static final int $stable = 8;
    @SerializedName("flags")
    private final List<CommentFlag> _flags;
    @SerializedName("user_votes")
    private final List<CommentFlag> _userVotes;
    @SerializedName("user")
    private final Author author;
    @SerializedName("message")
    private final String comment;
    @SerializedName("created")
    private final Date created;
    @SerializedName("delete_reason")
    private final String deleteReason;
    @SerializedName("guestbook_key")
    private final String guestbookKey;
    @SerializedName("comment_id")
    private final String id;
    @SerializedName("is_owner")
    private final boolean isOwner;
    @SerializedName("locale")
    private final String locale;
    @SerializedName("modified")
    private final Date modified;
    @SerializedName("parent_comment_id")
    private final String parentId;
    @SerializedName("replies_count")
    private final int repliesCount;
    @SerializedName("votes")
    private final Votes votes;

    public Comment() {
        this(null, null, null, null, null, null, null, null, null, null, false, 0, null, null, 16383, null);
    }

    private final List<CommentFlag> component8() {
        return this._flags;
    }

    private final List<CommentFlag> component9() {
        return this._userVotes;
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.deleteReason;
    }

    public final boolean component11() {
        return this.isOwner;
    }

    public final int component12() {
        return this.repliesCount;
    }

    public final Date component13() {
        return this.created;
    }

    public final Date component14() {
        return this.modified;
    }

    public final String component2() {
        return this.guestbookKey;
    }

    public final String component3() {
        return this.comment;
    }

    public final String component4() {
        return this.parentId;
    }

    public final String component5() {
        return this.locale;
    }

    public final Votes component6() {
        return this.votes;
    }

    public final Author component7() {
        return this.author;
    }

    public final Comment copy(String str, String str2, String str3, String str4, String str5, Votes votes, Author author, List<? extends CommentFlag> list, List<? extends CommentFlag> list2, String str6, boolean z, int i, Date date, Date date2) {
        j.f(str, "id");
        j.f(str2, "guestbookKey");
        j.f(str3, "comment");
        j.f(str5, "locale");
        j.f(str6, "deleteReason");
        j.f(date, "created");
        j.f(date2, "modified");
        return new Comment(str, str2, str3, str4, str5, votes, author, list, list2, str6, z, i, date, date2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) obj;
        if (j.a(this.id, comment.id) && j.a(this.guestbookKey, comment.guestbookKey) && j.a(this.comment, comment.comment) && j.a(this.parentId, comment.parentId) && j.a(this.locale, comment.locale) && j.a(this.votes, comment.votes) && j.a(this.author, comment.author) && j.a(this._flags, comment._flags) && j.a(this._userVotes, comment._userVotes) && j.a(this.deleteReason, comment.deleteReason) && this.isOwner == comment.isOwner && this.repliesCount == comment.repliesCount && j.a(this.created, comment.created) && j.a(this.modified, comment.modified)) {
            return true;
        }
        return false;
    }

    public final Author getAuthor() {
        return this.author;
    }

    public final List<Image> getAuthorAvatars() {
        AuthorAttributes attributes;
        AvatarImages avatar;
        List<Image> unlockedImages;
        Author author = this.author;
        if (author == null || (attributes = author.getAttributes()) == null || (avatar = attributes.getAvatar()) == null || (unlockedImages = avatar.getUnlockedImages()) == null) {
            return z.b;
        }
        return unlockedImages;
    }

    public final String getAuthorKey() {
        String key;
        Author author = this.author;
        if (author == null || (key = author.getKey()) == null) {
            return "";
        }
        return key;
    }

    public final String getAuthorUsername() {
        AuthorAttributes attributes;
        String username;
        Author author = this.author;
        if (author == null || (attributes = author.getAttributes()) == null || (username = attributes.getUsername()) == null) {
            return "";
        }
        return username;
    }

    public final String getComment() {
        return this.comment;
    }

    public final Date getCreated() {
        return this.created;
    }

    public final String getDeleteReason() {
        return this.deleteReason;
    }

    public final List<CommentFlag> getFlags() {
        List<CommentFlag> list = this._flags;
        if (list != null) {
            return x.r0(list);
        }
        return z.b;
    }

    public final String getGuestbookKey() {
        return this.guestbookKey;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final Date getModified() {
        return this.modified;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final int getRepliesCount() {
        return this.repliesCount;
    }

    public final List<CommentFlag> getUserVotes() {
        List<CommentFlag> list = this._userVotes;
        if (list != null) {
            return x.r0(list);
        }
        return z.b;
    }

    public final Votes getVotes() {
        return this.votes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int b = a.b(this.comment, a.b(this.guestbookKey, this.id.hashCode() * 31, 31), 31);
        String str = this.parentId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b2 = a.b(this.locale, (b + hashCode) * 31, 31);
        Votes votes = this.votes;
        if (votes == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = votes.hashCode();
        }
        int i2 = (b2 + hashCode2) * 31;
        Author author = this.author;
        if (author == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = author.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        List<CommentFlag> list = this._flags;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        List<CommentFlag> list2 = this._userVotes;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int b3 = a.b(this.deleteReason, (i4 + i) * 31, 31);
        boolean z = this.isOwner;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return this.modified.hashCode() + ((this.created.hashCode() + r.a(this.repliesCount, (b3 + i5) * 31, 31)) * 31);
    }

    public final boolean isDeleted() {
        return getFlags().contains(CommentFlag.DELETED);
    }

    public final boolean isFlaggedAsInappropriateByUser() {
        return getUserVotes().contains(CommentFlag.INAPPROPRIATE);
    }

    public final boolean isFlaggedAsSpoiler() {
        return getFlags().contains(CommentFlag.SPOILER);
    }

    public final boolean isFlaggedAsSpoilerByUser() {
        return getUserVotes().contains(CommentFlag.SPOILER);
    }

    public final boolean isLikedByUser() {
        return getUserVotes().contains(CommentFlag.LIKE);
    }

    public final boolean isOwner() {
        return this.isOwner;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.guestbookKey;
        String str3 = this.comment;
        String str4 = this.parentId;
        String str5 = this.locale;
        Votes votes = this.votes;
        Author author = this.author;
        List<CommentFlag> list = this._flags;
        List<CommentFlag> list2 = this._userVotes;
        String str6 = this.deleteReason;
        boolean z = this.isOwner;
        int i = this.repliesCount;
        Date date = this.created;
        Date date2 = this.modified;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("Comment(id=", str, ", guestbookKey=", str2, ", comment=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", parentId=", str4, ", locale=");
        b.append(str5);
        b.append(", votes=");
        b.append(votes);
        b.append(", author=");
        b.append(author);
        b.append(", _flags=");
        b.append(list);
        b.append(", _userVotes=");
        b.append(list2);
        b.append(", deleteReason=");
        b.append(str6);
        b.append(", isOwner=");
        b.append(z);
        b.append(", repliesCount=");
        b.append(i);
        b.append(", created=");
        b.append(date);
        b.append(", modified=");
        b.append(date2);
        b.append(")");
        return b.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Comment(String str, String str2, String str3, String str4, String str5, Votes votes, Author author, List<? extends CommentFlag> list, List<? extends CommentFlag> list2, String str6, boolean z, int i, Date date, Date date2) {
        j.f(str, "id");
        j.f(str2, "guestbookKey");
        j.f(str3, "comment");
        j.f(str5, "locale");
        j.f(str6, "deleteReason");
        j.f(date, "created");
        j.f(date2, "modified");
        this.id = str;
        this.guestbookKey = str2;
        this.comment = str3;
        this.parentId = str4;
        this.locale = str5;
        this.votes = votes;
        this.author = author;
        this._flags = list;
        this._userVotes = list2;
        this.deleteReason = str6;
        this.isOwner = z;
        this.repliesCount = i;
        this.created = date;
        this.modified = date2;
    }

    public /* synthetic */ Comment(String str, String str2, String str3, String str4, String str5, Votes votes, Author author, List list, List list2, String str6, boolean z, int i, Date date, Date date2, int i2, e eVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? null : votes, (i2 & 64) != 0 ? null : author, (i2 & 128) != 0 ? null : list, (i2 & 256) == 0 ? list2 : null, (i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? str6 : "", (i2 & 1024) != 0 ? false : z, (i2 & 2048) == 0 ? i : 0, (i2 & 4096) != 0 ? new Date() : date, (i2 & 8192) != 0 ? new Date() : date2);
    }
}
