package com.amazon.aps.iva.wo;

import com.amazon.aps.iva.j0.j0;
/* compiled from: WatchScreenAssetsAdapterModel.kt */
/* loaded from: classes2.dex */
public final class j implements g {
    public final String b;

    public j() {
        this(j0.d("randomUUID().toString()"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && com.amazon.aps.iva.yb0.j.a(this.b, ((j) obj).b)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.wo.g
    public final String getAdapterId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("WatchScreenAssetsLoadingAdapterModel(adapterId="), this.b, ")");
    }

    public j(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        this.b = str;
    }
}
