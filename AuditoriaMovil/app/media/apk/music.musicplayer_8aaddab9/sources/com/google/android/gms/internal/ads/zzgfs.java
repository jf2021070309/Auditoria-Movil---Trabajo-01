package com.google.android.gms.internal.ads;
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
/* loaded from: classes.dex */
public final class zzgfs {
    public static final zzgfs zzA;
    public static final zzgfs zzB;
    public static final zzgfs zzC;
    public static final zzgfs zzD;
    public static final zzgfs zzE;
    public static final zzgfs zzF;
    public static final zzgfs zzG;
    public static final zzgfs zzH;
    public static final zzgfs zzI;
    public static final zzgfs zzJ;
    public static final zzgfs zzK;
    public static final zzgfs zzL;
    public static final zzgfs zzM;
    public static final zzgfs zzN;
    public static final zzgfs zzO;
    public static final zzgfs zzP;
    public static final zzgfs zzQ;
    public static final zzgfs zzR;
    public static final zzgfs zzS;
    public static final zzgfs zzT;
    public static final zzgfs zzU;
    public static final zzgfs zzV;
    public static final zzgfs zzW;
    public static final zzgfs zzX;
    public static final zzgfs zzY;
    public static final zzgfs zza;
    private static final zzgfs[] zzac;
    private static final /* synthetic */ zzgfs[] zzad;
    public static final zzgfs zzb;
    public static final zzgfs zzc;
    public static final zzgfs zzd;
    public static final zzgfs zze;
    public static final zzgfs zzf;
    public static final zzgfs zzg;
    public static final zzgfs zzh;
    public static final zzgfs zzi;
    public static final zzgfs zzj;
    public static final zzgfs zzk;
    public static final zzgfs zzl;
    public static final zzgfs zzm;
    public static final zzgfs zzn;
    public static final zzgfs zzo;
    public static final zzgfs zzp;
    public static final zzgfs zzq;
    public static final zzgfs zzr;
    public static final zzgfs zzs;
    public static final zzgfs zzt;
    public static final zzgfs zzu;
    public static final zzgfs zzv;
    public static final zzgfs zzw;
    public static final zzgfs zzx;
    public static final zzgfs zzy;
    public static final zzgfs zzz;
    private final zzggo zzZ;
    private final int zzaa;
    private final Class<?> zzab;

    static {
        zzggo zzggoVar = zzggo.zze;
        zza = new zzgfs("DOUBLE", 0, 0, 1, zzggoVar);
        zzggo zzggoVar2 = zzggo.zzd;
        zzb = new zzgfs("FLOAT", 1, 1, 1, zzggoVar2);
        zzggo zzggoVar3 = zzggo.zzc;
        zzc = new zzgfs("INT64", 2, 2, 1, zzggoVar3);
        zzd = new zzgfs("UINT64", 3, 3, 1, zzggoVar3);
        zzggo zzggoVar4 = zzggo.zzb;
        zze = new zzgfs("INT32", 4, 4, 1, zzggoVar4);
        zzf = new zzgfs("FIXED64", 5, 5, 1, zzggoVar3);
        zzg = new zzgfs("FIXED32", 6, 6, 1, zzggoVar4);
        zzggo zzggoVar5 = zzggo.zzf;
        zzh = new zzgfs("BOOL", 7, 7, 1, zzggoVar5);
        zzggo zzggoVar6 = zzggo.zzg;
        zzi = new zzgfs("STRING", 8, 8, 1, zzggoVar6);
        zzggo zzggoVar7 = zzggo.zzj;
        zzj = new zzgfs("MESSAGE", 9, 9, 1, zzggoVar7);
        zzggo zzggoVar8 = zzggo.zzh;
        zzk = new zzgfs("BYTES", 10, 10, 1, zzggoVar8);
        zzl = new zzgfs("UINT32", 11, 11, 1, zzggoVar4);
        zzggo zzggoVar9 = zzggo.zzi;
        zzm = new zzgfs("ENUM", 12, 12, 1, zzggoVar9);
        zzn = new zzgfs("SFIXED32", 13, 13, 1, zzggoVar4);
        zzo = new zzgfs("SFIXED64", 14, 14, 1, zzggoVar3);
        zzp = new zzgfs("SINT32", 15, 15, 1, zzggoVar4);
        zzq = new zzgfs("SINT64", 16, 16, 1, zzggoVar3);
        zzr = new zzgfs("GROUP", 17, 17, 1, zzggoVar7);
        zzs = new zzgfs("DOUBLE_LIST", 18, 18, 2, zzggoVar);
        zzt = new zzgfs("FLOAT_LIST", 19, 19, 2, zzggoVar2);
        zzu = new zzgfs("INT64_LIST", 20, 20, 2, zzggoVar3);
        zzv = new zzgfs("UINT64_LIST", 21, 21, 2, zzggoVar3);
        zzw = new zzgfs("INT32_LIST", 22, 22, 2, zzggoVar4);
        zzx = new zzgfs("FIXED64_LIST", 23, 23, 2, zzggoVar3);
        zzy = new zzgfs("FIXED32_LIST", 24, 24, 2, zzggoVar4);
        zzz = new zzgfs("BOOL_LIST", 25, 25, 2, zzggoVar5);
        zzA = new zzgfs("STRING_LIST", 26, 26, 2, zzggoVar6);
        zzB = new zzgfs("MESSAGE_LIST", 27, 27, 2, zzggoVar7);
        zzC = new zzgfs("BYTES_LIST", 28, 28, 2, zzggoVar8);
        zzD = new zzgfs("UINT32_LIST", 29, 29, 2, zzggoVar4);
        zzE = new zzgfs("ENUM_LIST", 30, 30, 2, zzggoVar9);
        zzF = new zzgfs("SFIXED32_LIST", 31, 31, 2, zzggoVar4);
        zzG = new zzgfs("SFIXED64_LIST", 32, 32, 2, zzggoVar3);
        zzH = new zzgfs("SINT32_LIST", 33, 33, 2, zzggoVar4);
        zzI = new zzgfs("SINT64_LIST", 34, 34, 2, zzggoVar3);
        zzJ = new zzgfs("DOUBLE_LIST_PACKED", 35, 35, 3, zzggoVar);
        zzK = new zzgfs("FLOAT_LIST_PACKED", 36, 36, 3, zzggoVar2);
        zzL = new zzgfs("INT64_LIST_PACKED", 37, 37, 3, zzggoVar3);
        zzM = new zzgfs("UINT64_LIST_PACKED", 38, 38, 3, zzggoVar3);
        zzN = new zzgfs("INT32_LIST_PACKED", 39, 39, 3, zzggoVar4);
        zzO = new zzgfs("FIXED64_LIST_PACKED", 40, 40, 3, zzggoVar3);
        zzP = new zzgfs("FIXED32_LIST_PACKED", 41, 41, 3, zzggoVar4);
        zzQ = new zzgfs("BOOL_LIST_PACKED", 42, 42, 3, zzggoVar5);
        zzR = new zzgfs("UINT32_LIST_PACKED", 43, 43, 3, zzggoVar4);
        zzS = new zzgfs("ENUM_LIST_PACKED", 44, 44, 3, zzggoVar9);
        zzT = new zzgfs("SFIXED32_LIST_PACKED", 45, 45, 3, zzggoVar4);
        zzggo zzggoVar10 = zzggo.zzc;
        zzU = new zzgfs("SFIXED64_LIST_PACKED", 46, 46, 3, zzggoVar10);
        zzV = new zzgfs("SINT32_LIST_PACKED", 47, 47, 3, zzggoVar4);
        zzW = new zzgfs("SINT64_LIST_PACKED", 48, 48, 3, zzggoVar10);
        zzX = new zzgfs("GROUP_LIST", 49, 49, 2, zzggoVar7);
        zzY = new zzgfs("MAP", 50, 50, 4, zzggo.zza);
        zzad = new zzgfs[]{zza, zzb, zzc, zzd, zze, zzf, zzg, zzh, zzi, zzj, zzk, zzl, zzm, zzn, zzo, zzp, zzq, zzr, zzs, zzt, zzu, zzv, zzw, zzx, zzy, zzz, zzA, zzB, zzC, zzD, zzE, zzF, zzG, zzH, zzI, zzJ, zzK, zzL, zzM, zzN, zzO, zzP, zzQ, zzR, zzS, zzT, zzU, zzV, zzW, zzX, zzY};
        zzgfs[] values = values();
        zzac = new zzgfs[51];
        for (int i2 = 0; i2 < 51; i2++) {
            zzgfs zzgfsVar = values[i2];
            zzac[zzgfsVar.zzaa] = zzgfsVar;
        }
    }

    private zzgfs(String str, int i2, int i3, int i4, zzggo zzggoVar) {
        this.zzaa = i3;
        this.zzZ = zzggoVar;
        zzggo zzggoVar2 = zzggo.zza;
        int i5 = i4 - 1;
        if (i5 == 1) {
            this.zzab = zzggoVar.zza();
        } else if (i5 != 3) {
            this.zzab = null;
        } else {
            this.zzab = zzggoVar.zza();
        }
        if (i4 == 1) {
            zzggoVar.ordinal();
        }
    }

    public static zzgfs[] values() {
        return (zzgfs[]) zzad.clone();
    }

    public final int zza() {
        return this.zzaa;
    }
}
