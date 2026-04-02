package com.amazon.aps.iva.z9;

import com.amazon.aps.iva.z9.d0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements d0.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ u(d0 d0Var, int i, int i2) {
        this.a = i2;
        this.b = d0Var;
        this.c = i;
    }

    @Override // com.amazon.aps.iva.z9.d0.b
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        d0 d0Var = this.b;
        switch (i) {
            case 0:
                d0Var.u(i2);
                return;
            default:
                d0Var.n(i2);
                return;
        }
    }
}
