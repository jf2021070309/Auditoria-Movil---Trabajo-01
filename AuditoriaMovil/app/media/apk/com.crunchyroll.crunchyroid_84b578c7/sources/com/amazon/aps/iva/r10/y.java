package com.amazon.aps.iva.r10;

import com.amazon.aps.iva.e4.t0;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
/* compiled from: HistoryItemMetadata.kt */
/* loaded from: classes2.dex */
public final class y {
    public final String a;
    public final LabelUiModel b;
    public final com.amazon.aps.iva.pe0.a<Image> c;
    public final float d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;

    static {
        int i = Image.$stable;
        int i2 = LabelUiModel.$stable;
    }

    public y() {
        throw null;
    }

    public y(String str, LabelUiModel labelUiModel, com.amazon.aps.iva.pe0.a aVar, float f, String str2, String str3, String str4, boolean z, boolean z2, int i) {
        str3 = (i & 32) != 0 ? "" : str3;
        str4 = (i & 64) != 0 ? "" : str4;
        z = (i & 128) != 0 ? false : z;
        z2 = (i & 256) != 0 ? false : z2;
        com.amazon.aps.iva.yb0.j.f(str, "parentTitle");
        com.amazon.aps.iva.yb0.j.f(labelUiModel, "labelUiModel");
        com.amazon.aps.iva.yb0.j.f(aVar, "images");
        com.amazon.aps.iva.yb0.j.f(str3, "title");
        com.amazon.aps.iva.yb0.j.f(str4, "seasonAndEpisode");
        this.a = str;
        this.b = labelUiModel;
        this.c = aVar;
        this.d = f;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, yVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, yVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, yVar.c) && Float.compare(this.d, yVar.d) == 0 && com.amazon.aps.iva.yb0.j.a(this.e, yVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, yVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, yVar.g) && this.h == yVar.h && this.i == yVar.i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode();
        int b = t0.b(this.d, (this.c.hashCode() + ((hashCode2 + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b2 = com.amazon.aps.iva.c80.a.b(this.g, com.amazon.aps.iva.c80.a.b(this.f, (b + hashCode) * 31, 31), 31);
        int i = 1;
        boolean z = this.h;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (b2 + i2) * 31;
        boolean z2 = this.i;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryItemMetadata(parentTitle=");
        sb.append(this.a);
        sb.append(", labelUiModel=");
        sb.append(this.b);
        sb.append(", images=");
        sb.append(this.c);
        sb.append(", progress=");
        sb.append(this.d);
        sb.append(", duration=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", seasonAndEpisode=");
        sb.append(this.g);
        sb.append(", fullyWatched=");
        sb.append(this.h);
        sb.append(", isMovie=");
        return com.amazon.aps.iva.e4.e.c(sb, this.i, ")");
    }
}
