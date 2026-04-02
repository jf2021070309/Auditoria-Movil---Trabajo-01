package com.amazon.aps.iva.ks;
/* compiled from: RatingDataProperty.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.is.b {
    private final String contentRating;
    private final String ratingSystem;
    private final String userRating;

    public p(String str, String str2, String str3) {
        super("RatingData");
        this.userRating = str;
        this.contentRating = str2;
        this.ratingSystem = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.userRating, pVar.userRating) && com.amazon.aps.iva.yb0.j.a(this.contentRating, pVar.contentRating) && com.amazon.aps.iva.yb0.j.a(this.ratingSystem, pVar.ratingSystem)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.ratingSystem.hashCode() + com.amazon.aps.iva.c80.a.b(this.contentRating, this.userRating.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.userRating;
        String str2 = this.contentRating;
        return defpackage.b.c(com.amazon.aps.iva.n4.a.b("RatingDataProperty(userRating=", str, ", contentRating=", str2, ", ratingSystem="), this.ratingSystem, ")");
    }
}
