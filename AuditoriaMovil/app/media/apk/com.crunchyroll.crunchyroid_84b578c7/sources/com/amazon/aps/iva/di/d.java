package com.amazon.aps.iva.di;

import java.io.Serializable;
/* compiled from: FeaturedMusicInput.kt */
/* loaded from: classes.dex */
public final class d implements Serializable {
    public final String b;

    public d(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && com.amazon.aps.iva.yb0.j.a(this.b, ((d) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("FeaturedMusicInput(contentId="), this.b, ")");
    }
}
