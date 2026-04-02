package com.amazon.aps.iva.j0;
/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<Integer, Integer, Boolean, Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.i2.q h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ com.amazon.aps.iva.i2.e0 j;
    public final /* synthetic */ com.amazon.aps.iva.l0.c0 k;
    public final /* synthetic */ p2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p2 p2Var, com.amazon.aps.iva.l0.c0 c0Var, com.amazon.aps.iva.i2.q qVar, com.amazon.aps.iva.i2.e0 e0Var, boolean z) {
        super(3);
        this.h = qVar;
        this.i = z;
        this.j = e0Var;
        this.k = c0Var;
        this.l = p2Var;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Boolean invoke(Integer num, Integer num2, Boolean bool) {
        int i;
        int i2;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        boolean booleanValue = bool.booleanValue();
        com.amazon.aps.iva.i2.q qVar = this.h;
        if (!booleanValue) {
            intValue = qVar.a(intValue);
        }
        if (!booleanValue) {
            intValue2 = qVar.a(intValue2);
        }
        boolean z = false;
        if (this.i) {
            com.amazon.aps.iva.i2.e0 e0Var = this.j;
            long j = e0Var.b;
            int i3 = com.amazon.aps.iva.c2.z.c;
            if (intValue != ((int) (j >> 32)) || intValue2 != com.amazon.aps.iva.c2.z.c(j)) {
                if (intValue > intValue2) {
                    i = intValue2;
                } else {
                    i = intValue;
                }
                com.amazon.aps.iva.l0.c0 c0Var = this.k;
                if (i >= 0) {
                    if (intValue < intValue2) {
                        i2 = intValue2;
                    } else {
                        i2 = intValue;
                    }
                    com.amazon.aps.iva.c2.b bVar = e0Var.a;
                    if (i2 <= bVar.length()) {
                        if (!booleanValue && intValue != intValue2) {
                            c0Var.h();
                        } else {
                            p2 p2Var = c0Var.d;
                            if (p2Var != null) {
                                p2Var.k = false;
                            }
                            c0Var.m(i0.None);
                        }
                        this.l.r.invoke(new com.amazon.aps.iva.i2.e0(bVar, com.amazon.aps.iva.ab.x.f(intValue, intValue2), (com.amazon.aps.iva.c2.z) null));
                        z = true;
                    }
                }
                p2 p2Var2 = c0Var.d;
                if (p2Var2 != null) {
                    p2Var2.k = false;
                }
                c0Var.m(i0.None);
            }
        }
        return Boolean.valueOf(z);
    }
}
