package com.amazon.aps.iva.w4;

import android.content.res.ColorStateList;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CompoundButtonTranslator.kt */
/* loaded from: classes.dex */
public final class b {
    public final ColorStateList a;
    public final ColorStateList b;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2) {
        this.a = colorStateList;
        this.b = colorStateList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DayNightColorStateList(day=" + this.a + ", night=" + this.b + ')';
    }
}
