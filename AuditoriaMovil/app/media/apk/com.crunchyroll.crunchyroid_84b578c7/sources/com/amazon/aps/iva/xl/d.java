package com.amazon.aps.iva.xl;

import com.google.gson.annotations.SerializedName;
import java.util.List;
/* compiled from: ChromecastSubtitlesReaderImpl.kt */
/* loaded from: classes2.dex */
public final class d {
    @SerializedName("currently_selected")
    private final String a;
    @SerializedName("available")
    private final List<c> b;

    public final List<c> a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, dVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, dVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.a;
        List<c> list = this.b;
        return "ChromecastSubtitlesContainer(currentlySelectedLanguage=" + str + ", availableSubtitles=" + list + ")";
    }
}
