package com.amazon.aps.iva.ni;

import java.io.Serializable;
/* compiled from: WatchMusicViewModel.kt */
/* loaded from: classes.dex */
public final class x implements Serializable {
    public final String b;
    public final com.amazon.aps.iva.x50.t c;

    public x(String str, com.amazon.aps.iva.x50.t tVar) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.yb0.j.f(tVar, "assetType");
        this.b = str;
        this.c = tVar;
    }

    public static x a(x xVar, String str, int i) {
        com.amazon.aps.iva.x50.t tVar;
        if ((i & 1) != 0) {
            str = xVar.b;
        }
        if ((i & 2) != 0) {
            tVar = xVar.c;
        } else {
            tVar = null;
        }
        xVar.getClass();
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.yb0.j.f(tVar, "assetType");
        return new x(str, tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, xVar.b) && this.c == xVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "WatchMusicViewModelState(assetId=" + this.b + ", assetType=" + this.c + ")";
    }
}
