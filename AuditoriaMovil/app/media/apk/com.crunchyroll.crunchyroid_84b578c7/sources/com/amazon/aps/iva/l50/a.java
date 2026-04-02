package com.amazon.aps.iva.l50;

import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: ArtistInput.kt */
/* loaded from: classes2.dex */
public final class a implements Serializable {
    public final String b;

    public a(String str) {
        j.f(str, "artistId");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && j.a(this.b, ((a) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("ArtistInput(artistId="), this.b, ")");
    }
}
