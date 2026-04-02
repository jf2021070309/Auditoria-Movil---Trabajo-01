package com.amazon.aps.iva.ig;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
/* compiled from: PlayheadCacheModel.kt */
/* loaded from: classes.dex */
public final class a {
    @SerializedName("playhead")
    private final long a;
    @SerializedName("asset_id")
    private final String b;
    @SerializedName("date_modified")
    private final Date c;

    public a(long j, String str, Date date) {
        j.f(str, "assetId");
        j.f(date, "dateModified");
        this.a = j;
        this.b = str;
        this.c = date;
    }

    public final String a() {
        return this.b;
    }

    public final Date b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && j.a(this.b, aVar.b) && j.a(this.c, aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + com.amazon.aps.iva.c80.a.b(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        Date date = this.c;
        return "PlayheadCacheModel(playheadSec=" + j + ", assetId=" + str + ", dateModified=" + date + ")";
    }
}
