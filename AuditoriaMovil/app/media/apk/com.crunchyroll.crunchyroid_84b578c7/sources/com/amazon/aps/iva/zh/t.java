package com.amazon.aps.iva.zh;

import com.ellation.crunchyroll.api.etp.model.Image;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ArtistUiModel.kt */
/* loaded from: classes.dex */
public final class t {
    public final String a;
    public final com.amazon.aps.iva.ai.a b;
    public final List<Image> c;
    public final String d;
    public final List<String> e;
    public final List<com.amazon.aps.iva.ci.h> f;
    public final List<com.amazon.aps.iva.ci.h> g;

    public t(String str, com.amazon.aps.iva.ai.a aVar, List list, String str2, ArrayList arrayList, List list2, List list3) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(list, "images");
        com.amazon.aps.iva.yb0.j.f(str2, "duration");
        com.amazon.aps.iva.yb0.j.f(list2, "musicVideos");
        com.amazon.aps.iva.yb0.j.f(list3, "concerts");
        this.a = str;
        this.b = aVar;
        this.c = list;
        this.d = str2;
        this.e = arrayList;
        this.f = list2;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, tVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, tVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, tVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, tVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, tVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, tVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, tVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.g.hashCode() + defpackage.a.a(this.f, defpackage.a.a(this.e, com.amazon.aps.iva.c80.a.b(this.d, defpackage.a.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistUiModel(id=");
        sb.append(this.a);
        sb.append(", summary=");
        sb.append(this.b);
        sb.append(", images=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", genres=");
        sb.append(this.e);
        sb.append(", musicVideos=");
        sb.append(this.f);
        sb.append(", concerts=");
        return com.amazon.aps.iva.oa.a.b(sb, this.g, ")");
    }
}
