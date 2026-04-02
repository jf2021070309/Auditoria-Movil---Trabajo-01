package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.od0.i;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public enum i implements i.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);
    
    private static i.b<i> internalValueMap = new a();
    private final int value;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a implements i.b<i> {
        @Override // com.amazon.aps.iva.od0.i.b
        public final i findValueByNumber(int i) {
            return i.valueOf(i);
        }
    }

    i(int i, int i2) {
        this.value = i2;
    }

    @Override // com.amazon.aps.iva.od0.i.a
    public final int getNumber() {
        return this.value;
    }

    public static i valueOf(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SYNTHESIZED;
                }
                return DELEGATION;
            }
            return FAKE_OVERRIDE;
        }
        return DECLARATION;
    }
}
