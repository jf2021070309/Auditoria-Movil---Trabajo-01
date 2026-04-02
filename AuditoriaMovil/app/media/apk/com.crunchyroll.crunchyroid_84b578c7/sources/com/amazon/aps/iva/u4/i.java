package com.amazon.aps.iva.u4;

import com.amazon.aps.iva.v4.y;
/* compiled from: LayoutProto.java */
/* loaded from: classes.dex */
public enum i implements y.a {
    DEFAULT_IDENTITY(0),
    BACKGROUND_NODE(1),
    UNRECOGNIZED(-1);
    
    public static final int BACKGROUND_NODE_VALUE = 1;
    public static final int DEFAULT_IDENTITY_VALUE = 0;
    private static final y.b<i> internalValueMap = new a();
    private final int value;

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public class a implements y.b<i> {
    }

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public static final class b implements y.c {
        public static final b a = new b();

        @Override // com.amazon.aps.iva.v4.y.c
        public final boolean isInRange(int i) {
            if (i.forNumber(i) != null) {
                return true;
            }
            return false;
        }
    }

    i(int i) {
        this.value = i;
    }

    public static i forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BACKGROUND_NODE;
        }
        return DEFAULT_IDENTITY;
    }

    public static y.b<i> internalGetValueMap() {
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
    public static i valueOf(int i) {
        return forNumber(i);
    }
}
