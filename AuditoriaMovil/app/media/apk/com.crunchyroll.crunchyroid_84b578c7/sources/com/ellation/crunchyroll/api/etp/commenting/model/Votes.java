package com.ellation.crunchyroll.api.etp.commenting.model;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.yb0.e;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: Votes.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/commenting/model/Votes;", "", "likeVotes", "", "inappropriateVotes", "spoilerVotes", "(III)V", "getInappropriateVotes", "()I", "getLikeVotes", "getSpoilerVotes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Votes {
    public static final int $stable = 0;
    @SerializedName("inappropriate")
    private final int inappropriateVotes;
    @SerializedName("like")
    private final int likeVotes;
    @SerializedName("spoiler")
    private final int spoilerVotes;

    public Votes() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ Votes copy$default(Votes votes, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = votes.likeVotes;
        }
        if ((i4 & 2) != 0) {
            i2 = votes.inappropriateVotes;
        }
        if ((i4 & 4) != 0) {
            i3 = votes.spoilerVotes;
        }
        return votes.copy(i, i2, i3);
    }

    public final int component1() {
        return this.likeVotes;
    }

    public final int component2() {
        return this.inappropriateVotes;
    }

    public final int component3() {
        return this.spoilerVotes;
    }

    public final Votes copy(int i, int i2, int i3) {
        return new Votes(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Votes)) {
            return false;
        }
        Votes votes = (Votes) obj;
        if (this.likeVotes == votes.likeVotes && this.inappropriateVotes == votes.inappropriateVotes && this.spoilerVotes == votes.spoilerVotes) {
            return true;
        }
        return false;
    }

    public final int getInappropriateVotes() {
        return this.inappropriateVotes;
    }

    public final int getLikeVotes() {
        return this.likeVotes;
    }

    public final int getSpoilerVotes() {
        return this.spoilerVotes;
    }

    public int hashCode() {
        return Integer.hashCode(this.spoilerVotes) + r.a(this.inappropriateVotes, Integer.hashCode(this.likeVotes) * 31, 31);
    }

    public String toString() {
        int i = this.likeVotes;
        int i2 = this.inappropriateVotes;
        return e.f(x.a("Votes(likeVotes=", i, ", inappropriateVotes=", i2, ", spoilerVotes="), this.spoilerVotes, ")");
    }

    public Votes(int i, int i2, int i3) {
        this.likeVotes = i;
        this.inappropriateVotes = i2;
        this.spoilerVotes = i3;
    }

    public /* synthetic */ Votes(int i, int i2, int i3, int i4, e eVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
