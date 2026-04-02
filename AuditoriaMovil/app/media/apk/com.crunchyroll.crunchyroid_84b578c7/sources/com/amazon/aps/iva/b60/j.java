package com.amazon.aps.iva.b60;

import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import java.io.Serializable;
/* compiled from: WatchlistChangeRegister.kt */
/* loaded from: classes2.dex */
public final class j implements Serializable {
    public final String b;
    public final WatchlistStatus c;

    public j(String str, WatchlistStatus watchlistStatus) {
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        com.amazon.aps.iva.yb0.j.f(watchlistStatus, "watchlistStatus");
        this.b = str;
        this.c = watchlistStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, jVar.b) && this.c == jVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "WatchlistChangeModel(contentId=" + this.b + ", watchlistStatus=" + this.c + ")";
    }
}
