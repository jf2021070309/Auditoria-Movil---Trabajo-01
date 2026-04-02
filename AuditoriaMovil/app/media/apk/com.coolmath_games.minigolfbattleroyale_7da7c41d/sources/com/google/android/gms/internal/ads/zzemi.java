package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzemi implements zzerx<Bundle> {
    public final Context zza;
    public final zzbdl zzb;
    public final List<Parcelable> zzc;

    public zzemi(Context context, zzbdl zzbdlVar, List<Parcelable> list) {
        this.zza = context;
        this.zzb = zzbdlVar;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        Bundle bundle2 = bundle;
        if (zzblb.zza.zze().booleanValue()) {
            Bundle bundle3 = new Bundle();
            com.google.android.gms.ads.internal.zzt.zzc();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    str = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle3.putString("activity", str);
            Bundle bundle4 = new Bundle();
            bundle4.putInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, this.zzb.zze);
            bundle4.putInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.zzb.zzb);
            bundle3.putBundle("size", bundle4);
            if (this.zzc.size() > 0) {
                List<Parcelable> list = this.zzc;
                bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle2.putBundle("view_hierarchy", bundle3);
        }
    }
}
