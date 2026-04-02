package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import com.google.common.primitives.Ints;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzbc extends zzaet implements zzaga {
    private static final zzbc zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private zzbe zzM;
    private zzax zzaC;
    private long zzaI;
    private zzao zzaL;
    private zzaq zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private zzbl zzaW;
    private zzaz zzae;
    private zzbb zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private zzbn zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = 1000;
    private int zzX = 1000;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = 1000;
    private zzaez zzaf = zzaet.zzaF();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = 1000;
    private int zzax = 1000;
    private String zzay = "D";
    private zzaez zzaz = zzaet.zzaF();
    private int zzaA = 1000;
    private zzaez zzaB = zzaet.zzaF();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        zzbc zzbcVar = new zzbc();
        zzb = zzbcVar;
        zzaet.zzaM(zzbc.class, zzbcVar);
    }

    private zzbc() {
    }

    public static /* synthetic */ void zzA(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 134217728;
        zzbcVar.zzH = j;
    }

    public static /* synthetic */ void zzB(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzd |= 268435456;
        zzbcVar.zzI = str;
    }

    public static /* synthetic */ void zzC(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 536870912;
        zzbcVar.zzJ = j;
    }

    public static /* synthetic */ void zzD(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= Ints.MAX_POWER_OF_TWO;
        zzbcVar.zzK = j;
    }

    public static /* synthetic */ void zzE(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= Integer.MIN_VALUE;
        zzbcVar.zzL = j;
    }

    public static /* synthetic */ void zzF(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 2;
        zzbcVar.zzN = j;
    }

    public static /* synthetic */ void zzG(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 4;
        zzbcVar.zzO = j;
    }

    public static /* synthetic */ void zzH(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 8;
        zzbcVar.zzP = j;
    }

    public static /* synthetic */ void zzI(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 16;
        zzbcVar.zzQ = j;
    }

    public static /* synthetic */ void zzJ(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 32;
        zzbcVar.zzR = j;
    }

    public static /* synthetic */ void zzK(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 64;
        zzbcVar.zzS = j;
    }

    public static /* synthetic */ void zzL(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zze |= 128;
        zzbcVar.zzT = str;
    }

    public static /* synthetic */ void zzM(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zze |= 256;
        zzbcVar.zzU = str;
    }

    public static /* synthetic */ void zzN(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 4096;
        zzbcVar.zzY = j;
    }

    public static /* synthetic */ void zzO(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 8192;
        zzbcVar.zzZ = j;
    }

    public static /* synthetic */ void zzP(zzbc zzbcVar, long j) {
        zzbcVar.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzbcVar.zzaa = j;
    }

    public static /* synthetic */ void zzQ(zzbc zzbcVar, zzaz zzazVar) {
        zzazVar.getClass();
        zzbcVar.zzae = zzazVar;
        zzbcVar.zze |= 262144;
    }

    public static /* synthetic */ void zzR(zzbc zzbcVar, zzaz zzazVar) {
        zzazVar.getClass();
        zzaez zzaezVar = zzbcVar.zzaf;
        if (!zzaezVar.zzc()) {
            zzbcVar.zzaf = zzaet.zzaG(zzaezVar);
        }
        zzbcVar.zzaf.add(zzazVar);
    }

    public static /* synthetic */ void zzT(zzbc zzbcVar, zzbb zzbbVar) {
        zzbbVar.getClass();
        zzbcVar.zzag = zzbbVar;
        zzbcVar.zze |= 524288;
    }

    public static /* synthetic */ void zzU(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 2097152;
        zzbcVar.zzai = j;
    }

    public static /* synthetic */ void zzV(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 4194304;
        zzbcVar.zzaj = j;
    }

    public static /* synthetic */ void zzW(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 8388608;
        zzbcVar.zzak = j;
    }

    public static /* synthetic */ void zzX(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 67108864;
        zzbcVar.zzan = j;
    }

    public static /* synthetic */ void zzY(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 134217728;
        zzbcVar.zzao = j;
    }

    public static /* synthetic */ void zzZ(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zze |= 268435456;
        zzbcVar.zzap = str;
    }

    public static zzaf zza() {
        return (zzaf) zzb.zzay();
    }

    public static /* synthetic */ void zzaa(zzbc zzbcVar, long j) {
        zzbcVar.zzf |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzbcVar.zzaE = j;
    }

    public static /* synthetic */ void zzab(zzbc zzbcVar, long j) {
        zzbcVar.zzf |= 1024;
        zzbcVar.zzaF = j;
    }

    public static /* synthetic */ void zzac(zzbc zzbcVar, long j) {
        zzbcVar.zzf |= 2048;
        zzbcVar.zzaG = j;
    }

    public static /* synthetic */ void zzad(zzbc zzbcVar, long j) {
        zzbcVar.zzf |= 4096;
        zzbcVar.zzaH = j;
    }

    public static /* synthetic */ void zzae(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzf |= 32768;
        zzbcVar.zzaK = str;
    }

    public static /* synthetic */ void zzaf(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzf |= 4194304;
        zzbcVar.zzaR = str;
    }

    public static /* synthetic */ void zzag(zzbc zzbcVar, boolean z) {
        zzbcVar.zzf |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzbcVar.zzaT = z;
    }

    public static /* synthetic */ void zzah(zzbc zzbcVar, long j) {
        zzbcVar.zzf |= 67108864;
        zzbcVar.zzaV = j;
    }

    public static /* synthetic */ void zzam(zzbc zzbcVar, int i) {
        zzbcVar.zzW = i - 1;
        zzbcVar.zze |= 1024;
    }

    public static /* synthetic */ void zzan(zzbc zzbcVar, int i) {
        zzbcVar.zzX = i - 1;
        zzbcVar.zze |= 2048;
    }

    public static /* synthetic */ void zzao(zzbc zzbcVar, int i) {
        zzbcVar.zzad = i - 1;
        zzbcVar.zze |= 131072;
    }

    public static /* synthetic */ void zzap(zzbc zzbcVar, int i) {
        zzbcVar.zzaw = i - 1;
        zzbcVar.zzf |= 8;
    }

    public static /* synthetic */ void zzaq(zzbc zzbcVar, int i) {
        zzbcVar.zzax = i - 1;
        zzbcVar.zzf |= 16;
    }

    public static /* synthetic */ void zzar(zzbc zzbcVar, int i) {
        zzbcVar.zzaP = i - 1;
        zzbcVar.zzf |= 1048576;
    }

    public static /* synthetic */ void zzas(zzbc zzbcVar, int i) {
        zzbcVar.zzaS = 5;
        zzbcVar.zzf |= 8388608;
    }

    public static zzbc zzc() {
        return zzb;
    }

    public static zzbc zzd(byte[] bArr, zzaef zzaefVar) throws zzafc {
        return (zzbc) zzaet.zzaD(zzb, bArr, zzaefVar);
    }

    public static /* synthetic */ void zzh(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzd |= 1;
        zzbcVar.zzg = str;
    }

    public static /* synthetic */ void zzi(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzd |= 2;
        zzbcVar.zzh = str;
    }

    public static /* synthetic */ void zzk(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 4;
        zzbcVar.zzi = j;
    }

    public static /* synthetic */ void zzl(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 16;
        zzbcVar.zzk = j;
    }

    public static /* synthetic */ void zzm(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 32;
        zzbcVar.zzl = j;
    }

    public static /* synthetic */ void zzn(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 1024;
        zzbcVar.zzq = j;
    }

    public static /* synthetic */ void zzo(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 2048;
        zzbcVar.zzr = j;
    }

    public static /* synthetic */ void zzp(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 8192;
        zzbcVar.zzt = j;
    }

    public static /* synthetic */ void zzq(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzbcVar.zzu = j;
    }

    public static /* synthetic */ void zzr(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 32768;
        zzbcVar.zzv = j;
    }

    public static /* synthetic */ void zzs(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= Cast.MAX_MESSAGE_LENGTH;
        zzbcVar.zzw = j;
    }

    public static /* synthetic */ void zzt(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 524288;
        zzbcVar.zzz = j;
    }

    public static /* synthetic */ void zzu(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 1048576;
        zzbcVar.zzA = j;
    }

    public static /* synthetic */ void zzv(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 2097152;
        zzbcVar.zzB = j;
    }

    public static /* synthetic */ void zzw(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzd |= 4194304;
        zzbcVar.zzC = str;
    }

    public static /* synthetic */ void zzx(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzd |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzbcVar.zzE = str;
    }

    public static /* synthetic */ void zzy(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 33554432;
        zzbcVar.zzF = j;
    }

    public static /* synthetic */ void zzz(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 67108864;
        zzbcVar.zzG = j;
    }

    public final boolean zzai() {
        return this.zzaT;
    }

    public final boolean zzaj() {
        if ((this.zzd & 4194304) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzak() {
        if ((this.zzf & 134217728) != 0) {
            return true;
        }
        return false;
    }

    public final int zzal() {
        int zza = zzal.zza(this.zzaS);
        if (zza == 0) {
            return 3;
        }
        return zza;
    }

    public final zzbl zze() {
        zzbl zzblVar = this.zzaW;
        if (zzblVar == null) {
            return zzbl.zzc();
        }
        return zzblVar;
    }

    public final String zzf() {
        return this.zzaR;
    }

    public final String zzg() {
        return this.zzC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaf(null);
                }
                return new zzbc();
            }
            zzaex zzaexVar = zzak.zza;
            zzaex zzaexVar2 = zzbi.zza;
            return zzaet.zzaJ(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001aဌW\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^ဌTÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", zzaexVar, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", zzaz.class, "zzR", "zzS", "zzT", "zzU", "zzW", zzaexVar2, "zzX", zzaexVar2, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", zzaexVar2, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", zzbh.zza, "zzas", zzbj.zza, "zzap", "zzat", zzag.zza, "zzau", "zzav", "zzal", "zzam", "zzaw", zzaexVar2, "zzV", "zzD", "zzax", zzaexVar2, "zzay", "zzaz", zzav.class, "zzaA", zzaexVar2, "zzaB", zzai.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", zzas.zza, "zzaW", "zzaX", "zzaY"});
        }
        return (byte) 1;
    }
}
