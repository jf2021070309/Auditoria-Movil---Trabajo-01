package com.amazon.aps.iva.r40;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.google.android.gms.cast.MediaTrack;
/* compiled from: ShowSummary.kt */
/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final String b;
    public final LabelUiModel c;
    public final int d;

    static {
        int i = LabelUiModel.$stable;
    }

    public a(String str, String str2, LabelUiModel labelUiModel, int i) {
        j.f(str, "title");
        j.f(str2, MediaTrack.ROLE_DESCRIPTION);
        j.f(labelUiModel, "labelUiModel");
        this.a = str;
        this.b = str2;
        this.c = labelUiModel;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && this.d == aVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        return Integer.hashCode(this.d) + ((this.c.hashCode() + b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowSummary(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", labelUiModel=");
        sb.append(this.c);
        sb.append(", ctaButtonTitle=");
        return defpackage.e.f(sb, this.d, ")");
    }
}
