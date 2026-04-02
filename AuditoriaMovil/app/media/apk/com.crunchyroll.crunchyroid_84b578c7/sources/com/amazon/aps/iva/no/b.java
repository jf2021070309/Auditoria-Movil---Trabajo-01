package com.amazon.aps.iva.no;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.playback.model.SkipEvents;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayheadTimeProvider;
/* compiled from: WatchScreenUpNextUiModel.kt */
/* loaded from: classes2.dex */
public final class b implements PlayheadTimeProvider {
    public final PlayableAsset a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final SkipEvents f;

    static {
        int i = SkipEvents.$stable;
        int i2 = PlayableAsset.$stable;
    }

    public b(PlayableAsset playableAsset, boolean z, boolean z2, boolean z3, long j, SkipEvents skipEvents, int i) {
        z = (i & 2) != 0 ? true : z;
        z2 = (i & 4) != 0 ? false : z2;
        z3 = (i & 8) != 0 ? false : z3;
        j = (i & 16) != 0 ? 0L : j;
        skipEvents = (i & 32) != 0 ? null : skipEvents;
        j.f(playableAsset, "asset");
        this.a = playableAsset;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j;
        this.f = skipEvents;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && j.a(this.f, bVar.f)) {
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
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 1;
        boolean z = this.b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
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
        int a = i.a(this.e, (i5 + i) * 31, 31);
        SkipEvents skipEvents = this.f;
        if (skipEvents == null) {
            hashCode = 0;
        } else {
            hashCode = skipEvents.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        return "WatchScreenUpNextUiModel(asset=" + this.a + ", neverWatched=" + this.b + ", fullyWatched=" + this.c + ", isGeoRestricted=" + this.d + ", playheadSec=" + this.e + ", skipEvents=" + this.f + ")";
    }
}
