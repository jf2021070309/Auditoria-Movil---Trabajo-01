package com.amazon.aps.iva.p4;

import com.amazon.aps.iva.lb0.x;
import java.util.ArrayList;
/* compiled from: Emittables.kt */
/* loaded from: classes.dex */
public abstract class l implements i {
    public int a;
    public final boolean b;
    public final ArrayList c;

    public l() {
        this(0, 3, false);
    }

    public final String c() {
        return com.amazon.aps.iva.oe0.i.S(x.B0(this.c, ",\n", null, null, null, 62), "  ");
    }

    public l(int i, int i2, boolean z) {
        i = (i2 & 1) != 0 ? Integer.MAX_VALUE : i;
        z = (i2 & 2) != 0 ? false : z;
        this.a = i;
        this.b = z;
        this.c = new ArrayList();
    }
}
