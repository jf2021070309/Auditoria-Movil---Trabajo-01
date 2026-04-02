package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zznp implements SharedPreferences.OnSharedPreferenceChangeListener {
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
            this.zzh = new c((String) zzns.zza(new zzrp() { // from class: com.google.ads.interactivemedia.v3.internal.zznn
                @Override // com.google.ads.interactivemedia.v3.internal.zzrp
                public final Object zza() {
                    return zznp.this.zzd();
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

    public final Object zzb(final zznj zznjVar) {
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
                return zznjVar.zzk();
            }
        }
        if (zznjVar.zzd() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zznjVar.zzk();
            }
            return zznjVar.zzb(bundle);
        } else if (zznjVar.zzd() == 1 && this.zzh.has(zznjVar.zzl())) {
            return zznjVar.zza(this.zzh);
        } else {
            return zzns.zza(new zzrp() { // from class: com.google.ads.interactivemedia.v3.internal.zznm
                @Override // com.google.ads.interactivemedia.v3.internal.zzrp
                public final Object zza() {
                    return zznp.this.zzc(zznjVar);
                }
            });
        }
    }

    public final /* synthetic */ Object zzc(zznj zznjVar) {
        return zznjVar.zzc(this.zze);
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
            zznc.zzb();
            SharedPreferences sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
            this.zze = sharedPreferences;
            if (sharedPreferences != null) {
                sharedPreferences.registerOnSharedPreferenceChangeListener(this);
            }
            zzny.zzc(new zzno(this));
            zzf();
            this.zzd = true;
            this.zza = false;
            this.zzc.open();
        }
    }
}
