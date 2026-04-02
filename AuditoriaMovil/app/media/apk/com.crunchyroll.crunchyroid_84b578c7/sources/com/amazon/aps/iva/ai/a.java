package com.amazon.aps.iva.ai;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
/* compiled from: ArtistSummary.kt */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final List<String> b;
    public final String c;

    public a(String str, List<String> list, String str2) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(str2, MediaTrack.ROLE_DESCRIPTION);
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && j.a(this.c, aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + defpackage.a.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistSummary(name=");
        sb.append(this.a);
        sb.append(", genres=");
        sb.append(this.b);
        sb.append(", description=");
        return defpackage.b.c(sb, this.c, ")");
    }
}
