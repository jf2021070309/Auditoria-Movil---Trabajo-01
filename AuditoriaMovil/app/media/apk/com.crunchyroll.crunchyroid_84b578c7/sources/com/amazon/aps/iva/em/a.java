package com.amazon.aps.iva.em;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: Profile.kt */
/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final Boolean g;

    public a(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2) {
        j.f(str, "id");
        j.f(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(str3, "username");
        j.f(str4, "avatarId");
        j.f(str5, "backgroundId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bool;
        this.g = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && j.a(this.f, aVar.f) && j.a(this.g, aVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        int i = 0;
        Boolean bool = this.f;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        Boolean bool2 = this.g;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "Profile(id=" + this.a + ", name=" + this.b + ", username=" + this.c + ", avatarId=" + this.d + ", backgroundId=" + this.e + ", isSelected=" + this.f + ", canSwitch=" + this.g + ")";
    }
}
