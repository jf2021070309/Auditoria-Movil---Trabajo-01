package com.amazon.aps.iva.j0;

import android.view.InputDevice;
import android.view.KeyEvent;
/* compiled from: TextFieldFocusModifier.android.kt */
/* loaded from: classes.dex */
public final class o1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.n1.b, Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.d1.j h;
    public final /* synthetic */ p2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.amazon.aps.iva.d1.j jVar, p2 p2Var) {
        super(1);
        this.h = jVar;
        this.i = p2Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(com.amazon.aps.iva.n1.b bVar) {
        boolean z;
        KeyEvent keyEvent = bVar.a;
        com.amazon.aps.iva.yb0.j.f(keyEvent, "keyEvent");
        InputDevice device = keyEvent.getDevice();
        boolean z2 = false;
        if (device != null && device.supportsSource(513) && !device.isVirtual()) {
            if (com.amazon.aps.iva.n1.c.j(keyEvent) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                boolean i = com.amazon.aps.iva.ab.t.i(19, keyEvent);
                com.amazon.aps.iva.d1.j jVar = this.h;
                if (i) {
                    z2 = jVar.g(5);
                } else if (com.amazon.aps.iva.ab.t.i(20, keyEvent)) {
                    z2 = jVar.g(6);
                } else if (com.amazon.aps.iva.ab.t.i(21, keyEvent)) {
                    z2 = jVar.g(3);
                } else if (com.amazon.aps.iva.ab.t.i(22, keyEvent)) {
                    z2 = jVar.g(4);
                } else if (com.amazon.aps.iva.ab.t.i(23, keyEvent)) {
                    com.amazon.aps.iva.i2.n0 n0Var = this.i.d;
                    if (n0Var != null && n0Var.a()) {
                        n0Var.b.e();
                    }
                    z2 = true;
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
