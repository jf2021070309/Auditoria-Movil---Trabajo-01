package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeqe implements zzery<zzeqf> {
    private final zzfsn zza;
    private final Context zzb;
    private final Set<String> zzc;

    public zzeqe(zzfsn zzfsnVar, Context context, Set<String> set) {
        this.zza = zzfsnVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeqf> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeqd
            private final zzeqe zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeqf zzb() throws Exception {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue()) {
            Set<String> set = this.zzc;
            if (set.contains("rewarded") || set.contains(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE) || set.contains(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE) || set.contains("banner")) {
                return new zzeqf(com.google.android.gms.ads.internal.zzt.zzr().zzc(this.zzb));
            }
        }
        return new zzeqf(null);
    }
}
