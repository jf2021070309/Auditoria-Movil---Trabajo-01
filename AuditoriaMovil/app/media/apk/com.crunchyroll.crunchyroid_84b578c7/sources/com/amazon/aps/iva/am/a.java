package com.amazon.aps.iva.am;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
/* compiled from: SelectedProfileDiskSource.kt */
/* loaded from: classes2.dex */
public final class a implements Serializable {
    @SerializedName("id")
    private final String b;
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String c;
    @SerializedName("username")
    private final String d;
    @SerializedName("avatarId")
    private final String e;
    @SerializedName("backgroundId")
    private final String f;

    public a(String str, String str2, String str3, String str4, String str5) {
        j.f(str, "id");
        j.f(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(str3, "username");
        j.f(str4, "avatarId");
        j.f(str5, "backgroundId");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && j.a(this.f, aVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("ProfileDiskModel(id=", str, ", name=", str2, ", username=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", avatarId=", str4, ", backgroundId=");
        return defpackage.b.c(b, str5, ")");
    }
}
