package com.amazon.aps.iva.ge0;

import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.y0;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* compiled from: ErrorTypeConstructor.kt */
/* loaded from: classes4.dex */
public final class i implements c1 {
    public final j a;
    public final String[] b;
    public final String c;

    public i(j jVar, String... strArr) {
        com.amazon.aps.iva.yb0.j.f(jVar, "kind");
        com.amazon.aps.iva.yb0.j.f(strArr, "formatParams");
        this.a = jVar;
        this.b = strArr;
        String debugText = b.ERROR_TYPE.getDebugText();
        String debugMessage = jVar.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        com.amazon.aps.iva.yb0.j.e(format, "format(this, *args)");
        String format2 = String.format(debugText, Arrays.copyOf(new Object[]{format}, 1));
        com.amazon.aps.iva.yb0.j.e(format2, "format(this, *args)");
        this.c = format2;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final Collection<e0> g() {
        return z.b;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final List<y0> getParameters() {
        return z.b;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final com.amazon.aps.iva.lc0.k j() {
        com.amazon.aps.iva.lc0.d dVar = com.amazon.aps.iva.lc0.d.f;
        return com.amazon.aps.iva.lc0.d.f;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final com.amazon.aps.iva.oc0.h k() {
        k.a.getClass();
        return k.c;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final boolean l() {
        return false;
    }

    public final String toString() {
        return this.c;
    }
}
