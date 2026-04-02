package com.google.firebase.crashlytics.ndk;

import java.io.File;
import java.io.FilenameFilter;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean lambda$static$0;
        lambda$static$0 = JniNativeApi.lambda$static$0(file, str);
        return lambda$static$0;
    }
}
