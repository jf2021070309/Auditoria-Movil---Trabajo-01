package com.amazon.aps.iva.hg;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.model.ContentContainer;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: BulkDownloadInputData.kt */
/* loaded from: classes.dex */
public final class e {
    public final ContentContainer a;
    public final Season b;
    public final g c;

    public e(ContentContainer contentContainer, Season season, g gVar) {
        j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        this.a = contentContainer;
        this.b = season;
        this.c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.a, eVar.a) && j.a(this.b, eVar.b) && j.a(this.c, eVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Season season = this.b;
        if (season == null) {
            hashCode = 0;
        } else {
            hashCode = season.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "BulkDownloadInputData(content=" + this.a + ", season=" + this.b + ", input=" + this.c + ")";
    }
}
