package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzcmb extends zzcis implements zzay, zzda {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzclm zze;
    private final zzjt zzf;
    private final zzcja zzg;
    private final WeakReference<zzcjb> zzh;
    private final zzij zzi;
    private zzaie zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private zzcir zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private final String zzq;
    private final int zzr;
    @GuardedBy("httpDataSourcesLock")
    private final ArrayList<zzaw> zzt;
    private volatile zzclp zzu;
    private final Object zzs = new Object();
    private final Set<WeakReference<zzcll>> zzv = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f4, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbet.zzc().zzc(com.google.android.gms.internal.ads.zzbjl.zzbl)).booleanValue() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f8, code lost:
        if (r6.zzj == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fa, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fd, code lost:
        if (r6.zzi <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ff, code lost:
        r7 = new com.google.android.gms.internal.ads.zzclt(r4, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0105, code lost:
        r7 = new com.google.android.gms.internal.ads.zzclu(r4, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010c, code lost:
        if (r6.zzj == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010e, code lost:
        r6 = new com.google.android.gms.internal.ads.zzclv(r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0115, code lost:
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
        r5 = r4.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0118, code lost:
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
        if (r5.limit() <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
        r5 = new byte[r4.zzk.limit()];
        r4.zzk.get(r5);
        r6 = new com.google.android.gms.internal.ads.zzclw(r6, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzcmb(android.content.Context r5, com.google.android.gms.internal.ads.zzcja r6, com.google.android.gms.internal.ads.zzcjb r7) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmb.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcja, com.google.android.gms.internal.ads.zzcjb):void");
    }

    private final boolean zzU() {
        return this.zzu != null && this.zzu.zzl();
    }

    public final void finalize() {
        zzcis.zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final boolean zzA() {
        return this.zzj != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final int zzB() {
        return this.zzj.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzC() {
        return this.zzj.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final boolean zzD() {
        return this.zzj.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzE(boolean z) {
        this.zzj.zzL(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzF(int i2) {
        this.zze.zzj(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzG(int i2) {
        this.zze.zzk(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzH() {
        return this.zzj.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzI() {
        if (zzU()) {
            return 0L;
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzJ() {
        if (zzU() && this.zzu.zzm()) {
            return Math.min(this.zzn, this.zzu.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzK() {
        if (zzU()) {
            return this.zzu.zzp();
        }
        synchronized (this.zzs) {
            while (!this.zzt.isEmpty()) {
                long j2 = this.zzp;
                Map<String, List<String>> zzf = this.zzt.remove(0).zzf();
                long j3 = 0;
                if (zzf != null) {
                    Iterator<Map.Entry<String, List<String>>> it = zzf.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, List<String>> next = it.next();
                        if (next != null) {
                            try {
                                if (next.getKey() != null && zzflf.zze("content-length", next.getKey()) && next.getValue() != null && next.getValue().get(0) != null) {
                                    j3 = Long.parseLong(next.getValue().get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzp = j2 + j3;
            }
        }
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final int zzL() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzM(boolean z) {
        if (this.zzj == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            this.zzj.zzO();
            if (i2 >= 2) {
                return;
            }
            zzjt zzjtVar = this.zzf;
            zzjo zzg = zzjtVar.zzc().zzg();
            zzg.zzs(i2, !z);
            zzjtVar.zzd(zzg);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzN() {
        return this.zzj.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzO() {
        return this.zzn;
    }

    public final /* synthetic */ void zzR(boolean z, long j2) {
        zzcir zzcirVar = this.zzm;
        if (zzcirVar != null) {
            zzcirVar.zza(z, j2);
        }
    }

    public final /* synthetic */ zzaj zzS(String str, boolean z) {
        zzao zzaoVar = new zzao();
        zzaoVar.zzb(str);
        zzaoVar.zzf(true != z ? null : this);
        zzaoVar.zzc(this.zzg.zzd);
        zzaoVar.zzd(this.zzg.zzf);
        zzaoVar.zze(true);
        return zzaoVar.zza();
    }

    public final /* synthetic */ zzaj zzT(String str, boolean z) {
        zzcmb zzcmbVar = true != z ? null : this;
        zzcja zzcjaVar = this.zzg;
        zzcll zzcllVar = new zzcll(str, zzcmbVar, zzcjaVar.zzd, zzcjaVar.zzf, zzcjaVar.zzi);
        this.zzv.add(new WeakReference<>(zzcllVar));
        return zzcllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zza(zzaj zzajVar, zzan zzanVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzb(zzaj zzajVar, zzan zzanVar, boolean z) {
        if (zzajVar instanceof zzaw) {
            synchronized (this.zzs) {
                this.zzt.add((zzaw) zzajVar);
            }
        } else if (zzajVar instanceof zzclp) {
            this.zzu = (zzclp) zzajVar;
            final zzcjb zzcjbVar = this.zzh.get();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() && zzcjbVar != null && this.zzu.zzk()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzu.zzm()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzu.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(zzcjbVar, hashMap) { // from class: com.google.android.gms.internal.ads.zzclr
                    private final zzcjb zza;
                    private final Map zzb;

                    {
                        this.zza = zzcjbVar;
                        this.zzb = hashMap;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcjb zzcjbVar2 = this.zza;
                        Map<String, ?> map = this.zzb;
                        int i2 = zzcmb.zzc;
                        zzcjbVar2.zze("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzc(zzaj zzajVar, zzan zzanVar, boolean z, int i2) {
        this.zzn += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzd(zzaj zzajVar, zzan zzanVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zze(zzcz zzczVar, int i2) {
        zzcir zzcirVar = this.zzm;
        if (zzcirVar != null) {
            zzcirVar.zzb(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzf(zzcz zzczVar, zzahc zzahcVar) {
        zzcir zzcirVar = this.zzm;
        if (zzcirVar != null) {
            zzcirVar.zzu("onPlayerError", zzahcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzg(zzcz zzczVar, zzgx zzgxVar, zzhc zzhcVar, IOException iOException, boolean z) {
        zzcir zzcirVar = this.zzm;
        if (zzcirVar != null) {
            if (this.zzg.zzl) {
                zzcirVar.zzv("onLoadException", iOException);
            } else {
                zzcirVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzh(zzcz zzczVar, zzafv zzafvVar, zzba zzbaVar) {
        zzcjb zzcjbVar = this.zzh.get();
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() || zzcjbVar == null || zzafvVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzafvVar.zzk);
        hashMap.put("audioSampleMime", zzafvVar.zzl);
        hashMap.put("audioCodec", zzafvVar.zzi);
        zzcjbVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzi(zzcz zzczVar, zzafv zzafvVar, zzba zzbaVar) {
        zzcjb zzcjbVar = this.zzh.get();
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() || zzcjbVar == null || zzafvVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzafvVar.zzs));
        hashMap.put("bitRate", String.valueOf(zzafvVar.zzh));
        int i2 = zzafvVar.zzq;
        int i3 = zzafvVar.zzr;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        hashMap.put("resolution", sb.toString());
        hashMap.put("videoMime", zzafvVar.zzk);
        hashMap.put("videoSampleMime", zzafvVar.zzl);
        hashMap.put("videoCodec", zzafvVar.zzi);
        zzcjbVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzj(zzcz zzczVar, int i2, long j2) {
        this.zzo += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzk(zzcz zzczVar, Object obj, long j2) {
        zzcir zzcirVar = this.zzm;
        if (zzcirVar != null) {
            zzcirVar.zzC();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final void zzl(zzcz zzczVar, zzy zzyVar) {
        zzcir zzcirVar = this.zzm;
        if (zzcirVar != null) {
            zzcirVar.zzc(zzyVar.zzb, zzyVar.zzc);
        }
    }

    @VisibleForTesting
    public final zzhh zzm(Uri uri) {
        zzagb zzagbVar = new zzagb();
        zzagbVar.zzb(uri);
        zzagk zzc2 = zzagbVar.zzc();
        zzij zzijVar = this.zzi;
        zzijVar.zza(this.zzg.zzg);
        return zzijVar.zzb(zzc2);
    }

    public final /* synthetic */ zzahv[] zzn(Handler handler, zzmu zzmuVar, zzdq zzdqVar, zzakr zzakrVar, zzaiw zzaiwVar) {
        Context context = this.zzd;
        zzfs zzfsVar = zzfs.zzb;
        zzen zzenVar = new zzen(null, new zzde[0], false);
        zzfm zzfmVar = zzfm.zza;
        return new zzahv[]{new zzer(context, zzfmVar, zzfsVar, false, handler, zzdqVar, zzenVar), new zzlz(this.zzd, zzfmVar, zzfsVar, 0L, false, handler, zzmuVar, -1)};
    }

    public final /* synthetic */ zzaj zzo(zzai zzaiVar) {
        return new zzclp(this.zzd, zzaiVar.zza(), this.zzq, this.zzr, this, new zzclo(this) { // from class: com.google.android.gms.internal.ads.zzcma
            private final zzcmb zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzclo
            public final void zza(boolean z, long j2) {
                this.zza.zzR(z, j2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzp(Uri[] uriArr, String str) {
        zzq(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzq(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzhh zzhvVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z;
        int length = uriArr.length;
        if (length == 1) {
            zzhvVar = zzm(uriArr[0]);
        } else {
            zzhh[] zzhhVarArr = new zzhh[length];
            for (int i2 = 0; i2 < uriArr.length; i2++) {
                zzhhVarArr[i2] = zzm(uriArr[i2]);
            }
            zzhvVar = new zzhv(false, false, zzhhVarArr);
        }
        this.zzj.zzK(zzhvVar);
        this.zzj.zzJ();
        zzcis.zzb.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzr(zzcir zzcirVar) {
        this.zzm = zzcirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzs() {
        zzaie zzaieVar = this.zzj;
        if (zzaieVar != null) {
            zzaieVar.zzH(this);
            this.zzj.zzN();
            this.zzj = null;
            zzcis.zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzt(Surface surface, boolean z) {
        zzaie zzaieVar = this.zzj;
        if (zzaieVar == null) {
            return;
        }
        zzaieVar.zzy(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzu(float f2, boolean z) {
        zzaie zzaieVar = this.zzj;
        if (zzaieVar == null) {
            return;
        }
        zzaieVar.zzE(f2);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzv() {
        this.zzj.zzq(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzw(long j2) {
        zzaie zzaieVar = this.zzj;
        zzaieVar.zzp(zzaieVar.zzv(), j2);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzx(int i2) {
        this.zze.zzl(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzy(int i2) {
        this.zze.zzm(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzz(int i2) {
        for (WeakReference<zzcll> weakReference : this.zzv) {
            zzcll zzcllVar = weakReference.get();
            if (zzcllVar != null) {
                zzcllVar.zzl(i2);
            }
        }
    }
}
