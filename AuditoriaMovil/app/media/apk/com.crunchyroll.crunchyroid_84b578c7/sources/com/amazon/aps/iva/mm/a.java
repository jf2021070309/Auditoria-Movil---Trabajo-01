package com.amazon.aps.iva.mm;

import com.amazon.aps.iva.yb0.j;
/* compiled from: ManageProfileInput.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.ui.a {
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public a() {
        this((String) null, (String) null, (String) null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && j.a(this.e, aVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManageProfileInput(profileName=");
        sb.append(this.b);
        sb.append(", avatarImageId=");
        sb.append(this.c);
        sb.append(", backgroundImageId=");
        sb.append(this.d);
        sb.append(", userName=");
        return defpackage.b.c(sb, this.e, ")");
    }

    public /* synthetic */ a(String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "default.png" : str2, (i & 4) != 0 ? "default.png" : str3, (i & 8) == 0 ? null : "");
    }

    public a(String str, String str2, String str3, String str4) {
        j.f(str, "profileName");
        j.f(str2, "avatarImageId");
        j.f(str3, "backgroundImageId");
        j.f(str4, "userName");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
