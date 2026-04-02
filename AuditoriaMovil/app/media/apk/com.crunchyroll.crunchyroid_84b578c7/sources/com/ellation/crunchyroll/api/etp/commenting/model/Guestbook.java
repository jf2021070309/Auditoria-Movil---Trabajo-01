package com.ellation.crunchyroll.api.etp.commenting.model;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: Guestbook.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/commenting/model/Guestbook;", "", "guestbookKey", "", "totalComments", "", "(Ljava/lang/String;I)V", "getGuestbookKey", "()Ljava/lang/String;", "getTotalComments", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Guestbook {
    public static final int $stable = 0;
    @SerializedName("guestbook_key")
    private final String guestbookKey;
    @SerializedName("total_comments")
    private final int totalComments;

    public Guestbook() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ Guestbook copy$default(Guestbook guestbook, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = guestbook.guestbookKey;
        }
        if ((i2 & 2) != 0) {
            i = guestbook.totalComments;
        }
        return guestbook.copy(str, i);
    }

    public final String component1() {
        return this.guestbookKey;
    }

    public final int component2() {
        return this.totalComments;
    }

    public final Guestbook copy(String str, int i) {
        j.f(str, "guestbookKey");
        return new Guestbook(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Guestbook)) {
            return false;
        }
        Guestbook guestbook = (Guestbook) obj;
        if (j.a(this.guestbookKey, guestbook.guestbookKey) && this.totalComments == guestbook.totalComments) {
            return true;
        }
        return false;
    }

    public final String getGuestbookKey() {
        return this.guestbookKey;
    }

    public final int getTotalComments() {
        return this.totalComments;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalComments) + (this.guestbookKey.hashCode() * 31);
    }

    public String toString() {
        String str = this.guestbookKey;
        int i = this.totalComments;
        return "Guestbook(guestbookKey=" + str + ", totalComments=" + i + ")";
    }

    public Guestbook(String str, int i) {
        j.f(str, "guestbookKey");
        this.guestbookKey = str;
        this.totalComments = i;
    }

    public /* synthetic */ Guestbook(String str, int i, int i2, e eVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
