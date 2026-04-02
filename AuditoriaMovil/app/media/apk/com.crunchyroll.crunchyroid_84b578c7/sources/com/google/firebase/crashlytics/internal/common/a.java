package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean lambda$static$0;
        lambda$static$0 = CrashlyticsController.lambda$static$0(file, str);
        return lambda$static$0;
    }
}
