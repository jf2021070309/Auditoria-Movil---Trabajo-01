package com.amazon.aps.iva.e20;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaTrack;
import java.io.Serializable;
/* compiled from: MediaDetails.kt */
/* loaded from: classes2.dex */
public final class e implements Serializable {
    public final int b;
    public final String c;

    public e(int i, String str) {
        j.f(str, MediaTrack.ROLE_DESCRIPTION);
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.b == eVar.b && j.a(this.c, eVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "MediaDetailsField(title=" + this.b + ", description=" + this.c + ")";
    }
}
