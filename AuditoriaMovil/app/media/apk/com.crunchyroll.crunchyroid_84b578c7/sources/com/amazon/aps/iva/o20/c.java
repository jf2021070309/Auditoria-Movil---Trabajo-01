package com.amazon.aps.iva.o20;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaTrack;
/* compiled from: TierPerkUiModel.kt */
/* loaded from: classes2.dex */
public final class c {
    public final boolean a;
    public final String b;

    public c(String str, boolean z) {
        j.f(str, MediaTrack.ROLE_DESCRIPTION);
        this.a = z;
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
        if (this.a == cVar.a && j.a(this.b, cVar.b)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.b.hashCode() + (r0 * 31);
    }

    public final String toString() {
        return "TierPerkUiModel(available=" + this.a + ", description=" + this.b + ")";
    }
}
