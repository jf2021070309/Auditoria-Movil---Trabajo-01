package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.od0.i;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public enum j implements i.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    
    private static i.b<j> internalValueMap = new a();
    private final int value;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a implements i.b<j> {
        @Override // com.amazon.aps.iva.od0.i.b
        public final j findValueByNumber(int i) {
            return j.valueOf(i);
        }
    }

    j(int i, int i2) {
        this.value = i2;
    }

    @Override // com.amazon.aps.iva.od0.i.a
    public final int getNumber() {
        return this.value;
    }

    public static j valueOf(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SEALED;
                }
                return ABSTRACT;
            }
            return OPEN;
        }
        return FINAL;
    }
}
