package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class j {
    public static final com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.v0.b.c(671295101, a.h, false);

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, ? extends com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(3);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, ? extends com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            int i;
            com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, ? extends com.amazon.aps.iva.kb0.q> pVar2 = pVar;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            int intValue = num.intValue();
            com.amazon.aps.iva.yb0.j.f(pVar2, "innerTextField");
            if ((intValue & 14) == 0) {
                if (iVar2.v(pVar2)) {
                    i = 4;
                } else {
                    i = 2;
                }
                intValue |= i;
            }
            if ((intValue & 91) == 18 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                pVar2.invoke(iVar2, Integer.valueOf(intValue & 14));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }
}
