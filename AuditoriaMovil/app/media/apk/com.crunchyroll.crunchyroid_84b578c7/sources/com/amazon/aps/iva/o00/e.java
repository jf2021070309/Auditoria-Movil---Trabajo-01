package com.amazon.aps.iva.o00;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayheadTimeProvider;
/* compiled from: UpNextUiModel.kt */
/* loaded from: classes2.dex */
public final class e implements PlayheadTimeProvider {
    public final PlayableAsset a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;

    static {
        int i = PlayableAsset.$stable;
    }

    public e(PlayableAsset playableAsset, boolean z, boolean z2, long j, int i) {
        z = (i & 2) != 0 ? true : z;
        z2 = (i & 4) != 0 ? false : z2;
        j = (i & 16) != 0 ? 0L : j;
        j.f(playableAsset, "asset");
        this.a = playableAsset;
        this.b = z;
        this.c = z2;
        this.d = false;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.PlayheadTimeProvider
    public final long getPlayheadSec() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 1;
        boolean z = this.b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.c;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.d;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        return Long.hashCode(this.e) + ((i5 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpNextUiModel(asset=");
        sb.append(this.a);
        sb.append(", neverWatched=");
        sb.append(this.b);
        sb.append(", fullyWatched=");
        sb.append(this.c);
        sb.append(", isGeoRestricted=");
        sb.append(this.d);
        sb.append(", playheadSec=");
        return com.amazon.aps.iva.c.b.b(sb, this.e, ")");
    }
}
