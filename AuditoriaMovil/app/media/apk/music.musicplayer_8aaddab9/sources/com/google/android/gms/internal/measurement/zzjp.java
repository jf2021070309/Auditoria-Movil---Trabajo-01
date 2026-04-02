package com.google.android.gms.internal.measurement;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zza uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzjp {
    public static final zzjp zzA;
    public static final zzjp zzB;
    public static final zzjp zzC;
    public static final zzjp zzD;
    public static final zzjp zzE;
    public static final zzjp zzF;
    public static final zzjp zzG;
    public static final zzjp zzH;
    public static final zzjp zzI;
    public static final zzjp zzJ;
    public static final zzjp zzK;
    public static final zzjp zzL;
    public static final zzjp zzM;
    public static final zzjp zzN;
    public static final zzjp zzO;
    public static final zzjp zzP;
    public static final zzjp zzQ;
    public static final zzjp zzR;
    public static final zzjp zzS;
    public static final zzjp zzT;
    public static final zzjp zzU;
    public static final zzjp zzV;
    public static final zzjp zzW;
    public static final zzjp zzX;
    public static final zzjp zzY;
    private static final zzjp[] zzZ;
    public static final zzjp zza;
    private static final /* synthetic */ zzjp[] zzaa;
    public static final zzjp zzb;
    public static final zzjp zzc;
    public static final zzjp zzd;
    public static final zzjp zze;
    public static final zzjp zzf;
    public static final zzjp zzg;
    public static final zzjp zzh;
    public static final zzjp zzi;
    public static final zzjp zzj;
    public static final zzjp zzk;
    public static final zzjp zzl;
    public static final zzjp zzm;
    public static final zzjp zzn;
    public static final zzjp zzo;
    public static final zzjp zzp;
    public static final zzjp zzq;
    public static final zzjp zzr;
    public static final zzjp zzs;
    public static final zzjp zzt;
    public static final zzjp zzu;
    public static final zzjp zzv;
    public static final zzjp zzw;
    public static final zzjp zzx;
    public static final zzjp zzy;
    public static final zzjp zzz;
    private final zzki zzab;
    private final int zzac;
    private final Class<?> zzad;

    static {
        zzki zzkiVar = zzki.zze;
        zza = new zzjp("DOUBLE", 0, 0, 1, zzkiVar);
        zzki zzkiVar2 = zzki.zzd;
        zzb = new zzjp("FLOAT", 1, 1, 1, zzkiVar2);
        zzki zzkiVar3 = zzki.zzc;
        zzc = new zzjp("INT64", 2, 2, 1, zzkiVar3);
        zzd = new zzjp("UINT64", 3, 3, 1, zzkiVar3);
        zzki zzkiVar4 = zzki.zzb;
        zze = new zzjp("INT32", 4, 4, 1, zzkiVar4);
        zzf = new zzjp("FIXED64", 5, 5, 1, zzkiVar3);
        zzg = new zzjp("FIXED32", 6, 6, 1, zzkiVar4);
        zzki zzkiVar5 = zzki.zzf;
        zzh = new zzjp("BOOL", 7, 7, 1, zzkiVar5);
        zzki zzkiVar6 = zzki.zzg;
        zzi = new zzjp("STRING", 8, 8, 1, zzkiVar6);
        zzki zzkiVar7 = zzki.zzj;
        zzj = new zzjp("MESSAGE", 9, 9, 1, zzkiVar7);
        zzki zzkiVar8 = zzki.zzh;
        zzk = new zzjp("BYTES", 10, 10, 1, zzkiVar8);
        zzl = new zzjp("UINT32", 11, 11, 1, zzkiVar4);
        zzki zzkiVar9 = zzki.zzi;
        zzm = new zzjp("ENUM", 12, 12, 1, zzkiVar9);
        zzn = new zzjp("SFIXED32", 13, 13, 1, zzkiVar4);
        zzo = new zzjp("SFIXED64", 14, 14, 1, zzkiVar3);
        zzp = new zzjp("SINT32", 15, 15, 1, zzkiVar4);
        zzq = new zzjp("SINT64", 16, 16, 1, zzkiVar3);
        zzr = new zzjp("GROUP", 17, 17, 1, zzkiVar7);
        zzs = new zzjp("DOUBLE_LIST", 18, 18, 2, zzkiVar);
        zzt = new zzjp("FLOAT_LIST", 19, 19, 2, zzkiVar2);
        zzu = new zzjp("INT64_LIST", 20, 20, 2, zzkiVar3);
        zzv = new zzjp("UINT64_LIST", 21, 21, 2, zzkiVar3);
        zzw = new zzjp("INT32_LIST", 22, 22, 2, zzkiVar4);
        zzx = new zzjp("FIXED64_LIST", 23, 23, 2, zzkiVar3);
        zzy = new zzjp("FIXED32_LIST", 24, 24, 2, zzkiVar4);
        zzz = new zzjp("BOOL_LIST", 25, 25, 2, zzkiVar5);
        zzA = new zzjp("STRING_LIST", 26, 26, 2, zzkiVar6);
        zzB = new zzjp("MESSAGE_LIST", 27, 27, 2, zzkiVar7);
        zzC = new zzjp("BYTES_LIST", 28, 28, 2, zzkiVar8);
        zzD = new zzjp("UINT32_LIST", 29, 29, 2, zzkiVar4);
        zzE = new zzjp("ENUM_LIST", 30, 30, 2, zzkiVar9);
        zzF = new zzjp("SFIXED32_LIST", 31, 31, 2, zzkiVar4);
        zzG = new zzjp("SFIXED64_LIST", 32, 32, 2, zzkiVar3);
        zzH = new zzjp("SINT32_LIST", 33, 33, 2, zzkiVar4);
        zzI = new zzjp("SINT64_LIST", 34, 34, 2, zzkiVar3);
        zzJ = new zzjp("DOUBLE_LIST_PACKED", 35, 35, 3, zzkiVar);
        zzK = new zzjp("FLOAT_LIST_PACKED", 36, 36, 3, zzkiVar2);
        zzL = new zzjp("INT64_LIST_PACKED", 37, 37, 3, zzkiVar3);
        zzM = new zzjp("UINT64_LIST_PACKED", 38, 38, 3, zzkiVar3);
        zzN = new zzjp("INT32_LIST_PACKED", 39, 39, 3, zzkiVar4);
        zzO = new zzjp("FIXED64_LIST_PACKED", 40, 40, 3, zzkiVar3);
        zzP = new zzjp("FIXED32_LIST_PACKED", 41, 41, 3, zzkiVar4);
        zzQ = new zzjp("BOOL_LIST_PACKED", 42, 42, 3, zzkiVar5);
        zzR = new zzjp("UINT32_LIST_PACKED", 43, 43, 3, zzkiVar4);
        zzS = new zzjp("ENUM_LIST_PACKED", 44, 44, 3, zzkiVar9);
        zzT = new zzjp("SFIXED32_LIST_PACKED", 45, 45, 3, zzkiVar4);
        zzki zzkiVar10 = zzki.zzc;
        zzU = new zzjp("SFIXED64_LIST_PACKED", 46, 46, 3, zzkiVar10);
        zzV = new zzjp("SINT32_LIST_PACKED", 47, 47, 3, zzkiVar4);
        zzW = new zzjp("SINT64_LIST_PACKED", 48, 48, 3, zzkiVar10);
        zzX = new zzjp("GROUP_LIST", 49, 49, 2, zzkiVar7);
        zzY = new zzjp("MAP", 50, 50, 4, zzki.zza);
        zzaa = new zzjp[]{zza, zzb, zzc, zzd, zze, zzf, zzg, zzh, zzi, zzj, zzk, zzl, zzm, zzn, zzo, zzp, zzq, zzr, zzs, zzt, zzu, zzv, zzw, zzx, zzy, zzz, zzA, zzB, zzC, zzD, zzE, zzF, zzG, zzH, zzI, zzJ, zzK, zzL, zzM, zzN, zzO, zzP, zzQ, zzR, zzS, zzT, zzU, zzV, zzW, zzX, zzY};
        zzjp[] values = values();
        zzZ = new zzjp[51];
        for (int i2 = 0; i2 < 51; i2++) {
            zzjp zzjpVar = values[i2];
            zzZ[zzjpVar.zzac] = zzjpVar;
        }
    }

    private zzjp(String str, int i2, int i3, int i4, zzki zzkiVar) {
        this.zzac = i3;
        this.zzab = zzkiVar;
        zzki zzkiVar2 = zzki.zza;
        int i5 = i4 - 1;
        if (i5 == 1) {
            this.zzad = zzkiVar.zza();
        } else if (i5 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzkiVar.zza();
        }
        if (i4 == 1) {
            zzkiVar.ordinal();
        }
    }

    public static zzjp[] values() {
        return (zzjp[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}
