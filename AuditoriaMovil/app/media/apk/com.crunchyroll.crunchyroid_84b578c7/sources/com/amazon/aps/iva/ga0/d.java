package com.amazon.aps.iva.ga0;

import com.amazon.aps.iva.a0.r;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class d extends c {
    public static final ArrayList<String> d;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        d = arrayList;
        r.e(arrayList, "c1", "c2", "c3", "c4");
        r.e(arrayList, "c5", "c6", "c7", "c8");
        arrayList.add("c9");
        arrayList.add("c10");
    }

    public final String f() {
        return "CustomData: \n    CUSTOM_DATA_1: \n" + a("c1") + "\n    CUSTOM_DATA_2: \n" + a("c2") + "\n    CUSTOM_DATA_3: \n" + a("c3") + "\n    CUSTOM_DATA_4: \n" + a("c4") + "\n    CUSTOM_DATA_5: \n" + a("c5") + "\n    CUSTOM_DATA_6: \n" + a("c6") + "\n    CUSTOM_DATA_7: \n" + a("c7") + "\n    CUSTOM_DATA_8: \n" + a("c8") + "\n    CUSTOM_DATA_9: \n" + a("c9") + "\n    CUSTOM_DATA_10: \n" + a("c10");
    }

    @Override // com.amazon.aps.iva.ga0.c
    public final void d() {
    }
}
