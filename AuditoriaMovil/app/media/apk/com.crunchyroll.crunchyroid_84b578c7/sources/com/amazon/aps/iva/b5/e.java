package com.amazon.aps.iva.b5;

import com.amazon.aps.iva.d0.b2;
/* compiled from: ColorProvider.kt */
/* loaded from: classes.dex */
public final class e implements a {
    public final int a;

    public e(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && this.a == ((e) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b2.b(new StringBuilder("ResourceColorProvider(resId="), this.a, ')');
    }
}
