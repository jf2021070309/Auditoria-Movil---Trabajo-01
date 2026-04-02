package com.amazon.aps.iva.ze;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/* compiled from: ChromecastAudioReader.kt */
/* loaded from: classes.dex */
public final class b {
    @SerializedName("currently_selected")
    private final String a;
    @SerializedName("available")
    private final List<a> b;

    public final String a() {
        return this.a;
    }

    public final List<a> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.a;
        List<a> list = this.b;
        return "ChromecastAudioContainer(currentVersionId=" + str + ", versions=" + list + ")";
    }
}
