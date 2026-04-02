package com.ellation.crunchyroll.model.music;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: MusicAvailability.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/model/music/MusicAvailability;", "Ljava/io/Serializable;", "startDate", "Ljava/util/Date;", "endDate", "(Ljava/util/Date;Ljava/util/Date;)V", "getEndDate", "()Ljava/util/Date;", "getStartDate", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MusicAvailability implements Serializable {
    public static final int $stable = 8;
    @SerializedName("endDate")
    private final Date endDate;
    @SerializedName("startDate")
    private final Date startDate;

    public MusicAvailability(Date date, Date date2) {
        j.f(date, "startDate");
        j.f(date2, "endDate");
        this.startDate = date;
        this.endDate = date2;
    }

    public static /* synthetic */ MusicAvailability copy$default(MusicAvailability musicAvailability, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            date = musicAvailability.startDate;
        }
        if ((i & 2) != 0) {
            date2 = musicAvailability.endDate;
        }
        return musicAvailability.copy(date, date2);
    }

    public final Date component1() {
        return this.startDate;
    }

    public final Date component2() {
        return this.endDate;
    }

    public final MusicAvailability copy(Date date, Date date2) {
        j.f(date, "startDate");
        j.f(date2, "endDate");
        return new MusicAvailability(date, date2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicAvailability)) {
            return false;
        }
        MusicAvailability musicAvailability = (MusicAvailability) obj;
        if (j.a(this.startDate, musicAvailability.startDate) && j.a(this.endDate, musicAvailability.endDate)) {
            return true;
        }
        return false;
    }

    public final Date getEndDate() {
        return this.endDate;
    }

    public final Date getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        return this.endDate.hashCode() + (this.startDate.hashCode() * 31);
    }

    public String toString() {
        Date date = this.startDate;
        Date date2 = this.endDate;
        return "MusicAvailability(startDate=" + date + ", endDate=" + date2 + ")";
    }
}
