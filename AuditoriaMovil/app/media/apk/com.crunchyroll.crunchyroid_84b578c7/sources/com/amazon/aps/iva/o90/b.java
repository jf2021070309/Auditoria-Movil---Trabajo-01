package com.amazon.aps.iva.o90;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean lambda$static$1;
        lambda$static$1 = CrashlyticsReportPersistence.lambda$static$1(file, str);
        return lambda$static$1;
    }
}
