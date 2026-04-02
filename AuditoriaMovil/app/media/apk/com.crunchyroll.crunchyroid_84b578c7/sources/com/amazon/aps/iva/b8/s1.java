package com.amazon.aps.iva.b8;

import com.braze.ui.contentcards.adapters.ContentCardAdapter;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s1(int i, int i2, ContentCardAdapter contentCardAdapter) {
        this.c = i;
        this.d = i2;
        this.e = contentCardAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = this.d;
        int i3 = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                v1 v1Var = ((u1) obj).g;
                if (v1Var.V(26) || v1Var.V(34)) {
                    if (i3 != -100) {
                        if (i3 != -1) {
                            if (i3 != 1) {
                                if (i3 != 100) {
                                    if (i3 != 101) {
                                        com.amazon.aps.iva.t5.p.g();
                                        return;
                                    } else if (v1Var.V(34)) {
                                        v1Var.x(i2, !v1Var.e1());
                                        return;
                                    } else {
                                        v1Var.X(!v1Var.e1());
                                        return;
                                    }
                                } else if (v1Var.V(34)) {
                                    v1Var.x(i2, false);
                                    return;
                                } else {
                                    v1Var.X(false);
                                    return;
                                }
                            } else if (v1Var.V(34)) {
                                v1Var.A(i2);
                                return;
                            } else {
                                v1Var.d0();
                                return;
                            }
                        } else if (v1Var.V(34)) {
                            v1Var.P(i2);
                            return;
                        } else {
                            v1Var.y();
                            return;
                        }
                    } else if (v1Var.V(34)) {
                        v1Var.x(i2, true);
                        return;
                    } else {
                        v1Var.X(true);
                        return;
                    }
                }
                return;
            default:
                ContentCardAdapter.e(i3, i2, (ContentCardAdapter) obj);
                return;
        }
    }

    public /* synthetic */ s1(u1 u1Var, int i, int i2) {
        this.e = u1Var;
        this.c = i;
        this.d = i2;
    }
}
