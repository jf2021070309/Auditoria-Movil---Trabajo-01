package com.amazon.aps.iva.fi;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.pe0.b;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
/* compiled from: MusicMediaCardUiModel.kt */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final b<Image> e;
    public final long f;
    public final String g;
    public final com.amazon.aps.iva.ot.a h;
    public final b<String> i;
    public final LabelUiModel j;
    public final t k;
    public final boolean l;

    public a(String str, String str2, String str3, String str4, b<Image> bVar, long j, String str5, com.amazon.aps.iva.ot.a aVar, b<String> bVar2, LabelUiModel labelUiModel, t tVar, boolean z) {
        j.f(str, "id");
        j.f(str2, "artistId");
        j.f(str3, "artistTitle");
        j.f(str4, "musicTitle");
        j.f(bVar, "thumbnails");
        j.f(aVar, "status");
        j.f(bVar2, "badgeStatuses");
        j.f(labelUiModel, "labelUiModel");
        j.f(tVar, "assetType");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bVar;
        this.f = j;
        this.g = str5;
        this.h = aVar;
        this.i = bVar2;
        this.j = labelUiModel;
        this.k = tVar;
        this.l = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && this.f == aVar.f && j.a(this.g, aVar.g) && j.a(this.h, aVar.h) && j.a(this.i, aVar.i) && j.a(this.j, aVar.j) && this.k == aVar.k && this.l == aVar.l) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
        int a = i.a(this.f, (this.e.hashCode() + b) * 31, 31);
        String str = this.g;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.h.hashCode();
        int hashCode3 = this.i.hashCode();
        int hashCode4 = this.j.hashCode();
        int a2 = l1.a(this.k, (hashCode4 + ((hashCode3 + ((hashCode2 + ((a + hashCode) * 31)) * 31)) * 31)) * 31, 31);
        boolean z = this.l;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicMediaCardUiModel(id=");
        sb.append(this.a);
        sb.append(", artistId=");
        sb.append(this.b);
        sb.append(", artistTitle=");
        sb.append(this.c);
        sb.append(", musicTitle=");
        sb.append(this.d);
        sb.append(", thumbnails=");
        sb.append(this.e);
        sb.append(", durationSec=");
        sb.append(this.f);
        sb.append(", genre=");
        sb.append(this.g);
        sb.append(", status=");
        sb.append(this.h);
        sb.append(", badgeStatuses=");
        sb.append(this.i);
        sb.append(", labelUiModel=");
        sb.append(this.j);
        sb.append(", assetType=");
        sb.append(this.k);
        sb.append(", isCurrentlyPlaying=");
        return e.c(sb, this.l, ")");
    }
}
