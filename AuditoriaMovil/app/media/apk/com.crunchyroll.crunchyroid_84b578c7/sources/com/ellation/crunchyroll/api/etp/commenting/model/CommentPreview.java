package com.ellation.crunchyroll.api.etp.commenting.model;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CommentPreview.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentPreview;", "", "_comments", "", "Lcom/ellation/crunchyroll/api/etp/commenting/model/Comment;", "total", "", "(Ljava/util/List;I)V", "comments", "getComments", "()Ljava/util/List;", "getTotal", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentPreview {
    public static final int $stable = 8;
    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<Comment> _comments;
    @SerializedName("total")
    private final int total;

    public CommentPreview() {
        this(null, 0, 3, null);
    }

    private final List<Comment> component1() {
        return this._comments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentPreview copy$default(CommentPreview commentPreview, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = commentPreview._comments;
        }
        if ((i2 & 2) != 0) {
            i = commentPreview.total;
        }
        return commentPreview.copy(list, i);
    }

    public final int component2() {
        return this.total;
    }

    public final CommentPreview copy(List<Comment> list, int i) {
        return new CommentPreview(list, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentPreview)) {
            return false;
        }
        CommentPreview commentPreview = (CommentPreview) obj;
        if (j.a(this._comments, commentPreview._comments) && this.total == commentPreview.total) {
            return true;
        }
        return false;
    }

    public final List<Comment> getComments() {
        List<Comment> list = this._comments;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int hashCode;
        List<Comment> list = this._comments;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return Integer.hashCode(this.total) + (hashCode * 31);
    }

    public String toString() {
        List<Comment> list = this._comments;
        int i = this.total;
        return "CommentPreview(_comments=" + list + ", total=" + i + ")";
    }

    public CommentPreview(List<Comment> list, int i) {
        this._comments = list;
        this.total = i;
    }

    public /* synthetic */ CommentPreview(List list, int i, int i2, e eVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i);
    }
}
