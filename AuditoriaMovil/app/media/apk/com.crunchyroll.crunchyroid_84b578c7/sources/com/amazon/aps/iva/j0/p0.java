package com.amazon.aps.iva.j0;

import android.view.KeyEvent;
import com.amazon.aps.iva.j0.q0;
/* compiled from: KeyMapping.kt */
/* loaded from: classes.dex */
public final class p0 implements o0 {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.n1.b, Boolean> a;

    public p0(q0.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.j0.o0
    public final n0 a(KeyEvent keyEvent) {
        boolean a;
        com.amazon.aps.iva.n1.b bVar = new com.amazon.aps.iva.n1.b(keyEvent);
        com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.n1.b, Boolean> lVar = this.a;
        if (lVar.invoke(bVar).booleanValue() && keyEvent.isShiftPressed()) {
            if (com.amazon.aps.iva.n1.a.a(com.amazon.aps.iva.n1.c.i(keyEvent), c1.g)) {
                return n0.REDO;
            }
        } else if (lVar.invoke(new com.amazon.aps.iva.n1.b(keyEvent)).booleanValue()) {
            long i = com.amazon.aps.iva.n1.c.i(keyEvent);
            if (com.amazon.aps.iva.n1.a.a(i, c1.b)) {
                a = true;
            } else {
                a = com.amazon.aps.iva.n1.a.a(i, c1.q);
            }
            if (a) {
                return n0.COPY;
            }
            if (com.amazon.aps.iva.n1.a.a(i, c1.d)) {
                return n0.PASTE;
            }
            if (com.amazon.aps.iva.n1.a.a(i, c1.f)) {
                return n0.CUT;
            }
            if (com.amazon.aps.iva.n1.a.a(i, c1.a)) {
                return n0.SELECT_ALL;
            }
            if (com.amazon.aps.iva.n1.a.a(i, c1.e)) {
                return n0.REDO;
            }
            if (com.amazon.aps.iva.n1.a.a(i, c1.g)) {
                return n0.UNDO;
            }
        } else if (!keyEvent.isCtrlPressed()) {
            if (keyEvent.isShiftPressed()) {
                long i2 = com.amazon.aps.iva.n1.c.i(keyEvent);
                if (com.amazon.aps.iva.n1.a.a(i2, c1.i)) {
                    return n0.SELECT_LEFT_CHAR;
                }
                if (com.amazon.aps.iva.n1.a.a(i2, c1.j)) {
                    return n0.SELECT_RIGHT_CHAR;
                }
                if (com.amazon.aps.iva.n1.a.a(i2, c1.k)) {
                    return n0.SELECT_UP;
                }
                if (com.amazon.aps.iva.n1.a.a(i2, c1.l)) {
                    return n0.SELECT_DOWN;
                }
                if (com.amazon.aps.iva.n1.a.a(i2, c1.m)) {
                    return n0.SELECT_PAGE_UP;
                }
                if (com.amazon.aps.iva.n1.a.a(i2, c1.n)) {
                    return n0.SELECT_PAGE_DOWN;
                }
                if (com.amazon.aps.iva.n1.a.a(i2, c1.o)) {
                    return n0.SELECT_LINE_START;
                }
                if (com.amazon.aps.iva.n1.a.a(i2, c1.p)) {
                    return n0.SELECT_LINE_END;
                }
                if (com.amazon.aps.iva.n1.a.a(i2, c1.q)) {
                    return n0.PASTE;
                }
            } else {
                long i3 = com.amazon.aps.iva.n1.c.i(keyEvent);
                if (com.amazon.aps.iva.n1.a.a(i3, c1.i)) {
                    return n0.LEFT_CHAR;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.j)) {
                    return n0.RIGHT_CHAR;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.k)) {
                    return n0.UP;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.l)) {
                    return n0.DOWN;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.m)) {
                    return n0.PAGE_UP;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.n)) {
                    return n0.PAGE_DOWN;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.o)) {
                    return n0.LINE_START;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.p)) {
                    return n0.LINE_END;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.r)) {
                    return n0.NEW_LINE;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.s)) {
                    return n0.DELETE_PREV_CHAR;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.t)) {
                    return n0.DELETE_NEXT_CHAR;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.u)) {
                    return n0.PASTE;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.v)) {
                    return n0.CUT;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.w)) {
                    return n0.COPY;
                }
                if (com.amazon.aps.iva.n1.a.a(i3, c1.x)) {
                    return n0.TAB;
                }
            }
        }
        return null;
    }
}
