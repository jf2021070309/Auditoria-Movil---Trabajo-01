package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdvl implements zzfet {
    private final zzdve zzb;
    private final Clock zzc;
    private final Map<zzfem, Long> zza = new HashMap();
    private final Map<zzfem, zzdvk> zzd = new HashMap();

    public zzdvl(zzdve zzdveVar, Set<zzdvk> set, Clock clock) {
        zzfem zzfemVar;
        this.zzb = zzdveVar;
        for (zzdvk zzdvkVar : set) {
            Map<zzfem, zzdvk> map = this.zzd;
            zzfemVar = zzdvkVar.zzc;
            map.put(zzfemVar, zzdvkVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfem zzfemVar, boolean z) {
        zzfem zzfemVar2;
        String str;
        zzfemVar2 = this.zzd.get(zzfemVar).zzb;
        String str2 = true != z ? "f." : "s.";
        if (this.zza.containsKey(zzfemVar2)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - this.zza.get(zzfemVar2).longValue();
            Map<String, String> zzc = this.zzb.zzc();
            str = this.zzd.get(zzfemVar).zza;
            String concat = str.length() != 0 ? "label.".concat(str) : new String("label.");
            String valueOf = String.valueOf(Long.toString(elapsedRealtime));
            zzc.put(concat, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfet
    public final void zzbE(zzfem zzfemVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfet
    public final void zzbF(zzfem zzfemVar, String str) {
        this.zza.put(zzfemVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfet
    public final void zzc(zzfem zzfemVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfemVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - this.zza.get(zzfemVar).longValue();
            Map<String, String> zzc = this.zzb.zzc();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzc.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.zzd.containsKey(zzfemVar)) {
            zze(zzfemVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfet
    public final void zzd(zzfem zzfemVar, String str) {
        if (this.zza.containsKey(zzfemVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - this.zza.get(zzfemVar).longValue();
            Map<String, String> zzc = this.zzb.zzc();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzc.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.zzd.containsKey(zzfemVar)) {
            zze(zzfemVar, true);
        }
    }
}
