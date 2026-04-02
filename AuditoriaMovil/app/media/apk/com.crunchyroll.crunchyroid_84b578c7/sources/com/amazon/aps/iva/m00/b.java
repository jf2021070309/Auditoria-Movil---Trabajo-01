package com.amazon.aps.iva.m00;

import com.ellation.crunchyroll.api.cms.model.Season;
/* compiled from: SeasonPickerData.kt */
/* loaded from: classes2.dex */
public final class b {
    public final Season a;
    public final com.amazon.aps.iva.l40.f b;

    public b(Season season, com.amazon.aps.iva.l40.f fVar) {
        this.a = season;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, bVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, bVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SeasonPickerData(preselectedSeason=" + this.a + ", seasons=" + this.b + ")";
    }
}
