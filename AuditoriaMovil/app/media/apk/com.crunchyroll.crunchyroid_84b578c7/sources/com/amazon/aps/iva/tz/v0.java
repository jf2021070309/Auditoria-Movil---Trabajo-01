package com.amazon.aps.iva.tz;

import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: BrowseAllInteractor.kt */
/* loaded from: classes2.dex */
public final class v0 {
    public final List<Panel> a;
    public final int b;

    public v0(List<Panel> list, int i) {
        com.amazon.aps.iva.yb0.j.f(list, "panels");
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, v0Var.a) && this.b == v0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrowsePanelModel(panels=" + this.a + ", total=" + this.b + ")";
    }
}
