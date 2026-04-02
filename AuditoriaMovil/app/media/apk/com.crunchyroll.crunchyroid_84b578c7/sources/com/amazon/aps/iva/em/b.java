package com.amazon.aps.iva.em;

import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProfilesData.kt */
/* loaded from: classes2.dex */
public final class b {
    public final int a;
    public final List<a> b;

    public b(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && j.a(this.b, bVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProfilesData(maxProfilesCount=" + this.a + ", profiles=" + this.b + ")";
    }
}
