package com.amazon.aps.iva.n1;

import android.view.KeyEvent;
import com.amazon.aps.iva.yb0.j;
/* compiled from: KeyEvent.kt */
/* loaded from: classes.dex */
public final class b {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (!j.a(this.a, ((b) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
