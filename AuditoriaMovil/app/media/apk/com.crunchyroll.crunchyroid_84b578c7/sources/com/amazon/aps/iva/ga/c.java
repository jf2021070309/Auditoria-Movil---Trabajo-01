package com.amazon.aps.iva.ga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: AnimatableGradientColorValue.java */
/* loaded from: classes.dex */
public final class c extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList arrayList) {
        super(arrayList, 0);
        for (int i = 0; i < arrayList.size(); i++) {
            com.amazon.aps.iva.na.a aVar = (com.amazon.aps.iva.na.a) arrayList.get(i);
            com.amazon.aps.iva.ha.c cVar = (com.amazon.aps.iva.ha.c) aVar.b;
            com.amazon.aps.iva.ha.c cVar2 = (com.amazon.aps.iva.ha.c) aVar.c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.a;
                int length = fArr.length;
                float[] fArr2 = cVar2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i2 = 0;
                    for (int i3 = 0; i3 < length2; i3++) {
                        float f2 = fArr3[i3];
                        if (f2 != f) {
                            fArr3[i2] = f2;
                            i2++;
                            f = fArr3[i3];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i2);
                    aVar = new com.amazon.aps.iva.na.a(cVar.a(copyOfRange), cVar2.a(copyOfRange));
                }
            }
            arrayList.set(i, aVar);
        }
    }

    @Override // com.amazon.aps.iva.ga.l
    public final com.amazon.aps.iva.ca.a<com.amazon.aps.iva.ha.c, com.amazon.aps.iva.ha.c> d() {
        return new com.amazon.aps.iva.ca.e((List) this.c);
    }
}
