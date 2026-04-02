package com.amazon.aps.iva.ci;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.music.MusicGenre;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
/* compiled from: MusicItemUiModel.kt */
/* loaded from: classes.dex */
public final class h {
    public final String a;
    public final String b;
    public final com.amazon.aps.iva.pe0.b<Image> c;
    public final long d;
    public final com.amazon.aps.iva.pe0.b<MusicGenre> e;
    public final com.amazon.aps.iva.ot.a f;
    public final com.amazon.aps.iva.pe0.b<String> g;
    public final int h;
    public final t i;
    public final String j;
    public final String k;
    public final boolean l;
    public final LabelUiModel m;

    public h(String str, String str2, com.amazon.aps.iva.pe0.b bVar, long j, com.amazon.aps.iva.pe0.b bVar2, com.amazon.aps.iva.ot.a aVar, com.amazon.aps.iva.pe0.b bVar3, t tVar, String str3, String str4, boolean z, LabelUiModel labelUiModel) {
        j.f(str, "id");
        j.f(str2, "title");
        j.f(bVar, "thumbnails");
        j.f(bVar2, "genre");
        j.f(aVar, "status");
        j.f(bVar3, "badgeStatuses");
        j.f(tVar, "assetType");
        j.f(str3, "artistId");
        j.f(labelUiModel, "labelUiModel");
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = j;
        this.e = bVar2;
        this.f = aVar;
        this.g = bVar3;
        this.h = 0;
        this.i = tVar;
        this.j = str3;
        this.k = str4;
        this.l = z;
        this.m = labelUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (j.a(this.a, hVar.a) && j.a(this.b, hVar.b) && j.a(this.c, hVar.c) && this.d == hVar.d && j.a(this.e, hVar.e) && j.a(this.f, hVar.f) && j.a(this.g, hVar.g) && this.h == hVar.h && this.i == hVar.i && j.a(this.j, hVar.j) && j.a(this.k, hVar.k) && this.l == hVar.l && j.a(this.m, hVar.m)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        int a = i.a(this.d, (this.c.hashCode() + b) * 31, 31);
        int hashCode2 = this.f.hashCode();
        int hashCode3 = this.g.hashCode();
        int b2 = com.amazon.aps.iva.c80.a.b(this.j, l1.a(this.i, r.a(this.h, (hashCode3 + ((hashCode2 + ((this.e.hashCode() + a) * 31)) * 31)) * 31, 31), 31), 31);
        String str = this.k;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (b2 + hashCode) * 31;
        boolean z = this.l;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return this.m.hashCode() + ((i + i2) * 31);
    }

    public final String toString() {
        return "MusicItemUiModel(id=" + this.a + ", title=" + this.b + ", thumbnails=" + this.c + ", durationSec=" + this.d + ", genre=" + this.e + ", status=" + this.f + ", badgeStatuses=" + this.g + ", progress=" + this.h + ", assetType=" + this.i + ", artistId=" + this.j + ", artistName=" + this.k + ", isCurrentlyPlaying=" + this.l + ", labelUiModel=" + this.m + ")";
    }
}
