package com.amazon.aps.iva.p60;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
/* compiled from: Fallback.kt */
/* loaded from: classes2.dex */
public final class b {
    @SerializedName("mapping")
    private final Map<String, a> a;

    public final Map<String, a> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && j.a(this.a, ((b) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Map<String, a> map = this.a;
        return "FallbacksContainer(mapping=" + map + ")";
    }
}
