package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.util.FileUtil;
import com.google.android.gms.ads.AdRequest;
/* loaded from: classes.dex */
public final class zzyz extends zzgga<zzyz, zzyj> implements zzghj {
    private static final zzyz zzaM;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private zzzb zzM;
    private zzyu zzaC;
    private long zzaD;
    private boolean zzaG;
    private long zzaI;
    private zzzi zzaJ;
    private long zzaK;
    private zzyw zzae;
    private zzyy zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private zzzk zzau;
    private int zzb;
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
    private zzggj<zzyw> zzaf = zzgga.zzaE();
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
    private zzggj<zzys> zzaz = zzgga.zzaE();
    private int zzaA = 1000;
    private zzggj<zzym> zzaB = zzgga.zzaE();
    private String zzaE = "";
    private int zzaF = 2;
    private String zzaH = "";
    private String zzaL = "";

    static {
        zzyz zzyzVar = new zzyz();
        zzaM = zzyzVar;
        zzgga.zzay(zzyz.class, zzyzVar);
    }

    private zzyz() {
    }

    public static /* synthetic */ void zzA(zzyz zzyzVar, String str) {
        str.getClass();
        zzyzVar.zzb |= 16777216;
        zzyzVar.zzE = str;
    }

    public static /* synthetic */ void zzB(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 33554432;
        zzyzVar.zzF = j2;
    }

    public static /* synthetic */ void zzC(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 67108864;
        zzyzVar.zzG = j2;
    }

    public static /* synthetic */ void zzD(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 134217728;
        zzyzVar.zzH = j2;
    }

    public static /* synthetic */ void zzE(zzyz zzyzVar, String str) {
        str.getClass();
        zzyzVar.zzb |= 268435456;
        zzyzVar.zzI = str;
    }

    public static /* synthetic */ void zzF(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 536870912;
        zzyzVar.zzJ = j2;
    }

    public static /* synthetic */ void zzG(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 1073741824;
        zzyzVar.zzK = j2;
    }

    public static /* synthetic */ void zzH(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= Level.ALL_INT;
        zzyzVar.zzL = j2;
    }

    public static /* synthetic */ void zzI(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 2;
        zzyzVar.zzN = j2;
    }

    public static /* synthetic */ void zzJ(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 4;
        zzyzVar.zzO = j2;
    }

    public static /* synthetic */ void zzK(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 8;
        zzyzVar.zzP = j2;
    }

    public static /* synthetic */ void zzL(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 16;
        zzyzVar.zzQ = j2;
    }

    public static /* synthetic */ void zzM(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 32;
        zzyzVar.zzR = j2;
    }

    public static /* synthetic */ void zzN(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 64;
        zzyzVar.zzS = j2;
    }

    public static /* synthetic */ void zzO(zzyz zzyzVar, String str) {
        str.getClass();
        zzyzVar.zze |= 128;
        zzyzVar.zzT = str;
    }

    public static /* synthetic */ void zzP(zzyz zzyzVar, String str) {
        str.getClass();
        zzyzVar.zze |= 256;
        zzyzVar.zzU = str;
    }

    public static /* synthetic */ void zzQ(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 4096;
        zzyzVar.zzY = j2;
    }

    public static /* synthetic */ void zzR(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= Compressor.BUFFER_SIZE;
        zzyzVar.zzZ = j2;
    }

    public static /* synthetic */ void zzS(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 16384;
        zzyzVar.zzaa = j2;
    }

    public static /* synthetic */ void zzT(zzyz zzyzVar, zzyw zzywVar) {
        zzywVar.getClass();
        zzyzVar.zzae = zzywVar;
        zzyzVar.zze |= 262144;
    }

    public static /* synthetic */ void zzU(zzyz zzyzVar, zzyw zzywVar) {
        zzywVar.getClass();
        zzggj<zzyw> zzggjVar = zzyzVar.zzaf;
        if (!zzggjVar.zza()) {
            zzyzVar.zzaf = zzgga.zzaF(zzggjVar);
        }
        zzyzVar.zzaf.add(zzywVar);
    }

    public static /* synthetic */ void zzW(zzyz zzyzVar, zzyy zzyyVar) {
        zzyyVar.getClass();
        zzyzVar.zzag = zzyyVar;
        zzyzVar.zze |= 524288;
    }

    public static /* synthetic */ void zzX(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 2097152;
        zzyzVar.zzai = j2;
    }

    public static /* synthetic */ void zzY(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 4194304;
        zzyzVar.zzaj = j2;
    }

    public static /* synthetic */ void zzZ(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 8388608;
        zzyzVar.zzak = j2;
    }

    public static /* synthetic */ void zzaa(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 67108864;
        zzyzVar.zzan = j2;
    }

    public static /* synthetic */ void zzab(zzyz zzyzVar, long j2) {
        zzyzVar.zze |= 134217728;
        zzyzVar.zzao = j2;
    }

    public static /* synthetic */ void zzac(zzyz zzyzVar, String str) {
        str.getClass();
        zzyzVar.zze |= 268435456;
        zzyzVar.zzap = str;
    }

    public static /* synthetic */ void zzad(zzyz zzyzVar, String str) {
        str.getClass();
        zzyzVar.zzf |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzyzVar.zzaE = str;
    }

    public static /* synthetic */ void zzae(zzyz zzyzVar, boolean z) {
        zzyzVar.zzf |= ThrowableProxyConverter.BUILDER_CAPACITY;
        zzyzVar.zzaG = z;
    }

    public static /* synthetic */ void zzaf(zzyz zzyzVar, long j2) {
        zzyzVar.zzf |= Compressor.BUFFER_SIZE;
        zzyzVar.zzaI = j2;
    }

    public static /* synthetic */ void zzah(zzyz zzyzVar, int i2) {
        zzyzVar.zzW = i2 - 1;
        zzyzVar.zze |= 1024;
    }

    public static /* synthetic */ void zzai(zzyz zzyzVar, int i2) {
        zzyzVar.zzX = i2 - 1;
        zzyzVar.zze |= ThrowableProxyConverter.BUILDER_CAPACITY;
    }

    public static /* synthetic */ void zzaj(zzyz zzyzVar, int i2) {
        zzyzVar.zzad = i2 - 1;
        zzyzVar.zze |= 131072;
    }

    public static /* synthetic */ void zzak(zzyz zzyzVar, int i2) {
        zzyzVar.zzaw = i2 - 1;
        zzyzVar.zzf |= 8;
    }

    public static /* synthetic */ void zzal(zzyz zzyzVar, int i2) {
        zzyzVar.zzax = i2 - 1;
        zzyzVar.zzf |= 16;
    }

    public static /* synthetic */ void zzam(zzyz zzyzVar, int i2) {
        zzyzVar.zzaF = 5;
        zzyzVar.zzf |= 1024;
    }

    public static zzyz zzh(byte[] bArr, zzgfm zzgfmVar) throws zzggm {
        return (zzyz) zzgga.zzaK(zzaM, bArr, zzgfmVar);
    }

    public static zzyj zzi() {
        return zzaM.zzas();
    }

    public static zzyz zzj() {
        return zzaM;
    }

    public static /* synthetic */ void zzl(zzyz zzyzVar, String str) {
        str.getClass();
        zzyzVar.zzb |= 1;
        zzyzVar.zzg = str;
    }

    public static /* synthetic */ void zzm(zzyz zzyzVar, String str) {
        str.getClass();
        zzyzVar.zzb |= 2;
        zzyzVar.zzh = str;
    }

    public static /* synthetic */ void zzn(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 4;
        zzyzVar.zzi = j2;
    }

    public static /* synthetic */ void zzo(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 16;
        zzyzVar.zzk = j2;
    }

    public static /* synthetic */ void zzp(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 32;
        zzyzVar.zzl = j2;
    }

    public static /* synthetic */ void zzq(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 1024;
        zzyzVar.zzq = j2;
    }

    public static /* synthetic */ void zzr(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= ThrowableProxyConverter.BUILDER_CAPACITY;
        zzyzVar.zzr = j2;
    }

    public static /* synthetic */ void zzs(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= Compressor.BUFFER_SIZE;
        zzyzVar.zzt = j2;
    }

    public static /* synthetic */ void zzt(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 16384;
        zzyzVar.zzu = j2;
    }

    public static /* synthetic */ void zzu(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= FileUtil.BUF_SIZE;
        zzyzVar.zzv = j2;
    }

    public static /* synthetic */ void zzv(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 65536;
        zzyzVar.zzw = j2;
    }

    public static /* synthetic */ void zzw(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 524288;
        zzyzVar.zzz = j2;
    }

    public static /* synthetic */ void zzx(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 1048576;
        zzyzVar.zzA = j2;
    }

    public static /* synthetic */ void zzy(zzyz zzyzVar, long j2) {
        zzyzVar.zzb |= 2097152;
        zzyzVar.zzB = j2;
    }

    public static /* synthetic */ void zzz(zzyz zzyzVar, String str) {
        str.getClass();
        zzyzVar.zzb |= 4194304;
        zzyzVar.zzC = str;
    }

    public final boolean zza() {
        return (this.zzb & 4194304) != 0;
    }

    public final int zzag() {
        int zza = zzyp.zza(this.zzaF);
        if (zza == 0) {
            return 3;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                zzgge zzggeVar = zzzf.zza;
                return zzgga.zzaz(zzaM, "\u0001T\u0000\u0003\u0001ĮT\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂH\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈI\u0019ဂM\u001aဌJ\u001bဈ\u0016\u001cဇK\u001dဈ\u0018\u001eဈL\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGÉဉNĭဂOĮဈP", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaD", "zzA", "zzB", "zzaE", "zzaI", "zzaF", zzyo.zza, "zzC", "zzaG", "zzE", "zzaH", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", zzyw.class, "zzR", "zzS", "zzT", "zzU", "zzW", zzggeVar, "zzX", zzggeVar, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", zzggeVar, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", zzze.zza, "zzas", zzzg.zza, "zzap", "zzat", zzyk.zza, "zzau", "zzav", "zzal", "zzam", "zzaw", zzggeVar, "zzV", "zzD", "zzax", zzggeVar, "zzay", "zzaz", zzys.class, "zzaA", zzggeVar, "zzaB", zzym.class, "zzaC", "zzaJ", "zzaK", "zzaL"});
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        return null;
                    }
                    return zzaM;
                }
                return new zzyj(null);
            } else {
                return new zzyz();
            }
        }
        return (byte) 1;
    }

    public final String zzc() {
        return this.zzC;
    }

    public final String zzd() {
        return this.zzaE;
    }

    public final boolean zze() {
        return this.zzaG;
    }

    public final boolean zzf() {
        return (this.zzf & 16384) != 0;
    }

    public final zzzi zzg() {
        zzzi zzziVar = this.zzaJ;
        return zzziVar == null ? zzzi.zzd() : zzziVar;
    }
}
