package com.amazon.aps.iva.k2;

import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.o0.p3;
/* compiled from: AndroidParagraphIntrinsics.android.kt */
/* loaded from: classes.dex */
public final class j {
    public final Object a;
    public Object b;
    public Object c;

    public j(r rVar) {
        this.a = rVar;
    }

    public final boolean a() {
        if (((p3) this.a).getValue() == this.c) {
            Object obj = this.b;
            if (((j) obj) == null || !((j) obj).a()) {
                return false;
            }
        }
        return true;
    }

    public j(p3 p3Var, j jVar) {
        com.amazon.aps.iva.yb0.j.f(p3Var, "resolveResult");
        this.a = p3Var;
        this.b = jVar;
        this.c = p3Var.getValue();
    }
}
