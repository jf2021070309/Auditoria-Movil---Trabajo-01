package com.amazon.aps.iva.v10;

import android.content.Intent;
import com.amazon.aps.iva.q.c0;
/* compiled from: BottomBarScreenPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<f> implements d {
    public final int b;
    public final com.amazon.aps.iva.x10.d c;
    public final g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, f fVar, com.amazon.aps.iva.x10.d dVar, g gVar) {
        super(fVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(fVar, "view");
        this.b = i;
        this.c = dVar;
        this.d = gVar;
    }

    @Override // com.amazon.aps.iva.v10.j
    public final void T(int i, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "tabText");
        if (i == this.b) {
            getView().Rb();
            if (getView().z1() <= 0) {
                getView().yh();
            } else {
                getView().R8();
            }
        } else if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 32) {
                                this.d.a(str);
                                getView().Ic();
                                return;
                            }
                            throw new IllegalArgumentException(c0.a("Unsupported bottom tab position ", i));
                        }
                        getView().Zc(null);
                        return;
                    }
                    getView().l8();
                    return;
                }
                getView().P9();
                return;
            }
            getView().ec();
        } else {
            getView().A();
        }
    }

    @Override // com.amazon.aps.iva.v10.d
    public final void a() {
        if (getView().z1() == 1) {
            getView().Rb();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        getView().v6(this.b);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        if (intent.getBooleanExtra("show_primary_screen", false)) {
            getView().Rb();
            if (getView().z1() > 0) {
                getView().R8();
            }
        }
    }
}
