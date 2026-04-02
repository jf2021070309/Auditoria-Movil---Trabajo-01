package com.amazon.aps.iva.an;

import com.amazon.aps.iva.yb0.j;
/* compiled from: WelcomeScreenInput.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.ui.a {
    public final String b;
    public final String c;
    public final String d;

    public b(String str, String str2, String str3) {
        j.f(str, "profileName");
        j.f(str2, "backgroundId");
        j.f(str3, "avatarId");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.b, bVar.b) && j.a(this.c, bVar.c) && j.a(this.d, bVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WelcomeScreenInput(profileName=");
        sb.append(this.b);
        sb.append(", backgroundId=");
        sb.append(this.c);
        sb.append(", avatarId=");
        return defpackage.b.c(sb, this.d, ")");
    }
}
