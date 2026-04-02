package com.amazon.aps.iva.gi;

import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: ArtistCardOverflowMenuProvider.kt */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final String b;
    public final List<String> c;
    public final List<String> d;

    public c(String str, String str2, List<String> list, List<String> list2) {
        j.f(str, "artistId");
        j.f(str2, "artistName");
        j.f(list, "videosIds");
        j.f(list2, "concertsIds");
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (j.a(this.a, cVar.a) && j.a(this.b, cVar.b) && j.a(this.c, cVar.c) && j.a(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + defpackage.a.a(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistOverflowData(artistId=");
        sb.append(this.a);
        sb.append(", artistName=");
        sb.append(this.b);
        sb.append(", videosIds=");
        sb.append(this.c);
        sb.append(", concertsIds=");
        return com.amazon.aps.iva.oa.a.b(sb, this.d, ")");
    }
}
