package com.amazon.aps.iva.j0;

import android.view.KeyEvent;
/* compiled from: KeyMapping.android.kt */
/* loaded from: classes.dex */
public final class r0 {
    public static final a a = new a();

    /* compiled from: KeyMapping.android.kt */
    /* loaded from: classes.dex */
    public static final class a implements o0 {
        @Override // com.amazon.aps.iva.j0.o0
        public final n0 a(KeyEvent keyEvent) {
            n0 n0Var;
            if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                long i = com.amazon.aps.iva.n1.c.i(keyEvent);
                if (com.amazon.aps.iva.n1.a.a(i, c1.i)) {
                    n0Var = n0.SELECT_LINE_LEFT;
                } else if (com.amazon.aps.iva.n1.a.a(i, c1.j)) {
                    n0Var = n0.SELECT_LINE_RIGHT;
                } else if (com.amazon.aps.iva.n1.a.a(i, c1.k)) {
                    n0Var = n0.SELECT_HOME;
                } else {
                    if (com.amazon.aps.iva.n1.a.a(i, c1.l)) {
                        n0Var = n0.SELECT_END;
                    }
                    n0Var = null;
                }
            } else {
                if (keyEvent.isAltPressed()) {
                    long i2 = com.amazon.aps.iva.n1.c.i(keyEvent);
                    if (com.amazon.aps.iva.n1.a.a(i2, c1.i)) {
                        n0Var = n0.LINE_LEFT;
                    } else if (com.amazon.aps.iva.n1.a.a(i2, c1.j)) {
                        n0Var = n0.LINE_RIGHT;
                    } else if (com.amazon.aps.iva.n1.a.a(i2, c1.k)) {
                        n0Var = n0.HOME;
                    } else if (com.amazon.aps.iva.n1.a.a(i2, c1.l)) {
                        n0Var = n0.END;
                    }
                }
                n0Var = null;
            }
            if (n0Var == null) {
                return q0.a.a(keyEvent);
            }
            return n0Var;
        }
    }
}
