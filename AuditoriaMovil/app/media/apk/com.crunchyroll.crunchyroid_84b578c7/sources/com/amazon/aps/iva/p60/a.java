package com.amazon.aps.iva.p60;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
/* compiled from: Fallback.kt */
/* loaded from: classes2.dex */
public final class a {
    @SerializedName("to")
    private final String a;

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && j.a(this.a, ((a) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return defpackage.e.e("Fallback(toLocale=", this.a, ")");
    }
}
