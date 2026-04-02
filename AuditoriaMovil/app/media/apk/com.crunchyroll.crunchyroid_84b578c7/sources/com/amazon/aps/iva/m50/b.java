package com.amazon.aps.iva.m50;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Images;
import java.io.Serializable;
/* compiled from: ShowRatingInput.kt */
/* loaded from: classes2.dex */
public final class b implements Serializable {
    public final String b;
    public final t c;
    public final String d;
    public final String e;
    public final Images f;

    public b(String str, t tVar, String str2, String str3, Images images) {
        j.f(str, "contentId");
        j.f(tVar, "contentType");
        j.f(str2, "contentTitle");
        j.f(str3, "channelId");
        j.f(images, "contentImages");
        this.b = str;
        this.c = tVar;
        this.d = str2;
        this.e = str3;
        this.f = images;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.b, bVar.b) && this.c == bVar.c && j.a(this.d, bVar.d) && j.a(this.e, bVar.e) && j.a(this.f, bVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, l1.a(this.c, this.b.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ShowRatingInput(contentId=" + this.b + ", contentType=" + this.c + ", contentTitle=" + this.d + ", channelId=" + this.e + ", contentImages=" + this.f + ")";
    }
}
