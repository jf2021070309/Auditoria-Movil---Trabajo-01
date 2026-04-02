package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzao {
    private final Context zza;
    private String zzb;
    private String zzc;
    private int zzd;
    private int zze = 0;

    public zzao(Context context) {
        this.zza = context;
    }

    private final synchronized void zzf() {
        PackageInfo zza = zza(this.zza.getPackageName());
        if (zza != null) {
            this.zzb = Integer.toString(zza.versionCode);
            this.zzc = zza.versionName;
        }
    }

    public final boolean zza() {
        return zzb() != 0;
    }

    public final synchronized int zzb() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.zza.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.zze = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.zze = 2;
            return 2;
        }
        if (PlatformVersion.isAtLeastO()) {
            this.zze = 2;
        } else {
            this.zze = 1;
        }
        return this.zze;
    }

    public final synchronized String zzc() {
        if (this.zzb == null) {
            zzf();
        }
        return this.zzb;
    }

    public final synchronized String zzd() {
        if (this.zzc == null) {
            zzf();
        }
        return this.zzc;
    }

    public final synchronized int zze() {
        PackageInfo zza;
        if (this.zzd == 0 && (zza = zza("com.google.android.gms")) != null) {
            this.zzd = zza.versionCode;
        }
        return this.zzd;
    }

    public static String zza(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (applicationId.startsWith("1:")) {
            String[] split = applicationId.split(":");
            if (split.length < 2) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return applicationId;
    }

    private final PackageInfo zza(String str) {
        try {
            return this.zza.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            new StringBuilder(String.valueOf(e).length() + 23);
            return null;
        }
    }
}
