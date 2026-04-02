package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbbd implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    @VisibleForTesting
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private c zzh = new c();

    private final void zzf() {
        if (this.zze == null) {
            return;
        }
        try {
            this.zzh = new c((String) zzbbk.zza(new zzfpg() { // from class: com.google.android.gms.internal.ads.zzbbb
                @Override // com.google.android.gms.internal.ads.zzfpg
                public final Object zza() {
                    return zzbbd.this.zzd();
                }
            }));
        } catch (b unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final Object zzb(final zzbax zzbaxVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzbaxVar.zzm();
            }
        }
        if (zzbaxVar.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbaxVar.zzm();
            }
            return zzbaxVar.zzb(bundle);
        } else if (zzbaxVar.zze() == 1 && this.zzh.has(zzbaxVar.zzn())) {
            return zzbaxVar.zza(this.zzh);
        } else {
            return zzbbk.zza(new zzfpg() { // from class: com.google.android.gms.internal.ads.zzbba
                @Override // com.google.android.gms.internal.ads.zzfpg
                public final Object zza() {
                    return zzbbd.this.zzc(zzbaxVar);
                }
            });
        }
    }

    public final /* synthetic */ Object zzc(zzbax zzbaxVar) {
        return zzbaxVar.zzc(this.zze);
    }

    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", "{}");
    }

    public final void zze(Context context) {
        Context applicationContext;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            if (context.getApplicationContext() == null) {
                applicationContext = context;
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.zzg = applicationContext;
            try {
                this.zzf = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null || (remoteContext = context.getApplicationContext()) != null) {
                context = remoteContext;
            }
            if (context == null) {
                this.zza = false;
                this.zzc.open();
                return;
            }
            zzba.zzb();
            SharedPreferences zza = zzbaz.zza(context);
            this.zze = zza;
            if (zza != null) {
                zza.registerOnSharedPreferenceChangeListener(this);
            }
            zzbdq.zzc(new zzbbc(this));
            zzf();
            this.zzd = true;
            this.zza = false;
            this.zzc.open();
        }
    }
}
