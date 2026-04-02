package com.amazon.aps.iva.kz;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.ot.a;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import java.util.List;
/* compiled from: PlayableAssetCardUiModel.kt */
/* loaded from: classes2.dex */
public final class i {
    public final String a;
    public final List<Image> b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    public final com.amazon.aps.iva.ot.a l;
    public final List<String> m;
    public final LabelUiModel n;

    public i() {
        this(null, null, null, false, null, null, null, null, 0, null, null, null, 16383);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, iVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, iVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, iVar.c) && this.d == iVar.d && com.amazon.aps.iva.yb0.j.a(this.e, iVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, iVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, iVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, iVar.h) && this.i == iVar.i && this.j == iVar.j && com.amazon.aps.iva.yb0.j.a(this.k, iVar.k) && com.amazon.aps.iva.yb0.j.a(this.l, iVar.l) && com.amazon.aps.iva.yb0.j.a(this.m, iVar.m) && com.amazon.aps.iva.yb0.j.a(this.n, iVar.n)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int b = com.amazon.aps.iva.c80.a.b(this.c, defpackage.a.a(this.b, this.a.hashCode() * 31, 31), 31);
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int b2 = com.amazon.aps.iva.c80.a.b(this.k, r.a(this.j, r.a(this.i, com.amazon.aps.iva.c80.a.b(this.h, com.amazon.aps.iva.c80.a.b(this.g, com.amazon.aps.iva.c80.a.b(this.f, com.amazon.aps.iva.c80.a.b(this.e, (b + i) * 31, 31), 31), 31), 31), 31), 31), 31);
        return this.n.hashCode() + defpackage.a.a(this.m, (this.l.hashCode() + b2) * 31, 31);
    }

    public final String toString() {
        return "PlayableAssetCardUiModel(assetId=" + this.a + ", thumbnails=" + this.b + ", title=" + this.c + ", isMature=" + this.d + ", episodeNumber=" + this.e + ", seasonAndEpisodeNumber=" + this.f + ", seasonId=" + this.g + ", duration=" + this.h + ", comments=" + this.i + ", watchProgress=" + this.j + ", seasonTitle=" + this.k + ", status=" + this.l + ", badgeStatuses=" + this.m + ", labelUiModel=" + this.n + ")";
    }

    public i(String str, List list, String str2, boolean z, String str3, String str4, String str5, String str6, int i, com.amazon.aps.iva.ot.a aVar, List list2, LabelUiModel labelUiModel, int i2) {
        String str7 = (i2 & 1) != 0 ? "" : str;
        List list3 = (i2 & 2) != 0 ? z.b : list;
        String str8 = (i2 & 4) != 0 ? "" : str2;
        boolean z2 = (i2 & 8) != 0 ? false : z;
        String str9 = (i2 & 16) != 0 ? "" : str3;
        String str10 = (i2 & 32) != 0 ? "" : str4;
        String str11 = (i2 & 64) != 0 ? "" : str5;
        String str12 = (i2 & 128) != 0 ? "" : str6;
        int i3 = (i2 & 256) != 0 ? 0 : i;
        String str13 = (i2 & 1024) == 0 ? null : "";
        com.amazon.aps.iva.ot.a aVar2 = (i2 & 2048) != 0 ? a.C0584a.d : aVar;
        List J = (i2 & 4096) != 0 ? f1.J("available") : list2;
        LabelUiModel labelUiModel2 = (i2 & 8192) != 0 ? new LabelUiModel(null, false, false, false, null, null, null, null, 255, null) : labelUiModel;
        com.amazon.aps.iva.yb0.j.f(str7, "assetId");
        com.amazon.aps.iva.yb0.j.f(list3, "thumbnails");
        com.amazon.aps.iva.yb0.j.f(str8, "title");
        com.amazon.aps.iva.yb0.j.f(str9, "episodeNumber");
        com.amazon.aps.iva.yb0.j.f(str10, "seasonAndEpisodeNumber");
        com.amazon.aps.iva.yb0.j.f(str11, "seasonId");
        com.amazon.aps.iva.yb0.j.f(str12, "duration");
        com.amazon.aps.iva.yb0.j.f(str13, "seasonTitle");
        com.amazon.aps.iva.yb0.j.f(aVar2, "status");
        com.amazon.aps.iva.yb0.j.f(J, "badgeStatuses");
        com.amazon.aps.iva.yb0.j.f(labelUiModel2, "labelUiModel");
        this.a = str7;
        this.b = list3;
        this.c = str8;
        this.d = z2;
        this.e = str9;
        this.f = str10;
        this.g = str11;
        this.h = str12;
        this.i = i3;
        this.j = 0;
        this.k = str13;
        this.l = aVar2;
        this.m = J;
        this.n = labelUiModel2;
    }
}
