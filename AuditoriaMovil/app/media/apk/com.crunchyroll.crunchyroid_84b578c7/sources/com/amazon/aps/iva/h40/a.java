package com.amazon.aps.iva.h40;

import com.amazon.aps.iva.fz.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: NotificationSetting.kt */
/* loaded from: classes2.dex */
public final class a {
    public final l a;
    public final boolean b;

    public a(l lVar, boolean z) {
        j.f(lVar, "type");
        this.a = lVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.b == aVar.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "NotificationSetting(type=" + this.a + ", isEnabled=" + this.b + ")";
    }
}
