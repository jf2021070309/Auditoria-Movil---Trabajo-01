package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbjj implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
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

                /* JADX INFO: Access modifiers changed from: package-private */
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
            if (remoteContext != null || context == null || (remoteContext = context.getApplicationContext()) != null) {
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
        if (zzbjdVar.zzm() == 2) {
            Bundle bundle = this.zzf;
            return bundle == null ? zzbjdVar.zzf() : zzbjdVar.zza(bundle);
        } else if (zzbjdVar.zzm() != 1 || !this.zzh.has(zzbjdVar.zze())) {
            return (T) zzbjn.zza(new zzfmj(this, zzbjdVar) { // from class: com.google.android.gms.internal.ads.zzbjg
                private final zzbjj zza;
                private final zzbjd zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzbjdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfmj
                public final Object zza() {
                    return this.zza.zze(this.zzb);
                }
            });
        } else {
            return zzbjdVar.zzc(this.zzh);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", JsonUtils.EMPTY_JSON);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zze(zzbjd zzbjdVar) {
        return zzbjdVar.zzd(this.zze);
    }
}
