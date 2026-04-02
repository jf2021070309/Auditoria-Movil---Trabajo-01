package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzr {
    private final zzfu zza;

    public zzr(zzfu zzfuVar) {
        this.zza = zzfuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zza.zzav().zzg();
        if (zze()) {
            if (zzd()) {
                this.zza.zzd().zzp.zzb(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString(FirebaseAnalytics.Param.MEDIUM, "(not set)");
                bundle.putString("_cis", SDKConstants.PARAM_INTENT);
                bundle.putLong("_cc", 1L);
                this.zza.zzk().zzs("auto", "_cmpx", bundle);
            } else {
                String zza = this.zza.zzd().zzp.zza();
                if (TextUtils.isEmpty(zza)) {
                    this.zza.zzau().zzc().zza("Cache still valid but referrer not found");
                } else {
                    long zza2 = ((this.zza.zzd().zzq.zza() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(zza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", zza2);
                    this.zza.zzk().zzs((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.zza.zzd().zzp.zzb(null);
            }
            this.zza.zzd().zzq.zzb(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(String str, Bundle bundle) {
        String uri;
        this.zza.zzav().zzg();
        if (this.zza.zzF()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.zza.zzd().zzp.zzb(uri);
        this.zza.zzd().zzq.zzb(this.zza.zzay().currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        if (zze() && zzd()) {
            this.zza.zzd().zzp.zzb(null);
        }
    }

    final boolean zzd() {
        return zze() && this.zza.zzay().currentTimeMillis() - this.zza.zzd().zzq.zza() > this.zza.zzc().zzj(null, zzea.zzQ);
    }

    final boolean zze() {
        return this.zza.zzd().zzq.zza() > 0;
    }
}
