package com.amazon.aps.iva.uy;

import com.amazon.aps.iva.o60.i;
import com.amazon.aps.iva.p60.g;
import com.amazon.aps.iva.yb0.j;
import java.util.Locale;
/* compiled from: LocalizationModule.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final a a = new a();
    public static g b;
    public static i c;

    public static Locale a() {
        g gVar = b;
        if (gVar != null) {
            return gVar.a();
        }
        j.m("localeProvider");
        throw null;
    }
}
