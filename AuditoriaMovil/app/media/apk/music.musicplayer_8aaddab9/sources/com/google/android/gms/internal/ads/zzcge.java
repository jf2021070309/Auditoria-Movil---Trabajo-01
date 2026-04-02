package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcge {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzcgi zzc;
    private boolean zzd;
    private Context zze;
    private zzcgz zzf;
    private zzbjq zzg;
    private Boolean zzh;
    private final AtomicInteger zzi;
    private final zzcgc zzj;
    private final Object zzk;
    private zzfsm<ArrayList<String>> zzl;

    public zzcge() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzcgi(zzber.zzc(), zzjVar);
        this.zzd = false;
        this.zzg = null;
        this.zzh = null;
        this.zzi = new AtomicInteger(0);
        this.zzj = new zzcgc(null);
        this.zzk = new Object();
    }

    public final zzbjq zze() {
        zzbjq zzbjqVar;
        synchronized (this.zza) {
            zzbjqVar = this.zzg;
        }
        return zzbjqVar;
    }

    public final void zzf(Boolean bool) {
        synchronized (this.zza) {
            this.zzh = bool;
        }
    }

    public final Boolean zzg() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzh;
        }
        return bool;
    }

    public final void zzh() {
        this.zzj.zza();
    }

    @TargetApi(ConnectionResult.API_DISABLED)
    public final void zzi(Context context, zzcgz zzcgzVar) {
        zzbjq zzbjqVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzcgzVar;
                com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zzc);
                this.zzb.zza(this.zze);
                zzcar.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzt.zzl();
                if (zzbkt.zzc.zze().booleanValue()) {
                    zzbjqVar = new zzbjq();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbjqVar = null;
                }
                this.zzg = zzbjqVar;
                if (zzbjqVar != null) {
                    zzchj.zza(new zzcgb(this).zzc(), "AppState.registerCsiReporter");
                }
                this.zzd = true;
                zzr();
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc().zzi(context, zzcgzVar.zza);
    }

    public final Resources zzj() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            zzcgx.zzb(this.zze).getResources();
            return null;
        } catch (zzcgw e2) {
            zzcgt.zzj("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    public final void zzk(Throwable th, String str) {
        zzcar.zzb(this.zze, this.zzf).zzd(th, str);
    }

    public final void zzl(Throwable th, String str) {
        zzcar.zzb(this.zze, this.zzf).zze(th, str, zzblf.zzg.zze().floatValue());
    }

    public final void zzm() {
        this.zzi.incrementAndGet();
    }

    public final void zzn() {
        this.zzi.decrementAndGet();
    }

    public final int zzo() {
        return this.zzi.get();
    }

    public final com.google.android.gms.ads.internal.util.zzg zzp() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final Context zzq() {
        return this.zze;
    }

    public final zzfsm<ArrayList<String>> zzr() {
        if (PlatformVersion.isAtLeastJellyBean() && this.zze != null) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbN)).booleanValue()) {
                synchronized (this.zzk) {
                    zzfsm<ArrayList<String>> zzfsmVar = this.zzl;
                    if (zzfsmVar != null) {
                        return zzfsmVar;
                    }
                    zzfsm<ArrayList<String>> zzb = zzchg.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcga
                        private final zzcge zza;

                        {
                            this.zza = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzt();
                        }
                    });
                    this.zzl = zzb;
                    return zzb;
                }
            }
        }
        return zzfsd.zza(new ArrayList());
    }

    public final zzcgi zzs() {
        return this.zzc;
    }

    public final /* synthetic */ ArrayList zzt() throws Exception {
        Context zza = zzcbx.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza).getPackageInfo(zza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i2] & 2) != 0) {
                        arrayList.add(strArr[i2]);
                    }
                    i2++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }
}
