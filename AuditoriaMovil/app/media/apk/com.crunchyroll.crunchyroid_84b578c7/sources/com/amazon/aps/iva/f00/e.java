package com.amazon.aps.iva.f00;
/* compiled from: PlayableAssetUiModel.kt */
/* loaded from: classes2.dex */
public final class e implements a {
    public final String b;

    public e(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        this.b = str;
    }

    public final Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && com.amazon.aps.iva.yb0.j.a(this.b, ((e) obj).b)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.f00.a
    public final String getAdapterId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("EmptyAsset(adapterId="), this.b, ")");
    }
}
