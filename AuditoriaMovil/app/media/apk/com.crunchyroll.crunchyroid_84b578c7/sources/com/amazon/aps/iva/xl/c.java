package com.amazon.aps.iva.xl;

import com.google.gson.annotations.SerializedName;
/* compiled from: ChromecastSubtitlesReaderImpl.kt */
/* loaded from: classes2.dex */
public final class c {
    @SerializedName("language")
    private final String a;
    @SerializedName("title")
    private final String b;
    @SerializedName("key")
    private final String c;
    @SerializedName("is_closed_captions")
    private final boolean d;

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, cVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, cVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, cVar.c) && this.d == cVar.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int b = com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31);
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return b + i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        boolean z = this.d;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("ChromecastSubtitles(language=", str, ", title=", str2, ", id=");
        b.append(str3);
        b.append(", isClosedCaptions=");
        b.append(z);
        b.append(")");
        return b.toString();
    }
}
