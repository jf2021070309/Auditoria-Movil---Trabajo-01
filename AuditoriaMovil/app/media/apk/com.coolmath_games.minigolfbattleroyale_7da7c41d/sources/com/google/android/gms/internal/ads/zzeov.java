package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeov implements zzery<zzeow> {
    private final Context zza;
    private final zzfsn zzb;

    public zzeov(Context context, zzfsn zzfsnVar) {
        this.zza = context;
        this.zzb = zzfsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeow> zza() {
        return this.zzb.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeou
            private final zzeov zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzf;
                String zzj;
                String str;
                com.google.android.gms.ads.internal.zzt.zzc();
                zzaxc zzb = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzb();
                Bundle bundle = null;
                if (zzb != null && (!com.google.android.gms.ads.internal.zzt.zzg().zzp().zzd() || !com.google.android.gms.ads.internal.zzt.zzg().zzp().zzh())) {
                    if (zzb.zzh()) {
                        zzb.zzf();
                    }
                    zzaws zze = zzb.zze();
                    if (zze != null) {
                        zzf = zze.zzb();
                        str = zze.zzc();
                        zzj = zze.zzd();
                        if (zzf != null) {
                            com.google.android.gms.ads.internal.zzt.zzg().zzp().zze(zzf);
                        }
                        if (zzj != null) {
                            com.google.android.gms.ads.internal.zzt.zzg().zzp().zzi(zzj);
                        }
                    } else {
                        zzf = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzf();
                        zzj = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzj();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzt.zzg().zzp().zzh()) {
                        if (zzj == null || TextUtils.isEmpty(zzj)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", zzj);
                        }
                    }
                    if (zzf != null && !com.google.android.gms.ads.internal.zzt.zzg().zzp().zzd()) {
                        bundle2.putString("fingerprint", zzf);
                        if (!zzf.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzeow(bundle);
            }
        });
    }
}
