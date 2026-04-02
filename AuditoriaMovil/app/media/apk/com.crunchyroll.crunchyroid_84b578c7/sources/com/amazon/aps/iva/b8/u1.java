package com.amazon.aps.iva.b8;

import android.os.Handler;
/* compiled from: PlayerWrapper.java */
/* loaded from: classes.dex */
public final class u1 extends com.amazon.aps.iva.n5.h {
    public final /* synthetic */ Handler f;
    public final /* synthetic */ v1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v1 v1Var, int i, int i2, int i3, String str, Handler handler) {
        super(i, i2, str, i3);
        this.g = v1Var;
        this.f = handler;
    }

    @Override // com.amazon.aps.iva.n5.h
    public final void b(int i) {
        com.amazon.aps.iva.t5.g0.U(this.f, new s1(this, i, 1));
    }

    @Override // com.amazon.aps.iva.n5.h
    public final void c(final int i) {
        com.amazon.aps.iva.t5.g0.U(this.f, new Runnable() { // from class: com.amazon.aps.iva.b8.t1
            @Override // java.lang.Runnable
            public final void run() {
                v1 v1Var = u1.this.g;
                if (v1Var.V(25) || v1Var.V(33)) {
                    boolean V = v1Var.V(33);
                    int i2 = i;
                    if (V) {
                        v1Var.w0(i2, r3);
                    } else {
                        v1Var.S0(i2);
                    }
                }
            }
        });
    }
}
