package com.amazon.aps.iva.ep;

import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
/* compiled from: WatchScreenLoadingUiModel.kt */
/* loaded from: classes2.dex */
public final class c {
    public final t a;

    public c(t tVar) {
        j.f(tVar, "assetParentType");
        this.a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.a == ((c) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WatchScreenLoadingUiModel(assetParentType=" + this.a + ")";
    }
}
