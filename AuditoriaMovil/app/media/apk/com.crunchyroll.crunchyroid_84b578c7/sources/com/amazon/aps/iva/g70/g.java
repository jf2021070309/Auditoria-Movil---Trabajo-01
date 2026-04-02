package com.amazon.aps.iva.g70;

import java.io.Serializable;
/* compiled from: MaterialAlertDialogFragment.kt */
/* loaded from: classes2.dex */
public final class g implements Serializable {
    public final int b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final Serializable f;
    public final CharSequence g;

    public g() {
        this(0, null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.b == gVar.b && com.amazon.aps.iva.yb0.j.a(this.c, gVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, gVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, gVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, gVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, gVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = Integer.hashCode(this.b) * 31;
        int i = 0;
        CharSequence charSequence = this.c;
        if (charSequence == null) {
            hashCode = 0;
        } else {
            hashCode = charSequence.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        CharSequence charSequence2 = this.d;
        if (charSequence2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = charSequence2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        CharSequence charSequence3 = this.e;
        if (charSequence3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = charSequence3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Serializable serializable = this.f;
        if (serializable == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = serializable.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        CharSequence charSequence4 = this.g;
        if (charSequence4 != null) {
            i = charSequence4.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "MaterialAlertDialogFragmentInput(overrideThemeResId=" + this.b + ", titleText=" + ((Object) this.c) + ", messageText=" + ((Object) this.d) + ", positiveButtonText=" + ((Object) this.e) + ", positiveButtonResult=" + this.f + ", negativeButtonText=" + ((Object) this.g) + ")";
    }

    public g(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Serializable serializable, CharSequence charSequence4) {
        this.b = i;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = serializable;
        this.g = charSequence4;
    }

    public /* synthetic */ g(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Serializable serializable, CharSequence charSequence4, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : charSequence, (i2 & 4) != 0 ? null : charSequence2, (i2 & 8) != 0 ? null : charSequence3, (i2 & 16) != 0 ? null : serializable, (i2 & 32) != 0 ? null : charSequence4);
    }
}
