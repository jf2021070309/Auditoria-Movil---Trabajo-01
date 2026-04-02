package com.amazon.aps.iva.dn;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: ProfileHeaderUiModel.kt */
/* loaded from: classes2.dex */
public final class e {
    public final String a;
    public final String b;
    public final String c;
    public final d d;

    public e(String str, String str2, String str3, d dVar) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(str2, "avatarImageId");
        j.f(str3, "backgroundImageId");
        j.f(dVar, "style");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dVar;
    }

    public static e a(e eVar, String str, String str2, int i) {
        String str3;
        d dVar = null;
        if ((i & 1) != 0) {
            str3 = eVar.a;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str = eVar.b;
        }
        if ((i & 4) != 0) {
            str2 = eVar.c;
        }
        if ((i & 8) != 0) {
            dVar = eVar.d;
        }
        eVar.getClass();
        j.f(str3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(str, "avatarImageId");
        j.f(str2, "backgroundImageId");
        j.f(dVar, "style");
        return new e(str3, str, str2, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.a, eVar.a) && j.a(this.b, eVar.b) && j.a(this.c, eVar.c) && this.d == eVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ProfileHeaderUiModel(name=" + this.a + ", avatarImageId=" + this.b + ", backgroundImageId=" + this.c + ", style=" + this.d + ")";
    }
}
