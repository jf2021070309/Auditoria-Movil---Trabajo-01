package com.amazon.aps.iva.pl;

import com.amazon.aps.iva.ye.g;
import com.google.gson.annotations.SerializedName;
/* compiled from: ChromecastPreferenceController.kt */
/* loaded from: classes2.dex */
public final class a implements g {
    @SerializedName("autoplay")
    private final boolean a;

    public a(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.a == ((a) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.a;
        return "ChromecastAutoplayUpdated(autoplay=" + z + ")";
    }
}
