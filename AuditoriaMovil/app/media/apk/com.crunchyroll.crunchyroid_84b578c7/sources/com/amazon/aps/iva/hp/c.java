package com.amazon.aps.iva.hp;

import com.amazon.aps.iva.mt.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.google.android.gms.cast.MediaTrack;
/* compiled from: WatchScreenSummaryUiModel.kt */
/* loaded from: classes2.dex */
public final class c {
    public final p a;
    public final String b;
    public final String c;
    public final String d;
    public final LabelUiModel e;

    public c(p pVar, String str, String str2, String str3, LabelUiModel labelUiModel) {
        j.f(str2, MediaTrack.ROLE_DESCRIPTION);
        j.f(labelUiModel, "labelUiModel");
        this.a = pVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = labelUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (j.a(this.a, cVar.a) && j.a(this.b, cVar.b) && j.a(this.c, cVar.c) && j.a(this.d, cVar.d) && j.a(this.e, cVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.e.hashCode() + ((b + hashCode) * 31);
    }

    public final String toString() {
        return "WatchScreenSummaryUiModel(titleMetaData=" + this.a + ", parentTitle=" + this.b + ", description=" + this.c + ", maturityRating=" + this.d + ", labelUiModel=" + this.e + ")";
    }
}
