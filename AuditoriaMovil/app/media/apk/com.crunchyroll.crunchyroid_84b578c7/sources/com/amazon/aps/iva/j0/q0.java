package com.amazon.aps.iva.j0;

import android.view.KeyEvent;
/* compiled from: KeyMapping.kt */
/* loaded from: classes.dex */
public final class q0 {
    public static final b a;

    /* compiled from: KeyMapping.kt */
    /* loaded from: classes.dex */
    public static final class b implements o0 {
        public final /* synthetic */ o0 a;

        public b(p0 p0Var) {
            this.a = p0Var;
        }

        @Override // com.amazon.aps.iva.j0.o0
        public final n0 a(KeyEvent keyEvent) {
            n0 n0Var;
            if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                long i = com.amazon.aps.iva.n1.c.i(keyEvent);
                if (com.amazon.aps.iva.n1.a.a(i, c1.i)) {
                    n0Var = n0.SELECT_LEFT_WORD;
                } else if (com.amazon.aps.iva.n1.a.a(i, c1.j)) {
                    n0Var = n0.SELECT_RIGHT_WORD;
                } else if (com.amazon.aps.iva.n1.a.a(i, c1.k)) {
                    n0Var = n0.SELECT_PREV_PARAGRAPH;
                } else {
                    if (com.amazon.aps.iva.n1.a.a(i, c1.l)) {
                        n0Var = n0.SELECT_NEXT_PARAGRAPH;
                    }
                    n0Var = null;
                }
            } else if (keyEvent.isCtrlPressed()) {
                long i2 = com.amazon.aps.iva.n1.c.i(keyEvent);
                if (com.amazon.aps.iva.n1.a.a(i2, c1.i)) {
                    n0Var = n0.LEFT_WORD;
                } else if (com.amazon.aps.iva.n1.a.a(i2, c1.j)) {
                    n0Var = n0.RIGHT_WORD;
                } else if (com.amazon.aps.iva.n1.a.a(i2, c1.k)) {
                    n0Var = n0.PREV_PARAGRAPH;
                } else if (com.amazon.aps.iva.n1.a.a(i2, c1.l)) {
                    n0Var = n0.NEXT_PARAGRAPH;
                } else if (com.amazon.aps.iva.n1.a.a(i2, c1.c)) {
                    n0Var = n0.DELETE_PREV_CHAR;
                } else if (com.amazon.aps.iva.n1.a.a(i2, c1.t)) {
                    n0Var = n0.DELETE_NEXT_WORD;
                } else if (com.amazon.aps.iva.n1.a.a(i2, c1.s)) {
                    n0Var = n0.DELETE_PREV_WORD;
                } else {
                    if (com.amazon.aps.iva.n1.a.a(i2, c1.h)) {
                        n0Var = n0.DESELECT;
                    }
                    n0Var = null;
                }
            } else if (keyEvent.isShiftPressed()) {
                long i3 = com.amazon.aps.iva.n1.c.i(keyEvent);
                if (com.amazon.aps.iva.n1.a.a(i3, c1.o)) {
                    n0Var = n0.SELECT_LINE_LEFT;
                } else {
                    if (com.amazon.aps.iva.n1.a.a(i3, c1.p)) {
                        n0Var = n0.SELECT_LINE_RIGHT;
                    }
                    n0Var = null;
                }
            } else {
                if (keyEvent.isAltPressed()) {
                    long i4 = com.amazon.aps.iva.n1.c.i(keyEvent);
                    if (com.amazon.aps.iva.n1.a.a(i4, c1.s)) {
                        n0Var = n0.DELETE_FROM_LINE_START;
                    } else if (com.amazon.aps.iva.n1.a.a(i4, c1.t)) {
                        n0Var = n0.DELETE_TO_LINE_END;
                    }
                }
                n0Var = null;
            }
            if (n0Var == null) {
                return this.a.a(keyEvent);
            }
            return n0Var;
        }
    }

    static {
        a aVar = new com.amazon.aps.iva.yb0.v() { // from class: com.amazon.aps.iva.j0.q0.a
            @Override // com.amazon.aps.iva.yb0.v, com.amazon.aps.iva.fc0.n
            public final Object get(Object obj) {
                KeyEvent keyEvent = ((com.amazon.aps.iva.n1.b) obj).a;
                com.amazon.aps.iva.yb0.j.f(keyEvent, "$this$isCtrlPressed");
                return Boolean.valueOf(keyEvent.isCtrlPressed());
            }
        };
        com.amazon.aps.iva.yb0.j.f(aVar, "shortcutModifier");
        a = new b(new p0(aVar));
    }
}
