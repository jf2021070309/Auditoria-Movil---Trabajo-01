package com.amazon.aps.iva.v4;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT64 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: WireFormat.java */
/* loaded from: classes.dex */
public class r1 {
    private static final /* synthetic */ r1[] $VALUES;
    public static final r1 BOOL;
    public static final r1 BYTES;
    public static final r1 DOUBLE;
    public static final r1 ENUM;
    public static final r1 FIXED32;
    public static final r1 FIXED64;
    public static final r1 FLOAT;
    public static final r1 GROUP;
    public static final r1 INT32;
    public static final r1 INT64;
    public static final r1 MESSAGE;
    public static final r1 SFIXED32;
    public static final r1 SFIXED64;
    public static final r1 SINT32;
    public static final r1 SINT64;
    public static final r1 STRING;
    public static final r1 UINT32;
    public static final r1 UINT64;
    private final s1 javaType;
    private final int wireType;

    static {
        r1 r1Var = new r1("DOUBLE", 0, s1.DOUBLE, 1);
        DOUBLE = r1Var;
        r1 r1Var2 = new r1("FLOAT", 1, s1.FLOAT, 5);
        FLOAT = r1Var2;
        s1 s1Var = s1.LONG;
        r1 r1Var3 = new r1("INT64", 2, s1Var, 0);
        INT64 = r1Var3;
        r1 r1Var4 = new r1("UINT64", 3, s1Var, 0);
        UINT64 = r1Var4;
        s1 s1Var2 = s1.INT;
        r1 r1Var5 = new r1("INT32", 4, s1Var2, 0);
        INT32 = r1Var5;
        r1 r1Var6 = new r1("FIXED64", 5, s1Var, 1);
        FIXED64 = r1Var6;
        r1 r1Var7 = new r1("FIXED32", 6, s1Var2, 5);
        FIXED32 = r1Var7;
        r1 r1Var8 = new r1("BOOL", 7, s1.BOOLEAN, 0);
        BOOL = r1Var8;
        r1 r1Var9 = new r1("STRING", 8, s1.STRING, 2) { // from class: com.amazon.aps.iva.v4.r1.a
            @Override // com.amazon.aps.iva.v4.r1
            public boolean isPackable() {
                return false;
            }
        };
        STRING = r1Var9;
        s1 s1Var3 = s1.MESSAGE;
        r1 r1Var10 = new r1("GROUP", 9, s1Var3, 3) { // from class: com.amazon.aps.iva.v4.r1.b
            @Override // com.amazon.aps.iva.v4.r1
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = r1Var10;
        r1 r1Var11 = new r1("MESSAGE", 10, s1Var3, 2) { // from class: com.amazon.aps.iva.v4.r1.c
            @Override // com.amazon.aps.iva.v4.r1
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = r1Var11;
        r1 r1Var12 = new r1("BYTES", 11, s1.BYTE_STRING, 2) { // from class: com.amazon.aps.iva.v4.r1.d
            @Override // com.amazon.aps.iva.v4.r1
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = r1Var12;
        r1 r1Var13 = new r1("UINT32", 12, s1Var2, 0);
        UINT32 = r1Var13;
        r1 r1Var14 = new r1("ENUM", 13, s1.ENUM, 0);
        ENUM = r1Var14;
        r1 r1Var15 = new r1("SFIXED32", 14, s1Var2, 5);
        SFIXED32 = r1Var15;
        r1 r1Var16 = new r1("SFIXED64", 15, s1Var, 1);
        SFIXED64 = r1Var16;
        r1 r1Var17 = new r1("SINT32", 16, s1Var2, 0);
        SINT32 = r1Var17;
        r1 r1Var18 = new r1("SINT64", 17, s1Var, 0);
        SINT64 = r1Var18;
        $VALUES = new r1[]{r1Var, r1Var2, r1Var3, r1Var4, r1Var5, r1Var6, r1Var7, r1Var8, r1Var9, r1Var10, r1Var11, r1Var12, r1Var13, r1Var14, r1Var15, r1Var16, r1Var17, r1Var18};
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) $VALUES.clone();
    }

    public s1 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private r1(String str, int i, s1 s1Var, int i2) {
        this.javaType = s1Var;
        this.wireType = i2;
    }
}
