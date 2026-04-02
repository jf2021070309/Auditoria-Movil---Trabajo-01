package com.amazon.aps.iva.kl;

import com.ellation.crunchyroll.api.etp.model.Image;
/* compiled from: UpNextBannerUiModel.kt */
/* loaded from: classes2.dex */
public final class j {
    public final com.amazon.aps.iva.pe0.a<Image> a;
    public final int b;
    public final String c;
    public final String d;
    public final float e;

    static {
        int i = Image.$stable;
    }

    public j(com.amazon.aps.iva.pe0.a<Image> aVar, int i, String str, String str2, float f) {
        com.amazon.aps.iva.yb0.j.f(aVar, "images");
        com.amazon.aps.iva.yb0.j.f(str, "contentTitle");
        com.amazon.aps.iva.yb0.j.f(str2, "timeText");
        this.a = aVar;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, jVar.a) && this.b == jVar.b && com.amazon.aps.iva.yb0.j.a(this.c, jVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, jVar.d) && Float.compare(this.e, jVar.e) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.a0.r.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "UpNextBannerUiModel(images=" + this.a + ", availabilityIcon=" + this.b + ", contentTitle=" + this.c + ", timeText=" + this.d + ", progress=" + this.e + ")";
    }
}
