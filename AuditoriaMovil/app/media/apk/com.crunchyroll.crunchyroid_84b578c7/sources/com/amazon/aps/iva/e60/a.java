package com.amazon.aps.iva.e60;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Images;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: WatchlistImages.kt */
/* loaded from: classes2.dex */
public final class a {
    public final Panel a;
    public final String b;
    public final Images c;

    static {
        int i = Images.$stable;
        int i2 = Panel.$stable;
    }

    public a(Panel panel) {
        j.f(panel, "panel");
        this.a = panel;
        this.b = panel.getId();
        this.c = panel.getImages();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && j.a(this.a, ((a) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WatchlistImageUiModel(panel=" + this.a + ")";
    }
}
