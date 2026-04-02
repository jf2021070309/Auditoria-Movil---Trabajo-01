package com.amazon.aps.iva.e;

import android.window.BackEvent;
import com.amazon.aps.iva.d0.b2;
/* compiled from: BackEventCompat.kt */
/* loaded from: classes.dex */
public final class b {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public b(BackEvent backEvent) {
        com.amazon.aps.iva.yb0.j.f(backEvent, "backEvent");
        a aVar = a.a;
        float d = aVar.d(backEvent);
        float e = aVar.e(backEvent);
        float b = aVar.b(backEvent);
        int c = aVar.c(backEvent);
        this.a = d;
        this.b = e;
        this.c = b;
        this.d = c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return b2.b(sb, this.d, '}');
    }
}
