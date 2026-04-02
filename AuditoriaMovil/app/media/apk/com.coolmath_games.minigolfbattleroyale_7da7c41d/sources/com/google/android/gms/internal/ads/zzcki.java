package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
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
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcki extends zzcis implements zzauo, zzasm, zzavy, zzaoj, zzamz {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzanr zzf;
    private final zzcja zzi;
    private zzanc zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private final WeakReference<zzcjb> zzm;
    private zzcir zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private final String zzr;
    private final int zzs;
    private final ArrayList<zzaui> zzu;
    private volatile zzcjx zzv;
    private final Object zzt = new Object();
    private final Set<WeakReference<zzcju>> zzw = new HashSet();
    private final zzcjy zze = new zzcjy();
    private final zzanr zzg = new zzaox(zzark.zza, null, true, com.google.android.gms.ads.internal.util.zzs.zza, this);
    private final zzatq zzh = new zzatm(null);

    public zzcki(Context context, zzcja zzcjaVar, zzcjb zzcjbVar) {
        this.zzd = context;
        this.zzi = zzcjaVar;
        this.zzm = new WeakReference<>(zzcjbVar);
        this.zzf = new zzavn(this.zzd, zzark.zza, 0L, com.google.android.gms.ads.internal.util.zzs.zza, this, -1);
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        zza.incrementAndGet();
        zzanc zza = zzand.zza(new zzanr[]{this.zzg, this.zzf}, this.zzh, this.zze);
        this.zzj = zza;
        zza.zza(this);
        this.zzo = 0;
        this.zzq = 0L;
        this.zzp = 0;
        this.zzu = new ArrayList<>();
        this.zzv = null;
        this.zzr = (zzcjbVar == null || zzcjbVar.zzn() == null) ? "" : zzcjbVar.zzn();
        this.zzs = zzcjbVar != null ? zzcjbVar.zzp() : 0;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzn)).booleanValue()) {
            this.zzj.zzo();
        }
        if (zzcjbVar != null && zzcjbVar.zzD() > 0) {
            this.zzj.zzp(zzcjbVar.zzD());
        }
        if (zzcjbVar == null || zzcjbVar.zzE() <= 0) {
            return;
        }
        this.zzj.zzq(zzcjbVar.zzE());
    }

    private final boolean zzY() {
        return this.zzv != null && this.zzv.zzf();
    }

    public final void finalize() throws Throwable {
        zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final boolean zzA() {
        return this.zzj != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final int zzB() {
        return this.zzj.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzC() {
        return this.zzj.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final boolean zzD() {
        return this.zzj.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzE(boolean z) {
        this.zzj.zze(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzF(int i) {
        this.zze.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzG(int i) {
        this.zze.zzh(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzH() {
        return this.zzj.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzJ() {
        if (zzY() && this.zzv.zzg()) {
            return Math.min(this.zzo, this.zzv.zzi());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzK() {
        if (!zzY()) {
            synchronized (this.zzt) {
                while (!this.zzu.isEmpty()) {
                    long j = this.zzq;
                    Map<String, List<String>> zze = this.zzu.remove(0).zze();
                    long j2 = 0;
                    if (zze != null) {
                        Iterator<Map.Entry<String, List<String>>> it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry<String, List<String>> next = it.next();
                            if (next != null) {
                                try {
                                    if (next.getKey() != null && zzflf.zze("content-length", next.getKey()) && next.getValue() != null && next.getValue().get(0) != null) {
                                        j2 = Long.parseLong(next.getValue().get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzq = j + j2;
                }
            }
            return this.zzq;
        }
        return this.zzv.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final int zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzM(boolean z) {
        if (this.zzj != null) {
            for (int i = 0; i < 2; i++) {
                this.zzh.zzc(i, !z);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzN() {
        return this.zzj.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final long zzO() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzauo
    /* renamed from: zzR */
    public final void zzj(zzatz zzatzVar, zzaub zzaubVar) {
        if (zzatzVar instanceof zzaui) {
            synchronized (this.zzt) {
                this.zzu.add((zzaui) zzatzVar);
            }
        } else if (zzatzVar instanceof zzcjx) {
            this.zzv = (zzcjx) zzatzVar;
            final zzcjb zzcjbVar = this.zzm.get();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() && zzcjbVar != null && this.zzv.zze()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzv.zzg()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzv.zzh()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(zzcjbVar, hashMap) { // from class: com.google.android.gms.internal.ads.zzcjz
                    private final zzcjb zza;
                    private final Map zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzcjbVar;
                        this.zzb = hashMap;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcjb zzcjbVar2 = this.zza;
                        Map<String, ?> map = this.zzb;
                        int i = zzcki.zzc;
                        zzcjbVar2.zze("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    public final void zzS(zzatz zzatzVar, int i) {
        this.zzo += i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbet.zzc().zzc(com.google.android.gms.internal.ads.zzbjl.zzbl)).booleanValue() == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.android.gms.internal.ads.zzasr zzT(android.net.Uri r11, final java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzasn r9 = new com.google.android.gms.internal.ads.zzasn
            boolean r0 = r10.zzl
            if (r0 == 0) goto L22
            java.nio.ByteBuffer r0 = r10.zzk
            int r0 = r0.limit()
            if (r0 <= 0) goto L22
            java.nio.ByteBuffer r12 = r10.zzk
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.zzk
            r0.get(r12)
            com.google.android.gms.internal.ads.zzcka r0 = new com.google.android.gms.internal.ads.zzcka
            r0.<init>(r12)
        L20:
            r2 = r0
            goto L89
        L22:
            com.google.android.gms.internal.ads.zzbjd<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzbjl.zzbq
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbet.zzc()
            java.lang.Object r0 = r1.zzc(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L47
            com.google.android.gms.internal.ads.zzbjd<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzbjl.zzbl
            com.google.android.gms.internal.ads.zzbjj r2 = com.google.android.gms.internal.ads.zzbet.zzc()
            java.lang.Object r0 = r2.zzc(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4f
        L47:
            com.google.android.gms.internal.ads.zzcja r0 = r10.zzi
            boolean r0 = r0.zzj
            if (r0 != 0) goto L4e
            goto L4f
        L4e:
            r1 = 0
        L4f:
            com.google.android.gms.internal.ads.zzcja r0 = r10.zzi
            int r0 = r0.zzi
            if (r0 <= 0) goto L5b
            com.google.android.gms.internal.ads.zzckb r0 = new com.google.android.gms.internal.ads.zzckb
            r0.<init>(r10, r12, r1)
            goto L60
        L5b:
            com.google.android.gms.internal.ads.zzckc r0 = new com.google.android.gms.internal.ads.zzckc
            r0.<init>(r10, r12, r1)
        L60:
            com.google.android.gms.internal.ads.zzcja r12 = r10.zzi
            boolean r12 = r12.zzj
            if (r12 == 0) goto L6c
            com.google.android.gms.internal.ads.zzckd r12 = new com.google.android.gms.internal.ads.zzckd
            r12.<init>(r10, r0)
            r0 = r12
        L6c:
            java.nio.ByteBuffer r12 = r10.zzk
            if (r12 == 0) goto L20
            int r12 = r12.limit()
            if (r12 <= 0) goto L20
            java.nio.ByteBuffer r12 = r10.zzk
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.zzk
            r1.get(r12)
            com.google.android.gms.internal.ads.zzcke r1 = new com.google.android.gms.internal.ads.zzcke
            r1.<init>(r0, r12)
            r2 = r1
        L89:
            com.google.android.gms.internal.ads.zzbjd<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.zzbjl.zzm
            com.google.android.gms.internal.ads.zzbjj r0 = com.google.android.gms.internal.ads.zzbet.zzc()
            java.lang.Object r12 = r0.zzc(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L9e
            com.google.android.gms.internal.ads.zzapq r12 = com.google.android.gms.internal.ads.zzckf.zza
            goto La0
        L9e:
            com.google.android.gms.internal.ads.zzapq r12 = com.google.android.gms.internal.ads.zzckg.zza
        La0:
            r3 = r12
            com.google.android.gms.internal.ads.zzcja r12 = r10.zzi
            int r4 = r12.zzk
            com.google.android.gms.internal.ads.zzfla r5 = com.google.android.gms.ads.internal.util.zzs.zza
            r7 = 0
            com.google.android.gms.internal.ads.zzcja r12 = r10.zzi
            int r8 = r12.zzg
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcki.zzT(android.net.Uri, java.lang.String):com.google.android.gms.internal.ads.zzasr");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzatz zzU(zzaty zzatyVar) {
        return new zzcjx(this.zzd, zzatyVar.zza(), this.zzr, this.zzs, this, new zzcjw(this) { // from class: com.google.android.gms.internal.ads.zzckh
            private final zzcki zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcjw
            public final void zza(boolean z, long j) {
                this.zza.zzV(z, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzV(boolean z, long j) {
        zzcir zzcirVar = this.zzn;
        if (zzcirVar != null) {
            zzcirVar.zza(z, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzatz zzW(String str, boolean z) {
        zzcki zzckiVar = true != z ? null : this;
        zzcja zzcjaVar = this.zzi;
        return new zzaud(str, null, zzckiVar, zzcjaVar.zzd, zzcjaVar.zzf, true, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzatz zzX(String str, boolean z) {
        zzcki zzckiVar = true != z ? null : this;
        zzcja zzcjaVar = this.zzi;
        zzcju zzcjuVar = new zzcju(str, zzckiVar, zzcjaVar.zzd, zzcjaVar.zzf, zzcjaVar.zzi);
        this.zzw.add(new WeakReference<>(zzcjuVar));
        return zzcjuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzanx zzanxVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzatg zzatgVar, zzats zzatsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(boolean z, int i) {
        zzcir zzcirVar = this.zzn;
        if (zzcirVar != null) {
            zzcirVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze(zzamy zzamyVar) {
        zzcir zzcirVar = this.zzn;
        if (zzcirVar != null) {
            zzcirVar.zzu("onPlayerError", zzamyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzg(zzanq zzanqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaoj
    public final void zzh(zzanm zzanmVar) {
        zzcjb zzcjbVar = this.zzm.get();
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() || zzcjbVar == null || zzanmVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzanmVar.zze);
        hashMap.put("audioSampleMime", zzanmVar.zzf);
        hashMap.put("audioCodec", zzanmVar.zzc);
        zzcjbVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    public final void zzi(IOException iOException) {
        zzcir zzcirVar = this.zzn;
        if (zzcirVar != null) {
            if (this.zzi.zzl) {
                zzcirVar.zzv("onLoadException", iOException);
            } else {
                zzcirVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauo
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i) {
        this.zzo += i;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzl(zzanm zzanmVar) {
        zzcjb zzcjbVar = this.zzm.get();
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() || zzcjbVar == null || zzanmVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzanmVar.zzl));
        hashMap.put("bitRate", String.valueOf(zzanmVar.zzb));
        int i = zzanmVar.zzj;
        int i2 = zzanmVar.zzk;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        hashMap.put("resolution", sb.toString());
        hashMap.put("videoMime", zzanmVar.zze);
        hashMap.put("videoSampleMime", zzanmVar.zzf);
        hashMap.put("videoCodec", zzanmVar.zzc);
        zzcjbVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzm(int i, long j) {
        this.zzp += i;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzn(int i, int i2, int i3, float f) {
        zzcir zzcirVar = this.zzn;
        if (zzcirVar != null) {
            zzcirVar.zzc(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzo(Surface surface) {
        zzcir zzcirVar = this.zzn;
        if (zzcirVar != null) {
            zzcirVar.zzC();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzp(Uri[] uriArr, String str) {
        zzq(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzr(zzcir zzcirVar) {
        this.zzn = zzcirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzs() {
        zzanc zzancVar = this.zzj;
        if (zzancVar != null) {
            zzancVar.zzb(this);
            this.zzj.zzi();
            this.zzj = null;
            zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzt(Surface surface, boolean z) {
        if (this.zzj == null) {
            return;
        }
        zzanb zzanbVar = new zzanb(this.zzf, 1, surface);
        if (z) {
            this.zzj.zzk(zzanbVar);
        } else {
            this.zzj.zzj(zzanbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzu(float f, boolean z) {
        if (this.zzj == null) {
            return;
        }
        zzanb zzanbVar = new zzanb(this.zzg, 2, Float.valueOf(f));
        if (z) {
            this.zzj.zzk(zzanbVar);
        } else {
            this.zzj.zzj(zzanbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzv() {
        this.zzj.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzw(long j) {
        this.zzj.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzx(int i) {
        this.zze.zzi(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzy(int i) {
        this.zze.zzj(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzz(int i) {
        for (WeakReference<zzcju> weakReference : this.zzw) {
            zzcju zzcjuVar = weakReference.get();
            if (zzcjuVar != null) {
                zzcjuVar.zzg(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcis
    public final void zzq(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzasr zzasvVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z;
        int length = uriArr.length;
        if (length == 1) {
            zzasvVar = zzT(uriArr[0], str);
        } else {
            zzasr[] zzasrVarArr = new zzasr[length];
            for (int i = 0; i < uriArr.length; i++) {
                zzasrVarArr[i] = zzT(uriArr[i], str);
            }
            zzasvVar = new zzasv(zzasrVarArr);
        }
        this.zzj.zzd(zzasvVar);
        zzb.incrementAndGet();
    }
}
