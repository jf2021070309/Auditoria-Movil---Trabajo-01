package com.amazon.aps.iva.ze;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.g;
import com.google.gson.annotations.SerializedName;
/* compiled from: ChromecastSelectedAudio.kt */
/* loaded from: classes.dex */
public final class d implements g {
    @SerializedName("version")
    private final String a;

    public d(String str) {
        j.f(str, "selectedMediaId");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && j.a(this.a, ((d) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return e.e("ChromecastSelectedAudio(selectedMediaId=", this.a, ")");
    }
}
