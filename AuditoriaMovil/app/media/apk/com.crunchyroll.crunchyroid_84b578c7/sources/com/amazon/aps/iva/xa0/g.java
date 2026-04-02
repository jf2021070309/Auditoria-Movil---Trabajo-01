package com.amazon.aps.iva.xa0;
/* compiled from: Insetter.kt */
/* loaded from: classes4.dex */
public final class g {
    public int a;
    public int b;
    public int c;
    public int d;

    public final g a(int i) {
        boolean z;
        if ((this.a | this.b | this.c | this.d) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this;
        }
        if (i == 0) {
            return this;
        }
        g gVar = new g();
        int i2 = this.a;
        int i3 = ~i;
        gVar.a = i2 & i3;
        gVar.b = this.b & i3;
        gVar.c = this.c & i3;
        gVar.d = i3 & this.d;
        return gVar;
    }

    public final void b(int i, int i2) {
        if ((i2 & 1) != 0) {
            this.a |= i;
        }
        if ((i2 & 2) != 0) {
            this.b |= i;
        }
        if ((i2 & 4) != 0) {
            this.c |= i;
        }
        if ((i2 & 8) != 0) {
            this.d = i | this.d;
        }
    }
}
