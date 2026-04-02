package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.util.FileSize;
import e.a.d.a.a;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
/* loaded from: classes.dex */
public final class zzaot {
    private Method zzA;
    private int zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private float zzM;
    private zzaob[] zzN;
    private ByteBuffer[] zzO;
    private ByteBuffer zzP;
    private ByteBuffer zzQ;
    private byte[] zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private final zzaou zza;
    private final zzapa zzb;
    private final zzaob[] zzc;
    private final zzaop zzd;
    private final ConditionVariable zze = new ConditionVariable(true);
    private final long[] zzf;
    private final zzaol zzg;
    private final LinkedList<zzaor> zzh;
    private AudioTrack zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private zzanq zzq;
    private zzanq zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    public zzaot(zzanz zzanzVar, zzaob[] zzaobVarArr, zzaop zzaopVar) {
        this.zzd = zzaopVar;
        if (zzave.zza >= 18) {
            try {
                this.zzA = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzave.zza >= 19) {
            this.zzg = new zzaom();
        } else {
            this.zzg = new zzaol(null);
        }
        zzaou zzaouVar = new zzaou();
        this.zza = zzaouVar;
        zzapa zzapaVar = new zzapa();
        this.zzb = zzapaVar;
        this.zzc = r1;
        System.arraycopy(zzaobVarArr, 0, r1, 2, 0);
        zzaob[] zzaobVarArr2 = {new zzaoy(), zzaouVar, zzapaVar};
        this.zzf = new long[10];
        this.zzM = 1.0f;
        this.zzI = 0;
        this.zzW = 0;
        this.zzr = zzanq.zza;
        this.zzT = -1;
        this.zzN = new zzaob[0];
        this.zzO = new ByteBuffer[0];
        this.zzh = new LinkedList<>();
    }

    private final void zzp() {
        ArrayList arrayList = new ArrayList();
        zzaob[] zzaobVarArr = this.zzc;
        for (int i2 = 0; i2 < 3; i2++) {
            zzaob zzaobVar = zzaobVarArr[i2];
            if (zzaobVar.zzb()) {
                arrayList.add(zzaobVar);
            } else {
                zzaobVar.zzi();
            }
        }
        int size = arrayList.size();
        this.zzN = (zzaob[]) arrayList.toArray(new zzaob[size]);
        this.zzO = new ByteBuffer[size];
        for (int i3 = 0; i3 < size; i3++) {
            zzaob zzaobVar2 = this.zzN[i3];
            zzaobVar2.zzi();
            this.zzO[i3] = zzaobVar2.zzg();
        }
    }

    private final void zzq(long j2) throws zzaos {
        ByteBuffer byteBuffer;
        int length = this.zzN.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.zzO[i2 - 1];
            } else {
                byteBuffer = this.zzP;
                if (byteBuffer == null) {
                    byteBuffer = zzaob.zza;
                }
            }
            if (i2 == length) {
                zzr(byteBuffer, j2);
            } else {
                zzaob zzaobVar = this.zzN[i2];
                zzaobVar.zze(byteBuffer);
                ByteBuffer zzg = zzaobVar.zzg();
                this.zzO[i2] = zzg;
                if (zzg.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i2--;
        }
    }

    private final boolean zzr(ByteBuffer byteBuffer, long j2) throws zzaos {
        int write;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzQ;
            if (byteBuffer2 != null) {
                zzaup.zza(byteBuffer2 == byteBuffer);
            } else {
                this.zzQ = byteBuffer;
                if (zzave.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzR;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzR = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzR, 0, remaining);
                    byteBuffer.position(position);
                    this.zzS = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (zzave.zza < 21) {
                int zzd = this.zzo - ((int) (this.zzF - (this.zzg.zzd() * this.zzE)));
                if (zzd > 0) {
                    write = this.zzi.write(this.zzR, this.zzS, Math.min(remaining2, zzd));
                    if (write > 0) {
                        this.zzS += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzi.write(byteBuffer, remaining2, 1);
            }
            this.zzY = SystemClock.elapsedRealtime();
            if (write >= 0) {
                boolean z = this.zzn;
                if (!z) {
                    this.zzF += write;
                }
                if (write == remaining2) {
                    if (z) {
                        this.zzG += this.zzH;
                    }
                    this.zzQ = null;
                    return true;
                }
                return false;
            }
            throw new zzaos(write);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzs() throws com.google.android.gms.internal.ads.zzaos {
        /*
            r9 = this;
            int r0 = r9.zzT
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.zzn
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzaob[] r0 = r9.zzN
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.zzT = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.zzT
            com.google.android.gms.internal.ads.zzaob[] r5 = r9.zzN
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.zzf()
        L28:
            r9.zzq(r7)
            boolean r0 = r4.zzh()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.zzT
            int r0 = r0 + r2
            r9.zzT = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L44
            r9.zzr(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.zzT = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaot.zzs():boolean");
    }

    private final void zzt() {
        if (zzu()) {
            if (zzave.zza >= 21) {
                this.zzi.setVolume(this.zzM);
                return;
            }
            AudioTrack audioTrack = this.zzi;
            float f2 = this.zzM;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    private final boolean zzu() {
        return this.zzi != null;
    }

    private final long zzv(long j2) {
        return (j2 * 1000000) / this.zzj;
    }

    private final long zzw(long j2) {
        return (j2 * this.zzj) / 1000000;
    }

    private final long zzx() {
        return this.zzn ? this.zzG : this.zzF / this.zzE;
    }

    private final void zzy() {
        this.zzw = 0L;
        this.zzv = 0;
        this.zzu = 0;
        this.zzx = 0L;
        this.zzy = false;
        this.zzz = 0L;
    }

    private final boolean zzz() {
        int i2;
        return zzave.zza < 23 && ((i2 = this.zzm) == 5 || i2 == 6);
    }

    public final long zzb(boolean z) {
        long zze;
        long j2;
        long j3;
        long j4;
        long j5;
        zzanq zzanqVar;
        long j6;
        long j7;
        Method method;
        if (!zzu() || this.zzI == 0) {
            return Long.MIN_VALUE;
        }
        if (this.zzi.getPlayState() == 3) {
            long zze2 = this.zzg.zze();
            if (zze2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzx >= 30000) {
                    long[] jArr = this.zzf;
                    int i2 = this.zzu;
                    jArr[i2] = zze2 - nanoTime;
                    this.zzu = (i2 + 1) % 10;
                    int i3 = this.zzv;
                    if (i3 < 10) {
                        this.zzv = i3 + 1;
                    }
                    this.zzx = nanoTime;
                    this.zzw = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.zzv;
                        if (i4 >= i5) {
                            break;
                        }
                        this.zzw = (this.zzf[i4] / i5) + this.zzw;
                        i4++;
                    }
                }
                if (!zzz() && nanoTime - this.zzz >= 500000) {
                    boolean zzf = this.zzg.zzf();
                    this.zzy = zzf;
                    if (zzf) {
                        long zzg = this.zzg.zzg() / 1000;
                        long zzh = this.zzg.zzh();
                        if (zzg < this.zzK) {
                            this.zzy = false;
                        } else if (Math.abs(zzg - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder((int) SyslogConstants.LOG_LOCAL1);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(zzh);
                            sb.append(", ");
                            sb.append(zzg);
                            a.K(sb, ", ", nanoTime, ", ");
                            sb.append(zze2);
                            Log.w("AudioTrack", sb.toString());
                            this.zzy = false;
                        } else if (Math.abs(zzv(zzh) - zze2) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(zzh);
                            sb2.append(", ");
                            sb2.append(zzg);
                            a.K(sb2, ", ", nanoTime, ", ");
                            sb2.append(zze2);
                            Log.w("AudioTrack", sb2.toString());
                            this.zzy = false;
                        }
                    }
                    if (this.zzA != null && !this.zzn) {
                        try {
                            long intValue = (((Integer) method.invoke(this.zzi, null)).intValue() * 1000) - this.zzp;
                            this.zzL = intValue;
                            long max = Math.max(intValue, 0L);
                            this.zzL = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.zzL = 0L;
                            }
                        } catch (Exception unused) {
                            this.zzA = null;
                        }
                    }
                    this.zzz = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.zzy) {
            zze = zzv(this.zzg.zzh() + zzw(nanoTime2 - (this.zzg.zzg() / 1000)));
        } else {
            zze = this.zzv == 0 ? this.zzg.zze() : nanoTime2 + this.zzw;
            if (!z) {
                zze -= this.zzL;
            }
        }
        long j8 = this.zzJ;
        while (!this.zzh.isEmpty()) {
            j5 = this.zzh.getFirst().zzc;
            if (zze < j5) {
                break;
            }
            zzaor remove = this.zzh.remove();
            zzanqVar = remove.zza;
            this.zzr = zzanqVar;
            j6 = remove.zzc;
            this.zzt = j6;
            j7 = remove.zzb;
            this.zzs = j7 - this.zzJ;
        }
        if (this.zzr.zzb == 1.0f) {
            j4 = (zze + this.zzs) - this.zzt;
        } else {
            if (!this.zzh.isEmpty() || this.zzb.zzn() < FileSize.KB_COEFFICIENT) {
                j2 = this.zzs;
                double d2 = this.zzr.zzb;
                double d3 = zze - this.zzt;
                Double.isNaN(d2);
                Double.isNaN(d3);
                j3 = (long) (d2 * d3);
            } else {
                j2 = this.zzs;
                j3 = zzave.zzj(zze - this.zzt, this.zzb.zzm(), this.zzb.zzn());
            }
            j4 = j3 + j2;
        }
        return j8 + j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(java.lang.String r7, int r8, int r9, int r10, int r11, int[] r12) throws com.google.android.gms.internal.ads.zzaon {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaot.zzc(java.lang.String, int, int, int, int, int[]):void");
    }

    public final void zzd() {
        this.zzV = true;
        if (zzu()) {
            this.zzK = System.nanoTime() / 1000;
            this.zzi.play();
        }
    }

    public final void zze() {
        if (this.zzI == 1) {
            this.zzI = 2;
        }
    }

    public final boolean zzf(ByteBuffer byteBuffer, long j2) throws zzaoo, zzaos {
        int i2;
        zzaoi zzaoiVar;
        zzaoi zzaoiVar2;
        ByteBuffer byteBuffer2 = this.zzP;
        zzaup.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!zzu()) {
            this.zze.block();
            int i3 = this.zzW;
            if (i3 == 0) {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1);
            } else {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1, i3);
            }
            int state = this.zzi.getState();
            if (state != 1) {
                try {
                    this.zzi.release();
                } catch (Exception unused) {
                } finally {
                    this.zzi = null;
                }
                throw new zzaoo(state, this.zzj, this.zzk, this.zzo);
            }
            int audioSessionId = this.zzi.getAudioSessionId();
            if (this.zzW != audioSessionId) {
                this.zzW = audioSessionId;
                zzaoiVar2 = ((zzaov) this.zzd).zza.zzb;
                zzaoiVar2.zzg(audioSessionId);
            }
            this.zzg.zza(this.zzi, zzz());
            zzt();
            this.zzX = false;
            if (this.zzV) {
                zzd();
            }
        }
        if (zzz()) {
            if (this.zzi.getPlayState() == 2) {
                this.zzX = false;
                return false;
            } else if (this.zzi.getPlayState() == 1 && this.zzg.zzd() != 0) {
                return false;
            }
        }
        boolean z = this.zzX;
        boolean zzi = zzi();
        this.zzX = zzi;
        if (z && !zzi && this.zzi.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.zzY;
            zzaop zzaopVar = this.zzd;
            int i4 = this.zzo;
            long zza = zzamx.zza(this.zzp);
            zzaoiVar = ((zzaov) zzaopVar).zza.zzb;
            zzaoiVar.zze(i4, zza, elapsedRealtime - j3);
        }
        if (this.zzP == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzn && this.zzH == 0) {
                int i5 = this.zzm;
                if (i5 == 7 || i5 == 8) {
                    int position = byteBuffer.position();
                    i2 = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i5 == 5) {
                    i2 = 1536;
                } else if (i5 != 6) {
                    throw new IllegalStateException(a.R(38, "Unexpected audio encoding: ", i5));
                } else {
                    i2 = zzany.zzc(byteBuffer);
                }
                this.zzH = i2;
            }
            if (this.zzq != null) {
                if (!zzs()) {
                    return false;
                }
                this.zzh.add(new zzaor(this.zzq, Math.max(0L, j2), zzv(zzx()), null));
                this.zzq = null;
                zzp();
            }
            if (this.zzI == 0) {
                this.zzJ = Math.max(0L, j2);
                this.zzI = 1;
            } else {
                long zzv = this.zzJ + zzv(this.zzn ? this.zzD : this.zzC / this.zzB);
                if (this.zzI == 1 && Math.abs(zzv - j2) > 200000) {
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Discontinuity detected [expected ");
                    sb.append(zzv);
                    sb.append(", got ");
                    sb.append(j2);
                    sb.append("]");
                    Log.e("AudioTrack", sb.toString());
                    this.zzI = 2;
                }
                if (this.zzI == 2) {
                    this.zzJ = (j2 - zzv) + this.zzJ;
                    this.zzI = 1;
                    zzaox.zzI(((zzaov) this.zzd).zza, true);
                }
            }
            if (this.zzn) {
                this.zzD += this.zzH;
            } else {
                this.zzC += byteBuffer.remaining();
            }
            this.zzP = byteBuffer;
        }
        if (this.zzn) {
            zzr(this.zzP, j2);
        } else {
            zzq(j2);
        }
        if (this.zzP.hasRemaining()) {
            return false;
        }
        this.zzP = null;
        return true;
    }

    public final void zzg() throws zzaos {
        if (!this.zzU && zzu() && zzs()) {
            this.zzg.zzb(zzx());
            this.zzU = true;
        }
    }

    public final boolean zzh() {
        return !zzu() || (this.zzU && !zzi());
    }

    public final boolean zzi() {
        if (zzu()) {
            if (zzx() > this.zzg.zzd()) {
                return true;
            }
            if (zzz() && this.zzi.getPlayState() == 2 && this.zzi.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final zzanq zzj(zzanq zzanqVar) {
        if (this.zzn) {
            zzanq zzanqVar2 = zzanq.zza;
            this.zzr = zzanqVar2;
            return zzanqVar2;
        }
        float zzk = this.zzb.zzk(zzanqVar.zzb);
        this.zzb.zzl(1.0f);
        zzanq zzanqVar3 = new zzanq(zzk, 1.0f);
        zzanq zzanqVar4 = this.zzq;
        if (zzanqVar4 == null) {
            zzanqVar4 = !this.zzh.isEmpty() ? this.zzh.getLast().zza : this.zzr;
        }
        if (!zzanqVar3.equals(zzanqVar4)) {
            if (zzu()) {
                this.zzq = zzanqVar3;
            } else {
                this.zzr = zzanqVar3;
            }
        }
        return this.zzr;
    }

    public final zzanq zzk() {
        return this.zzr;
    }

    public final void zzl(float f2) {
        if (this.zzM != f2) {
            this.zzM = f2;
            zzt();
        }
    }

    public final void zzm() {
        this.zzV = false;
        if (zzu()) {
            zzy();
            this.zzg.zzc();
        }
    }

    public final void zzn() {
        zzanq zzanqVar;
        if (zzu()) {
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzH = 0;
            zzanq zzanqVar2 = this.zzq;
            if (zzanqVar2 != null) {
                this.zzr = zzanqVar2;
                this.zzq = null;
            } else if (!this.zzh.isEmpty()) {
                zzanqVar = this.zzh.getLast().zza;
                this.zzr = zzanqVar;
            }
            this.zzh.clear();
            this.zzs = 0L;
            this.zzt = 0L;
            this.zzP = null;
            this.zzQ = null;
            int i2 = 0;
            while (true) {
                zzaob[] zzaobVarArr = this.zzN;
                if (i2 >= zzaobVarArr.length) {
                    break;
                }
                zzaob zzaobVar = zzaobVarArr[i2];
                zzaobVar.zzi();
                this.zzO[i2] = zzaobVar.zzg();
                i2++;
            }
            this.zzU = false;
            this.zzT = -1;
            this.zzI = 0;
            this.zzL = 0L;
            zzy();
            if (this.zzi.getPlayState() == 3) {
                this.zzi.pause();
            }
            AudioTrack audioTrack = this.zzi;
            this.zzi = null;
            this.zzg.zza(null, false);
            this.zze.close();
            new zzaok(this, audioTrack).start();
        }
    }

    public final void zzo() {
        zzn();
        zzaob[] zzaobVarArr = this.zzc;
        for (int i2 = 0; i2 < 3; i2++) {
            zzaobVarArr[i2].zzj();
        }
        this.zzW = 0;
        this.zzV = false;
    }
}
