package com.amazon.aps.iva.ol;

import com.amazon.aps.iva.qj.l;
import java.util.List;
/* compiled from: PlayerAudioSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class k {
    public final List<l> a;
    public final String b;

    public k(List<l> list, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "currentVersionId");
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, kVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, kVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VersionsData(versions=" + this.a + ", currentVersionId=" + this.b + ")";
    }
}
