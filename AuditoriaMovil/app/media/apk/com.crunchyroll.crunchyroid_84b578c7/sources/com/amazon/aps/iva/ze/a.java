package com.amazon.aps.iva.ze;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
/* compiled from: ChromecastAudioReader.kt */
/* loaded from: classes.dex */
public final class a {
    @SerializedName("guid")
    private final String a;
    @SerializedName("original")
    private final boolean b;
    @SerializedName("is_premium_only")
    private final boolean c;
    @SerializedName("audio_locale")
    private final String d;

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && j.a(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return this.d.hashCode() + ((i3 + i) * 31);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        String str2 = this.d;
        return "ChromecastAudio(versionId=" + str + ", isOriginal=" + z + ", isPremiumOnly=" + z2 + ", audioLocale=" + str2 + ")";
    }
}
