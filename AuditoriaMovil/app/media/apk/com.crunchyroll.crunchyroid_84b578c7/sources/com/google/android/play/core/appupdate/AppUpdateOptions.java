package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.AppUpdateType;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes3.dex */
public abstract class AppUpdateOptions {

    /* compiled from: com.google.android.play:app-update@@2.1.0 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract AppUpdateOptions build();

        public abstract Builder setAllowAssetPackDeletion(boolean z);

        public abstract Builder setAppUpdateType(@AppUpdateType int i);
    }

    public static AppUpdateOptions defaultOptions(@AppUpdateType int i) {
        return newBuilder(i).build();
    }

    public static Builder newBuilder(@AppUpdateType int i) {
        zzv zzvVar = new zzv();
        zzvVar.setAppUpdateType(i);
        zzvVar.setAllowAssetPackDeletion(false);
        return zzvVar;
    }

    public abstract boolean allowAssetPackDeletion();

    @AppUpdateType
    public abstract int appUpdateType();
}
