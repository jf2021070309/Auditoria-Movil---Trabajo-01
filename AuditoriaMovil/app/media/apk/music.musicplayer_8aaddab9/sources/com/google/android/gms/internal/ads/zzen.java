package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import e.a.d.a.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
/* loaded from: classes.dex */
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
        int i2 = zzamq.zza;
        this.zze = new ConditionVariable(true);
        this.zzf = new zzea(new zzej(this, null));
        zzec zzecVar = new zzec();
        this.zza = zzecVar;
        zzew zzewVar = new zzew();
        this.zzb = zzewVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zzes(), zzecVar, zzewVar);
        Collections.addAll(arrayList, zzefVar.zza());
        this.zzc = (zzde[]) arrayList.toArray(new zzde[0]);
        this.zzd = new zzde[]{new zzeo()};
        this.zzy = 1.0f;
        this.zzo = zzg.zza;
        this.zzK = 0;
        this.zzL = new zzh(0, 0.0f);
        zzahf zzahfVar = zzahf.zza;
        this.zzq = new zzeg(zzahfVar, false, 0L, 0L, null);
        this.zzr = zzahfVar;
        this.zzF = -1;
        this.zzz = new zzde[0];
        this.zzA = new ByteBuffer[0];
        this.zzg = new ArrayDeque<>();
        this.zzi = new zzei<>(100L);
        this.zzj = new zzei<>(100L);
    }

    private final void zzD() {
        int i2 = 0;
        while (true) {
            zzde[] zzdeVarArr = this.zzz;
            if (i2 >= zzdeVarArr.length) {
                return;
            }
            zzde zzdeVar = zzdeVarArr[i2];
            zzdeVar.zzg();
            this.zzA[i2] = zzdeVar.zze();
            i2++;
        }
    }

    private final void zzE(long j2) throws zzdv {
        ByteBuffer byteBuffer;
        int length = this.zzz.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.zzA[i2 - 1];
            } else {
                byteBuffer = this.zzB;
                if (byteBuffer == null) {
                    byteBuffer = zzde.zza;
                }
            }
            if (i2 == length) {
                zzF(byteBuffer, j2);
            } else {
                zzde zzdeVar = this.zzz[i2];
                if (i2 > this.zzF) {
                    zzdeVar.zzc(byteBuffer);
                }
                ByteBuffer zze = zzdeVar.zze();
                this.zzA[i2] = zze;
                if (zze.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i2--;
        }
    }

    private final void zzF(ByteBuffer byteBuffer, long j2) throws zzdv {
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
            int i2 = zzamq.zza;
            if (i2 < 21) {
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
                if ((i2 < 24 || write != -6) && write != -32) {
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
            int i3 = this.zzm.zzc;
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
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
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
            float f2 = this.zzy;
            audioTrack.setStereoVolume(f2, f2);
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

    private final void zzK(long j2) {
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
        this.zzg.add(new zzeg(zzahfVar2, z, Math.max(0L, j2), this.zzm.zza(zzO()), null));
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
            int i2 = this.zzm.zza.zzA;
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
        int i2 = zzeeVar.zzc;
        return this.zzs / zzeeVar.zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzO() {
        zzee zzeeVar = this.zzm;
        int i2 = zzeeVar.zzc;
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
        if (!"audio/raw".equals(zzafvVar.zzl)) {
            int i2 = zzamq.zza;
            return 0;
        } else if (zzamq.zzP(zzafvVar.zzA)) {
            return zzafvVar.zzA != 2 ? 1 : 2;
        } else {
            a.D(33, "Invalid PCM encoding: ", zzafvVar.zzA, "DefaultAudioSink");
            return 0;
        }
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
        long j2 = min - zzegVar.zzd;
        if (zzegVar.zza.equals(zzahf.zza)) {
            zzJ = this.zzq.zzc + j2;
        } else if (this.zzg.isEmpty()) {
            zzJ = this.zzP.zzd(j2) + this.zzq.zzc;
        } else {
            zzeg first = this.zzg.getFirst();
            zzJ = first.zzc - zzamq.zzJ(first.zzd - min, this.zzq.zza.zzb);
        }
        return this.zzm.zza(this.zzP.zze()) + zzJ;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zze(zzafv zzafvVar, int i2, int[] iArr) throws zzdr {
        if (!"audio/raw".equals(zzafvVar.zzl)) {
            int i3 = zzamq.zza;
            String valueOf = String.valueOf(zzafvVar);
            valueOf.length();
            throw new zzdr("Unable to configure passthrough for: ".concat(valueOf), zzafvVar);
        }
        zzakt.zza(zzamq.zzP(zzafvVar.zzA));
        int zzS = zzamq.zzS(zzafvVar.zzA, zzafvVar.zzy);
        zzde[] zzdeVarArr = this.zzc;
        this.zzb.zzo(zzafvVar.zzB, zzafvVar.zzC);
        if (zzamq.zza < 21 && zzafvVar.zzy == 8 && iArr == null) {
            iArr = new int[6];
            for (int i4 = 0; i4 < 6; i4++) {
                iArr[i4] = i4;
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
            } catch (zzdd e2) {
                throw new zzdr(e2, zzafvVar);
            }
        }
        int i5 = zzdcVar.zzd;
        int i6 = zzdcVar.zzb;
        int zzR = zzamq.zzR(zzdcVar.zzc);
        int zzS2 = zzamq.zzS(i5, zzdcVar.zzc);
        if (i5 == 0) {
            String valueOf2 = String.valueOf(zzafvVar);
            throw new zzdr(a.r(new StringBuilder(valueOf2.length() + 48), "Invalid output encoding (mode=0) for: ", valueOf2), zzafvVar);
        } else if (zzR == 0) {
            String valueOf3 = String.valueOf(zzafvVar);
            throw new zzdr(a.r(new StringBuilder(valueOf3.length() + 54), "Invalid output channel config (mode=0) for: ", valueOf3), zzafvVar);
        } else {
            this.zzN = false;
            zzee zzeeVar = new zzee(zzafvVar, zzS, 0, zzS2, i6, zzR, i5, 0, false, zzdeVarArr);
            if (zzM()) {
                this.zzl = zzeeVar;
            } else {
                this.zzm = zzeeVar;
            }
        }
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
    public final boolean zzh(ByteBuffer byteBuffer, long j2, int i2) throws zzds, zzdv {
        ByteBuffer byteBuffer2 = this.zzB;
        zzakt.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzl != null) {
            if (!zzG()) {
                return false;
            }
            zzee zzeeVar = this.zzl;
            zzee zzeeVar2 = this.zzm;
            int i3 = zzeeVar2.zzc;
            int i4 = zzeeVar.zzc;
            if (zzeeVar2.zzg == zzeeVar.zzg && zzeeVar2.zze == zzeeVar.zze && zzeeVar2.zzf == zzeeVar.zzf && zzeeVar2.zzd == zzeeVar.zzd) {
                this.zzm = zzeeVar;
                this.zzl = null;
                if (zzP(this.zzn)) {
                    this.zzn.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.zzn;
                    zzafv zzafvVar = this.zzm.zza;
                    audioTrack.setOffloadDelayPadding(zzafvVar.zzB, zzafvVar.zzC);
                    this.zzO = true;
                }
            } else {
                zzQ();
                if (zzk()) {
                    return false;
                }
                zzt();
            }
            zzK(j2);
        }
        if (!zzM()) {
            try {
                this.zze.block();
                try {
                    zzee zzeeVar3 = this.zzm;
                    Objects.requireNonNull(zzeeVar3);
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
                    int i5 = zzeeVar4.zzc;
                    zzeaVar.zza(audioTrack4, false, zzeeVar4.zzg, zzeeVar4.zzd, zzeeVar4.zzh);
                    zzH();
                    int i6 = this.zzL.zza;
                    this.zzw = true;
                } catch (zzds e2) {
                    zzdt zzdtVar = this.zzk;
                    if (zzdtVar != null) {
                        zzdtVar.zzb(e2);
                    }
                    throw e2;
                }
            } catch (zzds e3) {
                this.zzi.zza(e3);
                return false;
            }
        }
        this.zzi.zzb();
        if (this.zzw) {
            this.zzx = Math.max(0L, j2);
            this.zzv = false;
            this.zzw = false;
            zzK(j2);
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
                int i7 = this.zzm.zzc;
                if (this.zzp != null) {
                    if (!zzG()) {
                        return false;
                    }
                    zzK(j2);
                    this.zzp = null;
                }
                long zzN = (((zzN() - this.zzb.zzq()) * 1000000) / this.zzm.zza.zzz) + this.zzx;
                if (!this.zzv && Math.abs(zzN - j2) > 200000) {
                    this.zzk.zzb(new zzdu(j2, zzN));
                    this.zzv = true;
                }
                if (this.zzv) {
                    if (!zzG()) {
                        return false;
                    }
                    long j3 = j2 - zzN;
                    this.zzx += j3;
                    this.zzv = false;
                    zzK(j2);
                    zzdt zzdtVar2 = this.zzk;
                    if (zzdtVar2 != null && j3 != 0) {
                        ((zzep) zzdtVar2).zza.zzp();
                    }
                }
                int i8 = this.zzm.zzc;
                this.zzs += byteBuffer.remaining();
                this.zzB = byteBuffer;
            }
            zzE(j2);
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
    public final void zzp(int i2) {
        if (this.zzK != i2) {
            this.zzK = i2;
            this.zzJ = i2 != 0;
            zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzq(zzh zzhVar) {
        if (this.zzL.equals(zzhVar)) {
            return;
        }
        int i2 = zzhVar.zza;
        if (this.zzn != null) {
            int i3 = this.zzL.zza;
        }
        this.zzL = zzhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzr(float f2) {
        if (this.zzy != f2) {
            this.zzy = f2;
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
                Objects.requireNonNull(zzemVar);
                zzemVar.zzb(this.zzn);
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
        for (int i2 = 0; i2 <= 0; i2++) {
            zzdeVarArr[i2].zzh();
        }
        this.zzI = false;
        this.zzN = false;
    }
}
