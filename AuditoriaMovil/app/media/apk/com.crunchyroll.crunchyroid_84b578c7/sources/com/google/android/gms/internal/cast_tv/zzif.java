package com.google.android.gms.internal.cast_tv;
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
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzif {
    public static final zzif zza;
    public static final zzif zzb;
    public static final zzif zzc;
    public static final zzif zzd;
    public static final zzif zze;
    public static final zzif zzf;
    public static final zzif zzg;
    public static final zzif zzh;
    public static final zzif zzi;
    public static final zzif zzj;
    private static final /* synthetic */ zzif[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzif zzifVar = new zzif("VOID", 0, Void.class, Void.class, null);
        zza = zzifVar;
        Class cls = Integer.TYPE;
        zzif zzifVar2 = new zzif("INT", 1, cls, Integer.class, 0);
        zzb = zzifVar2;
        zzif zzifVar3 = new zzif("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzifVar3;
        zzif zzifVar4 = new zzif("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzifVar4;
        zzif zzifVar5 = new zzif("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzifVar5;
        zzif zzifVar6 = new zzif("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzifVar6;
        zzif zzifVar7 = new zzif("STRING", 6, String.class, String.class, "");
        zzg = zzifVar7;
        zzif zzifVar8 = new zzif("BYTE_STRING", 7, zzgu.class, zzgu.class, zzgu.zzb);
        zzh = zzifVar8;
        zzif zzifVar9 = new zzif("ENUM", 8, cls, Integer.class, null);
        zzi = zzifVar9;
        zzif zzifVar10 = new zzif("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzifVar10;
        zzk = new zzif[]{zzifVar, zzifVar2, zzifVar3, zzifVar4, zzifVar5, zzifVar6, zzifVar7, zzifVar8, zzifVar9, zzifVar10};
    }

    private zzif(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzif[] values() {
        return (zzif[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
