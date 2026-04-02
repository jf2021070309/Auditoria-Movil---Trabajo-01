package com.amazon.aps.iva.h2;

import com.amazon.aps.iva.d0.b2;
/* compiled from: AndroidFontResolveInterceptor.android.kt */
/* loaded from: classes.dex */
public final class d implements d0 {
    public final int b;

    public d(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.h2.d0
    public final y a(y yVar) {
        com.amazon.aps.iva.yb0.j.f(yVar, "fontWeight");
        int i = this.b;
        if (i != 0 && i != Integer.MAX_VALUE) {
            return new y(com.amazon.aps.iva.aq.j.j(yVar.b + i, 1, 1000));
        }
        return yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.b == ((d) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return b2.b(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.b, ')');
    }
}
