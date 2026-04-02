package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.games.GamesStatusCodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
    protected zzaz zza;
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

    public zzfq(int i, zzfm zzfmVar, zzfs zzfsVar, boolean z, float f) {
        super(i);
        this.zzc = zzfmVar;
        if (zzfsVar != null) {
            this.zzd = zzfsVar;
            this.zze = f;
            this.zzf = new zzaf(0, 0);
            this.zzg = new zzaf(0, 0);
            this.zzh = new zzaf(2, 0);
            this.zzi = new zzfj();
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
            this.zzi.zzi(0);
            this.zzi.zzb.order(ByteOrder.nativeOrder());
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
            return;
        }
        throw null;
    }

    private final void zzA() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
            float f = this.zzz;
            if (f == zzj) {
                return true;
            }
            if (zzj == -1.0f) {
                zzaC();
                return false;
            } else if (f == -1.0f && zzj <= this.zze) {
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

    private final void zzaE() throws zzaeg {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw zzaw(e, this.zzp, false, 6006);
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
                for (int i = 0; i < this.zzw.zzn.size(); i++) {
                    this.zzg.zzb.put(this.zzw.zzn.get(i));
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
                } else if (!this.zzg.zzc()) {
                    if (this.zzac || this.zzg.zzd()) {
                        boolean zzj = this.zzg.zzj();
                        if (zzj) {
                            this.zzg.zza.zzc(position);
                        }
                        if (this.zzE && !zzj) {
                            ByteBuffer byteBuffer = this.zzg.zzb;
                            byte[] bArr = zzalw.zza;
                            int position2 = byteBuffer.position();
                            int i2 = 0;
                            int i3 = 0;
                            while (true) {
                                int i4 = i2 + 1;
                                if (i4 < position2) {
                                    int i5 = byteBuffer.get(i2) & UByte.MAX_VALUE;
                                    if (i3 == 3) {
                                        if (i5 == 1) {
                                            if ((byteBuffer.get(i4) & 31) == 7) {
                                                ByteBuffer duplicate = byteBuffer.duplicate();
                                                duplicate.position(i2 - 3);
                                                duplicate.limit(position2);
                                                byteBuffer.position(0);
                                                byteBuffer.put(duplicate);
                                                break;
                                            }
                                            i5 = 1;
                                        }
                                    } else if (i5 == 0) {
                                        i3++;
                                    }
                                    if (i5 != 0) {
                                        i3 = 0;
                                    }
                                    i2 = i4;
                                } else {
                                    byteBuffer.clear();
                                    break;
                                }
                            }
                            if (this.zzg.zzb.position() == 0) {
                                return true;
                            }
                            this.zzE = false;
                        }
                        zzaf zzafVar = this.zzg;
                        long j = zzafVar.zzd;
                        zzfk zzfkVar = this.zzO;
                        if (zzfkVar != null) {
                            j = zzfkVar.zzb(this.zzp, zzafVar);
                            this.zzaf = Math.max(this.zzaf, this.zzO.zzc(this.zzp));
                        }
                        long j2 = j;
                        if (this.zzg.zzb()) {
                            this.zzk.add(Long.valueOf(j2));
                        }
                        if (this.zzaj) {
                            this.zzj.zza(j2, this.zzp);
                            this.zzaj = false;
                        }
                        this.zzaf = Math.max(this.zzaf, j2);
                        this.zzg.zzk();
                        if (this.zzg.zze()) {
                            zzU(this.zzg);
                        }
                        zzB(this.zzg);
                        try {
                            if (zzj) {
                                this.zzan.zzg(this.zzQ, 0, this.zzg.zza, j2, 0);
                            } else {
                                this.zzan.zzf(this.zzQ, 0, this.zzg.zzb.limit(), j2, 0);
                            }
                            zzA();
                            this.zzac = true;
                            this.zzZ = 0;
                            zzaz zzazVar = this.zza;
                            z = zzazVar.zzc + 1;
                            zzazVar.zzc = z;
                            return true;
                        } catch (MediaCodec.CryptoException e) {
                            throw zzaw(e, this.zzp, z, zzadx.zze(e.getErrorCode()));
                        }
                    } else {
                        this.zzg.zza();
                        if (this.zzZ == 2) {
                            this.zzZ = 1;
                        }
                        return true;
                    }
                } else {
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
                }
            } catch (zzae e3) {
                zzm(e3);
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

    private final boolean zzp(int i) throws zzaeg {
        zzafw zzat = zzat();
        this.zzf.zza();
        int zzax = zzax(zzat, this.zzf, i | 4);
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

    private final boolean zzy(long j) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.zzt;
    }

    private final boolean zzz() {
        return this.zzR >= 0;
    }

    protected void zzB(zzaf zzafVar) throws zzaeg {
        throw null;
    }

    protected void zzC() {
    }

    protected void zzD() throws zzaeg {
    }

    protected abstract boolean zzF(long j, long j2, zzgh zzghVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzafv zzafvVar) throws zzaeg;

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahw
    public final int zzG() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final int zzH(zzafv zzafvVar) throws zzaeg {
        try {
            return zzd(this.zzd, zzafvVar);
        } catch (zzfy e) {
            throw zzaw(e, zzafvVar, false, GamesStatusCodes.STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0240 A[Catch: Exception -> 0x0386, TryCatch #4 {Exception -> 0x0386, blocks: (B:48:0x00be, B:52:0x00d6, B:56:0x00de, B:59:0x00ee, B:61:0x00f8, B:62:0x0101, B:64:0x0105, B:66:0x0111, B:68:0x011c, B:69:0x0126, B:70:0x0145, B:73:0x015b, B:75:0x0161, B:77:0x016b, B:79:0x0175, B:81:0x017f, B:100:0x01cc, B:102:0x01d6, B:104:0x01de, B:108:0x01e9, B:110:0x01f3, B:112:0x01f7, B:114:0x01ff, B:116:0x0207, B:118:0x020b, B:120:0x0215, B:122:0x021d, B:127:0x0227, B:129:0x022f, B:133:0x023a, B:135:0x0240, B:151:0x0275, B:153:0x027b, B:157:0x0286, B:159:0x028c, B:161:0x0294, B:163:0x029e, B:165:0x02a8, B:167:0x02b2, B:169:0x02bc, B:171:0x02c6, B:173:0x02d0, B:177:0x02dd, B:179:0x02e5, B:181:0x02e9, B:185:0x02f4, B:187:0x02fc, B:209:0x0343, B:211:0x034f, B:212:0x0356, B:214:0x035d, B:215:0x0366, B:191:0x0307, B:193:0x030d, B:195:0x0315, B:197:0x0319, B:199:0x0321, B:201:0x0329, B:203:0x0333, B:205:0x033d, B:139:0x024b, B:141:0x024f, B:143:0x0259, B:145:0x0263, B:147:0x026b, B:84:0x018b, B:86:0x0191, B:88:0x0199, B:90:0x01a1, B:92:0x01ab, B:94:0x01b5, B:96:0x01bf, B:228:0x0382, B:229:0x0385, B:67:0x0116, B:222:0x037b, B:60:0x00f3, B:51:0x00ca), top: B:251:0x00be, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027b A[Catch: Exception -> 0x0386, TryCatch #4 {Exception -> 0x0386, blocks: (B:48:0x00be, B:52:0x00d6, B:56:0x00de, B:59:0x00ee, B:61:0x00f8, B:62:0x0101, B:64:0x0105, B:66:0x0111, B:68:0x011c, B:69:0x0126, B:70:0x0145, B:73:0x015b, B:75:0x0161, B:77:0x016b, B:79:0x0175, B:81:0x017f, B:100:0x01cc, B:102:0x01d6, B:104:0x01de, B:108:0x01e9, B:110:0x01f3, B:112:0x01f7, B:114:0x01ff, B:116:0x0207, B:118:0x020b, B:120:0x0215, B:122:0x021d, B:127:0x0227, B:129:0x022f, B:133:0x023a, B:135:0x0240, B:151:0x0275, B:153:0x027b, B:157:0x0286, B:159:0x028c, B:161:0x0294, B:163:0x029e, B:165:0x02a8, B:167:0x02b2, B:169:0x02bc, B:171:0x02c6, B:173:0x02d0, B:177:0x02dd, B:179:0x02e5, B:181:0x02e9, B:185:0x02f4, B:187:0x02fc, B:209:0x0343, B:211:0x034f, B:212:0x0356, B:214:0x035d, B:215:0x0366, B:191:0x0307, B:193:0x030d, B:195:0x0315, B:197:0x0319, B:199:0x0321, B:201:0x0329, B:203:0x0333, B:205:0x033d, B:139:0x024b, B:141:0x024f, B:143:0x0259, B:145:0x0263, B:147:0x026b, B:84:0x018b, B:86:0x0191, B:88:0x0199, B:90:0x01a1, B:92:0x01ab, B:94:0x01b5, B:96:0x01bf, B:228:0x0382, B:229:0x0385, B:67:0x0116, B:222:0x037b, B:60:0x00f3, B:51:0x00ca), top: B:251:0x00be, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x028c A[Catch: Exception -> 0x0386, TryCatch #4 {Exception -> 0x0386, blocks: (B:48:0x00be, B:52:0x00d6, B:56:0x00de, B:59:0x00ee, B:61:0x00f8, B:62:0x0101, B:64:0x0105, B:66:0x0111, B:68:0x011c, B:69:0x0126, B:70:0x0145, B:73:0x015b, B:75:0x0161, B:77:0x016b, B:79:0x0175, B:81:0x017f, B:100:0x01cc, B:102:0x01d6, B:104:0x01de, B:108:0x01e9, B:110:0x01f3, B:112:0x01f7, B:114:0x01ff, B:116:0x0207, B:118:0x020b, B:120:0x0215, B:122:0x021d, B:127:0x0227, B:129:0x022f, B:133:0x023a, B:135:0x0240, B:151:0x0275, B:153:0x027b, B:157:0x0286, B:159:0x028c, B:161:0x0294, B:163:0x029e, B:165:0x02a8, B:167:0x02b2, B:169:0x02bc, B:171:0x02c6, B:173:0x02d0, B:177:0x02dd, B:179:0x02e5, B:181:0x02e9, B:185:0x02f4, B:187:0x02fc, B:209:0x0343, B:211:0x034f, B:212:0x0356, B:214:0x035d, B:215:0x0366, B:191:0x0307, B:193:0x030d, B:195:0x0315, B:197:0x0319, B:199:0x0321, B:201:0x0329, B:203:0x0333, B:205:0x033d, B:139:0x024b, B:141:0x024f, B:143:0x0259, B:145:0x0263, B:147:0x026b, B:84:0x018b, B:86:0x0191, B:88:0x0199, B:90:0x01a1, B:92:0x01ab, B:94:0x01b5, B:96:0x01bf, B:228:0x0382, B:229:0x0385, B:67:0x0116, B:222:0x037b, B:60:0x00f3, B:51:0x00ca), top: B:251:0x00be, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e5 A[Catch: Exception -> 0x0386, TryCatch #4 {Exception -> 0x0386, blocks: (B:48:0x00be, B:52:0x00d6, B:56:0x00de, B:59:0x00ee, B:61:0x00f8, B:62:0x0101, B:64:0x0105, B:66:0x0111, B:68:0x011c, B:69:0x0126, B:70:0x0145, B:73:0x015b, B:75:0x0161, B:77:0x016b, B:79:0x0175, B:81:0x017f, B:100:0x01cc, B:102:0x01d6, B:104:0x01de, B:108:0x01e9, B:110:0x01f3, B:112:0x01f7, B:114:0x01ff, B:116:0x0207, B:118:0x020b, B:120:0x0215, B:122:0x021d, B:127:0x0227, B:129:0x022f, B:133:0x023a, B:135:0x0240, B:151:0x0275, B:153:0x027b, B:157:0x0286, B:159:0x028c, B:161:0x0294, B:163:0x029e, B:165:0x02a8, B:167:0x02b2, B:169:0x02bc, B:171:0x02c6, B:173:0x02d0, B:177:0x02dd, B:179:0x02e5, B:181:0x02e9, B:185:0x02f4, B:187:0x02fc, B:209:0x0343, B:211:0x034f, B:212:0x0356, B:214:0x035d, B:215:0x0366, B:191:0x0307, B:193:0x030d, B:195:0x0315, B:197:0x0319, B:199:0x0321, B:201:0x0329, B:203:0x0333, B:205:0x033d, B:139:0x024b, B:141:0x024f, B:143:0x0259, B:145:0x0263, B:147:0x026b, B:84:0x018b, B:86:0x0191, B:88:0x0199, B:90:0x01a1, B:92:0x01ab, B:94:0x01b5, B:96:0x01bf, B:228:0x0382, B:229:0x0385, B:67:0x0116, B:222:0x037b, B:60:0x00f3, B:51:0x00ca), top: B:251:0x00be, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02fc A[Catch: Exception -> 0x0386, TryCatch #4 {Exception -> 0x0386, blocks: (B:48:0x00be, B:52:0x00d6, B:56:0x00de, B:59:0x00ee, B:61:0x00f8, B:62:0x0101, B:64:0x0105, B:66:0x0111, B:68:0x011c, B:69:0x0126, B:70:0x0145, B:73:0x015b, B:75:0x0161, B:77:0x016b, B:79:0x0175, B:81:0x017f, B:100:0x01cc, B:102:0x01d6, B:104:0x01de, B:108:0x01e9, B:110:0x01f3, B:112:0x01f7, B:114:0x01ff, B:116:0x0207, B:118:0x020b, B:120:0x0215, B:122:0x021d, B:127:0x0227, B:129:0x022f, B:133:0x023a, B:135:0x0240, B:151:0x0275, B:153:0x027b, B:157:0x0286, B:159:0x028c, B:161:0x0294, B:163:0x029e, B:165:0x02a8, B:167:0x02b2, B:169:0x02bc, B:171:0x02c6, B:173:0x02d0, B:177:0x02dd, B:179:0x02e5, B:181:0x02e9, B:185:0x02f4, B:187:0x02fc, B:209:0x0343, B:211:0x034f, B:212:0x0356, B:214:0x035d, B:215:0x0366, B:191:0x0307, B:193:0x030d, B:195:0x0315, B:197:0x0319, B:199:0x0321, B:201:0x0329, B:203:0x0333, B:205:0x033d, B:139:0x024b, B:141:0x024f, B:143:0x0259, B:145:0x0263, B:147:0x026b, B:84:0x018b, B:86:0x0191, B:88:0x0199, B:90:0x01a1, B:92:0x01ab, B:94:0x01b5, B:96:0x01bf, B:228:0x0382, B:229:0x0385, B:67:0x0116, B:222:0x037b, B:60:0x00f3, B:51:0x00ca), top: B:251:0x00be, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x030d A[Catch: Exception -> 0x0386, TryCatch #4 {Exception -> 0x0386, blocks: (B:48:0x00be, B:52:0x00d6, B:56:0x00de, B:59:0x00ee, B:61:0x00f8, B:62:0x0101, B:64:0x0105, B:66:0x0111, B:68:0x011c, B:69:0x0126, B:70:0x0145, B:73:0x015b, B:75:0x0161, B:77:0x016b, B:79:0x0175, B:81:0x017f, B:100:0x01cc, B:102:0x01d6, B:104:0x01de, B:108:0x01e9, B:110:0x01f3, B:112:0x01f7, B:114:0x01ff, B:116:0x0207, B:118:0x020b, B:120:0x0215, B:122:0x021d, B:127:0x0227, B:129:0x022f, B:133:0x023a, B:135:0x0240, B:151:0x0275, B:153:0x027b, B:157:0x0286, B:159:0x028c, B:161:0x0294, B:163:0x029e, B:165:0x02a8, B:167:0x02b2, B:169:0x02bc, B:171:0x02c6, B:173:0x02d0, B:177:0x02dd, B:179:0x02e5, B:181:0x02e9, B:185:0x02f4, B:187:0x02fc, B:209:0x0343, B:211:0x034f, B:212:0x0356, B:214:0x035d, B:215:0x0366, B:191:0x0307, B:193:0x030d, B:195:0x0315, B:197:0x0319, B:199:0x0321, B:201:0x0329, B:203:0x0333, B:205:0x033d, B:139:0x024b, B:141:0x024f, B:143:0x0259, B:145:0x0263, B:147:0x026b, B:84:0x018b, B:86:0x0191, B:88:0x0199, B:90:0x01a1, B:92:0x01ab, B:94:0x01b5, B:96:0x01bf, B:228:0x0382, B:229:0x0385, B:67:0x0116, B:222:0x037b, B:60:0x00f3, B:51:0x00ca), top: B:251:0x00be, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x034f A[Catch: Exception -> 0x0386, TryCatch #4 {Exception -> 0x0386, blocks: (B:48:0x00be, B:52:0x00d6, B:56:0x00de, B:59:0x00ee, B:61:0x00f8, B:62:0x0101, B:64:0x0105, B:66:0x0111, B:68:0x011c, B:69:0x0126, B:70:0x0145, B:73:0x015b, B:75:0x0161, B:77:0x016b, B:79:0x0175, B:81:0x017f, B:100:0x01cc, B:102:0x01d6, B:104:0x01de, B:108:0x01e9, B:110:0x01f3, B:112:0x01f7, B:114:0x01ff, B:116:0x0207, B:118:0x020b, B:120:0x0215, B:122:0x021d, B:127:0x0227, B:129:0x022f, B:133:0x023a, B:135:0x0240, B:151:0x0275, B:153:0x027b, B:157:0x0286, B:159:0x028c, B:161:0x0294, B:163:0x029e, B:165:0x02a8, B:167:0x02b2, B:169:0x02bc, B:171:0x02c6, B:173:0x02d0, B:177:0x02dd, B:179:0x02e5, B:181:0x02e9, B:185:0x02f4, B:187:0x02fc, B:209:0x0343, B:211:0x034f, B:212:0x0356, B:214:0x035d, B:215:0x0366, B:191:0x0307, B:193:0x030d, B:195:0x0315, B:197:0x0319, B:199:0x0321, B:201:0x0329, B:203:0x0333, B:205:0x033d, B:139:0x024b, B:141:0x024f, B:143:0x0259, B:145:0x0263, B:147:0x026b, B:84:0x018b, B:86:0x0191, B:88:0x0199, B:90:0x01a1, B:92:0x01ab, B:94:0x01b5, B:96:0x01bf, B:228:0x0382, B:229:0x0385, B:67:0x0116, B:222:0x037b, B:60:0x00f3, B:51:0x00ca), top: B:251:0x00be, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x035d A[Catch: Exception -> 0x0386, TryCatch #4 {Exception -> 0x0386, blocks: (B:48:0x00be, B:52:0x00d6, B:56:0x00de, B:59:0x00ee, B:61:0x00f8, B:62:0x0101, B:64:0x0105, B:66:0x0111, B:68:0x011c, B:69:0x0126, B:70:0x0145, B:73:0x015b, B:75:0x0161, B:77:0x016b, B:79:0x0175, B:81:0x017f, B:100:0x01cc, B:102:0x01d6, B:104:0x01de, B:108:0x01e9, B:110:0x01f3, B:112:0x01f7, B:114:0x01ff, B:116:0x0207, B:118:0x020b, B:120:0x0215, B:122:0x021d, B:127:0x0227, B:129:0x022f, B:133:0x023a, B:135:0x0240, B:151:0x0275, B:153:0x027b, B:157:0x0286, B:159:0x028c, B:161:0x0294, B:163:0x029e, B:165:0x02a8, B:167:0x02b2, B:169:0x02bc, B:171:0x02c6, B:173:0x02d0, B:177:0x02dd, B:179:0x02e5, B:181:0x02e9, B:185:0x02f4, B:187:0x02fc, B:209:0x0343, B:211:0x034f, B:212:0x0356, B:214:0x035d, B:215:0x0366, B:191:0x0307, B:193:0x030d, B:195:0x0315, B:197:0x0319, B:199:0x0321, B:201:0x0329, B:203:0x0333, B:205:0x033d, B:139:0x024b, B:141:0x024f, B:143:0x0259, B:145:0x0263, B:147:0x026b, B:84:0x018b, B:86:0x0191, B:88:0x0199, B:90:0x01a1, B:92:0x01ab, B:94:0x01b5, B:96:0x01bf, B:228:0x0382, B:229:0x0385, B:67:0x0116, B:222:0x037b, B:60:0x00f3, B:51:0x00ca), top: B:251:0x00be, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0382 A[Catch: Exception -> 0x0386, TRY_ENTER, TryCatch #4 {Exception -> 0x0386, blocks: (B:48:0x00be, B:52:0x00d6, B:56:0x00de, B:59:0x00ee, B:61:0x00f8, B:62:0x0101, B:64:0x0105, B:66:0x0111, B:68:0x011c, B:69:0x0126, B:70:0x0145, B:73:0x015b, B:75:0x0161, B:77:0x016b, B:79:0x0175, B:81:0x017f, B:100:0x01cc, B:102:0x01d6, B:104:0x01de, B:108:0x01e9, B:110:0x01f3, B:112:0x01f7, B:114:0x01ff, B:116:0x0207, B:118:0x020b, B:120:0x0215, B:122:0x021d, B:127:0x0227, B:129:0x022f, B:133:0x023a, B:135:0x0240, B:151:0x0275, B:153:0x027b, B:157:0x0286, B:159:0x028c, B:161:0x0294, B:163:0x029e, B:165:0x02a8, B:167:0x02b2, B:169:0x02bc, B:171:0x02c6, B:173:0x02d0, B:177:0x02dd, B:179:0x02e5, B:181:0x02e9, B:185:0x02f4, B:187:0x02fc, B:209:0x0343, B:211:0x034f, B:212:0x0356, B:214:0x035d, B:215:0x0366, B:191:0x0307, B:193:0x030d, B:195:0x0315, B:197:0x0319, B:199:0x0321, B:201:0x0329, B:203:0x0333, B:205:0x033d, B:139:0x024b, B:141:0x024f, B:143:0x0259, B:145:0x0263, B:147:0x026b, B:84:0x018b, B:86:0x0191, B:88:0x0199, B:90:0x01a1, B:92:0x01ab, B:94:0x01b5, B:96:0x01bf, B:228:0x0382, B:229:0x0385, B:67:0x0116, B:222:0x037b, B:60:0x00f3, B:51:0x00ca), top: B:251:0x00be, outer: #2 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.google.android.gms.internal.ads.zzgg, android.view.Surface, android.media.MediaCrypto] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzI() throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfq.zzI():void");
    }

    protected boolean zzJ(zzfo zzfoVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzfo zzK() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected final void zzL(zzafv[] zzafvVarArr, long j, long j2) throws zzaeg {
        if (this.zzal == -9223372036854775807L) {
            zzakt.zzd(this.zzak == -9223372036854775807L);
            this.zzak = j;
            this.zzal = j2;
            return;
        }
        int i = this.zzam;
        if (i == 10) {
            long j3 = this.zzn[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.zzam = i + 1;
        }
        long[] jArr = this.zzm;
        int i2 = this.zzam - 1;
        jArr[i2] = j;
        this.zzn[i2] = j2;
        this.zzo[i2] = this.zzaf;
    }

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahv
    public void zzM(float f, float f2) throws zzaeg {
        this.zzu = f;
        this.zzv = f2;
        zzaA(this.zzw);
    }

    /* JADX INFO: Access modifiers changed from: protected */
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

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0284, code lost:
        if (r15.zzq != null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
        r15.zzai = true;
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0128, code lost:
        com.google.android.gms.internal.ads.zzamo.zzb();
        r19 = r13;
        r2 = r14;
        r1 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0333 A[LOOP:2: B:81:0x0149->B:190:0x0333, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0344 A[Catch: IllegalStateException -> 0x0376, TryCatch #7 {IllegalStateException -> 0x0376, blocks: (B:187:0x032c, B:192:0x033e, B:194:0x0344, B:196:0x034a, B:183:0x0314, B:185:0x0326, B:203:0x035c), top: B:251:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x033b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v25 */
    /* JADX WARN: Type inference failed for: r19v26 */
    /* JADX WARN: Type inference failed for: r19v27 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v36 */
    /* JADX WARN: Type inference failed for: r19v37 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzahv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzO(long r24, long r26) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfq.zzO(long, long):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzP() throws zzaeg {
        boolean zzQ = zzQ();
        if (zzQ) {
            zzI();
        }
        return zzQ;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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

    protected final void zzS() {
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

    protected zzfn zzT(Throwable th, zzfo zzfoVar) {
        return new zzfn(th, zzfoVar);
    }

    protected void zzU(zzaf zzafVar) throws zzaeg {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzV(long j) {
        while (true) {
            int i = this.zzam;
            if (i == 0 || j < this.zzo[0]) {
                return;
            }
            long[] jArr = this.zzm;
            this.zzak = jArr[0];
            this.zzal = this.zzn[0];
            int i2 = i - 1;
            this.zzam = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.zzn;
            System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
            long[] jArr3 = this.zzo;
            System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
            zzC();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float zzW() {
        return this.zzu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzX() {
        return this.zzal;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzgh zzZ() {
        return this.zzan;
    }

    protected abstract int zzd(zzfs zzfsVar, zzafv zzafvVar) throws zzfy;

    protected abstract List<zzfo> zze(zzfs zzfsVar, zzafv zzafvVar, boolean z) throws zzfy;

    protected boolean zzf(zzafv zzafvVar) {
        return false;
    }

    protected abstract zzfl zzg(zzfo zzfoVar, zzafv zzafvVar, MediaCrypto mediaCrypto, float f);

    protected zzba zzh(zzfo zzfoVar, zzafv zzafvVar, zzafv zzafvVar2) {
        throw null;
    }

    protected float zzj(float f, zzafv zzafvVar, zzafv[] zzafvVarArr) {
        throw null;
    }

    protected void zzk(String str, long j, long j2) {
        throw null;
    }

    protected void zzl(String str) {
        throw null;
    }

    protected void zzm(Exception exc) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        if (zzaB() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
        if (zzaB() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
        if (zzaB() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzba zzn(com.google.android.gms.internal.ads.zzafw r13) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfq.zzn(com.google.android.gms.internal.ads.zzafw):com.google.android.gms.internal.ads.zzba");
    }

    protected void zzo(zzafv zzafvVar, MediaFormat mediaFormat) throws zzaeg {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzadv
    public void zzq(boolean z, boolean z2) throws zzaeg {
        this.zza = new zzaz();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzadv
    public void zzr(long j, boolean z) throws zzaeg {
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
        int i = this.zzam;
        if (i != 0) {
            int i2 = i - 1;
            this.zzal = this.zzn[i2];
            this.zzak = this.zzm[i2];
            this.zzam = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzadv
    public void zzu() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzQ();
    }

    /* JADX INFO: Access modifiers changed from: protected */
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

    protected final boolean zzQ() {
        if (this.zzan == null) {
            return false;
        }
        if (this.zzab != 3 && !this.zzF && ((!this.zzG || this.zzae) && (!this.zzH || !this.zzad))) {
            zzb();
            return false;
        }
        zzN();
        return true;
    }

    private final void zzaD() throws zzaeg {
        int i = this.zzab;
        if (i == 1) {
            zzb();
        } else if (i == 2) {
            zzb();
            zzaE();
        } else if (i != 3) {
            this.zzai = true;
            zzD();
        } else {
            zzN();
            zzI();
        }
    }
}
