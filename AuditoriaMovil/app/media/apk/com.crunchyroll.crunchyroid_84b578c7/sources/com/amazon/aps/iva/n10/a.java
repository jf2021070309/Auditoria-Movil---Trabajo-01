package com.amazon.aps.iva.n10;

import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: GenreFeedInteractor.kt */
/* loaded from: classes2.dex */
public final class a {
    public final List<Panel> a;
    public final int b;

    public a(List<Panel> list, int i) {
        com.amazon.aps.iva.yb0.j.f(list, "panels");
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && this.b == aVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrowseContainer(panels=" + this.a + ", total=" + this.b + ")";
    }
}
