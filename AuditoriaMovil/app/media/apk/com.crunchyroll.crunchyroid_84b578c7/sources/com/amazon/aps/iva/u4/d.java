package com.amazon.aps.iva.u4;

import com.amazon.aps.iva.v4.y;
/* compiled from: LayoutProto.java */
/* loaded from: classes.dex */
public enum d implements y.a {
    UNSPECIFIED_HORIZONTAL_ALIGNMENT(0),
    START(1),
    CENTER_HORIZONTALLY(2),
    END(3),
    UNRECOGNIZED(-1);
    
    public static final int CENTER_HORIZONTALLY_VALUE = 2;
    public static final int END_VALUE = 3;
    public static final int START_VALUE = 1;
    public static final int UNSPECIFIED_HORIZONTAL_ALIGNMENT_VALUE = 0;
    private static final y.b<d> internalValueMap = new a();
    private final int value;

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public class a implements y.b<d> {
    }

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public static final class b implements y.c {
        public static final b a = new b();

        @Override // com.amazon.aps.iva.v4.y.c
        public final boolean isInRange(int i) {
            if (d.forNumber(i) != null) {
                return true;
            }
            return false;
        }
    }

    d(int i) {
        this.value = i;
    }

    public static d forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return END;
                }
                return CENTER_HORIZONTALLY;
            }
            return START;
        }
        return UNSPECIFIED_HORIZONTAL_ALIGNMENT;
    }

    public static y.b<d> internalGetValueMap() {
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
    public static d valueOf(int i) {
        return forNumber(i);
    }
}
