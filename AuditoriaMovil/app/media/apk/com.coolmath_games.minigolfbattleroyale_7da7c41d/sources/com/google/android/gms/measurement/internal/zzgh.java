package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.appevents.codeless.internal.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzov;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
final class zzgh implements Callable<byte[]> {
    final /* synthetic */ zzas zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgh(zzgm zzgmVar, zzas zzasVar, String str) {
        this.zzc = zzgmVar;
        this.zza = zzasVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ byte[] call() throws Exception {
        zzkn zzknVar;
        zzkn zzknVar2;
        byte[] bArr;
        zzkn zzknVar3;
        zzks zzksVar;
        zzg zzgVar;
        com.google.android.gms.internal.measurement.zzft zzftVar;
        String str;
        Bundle bundle;
        com.google.android.gms.internal.measurement.zzfv zzfvVar;
        byte[] bArr2;
        zzao zza;
        long j;
        zzknVar = this.zzc.zza;
        zzknVar.zzG();
        zzknVar2 = this.zzc.zza;
        zzib zzl = zzknVar2.zzl();
        zzas zzasVar = this.zza;
        String str2 = this.zzb;
        zzl.zzg();
        zzfu.zzP();
        Preconditions.checkNotNull(zzasVar);
        Preconditions.checkNotEmpty(str2);
        if (!zzl.zzs.zzc().zzn(str2, zzea.zzU)) {
            zzl.zzs.zzau().zzj().zzb("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if (!"_iap".equals(zzasVar.zza) && !"_iapx".equals(zzasVar.zza)) {
            zzl.zzs.zzau().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", str2, zzasVar.zza);
            return null;
        } else {
            com.google.android.gms.internal.measurement.zzft zzc = com.google.android.gms.internal.measurement.zzfu.zzc();
            zzl.zzf.zzi().zzb();
            try {
                zzg zzs = zzl.zzf.zzi().zzs(str2);
                if (zzs == null) {
                    zzl.zzs.zzau().zzj().zzb("Log and bundle not available. package_name", str2);
                    bArr = new byte[0];
                    zzknVar3 = zzl.zzf;
                } else if (zzs.zzF()) {
                    com.google.android.gms.internal.measurement.zzfv zzaj = com.google.android.gms.internal.measurement.zzfw.zzaj();
                    zzaj.zza(1);
                    zzaj.zzA(Constants.PLATFORM);
                    if (!TextUtils.isEmpty(zzs.zzc())) {
                        zzaj.zzH(zzs.zzc());
                    }
                    if (!TextUtils.isEmpty(zzs.zzx())) {
                        zzaj.zzF((String) Preconditions.checkNotNull(zzs.zzx()));
                    }
                    if (!TextUtils.isEmpty(zzs.zzt())) {
                        zzaj.zzI((String) Preconditions.checkNotNull(zzs.zzt()));
                    }
                    if (zzs.zzv() != -2147483648L) {
                        zzaj.zzab((int) zzs.zzv());
                    }
                    zzaj.zzJ(zzs.zzz());
                    zzaj.zzal(zzs.zzD());
                    String zzf = zzs.zzf();
                    String zzh = zzs.zzh();
                    zzov.zzb();
                    if (zzl.zzs.zzc().zzn(zzs.zzc(), zzea.zzag)) {
                        String zzj = zzs.zzj();
                        if (!TextUtils.isEmpty(zzf)) {
                            zzaj.zzW(zzf);
                        } else if (!TextUtils.isEmpty(zzj)) {
                            zzaj.zzao(zzj);
                        } else if (!TextUtils.isEmpty(zzh)) {
                            zzaj.zzai(zzh);
                        }
                    } else if (!TextUtils.isEmpty(zzf)) {
                        zzaj.zzW(zzf);
                    } else if (!TextUtils.isEmpty(zzh)) {
                        zzaj.zzai(zzh);
                    }
                    zzaf zzt = zzl.zzf.zzt(str2);
                    zzaj.zzR(zzs.zzB());
                    if (zzl.zzs.zzF() && zzl.zzs.zzc().zzw(zzaj.zzG()) && zzt.zzf() && !TextUtils.isEmpty(null)) {
                        zzaj.zzaf(null);
                    }
                    zzaj.zzap(zzt.zzd());
                    if (zzt.zzf()) {
                        Pair<String, Boolean> zzc2 = zzl.zzf.zzn().zzc(zzs.zzc(), zzt);
                        if (zzs.zzaf() && !TextUtils.isEmpty((CharSequence) zzc2.first)) {
                            try {
                                zzaj.zzL(zzib.zzc((String) zzc2.first, Long.toString(zzasVar.zzd)));
                                if (zzc2.second != null) {
                                    zzaj.zzN(((Boolean) zzc2.second).booleanValue());
                                }
                            } catch (SecurityException e) {
                                zzl.zzs.zzau().zzj().zzb("Resettable device id encryption failed", e.getMessage());
                                bArr = new byte[0];
                                zzknVar3 = zzl.zzf;
                            }
                        }
                    }
                    zzl.zzs.zzz().zzv();
                    zzaj.zzC(Build.MODEL);
                    zzl.zzs.zzz().zzv();
                    zzaj.zzB(Build.VERSION.RELEASE);
                    zzaj.zzE((int) zzl.zzs.zzz().zzb());
                    zzaj.zzD(zzl.zzs.zzz().zzc());
                    try {
                        if (zzt.zzh() && zzs.zzd() != null) {
                            zzaj.zzP(zzib.zzc((String) Preconditions.checkNotNull(zzs.zzd()), Long.toString(zzasVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(zzs.zzn())) {
                            zzaj.zzaa((String) Preconditions.checkNotNull(zzs.zzn()));
                        }
                        String zzc3 = zzs.zzc();
                        List<zzks> zzl2 = zzl.zzf.zzi().zzl(zzc3);
                        Iterator<zzks> it = zzl2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                zzksVar = null;
                                break;
                            }
                            zzksVar = it.next();
                            if ("_lte".equals(zzksVar.zzc)) {
                                break;
                            }
                        }
                        if (zzksVar == null || zzksVar.zze == null) {
                            zzks zzksVar2 = new zzks(zzc3, "auto", "_lte", zzl.zzs.zzay().currentTimeMillis(), 0L);
                            zzl2.add(zzksVar2);
                            zzl.zzf.zzi().zzj(zzksVar2);
                        }
                        zzkp zzm = zzl.zzf.zzm();
                        zzm.zzs.zzau().zzk().zza("Checking account type status for ad personalization signals");
                        if (zzm.zzs.zzz().zzf()) {
                            String zzc4 = zzs.zzc();
                            Preconditions.checkNotNull(zzc4);
                            if (zzs.zzaf() && zzm.zzf.zzf().zzf(zzc4)) {
                                zzm.zzs.zzau().zzj().zza("Turning off ad personalization due to account type");
                                Iterator<zzks> it2 = zzl2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(it2.next().zzc)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                zzl2.add(new zzks(zzc4, "auto", "_npa", zzm.zzs.zzay().currentTimeMillis(), 1L));
                            }
                        }
                        com.google.android.gms.internal.measurement.zzgh[] zzghVarArr = new com.google.android.gms.internal.measurement.zzgh[zzl2.size()];
                        for (int i = 0; i < zzl2.size(); i++) {
                            com.google.android.gms.internal.measurement.zzgg zzj2 = com.google.android.gms.internal.measurement.zzgh.zzj();
                            zzj2.zzb(zzl2.get(i).zzc);
                            zzj2.zza(zzl2.get(i).zzd);
                            zzl.zzf.zzm().zzc(zzj2, zzl2.get(i).zze);
                            zzghVarArr[i] = zzj2.zzaA();
                        }
                        zzaj.zzp(Arrays.asList(zzghVarArr));
                        zzen zza2 = zzen.zza(zzasVar);
                        zzl.zzs.zzl().zzH(zza2.zzd, zzl.zzf.zzi().zzK(str2));
                        zzl.zzs.zzl().zzG(zza2, zzl.zzs.zzc().zzd(str2));
                        Bundle bundle2 = zza2.zzd;
                        bundle2.putLong("_c", 1L);
                        zzl.zzs.zzau().zzj().zza("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzasVar.zzc);
                        if (zzl.zzs.zzl().zzT(zzaj.zzG())) {
                            zzl.zzs.zzl().zzL(bundle2, "_dbg", 1L);
                            zzl.zzs.zzl().zzL(bundle2, "_r", 1L);
                        }
                        zzao zzf2 = zzl.zzf.zzi().zzf(str2, zzasVar.zza);
                        if (zzf2 == null) {
                            zzfvVar = zzaj;
                            zzgVar = zzs;
                            zzftVar = zzc;
                            str = str2;
                            bundle = bundle2;
                            bArr2 = null;
                            zza = new zzao(str2, zzasVar.zza, 0L, 0L, 0L, zzasVar.zzd, 0L, null, null, null, null);
                            j = 0;
                        } else {
                            zzgVar = zzs;
                            zzftVar = zzc;
                            str = str2;
                            bundle = bundle2;
                            zzfvVar = zzaj;
                            bArr2 = null;
                            long j2 = zzf2.zzf;
                            zza = zzf2.zza(zzasVar.zzd);
                            j = j2;
                        }
                        zzl.zzf.zzi().zzh(zza);
                        zzan zzanVar = new zzan(zzl.zzs, zzasVar.zzc, str, zzasVar.zza, zzasVar.zzd, j, bundle);
                        com.google.android.gms.internal.measurement.zzfn zzk = com.google.android.gms.internal.measurement.zzfo.zzk();
                        zzk.zzo(zzanVar.zzd);
                        zzk.zzl(zzanVar.zzb);
                        zzk.zzq(zzanVar.zze);
                        zzap zzapVar = new zzap(zzanVar.zzf);
                        while (zzapVar.hasNext()) {
                            String next = zzapVar.next();
                            com.google.android.gms.internal.measurement.zzfr zzn = com.google.android.gms.internal.measurement.zzfs.zzn();
                            zzn.zza(next);
                            Object zza3 = zzanVar.zzf.zza(next);
                            if (zza3 != null) {
                                zzl.zzf.zzm().zzd(zzn, zza3);
                                zzk.zzg(zzn);
                            }
                        }
                        com.google.android.gms.internal.measurement.zzfv zzfvVar2 = zzfvVar;
                        zzfvVar2.zzf(zzk);
                        com.google.android.gms.internal.measurement.zzfx zza4 = com.google.android.gms.internal.measurement.zzgb.zza();
                        com.google.android.gms.internal.measurement.zzfp zza5 = com.google.android.gms.internal.measurement.zzfq.zza();
                        zza5.zzb(zza.zzc);
                        zza5.zza(zzasVar.zza);
                        zza4.zza(zza5);
                        zzfvVar2.zzaj(zza4);
                        zzfvVar2.zzY(zzl.zzf.zzk().zzb(zzgVar.zzc(), Collections.emptyList(), zzfvVar2.zzj(), Long.valueOf(zzk.zzn()), Long.valueOf(zzk.zzn())));
                        if (zzk.zzm()) {
                            zzfvVar2.zzt(zzk.zzn());
                            zzfvVar2.zzv(zzk.zzn());
                        }
                        long zzr = zzgVar.zzr();
                        int i2 = (zzr > 0L ? 1 : (zzr == 0L ? 0 : -1));
                        if (i2 != 0) {
                            zzfvVar2.zzy(zzr);
                        }
                        long zzp = zzgVar.zzp();
                        if (zzp != 0) {
                            zzfvVar2.zzw(zzp);
                        } else if (i2 != 0) {
                            zzfvVar2.zzw(zzr);
                        }
                        zzgVar.zzN();
                        zzfvVar2.zzS((int) zzgVar.zzI());
                        zzl.zzs.zzc().zzf();
                        zzfvVar2.zzK(42004L);
                        zzfvVar2.zzr(zzl.zzs.zzay().currentTimeMillis());
                        zzfvVar2.zzX(Boolean.TRUE.booleanValue());
                        com.google.android.gms.internal.measurement.zzft zzftVar2 = zzftVar;
                        zzftVar2.zzb(zzfvVar2);
                        zzg zzgVar2 = zzgVar;
                        zzgVar2.zzq(zzfvVar2.zzs());
                        zzgVar2.zzs(zzfvVar2.zzu());
                        zzl.zzf.zzi().zzt(zzgVar2);
                        zzl.zzf.zzi().zzc();
                        try {
                            return zzl.zzf.zzm().zzs(zzftVar2.zzaA().zzbp());
                        } catch (IOException e2) {
                            zzl.zzs.zzau().zzb().zzc("Data loss. Failed to bundle and serialize. appId", zzem.zzl(str), e2);
                            return bArr2;
                        }
                    } catch (SecurityException e3) {
                        zzl.zzs.zzau().zzj().zzb("app instance id encryption failed", e3.getMessage());
                        bArr = new byte[0];
                        zzknVar3 = zzl.zzf;
                    }
                } else {
                    zzl.zzs.zzau().zzj().zzb("Log and bundle disabled. package_name", str2);
                    bArr = new byte[0];
                    zzknVar3 = zzl.zzf;
                }
                zzknVar3.zzi().zzd();
                return bArr;
            } finally {
                zzl.zzf.zzi().zzd();
            }
        }
    }
}
