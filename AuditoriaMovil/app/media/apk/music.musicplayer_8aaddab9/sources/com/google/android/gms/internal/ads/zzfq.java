package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class zzfq extends zzadv {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private ArrayDeque<zzfo> zzA;
    private zzfp zzB;
    private zzfo zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private zzfk zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    public zzaz zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private long zzal;
    private int zzam;
    private zzgh zzan;
    private zzfg zzao;
    private zzfg zzap;
    private final zzfm zzc;
    private final zzfs zzd;
    private final float zze;
    private final zzaf zzf;
    private final zzaf zzg;
    private final zzaf zzh;
    private final zzfj zzi;
    private final zzamm<zzafv> zzj;
    private final ArrayList<Long> zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    private zzafv zzp;
    private zzafv zzq;
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzafv zzw;
    private MediaFormat zzx;
    private boolean zzy;
    private float zzz;

    public zzfq(int i2, zzfm zzfmVar, zzfs zzfsVar, boolean z, float f2) {
        super(i2);
        this.zzc = zzfmVar;
        Objects.requireNonNull(zzfsVar);
        this.zzd = zzfsVar;
        this.zze = f2;
        this.zzf = new zzaf(0, 0);
        this.zzg = new zzaf(0, 0);
        this.zzh = new zzaf(2, 0);
        zzfj zzfjVar = new zzfj();
        this.zzi = zzfjVar;
        this.zzj = new zzamm<>(10);
        this.zzk = new ArrayList<>();
        this.zzl = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzm = new long[10];
        this.zzn = new long[10];
        this.zzo = new long[10];
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        zzfjVar.zzi(0);
        zzfjVar.zzb.order(ByteOrder.nativeOrder());
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzZ = 0;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzP = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        this.zzaa = 0;
        this.zzab = 0;
    }

    private final void zzA() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    public static boolean zzY(zzafv zzafvVar) {
        return zzafvVar.zzE == 0;
    }

    private final void zza() {
        this.zzX = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzW = false;
        this.zzV = false;
    }

    private final boolean zzaA(zzafv zzafvVar) throws zzaeg {
        if (zzamq.zza >= 23 && this.zzan != null && this.zzab != 3 && zzaf() != 0) {
            float zzj = zzj(this.zzv, zzafvVar, zzau());
            float f2 = this.zzz;
            if (f2 == zzj) {
                return true;
            }
            if (zzj == -1.0f) {
                zzaC();
                return false;
            } else if (f2 == -1.0f && zzj <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzj);
                this.zzan.zzm(bundle);
                this.zzz = zzj;
            }
        }
        return true;
    }

    @TargetApi(ConnectionResult.API_DISABLED)
    private final boolean zzaB() throws zzaeg {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzF || this.zzH) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaE();
        }
        return true;
    }

    private final void zzaC() throws zzaeg {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
            return;
        }
        zzN();
        zzI();
    }

    @TargetApi(ConnectionResult.API_DISABLED)
    private final void zzaD() throws zzaeg {
        int i2 = this.zzab;
        if (i2 == 1) {
            zzb();
        } else if (i2 == 2) {
            zzb();
            zzaE();
        } else if (i2 != 3) {
            this.zzai = true;
            zzD();
        } else {
            zzN();
            zzI();
        }
    }

    private final void zzaE() throws zzaeg {
        try {
            throw null;
        } catch (MediaCryptoException e2) {
            throw zzaw(e2, this.zzp, false, 6006);
        }
    }

    private final void zzaa() {
        this.zzR = -1;
        this.zzS = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzab() throws zzaeg {
        zzgh zzghVar = this.zzan;
        boolean z = 0;
        if (zzghVar == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zza = zzghVar.zza();
            this.zzQ = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzb = this.zzan.zzd(zza);
            this.zzg.zza();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzan.zzf(this.zzQ, 0, 0, 0L, 4);
                zzA();
            }
            this.zzaa = 2;
            return false;
        } else if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzan.zzf(this.zzQ, 0, 38, 0L, 0);
            zzA();
            this.zzac = true;
            return true;
        } else {
            if (this.zzZ == 1) {
                for (int i2 = 0; i2 < this.zzw.zzn.size(); i2++) {
                    this.zzg.zzb.put(this.zzw.zzn.get(i2));
                }
                this.zzZ = 2;
            }
            int position = this.zzg.zzb.position();
            zzafw zzat = zzat();
            try {
                int zzax = zzax(zzat, this.zzg, 0);
                if (zzak()) {
                    this.zzag = this.zzaf;
                }
                if (zzax == -3) {
                    return false;
                }
                if (zzax == -5) {
                    if (this.zzZ == 2) {
                        this.zzg.zza();
                        this.zzZ = 1;
                    }
                    zzn(zzat);
                    return true;
                } else if (this.zzg.zzc()) {
                    if (this.zzZ == 2) {
                        this.zzg.zza();
                        this.zzZ = 1;
                    }
                    this.zzah = true;
                    if (!this.zzac) {
                        zzaD();
                        return false;
                    }
                    try {
                        if (!this.zzN) {
                            this.zzad = true;
                            this.zzan.zzf(this.zzQ, 0, 0, 0L, 4);
                            zzA();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e2) {
                        throw zzaw(e2, this.zzp, false, zzadx.zze(e2.getErrorCode()));
                    }
                } else if (!this.zzac && !this.zzg.zzd()) {
                    this.zzg.zza();
                    if (this.zzZ == 2) {
                        this.zzZ = 1;
                    }
                    return true;
                } else {
                    boolean zzj = this.zzg.zzj();
                    if (zzj) {
                        this.zzg.zza.zzc(position);
                    }
                    if (this.zzE && !zzj) {
                        ByteBuffer byteBuffer = this.zzg.zzb;
                        byte[] bArr = zzalw.zza;
                        int position2 = byteBuffer.position();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            int i6 = byteBuffer.get(i3) & 255;
                            if (i4 == 3) {
                                if (i6 == 1) {
                                    if ((byteBuffer.get(i5) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i3 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    i6 = 1;
                                }
                            } else if (i6 == 0) {
                                i4++;
                            }
                            if (i6 != 0) {
                                i4 = 0;
                            }
                            i3 = i5;
                        }
                        if (this.zzg.zzb.position() == 0) {
                            return true;
                        }
                        this.zzE = false;
                    }
                    zzaf zzafVar = this.zzg;
                    long j2 = zzafVar.zzd;
                    zzfk zzfkVar = this.zzO;
                    if (zzfkVar != null) {
                        j2 = zzfkVar.zzb(this.zzp, zzafVar);
                        this.zzaf = Math.max(this.zzaf, this.zzO.zzc(this.zzp));
                    }
                    long j3 = j2;
                    if (this.zzg.zzb()) {
                        this.zzk.add(Long.valueOf(j3));
                    }
                    if (this.zzaj) {
                        this.zzj.zza(j3, this.zzp);
                        this.zzaj = false;
                    }
                    this.zzaf = Math.max(this.zzaf, j3);
                    this.zzg.zzk();
                    if (this.zzg.zze()) {
                        zzU(this.zzg);
                    }
                    zzB(this.zzg);
                    try {
                        if (zzj) {
                            this.zzan.zzg(this.zzQ, 0, this.zzg.zza, j3, 0);
                        } else {
                            this.zzan.zzf(this.zzQ, 0, this.zzg.zzb.limit(), j3, 0);
                        }
                        zzA();
                        this.zzac = true;
                        this.zzZ = 0;
                        zzaz zzazVar = this.zza;
                        z = zzazVar.zzc + 1;
                        zzazVar.zzc = z;
                        return true;
                    } catch (MediaCodec.CryptoException e3) {
                        throw zzaw(e3, this.zzp, z, zzadx.zze(e3.getErrorCode()));
                    }
                }
            } catch (zzae e4) {
                zzm(e4);
                zzp(0);
                zzb();
                return true;
            }
        }
    }

    private final void zzb() {
        try {
            this.zzan.zzj();
        } finally {
            zzR();
        }
    }

    private final boolean zzp(int i2) throws zzaeg {
        zzafw zzat = zzat();
        this.zzf.zza();
        int zzax = zzax(zzat, this.zzf, i2 | 4);
        if (zzax == -5) {
            zzn(zzat);
            return true;
        } else if (zzax == -4 && this.zzf.zzc()) {
            this.zzah = true;
            zzaD();
            return false;
        } else {
            return false;
        }
    }

    private final boolean zzy(long j2) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j2 < this.zzt;
    }

    private final boolean zzz() {
        return this.zzR >= 0;
    }

    public void zzB(zzaf zzafVar) throws zzaeg {
        throw null;
    }

    public void zzC() {
    }

    public void zzD() throws zzaeg {
    }

    public abstract boolean zzF(long j2, long j3, zzgh zzghVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, zzafv zzafvVar) throws zzaeg;

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahw
    public final int zzG() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final int zzH(zzafv zzafvVar) throws zzaeg {
        try {
            return zzd(this.zzd, zzafvVar);
        } catch (zzfy e2) {
            throw zzaw(e2, zzafvVar, false, 4002);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x023d, code lost:
        if ("stvm8".equals(r6) == false) goto L183;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c0 A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:48:0x00b8, B:52:0x00d1, B:56:0x00d9, B:59:0x00e9, B:61:0x00f3, B:62:0x00fc, B:64:0x0101, B:66:0x010d, B:68:0x0118, B:69:0x0122, B:70:0x0141, B:73:0x0155, B:75:0x015b, B:77:0x0165, B:79:0x016d, B:81:0x0175, B:100:0x01b8, B:102:0x01c0, B:104:0x01c8, B:108:0x01d3, B:111:0x01dd, B:113:0x01e5, B:116:0x01ef, B:118:0x01f9, B:120:0x0201, B:125:0x020b, B:127:0x0211, B:131:0x021c, B:133:0x0220, B:148:0x0251, B:150:0x0255, B:154:0x0260, B:156:0x0264, B:158:0x026c, B:160:0x0276, B:162:0x0280, B:164:0x0288, B:166:0x0290, B:168:0x0298, B:170:0x02a0, B:174:0x02ab, B:176:0x02b1, B:178:0x02b5, B:182:0x02c0, B:184:0x02c8, B:205:0x030b, B:207:0x0317, B:208:0x031e, B:210:0x0325, B:211:0x032e, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02fb, B:201:0x0305, B:138:0x022d, B:140:0x0237, B:142:0x023f, B:144:0x0247, B:86:0x0183, B:88:0x018b, B:90:0x0193, B:92:0x019d, B:94:0x01a5, B:96:0x01ad, B:221:0x0349, B:222:0x034c, B:67:0x0112, B:60:0x00ee, B:51:0x00c5), top: B:241:0x00b8, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0211 A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:48:0x00b8, B:52:0x00d1, B:56:0x00d9, B:59:0x00e9, B:61:0x00f3, B:62:0x00fc, B:64:0x0101, B:66:0x010d, B:68:0x0118, B:69:0x0122, B:70:0x0141, B:73:0x0155, B:75:0x015b, B:77:0x0165, B:79:0x016d, B:81:0x0175, B:100:0x01b8, B:102:0x01c0, B:104:0x01c8, B:108:0x01d3, B:111:0x01dd, B:113:0x01e5, B:116:0x01ef, B:118:0x01f9, B:120:0x0201, B:125:0x020b, B:127:0x0211, B:131:0x021c, B:133:0x0220, B:148:0x0251, B:150:0x0255, B:154:0x0260, B:156:0x0264, B:158:0x026c, B:160:0x0276, B:162:0x0280, B:164:0x0288, B:166:0x0290, B:168:0x0298, B:170:0x02a0, B:174:0x02ab, B:176:0x02b1, B:178:0x02b5, B:182:0x02c0, B:184:0x02c8, B:205:0x030b, B:207:0x0317, B:208:0x031e, B:210:0x0325, B:211:0x032e, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02fb, B:201:0x0305, B:138:0x022d, B:140:0x0237, B:142:0x023f, B:144:0x0247, B:86:0x0183, B:88:0x018b, B:90:0x0193, B:92:0x019d, B:94:0x01a5, B:96:0x01ad, B:221:0x0349, B:222:0x034c, B:67:0x0112, B:60:0x00ee, B:51:0x00c5), top: B:241:0x00b8, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0220 A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:48:0x00b8, B:52:0x00d1, B:56:0x00d9, B:59:0x00e9, B:61:0x00f3, B:62:0x00fc, B:64:0x0101, B:66:0x010d, B:68:0x0118, B:69:0x0122, B:70:0x0141, B:73:0x0155, B:75:0x015b, B:77:0x0165, B:79:0x016d, B:81:0x0175, B:100:0x01b8, B:102:0x01c0, B:104:0x01c8, B:108:0x01d3, B:111:0x01dd, B:113:0x01e5, B:116:0x01ef, B:118:0x01f9, B:120:0x0201, B:125:0x020b, B:127:0x0211, B:131:0x021c, B:133:0x0220, B:148:0x0251, B:150:0x0255, B:154:0x0260, B:156:0x0264, B:158:0x026c, B:160:0x0276, B:162:0x0280, B:164:0x0288, B:166:0x0290, B:168:0x0298, B:170:0x02a0, B:174:0x02ab, B:176:0x02b1, B:178:0x02b5, B:182:0x02c0, B:184:0x02c8, B:205:0x030b, B:207:0x0317, B:208:0x031e, B:210:0x0325, B:211:0x032e, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02fb, B:201:0x0305, B:138:0x022d, B:140:0x0237, B:142:0x023f, B:144:0x0247, B:86:0x0183, B:88:0x018b, B:90:0x0193, B:92:0x019d, B:94:0x01a5, B:96:0x01ad, B:221:0x0349, B:222:0x034c, B:67:0x0112, B:60:0x00ee, B:51:0x00c5), top: B:241:0x00b8, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022d A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:48:0x00b8, B:52:0x00d1, B:56:0x00d9, B:59:0x00e9, B:61:0x00f3, B:62:0x00fc, B:64:0x0101, B:66:0x010d, B:68:0x0118, B:69:0x0122, B:70:0x0141, B:73:0x0155, B:75:0x015b, B:77:0x0165, B:79:0x016d, B:81:0x0175, B:100:0x01b8, B:102:0x01c0, B:104:0x01c8, B:108:0x01d3, B:111:0x01dd, B:113:0x01e5, B:116:0x01ef, B:118:0x01f9, B:120:0x0201, B:125:0x020b, B:127:0x0211, B:131:0x021c, B:133:0x0220, B:148:0x0251, B:150:0x0255, B:154:0x0260, B:156:0x0264, B:158:0x026c, B:160:0x0276, B:162:0x0280, B:164:0x0288, B:166:0x0290, B:168:0x0298, B:170:0x02a0, B:174:0x02ab, B:176:0x02b1, B:178:0x02b5, B:182:0x02c0, B:184:0x02c8, B:205:0x030b, B:207:0x0317, B:208:0x031e, B:210:0x0325, B:211:0x032e, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02fb, B:201:0x0305, B:138:0x022d, B:140:0x0237, B:142:0x023f, B:144:0x0247, B:86:0x0183, B:88:0x018b, B:90:0x0193, B:92:0x019d, B:94:0x01a5, B:96:0x01ad, B:221:0x0349, B:222:0x034c, B:67:0x0112, B:60:0x00ee, B:51:0x00c5), top: B:241:0x00b8, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0255 A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:48:0x00b8, B:52:0x00d1, B:56:0x00d9, B:59:0x00e9, B:61:0x00f3, B:62:0x00fc, B:64:0x0101, B:66:0x010d, B:68:0x0118, B:69:0x0122, B:70:0x0141, B:73:0x0155, B:75:0x015b, B:77:0x0165, B:79:0x016d, B:81:0x0175, B:100:0x01b8, B:102:0x01c0, B:104:0x01c8, B:108:0x01d3, B:111:0x01dd, B:113:0x01e5, B:116:0x01ef, B:118:0x01f9, B:120:0x0201, B:125:0x020b, B:127:0x0211, B:131:0x021c, B:133:0x0220, B:148:0x0251, B:150:0x0255, B:154:0x0260, B:156:0x0264, B:158:0x026c, B:160:0x0276, B:162:0x0280, B:164:0x0288, B:166:0x0290, B:168:0x0298, B:170:0x02a0, B:174:0x02ab, B:176:0x02b1, B:178:0x02b5, B:182:0x02c0, B:184:0x02c8, B:205:0x030b, B:207:0x0317, B:208:0x031e, B:210:0x0325, B:211:0x032e, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02fb, B:201:0x0305, B:138:0x022d, B:140:0x0237, B:142:0x023f, B:144:0x0247, B:86:0x0183, B:88:0x018b, B:90:0x0193, B:92:0x019d, B:94:0x01a5, B:96:0x01ad, B:221:0x0349, B:222:0x034c, B:67:0x0112, B:60:0x00ee, B:51:0x00c5), top: B:241:0x00b8, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0264 A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:48:0x00b8, B:52:0x00d1, B:56:0x00d9, B:59:0x00e9, B:61:0x00f3, B:62:0x00fc, B:64:0x0101, B:66:0x010d, B:68:0x0118, B:69:0x0122, B:70:0x0141, B:73:0x0155, B:75:0x015b, B:77:0x0165, B:79:0x016d, B:81:0x0175, B:100:0x01b8, B:102:0x01c0, B:104:0x01c8, B:108:0x01d3, B:111:0x01dd, B:113:0x01e5, B:116:0x01ef, B:118:0x01f9, B:120:0x0201, B:125:0x020b, B:127:0x0211, B:131:0x021c, B:133:0x0220, B:148:0x0251, B:150:0x0255, B:154:0x0260, B:156:0x0264, B:158:0x026c, B:160:0x0276, B:162:0x0280, B:164:0x0288, B:166:0x0290, B:168:0x0298, B:170:0x02a0, B:174:0x02ab, B:176:0x02b1, B:178:0x02b5, B:182:0x02c0, B:184:0x02c8, B:205:0x030b, B:207:0x0317, B:208:0x031e, B:210:0x0325, B:211:0x032e, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02fb, B:201:0x0305, B:138:0x022d, B:140:0x0237, B:142:0x023f, B:144:0x0247, B:86:0x0183, B:88:0x018b, B:90:0x0193, B:92:0x019d, B:94:0x01a5, B:96:0x01ad, B:221:0x0349, B:222:0x034c, B:67:0x0112, B:60:0x00ee, B:51:0x00c5), top: B:241:0x00b8, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b1 A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:48:0x00b8, B:52:0x00d1, B:56:0x00d9, B:59:0x00e9, B:61:0x00f3, B:62:0x00fc, B:64:0x0101, B:66:0x010d, B:68:0x0118, B:69:0x0122, B:70:0x0141, B:73:0x0155, B:75:0x015b, B:77:0x0165, B:79:0x016d, B:81:0x0175, B:100:0x01b8, B:102:0x01c0, B:104:0x01c8, B:108:0x01d3, B:111:0x01dd, B:113:0x01e5, B:116:0x01ef, B:118:0x01f9, B:120:0x0201, B:125:0x020b, B:127:0x0211, B:131:0x021c, B:133:0x0220, B:148:0x0251, B:150:0x0255, B:154:0x0260, B:156:0x0264, B:158:0x026c, B:160:0x0276, B:162:0x0280, B:164:0x0288, B:166:0x0290, B:168:0x0298, B:170:0x02a0, B:174:0x02ab, B:176:0x02b1, B:178:0x02b5, B:182:0x02c0, B:184:0x02c8, B:205:0x030b, B:207:0x0317, B:208:0x031e, B:210:0x0325, B:211:0x032e, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02fb, B:201:0x0305, B:138:0x022d, B:140:0x0237, B:142:0x023f, B:144:0x0247, B:86:0x0183, B:88:0x018b, B:90:0x0193, B:92:0x019d, B:94:0x01a5, B:96:0x01ad, B:221:0x0349, B:222:0x034c, B:67:0x0112, B:60:0x00ee, B:51:0x00c5), top: B:241:0x00b8, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c8 A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:48:0x00b8, B:52:0x00d1, B:56:0x00d9, B:59:0x00e9, B:61:0x00f3, B:62:0x00fc, B:64:0x0101, B:66:0x010d, B:68:0x0118, B:69:0x0122, B:70:0x0141, B:73:0x0155, B:75:0x015b, B:77:0x0165, B:79:0x016d, B:81:0x0175, B:100:0x01b8, B:102:0x01c0, B:104:0x01c8, B:108:0x01d3, B:111:0x01dd, B:113:0x01e5, B:116:0x01ef, B:118:0x01f9, B:120:0x0201, B:125:0x020b, B:127:0x0211, B:131:0x021c, B:133:0x0220, B:148:0x0251, B:150:0x0255, B:154:0x0260, B:156:0x0264, B:158:0x026c, B:160:0x0276, B:162:0x0280, B:164:0x0288, B:166:0x0290, B:168:0x0298, B:170:0x02a0, B:174:0x02ab, B:176:0x02b1, B:178:0x02b5, B:182:0x02c0, B:184:0x02c8, B:205:0x030b, B:207:0x0317, B:208:0x031e, B:210:0x0325, B:211:0x032e, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02fb, B:201:0x0305, B:138:0x022d, B:140:0x0237, B:142:0x023f, B:144:0x0247, B:86:0x0183, B:88:0x018b, B:90:0x0193, B:92:0x019d, B:94:0x01a5, B:96:0x01ad, B:221:0x0349, B:222:0x034c, B:67:0x0112, B:60:0x00ee, B:51:0x00c5), top: B:241:0x00b8, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d7 A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:48:0x00b8, B:52:0x00d1, B:56:0x00d9, B:59:0x00e9, B:61:0x00f3, B:62:0x00fc, B:64:0x0101, B:66:0x010d, B:68:0x0118, B:69:0x0122, B:70:0x0141, B:73:0x0155, B:75:0x015b, B:77:0x0165, B:79:0x016d, B:81:0x0175, B:100:0x01b8, B:102:0x01c0, B:104:0x01c8, B:108:0x01d3, B:111:0x01dd, B:113:0x01e5, B:116:0x01ef, B:118:0x01f9, B:120:0x0201, B:125:0x020b, B:127:0x0211, B:131:0x021c, B:133:0x0220, B:148:0x0251, B:150:0x0255, B:154:0x0260, B:156:0x0264, B:158:0x026c, B:160:0x0276, B:162:0x0280, B:164:0x0288, B:166:0x0290, B:168:0x0298, B:170:0x02a0, B:174:0x02ab, B:176:0x02b1, B:178:0x02b5, B:182:0x02c0, B:184:0x02c8, B:205:0x030b, B:207:0x0317, B:208:0x031e, B:210:0x0325, B:211:0x032e, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02fb, B:201:0x0305, B:138:0x022d, B:140:0x0237, B:142:0x023f, B:144:0x0247, B:86:0x0183, B:88:0x018b, B:90:0x0193, B:92:0x019d, B:94:0x01a5, B:96:0x01ad, B:221:0x0349, B:222:0x034c, B:67:0x0112, B:60:0x00ee, B:51:0x00c5), top: B:241:0x00b8, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0317 A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:48:0x00b8, B:52:0x00d1, B:56:0x00d9, B:59:0x00e9, B:61:0x00f3, B:62:0x00fc, B:64:0x0101, B:66:0x010d, B:68:0x0118, B:69:0x0122, B:70:0x0141, B:73:0x0155, B:75:0x015b, B:77:0x0165, B:79:0x016d, B:81:0x0175, B:100:0x01b8, B:102:0x01c0, B:104:0x01c8, B:108:0x01d3, B:111:0x01dd, B:113:0x01e5, B:116:0x01ef, B:118:0x01f9, B:120:0x0201, B:125:0x020b, B:127:0x0211, B:131:0x021c, B:133:0x0220, B:148:0x0251, B:150:0x0255, B:154:0x0260, B:156:0x0264, B:158:0x026c, B:160:0x0276, B:162:0x0280, B:164:0x0288, B:166:0x0290, B:168:0x0298, B:170:0x02a0, B:174:0x02ab, B:176:0x02b1, B:178:0x02b5, B:182:0x02c0, B:184:0x02c8, B:205:0x030b, B:207:0x0317, B:208:0x031e, B:210:0x0325, B:211:0x032e, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02fb, B:201:0x0305, B:138:0x022d, B:140:0x0237, B:142:0x023f, B:144:0x0247, B:86:0x0183, B:88:0x018b, B:90:0x0193, B:92:0x019d, B:94:0x01a5, B:96:0x01ad, B:221:0x0349, B:222:0x034c, B:67:0x0112, B:60:0x00ee, B:51:0x00c5), top: B:241:0x00b8, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0325 A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:48:0x00b8, B:52:0x00d1, B:56:0x00d9, B:59:0x00e9, B:61:0x00f3, B:62:0x00fc, B:64:0x0101, B:66:0x010d, B:68:0x0118, B:69:0x0122, B:70:0x0141, B:73:0x0155, B:75:0x015b, B:77:0x0165, B:79:0x016d, B:81:0x0175, B:100:0x01b8, B:102:0x01c0, B:104:0x01c8, B:108:0x01d3, B:111:0x01dd, B:113:0x01e5, B:116:0x01ef, B:118:0x01f9, B:120:0x0201, B:125:0x020b, B:127:0x0211, B:131:0x021c, B:133:0x0220, B:148:0x0251, B:150:0x0255, B:154:0x0260, B:156:0x0264, B:158:0x026c, B:160:0x0276, B:162:0x0280, B:164:0x0288, B:166:0x0290, B:168:0x0298, B:170:0x02a0, B:174:0x02ab, B:176:0x02b1, B:178:0x02b5, B:182:0x02c0, B:184:0x02c8, B:205:0x030b, B:207:0x0317, B:208:0x031e, B:210:0x0325, B:211:0x032e, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02fb, B:201:0x0305, B:138:0x022d, B:140:0x0237, B:142:0x023f, B:144:0x0247, B:86:0x0183, B:88:0x018b, B:90:0x0193, B:92:0x019d, B:94:0x01a5, B:96:0x01ad, B:221:0x0349, B:222:0x034c, B:67:0x0112, B:60:0x00ee, B:51:0x00c5), top: B:241:0x00b8, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0349 A[Catch: Exception -> 0x034d, TryCatch #0 {Exception -> 0x034d, blocks: (B:48:0x00b8, B:52:0x00d1, B:56:0x00d9, B:59:0x00e9, B:61:0x00f3, B:62:0x00fc, B:64:0x0101, B:66:0x010d, B:68:0x0118, B:69:0x0122, B:70:0x0141, B:73:0x0155, B:75:0x015b, B:77:0x0165, B:79:0x016d, B:81:0x0175, B:100:0x01b8, B:102:0x01c0, B:104:0x01c8, B:108:0x01d3, B:111:0x01dd, B:113:0x01e5, B:116:0x01ef, B:118:0x01f9, B:120:0x0201, B:125:0x020b, B:127:0x0211, B:131:0x021c, B:133:0x0220, B:148:0x0251, B:150:0x0255, B:154:0x0260, B:156:0x0264, B:158:0x026c, B:160:0x0276, B:162:0x0280, B:164:0x0288, B:166:0x0290, B:168:0x0298, B:170:0x02a0, B:174:0x02ab, B:176:0x02b1, B:178:0x02b5, B:182:0x02c0, B:184:0x02c8, B:205:0x030b, B:207:0x0317, B:208:0x031e, B:210:0x0325, B:211:0x032e, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02fb, B:201:0x0305, B:138:0x022d, B:140:0x0237, B:142:0x023f, B:144:0x0247, B:86:0x0183, B:88:0x018b, B:90:0x0193, B:92:0x019d, B:94:0x01a5, B:96:0x01ad, B:221:0x0349, B:222:0x034c, B:67:0x0112, B:60:0x00ee, B:51:0x00c5), top: B:241:0x00b8, outer: #3 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.google.android.gms.internal.ads.zzgg, android.view.Surface, android.media.MediaCrypto] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzI() throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfq.zzI():void");
    }

    public boolean zzJ(zzfo zzfoVar) {
        return true;
    }

    public final zzfo zzK() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzL(zzafv[] zzafvVarArr, long j2, long j3) throws zzaeg {
        if (this.zzal == -9223372036854775807L) {
            zzakt.zzd(this.zzak == -9223372036854775807L);
            this.zzak = j2;
            this.zzal = j3;
            return;
        }
        int i2 = this.zzam;
        if (i2 == 10) {
            long j4 = this.zzn[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j4);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.zzam = i2 + 1;
        }
        long[] jArr = this.zzm;
        int i3 = this.zzam - 1;
        jArr[i3] = j2;
        this.zzn[i3] = j3;
        this.zzo[i3] = this.zzaf;
    }

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahv
    public void zzM(float f2, float f3) throws zzaeg {
        this.zzu = f2;
        this.zzv = f3;
        zzaA(this.zzw);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.zzgh, com.google.android.gms.internal.ads.zzfg] */
    public final void zzN() {
        try {
            zzgh zzghVar = this.zzan;
            if (zzghVar != null) {
                zzghVar.zzk();
                this.zza.zzb++;
                zzl(this.zzC.zza);
            }
        } finally {
            this.zzan = null;
            this.zzr = null;
            this.zzao = null;
            zzS();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x026d, code lost:
        if (r15.zzq != null) goto L207;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x031b A[LOOP:2: B:72:0x013d->B:183:0x031b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x032b A[Catch: IllegalStateException -> 0x035c, TryCatch #10 {IllegalStateException -> 0x035c, blocks: (B:180:0x0314, B:185:0x0325, B:187:0x032b, B:189:0x0331, B:176:0x02fc, B:178:0x030e, B:196:0x0342), top: B:251:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x031a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v7 */
    @Override // com.google.android.gms.internal.ads.zzahv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzO(long r24, long r26) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfq.zzO(long, long):void");
    }

    public final boolean zzP() throws zzaeg {
        boolean zzQ = zzQ();
        if (zzQ) {
            zzI();
        }
        return zzQ;
    }

    public final boolean zzQ() {
        if (this.zzan == null) {
            return false;
        }
        if (this.zzab == 3 || this.zzF || ((this.zzG && !this.zzae) || (this.zzH && this.zzad))) {
            zzN();
            return true;
        }
        zzb();
        return false;
    }

    public void zzR() {
        zzA();
        zzaa();
        this.zzP = -9223372036854775807L;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        zzfk zzfkVar = this.zzO;
        if (zzfkVar != null) {
            zzfkVar.zza();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    public final void zzS() {
        zzR();
        this.zzO = null;
        this.zzA = null;
        this.zzC = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = false;
        this.zzae = false;
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    public zzfn zzT(Throwable th, zzfo zzfoVar) {
        return new zzfn(th, zzfoVar);
    }

    public void zzU(zzaf zzafVar) throws zzaeg {
    }

    public void zzV(long j2) {
        while (true) {
            int i2 = this.zzam;
            if (i2 == 0 || j2 < this.zzo[0]) {
                return;
            }
            long[] jArr = this.zzm;
            this.zzak = jArr[0];
            this.zzal = this.zzn[0];
            int i3 = i2 - 1;
            this.zzam = i3;
            System.arraycopy(jArr, 1, jArr, 0, i3);
            long[] jArr2 = this.zzn;
            System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
            long[] jArr3 = this.zzo;
            System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
            zzC();
        }
    }

    public final float zzW() {
        return this.zzu;
    }

    public final long zzX() {
        return this.zzal;
    }

    public final zzgh zzZ() {
        return this.zzan;
    }

    public abstract int zzd(zzfs zzfsVar, zzafv zzafvVar) throws zzfy;

    public abstract List<zzfo> zze(zzfs zzfsVar, zzafv zzafvVar, boolean z) throws zzfy;

    public boolean zzf(zzafv zzafvVar) {
        return false;
    }

    public abstract zzfl zzg(zzfo zzfoVar, zzafv zzafvVar, MediaCrypto mediaCrypto, float f2);

    public zzba zzh(zzfo zzfoVar, zzafv zzafvVar, zzafv zzafvVar2) {
        throw null;
    }

    public float zzj(float f2, zzafv zzafvVar, zzafv[] zzafvVarArr) {
        throw null;
    }

    public void zzk(String str, long j2, long j3) {
        throw null;
    }

    public void zzl(String str) {
        throw null;
    }

    public void zzm(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        if (zzaB() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        if (zzaB() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:
        if (zzaB() == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzba zzn(com.google.android.gms.internal.ads.zzafw r13) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfq.zzn(com.google.android.gms.internal.ads.zzafw):com.google.android.gms.internal.ads.zzba");
    }

    public void zzo(zzafv zzafvVar, MediaFormat mediaFormat) throws zzaeg {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public void zzq(boolean z, boolean z2) throws zzaeg {
        this.zza = new zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public void zzr(long j2, boolean z) throws zzaeg {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zza();
            this.zzh.zza();
            this.zzW = false;
        } else {
            zzP();
        }
        if (this.zzj.zzc() > 0) {
            this.zzaj = true;
        }
        this.zzj.zzb();
        int i2 = this.zzam;
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.zzal = this.zzn[i3];
            this.zzak = this.zzm[i3];
            this.zzam = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public void zzu() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public void zzv() {
        try {
            zza();
            zzN();
        } finally {
            this.zzap = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public boolean zzw() {
        return this.zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public boolean zzx() {
        if (this.zzp != null) {
            if (zzaz() || zzz()) {
                return true;
            }
            if (this.zzP != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzP) {
                return true;
            }
        }
        return false;
    }
}
