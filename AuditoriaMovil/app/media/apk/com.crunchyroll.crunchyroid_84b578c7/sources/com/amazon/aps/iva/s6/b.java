package com.amazon.aps.iva.s6;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        switch (this.b) {
            case 0:
                return ((com.amazon.aps.iva.q5.v) obj2).i - ((com.amazon.aps.iva.q5.v) obj).i;
            default:
                lambda$static$0 = CrashlyticsReportPersistence.lambda$static$0((File) obj, (File) obj2);
                return lambda$static$0;
        }
    }
}
