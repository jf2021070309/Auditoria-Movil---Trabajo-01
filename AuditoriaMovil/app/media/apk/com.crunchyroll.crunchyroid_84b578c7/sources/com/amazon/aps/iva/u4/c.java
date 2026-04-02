package com.amazon.aps.iva.u4;

import com.amazon.aps.iva.v4.y;
/* compiled from: LayoutProto.java */
/* loaded from: classes.dex */
public enum c implements y.a {
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);
    
    public static final int EXACT_VALUE = 1;
    public static final int EXPAND_VALUE = 4;
    public static final int FILL_VALUE = 3;
    public static final int UNKNOWN_DIMENSION_TYPE_VALUE = 0;
    public static final int WRAP_VALUE = 2;
    private static final y.b<c> internalValueMap = new a();
    private final int value;

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public class a implements y.b<c> {
    }

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public static final class b implements y.c {
        public static final b a = new b();

        @Override // com.amazon.aps.iva.v4.y.c
        public final boolean isInRange(int i) {
            if (c.forNumber(i) != null) {
                return true;
            }
            return false;
        }
    }

    c(int i) {
        this.value = i;
    }

    public static c forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return EXPAND;
                    }
                    return FILL;
                }
                return WRAP;
            }
            return EXACT;
        }
        return UNKNOWN_DIMENSION_TYPE;
    }

    public static y.b<c> internalGetValueMap() {
        return internalValueMap;
    }

    public static y.c internalGetVerifier() {
        return b.a;
    }

    @Override // com.amazon.aps.iva.v4.y.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static c valueOf(int i) {
        return forNumber(i);
    }
}
