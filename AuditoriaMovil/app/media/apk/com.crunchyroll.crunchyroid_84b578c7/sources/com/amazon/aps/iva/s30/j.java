package com.amazon.aps.iva.s30;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.music.MusicAsset;
import java.util.List;
/* compiled from: SearchResultAdapterItem.kt */
/* loaded from: classes2.dex */
public final class j extends h {
    public final String b;
    public final t c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final List<Image> h;
    public final long i;
    public final com.amazon.aps.iva.ot.a j;
    public final List<String> k;
    public final MusicAsset l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, t tVar, int i, String str2, String str3, String str4, List<Image> list, long j, com.amazon.aps.iva.ot.a aVar, List<String> list2, MusicAsset musicAsset) {
        super(str);
        com.amazon.aps.iva.yb0.j.f(str, "_id");
        com.amazon.aps.iva.yb0.j.f(tVar, "type");
        com.amazon.aps.iva.yb0.j.f(str2, "artistTitle");
        com.amazon.aps.iva.yb0.j.f(str3, "artistId");
        com.amazon.aps.iva.yb0.j.f(str4, "musicTitle");
        com.amazon.aps.iva.yb0.j.f(list, "thumbnails");
        com.amazon.aps.iva.yb0.j.f(aVar, "status");
        com.amazon.aps.iva.yb0.j.f(list2, "badgeStatuses");
        com.amazon.aps.iva.yb0.j.f(musicAsset, "musicAsset");
        this.b = str;
        this.c = tVar;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = list;
        this.i = j;
        this.j = aVar;
        this.k = list2;
        this.l = musicAsset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, jVar.b) && this.c == jVar.c && this.d == jVar.d && com.amazon.aps.iva.yb0.j.a(this.e, jVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, jVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, jVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, jVar.h) && this.i == jVar.i && com.amazon.aps.iva.yb0.j.a(this.j, jVar.j) && com.amazon.aps.iva.yb0.j.a(this.k, jVar.k) && com.amazon.aps.iva.yb0.j.a(this.l, jVar.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int a = com.amazon.aps.iva.b8.i.a(this.i, defpackage.a.a(this.h, com.amazon.aps.iva.c80.a.b(this.g, com.amazon.aps.iva.c80.a.b(this.f, com.amazon.aps.iva.c80.a.b(this.e, r.a(this.d, l1.a(this.c, this.b.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        return this.l.hashCode() + defpackage.a.a(this.k, (this.j.hashCode() + a) * 31, 31);
    }

    public final String toString() {
        return "SearchResultMusicUiModel(_id=" + this.b + ", type=" + this.c + ", typeLabelRes=" + this.d + ", artistTitle=" + this.e + ", artistId=" + this.f + ", musicTitle=" + this.g + ", thumbnails=" + this.h + ", durationSec=" + this.i + ", status=" + this.j + ", badgeStatuses=" + this.k + ", musicAsset=" + this.l + ")";
    }
}
