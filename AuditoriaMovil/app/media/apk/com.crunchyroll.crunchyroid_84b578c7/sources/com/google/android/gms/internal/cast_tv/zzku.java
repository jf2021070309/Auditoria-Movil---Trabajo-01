package com.google.android.gms.internal.cast_tv;
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
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzku {
    public static final zzku zza;
    public static final zzku zzb;
    public static final zzku zzc;
    public static final zzku zzd;
    public static final zzku zze;
    public static final zzku zzf;
    public static final zzku zzg;
    public static final zzku zzh;
    public static final zzku zzi;
    public static final zzku zzj;
    public static final zzku zzk;
    public static final zzku zzl;
    public static final zzku zzm;
    public static final zzku zzn;
    public static final zzku zzo;
    public static final zzku zzp;
    public static final zzku zzq;
    public static final zzku zzr;
    private static final /* synthetic */ zzku[] zzs;
    private final zzkv zzt;
    private final int zzu;

    static {
        zzku zzkuVar = new zzku("DOUBLE", 0, zzkv.DOUBLE, 1);
        zza = zzkuVar;
        zzku zzkuVar2 = new zzku("FLOAT", 1, zzkv.FLOAT, 5);
        zzb = zzkuVar2;
        zzkv zzkvVar = zzkv.LONG;
        zzku zzkuVar3 = new zzku("INT64", 2, zzkvVar, 0);
        zzc = zzkuVar3;
        zzku zzkuVar4 = new zzku("UINT64", 3, zzkvVar, 0);
        zzd = zzkuVar4;
        zzkv zzkvVar2 = zzkv.INT;
        zzku zzkuVar5 = new zzku("INT32", 4, zzkvVar2, 0);
        zze = zzkuVar5;
        zzku zzkuVar6 = new zzku("FIXED64", 5, zzkvVar, 1);
        zzf = zzkuVar6;
        zzku zzkuVar7 = new zzku("FIXED32", 6, zzkvVar2, 5);
        zzg = zzkuVar7;
        zzku zzkuVar8 = new zzku("BOOL", 7, zzkv.BOOLEAN, 0);
        zzh = zzkuVar8;
        zzku zzkuVar9 = new zzku("STRING", 8, zzkv.STRING, 2);
        zzi = zzkuVar9;
        zzkv zzkvVar3 = zzkv.MESSAGE;
        zzku zzkuVar10 = new zzku("GROUP", 9, zzkvVar3, 3);
        zzj = zzkuVar10;
        zzku zzkuVar11 = new zzku("MESSAGE", 10, zzkvVar3, 2);
        zzk = zzkuVar11;
        zzku zzkuVar12 = new zzku("BYTES", 11, zzkv.BYTE_STRING, 2);
        zzl = zzkuVar12;
        zzku zzkuVar13 = new zzku("UINT32", 12, zzkvVar2, 0);
        zzm = zzkuVar13;
        zzku zzkuVar14 = new zzku("ENUM", 13, zzkv.ENUM, 0);
        zzn = zzkuVar14;
        zzku zzkuVar15 = new zzku("SFIXED32", 14, zzkvVar2, 5);
        zzo = zzkuVar15;
        zzku zzkuVar16 = new zzku("SFIXED64", 15, zzkvVar, 1);
        zzp = zzkuVar16;
        zzku zzkuVar17 = new zzku("SINT32", 16, zzkvVar2, 0);
        zzq = zzkuVar17;
        zzku zzkuVar18 = new zzku("SINT64", 17, zzkvVar, 0);
        zzr = zzkuVar18;
        zzs = new zzku[]{zzkuVar, zzkuVar2, zzkuVar3, zzkuVar4, zzkuVar5, zzkuVar6, zzkuVar7, zzkuVar8, zzkuVar9, zzkuVar10, zzkuVar11, zzkuVar12, zzkuVar13, zzkuVar14, zzkuVar15, zzkuVar16, zzkuVar17, zzkuVar18};
    }

    private zzku(String str, int i, zzkv zzkvVar, int i2) {
        this.zzt = zzkvVar;
        this.zzu = i2;
    }

    public static zzku[] values() {
        return (zzku[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzkv zzb() {
        return this.zzt;
    }
}
