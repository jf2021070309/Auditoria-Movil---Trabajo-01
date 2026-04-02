package com.amazon.aps.iva.a9;

import android.view.View;
import android.view.WindowId;
/* compiled from: WindowIdApi18.java */
/* loaded from: classes.dex */
public final class m0 implements n0 {
    public final WindowId a;

    public m0(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof m0) && ((m0) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
