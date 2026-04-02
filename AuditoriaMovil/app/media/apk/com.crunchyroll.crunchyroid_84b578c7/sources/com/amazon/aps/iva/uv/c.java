package com.amazon.aps.iva.uv;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: BulkDownloadAvailabilityProvider.kt */
/* loaded from: classes2.dex */
public final class c {
    public final PlayableAsset a;
    public final String b;

    static {
        int i = PlayableAsset.$stable;
    }

    public c(PlayableAsset playableAsset, String str) {
        j.f(playableAsset, "issuedAsset");
        this.a = playableAsset;
        this.b = str;
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
        return "BulkDownloadAvailabilityStatus(issuedAsset=" + this.a + ", status=" + this.b + ")";
    }
}
