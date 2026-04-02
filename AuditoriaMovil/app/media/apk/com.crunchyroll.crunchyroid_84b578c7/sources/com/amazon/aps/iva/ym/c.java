package com.amazon.aps.iva.ym;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
/* compiled from: SwitchProfileUiModel.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final com.amazon.aps.iva.pe0.b<c> i;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final com.amazon.aps.iva.wm.a e;
    public final Boolean f;
    public final boolean g;
    public final boolean h;

    static {
        ArrayList arrayList = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            arrayList.add(new c(null, null, null, null, com.amazon.aps.iva.wm.a.SWITCH_PROFILE_LOADING, null, true, false, 175));
        }
        i = x.p0(arrayList);
    }

    public c(String str, String str2, String str3, String str4, com.amazon.aps.iva.wm.a aVar, Boolean bool, boolean z, boolean z2) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(str2, "userName");
        j.f(str3, "avatarImageId");
        j.f(str4, "backgroundImageId");
        j.f(aVar, "avatarStyle");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = aVar;
        this.f = bool;
        this.g = z;
        this.h = z2;
    }

    public static c a(c cVar, com.amazon.aps.iva.wm.a aVar) {
        Boolean bool = cVar.f;
        boolean z = cVar.g;
        boolean z2 = cVar.h;
        String str = cVar.a;
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String str2 = cVar.b;
        j.f(str2, "userName");
        String str3 = cVar.c;
        j.f(str3, "avatarImageId");
        String str4 = cVar.d;
        j.f(str4, "backgroundImageId");
        j.f(aVar, "avatarStyle");
        return new c(str, str2, str3, str4, aVar, bool, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (j.a(this.a, cVar.a) && j.a(this.b, cVar.b) && j.a(this.c, cVar.c) && j.a(this.d, cVar.d) && this.e == cVar.e && j.a(this.f, cVar.f) && this.g == cVar.g && this.h == cVar.h) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.e.hashCode() + com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31;
        Boolean bool = this.f;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        int i3 = 1;
        boolean z = this.g;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i2 + i4) * 31;
        boolean z2 = this.h;
        if (!z2) {
            i3 = z2 ? 1 : 0;
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwitchProfileUiModel(name=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", avatarImageId=");
        sb.append(this.c);
        sb.append(", backgroundImageId=");
        sb.append(this.d);
        sb.append(", avatarStyle=");
        sb.append(this.e);
        sb.append(", isSelected=");
        sb.append(this.f);
        sb.append(", isLoading=");
        sb.append(this.g);
        sb.append(", canSwitch=");
        return e.c(sb, this.h, ")");
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, com.amazon.aps.iva.wm.a aVar, Boolean bool, boolean z, boolean z2, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, aVar, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? true : z2);
    }
}
