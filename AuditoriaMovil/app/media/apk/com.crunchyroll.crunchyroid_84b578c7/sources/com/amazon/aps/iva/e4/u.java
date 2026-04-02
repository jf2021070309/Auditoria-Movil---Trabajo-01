package com.amazon.aps.iva.e4;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DOUBLE uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: FieldType.java */
/* loaded from: classes.dex */
public final class u {
    private static final /* synthetic */ u[] $VALUES;
    public static final u BOOL;
    public static final u BOOL_LIST;
    public static final u BOOL_LIST_PACKED;
    public static final u BYTES;
    public static final u BYTES_LIST;
    public static final u DOUBLE;
    public static final u DOUBLE_LIST;
    public static final u DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final u ENUM;
    public static final u ENUM_LIST;
    public static final u ENUM_LIST_PACKED;
    public static final u FIXED32;
    public static final u FIXED32_LIST;
    public static final u FIXED32_LIST_PACKED;
    public static final u FIXED64;
    public static final u FIXED64_LIST;
    public static final u FIXED64_LIST_PACKED;
    public static final u FLOAT;
    public static final u FLOAT_LIST;
    public static final u FLOAT_LIST_PACKED;
    public static final u GROUP;
    public static final u GROUP_LIST;
    public static final u INT32;
    public static final u INT32_LIST;
    public static final u INT32_LIST_PACKED;
    public static final u INT64;
    public static final u INT64_LIST;
    public static final u INT64_LIST_PACKED;
    public static final u MAP;
    public static final u MESSAGE;
    public static final u MESSAGE_LIST;
    public static final u SFIXED32;
    public static final u SFIXED32_LIST;
    public static final u SFIXED32_LIST_PACKED;
    public static final u SFIXED64;
    public static final u SFIXED64_LIST;
    public static final u SFIXED64_LIST_PACKED;
    public static final u SINT32;
    public static final u SINT32_LIST;
    public static final u SINT32_LIST_PACKED;
    public static final u SINT64;
    public static final u SINT64_LIST;
    public static final u SINT64_LIST_PACKED;
    public static final u STRING;
    public static final u STRING_LIST;
    public static final u UINT32;
    public static final u UINT32_LIST;
    public static final u UINT32_LIST_PACKED;
    public static final u UINT64;
    public static final u UINT64_LIST;
    public static final u UINT64_LIST_PACKED;
    private static final u[] VALUES;
    private final b collection;
    private final Class<?> elementType;
    private final int id;
    private final b0 javaType;
    private final boolean primitiveScalar;

    /* compiled from: FieldType.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b0.values().length];
            b = iArr;
            try {
                iArr[b0.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b0.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: FieldType.java */
    /* loaded from: classes.dex */
    public enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        
        private final boolean isList;

        b(boolean z) {
            this.isList = z;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    static {
        b bVar = b.SCALAR;
        b0 b0Var = b0.DOUBLE;
        u uVar = new u("DOUBLE", 0, 0, bVar, b0Var);
        DOUBLE = uVar;
        b0 b0Var2 = b0.FLOAT;
        u uVar2 = new u("FLOAT", 1, 1, bVar, b0Var2);
        FLOAT = uVar2;
        b0 b0Var3 = b0.LONG;
        u uVar3 = new u("INT64", 2, 2, bVar, b0Var3);
        INT64 = uVar3;
        u uVar4 = new u("UINT64", 3, 3, bVar, b0Var3);
        UINT64 = uVar4;
        b0 b0Var4 = b0.INT;
        u uVar5 = new u("INT32", 4, 4, bVar, b0Var4);
        INT32 = uVar5;
        u uVar6 = new u("FIXED64", 5, 5, bVar, b0Var3);
        FIXED64 = uVar6;
        u uVar7 = new u("FIXED32", 6, 6, bVar, b0Var4);
        FIXED32 = uVar7;
        b0 b0Var5 = b0.BOOLEAN;
        u uVar8 = new u("BOOL", 7, 7, bVar, b0Var5);
        BOOL = uVar8;
        b0 b0Var6 = b0.STRING;
        u uVar9 = new u("STRING", 8, 8, bVar, b0Var6);
        STRING = uVar9;
        b0 b0Var7 = b0.MESSAGE;
        u uVar10 = new u("MESSAGE", 9, 9, bVar, b0Var7);
        MESSAGE = uVar10;
        b0 b0Var8 = b0.BYTE_STRING;
        u uVar11 = new u("BYTES", 10, 10, bVar, b0Var8);
        BYTES = uVar11;
        u uVar12 = new u("UINT32", 11, 11, bVar, b0Var4);
        UINT32 = uVar12;
        b0 b0Var9 = b0.ENUM;
        u uVar13 = new u("ENUM", 12, 12, bVar, b0Var9);
        ENUM = uVar13;
        u uVar14 = new u("SFIXED32", 13, 13, bVar, b0Var4);
        SFIXED32 = uVar14;
        u uVar15 = new u("SFIXED64", 14, 14, bVar, b0Var3);
        SFIXED64 = uVar15;
        u uVar16 = new u("SINT32", 15, 15, bVar, b0Var4);
        SINT32 = uVar16;
        u uVar17 = new u("SINT64", 16, 16, bVar, b0Var3);
        SINT64 = uVar17;
        u uVar18 = new u("GROUP", 17, 17, bVar, b0Var7);
        GROUP = uVar18;
        b bVar2 = b.VECTOR;
        u uVar19 = new u("DOUBLE_LIST", 18, 18, bVar2, b0Var);
        DOUBLE_LIST = uVar19;
        u uVar20 = new u("FLOAT_LIST", 19, 19, bVar2, b0Var2);
        FLOAT_LIST = uVar20;
        u uVar21 = new u("INT64_LIST", 20, 20, bVar2, b0Var3);
        INT64_LIST = uVar21;
        u uVar22 = new u("UINT64_LIST", 21, 21, bVar2, b0Var3);
        UINT64_LIST = uVar22;
        u uVar23 = new u("INT32_LIST", 22, 22, bVar2, b0Var4);
        INT32_LIST = uVar23;
        u uVar24 = new u("FIXED64_LIST", 23, 23, bVar2, b0Var3);
        FIXED64_LIST = uVar24;
        u uVar25 = new u("FIXED32_LIST", 24, 24, bVar2, b0Var4);
        FIXED32_LIST = uVar25;
        u uVar26 = new u("BOOL_LIST", 25, 25, bVar2, b0Var5);
        BOOL_LIST = uVar26;
        u uVar27 = new u("STRING_LIST", 26, 26, bVar2, b0Var6);
        STRING_LIST = uVar27;
        u uVar28 = new u("MESSAGE_LIST", 27, 27, bVar2, b0Var7);
        MESSAGE_LIST = uVar28;
        u uVar29 = new u("BYTES_LIST", 28, 28, bVar2, b0Var8);
        BYTES_LIST = uVar29;
        u uVar30 = new u("UINT32_LIST", 29, 29, bVar2, b0Var4);
        UINT32_LIST = uVar30;
        u uVar31 = new u("ENUM_LIST", 30, 30, bVar2, b0Var9);
        ENUM_LIST = uVar31;
        u uVar32 = new u("SFIXED32_LIST", 31, 31, bVar2, b0Var4);
        SFIXED32_LIST = uVar32;
        u uVar33 = new u("SFIXED64_LIST", 32, 32, bVar2, b0Var3);
        SFIXED64_LIST = uVar33;
        u uVar34 = new u("SINT32_LIST", 33, 33, bVar2, b0Var4);
        SINT32_LIST = uVar34;
        u uVar35 = new u("SINT64_LIST", 34, 34, bVar2, b0Var3);
        SINT64_LIST = uVar35;
        b bVar3 = b.PACKED_VECTOR;
        u uVar36 = new u("DOUBLE_LIST_PACKED", 35, 35, bVar3, b0Var);
        DOUBLE_LIST_PACKED = uVar36;
        u uVar37 = new u("FLOAT_LIST_PACKED", 36, 36, bVar3, b0Var2);
        FLOAT_LIST_PACKED = uVar37;
        u uVar38 = new u("INT64_LIST_PACKED", 37, 37, bVar3, b0Var3);
        INT64_LIST_PACKED = uVar38;
        u uVar39 = new u("UINT64_LIST_PACKED", 38, 38, bVar3, b0Var3);
        UINT64_LIST_PACKED = uVar39;
        u uVar40 = new u("INT32_LIST_PACKED", 39, 39, bVar3, b0Var4);
        INT32_LIST_PACKED = uVar40;
        u uVar41 = new u("FIXED64_LIST_PACKED", 40, 40, bVar3, b0Var3);
        FIXED64_LIST_PACKED = uVar41;
        u uVar42 = new u("FIXED32_LIST_PACKED", 41, 41, bVar3, b0Var4);
        FIXED32_LIST_PACKED = uVar42;
        u uVar43 = new u("BOOL_LIST_PACKED", 42, 42, bVar3, b0Var5);
        BOOL_LIST_PACKED = uVar43;
        u uVar44 = new u("UINT32_LIST_PACKED", 43, 43, bVar3, b0Var4);
        UINT32_LIST_PACKED = uVar44;
        u uVar45 = new u("ENUM_LIST_PACKED", 44, 44, bVar3, b0Var9);
        ENUM_LIST_PACKED = uVar45;
        u uVar46 = new u("SFIXED32_LIST_PACKED", 45, 45, bVar3, b0Var4);
        SFIXED32_LIST_PACKED = uVar46;
        u uVar47 = new u("SFIXED64_LIST_PACKED", 46, 46, bVar3, b0Var3);
        SFIXED64_LIST_PACKED = uVar47;
        u uVar48 = new u("SINT32_LIST_PACKED", 47, 47, bVar3, b0Var4);
        SINT32_LIST_PACKED = uVar48;
        u uVar49 = new u("SINT64_LIST_PACKED", 48, 48, bVar3, b0Var3);
        SINT64_LIST_PACKED = uVar49;
        u uVar50 = new u("GROUP_LIST", 49, 49, bVar2, b0Var7);
        GROUP_LIST = uVar50;
        u uVar51 = new u("MAP", 50, 50, b.MAP, b0.VOID);
        MAP = uVar51;
        $VALUES = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19, uVar20, uVar21, uVar22, uVar23, uVar24, uVar25, uVar26, uVar27, uVar28, uVar29, uVar30, uVar31, uVar32, uVar33, uVar34, uVar35, uVar36, uVar37, uVar38, uVar39, uVar40, uVar41, uVar42, uVar43, uVar44, uVar45, uVar46, uVar47, uVar48, uVar49, uVar50, uVar51};
        EMPTY_TYPES = new Type[0];
        u[] values = values();
        VALUES = new u[values.length];
        for (u uVar52 : values) {
            VALUES[uVar52.id] = uVar52;
        }
    }

    private u(String str, int i, int i2, b bVar, b0 b0Var) {
        int i3;
        this.id = i2;
        this.collection = bVar;
        this.javaType = b0Var;
        int i4 = a.a[bVar.ordinal()];
        boolean z = true;
        if (i4 != 1) {
            if (i4 != 2) {
                this.elementType = null;
            } else {
                this.elementType = b0Var.getBoxedType();
            }
        } else {
            this.elementType = b0Var.getBoxedType();
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i3 = a.b[b0Var.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : false;
    }

    public static u forId(int i) {
        if (i >= 0) {
            u[] uVarArr = VALUES;
            if (i < uVarArr.length) {
                return uVarArr[i];
            }
            return null;
        }
        return null;
    }

    private static Type getGenericSuperList(Class<?> cls) {
        Type[] genericInterfaces;
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        boolean z;
        while (true) {
            int i = 0;
            if (cls != List.class) {
                Type genericSuperList = getGenericSuperList(cls);
                if (genericSuperList instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        Type type = actualTypeArguments[i2];
                        if (type instanceof TypeVariable) {
                            TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                            if (typeArr.length == typeParameters.length) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 < typeParameters.length) {
                                        if (type == typeParameters[i3]) {
                                            actualTypeArguments[i2] = typeArr[i3];
                                            z = true;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                if (!z) {
                                    throw new RuntimeException("Unable to find replacement for " + type);
                                }
                            } else {
                                throw new RuntimeException("Type array mismatch");
                            }
                        }
                    }
                    cls = (Class) parameterizedType.getRawType();
                    typeArr = actualTypeArguments;
                } else {
                    typeArr = EMPTY_TYPES;
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i < length) {
                            Class<?> cls2 = interfaces[i];
                            if (List.class.isAssignableFrom(cls2)) {
                                cls = cls2;
                                break;
                            }
                            i++;
                        } else {
                            cls = cls.getSuperclass();
                            break;
                        }
                    }
                }
            } else if (typeArr.length == 1) {
                return typeArr[0];
            } else {
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, typeArr);
        if (!(listParameter instanceof Class)) {
            return true;
        }
        return this.elementType.isAssignableFrom((Class) listParameter);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public b0 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        if (this.collection == b.MAP) {
            return true;
        }
        return false;
    }

    public boolean isPacked() {
        return b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        if (this.collection == b.SCALAR) {
            return true;
        }
        return false;
    }

    public boolean isValidForField(Field field) {
        if (b.VECTOR.equals(this.collection)) {
            return isValidForList(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }
}
