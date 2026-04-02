package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzaw {
    private static zzaw zza;
    private String zzb = null;
    private Boolean zzc = null;
    private Boolean zzd = null;
    private final Queue<Intent> zze = new ArrayDeque();

    private zzaw() {
    }

    public static synchronized zzaw zza() {
        zzaw zzawVar;
        synchronized (zzaw.class) {
            if (zza == null) {
                zza = new zzaw();
            }
            zzawVar = zza;
        }
        return zzawVar;
    }

    private final synchronized String zzc(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2;
        String str3 = this.zzb;
        if (str3 != null) {
            return str3;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    if (valueOf2.length() != 0) {
                        str2 = valueOf.concat(valueOf2);
                    } else {
                        str2 = new String(valueOf);
                    }
                    this.zzb = str2;
                } else {
                    this.zzb = serviceInfo.name;
                }
                return this.zzb;
            }
            new StringBuilder(String.valueOf(serviceInfo.packageName).length() + 94 + String.valueOf(serviceInfo.name).length());
            return null;
        }
        return null;
    }

    public final Intent zzb() {
        return this.zze.poll();
    }

    private final int zzb(Context context, Intent intent) {
        ComponentName startService;
        String zzc = zzc(context, intent);
        if (zzc != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3) && zzc.length() != 0) {
                "Restricting intent to a specific service: ".concat(zzc);
            }
            intent.setClassName(context.getPackageName(), zzc);
        }
        try {
            if (zza(context)) {
                startService = zzbd.zza(context, intent);
            } else {
                startService = context.startService(intent);
            }
            return startService == null ? 404 : -1;
        } catch (IllegalStateException e) {
            new StringBuilder(String.valueOf(e).length() + 45);
            return 402;
        } catch (SecurityException unused) {
            return 401;
        }
    }

    public final int zza(Context context, Intent intent) {
        Log.isLoggable("FirebaseInstanceId", 3);
        this.zze.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return zzb(context, intent2);
    }

    public final boolean zza(Context context) {
        if (this.zzc == null) {
            this.zzc = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.zzc.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.zzc.booleanValue();
    }

    public final boolean zzb(Context context) {
        if (this.zzd == null) {
            this.zzd = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.zzc.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.zzd.booleanValue();
    }
}
