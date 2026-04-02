package com.amazon.aps.iva.cl;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaTrack;
/* compiled from: ToolbarTitleUiModel.kt */
/* loaded from: classes2.dex */
public final class g {
    public final String a;
    public final String b;

    public g(String str, String str2) {
        j.f(str, "title");
        j.f(str2, MediaTrack.ROLE_SUBTITLE);
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (j.a(this.a, gVar.a) && j.a(this.b, gVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarTitleUiModel(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        return defpackage.b.c(sb, this.b, ")");
    }
}
