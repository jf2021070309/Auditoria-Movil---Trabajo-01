package com.ellation.crunchyroll.api.etp.commenting.model;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CommentPostBody.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentPostBody;", "", "message", "", "locale", "flags", "", "Lcom/ellation/crunchyroll/api/etp/commenting/model/CommentFlag;", "parentId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getFlags", "()Ljava/util/List;", "getLocale", "()Ljava/lang/String;", "getMessage", "getParentId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentPostBody {
    public static final int $stable = 8;
    @SerializedName("flags")
    private final List<CommentFlag> flags;
    @SerializedName("locale")
    private final String locale;
    @SerializedName("message")
    private final String message;
    @SerializedName("parent_id")
    private final String parentId;

    /* JADX WARN: Multi-variable type inference failed */
    public CommentPostBody(String str, String str2, List<? extends CommentFlag> list, String str3) {
        j.f(str, "message");
        j.f(str2, "locale");
        j.f(list, "flags");
        this.message = str;
        this.locale = str2;
        this.flags = list;
        this.parentId = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentPostBody copy$default(CommentPostBody commentPostBody, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commentPostBody.message;
        }
        if ((i & 2) != 0) {
            str2 = commentPostBody.locale;
        }
        if ((i & 4) != 0) {
            list = commentPostBody.flags;
        }
        if ((i & 8) != 0) {
            str3 = commentPostBody.parentId;
        }
        return commentPostBody.copy(str, str2, list, str3);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.locale;
    }

    public final List<CommentFlag> component3() {
        return this.flags;
    }

    public final String component4() {
        return this.parentId;
    }

    public final CommentPostBody copy(String str, String str2, List<? extends CommentFlag> list, String str3) {
        j.f(str, "message");
        j.f(str2, "locale");
        j.f(list, "flags");
        return new CommentPostBody(str, str2, list, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentPostBody)) {
            return false;
        }
        CommentPostBody commentPostBody = (CommentPostBody) obj;
        if (j.a(this.message, commentPostBody.message) && j.a(this.locale, commentPostBody.locale) && j.a(this.flags, commentPostBody.flags) && j.a(this.parentId, commentPostBody.parentId)) {
            return true;
        }
        return false;
    }

    public final List<CommentFlag> getFlags() {
        return this.flags;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public int hashCode() {
        int hashCode;
        int a = a.a(this.flags, a.b(this.locale, this.message.hashCode() * 31, 31), 31);
        String str = this.parentId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a + hashCode;
    }

    public String toString() {
        String str = this.message;
        String str2 = this.locale;
        List<CommentFlag> list = this.flags;
        String str3 = this.parentId;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("CommentPostBody(message=", str, ", locale=", str2, ", flags=");
        b.append(list);
        b.append(", parentId=");
        b.append(str3);
        b.append(")");
        return b.toString();
    }

    public /* synthetic */ CommentPostBody(String str, String str2, List list, String str3, int i, e eVar) {
        this(str, str2, (i & 4) != 0 ? z.b : list, (i & 8) != 0 ? null : str3);
    }
}
