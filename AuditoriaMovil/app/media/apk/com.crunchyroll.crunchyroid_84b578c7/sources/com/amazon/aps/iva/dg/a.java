package com.amazon.aps.iva.dg;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: DeepLinkUri.kt */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final List<String> d;
    public final String e;
    public final String f;
    public final String g;

    public a() {
        this(0);
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
        int hashCode2;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return this.g.hashCode() + com.amazon.aps.iva.c80.a.b(this.f, com.amazon.aps.iva.c80.a.b(this.e, defpackage.a.a(this.d, (i3 + i) * 31, 31), 31), 31);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    public a(String str, String str2, String str3, List<String> list, String str4, String str5, String str6) {
        j.f(list, "pathSegments");
        j.f(str4, "utmCampaign");
        j.f(str5, "utmSource");
        j.f(str6, "utmMedium");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public /* synthetic */ a(int i) {
        this(null, null, null, z.b, "", "", "");
    }
}
