package com.amazon.aps.iva.rt;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
/* compiled from: EpisodeDataItemUiModel.kt */
/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final com.amazon.aps.iva.pe0.a<Image> g;
    public final LabelUiModel h;
    public final com.amazon.aps.iva.ot.a i;

    public a(String str, String str2, String str3, String str4, String str5, long j, com.amazon.aps.iva.pe0.a<Image> aVar, LabelUiModel labelUiModel, com.amazon.aps.iva.ot.a aVar2) {
        j.f(str, "id");
        j.f(str2, "title");
        j.f(str3, "parentTitle");
        j.f(aVar, "thumbnails");
        j.f(labelUiModel, "labelUiModel");
        j.f(aVar2, "status");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = aVar;
        this.h = labelUiModel;
        this.i = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && this.f == aVar.f && j.a(this.g, aVar.g) && j.a(this.h, aVar.h) && j.a(this.i, aVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int a = i.a(this.f, com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        int hashCode = this.h.hashCode();
        return this.i.hashCode() + ((hashCode + ((this.g.hashCode() + a) * 31)) * 31);
    }

    public final String toString() {
        return "EpisodeDataItemUiModel(id=" + this.a + ", title=" + this.b + ", parentTitle=" + this.c + ", seasonNumber=" + this.d + ", episodeNumber=" + this.e + ", durationMs=" + this.f + ", thumbnails=" + this.g + ", labelUiModel=" + this.h + ", status=" + this.i + ")";
    }
}
