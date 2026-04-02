package com.amazon.aps.iva.u7;

import com.amazon.aps.iva.t5.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: SsaSubtitle.java */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.q7.d {
    public final List<List<com.amazon.aps.iva.s5.a>> b;
    public final List<Long> c;

    public d(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int a(long j) {
        int i;
        Long valueOf = Long.valueOf(j);
        int i2 = g0.a;
        List<Long> list = this.c;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i = binarySearch;
        }
        if (i >= list.size()) {
            return -1;
        }
        return i;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final List<com.amazon.aps.iva.s5.a> b(long j) {
        int d = g0.d(this.c, Long.valueOf(j), false);
        if (d == -1) {
            return Collections.emptyList();
        }
        return this.b.get(d);
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
        List<Long> list = this.c;
        if (i >= list.size()) {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.t(z2);
        return list.get(i).longValue();
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int f() {
        return this.c.size();
    }
}
