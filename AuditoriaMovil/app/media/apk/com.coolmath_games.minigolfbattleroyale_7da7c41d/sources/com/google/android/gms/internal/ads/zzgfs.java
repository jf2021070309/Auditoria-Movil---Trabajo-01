package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public enum zzgfs {
    DOUBLE(0, 1, zzggo.DOUBLE),
    FLOAT(1, 1, zzggo.FLOAT),
    INT64(2, 1, zzggo.LONG),
    UINT64(3, 1, zzggo.LONG),
    INT32(4, 1, zzggo.INT),
    FIXED64(5, 1, zzggo.LONG),
    FIXED32(6, 1, zzggo.INT),
    BOOL(7, 1, zzggo.BOOLEAN),
    STRING(8, 1, zzggo.STRING),
    MESSAGE(9, 1, zzggo.MESSAGE),
    BYTES(10, 1, zzggo.BYTE_STRING),
    UINT32(11, 1, zzggo.INT),
    ENUM(12, 1, zzggo.ENUM),
    SFIXED32(13, 1, zzggo.INT),
    SFIXED64(14, 1, zzggo.LONG),
    SINT32(15, 1, zzggo.INT),
    SINT64(16, 1, zzggo.LONG),
    GROUP(17, 1, zzggo.MESSAGE),
    DOUBLE_LIST(18, 2, zzggo.DOUBLE),
    FLOAT_LIST(19, 2, zzggo.FLOAT),
    INT64_LIST(20, 2, zzggo.LONG),
    UINT64_LIST(21, 2, zzggo.LONG),
    INT32_LIST(22, 2, zzggo.INT),
    FIXED64_LIST(23, 2, zzggo.LONG),
    FIXED32_LIST(24, 2, zzggo.INT),
    BOOL_LIST(25, 2, zzggo.BOOLEAN),
    STRING_LIST(26, 2, zzggo.STRING),
    MESSAGE_LIST(27, 2, zzggo.MESSAGE),
    BYTES_LIST(28, 2, zzggo.BYTE_STRING),
    UINT32_LIST(29, 2, zzggo.INT),
    ENUM_LIST(30, 2, zzggo.ENUM),
    SFIXED32_LIST(31, 2, zzggo.INT),
    SFIXED64_LIST(32, 2, zzggo.LONG),
    SINT32_LIST(33, 2, zzggo.INT),
    SINT64_LIST(34, 2, zzggo.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzggo.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzggo.FLOAT),
    INT64_LIST_PACKED(37, 3, zzggo.LONG),
    UINT64_LIST_PACKED(38, 3, zzggo.LONG),
    INT32_LIST_PACKED(39, 3, zzggo.INT),
    FIXED64_LIST_PACKED(40, 3, zzggo.LONG),
    FIXED32_LIST_PACKED(41, 3, zzggo.INT),
    BOOL_LIST_PACKED(42, 3, zzggo.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzggo.INT),
    ENUM_LIST_PACKED(44, 3, zzggo.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzggo.INT),
    SFIXED64_LIST_PACKED(46, 3, zzggo.LONG),
    SINT32_LIST_PACKED(47, 3, zzggo.INT),
    SINT64_LIST_PACKED(48, 3, zzggo.LONG),
    GROUP_LIST(49, 2, zzggo.MESSAGE),
    MAP(50, 4, zzggo.VOID);
    
    private static final zzgfs[] zzac;
    private final zzggo zzZ;
    private final int zzaa;
    private final Class<?> zzab;

    static {
        zzgfs[] values = values();
        zzac = new zzgfs[values.length];
        for (zzgfs zzgfsVar : values) {
            zzac[zzgfsVar.zzaa] = zzgfsVar;
        }
    }

    zzgfs(int i, int i2, zzggo zzggoVar) {
        this.zzaa = i;
        this.zzZ = zzggoVar;
        zzggo zzggoVar2 = zzggo.VOID;
        int i3 = i2 - 1;
        if (i3 == 1) {
            this.zzab = zzggoVar.zza();
        } else if (i3 != 3) {
            this.zzab = null;
        } else {
            this.zzab = zzggoVar.zza();
        }
        if (i2 == 1) {
            zzggoVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzaa;
    }
}
