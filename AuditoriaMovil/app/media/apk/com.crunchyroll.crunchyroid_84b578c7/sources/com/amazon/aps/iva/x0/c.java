package com.amazon.aps.iva.x0;

import com.amazon.aps.iva.o0.p3;
/* compiled from: RememberSaveable.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Object> {
    public final /* synthetic */ p3<l<Object, Object>> h;
    public final /* synthetic */ p3<Object> i;
    public final /* synthetic */ i j;

    /* compiled from: RememberSaveable.kt */
    /* loaded from: classes.dex */
    public static final class a implements o {
        public final /* synthetic */ i a;

        public a(i iVar) {
            this.a = iVar;
        }

        @Override // com.amazon.aps.iva.x0.o
        public final boolean a(Object obj) {
            return this.a.a(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p3<? extends l<Object, Object>> p3Var, p3<Object> p3Var2, i iVar) {
        super(0);
        this.h = p3Var;
        this.i = p3Var2;
        this.j = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Object invoke() {
        return this.h.getValue().a(new a(this.j), this.i.getValue());
    }
}
