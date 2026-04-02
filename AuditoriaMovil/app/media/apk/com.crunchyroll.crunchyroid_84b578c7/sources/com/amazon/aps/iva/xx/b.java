package com.amazon.aps.iva.xx;

import com.ellation.crunchyroll.model.music.MusicGenre;
import com.ellation.crunchyroll.model.music.MusicImages;
import java.util.List;
/* compiled from: HomeFeedItem.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.zx.a {
    public final String a;
    public final String b;
    public final MusicImages c;
    public final List<String> d;
    public final List<String> e;
    public final String f;
    public final String g;
    public final List<MusicGenre> h;

    public b(String str, String str2, MusicImages musicImages, List<String> list, List<String> list2, String str3, String str4, List<MusicGenre> list3) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(str2, "title");
        com.amazon.aps.iva.yb0.j.f(musicImages, "images");
        com.amazon.aps.iva.yb0.j.f(list, "videosIds");
        com.amazon.aps.iva.yb0.j.f(list2, "concertsIds");
        com.amazon.aps.iva.yb0.j.f(str3, "feedId");
        com.amazon.aps.iva.yb0.j.f(list3, "genres");
        this.a = str;
        this.b = str2;
        this.c = musicImages;
        this.d = list;
        this.e = list2;
        this.f = str3;
        this.g = str4;
        this.h = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, bVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, bVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, bVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, bVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, bVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, bVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, bVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, bVar.h)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.zx.a
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        int b2 = com.amazon.aps.iva.c80.a.b(this.f, defpackage.a.a(this.e, defpackage.a.a(this.d, (this.c.hashCode() + b) * 31, 31), 31), 31);
        String str = this.g;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.h.hashCode() + ((b2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistItem(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", images=");
        sb.append(this.c);
        sb.append(", videosIds=");
        sb.append(this.d);
        sb.append(", concertsIds=");
        sb.append(this.e);
        sb.append(", feedId=");
        sb.append(this.f);
        sb.append(", feedTitle=");
        sb.append(this.g);
        sb.append(", genres=");
        return com.amazon.aps.iva.oa.a.b(sb, this.h, ")");
    }
}
