package com.amazon.aps.iva.wl;

import java.util.List;
/* compiled from: PlayerSubtitlesProvider.kt */
/* loaded from: classes2.dex */
public final class i {
    public final List<com.amazon.aps.iva.qj.h> a;
    public final List<com.amazon.aps.iva.qj.h> b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends com.amazon.aps.iva.qj.h> list, List<? extends com.amazon.aps.iva.qj.h> list2) {
        com.amazon.aps.iva.yb0.j.f(list, "subtitles");
        com.amazon.aps.iva.yb0.j.f(list2, "captions");
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, iVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, iVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubtitlesCCOptions(subtitles=" + this.a + ", captions=" + this.b + ")";
    }
}
