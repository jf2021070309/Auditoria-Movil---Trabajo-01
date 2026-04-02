package com.amazon.aps.iva.e4;
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
public class u1 {
    private static final /* synthetic */ u1[] $VALUES;
    public static final u1 BOOL;
    public static final u1 BYTES;
    public static final u1 DOUBLE;
    public static final u1 ENUM;
    public static final u1 FIXED32;
    public static final u1 FIXED64;
    public static final u1 FLOAT;
    public static final u1 GROUP;
    public static final u1 INT32;
    public static final u1 INT64;
    public static final u1 MESSAGE;
    public static final u1 SFIXED32;
    public static final u1 SFIXED64;
    public static final u1 SINT32;
    public static final u1 SINT64;
    public static final u1 STRING;
    public static final u1 UINT32;
    public static final u1 UINT64;
    private final v1 javaType;
    private final int wireType;

    static {
        u1 u1Var = new u1("DOUBLE", 0, v1.DOUBLE, 1);
        DOUBLE = u1Var;
        u1 u1Var2 = new u1("FLOAT", 1, v1.FLOAT, 5);
        FLOAT = u1Var2;
        v1 v1Var = v1.LONG;
        u1 u1Var3 = new u1("INT64", 2, v1Var, 0);
        INT64 = u1Var3;
        u1 u1Var4 = new u1("UINT64", 3, v1Var, 0);
        UINT64 = u1Var4;
        v1 v1Var2 = v1.INT;
        u1 u1Var5 = new u1("INT32", 4, v1Var2, 0);
        INT32 = u1Var5;
        u1 u1Var6 = new u1("FIXED64", 5, v1Var, 1);
        FIXED64 = u1Var6;
        u1 u1Var7 = new u1("FIXED32", 6, v1Var2, 5);
        FIXED32 = u1Var7;
        u1 u1Var8 = new u1("BOOL", 7, v1.BOOLEAN, 0);
        BOOL = u1Var8;
        u1 u1Var9 = new u1("STRING", 8, v1.STRING, 2) { // from class: com.amazon.aps.iva.e4.u1.a
            @Override // com.amazon.aps.iva.e4.u1
            public boolean isPackable() {
                return false;
            }
        };
        STRING = u1Var9;
        v1 v1Var3 = v1.MESSAGE;
        u1 u1Var10 = new u1("GROUP", 9, v1Var3, 3) { // from class: com.amazon.aps.iva.e4.u1.b
            @Override // com.amazon.aps.iva.e4.u1
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = u1Var10;
        u1 u1Var11 = new u1("MESSAGE", 10, v1Var3, 2) { // from class: com.amazon.aps.iva.e4.u1.c
            @Override // com.amazon.aps.iva.e4.u1
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = u1Var11;
        u1 u1Var12 = new u1("BYTES", 11, v1.BYTE_STRING, 2) { // from class: com.amazon.aps.iva.e4.u1.d
            @Override // com.amazon.aps.iva.e4.u1
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = u1Var12;
        u1 u1Var13 = new u1("UINT32", 12, v1Var2, 0);
        UINT32 = u1Var13;
        u1 u1Var14 = new u1("ENUM", 13, v1.ENUM, 0);
        ENUM = u1Var14;
        u1 u1Var15 = new u1("SFIXED32", 14, v1Var2, 5);
        SFIXED32 = u1Var15;
        u1 u1Var16 = new u1("SFIXED64", 15, v1Var, 1);
        SFIXED64 = u1Var16;
        u1 u1Var17 = new u1("SINT32", 16, v1Var2, 0);
        SINT32 = u1Var17;
        u1 u1Var18 = new u1("SINT64", 17, v1Var, 0);
        SINT64 = u1Var18;
        $VALUES = new u1[]{u1Var, u1Var2, u1Var3, u1Var4, u1Var5, u1Var6, u1Var7, u1Var8, u1Var9, u1Var10, u1Var11, u1Var12, u1Var13, u1Var14, u1Var15, u1Var16, u1Var17, u1Var18};
    }

    public static u1 valueOf(String str) {
        return (u1) Enum.valueOf(u1.class, str);
    }

    public static u1[] values() {
        return (u1[]) $VALUES.clone();
    }

    public v1 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private u1(String str, int i, v1 v1Var, int i2) {
        this.javaType = v1Var;
        this.wireType = i2;
    }
}
