package com.amazon.aps.iva.s6;

import androidx.media3.ui.e;
import com.amazon.aps.iva.s6.g;
import java.util.Comparator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return g.h.c((g.h) obj, (g.h) obj2);
            default:
                e.b bVar = (e.b) obj;
                e.b bVar2 = (e.b) obj2;
                int compare = Integer.compare(bVar2.b, bVar.b);
                if (compare == 0) {
                    int compareTo = bVar.c.compareTo(bVar2.c);
                    if (compareTo == 0) {
                        return bVar.d.compareTo(bVar2.d);
                    }
                    return compareTo;
                }
                return compare;
        }
    }
}
