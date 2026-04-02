package com.amazon.aps.iva.m6;

import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.t5.g0;
import java.util.Comparator;
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
                long j = ((c) obj).c;
                long j2 = ((c) obj2).c;
                int i = g0.a;
                int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (i2 < 0) {
                    return -1;
                }
                if (i2 == 0) {
                    return 0;
                }
                return 1;
            default:
                return g.h.c((g.h) obj, (g.h) obj2);
        }
    }
}
