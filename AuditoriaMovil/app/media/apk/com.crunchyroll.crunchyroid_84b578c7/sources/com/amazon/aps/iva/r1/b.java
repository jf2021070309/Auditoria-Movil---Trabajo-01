package com.amazon.aps.iva.r1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.xb0.l;
/* compiled from: RotaryInputModifier.kt */
/* loaded from: classes.dex */
public final class b extends f.c implements a {
    public l<? super c, Boolean> o;
    public l<? super c, Boolean> p;

    public b(l<? super c, Boolean> lVar, l<? super c, Boolean> lVar2) {
        this.o = lVar;
        this.p = lVar2;
    }

    @Override // com.amazon.aps.iva.r1.a
    public final boolean Q0(c cVar) {
        l<? super c, Boolean> lVar = this.o;
        if (lVar != null) {
            return lVar.invoke(cVar).booleanValue();
        }
        return false;
    }

    @Override // com.amazon.aps.iva.r1.a
    public final boolean g1(c cVar) {
        l<? super c, Boolean> lVar = this.p;
        if (lVar != null) {
            return lVar.invoke(cVar).booleanValue();
        }
        return false;
    }
}
