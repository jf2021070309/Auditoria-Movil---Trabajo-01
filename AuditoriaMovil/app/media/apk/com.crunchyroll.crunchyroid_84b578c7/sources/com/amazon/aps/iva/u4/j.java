package com.amazon.aps.iva.u4;

import com.amazon.aps.iva.v4.y;
/* compiled from: LayoutProto.java */
/* loaded from: classes.dex */
public enum j implements y.a {
    UNSPECIFIED_VERTICAL_ALIGNMENT(0),
    TOP(1),
    CENTER_VERTICALLY(2),
    BOTTOM(3),
    UNRECOGNIZED(-1);
    
    public static final int BOTTOM_VALUE = 3;
    public static final int CENTER_VERTICALLY_VALUE = 2;
    public static final int TOP_VALUE = 1;
    public static final int UNSPECIFIED_VERTICAL_ALIGNMENT_VALUE = 0;
    private static final y.b<j> internalValueMap = new a();
    private final int value;

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public class a implements y.b<j> {
    }

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public static final class b implements y.c {
        public static final b a = new b();

        @Override // com.amazon.aps.iva.v4.y.c
        public final boolean isInRange(int i) {
            if (j.forNumber(i) != null) {
                return true;
            }
            return false;
        }
    }

    j(int i) {
        this.value = i;
    }

    public static j forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return BOTTOM;
                }
                return CENTER_VERTICALLY;
            }
            return TOP;
        }
        return UNSPECIFIED_VERTICAL_ALIGNMENT;
    }

    public static y.b<j> internalGetValueMap() {
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
    public static j valueOf(int i) {
        return forNumber(i);
    }
}
