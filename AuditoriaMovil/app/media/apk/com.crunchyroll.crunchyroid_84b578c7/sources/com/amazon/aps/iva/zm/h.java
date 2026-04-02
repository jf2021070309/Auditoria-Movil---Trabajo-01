package com.amazon.aps.iva.zm;

import com.amazon.aps.iva.yb0.j;
/* compiled from: WelcomeScreen.kt */
/* loaded from: classes2.dex */
public final class h {
    public final String a;
    public final String b;
    public final String c;

    public h(String str, String str2, String str3) {
        j.f(str, "profileName");
        j.f(str2, "avatarId");
        j.f(str3, "backgroundId");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (j.a(this.a, hVar.a) && j.a(this.b, hVar.b) && j.a(this.c, hVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WelcomeScreenUiModel(profileName=");
        sb.append(this.a);
        sb.append(", avatarId=");
        sb.append(this.b);
        sb.append(", backgroundId=");
        return defpackage.b.c(sb, this.c, ")");
    }
}
