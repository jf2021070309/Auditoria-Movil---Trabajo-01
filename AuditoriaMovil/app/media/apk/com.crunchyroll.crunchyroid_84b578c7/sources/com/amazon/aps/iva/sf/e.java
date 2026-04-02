package com.amazon.aps.iva.sf;

import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ContentRatingInput.kt */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final t b;
    public final t c;

    public e(String str, t tVar) {
        t tVar2;
        j.f(str, "assetId");
        j.f(tVar, "assetParentType");
        this.a = str;
        this.b = tVar;
        if (tVar == t.SERIES) {
            tVar2 = t.EPISODE;
        } else {
            tVar2 = t.MOVIE;
        }
        this.c = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.a, eVar.a) && this.b == eVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentRatingInput(assetId=" + this.a + ", assetParentType=" + this.b + ")";
    }
}
