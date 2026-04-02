package com.amazon.aps.iva.u1;

import androidx.media3.ui.e;
import bo.app.d6;
import bo.app.q2;
import com.amazon.aps.iva.s6.g;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ y(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a;
        boolean z = false;
        switch (this.b) {
            case 0:
                androidx.compose.ui.node.e eVar = (androidx.compose.ui.node.e) obj;
                androidx.compose.ui.node.e eVar2 = (androidx.compose.ui.node.e) obj2;
                float f = eVar.A.n.x;
                float f2 = eVar2.A.n.x;
                if (f == f2) {
                    z = true;
                }
                if (z) {
                    return com.amazon.aps.iva.yb0.j.h(eVar.w(), eVar2.w());
                }
                return Float.compare(f, f2);
            case 1:
                return ((g.f) ((List) obj).get(0)).compareTo((g.f) ((List) obj2).get(0));
            case 2:
            default:
                return CrashlyticsReportPersistence.c((File) obj, (File) obj2);
            case 3:
                return Long.compare(((com.amazon.aps.iva.y7.e) obj).b, ((com.amazon.aps.iva.y7.e) obj2).b);
            case 4:
                e.b bVar = (e.b) obj;
                e.b bVar2 = (e.b) obj2;
                int compare = Integer.compare(bVar2.a, bVar.a);
                if (compare == 0) {
                    int compareTo = bVar2.c.compareTo(bVar.c);
                    if (compareTo == 0) {
                        return bVar2.d.compareTo(bVar.d);
                    }
                    return compareTo;
                }
                return compare;
            case 5:
                a = d6.a((q2) obj, (q2) obj2);
                return a;
            case 6:
                return ((Double) obj).compareTo((Double) obj2);
        }
    }
}
