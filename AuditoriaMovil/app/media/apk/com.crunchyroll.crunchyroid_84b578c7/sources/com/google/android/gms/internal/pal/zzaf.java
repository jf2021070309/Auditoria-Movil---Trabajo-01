package com.google.android.gms.internal.pal;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import com.google.common.primitives.Ints;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzaf extends zzacz implements zzaeg {
    private static final zzaf zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzG;
    private long zzH;
    private long zzI;
    private long zzK;
    private zzah zzN;
    private zzaa zzaD;
    private long zzaJ;
    private long zzaM;
    private boolean zzaP;
    private long zzaR;
    private zzaq zzaS;
    private long zzaT;
    private zzac zzaf;
    private zzae zzah;
    private int zzas;
    private int zzat;
    private int zzau;
    private zzas zzav;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzh = "";
    private String zzi = "";
    private String zzt = "";
    private String zzD = "";
    private String zzE = "D";
    private String zzF = "";
    private String zzJ = "";
    private long zzL = -1;
    private long zzM = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private String zzU = "D";
    private String zzV = "D";
    private long zzW = -1;
    private int zzX = 1000;
    private int zzY = 1000;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private int zzae = 1000;
    private zzadf zzag = zzacz.zzaz();
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private String zzaq = "D";
    private long zzar = -1;
    private long zzaw = -1;
    private int zzax = 1000;
    private int zzay = 1000;
    private String zzaz = "D";
    private zzadf zzaA = zzacz.zzaz();
    private int zzaB = 1000;
    private zzadf zzaC = zzacz.zzaz();
    private String zzaE = "";
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaI = -1;
    private long zzaK = -1;
    private String zzaL = "";
    private String zzaN = "";
    private int zzaO = 2;
    private String zzaQ = "";
    private String zzaU = "";

    static {
        zzaf zzafVar = new zzaf();
        zzb = zzafVar;
        zzacz.zzaF(zzaf.class, zzafVar);
    }

    private zzaf() {
    }

    public static /* synthetic */ void zzA(zzaf zzafVar, long j) {
        zzafVar.zze |= 536870912;
        zzafVar.zzK = j;
    }

    public static /* synthetic */ void zzB(zzaf zzafVar, long j) {
        zzafVar.zze |= Ints.MAX_POWER_OF_TWO;
        zzafVar.zzL = j;
    }

    public static /* synthetic */ void zzC(zzaf zzafVar, long j) {
        zzafVar.zze |= Integer.MIN_VALUE;
        zzafVar.zzM = j;
    }

    public static /* synthetic */ void zzD(zzaf zzafVar, long j) {
        zzafVar.zzf |= 2;
        zzafVar.zzO = j;
    }

    public static /* synthetic */ void zzE(zzaf zzafVar, long j) {
        zzafVar.zzf |= 4;
        zzafVar.zzP = j;
    }

    public static /* synthetic */ void zzF(zzaf zzafVar, long j) {
        zzafVar.zzf |= 8;
        zzafVar.zzQ = j;
    }

    public static /* synthetic */ void zzG(zzaf zzafVar, long j) {
        zzafVar.zzf |= 16;
        zzafVar.zzR = j;
    }

    public static /* synthetic */ void zzH(zzaf zzafVar, long j) {
        zzafVar.zzf |= 32;
        zzafVar.zzS = j;
    }

    public static /* synthetic */ void zzI(zzaf zzafVar, long j) {
        zzafVar.zzf |= 64;
        zzafVar.zzT = j;
    }

    public static /* synthetic */ void zzJ(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zzf |= 128;
        zzafVar.zzU = str;
    }

    public static /* synthetic */ void zzK(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zzf |= 256;
        zzafVar.zzV = str;
    }

    public static /* synthetic */ void zzL(zzaf zzafVar, long j) {
        zzafVar.zzf |= 4096;
        zzafVar.zzZ = j;
    }

    public static /* synthetic */ void zzM(zzaf zzafVar, long j) {
        zzafVar.zzf |= 8192;
        zzafVar.zzaa = j;
    }

    public static /* synthetic */ void zzN(zzaf zzafVar, long j) {
        zzafVar.zzf |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzafVar.zzab = j;
    }

    public static /* synthetic */ void zzO(zzaf zzafVar, zzac zzacVar) {
        zzacVar.getClass();
        zzafVar.zzaf = zzacVar;
        zzafVar.zzf |= 262144;
    }

    public static /* synthetic */ void zzP(zzaf zzafVar, zzac zzacVar) {
        zzacVar.getClass();
        zzadf zzadfVar = zzafVar.zzag;
        if (!zzadfVar.zzc()) {
            zzafVar.zzag = zzacz.zzaA(zzadfVar);
        }
        zzafVar.zzag.add(zzacVar);
    }

    public static /* synthetic */ void zzR(zzaf zzafVar, zzae zzaeVar) {
        zzaeVar.getClass();
        zzafVar.zzah = zzaeVar;
        zzafVar.zzf |= 524288;
    }

    public static /* synthetic */ void zzS(zzaf zzafVar, long j) {
        zzafVar.zzf |= 2097152;
        zzafVar.zzaj = j;
    }

    public static /* synthetic */ void zzT(zzaf zzafVar, long j) {
        zzafVar.zzf |= 4194304;
        zzafVar.zzak = j;
    }

    public static /* synthetic */ void zzU(zzaf zzafVar, long j) {
        zzafVar.zzf |= 8388608;
        zzafVar.zzal = j;
    }

    public static /* synthetic */ void zzV(zzaf zzafVar, long j) {
        zzafVar.zzf |= 67108864;
        zzafVar.zzao = j;
    }

    public static /* synthetic */ void zzW(zzaf zzafVar, long j) {
        zzafVar.zzf |= 134217728;
        zzafVar.zzap = j;
    }

    public static /* synthetic */ void zzX(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zzf |= 268435456;
        zzafVar.zzaq = str;
    }

    public static /* synthetic */ void zzY(zzaf zzafVar, zzas zzasVar) {
        zzasVar.getClass();
        zzafVar.zzav = zzasVar;
        zzafVar.zzg |= 2;
    }

    public static /* synthetic */ void zzZ(zzaf zzafVar, long j) {
        zzafVar.zzg |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzafVar.zzaF = j;
    }

    public static zzr zza() {
        return (zzr) zzb.zzau();
    }

    public static /* synthetic */ void zzaa(zzaf zzafVar, long j) {
        zzafVar.zzg |= 1024;
        zzafVar.zzaG = j;
    }

    public static /* synthetic */ void zzab(zzaf zzafVar, long j) {
        zzafVar.zzg |= 2048;
        zzafVar.zzaH = j;
    }

    public static /* synthetic */ void zzac(zzaf zzafVar, long j) {
        zzafVar.zzg |= 4096;
        zzafVar.zzaI = j;
    }

    public static /* synthetic */ void zzad(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zzg |= 32768;
        zzafVar.zzaL = str;
    }

    public static /* synthetic */ void zzae(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zzg |= 131072;
        zzafVar.zzaN = str;
    }

    public static /* synthetic */ void zzaf(zzaf zzafVar, boolean z) {
        zzafVar.zzg |= 524288;
        zzafVar.zzaP = z;
    }

    public static /* synthetic */ void zzag(zzaf zzafVar, long j) {
        zzafVar.zzg |= 2097152;
        zzafVar.zzaR = j;
    }

    public static /* synthetic */ void zzaj(zzaf zzafVar, int i) {
        zzafVar.zzX = i - 1;
        zzafVar.zzf |= 1024;
    }

    public static /* synthetic */ void zzak(zzaf zzafVar, int i) {
        zzafVar.zzY = i - 1;
        zzafVar.zzf |= 2048;
    }

    public static /* synthetic */ void zzal(zzaf zzafVar, int i) {
        zzafVar.zzae = i - 1;
        zzafVar.zzf |= 131072;
    }

    public static /* synthetic */ void zzam(zzaf zzafVar, int i) {
        zzafVar.zzax = i - 1;
        zzafVar.zzg |= 8;
    }

    public static /* synthetic */ void zzan(zzaf zzafVar, int i) {
        zzafVar.zzay = i - 1;
        zzafVar.zzg |= 16;
    }

    public static /* synthetic */ void zzao(zzaf zzafVar, int i) {
        zzafVar.zzaO = 5;
        zzafVar.zzg |= 262144;
    }

    public static zzaf zzd(byte[] bArr, zzacm zzacmVar) throws zzadi {
        return (zzaf) zzacz.zzax(zzb, bArr, zzacmVar);
    }

    public static /* synthetic */ void zzg(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zze |= 1;
        zzafVar.zzh = str;
    }

    public static /* synthetic */ void zzh(zzaf zzafVar, String str) {
        zzafVar.zze |= 2;
        zzafVar.zzi = str;
    }

    public static /* synthetic */ void zzi(zzaf zzafVar, long j) {
        zzafVar.zze |= 4;
        zzafVar.zzj = j;
    }

    public static /* synthetic */ void zzj(zzaf zzafVar, long j) {
        zzafVar.zze |= 16;
        zzafVar.zzl = j;
    }

    public static /* synthetic */ void zzk(zzaf zzafVar, long j) {
        zzafVar.zze |= 32;
        zzafVar.zzm = j;
    }

    public static /* synthetic */ void zzl(zzaf zzafVar, long j) {
        zzafVar.zze |= 1024;
        zzafVar.zzr = j;
    }

    public static /* synthetic */ void zzm(zzaf zzafVar, long j) {
        zzafVar.zze |= 2048;
        zzafVar.zzs = j;
    }

    public static /* synthetic */ void zzn(zzaf zzafVar, long j) {
        zzafVar.zze |= 8192;
        zzafVar.zzu = j;
    }

    public static /* synthetic */ void zzo(zzaf zzafVar, long j) {
        zzafVar.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzafVar.zzv = j;
    }

    public static /* synthetic */ void zzp(zzaf zzafVar, long j) {
        zzafVar.zze |= 32768;
        zzafVar.zzw = j;
    }

    public static /* synthetic */ void zzq(zzaf zzafVar, long j) {
        zzafVar.zze |= Cast.MAX_MESSAGE_LENGTH;
        zzafVar.zzx = j;
    }

    public static /* synthetic */ void zzr(zzaf zzafVar, long j) {
        zzafVar.zze |= 524288;
        zzafVar.zzA = j;
    }

    public static /* synthetic */ void zzs(zzaf zzafVar, long j) {
        zzafVar.zze |= 1048576;
        zzafVar.zzB = j;
    }

    public static /* synthetic */ void zzt(zzaf zzafVar, long j) {
        zzafVar.zze |= 2097152;
        zzafVar.zzC = j;
    }

    public static /* synthetic */ void zzu(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zze |= 4194304;
        zzafVar.zzD = str;
    }

    public static /* synthetic */ void zzv(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zze |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzafVar.zzF = str;
    }

    public static /* synthetic */ void zzw(zzaf zzafVar, long j) {
        zzafVar.zze |= 33554432;
        zzafVar.zzG = j;
    }

    public static /* synthetic */ void zzx(zzaf zzafVar, long j) {
        zzafVar.zze |= 67108864;
        zzafVar.zzH = j;
    }

    public static /* synthetic */ void zzy(zzaf zzafVar, long j) {
        zzafVar.zze |= 134217728;
        zzafVar.zzI = j;
    }

    public static /* synthetic */ void zzz(zzaf zzafVar, String str) {
        str.getClass();
        zzafVar.zze |= 268435456;
        zzafVar.zzJ = str;
    }

    public final boolean zzah() {
        if ((this.zze & 4194304) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzai() {
        if ((this.zzg & 4194304) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i, Object obj, Object obj2) {
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
                    return new zzr(null);
                }
                return new zzaf();
            }
            zzadd zzaddVar = zzv.zza;
            zzadd zzaddVar2 = zzan.zza;
            return zzacz.zzaE(zzb, "\u0001\\\u0000\u0003\u0001Į\\\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂP\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈQ\u0019ဂU\u001aဌR\u001bဈ\u0016\u001cဇS\u001dဈ\u0018\u001eဈT\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOÉဉVĭဂWĮဈX", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzaM", "zzB", "zzC", "zzaN", "zzaR", "zzaO", zzaddVar, "zzD", "zzaP", "zzF", "zzaQ", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzag", zzac.class, "zzS", "zzT", "zzU", "zzV", "zzX", zzaddVar2, "zzY", zzaddVar2, "zzaf", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", zzaddVar2, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzao", "zzap", "zzar", "zzas", zzam.zza, "zzat", zzao.zza, "zzaq", "zzau", zzs.zza, "zzav", "zzaw", "zzam", "zzan", "zzax", zzaddVar2, "zzW", "zzE", "zzay", zzaddVar2, "zzaz", "zzaA", zzy.class, "zzaB", zzaddVar2, "zzaC", zzu.class, "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaS", "zzaT", "zzaU"});
        }
        return (byte) 1;
    }

    public final zzaq zze() {
        zzaq zzaqVar = this.zzaS;
        if (zzaqVar == null) {
            return zzaq.zzd();
        }
        return zzaqVar;
    }

    public final String zzf() {
        return this.zzD;
    }
}
