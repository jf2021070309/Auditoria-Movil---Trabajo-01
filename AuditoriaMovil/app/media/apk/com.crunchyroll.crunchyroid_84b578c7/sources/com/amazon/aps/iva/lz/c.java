package com.amazon.aps.iva.lz;

import com.amazon.aps.iva.yb0.j;
/* compiled from: PlayableAssetDurationUiModel.kt */
/* loaded from: classes2.dex */
public final class c {
    public final String a;
    public final com.amazon.aps.iva.ot.a b;

    public c(String str, com.amazon.aps.iva.ot.a aVar) {
        j.f(str, "duration");
        j.f(aVar, "status");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (j.a(this.a, cVar.a) && j.a(this.b, cVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayableAssetDurationUiModel(duration=" + this.a + ", status=" + this.b + ")";
    }
}
