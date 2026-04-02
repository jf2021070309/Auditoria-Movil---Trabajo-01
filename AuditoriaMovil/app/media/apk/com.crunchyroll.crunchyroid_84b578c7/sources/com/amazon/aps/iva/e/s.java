package com.amazon.aps.iva.e;

import android.window.OnBackInvokedCallback;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                com.amazon.aps.iva.xb0.a aVar = (com.amazon.aps.iva.xb0.a) this.b;
                com.amazon.aps.iva.yb0.j.f(aVar, "$onBackInvoked");
                aVar.invoke();
                return;
            default:
                ((com.amazon.aps.iva.k.g) this.b).S();
                return;
        }
    }
}
