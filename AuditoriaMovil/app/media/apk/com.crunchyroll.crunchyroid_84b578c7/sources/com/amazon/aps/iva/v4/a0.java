package com.amazon.aps.iva.v4;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: JavaType.java */
/* loaded from: classes.dex */
public final class a0 {
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 BOOLEAN;
    public static final a0 BYTE_STRING;
    public static final a0 DOUBLE;
    public static final a0 ENUM;
    public static final a0 FLOAT;
    public static final a0 INT;
    public static final a0 LONG;
    public static final a0 MESSAGE;
    public static final a0 STRING;
    public static final a0 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        a0 a0Var = new a0("VOID", 0, Void.class, Void.class, null);
        VOID = a0Var;
        Class cls = Integer.TYPE;
        a0 a0Var2 = new a0("INT", 1, cls, Integer.class, 0);
        INT = a0Var2;
        a0 a0Var3 = new a0("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = a0Var3;
        a0 a0Var4 = new a0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = a0Var4;
        a0 a0Var5 = new a0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = a0Var5;
        a0 a0Var6 = new a0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = a0Var6;
        a0 a0Var7 = new a0("STRING", 6, String.class, String.class, "");
        STRING = a0Var7;
        a0 a0Var8 = new a0("BYTE_STRING", 7, h.class, h.class, h.c);
        BYTE_STRING = a0Var8;
        a0 a0Var9 = new a0("ENUM", 8, cls, Integer.class, null);
        ENUM = a0Var9;
        a0 a0Var10 = new a0("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = a0Var10;
        $VALUES = new a0[]{a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6, a0Var7, a0Var8, a0Var9, a0Var10};
    }

    private a0(String str, int i, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
