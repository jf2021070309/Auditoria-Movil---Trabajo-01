package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.od0.i;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public enum w implements i.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    
    private static i.b<w> internalValueMap = new a();
    private final int value;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a implements i.b<w> {
        @Override // com.amazon.aps.iva.od0.i.b
        public final w findValueByNumber(int i) {
            return w.valueOf(i);
        }
    }

    w(int i, int i2) {
        this.value = i2;
    }

    @Override // com.amazon.aps.iva.od0.i.a
    public final int getNumber() {
        return this.value;
    }

    public static w valueOf(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return LOCAL;
                        }
                        return PRIVATE_TO_THIS;
                    }
                    return PUBLIC;
                }
                return PROTECTED;
            }
            return PRIVATE;
        }
        return INTERNAL;
    }
}
