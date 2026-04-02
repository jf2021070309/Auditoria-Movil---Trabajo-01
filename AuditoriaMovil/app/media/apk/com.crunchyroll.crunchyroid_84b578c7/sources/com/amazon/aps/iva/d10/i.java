package com.amazon.aps.iva.d10;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: DownloadsPanel.kt */
/* loaded from: classes2.dex */
public final class i {
    public final Panel a;
    public final j b;
    public final int c;
    public final boolean d;

    public i(Panel panel, j jVar, int i, boolean z) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        com.amazon.aps.iva.yb0.j.f(jVar, "status");
        this.a = panel;
        this.b = jVar;
        this.c = i;
        this.d = z;
    }

    public static i a(i iVar, boolean z) {
        Panel panel = iVar.a;
        j jVar = iVar.b;
        int i = iVar.c;
        iVar.getClass();
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        com.amazon.aps.iva.yb0.j.f(jVar, "status");
        return new i(panel, jVar, i, z);
    }

    public final String b() {
        return this.a.getId();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c && this.d == iVar.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int a = com.amazon.aps.iva.a0.r.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a + i;
    }

    public final String toString() {
        return "DownloadPanel(panel=" + this.a + ", status=" + this.b + ", completedVideosCount=" + this.c + ", isSelected=" + this.d + ")";
    }
}
