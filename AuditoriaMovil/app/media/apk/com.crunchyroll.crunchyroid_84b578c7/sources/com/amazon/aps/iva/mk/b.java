package com.amazon.aps.iva.mk;

import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.yb0.j;
/* compiled from: MuxConfig.kt */
/* loaded from: classes.dex */
public final class b {
    public final String a;

    public b() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && j.a(this.a, ((b) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return t1.b(new StringBuilder("MuxCustomData(transportLayer="), this.a, ')');
    }

    public b(String str) {
        this.a = str;
    }
}
