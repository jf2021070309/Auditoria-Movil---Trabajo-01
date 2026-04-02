package com.amazon.aps.iva.s6;

import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.t6.n;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Comparator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ p(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return g.h.f((g.h) obj, (g.h) obj2);
            case 1:
                return ((n.a) obj).a - ((n.a) obj2).a;
            default:
                return SessionReportingCoordinator.b((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
        }
    }
}
