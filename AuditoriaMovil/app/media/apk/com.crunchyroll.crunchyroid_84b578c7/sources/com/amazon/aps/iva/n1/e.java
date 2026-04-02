package com.amazon.aps.iva.n1;

import android.view.KeyEvent;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: KeyInputModifier.kt */
/* loaded from: classes.dex */
public final class e extends f.c implements d {
    public l<? super b, Boolean> o;
    public l<? super b, Boolean> p;

    public e(l<? super b, Boolean> lVar, l<? super b, Boolean> lVar2) {
        this.o = lVar;
        this.p = lVar2;
    }

    @Override // com.amazon.aps.iva.n1.d
    public final boolean D0(KeyEvent keyEvent) {
        j.f(keyEvent, "event");
        l<? super b, Boolean> lVar = this.o;
        if (lVar != null) {
            return lVar.invoke(new b(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // com.amazon.aps.iva.n1.d
    public final boolean s0(KeyEvent keyEvent) {
        j.f(keyEvent, "event");
        l<? super b, Boolean> lVar = this.p;
        if (lVar != null) {
            return lVar.invoke(new b(keyEvent)).booleanValue();
        }
        return false;
    }
}
