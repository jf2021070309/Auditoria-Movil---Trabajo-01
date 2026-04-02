package com.ellation.crunchyroll.api.etp.commenting.model;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oa.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Author.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÂ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/commenting/model/Author;", "", "key", "", "attributes", "Lcom/ellation/crunchyroll/api/etp/commenting/model/AuthorAttributes;", "_userFlags", "", "Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentFlag;", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/commenting/model/AuthorAttributes;Ljava/util/List;)V", "getAttributes", "()Lcom/ellation/crunchyroll/api/etp/commenting/model/AuthorAttributes;", "getKey", "()Ljava/lang/String;", "userFlags", "getUserFlags", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Author {
    public static final int $stable = 8;
    @SerializedName("user_flags")
    private final List<CommentFlag> _userFlags;
    @SerializedName("user_attributes")
    private final AuthorAttributes attributes;
    @SerializedName("user_key")
    private final String key;

    public Author() {
        this(null, null, null, 7, null);
    }

    private final List<CommentFlag> component3() {
        return this._userFlags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Author copy$default(Author author, String str, AuthorAttributes authorAttributes, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = author.key;
        }
        if ((i & 2) != 0) {
            authorAttributes = author.attributes;
        }
        if ((i & 4) != 0) {
            list = author._userFlags;
        }
        return author.copy(str, authorAttributes, list);
    }

    public final String component1() {
        return this.key;
    }

    public final AuthorAttributes component2() {
        return this.attributes;
    }

    public final Author copy(String str, AuthorAttributes authorAttributes, List<? extends CommentFlag> list) {
        return new Author(str, authorAttributes, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        if (j.a(this.key, author.key) && j.a(this.attributes, author.attributes) && j.a(this._userFlags, author._userFlags)) {
            return true;
        }
        return false;
    }

    public final AuthorAttributes getAttributes() {
        return this.attributes;
    }

    public final String getKey() {
        return this.key;
    }

    public final List<CommentFlag> getUserFlags() {
        List<CommentFlag> list = this._userFlags;
        if (list != null) {
            return x.r0(list);
        }
        return z.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.key;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        AuthorAttributes authorAttributes = this.attributes;
        if (authorAttributes == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = authorAttributes.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<CommentFlag> list = this._userFlags;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.key;
        AuthorAttributes authorAttributes = this.attributes;
        List<CommentFlag> list = this._userFlags;
        StringBuilder sb = new StringBuilder("Author(key=");
        sb.append(str);
        sb.append(", attributes=");
        sb.append(authorAttributes);
        sb.append(", _userFlags=");
        return a.b(sb, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Author(String str, AuthorAttributes authorAttributes, List<? extends CommentFlag> list) {
        this.key = str;
        this.attributes = authorAttributes;
        this._userFlags = list;
    }

    public /* synthetic */ Author(String str, AuthorAttributes authorAttributes, List list, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : authorAttributes, (i & 4) != 0 ? null : list);
    }
}
