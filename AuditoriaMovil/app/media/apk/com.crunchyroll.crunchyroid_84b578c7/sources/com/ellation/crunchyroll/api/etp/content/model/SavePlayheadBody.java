package com.ellation.crunchyroll.api.etp.content.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: SavePlayheadBody.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/SavePlayheadBody;", "", "contentId", "", "playhead", "", "(Ljava/lang/String;J)V", "getContentId", "()Ljava/lang/String;", "getPlayhead", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SavePlayheadBody {
    public static final int $stable = 0;
    @SerializedName("content_id")
    private final String contentId;
    @SerializedName("playhead")
    private final long playhead;

    public SavePlayheadBody(String str, long j) {
        j.f(str, "contentId");
        this.contentId = str;
        this.playhead = j;
    }

    public static /* synthetic */ SavePlayheadBody copy$default(SavePlayheadBody savePlayheadBody, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savePlayheadBody.contentId;
        }
        if ((i & 2) != 0) {
            j = savePlayheadBody.playhead;
        }
        return savePlayheadBody.copy(str, j);
    }

    public final String component1() {
        return this.contentId;
    }

    public final long component2() {
        return this.playhead;
    }

    public final SavePlayheadBody copy(String str, long j) {
        j.f(str, "contentId");
        return new SavePlayheadBody(str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavePlayheadBody)) {
            return false;
        }
        SavePlayheadBody savePlayheadBody = (SavePlayheadBody) obj;
        if (j.a(this.contentId, savePlayheadBody.contentId) && this.playhead == savePlayheadBody.playhead) {
            return true;
        }
        return false;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final long getPlayhead() {
        return this.playhead;
    }

    public int hashCode() {
        return Long.hashCode(this.playhead) + (this.contentId.hashCode() * 31);
    }

    public String toString() {
        String str = this.contentId;
        long j = this.playhead;
        return "SavePlayheadBody(contentId=" + str + ", playhead=" + j + ")";
    }
}
