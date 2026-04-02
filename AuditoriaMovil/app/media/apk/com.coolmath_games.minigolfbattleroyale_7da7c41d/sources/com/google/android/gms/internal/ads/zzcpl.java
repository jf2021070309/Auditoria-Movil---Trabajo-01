package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcpl extends zzesq {
    private final zzetx zza;
    private final zzcqu zzb;
    private final zzcpl zzc = this;
    private final zzgln<Integer> zzd;
    private final zzgln<zzesn> zze;
    private final zzgln<String> zzf;
    private final zzgln<zzesw> zzg;
    private final zzgln<zzetc> zzh;
    private final zzgln<zzetg> zzi;
    private final zzgln<zzetn> zzj;
    private final zzgln<zzetu> zzk;
    private final zzgln<zzeum> zzl;
    private final zzgln<Boolean> zzm;
    private final zzgln<zzeui> zzn;
    private final zzgln<String> zzo;
    private final zzgln<zzduq> zzp;
    private final zzgln<zzduq> zzq;
    private final zzgln<zzduq> zzr;
    private final zzgln<zzduq> zzs;
    private final zzgln<Map<zzfem, zzduq>> zzt;
    private final zzgln<Set<zzdih<zzfet>>> zzu;
    private final zzgln<Set<zzdih<zzfet>>> zzv;
    private final zzgln zzw;
    private final zzgln<zzfes> zzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcpl(zzcqu zzcquVar, zzetx zzetxVar, zzcql zzcqlVar) {
        zzcrv zzcrvVar;
        zzgln zzglnVar;
        zzgln zzglnVar2;
        zzcpa zzcpaVar;
        zzgln zzglnVar3;
        zzcrv zzcrvVar2;
        zzgln zzglnVar4;
        zzgln zzglnVar5;
        zzgln zzglnVar6;
        zzcrp zzcrpVar;
        zzgln zzglnVar7;
        zzcrr zzcrrVar;
        zzcrt zzcrtVar;
        zzgln zzglnVar8;
        zzgln zzglnVar9;
        zzgln zzglnVar10;
        zzcrx zzcrxVar;
        zzgln zzglnVar11;
        zzgln zzglnVar12;
        zzgln zzglnVar13;
        this.zzb = zzcquVar;
        this.zza = zzetxVar;
        this.zzd = new zzetz(zzetxVar);
        zzcrvVar = zzcru.zza;
        zzglnVar = this.zzb.zzh;
        zzglnVar2 = this.zzb.zzn;
        this.zze = new zzesp(zzcrvVar, zzglnVar, zzglnVar2, zzfdo.zza(), this.zzd);
        this.zzf = new zzety(zzetxVar);
        zzcpaVar = zzcoz.zza;
        zzglnVar3 = this.zzb.zzh;
        this.zzg = new zzesy(zzcpaVar, zzglnVar3, this.zzf, zzfdo.zza());
        zzcrvVar2 = zzcru.zza;
        zzgln<Integer> zzglnVar14 = this.zzd;
        zzglnVar4 = this.zzb.zzh;
        zzglnVar5 = this.zzb.zzY;
        zzglnVar6 = this.zzb.zzn;
        this.zzh = new zzete(zzcrvVar2, zzglnVar14, zzglnVar4, zzglnVar5, zzglnVar6, zzfdo.zza(), this.zzf);
        zzcrpVar = zzcro.zza;
        zzfdo zza = zzfdo.zza();
        zzglnVar7 = this.zzb.zzh;
        this.zzi = new zzeti(zzcrpVar, zza, zzglnVar7);
        zzcrrVar = zzcrq.zza;
        this.zzj = new zzetp(zzcrrVar, zzfdo.zza(), this.zzf);
        zzcrtVar = zzcrs.zza;
        zzglnVar8 = this.zzb.zzn;
        zzglnVar9 = this.zzb.zzh;
        this.zzk = new zzetw(zzcrtVar, zzglnVar8, zzglnVar9);
        this.zzl = new zzeuo(zzfdo.zza());
        this.zzm = new zzeua(zzetxVar);
        zzglnVar10 = this.zzb.zzY;
        zzgln<Boolean> zzglnVar15 = this.zzm;
        zzcrxVar = zzcrw.zza;
        zzfdo zza2 = zzfdo.zza();
        zzgln<String> zzglnVar16 = this.zzf;
        zzglnVar11 = this.zzb.zzn;
        this.zzn = new zzeuk(zzglnVar10, zzglnVar15, zzcrxVar, zza2, zzglnVar16, zzglnVar11);
        this.zzo = new zzeub(zzetxVar);
        this.zzp = zzgkz.zza(zzduj.zza());
        this.zzq = zzgkz.zza(zzduh.zza());
        this.zzr = zzgkz.zza(zzdul.zza());
        this.zzs = zzgkz.zza(zzdun.zza());
        zzgld zzc = zzgle.zzc(4);
        zzc.zzb(zzfem.GMS_SIGNALS, this.zzp);
        zzc.zzb(zzfem.BUILD_URL, this.zzq);
        zzc.zzb(zzfem.HTTP, this.zzr);
        zzc.zzb(zzfem.PRE_PROCESS, this.zzs);
        this.zzt = zzc.zzc();
        zzgln<String> zzglnVar17 = this.zzo;
        zzglnVar12 = this.zzb.zzh;
        this.zzu = zzgkz.zza(new zzduo(zzglnVar17, zzglnVar12, zzfdo.zza(), this.zzt));
        zzglk zza3 = zzgll.zza(0, 1);
        zza3.zzb(this.zzu);
        zzgll zzc2 = zza3.zzc();
        this.zzv = zzc2;
        this.zzw = new zzfev(zzc2);
        zzfdo zza4 = zzfdo.zza();
        zzglnVar13 = this.zzb.zzn;
        this.zzx = zzgkz.zza(new zzfeu(zza4, zzglnVar13, this.zzw));
    }

    private final zzetr zzd() {
        zzbiw zzbiwVar = new zzbiw();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        List<String> zzd = this.zza.zzd();
        zzgli.zzb(zzd);
        return new zzetr(zzbiwVar, zzfsnVar, zzd, null);
    }

    private final zzest zze() {
        zzcfw zzcfwVar = new zzcfw();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        String zzb = this.zza.zzb();
        zzgli.zzb(zzb);
        return new zzest(zzcfwVar, zzfsnVar, zzb, this.zza.zzc(), this.zza.zzf(), null);
    }

    @Override // com.google.android.gms.internal.ads.zzesq
    public final zzesb<JSONObject> zza() {
        zzgln zzglnVar;
        zzgln zzglnVar2;
        zzcom zzcomVar;
        zzgln zzglnVar3;
        zzcom zzcomVar2;
        zzgln zzglnVar4;
        zzgln zzglnVar5;
        zzgln zzglnVar6;
        zzcom zzcomVar3;
        zzcom zzcomVar4;
        zzcom zzcomVar5;
        zzgln zzglnVar7;
        zzgln zzglnVar8;
        zzgln zzglnVar9;
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        zzcft zzcftVar = new zzcft();
        zzfsn zzfsnVar2 = zzchg.zza;
        zzgli.zzb(zzfsnVar2);
        String zza = this.zza.zza();
        zzgli.zzb(zza);
        zzetn zzetnVar = new zzetn(zzcftVar, zzfsnVar2, zza, null);
        zzglnVar = this.zzb.zzn;
        zzeqi zzeqiVar = new zzeqi(zzetnVar, 0L, (ScheduledExecutorService) zzglnVar.zzb());
        zzbzu zzbzuVar = new zzbzu();
        zzglnVar2 = this.zzb.zzn;
        zzcomVar = this.zzb.zza;
        Context zza2 = zzcomVar.zza();
        zzgli.zzb(zza2);
        zzetu zzetuVar = new zzetu(zzbzuVar, (ScheduledExecutorService) zzglnVar2.zzb(), zza2, null);
        zzglnVar3 = this.zzb.zzn;
        zzeqi zzeqiVar2 = new zzeqi(zzetuVar, ((Long) zzbet.zzc().zzc(zzbjl.zzcy)).longValue(), (ScheduledExecutorService) zzglnVar3.zzb());
        zzcfw zzcfwVar = new zzcfw();
        zzcomVar2 = this.zzb.zza;
        Context zza3 = zzcomVar2.zza();
        zzgli.zzb(zza3);
        zzglnVar4 = this.zzb.zzn;
        zzfsn zzfsnVar3 = zzchg.zza;
        zzgli.zzb(zzfsnVar3);
        zzesn zzesnVar = new zzesn(zzcfwVar, zza3, (ScheduledExecutorService) zzglnVar4.zzb(), zzfsnVar3, this.zza.zzf(), null);
        zzglnVar5 = this.zzb.zzn;
        zzeqi zzeqiVar3 = new zzeqi(zzesnVar, 0L, (ScheduledExecutorService) zzglnVar5.zzb());
        zzfsn zzfsnVar4 = zzchg.zza;
        zzgli.zzb(zzfsnVar4);
        zzeum zzeumVar = new zzeum(zzfsnVar4);
        zzglnVar6 = this.zzb.zzn;
        zzeqi zzeqiVar4 = new zzeqi(zzeumVar, 0L, (ScheduledExecutorService) zzglnVar6.zzb());
        zzery<? extends zzerx<JSONObject>> zza4 = zzeue.zza();
        zzcomVar3 = this.zzb.zza;
        Context zza5 = zzcomVar3.zza();
        zzgli.zzb(zza5);
        String zza6 = this.zza.zza();
        zzgli.zzb(zza6);
        zzfsn zzfsnVar5 = zzchg.zza;
        zzgli.zzb(zzfsnVar5);
        zzesw zzeswVar = new zzesw(null, zza5, zza6, zzfsnVar5);
        zzayq zzayqVar = new zzayq();
        zzfsn zzfsnVar6 = zzchg.zza;
        zzgli.zzb(zzfsnVar6);
        zzcomVar4 = this.zzb.zza;
        Context zza7 = zzcomVar4.zza();
        zzgli.zzb(zza7);
        zzcfw zzcfwVar2 = new zzcfw();
        int zzf = this.zza.zzf();
        zzcomVar5 = this.zzb.zza;
        Context zza8 = zzcomVar5.zza();
        zzgli.zzb(zza8);
        zzglnVar7 = this.zzb.zzY;
        zzcge zzcgeVar = (zzcge) zzglnVar7.zzb();
        zzglnVar8 = this.zzb.zzn;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzglnVar8.zzb();
        zzfsn zzfsnVar7 = zzchg.zza;
        zzgli.zzb(zzfsnVar7);
        String zza9 = this.zza.zza();
        zzgli.zzb(zza9);
        zzglnVar9 = this.zzb.zzaw;
        return new zzesb<>(zzfsnVar, zzfot.zzi(zzeqiVar, zzeqiVar2, zzeqiVar3, zzeqiVar4, zza4, zzeswVar, new zzetg(zzayqVar, zzfsnVar6, zza7, null), zzd(), zze(), new zzetc(zzcfwVar2, zzf, zza8, zzcgeVar, scheduledExecutorService, zzfsnVar7, zza9, null), (zzery) zzglnVar9.zzb()));
    }

    @Override // com.google.android.gms.internal.ads.zzesq
    public final zzesb<JSONObject> zzb() {
        zzgln zzglnVar;
        zzgln zzglnVar2;
        zzcft zzcftVar = new zzcft();
        zzcfu zzcfuVar = new zzcfu();
        zzglnVar = this.zzb.zzaw;
        Object zzb = zzglnVar.zzb();
        zzest zze = zze();
        zzetr zzd = zzd();
        zzgku zzc = zzgkz.zzc(this.zze);
        zzgku zzc2 = zzgkz.zzc(this.zzg);
        zzgku zzc3 = zzgkz.zzc(this.zzh);
        zzgku zzc4 = zzgkz.zzc(this.zzi);
        zzgku zzc5 = zzgkz.zzc(this.zzj);
        zzgku zzc6 = zzgkz.zzc(this.zzk);
        zzgku zzc7 = zzgkz.zzc(this.zzl);
        zzgku zzc8 = zzgkz.zzc(this.zzn);
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        zzglnVar2 = this.zzb.zzn;
        return zzeuf.zza(zzcftVar, zzcfuVar, zzb, zze, zzd, zzc, zzc2, zzc3, zzc4, zzc5, zzc6, zzc7, zzc8, zzfsnVar, (ScheduledExecutorService) zzglnVar2.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzesq
    public final zzfes zzc() {
        return this.zzx.zzb();
    }
}
