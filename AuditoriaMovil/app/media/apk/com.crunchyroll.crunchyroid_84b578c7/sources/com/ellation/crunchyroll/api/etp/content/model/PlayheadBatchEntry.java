package com.ellation.crunchyroll.api.etp.content.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: SavePlayheadBatchBody.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/PlayheadBatchEntry;", "", "playhead", "", "dateWatched", "Ljava/util/Date;", "(JLjava/util/Date;)V", "getDateWatched", "()Ljava/util/Date;", "getPlayhead", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayheadBatchEntry {
    public static final int $stable = 8;
    @SerializedName("date_watched")
    private final Date dateWatched;
    @SerializedName("playhead")
    private final long playhead;

    public PlayheadBatchEntry(long j, Date date) {
        j.f(date, "dateWatched");
        this.playhead = j;
        this.dateWatched = date;
    }

    public static /* synthetic */ PlayheadBatchEntry copy$default(PlayheadBatchEntry playheadBatchEntry, long j, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            j = playheadBatchEntry.playhead;
        }
        if ((i & 2) != 0) {
            date = playheadBatchEntry.dateWatched;
        }
        return playheadBatchEntry.copy(j, date);
    }

    public final long component1() {
        return this.playhead;
    }

    public final Date component2() {
        return this.dateWatched;
    }

    public final PlayheadBatchEntry copy(long j, Date date) {
        j.f(date, "dateWatched");
        return new PlayheadBatchEntry(j, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayheadBatchEntry)) {
            return false;
        }
        PlayheadBatchEntry playheadBatchEntry = (PlayheadBatchEntry) obj;
        if (this.playhead == playheadBatchEntry.playhead && j.a(this.dateWatched, playheadBatchEntry.dateWatched)) {
            return true;
        }
        return false;
    }

    public final Date getDateWatched() {
        return this.dateWatched;
    }

    public final long getPlayhead() {
        return this.playhead;
    }

    public int hashCode() {
        return this.dateWatched.hashCode() + (Long.hashCode(this.playhead) * 31);
    }

    public String toString() {
        long j = this.playhead;
        Date date = this.dateWatched;
        return "PlayheadBatchEntry(playhead=" + j + ", dateWatched=" + date + ")";
    }
}
