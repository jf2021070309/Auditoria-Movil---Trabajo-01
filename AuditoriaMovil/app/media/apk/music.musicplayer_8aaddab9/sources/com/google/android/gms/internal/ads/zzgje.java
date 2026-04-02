package com.google.android.gms.internal.ads;
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
/* loaded from: classes.dex */
public final class zzgje {
    public static final zzgje zza;
    public static final zzgje zzb;
    public static final zzgje zzc;
    public static final zzgje zzd;
    public static final zzgje zze;
    public static final zzgje zzf;
    public static final zzgje zzg;
    public static final zzgje zzh;
    public static final zzgje zzi;
    public static final zzgje zzj;
    public static final zzgje zzk;
    public static final zzgje zzl;
    public static final zzgje zzm;
    public static final zzgje zzn;
    public static final zzgje zzo;
    public static final zzgje zzp;
    public static final zzgje zzq;
    public static final zzgje zzr;
    private static final /* synthetic */ zzgje[] zzt;
    private final zzgjf zzs;

    static {
        zzgje zzgjeVar = new zzgje("DOUBLE", 0, zzgjf.DOUBLE, 1);
        zza = zzgjeVar;
        zzgje zzgjeVar2 = new zzgje("FLOAT", 1, zzgjf.FLOAT, 5);
        zzb = zzgjeVar2;
        zzgjf zzgjfVar = zzgjf.LONG;
        zzgje zzgjeVar3 = new zzgje("INT64", 2, zzgjfVar, 0);
        zzc = zzgjeVar3;
        zzgje zzgjeVar4 = new zzgje("UINT64", 3, zzgjfVar, 0);
        zzd = zzgjeVar4;
        zzgjf zzgjfVar2 = zzgjf.INT;
        zzgje zzgjeVar5 = new zzgje("INT32", 4, zzgjfVar2, 0);
        zze = zzgjeVar5;
        zzgje zzgjeVar6 = new zzgje("FIXED64", 5, zzgjfVar, 1);
        zzf = zzgjeVar6;
        zzgje zzgjeVar7 = new zzgje("FIXED32", 6, zzgjfVar2, 5);
        zzg = zzgjeVar7;
        zzgje zzgjeVar8 = new zzgje("BOOL", 7, zzgjf.BOOLEAN, 0);
        zzh = zzgjeVar8;
        zzgje zzgjeVar9 = new zzgje("STRING", 8, zzgjf.STRING, 2);
        zzi = zzgjeVar9;
        zzgjf zzgjfVar3 = zzgjf.MESSAGE;
        zzgje zzgjeVar10 = new zzgje("GROUP", 9, zzgjfVar3, 3);
        zzj = zzgjeVar10;
        zzgje zzgjeVar11 = new zzgje("MESSAGE", 10, zzgjfVar3, 2);
        zzk = zzgjeVar11;
        zzgje zzgjeVar12 = new zzgje("BYTES", 11, zzgjf.BYTE_STRING, 2);
        zzl = zzgjeVar12;
        zzgje zzgjeVar13 = new zzgje("UINT32", 12, zzgjfVar2, 0);
        zzm = zzgjeVar13;
        zzgje zzgjeVar14 = new zzgje("ENUM", 13, zzgjf.ENUM, 0);
        zzn = zzgjeVar14;
        zzgje zzgjeVar15 = new zzgje("SFIXED32", 14, zzgjfVar2, 5);
        zzo = zzgjeVar15;
        zzgje zzgjeVar16 = new zzgje("SFIXED64", 15, zzgjfVar, 1);
        zzp = zzgjeVar16;
        zzgje zzgjeVar17 = new zzgje("SINT32", 16, zzgjfVar2, 0);
        zzq = zzgjeVar17;
        zzgje zzgjeVar18 = new zzgje("SINT64", 17, zzgjfVar, 0);
        zzr = zzgjeVar18;
        zzt = new zzgje[]{zzgjeVar, zzgjeVar2, zzgjeVar3, zzgjeVar4, zzgjeVar5, zzgjeVar6, zzgjeVar7, zzgjeVar8, zzgjeVar9, zzgjeVar10, zzgjeVar11, zzgjeVar12, zzgjeVar13, zzgjeVar14, zzgjeVar15, zzgjeVar16, zzgjeVar17, zzgjeVar18};
    }

    private zzgje(String str, int i2, zzgjf zzgjfVar, int i3) {
        this.zzs = zzgjfVar;
    }

    public static zzgje[] values() {
        return (zzgje[]) zzt.clone();
    }

    public final zzgjf zza() {
        return this.zzs;
    }
}
