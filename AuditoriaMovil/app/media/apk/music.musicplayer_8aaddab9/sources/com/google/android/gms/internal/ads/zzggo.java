package com.google.android.gms.internal.ads;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzggo {
    public static final zzggo zza;
    public static final zzggo zzb;
    public static final zzggo zzc;
    public static final zzggo zzd;
    public static final zzggo zze;
    public static final zzggo zzf;
    public static final zzggo zzg;
    public static final zzggo zzh;
    public static final zzggo zzi;
    public static final zzggo zzj;
    private static final /* synthetic */ zzggo[] zzn;
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    static {
        zzggo zzggoVar = new zzggo("VOID", 0, Void.class, Void.class, null);
        zza = zzggoVar;
        Class cls = Integer.TYPE;
        zzggo zzggoVar2 = new zzggo("INT", 1, cls, Integer.class, 0);
        zzb = zzggoVar2;
        zzggo zzggoVar3 = new zzggo("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzggoVar3;
        zzggo zzggoVar4 = new zzggo("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzggoVar4;
        zzggo zzggoVar5 = new zzggo("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzggoVar5;
        zzggo zzggoVar6 = new zzggo("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzggoVar6;
        zzggo zzggoVar7 = new zzggo("STRING", 6, String.class, String.class, "");
        zzg = zzggoVar7;
        zzggo zzggoVar8 = new zzggo("BYTE_STRING", 7, zzgex.class, zzgex.class, zzgex.zzb);
        zzh = zzggoVar8;
        zzggo zzggoVar9 = new zzggo("ENUM", 8, cls, Integer.class, null);
        zzi = zzggoVar9;
        zzggo zzggoVar10 = new zzggo("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzggoVar10;
        zzn = new zzggo[]{zzggoVar, zzggoVar2, zzggoVar3, zzggoVar4, zzggoVar5, zzggoVar6, zzggoVar7, zzggoVar8, zzggoVar9, zzggoVar10};
    }

    private zzggo(String str, int i2, Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    public static zzggo[] values() {
        return (zzggo[]) zzn.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
