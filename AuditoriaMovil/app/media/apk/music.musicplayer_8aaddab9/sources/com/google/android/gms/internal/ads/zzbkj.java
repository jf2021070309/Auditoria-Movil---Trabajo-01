package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import c.d.a.a;
import c.d.a.b;
import c.d.a.d;
import c.d.a.e;
import java.util.List;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbkj {
    private e zza;
    private b zzb;
    private d zzc;
    private zzbkh zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i2 = 0; i2 < queryIntentActivities.size(); i2++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzglo.zza(context));
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        d dVar = this.zzc;
        if (dVar == null) {
            return;
        }
        activity.unbindService(dVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public final e zzc() {
        b bVar = this.zzb;
        e eVar = null;
        if (bVar != null) {
            if (this.zza == null) {
                a aVar = new a(bVar);
                try {
                    if (bVar.a.w0(aVar)) {
                        eVar = new e(bVar.a, aVar, bVar.f1607b);
                    }
                } catch (RemoteException unused) {
                }
            }
            return this.zza;
        }
        this.zza = eVar;
        return this.zza;
    }

    public final void zzd(zzbkh zzbkhVar) {
        this.zzd = zzbkhVar;
    }

    public final void zze(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzglo.zza(activity)) != null) {
            zzglp zzglpVar = new zzglp(this, null);
            this.zzc = zzglpVar;
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(zza)) {
                intent.setPackage(zza);
            }
            activity.bindService(intent, zzglpVar, 33);
        }
    }

    public final void zzf(b bVar) {
        this.zzb = bVar;
        Objects.requireNonNull(bVar);
        try {
            bVar.a.d0(0L);
        } catch (RemoteException unused) {
        }
        zzbkh zzbkhVar = this.zzd;
        if (zzbkhVar != null) {
            zzbkhVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
