package com.amazon.aps.iva.c2;
/* compiled from: AndroidTextStyle.android.kt */
/* loaded from: classes.dex */
public final class q {
    public static final q c = new q();
    public final boolean a;
    public final int b;

    public q(boolean z) {
        this.a = z;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.a != qVar.a) {
            return false;
        }
        if (this.b == qVar.b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) e.a(this.b)) + ')';
    }

    public q(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public q() {
        this(true, 0);
    }
}
