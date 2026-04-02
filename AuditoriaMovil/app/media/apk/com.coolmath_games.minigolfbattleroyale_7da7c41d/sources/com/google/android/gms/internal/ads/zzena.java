package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzena implements zzery<zzenb> {
    private final zzfsn zza;
    private final zzdtf zzb;
    private final zzdxk zzc;
    private final zzenc zzd;

    public zzena(zzfsn zzfsnVar, zzdtf zzdtfVar, zzdxk zzdxkVar, zzenc zzencVar) {
        this.zza = zzfsnVar;
        this.zzb = zzdtfVar;
        this.zzc = zzdxkVar;
        this.zzd = zzencVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzenb> zza() {
        if (zzfmi.zzc((String) zzbet.zzc().zzc(zzbjl.zzaW)) || this.zzd.zzb() || !this.zzc.zzm()) {
            return zzfsd.zza(new zzenb(new Bundle(), null));
        }
        this.zzd.zza(true);
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzemz
            private final zzena zza;

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
    public final /* synthetic */ zzenb zzb() throws Exception {
        List<String> asList = Arrays.asList(((String) zzbet.zzc().zzc(zzbjl.zzaW)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfbi zzb = this.zzb.zzb(str, new JSONObject());
                zzb.zzn();
                Bundle bundle2 = new Bundle();
                try {
                    zzbya zzA = zzb.zzA();
                    if (zzA != null) {
                        bundle2.putString("sdk_version", zzA.toString());
                    }
                } catch (zzfaw unused) {
                }
                try {
                    zzbya zzz = zzb.zzz();
                    if (zzz != null) {
                        bundle2.putString("adapter_version", zzz.toString());
                    }
                } catch (zzfaw unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfaw unused3) {
            }
        }
        return new zzenb(bundle, null);
    }
}
