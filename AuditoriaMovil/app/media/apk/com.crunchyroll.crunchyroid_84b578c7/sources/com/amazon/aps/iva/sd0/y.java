package com.amazon.aps.iva.sd0;

import com.amazon.aps.iva.ee0.e0;
import java.util.List;
/* compiled from: constantValues.kt */
/* loaded from: classes4.dex */
public final class y extends b {
    public final e0 c;

    /* compiled from: constantValues.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.c0, e0> {
        public final /* synthetic */ e0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var) {
            super(1);
            this.h = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final e0 invoke(com.amazon.aps.iva.oc0.c0 c0Var) {
            com.amazon.aps.iva.yb0.j.f(c0Var, "it");
            return this.h;
        }
    }

    public y(List<? extends g<?>> list, e0 e0Var) {
        super(list, new a(e0Var));
        this.c = e0Var;
    }
}
