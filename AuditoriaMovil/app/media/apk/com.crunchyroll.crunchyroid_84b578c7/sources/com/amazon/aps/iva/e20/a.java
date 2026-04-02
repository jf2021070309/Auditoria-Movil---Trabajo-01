package com.amazon.aps.iva.e20;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaTrack;
import java.io.Serializable;
import java.util.List;
/* compiled from: MediaDetails.kt */
/* loaded from: classes2.dex */
public final class a implements Serializable {
    public final String b;
    public final String c;
    public final List<e> d;

    public a(String str, String str2, List<e> list) {
        j.f(str, "title");
        j.f(str2, MediaTrack.ROLE_DESCRIPTION);
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaDetails(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", otherFields=");
        return com.amazon.aps.iva.oa.a.b(sb, this.d, ")");
    }
}
