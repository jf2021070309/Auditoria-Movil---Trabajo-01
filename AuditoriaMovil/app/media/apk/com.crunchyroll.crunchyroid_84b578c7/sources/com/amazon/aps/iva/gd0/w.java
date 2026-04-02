package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.md0.d;
import com.amazon.aps.iva.o0.t1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: MemberSignature.kt */
/* loaded from: classes4.dex */
public final class w {
    public final String a;

    /* compiled from: MemberSignature.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static w a(com.amazon.aps.iva.md0.d dVar) {
            if (dVar instanceof d.b) {
                String c = dVar.c();
                String b = dVar.b();
                com.amazon.aps.iva.yb0.j.f(c, AppMeasurementSdk.ConditionalUserProperty.NAME);
                com.amazon.aps.iva.yb0.j.f(b, "desc");
                return new w(c.concat(b));
            } else if (dVar instanceof d.a) {
                String c2 = dVar.c();
                String b2 = dVar.b();
                com.amazon.aps.iva.yb0.j.f(c2, AppMeasurementSdk.ConditionalUserProperty.NAME);
                com.amazon.aps.iva.yb0.j.f(b2, "desc");
                return new w(c2 + '#' + b2);
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
        }
    }

    public w(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w) && com.amazon.aps.iva.yb0.j.a(this.a, ((w) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return t1.b(new StringBuilder("MemberSignature(signature="), this.a, ')');
    }
}
