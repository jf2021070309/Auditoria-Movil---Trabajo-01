package com.amazon.aps.iva.ks;
/* compiled from: UserMediaProperty.kt */
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.is.a {
    private final Boolean isFavorite;
    private final Boolean isOnWatchlist;

    public v() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.isFavorite, vVar.isFavorite) && com.amazon.aps.iva.yb0.j.a(this.isOnWatchlist, vVar.isOnWatchlist)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Boolean bool = this.isFavorite;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool2 = this.isOnWatchlist;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        Boolean bool = this.isFavorite;
        Boolean bool2 = this.isOnWatchlist;
        return "UserMediaProperty(isFavorite=" + bool + ", isOnWatchlist=" + bool2 + ")";
    }

    public v(Boolean bool, Boolean bool2) {
        this.isFavorite = bool;
        this.isOnWatchlist = bool2;
    }
}
