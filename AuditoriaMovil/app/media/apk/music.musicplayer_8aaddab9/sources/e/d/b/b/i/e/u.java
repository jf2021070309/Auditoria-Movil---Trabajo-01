package e.d.b.b.i.e;

import android.util.SparseArray;
/* loaded from: classes.dex */
public enum u {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    private static final SparseArray<u> valueMap;
    private final int value;

    static {
        u uVar = DEFAULT;
        u uVar2 = UNMETERED_ONLY;
        u uVar3 = UNMETERED_OR_DAILY;
        u uVar4 = FAST_IF_RADIO_AWAKE;
        u uVar5 = NEVER;
        u uVar6 = UNRECOGNIZED;
        SparseArray<u> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, uVar);
        sparseArray.put(1, uVar2);
        sparseArray.put(2, uVar3);
        sparseArray.put(3, uVar4);
        sparseArray.put(4, uVar5);
        sparseArray.put(-1, uVar6);
    }

    u(int i2) {
        this.value = i2;
    }

    public static u forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return null;
                        }
                        return NEVER;
                    }
                    return FAST_IF_RADIO_AWAKE;
                }
                return UNMETERED_OR_DAILY;
            }
            return UNMETERED_ONLY;
        }
        return DEFAULT;
    }

    public final int getNumber() {
        return this.value;
    }
}
