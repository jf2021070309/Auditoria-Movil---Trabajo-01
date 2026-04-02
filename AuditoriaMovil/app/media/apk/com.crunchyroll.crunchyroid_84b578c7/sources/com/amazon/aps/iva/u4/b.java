package com.amazon.aps.iva.u4;

import com.amazon.aps.iva.v4.y;
/* compiled from: LayoutProto.java */
/* loaded from: classes.dex */
public enum b implements y.a {
    UNSPECIFIED_CONTENT_SCALE(0),
    FIT(1),
    CROP(2),
    FILL_BOUNDS(3),
    UNRECOGNIZED(-1);
    
    public static final int CROP_VALUE = 2;
    public static final int FILL_BOUNDS_VALUE = 3;
    public static final int FIT_VALUE = 1;
    public static final int UNSPECIFIED_CONTENT_SCALE_VALUE = 0;
    private static final y.b<b> internalValueMap = new a();
    private final int value;

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public class a implements y.b<b> {
    }

    /* compiled from: LayoutProto.java */
    /* renamed from: com.amazon.aps.iva.u4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0755b implements y.c {
        public static final C0755b a = new C0755b();

        @Override // com.amazon.aps.iva.v4.y.c
        public final boolean isInRange(int i) {
            if (b.forNumber(i) != null) {
                return true;
            }
            return false;
        }
    }

    b(int i) {
        this.value = i;
    }

    public static b forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return FILL_BOUNDS;
                }
                return CROP;
            }
            return FIT;
        }
        return UNSPECIFIED_CONTENT_SCALE;
    }

    public static y.b<b> internalGetValueMap() {
        return internalValueMap;
    }

    public static y.c internalGetVerifier() {
        return C0755b.a;
    }

    @Override // com.amazon.aps.iva.v4.y.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static b valueOf(int i) {
        return forNumber(i);
    }
}
