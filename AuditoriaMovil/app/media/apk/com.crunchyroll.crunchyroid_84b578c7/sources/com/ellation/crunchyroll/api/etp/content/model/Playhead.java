package com.ellation.crunchyroll.api.etp.content.model;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayheadTimeProvider;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: Playhead.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/Playhead;", "Lcom/ellation/crunchyroll/model/PlayheadTimeProvider;", "playheadSec", "", "isCompleted", "", "lastModified", "Ljava/util/Date;", "_contentId", "", "(JZLjava/util/Date;Ljava/lang/String;)V", "get_contentId", "()Ljava/lang/String;", "contentId", "getContentId", "()Z", "getLastModified", "()Ljava/util/Date;", "getPlayheadSec", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Playhead implements PlayheadTimeProvider {
    public static final int $stable = 8;
    @SerializedName("content_id")
    private final String _contentId;
    @SerializedName("fully_watched")
    private final boolean isCompleted;
    @SerializedName("last_modified")
    private final Date lastModified;
    @SerializedName("playhead")
    private final long playheadSec;

    public Playhead() {
        this(0L, false, null, null, 15, null);
    }

    public static /* synthetic */ Playhead copy$default(Playhead playhead, long j, boolean z, Date date, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = playhead.playheadSec;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            z = playhead.isCompleted;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            date = playhead.lastModified;
        }
        Date date2 = date;
        if ((i & 8) != 0) {
            str = playhead._contentId;
        }
        return playhead.copy(j2, z2, date2, str);
    }

    public final long component1() {
        return this.playheadSec;
    }

    public final boolean component2() {
        return this.isCompleted;
    }

    public final Date component3() {
        return this.lastModified;
    }

    public final String component4() {
        return this._contentId;
    }

    public final Playhead copy(long j, boolean z, Date date, String str) {
        return new Playhead(j, z, date, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Playhead)) {
            return false;
        }
        Playhead playhead = (Playhead) obj;
        if (this.playheadSec == playhead.playheadSec && this.isCompleted == playhead.isCompleted && j.a(this.lastModified, playhead.lastModified) && j.a(this._contentId, playhead._contentId)) {
            return true;
        }
        return false;
    }

    public final String getContentId() {
        String str = this._contentId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final Date getLastModified() {
        return this.lastModified;
    }

    @Override // com.ellation.crunchyroll.model.PlayheadTimeProvider
    public long getPlayheadSec() {
        return this.playheadSec;
    }

    public final String get_contentId() {
        return this._contentId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.playheadSec) * 31;
        boolean z = this.isCompleted;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        Date date = this.lastModified;
        int i3 = 0;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str = this._contentId;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i4 + i3;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public String toString() {
        long j = this.playheadSec;
        boolean z = this.isCompleted;
        Date date = this.lastModified;
        String str = this._contentId;
        return "Playhead(playheadSec=" + j + ", isCompleted=" + z + ", lastModified=" + date + ", _contentId=" + str + ")";
    }

    public Playhead(long j, boolean z, Date date, String str) {
        this.playheadSec = j;
        this.isCompleted = z;
        this.lastModified = date;
        this._contentId = str;
    }

    public /* synthetic */ Playhead(long j, boolean z, Date date, String str, int i, e eVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : str);
    }
}
