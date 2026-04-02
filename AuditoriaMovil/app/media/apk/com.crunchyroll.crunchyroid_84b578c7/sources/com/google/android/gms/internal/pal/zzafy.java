package com.google.android.gms.internal.pal;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzafy {
    public static final zzafy zza;
    public static final zzafy zzb;
    public static final zzafy zzc;
    public static final zzafy zzd;
    public static final zzafy zze;
    public static final zzafy zzf;
    public static final zzafy zzg;
    public static final zzafy zzh;
    public static final zzafy zzi;
    public static final zzafy zzj;
    public static final zzafy zzk;
    public static final zzafy zzl;
    public static final zzafy zzm;
    public static final zzafy zzn;
    public static final zzafy zzo;
    public static final zzafy zzp;
    public static final zzafy zzq;
    public static final zzafy zzr;
    private static final /* synthetic */ zzafy[] zzs;
    private final zzafz zzt;

    static {
        zzafy zzafyVar = new zzafy("DOUBLE", 0, zzafz.DOUBLE, 1);
        zza = zzafyVar;
        zzafy zzafyVar2 = new zzafy("FLOAT", 1, zzafz.FLOAT, 5);
        zzb = zzafyVar2;
        zzafz zzafzVar = zzafz.LONG;
        zzafy zzafyVar3 = new zzafy("INT64", 2, zzafzVar, 0);
        zzc = zzafyVar3;
        zzafy zzafyVar4 = new zzafy("UINT64", 3, zzafzVar, 0);
        zzd = zzafyVar4;
        zzafz zzafzVar2 = zzafz.INT;
        zzafy zzafyVar5 = new zzafy("INT32", 4, zzafzVar2, 0);
        zze = zzafyVar5;
        zzafy zzafyVar6 = new zzafy("FIXED64", 5, zzafzVar, 1);
        zzf = zzafyVar6;
        zzafy zzafyVar7 = new zzafy("FIXED32", 6, zzafzVar2, 5);
        zzg = zzafyVar7;
        zzafy zzafyVar8 = new zzafy("BOOL", 7, zzafz.BOOLEAN, 0);
        zzh = zzafyVar8;
        zzafy zzafyVar9 = new zzafy("STRING", 8, zzafz.STRING, 2);
        zzi = zzafyVar9;
        zzafz zzafzVar3 = zzafz.MESSAGE;
        zzafy zzafyVar10 = new zzafy("GROUP", 9, zzafzVar3, 3);
        zzj = zzafyVar10;
        zzafy zzafyVar11 = new zzafy("MESSAGE", 10, zzafzVar3, 2);
        zzk = zzafyVar11;
        zzafy zzafyVar12 = new zzafy("BYTES", 11, zzafz.BYTE_STRING, 2);
        zzl = zzafyVar12;
        zzafy zzafyVar13 = new zzafy("UINT32", 12, zzafzVar2, 0);
        zzm = zzafyVar13;
        zzafy zzafyVar14 = new zzafy("ENUM", 13, zzafz.ENUM, 0);
        zzn = zzafyVar14;
        zzafy zzafyVar15 = new zzafy("SFIXED32", 14, zzafzVar2, 5);
        zzo = zzafyVar15;
        zzafy zzafyVar16 = new zzafy("SFIXED64", 15, zzafzVar, 1);
        zzp = zzafyVar16;
        zzafy zzafyVar17 = new zzafy("SINT32", 16, zzafzVar2, 0);
        zzq = zzafyVar17;
        zzafy zzafyVar18 = new zzafy("SINT64", 17, zzafzVar, 0);
        zzr = zzafyVar18;
        zzs = new zzafy[]{zzafyVar, zzafyVar2, zzafyVar3, zzafyVar4, zzafyVar5, zzafyVar6, zzafyVar7, zzafyVar8, zzafyVar9, zzafyVar10, zzafyVar11, zzafyVar12, zzafyVar13, zzafyVar14, zzafyVar15, zzafyVar16, zzafyVar17, zzafyVar18};
    }

    private zzafy(String str, int i, zzafz zzafzVar, int i2) {
        this.zzt = zzafzVar;
    }

    public static zzafy[] values() {
        return (zzafy[]) zzs.clone();
    }

    public final zzafz zza() {
        return this.zzt;
    }
}
