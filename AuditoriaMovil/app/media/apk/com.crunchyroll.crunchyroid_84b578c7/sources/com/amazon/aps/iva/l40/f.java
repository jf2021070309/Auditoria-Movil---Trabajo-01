package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.cms.model.SeasonsMetadata;
import com.ellation.crunchyroll.model.FormattableSeason;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: SeasonsModel.kt */
/* loaded from: classes2.dex */
public final class f implements FormattableSeason {
    public final List<Season> b;
    public final SeasonsMetadata c;

    public f(List<Season> list, SeasonsMetadata seasonsMetadata) {
        com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
        this.b = list;
        this.c = seasonsMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, fVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, fVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() * 31;
        SeasonsMetadata seasonsMetadata = this.c;
        if (seasonsMetadata == null) {
            hashCode = 0;
        } else {
            hashCode = seasonsMetadata.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "SeasonsModel(items=" + this.b + ", meta=" + this.c + ")";
    }
}
