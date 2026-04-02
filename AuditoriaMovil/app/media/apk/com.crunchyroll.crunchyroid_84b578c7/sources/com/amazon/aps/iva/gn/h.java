package com.amazon.aps.iva.gn;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: ShareablePanel.kt */
/* loaded from: classes2.dex */
public final class h {
    public final Panel a;

    public h(Panel panel) {
        j.f(panel, "panel");
        this.a = panel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && j.a(this.a, ((h) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShareablePanel(panel=" + this.a + ")";
    }
}
