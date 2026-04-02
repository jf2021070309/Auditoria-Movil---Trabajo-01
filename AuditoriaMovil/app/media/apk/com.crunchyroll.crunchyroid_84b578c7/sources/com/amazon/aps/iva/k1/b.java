package com.amazon.aps.iva.k1;

import android.graphics.Shader;
import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.f1.t;
import com.amazon.aps.iva.f1.x0;
import com.amazon.aps.iva.f3.c;
/* compiled from: XmlVectorParser.android.kt */
/* loaded from: classes.dex */
public final class b {
    public static final s a(c cVar) {
        boolean z;
        Shader shader = cVar.a;
        boolean z2 = true;
        if (shader != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z && cVar.c == 0) {
            z2 = false;
        }
        if (z2) {
            if (shader != null) {
                return new t(shader);
            }
            return new x0(i.d(cVar.c));
        }
        return null;
    }
}
