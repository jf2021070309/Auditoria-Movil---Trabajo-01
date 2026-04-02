package com.amazon.aps.iva.n00;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.cms.model.Season;
import java.util.List;
/* compiled from: SeasonNavigatorData.kt */
/* loaded from: classes2.dex */
public final class a {
    public final Season a;
    public final List<Season> b;

    public a(Season season, List<Season> list) {
        j.f(list, "seasons");
        this.a = season;
        this.b = list;
    }

    public final int a() {
        int i = 0;
        for (Season season : this.b) {
            if (!j.a(season, this.a)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SeasonNavigatorData(currentSeason=" + this.a + ", seasons=" + this.b + ")";
    }
}
