package com.amazon.aps.iva.xx;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.model.music.MusicImages;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
/* compiled from: HomeFeedItem.kt */
/* loaded from: classes2.dex */
public final class p extends l {
    public final String b;
    public final String c;
    public final MusicImages d;
    public final String e;
    public final t f;
    public final String g;
    public final List<String> h;
    public final LabelUiModel i;

    public p(String str, String str2, MusicImages musicImages, String str3, t tVar, String str4, List<String> list, LabelUiModel labelUiModel) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(musicImages, "images");
        com.amazon.aps.iva.yb0.j.f(str3, "assetId");
        com.amazon.aps.iva.yb0.j.f(tVar, "resourceType");
        com.amazon.aps.iva.yb0.j.f(labelUiModel, "labelUiModel");
        this.b = str;
        this.c = str2;
        this.d = musicImages;
        this.e = str3;
        this.f = tVar;
        this.g = str4;
        this.h = list;
        this.i = labelUiModel;
    }

    @Override // com.amazon.aps.iva.xx.l
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, pVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, pVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, pVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, pVar.e) && this.f == pVar.f && com.amazon.aps.iva.yb0.j.a(this.g, pVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, pVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, pVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31);
        int a = l1.a(this.f, com.amazon.aps.iva.c80.a.b(this.e, (this.d.hashCode() + b) * 31, 31), 31);
        String str = this.g;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.i.hashCode() + defpackage.a.a(this.h, (a + hashCode) * 31, 31);
    }

    public final String toString() {
        return "MusicHeroItemUiModel(id=" + this.b + ", name=" + this.c + ", images=" + this.d + ", assetId=" + this.e + ", resourceType=" + this.f + ", description=" + this.g + ", genres=" + this.h + ", labelUiModel=" + this.i + ")";
    }
}
