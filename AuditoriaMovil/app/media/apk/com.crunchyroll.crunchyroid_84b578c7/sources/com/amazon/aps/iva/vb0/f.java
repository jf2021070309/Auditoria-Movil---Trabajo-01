package com.amazon.aps.iva.vb0;

import com.amazon.aps.iva.yb0.j;
import java.io.File;
/* compiled from: Utils.kt */
/* loaded from: classes4.dex */
public class f extends e {
    public static final boolean L(File file) {
        j.f(file, "<this>");
        c cVar = c.BOTTOM_UP;
        j.f(cVar, "direction");
        while (true) {
            boolean z = true;
            for (File file2 : new b(file, cVar)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }
}
