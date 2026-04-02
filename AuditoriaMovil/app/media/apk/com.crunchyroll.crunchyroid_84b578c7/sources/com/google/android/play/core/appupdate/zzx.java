package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.AppUpdateType;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes3.dex */
final class zzx extends AppUpdateOptions {
    private final int zza;
    private final boolean zzb;

    public /* synthetic */ zzx(int i, boolean z, zzw zzwVar) {
        this.zza = i;
        this.zzb = z;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    public final boolean allowAssetPackDeletion() {
        return this.zzb;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    @AppUpdateType
    public final int appUpdateType() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppUpdateOptions) {
            AppUpdateOptions appUpdateOptions = (AppUpdateOptions) obj;
            if (this.zza == appUpdateOptions.appUpdateType() && this.zzb == appUpdateOptions.allowAssetPackDeletion()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.zza ^ 1000003;
        if (true != this.zzb) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (i2 * 1000003) ^ i;
    }

    public final String toString() {
        int i = this.zza;
        boolean z = this.zzb;
        return "AppUpdateOptions{appUpdateType=" + i + ", allowAssetPackDeletion=" + z + "}";
    }
}
