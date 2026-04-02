package com.amazon.aps.iva.jt;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.js.k;
import com.amazon.aps.iva.yb0.j;
/* compiled from: FeedAnalyticsData.kt */
/* loaded from: classes2.dex */
public final class a {
    public final k a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: FeedAnalyticsData.kt */
    /* renamed from: com.amazon.aps.iva.jt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0423a {
        public static a a(k kVar, int i, int i2, String str, String str2, int i3) {
            String str3;
            String str4;
            if ((i3 & 8) != 0) {
                str = null;
            }
            if ((i3 & 16) != 0) {
                str2 = null;
            }
            j.f(kVar, "feedType");
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (str2 == null) {
                str4 = "";
            } else {
                str4 = str2;
            }
            return new a(kVar, i, i2, str3, str4, "");
        }
    }

    static {
        new C0423a();
    }

    public /* synthetic */ a(k kVar, int i) {
        this(kVar, i, 0, "", "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && j.a(this.f, aVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, r.a(this.c, r.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedAnalyticsData(feedType=");
        sb.append(this.a);
        sb.append(", positionOfFeed=");
        sb.append(this.b);
        sb.append(", positionOfPanelInFeed=");
        sb.append(this.c);
        sb.append(", feedTitle=");
        sb.append(this.d);
        sb.append(", sourceMediaId=");
        sb.append(this.e);
        sb.append(", sourceMediaTitle=");
        return b.c(sb, this.f, ")");
    }

    public a(k kVar, int i, int i2, String str, String str2, String str3) {
        j.f(kVar, "feedType");
        j.f(str, "feedTitle");
        j.f(str2, "sourceMediaId");
        j.f(str3, "sourceMediaTitle");
        this.a = kVar;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }
}
