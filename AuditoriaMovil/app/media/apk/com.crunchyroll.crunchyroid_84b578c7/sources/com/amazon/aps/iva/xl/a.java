package com.amazon.aps.iva.xl;

import com.google.gson.annotations.SerializedName;
/* compiled from: ChromecastSubtitlesProvider.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.ye.g {
    @SerializedName("closed_captions_language")
    private final String a;

    public a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "selectedClosedCaptionsLanguage");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && com.amazon.aps.iva.yb0.j.a(this.a, ((a) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return defpackage.e.e("ChromecastSelectedClosedCaptions(selectedClosedCaptionsLanguage=", this.a, ")");
    }
}
