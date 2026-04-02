package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzen implements zzdw {
    private ByteBuffer[] zzA;
    private ByteBuffer zzB;
    private ByteBuffer zzC;
    private byte[] zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private int zzK;
    private zzh zzL;
    private long zzM;
    private boolean zzN;
    private boolean zzO;
    private final zzef zzP;
    private final zzec zza;
    private final zzew zzb;
    private final zzde[] zzc;
    private final zzde[] zzd;
    private final ConditionVariable zze;
    private final zzea zzf;
    private final ArrayDeque<zzeg> zzg;
    private zzem zzh;
    private final zzei<zzds> zzi;
    private final zzei<zzdv> zzj;
    private zzdt zzk;
    private zzee zzl;
    private zzee zzm;
    private AudioTrack zzn;
    private zzg zzo;
    private zzeg zzp;
    private zzeg zzq;
    private final zzahf zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private boolean zzv;
    private boolean zzw;
    private long zzx;
    private float zzy;
    private zzde[] zzz;

    public zzen(zzdb zzdbVar, zzde[] zzdeVarArr, boolean z) {
        zzef zzefVar = new zzef(zzdeVarArr);
        this.zzP = zzefVar;
        int i = zzamq.zza;
        this.zze = new ConditionVariable(true);
        this.zzf = new zzea(new zzej(this, null));
        this.zza = new zzec();
        this.zzb = new zzew();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zzes(), this.zza, this.zzb);
        Collections.addAll(arrayList, zzefVar.zza());
        this.zzc = (zzde[]) arrayList.toArray(new zzde[0]);
        this.zzd = new zzde[]{new zzeo()};
        this.zzy = 1.0f;
        this.zzo = zzg.zza;
        this.zzK = 0;
        this.zzL = new zzh(0, 0.0f);
        this.zzq = new zzeg(zzahf.zza, false, 0L, 0L, null);
        this.zzr = zzahf.zza;
        this.zzF = -1;
        this.zzz = new zzde[0];
        this.zzA = new ByteBuffer[0];
        this.zzg = new ArrayDeque<>();
        this.zzi = new zzei<>(100L);
        this.zzj = new zzei<>(100L);
    }

    private final void zzD() {
        int i = 0;
        while (true) {
            zzde[] zzdeVarArr = this.zzz;
            if (i >= zzdeVarArr.length) {
                return;
            }
            zzde zzdeVar = zzdeVarArr[i];
            zzdeVar.zzg();
            this.zzA[i] = zzdeVar.zze();
            i++;
        }
    }

    private final void zzE(long j) throws zzdv {
        ByteBuffer byteBuffer;
        int length = this.zzz.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzA[i - 1];
            } else {
                byteBuffer = this.zzB;
                if (byteBuffer == null) {
                    byteBuffer = zzde.zza;
                }
            }
            if (i == length) {
                zzF(byteBuffer, j);
            } else {
                zzde zzdeVar = this.zzz[i];
                if (i > this.zzF) {
                    zzdeVar.zzc(byteBuffer);
                }
                ByteBuffer zze = zzdeVar.zze();
                this.zzA[i] = zze;
                if (zze.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    private final void zzF(ByteBuffer byteBuffer, long j) throws zzdv {
        int write;
        zzahu zzahuVar;
        zzahu zzahuVar2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzC;
            boolean z = true;
            if (byteBuffer2 != null) {
                zzakt.zza(byteBuffer2 == byteBuffer);
            } else {
                this.zzC = byteBuffer;
                if (zzamq.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzD;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzD = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzD, 0, remaining);
                    byteBuffer.position(position);
                    this.zzE = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (zzamq.zza < 21) {
                int zzf = this.zzf.zzf(this.zzt);
                if (zzf > 0) {
                    write = this.zzn.write(this.zzD, this.zzE, Math.min(remaining2, zzf));
                    if (write > 0) {
                        this.zzE += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzn.write(byteBuffer, remaining2, 1);
            }
            this.zzM = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((zzamq.zza < 24 || write != -6) && write != -32) {
                    z = false;
                }
                zzdv zzdvVar = new zzdv(write, this.zzm.zza, z);
                zzdt zzdtVar = this.zzk;
                if (zzdtVar != null) {
                    zzdtVar.zzb(zzdvVar);
                }
                if (zzdvVar.zza) {
                    throw zzdvVar;
                }
                this.zzj.zza(zzdvVar);
                return;
            }
            this.zzj.zzb();
            if (zzP(this.zzn) && this.zzI && this.zzk != null && write < remaining2 && !this.zzO) {
                long zzg = this.zzf.zzg(0L);
                zzep zzepVar = (zzep) this.zzk;
                zzahuVar = zzepVar.zza.zzl;
                if (zzahuVar != null) {
                    zzahuVar2 = zzepVar.zza.zzl;
                    zzahuVar2.zza(zzg);
                }
            }
            int i = this.zzm.zzc;
            this.zzt += write;
            if (write == remaining2) {
                this.zzC = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzG() throws com.google.android.gms.internal.ads.zzdv {
        /*
            r9 = this;
            int r0 = r9.zzF
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.zzF = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.zzF
            com.google.android.gms.internal.ads.zzde[] r5 = r9.zzz
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.zzd()
        L1f:
            r9.zzE(r7)
            boolean r0 = r4.zzf()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.zzF
            int r0 = r0 + r2
            r9.zzF = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.zzC
            if (r0 == 0) goto L3b
            r9.zzF(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzC
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.zzF = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzen.zzG():boolean");
    }

    private final void zzH() {
        if (zzM()) {
            if (zzamq.zza >= 21) {
                this.zzn.setVolume(this.zzy);
                return;
            }
            AudioTrack audioTrack = this.zzn;
            float f = this.zzy;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final void zzI(zzahf zzahfVar, boolean z) {
        zzeg zzJ = zzJ();
        if (zzahfVar.equals(zzJ.zza) && z == zzJ.zzb) {
            return;
        }
        zzeg zzegVar = new zzeg(zzahfVar, z, -9223372036854775807L, -9223372036854775807L, null);
        if (zzM()) {
            this.zzp = zzegVar;
        } else {
            this.zzq = zzegVar;
        }
    }

    private final zzeg zzJ() {
        zzeg zzegVar = this.zzp;
        return zzegVar != null ? zzegVar : !this.zzg.isEmpty() ? this.zzg.getLast() : this.zzq;
    }

    private final void zzK(long j) {
        zzahf zzahfVar;
        boolean z;
        zzdp zzdpVar;
        if (zzL()) {
            zzef zzefVar = this.zzP;
            zzahfVar = zzJ().zza;
            zzefVar.zzb(zzahfVar);
        } else {
            zzahfVar = zzahf.zza;
        }
        zzahf zzahfVar2 = zzahfVar;
        if (zzL()) {
            zzef zzefVar2 = this.zzP;
            boolean z2 = zzJ().zzb;
            zzefVar2.zzc(z2);
            z = z2;
        } else {
            z = false;
        }
        this.zzg.add(new zzeg(zzahfVar2, z, Math.max(0L, j), this.zzm.zza(zzO()), null));
        zzde[] zzdeVarArr = this.zzm.zzi;
        ArrayList arrayList = new ArrayList();
        for (zzde zzdeVar : zzdeVarArr) {
            if (zzdeVar.zzb()) {
                arrayList.add(zzdeVar);
            } else {
                zzdeVar.zzg();
            }
        }
        int size = arrayList.size();
        this.zzz = (zzde[]) arrayList.toArray(new zzde[size]);
        this.zzA = new ByteBuffer[size];
        zzD();
        zzdt zzdtVar = this.zzk;
        if (zzdtVar != null) {
            zzdpVar = ((zzep) zzdtVar).zza.zzc;
            zzdpVar.zzh(z);
        }
    }

    private final boolean zzL() {
        if ("audio/raw".equals(this.zzm.zza.zzl)) {
            int i = this.zzm.zza.zzA;
            return true;
        }
        return false;
    }

    private final boolean zzM() {
        return this.zzn != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzN() {
        zzee zzeeVar = this.zzm;
        int i = zzeeVar.zzc;
        return this.zzs / zzeeVar.zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzO() {
        zzee zzeeVar = this.zzm;
        int i = zzeeVar.zzc;
        return this.zzt / zzeeVar.zzd;
    }

    private static boolean zzP(AudioTrack audioTrack) {
        return zzamq.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final void zzQ() {
        if (this.zzH) {
            return;
        }
        this.zzH = true;
        this.zzf.zzi(zzO());
        this.zzn.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zza(zzdt zzdtVar) {
        this.zzk = zzdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final boolean zzb(zzafv zzafvVar) {
        return zzc(zzafvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final int zzc(zzafv zzafvVar) {
        if ("audio/raw".equals(zzafvVar.zzl)) {
            if (zzamq.zzP(zzafvVar.zzA)) {
                return zzafvVar.zzA != 2 ? 1 : 2;
            }
            int i = zzafvVar.zzA;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid PCM encoding: ");
            sb.append(i);
            Log.w("DefaultAudioSink", sb.toString());
            return 0;
        }
        int i2 = zzamq.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final long zzd(boolean z) {
        long zzJ;
        if (!zzM() || this.zzw) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzf.zzb(z), this.zzm.zza(zzO()));
        while (!this.zzg.isEmpty() && min >= this.zzg.getFirst().zzd) {
            this.zzq = this.zzg.remove();
        }
        zzeg zzegVar = this.zzq;
        long j = min - zzegVar.zzd;
        if (zzegVar.zza.equals(zzahf.zza)) {
            zzJ = this.zzq.zzc + j;
        } else if (this.zzg.isEmpty()) {
            zzJ = this.zzP.zzd(j) + this.zzq.zzc;
        } else {
            zzeg first = this.zzg.getFirst();
            zzJ = first.zzc - zzamq.zzJ(first.zzd - min, this.zzq.zza.zzb);
        }
        return zzJ + this.zzm.zza(this.zzP.zze());
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zze(zzafv zzafvVar, int i, int[] iArr) throws zzdr {
        if ("audio/raw".equals(zzafvVar.zzl)) {
            zzakt.zza(zzamq.zzP(zzafvVar.zzA));
            int zzS = zzamq.zzS(zzafvVar.zzA, zzafvVar.zzy);
            int i2 = zzafvVar.zzA;
            zzde[] zzdeVarArr = this.zzc;
            this.zzb.zzo(zzafvVar.zzB, zzafvVar.zzC);
            if (zzamq.zza < 21 && zzafvVar.zzy == 8 && iArr == null) {
                iArr = new int[6];
                for (int i3 = 0; i3 < 6; i3++) {
                    iArr[i3] = i3;
                }
            }
            this.zza.zzo(iArr);
            zzdc zzdcVar = new zzdc(zzafvVar.zzz, zzafvVar.zzy, zzafvVar.zzA);
            for (zzde zzdeVar : zzdeVarArr) {
                try {
                    zzdc zza = zzdeVar.zza(zzdcVar);
                    if (true == zzdeVar.zzb()) {
                        zzdcVar = zza;
                    }
                } catch (zzdd e) {
                    throw new zzdr(e, zzafvVar);
                }
            }
            int i4 = zzdcVar.zzd;
            int i5 = zzdcVar.zzb;
            int zzR = zzamq.zzR(zzdcVar.zzc);
            int zzS2 = zzamq.zzS(i4, zzdcVar.zzc);
            if (i4 == 0) {
                String valueOf = String.valueOf(zzafvVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Invalid output encoding (mode=0) for: ");
                sb.append(valueOf);
                throw new zzdr(sb.toString(), zzafvVar);
            } else if (zzR != 0) {
                this.zzN = false;
                zzee zzeeVar = new zzee(zzafvVar, zzS, 0, zzS2, i5, zzR, i4, 0, false, zzdeVarArr);
                if (zzM()) {
                    this.zzl = zzeeVar;
                    return;
                } else {
                    this.zzm = zzeeVar;
                    return;
                }
            } else {
                String valueOf2 = String.valueOf(zzafvVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 54);
                sb2.append("Invalid output channel config (mode=0) for: ");
                sb2.append(valueOf2);
                throw new zzdr(sb2.toString(), zzafvVar);
            }
        }
        int i6 = zzafvVar.zzz;
        int i7 = zzamq.zza;
        String valueOf3 = String.valueOf(zzafvVar);
        String.valueOf(valueOf3).length();
        throw new zzdr("Unable to configure passthrough for: ".concat(String.valueOf(valueOf3)), zzafvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzf() {
        this.zzI = true;
        if (zzM()) {
            this.zzf.zzc();
            this.zzn.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzg() {
        this.zzv = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final boolean zzh(ByteBuffer byteBuffer, long j, int i) throws zzds, zzdv {
        ByteBuffer byteBuffer2 = this.zzB;
        zzakt.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzl != null) {
            if (!zzG()) {
                return false;
            }
            zzee zzeeVar = this.zzl;
            zzee zzeeVar2 = this.zzm;
            int i2 = zzeeVar2.zzc;
            int i3 = zzeeVar.zzc;
            if (zzeeVar2.zzg != zzeeVar.zzg || zzeeVar2.zze != zzeeVar.zze || zzeeVar2.zzf != zzeeVar.zzf || zzeeVar2.zzd != zzeeVar.zzd) {
                zzQ();
                if (zzk()) {
                    return false;
                }
                zzt();
            } else {
                this.zzm = zzeeVar;
                this.zzl = null;
                if (zzP(this.zzn)) {
                    this.zzn.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.zzn;
                    zzafv zzafvVar = this.zzm.zza;
                    audioTrack.setOffloadDelayPadding(zzafvVar.zzB, zzafvVar.zzC);
                    this.zzO = true;
                }
            }
            zzK(j);
        }
        if (!zzM()) {
            try {
                this.zze.block();
                try {
                    zzee zzeeVar3 = this.zzm;
                    if (zzeeVar3 != null) {
                        AudioTrack zzc = zzeeVar3.zzc(false, this.zzo, this.zzK);
                        this.zzn = zzc;
                        if (zzP(zzc)) {
                            AudioTrack audioTrack2 = this.zzn;
                            if (this.zzh == null) {
                                this.zzh = new zzem(this);
                            }
                            this.zzh.zza(audioTrack2);
                            AudioTrack audioTrack3 = this.zzn;
                            zzafv zzafvVar2 = this.zzm.zza;
                            audioTrack3.setOffloadDelayPadding(zzafvVar2.zzB, zzafvVar2.zzC);
                        }
                        this.zzK = this.zzn.getAudioSessionId();
                        zzea zzeaVar = this.zzf;
                        AudioTrack audioTrack4 = this.zzn;
                        zzee zzeeVar4 = this.zzm;
                        int i4 = zzeeVar4.zzc;
                        zzeaVar.zza(audioTrack4, false, zzeeVar4.zzg, zzeeVar4.zzd, zzeeVar4.zzh);
                        zzH();
                        int i5 = this.zzL.zza;
                        this.zzw = true;
                    } else {
                        throw null;
                    }
                } catch (zzds e) {
                    zzdt zzdtVar = this.zzk;
                    if (zzdtVar != null) {
                        zzdtVar.zzb(e);
                    }
                    throw e;
                }
            } catch (zzds e2) {
                this.zzi.zza(e2);
                return false;
            }
        }
        this.zzi.zzb();
        if (this.zzw) {
            this.zzx = Math.max(0L, j);
            this.zzv = false;
            this.zzw = false;
            zzK(j);
            if (this.zzI) {
                zzf();
            }
        }
        if (this.zzf.zze(zzO())) {
            if (this.zzB == null) {
                zzakt.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                int i6 = this.zzm.zzc;
                if (this.zzp != null) {
                    if (!zzG()) {
                        return false;
                    }
                    zzK(j);
                    this.zzp = null;
                }
                long zzN = this.zzx + (((zzN() - this.zzb.zzq()) * 1000000) / this.zzm.zza.zzz);
                if (!this.zzv && Math.abs(zzN - j) > 200000) {
                    this.zzk.zzb(new zzdu(j, zzN));
                    this.zzv = true;
                }
                if (this.zzv) {
                    if (!zzG()) {
                        return false;
                    }
                    long j2 = j - zzN;
                    this.zzx += j2;
                    this.zzv = false;
                    zzK(j);
                    zzdt zzdtVar2 = this.zzk;
                    if (zzdtVar2 != null && j2 != 0) {
                        ((zzep) zzdtVar2).zza.zzp();
                    }
                }
                int i7 = this.zzm.zzc;
                this.zzs += byteBuffer.remaining();
                this.zzB = byteBuffer;
            }
            zzE(j);
            if (!this.zzB.hasRemaining()) {
                this.zzB = null;
                return true;
            } else if (this.zzf.zzh(zzO())) {
                Log.w("DefaultAudioSink", "Resetting stalled audio track");
                zzt();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzi() throws zzdv {
        if (!this.zzG && zzM() && zzG()) {
            zzQ();
            this.zzG = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final boolean zzj() {
        return !zzM() || (this.zzG && !zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final boolean zzk() {
        return zzM() && this.zzf.zzj(zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzl(zzahf zzahfVar) {
        zzI(new zzahf(zzamq.zzz(zzahfVar.zzb, 0.1f, 8.0f), zzamq.zzz(zzahfVar.zzc, 0.1f, 8.0f)), zzJ().zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final zzahf zzm() {
        return zzJ().zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzn(boolean z) {
        zzI(zzJ().zza, z);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzo(zzg zzgVar) {
        if (this.zzo.equals(zzgVar)) {
            return;
        }
        this.zzo = zzgVar;
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzp(int i) {
        if (this.zzK != i) {
            this.zzK = i;
            this.zzJ = i != 0;
            zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzq(zzh zzhVar) {
        if (this.zzL.equals(zzhVar)) {
            return;
        }
        int i = zzhVar.zza;
        float f = zzhVar.zzb;
        if (this.zzn != null) {
            int i2 = this.zzL.zza;
        }
        this.zzL = zzhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzr(float f) {
        if (this.zzy != f) {
            this.zzy = f;
            zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzs() {
        this.zzI = false;
        if (zzM() && this.zzf.zzk()) {
            this.zzn.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzt() {
        if (zzM()) {
            this.zzs = 0L;
            this.zzt = 0L;
            this.zzu = 0L;
            this.zzO = false;
            this.zzq = new zzeg(zzJ().zza, zzJ().zzb, 0L, 0L, null);
            this.zzx = 0L;
            this.zzp = null;
            this.zzg.clear();
            this.zzB = null;
            this.zzC = null;
            this.zzH = false;
            this.zzG = false;
            this.zzF = -1;
            this.zzb.zzp();
            zzD();
            if (this.zzf.zzd()) {
                this.zzn.pause();
            }
            if (zzP(this.zzn)) {
                zzem zzemVar = this.zzh;
                if (zzemVar != null) {
                    zzemVar.zzb(this.zzn);
                } else {
                    throw null;
                }
            }
            AudioTrack audioTrack = this.zzn;
            this.zzn = null;
            if (zzamq.zza < 21 && !this.zzJ) {
                this.zzK = 0;
            }
            zzee zzeeVar = this.zzl;
            if (zzeeVar != null) {
                this.zzm = zzeeVar;
                this.zzl = null;
            }
            this.zzf.zzl();
            this.zze.close();
            new zzed(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.zzj.zzb();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzu() {
        zzt();
        for (zzde zzdeVar : this.zzc) {
            zzdeVar.zzh();
        }
        zzde[] zzdeVarArr = this.zzd;
        int length = zzdeVarArr.length;
        for (int i = 0; i <= 0; i++) {
            zzdeVarArr[i].zzh();
        }
        this.zzI = false;
        this.zzN = false;
    }
}
