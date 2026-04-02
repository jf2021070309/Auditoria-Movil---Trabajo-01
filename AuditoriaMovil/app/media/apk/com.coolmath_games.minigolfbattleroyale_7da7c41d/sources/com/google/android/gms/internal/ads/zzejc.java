package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzdcm;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzejc<AdT, AdapterT, ListenerT extends zzdcm> implements zzeec<AdT> {
    private final zzeee<AdapterT, ListenerT> zza;
    private final zzeek<AdT, AdapterT, ListenerT> zzb;
    private final zzfes zzc;
    private final zzfsn zzd;

    public zzejc(zzfes zzfesVar, zzfsn zzfsnVar, zzeee<AdapterT, ListenerT> zzeeeVar, zzeek<AdT, AdapterT, ListenerT> zzeekVar) {
        this.zzc = zzfesVar;
        this.zzd = zzfsnVar;
        this.zzb = zzeekVar;
        this.zza = zzeeeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String zze(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final boolean zza(zzfal zzfalVar, zzezz zzezzVar) {
        return !zzezzVar.zzt.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final zzfsm<AdT> zzb(final zzfal zzfalVar, final zzezz zzezzVar) {
        final zzeef<AdapterT, ListenerT> zzeefVar;
        Iterator<String> it = zzezzVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzeefVar = null;
                break;
            }
            try {
                zzeefVar = this.zza.zza(it.next(), zzezzVar.zzv);
                break;
            } catch (zzfaw unused) {
            }
        }
        if (zzeefVar == null) {
            return zzfsd.zzc(new zzehe("Unable to instantiate mediation adapter class."));
        }
        zzchl zzchlVar = new zzchl();
        zzeefVar.zzc.zza(new zzejb(this, zzeefVar, zzchlVar));
        if (zzezzVar.zzI) {
            Bundle bundle = zzfalVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfes zzfesVar = this.zzc;
        return zzfed.zzd(new zzfdx(this, zzfalVar, zzezzVar, zzeefVar) { // from class: com.google.android.gms.internal.ads.zzeiz
            private final zzejc zza;
            private final zzfal zzb;
            private final zzezz zzc;
            private final zzeef zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzfalVar;
                this.zzc = zzezzVar;
                this.zzd = zzeefVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza() {
                this.zza.zzd(this.zzb, this.zzc, this.zzd);
            }
        }, this.zzd, zzfem.ADAPTER_LOAD_AD_SYN, zzfesVar).zzj(zzfem.ADAPTER_LOAD_AD_ACK).zze(zzchlVar).zzj(zzfem.ADAPTER_WRAP_ADAPTER).zzb(new zzfdw(this, zzfalVar, zzezzVar, zzeefVar) { // from class: com.google.android.gms.internal.ads.zzeja
            private final zzejc zza;
            private final zzfal zzb;
            private final zzezz zzc;
            private final zzeef zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzfalVar;
                this.zzc = zzezzVar;
                this.zzd = zzeefVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfdw
            public final Object zza(Object obj) {
                return this.zza.zzc(this.zzb, this.zzc, this.zzd, (Void) obj);
            }
        }).zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzfal zzfalVar, zzezz zzezzVar, zzeef zzeefVar, Void r4) throws Exception {
        return this.zzb.zzb(zzfalVar, zzezzVar, zzeefVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzfal zzfalVar, zzezz zzezzVar, zzeef zzeefVar) throws Exception {
        this.zzb.zza(zzfalVar, zzezzVar, zzeefVar);
    }
}
