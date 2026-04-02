package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbjj implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    @VisibleForTesting
    public volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbjn.zza(new zzfmj(this) { // from class: com.google.android.gms.internal.ads.zzbjh
                private final zzbjj zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzfmj
                public final Object zza() {
                    return this.zza.zzd();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final void zzb(Context context) {
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
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
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
            zzbet.zza();
            SharedPreferences zza = zzbjf.zza(context);
            this.zze = zza;
            if (zza != null) {
                zza.registerOnSharedPreferenceChangeListener(this);
            }
            zzbln.zzb(new zzbji(this));
            zzf();
            this.zzd = true;
            this.zza = false;
            this.zzc.open();
        }
    }

    public final <T> T zzc(final zzbjd<T> zzbjdVar) {
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
                return zzbjdVar.zzf();
            }
        }
        if (zzbjdVar.zzm() != 2) {
            return (zzbjdVar.zzm() == 1 && this.zzh.has(zzbjdVar.zze())) ? zzbjdVar.zzc(this.zzh) : (T) zzbjn.zza(new zzfmj(this, zzbjdVar) { // from class: com.google.android.gms.internal.ads.zzbjg
                private final zzbjj zza;
                private final zzbjd zzb;

                {
                    this.zza = this;
                    this.zzb = zzbjdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfmj
                public final Object zza() {
                    return this.zza.zze(this.zzb);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbjdVar.zzf() : zzbjdVar.zza(bundle);
    }

    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", "{}");
    }

    public final /* synthetic */ Object zze(zzbjd zzbjdVar) {
        return zzbjdVar.zzd(this.zze);
    }
}
