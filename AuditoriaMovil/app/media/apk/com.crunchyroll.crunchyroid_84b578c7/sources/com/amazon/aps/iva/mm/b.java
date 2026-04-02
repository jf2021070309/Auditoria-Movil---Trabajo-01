package com.amazon.aps.iva.mm;

import com.amazon.aps.iva.yb0.j;
/* compiled from: ManageProfileUiModel.kt */
/* loaded from: classes2.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;

    public b(String str, String str2, String str3, String str4, boolean z, String str5) {
        j.f(str, "profileName");
        j.f(str2, "userName");
        j.f(str3, "avatarImageId");
        j.f(str4, "backgroundImageId");
        j.f(str5, "randomUserName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
    }

    public static b a(b bVar, String str, String str2, int i) {
        String str3;
        String str4;
        boolean z;
        String str5 = null;
        if ((i & 1) != 0) {
            str3 = bVar.a;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = bVar.b;
        } else {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str = bVar.c;
        }
        String str6 = str;
        if ((i & 8) != 0) {
            str2 = bVar.d;
        }
        String str7 = str2;
        if ((i & 16) != 0) {
            z = bVar.e;
        } else {
            z = false;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = bVar.f;
        }
        String str8 = str5;
        bVar.getClass();
        j.f(str3, "profileName");
        j.f(str4, "userName");
        j.f(str6, "avatarImageId");
        j.f(str7, "backgroundImageId");
        j.f(str8, "randomUserName");
        return new b(str3, str4, str6, str7, z2, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b) && j.a(this.c, bVar.c) && j.a(this.d, bVar.d) && this.e == bVar.e && j.a(this.f, bVar.f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int b = com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.f.hashCode() + ((b + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManageProfileUiModel(profileName=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", avatarImageId=");
        sb.append(this.c);
        sb.append(", backgroundImageId=");
        sb.append(this.d);
        sb.append(", isPrimaryProfile=");
        sb.append(this.e);
        sb.append(", randomUserName=");
        return defpackage.b.c(sb, this.f, ")");
    }
}
