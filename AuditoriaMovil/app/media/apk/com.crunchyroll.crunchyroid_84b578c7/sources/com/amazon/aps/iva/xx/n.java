package com.amazon.aps.iva.xx;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.model.music.MusicImages;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.google.android.gms.cast.MediaTrack;
import java.util.List;
/* compiled from: HomeFeedItem.kt */
/* loaded from: classes2.dex */
public final class n implements com.amazon.aps.iva.zx.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MusicImages e;
    public final String f;
    public final com.amazon.aps.iva.ot.a g;
    public final long h;
    public final List<String> i;
    public final t j;
    public final String k;
    public final String l;
    public final LabelUiModel m;

    public n(String str, String str2, String str3, String str4, MusicImages musicImages, String str5, com.amazon.aps.iva.ot.a aVar, long j, List<String> list, t tVar, String str6, String str7, LabelUiModel labelUiModel) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(str2, "artistId");
        com.amazon.aps.iva.yb0.j.f(str3, "title");
        com.amazon.aps.iva.yb0.j.f(str4, MediaTrack.ROLE_SUBTITLE);
        com.amazon.aps.iva.yb0.j.f(musicImages, "images");
        com.amazon.aps.iva.yb0.j.f(aVar, "status");
        com.amazon.aps.iva.yb0.j.f(list, "badgeStatuses");
        com.amazon.aps.iva.yb0.j.f(tVar, "type");
        com.amazon.aps.iva.yb0.j.f(str6, "feedId");
        com.amazon.aps.iva.yb0.j.f(labelUiModel, "labelUiModel");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = musicImages;
        this.f = str5;
        this.g = aVar;
        this.h = j;
        this.i = list;
        this.j = tVar;
        this.k = str6;
        this.l = str7;
        this.m = labelUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, nVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, nVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, nVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, nVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, nVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, nVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, nVar.g) && this.h == nVar.h && com.amazon.aps.iva.yb0.j.a(this.i, nVar.i) && this.j == nVar.j && com.amazon.aps.iva.yb0.j.a(this.k, nVar.k) && com.amazon.aps.iva.yb0.j.a(this.l, nVar.l) && com.amazon.aps.iva.yb0.j.a(this.m, nVar.m)) {
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
        int hashCode2 = (this.e.hashCode() + com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31;
        int i = 0;
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b = com.amazon.aps.iva.c80.a.b(this.k, l1.a(this.j, defpackage.a.a(this.i, com.amazon.aps.iva.b8.i.a(this.h, (this.g.hashCode() + ((hashCode2 + hashCode) * 31)) * 31, 31), 31), 31), 31);
        String str2 = this.l;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.m.hashCode() + ((b + i) * 31);
    }

    public final String toString() {
        return "MusicAssetItem(id=" + this.a + ", artistId=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", images=" + this.e + ", genre=" + this.f + ", status=" + this.g + ", durationSec=" + this.h + ", badgeStatuses=" + this.i + ", type=" + this.j + ", feedId=" + this.k + ", feedTitle=" + this.l + ", labelUiModel=" + this.m + ")";
    }
}
