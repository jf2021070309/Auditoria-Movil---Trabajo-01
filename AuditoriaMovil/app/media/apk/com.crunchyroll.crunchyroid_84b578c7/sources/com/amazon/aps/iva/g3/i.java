package com.amazon.aps.iva.g3;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.f3.f;
/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public final class i {
    public static final o a;
    public static final com.amazon.aps.iva.x.g<String, Typeface> b;

    /* compiled from: TypefaceCompat.java */
    /* loaded from: classes.dex */
    public static class a extends x {
        public final f.e e;

        public a(f.e eVar) {
            this.e = eVar;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new m();
        } else if (i >= 28) {
            a = new l();
        } else {
            a = new k();
        }
        b = new com.amazon.aps.iva.x.g<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.equals(r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r7, com.amazon.aps.iva.f3.d.b r8, android.content.res.Resources r9, int r10, java.lang.String r11, int r12, int r13, com.amazon.aps.iva.f3.f.e r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g3.i.a(android.content.Context, com.amazon.aps.iva.f3.d$b, android.content.res.Resources, int, java.lang.String, int, int, com.amazon.aps.iva.f3.f$e, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
