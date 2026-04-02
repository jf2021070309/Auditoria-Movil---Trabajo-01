package com.amazon.aps.iva.ia0;

import com.amazon.aps.iva.ka0.a0;
import java.util.Date;
/* loaded from: classes4.dex */
public final class a {
    public final long a;
    public final long b;
    public final boolean c;

    public a() {
        boolean z;
        if (a0.r != null) {
            this.a = new Date().getTime();
            this.b = a0.r.c();
            z = true;
        } else {
            z = false;
        }
        this.c = z;
    }

    public final long a() {
        if (this.c) {
            return (a0.r.c() - this.b) + this.a;
        }
        return new Date().getTime();
    }
}
