package com.amazon.aps.iva.s1;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.s1.x;
import java.util.LinkedHashMap;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class c1 implements com.amazon.aps.iva.o0.u0 {
    public final /* synthetic */ p3 a;

    public c1(p3 p3Var) {
        this.a = p3Var;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        x a = ((e1) this.a.getValue()).a();
        androidx.compose.ui.node.e eVar = a.a;
        eVar.m = true;
        LinkedHashMap linkedHashMap = a.e;
        for (x.b bVar : linkedHashMap.values()) {
            com.amazon.aps.iva.o0.f0 f0Var = bVar.c;
            if (f0Var != null) {
                f0Var.dispose();
            }
        }
        eVar.O();
        eVar.m = false;
        linkedHashMap.clear();
        a.f.clear();
        a.m = 0;
        a.l = 0;
        a.j.clear();
        a.b();
    }
}
