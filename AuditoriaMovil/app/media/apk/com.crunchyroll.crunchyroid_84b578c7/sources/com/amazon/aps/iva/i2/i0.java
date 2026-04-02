package com.amazon.aps.iva.i2;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: TextInputServiceAndroid.android.kt */
/* loaded from: classes.dex */
public final class i0 implements m {
    public final /* synthetic */ g0 a;

    public i0(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // com.amazon.aps.iva.i2.m
    public final void a(KeyEvent keyEvent) {
        com.amazon.aps.iva.yb0.j.f(keyEvent, "event");
        ((BaseInputConnection) this.a.j.getValue()).sendKeyEvent(keyEvent);
    }

    @Override // com.amazon.aps.iva.i2.m
    public final void b(ArrayList arrayList) {
        this.a.e.invoke(arrayList);
    }

    @Override // com.amazon.aps.iva.i2.m
    public final void c(a0 a0Var) {
        com.amazon.aps.iva.yb0.j.f(a0Var, "ic");
        g0 g0Var = this.a;
        int size = g0Var.i.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = g0Var.i;
            if (com.amazon.aps.iva.yb0.j.a(((WeakReference) arrayList.get(i)).get(), a0Var)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.i2.m
    public final void d(int i) {
        this.a.f.invoke(new k(i));
    }
}
