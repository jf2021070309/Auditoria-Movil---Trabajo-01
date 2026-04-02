package com.amazon.aps.iva.f00;
/* compiled from: PlayableAssetUiModel.kt */
/* loaded from: classes2.dex */
public final class y implements a {
    public final com.amazon.aps.iva.n00.a b;
    public final String c = "season_navigator";

    public y(com.amazon.aps.iva.n00.a aVar) {
        this.b = aVar;
    }

    public final Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, yVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, yVar.c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.f00.a
    public final String getAdapterId() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SeasonNavigator(data=" + this.b + ", adapterId=" + this.c + ")";
    }
}
