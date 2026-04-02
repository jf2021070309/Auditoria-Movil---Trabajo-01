package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.j0.d1;
/* compiled from: SelectionAdjustment.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class l extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.c2.z> {
    public l(com.amazon.aps.iva.c2.b bVar) {
        super(1, bVar, d1.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.c2.z invoke(Integer num) {
        int intValue = num.intValue();
        CharSequence charSequence = (CharSequence) this.receiver;
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        int i = intValue - 1;
        while (true) {
            if (i > 0) {
                int i2 = i - 1;
                if (charSequence.charAt(i2) == '\n') {
                    break;
                }
                i = i2;
            } else {
                i = 0;
                break;
            }
        }
        return new com.amazon.aps.iva.c2.z(com.amazon.aps.iva.ab.x.f(i, d1.d(intValue, charSequence)));
    }
}
