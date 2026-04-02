package com.amazon.aps.iva.d2;

import com.amazon.aps.iva.m6.i;
import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.y7.f;
import com.google.common.collect.ComparisonChain;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ k(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) obj;
                com.amazon.aps.iva.kb0.j jVar2 = (com.amazon.aps.iva.kb0.j) obj2;
                return (((Number) jVar.c).intValue() - ((Number) jVar.b).intValue()) - (((Number) jVar2.c).intValue() - ((Number) jVar2.b).intValue());
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                int i2 = i.b.m;
                long j = ((com.amazon.aps.iva.m6.c) obj).c;
                long j2 = ((com.amazon.aps.iva.m6.c) obj2).c;
                int i3 = com.amazon.aps.iva.t5.g0.a;
                int i4 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (i4 < 0) {
                    return -1;
                }
                if (i4 != 0) {
                    return 1;
                }
                return 0;
            case 3:
                List list = (List) obj;
                List list2 = (List) obj2;
                return ComparisonChain.start().compare((g.h) Collections.max(list, new com.amazon.aps.iva.s6.d(1)), (g.h) Collections.max(list2, new com.amazon.aps.iva.s6.p(0)), new com.amazon.aps.iva.m6.j(2)).compare(list.size(), list2.size()).compare((g.h) Collections.max(list, new com.amazon.aps.iva.m6.k(1)), (g.h) Collections.max(list2, new k(4)), new com.amazon.aps.iva.s6.q(0)).result();
            case 4:
                return g.h.c((g.h) obj, (g.h) obj2);
            default:
                return Integer.compare(((f.a) obj).a.b, ((f.a) obj2).a.b);
        }
    }
}
