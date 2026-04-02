package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
/* loaded from: classes.dex */
public final class zzbiv {
    private final Context zza;

    public zzbiv(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null");
        this.zza = context;
    }

    public final boolean zza() {
        return ((Boolean) com.google.android.gms.ads.internal.util.zzce.zza(this.zza, new zzbiu())).booleanValue() && Wrappers.packageManager(this.zza).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    public final boolean zzb() {
        return zzc(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc(Intent intent) {
        Preconditions.checkNotNull(intent, "Intent can not be null");
        return !this.zza.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
