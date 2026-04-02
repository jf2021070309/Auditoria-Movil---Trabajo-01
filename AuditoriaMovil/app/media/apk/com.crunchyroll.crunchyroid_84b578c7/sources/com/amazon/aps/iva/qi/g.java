package com.amazon.aps.iva.qi;

import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.google.android.gms.cast.MediaTrack;
import java.util.Date;
import java.util.List;
/* compiled from: WatchMusicSummaryUiModel.kt */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List<j<String, String>> e;
    public final Date f;
    public final String g;
    public final LabelUiModel h;
    public final t i;

    public g(String str, String str2, String str3, String str4, List<j<String, String>> list, Date date, String str5, LabelUiModel labelUiModel, t tVar) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(str2, "artistId");
        com.amazon.aps.iva.yb0.j.f(str3, "musicTitle");
        com.amazon.aps.iva.yb0.j.f(str4, "artistTitle");
        com.amazon.aps.iva.yb0.j.f(list, "artistNameClickableParts");
        com.amazon.aps.iva.yb0.j.f(str5, MediaTrack.ROLE_DESCRIPTION);
        com.amazon.aps.iva.yb0.j.f(labelUiModel, "labelUiModel");
        com.amazon.aps.iva.yb0.j.f(tVar, "assetType");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = date;
        this.g = str5;
        this.h = labelUiModel;
        this.i = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, gVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, gVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, gVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, gVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, gVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, gVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, gVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, gVar.h) && this.i == gVar.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = defpackage.a.a(this.e, com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        Date date = this.f;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int b = com.amazon.aps.iva.c80.a.b(this.g, (a + hashCode) * 31, 31);
        return this.i.hashCode() + ((this.h.hashCode() + b) * 31);
    }

    public final String toString() {
        return "WatchMusicSummaryUiModel(id=" + this.a + ", artistId=" + this.b + ", musicTitle=" + this.c + ", artistTitle=" + this.d + ", artistNameClickableParts=" + this.e + ", releaseDate=" + this.f + ", description=" + this.g + ", labelUiModel=" + this.h + ", assetType=" + this.i + ")";
    }
}
