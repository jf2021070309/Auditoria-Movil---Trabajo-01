package com.amazon.aps.iva.y7;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.u1.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: WebvttSubtitle.java */
/* loaded from: classes.dex */
public final class i implements com.amazon.aps.iva.q7.d {
    public final List<e> b;
    public final long[] c;
    public final long[] d;

    public i(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            e eVar = (e) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.c;
            jArr[i2] = eVar.b;
            jArr[i2 + 1] = eVar.c;
        }
        long[] jArr2 = this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int a(long j) {
        long[] jArr = this.d;
        int b = g0.b(jArr, j, false);
        if (b >= jArr.length) {
            return -1;
        }
        return b;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final List<com.amazon.aps.iva.s5.a> b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List<e> list = this.b;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.c;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                e eVar = list.get(i);
                com.amazon.aps.iva.s5.a aVar = eVar.a;
                if (aVar.f == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(aVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new y(3));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            com.amazon.aps.iva.s5.a aVar2 = ((e) arrayList2.get(i3)).a;
            aVar2.getClass();
            arrayList.add(new com.amazon.aps.iva.s5.a(aVar2.b, aVar2.c, aVar2.d, aVar2.e, (-1) - i3, 1, aVar2.h, aVar2.i, aVar2.j, aVar2.o, aVar2.p, aVar2.k, aVar2.l, aVar2.m, aVar2.n, aVar2.q, aVar2.r));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final long c(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        long[] jArr = this.d;
        if (i >= jArr.length) {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.t(z2);
        return jArr[i];
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int f() {
        return this.d.length;
    }
}
