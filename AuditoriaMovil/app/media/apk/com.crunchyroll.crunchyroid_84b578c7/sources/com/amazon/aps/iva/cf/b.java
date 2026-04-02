package com.amazon.aps.iva.cf;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Images;
/* compiled from: CastOverlayUiModel.kt */
/* loaded from: classes.dex */
public final class b {
    public final Images a;
    public final String b;

    public b(Images images, String str) {
        j.f(images, "images");
        j.f(str, "contentId");
        this.a = images;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CastOverlayUiModel(images=" + this.a + ", contentId=" + this.b + ")";
    }
}
