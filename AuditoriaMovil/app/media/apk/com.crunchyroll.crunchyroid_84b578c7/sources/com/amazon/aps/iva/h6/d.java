package com.amazon.aps.iva.h6;

import com.google.common.primitives.Ints;
import java.util.ArrayList;
/* compiled from: DefaultHlsExtractorFactory.java */
/* loaded from: classes.dex */
public final class d implements i {
    public static final int[] b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i, ArrayList arrayList) {
        if (Ints.indexOf(b, i) != -1 && !arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }
}
