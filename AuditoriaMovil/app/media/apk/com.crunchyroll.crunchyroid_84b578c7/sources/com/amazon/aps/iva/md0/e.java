package com.amazon.aps.iva.md0;

import com.amazon.aps.iva.yb0.j;
import java.util.Arrays;
/* compiled from: JvmMetadataVersion.kt */
/* loaded from: classes4.dex */
public final class e extends com.amazon.aps.iva.kd0.a {
    public static final e g;
    public static final e h;
    public final boolean f;

    static {
        e eVar;
        e eVar2 = new e(1, 8, 0);
        g = eVar2;
        int i = eVar2.c;
        int i2 = eVar2.b;
        if (i2 == 1 && i == 9) {
            eVar = new e(2, 0, 0);
        } else {
            eVar = new e(i2, i + 1, 0);
        }
        h = eVar;
        new e(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z, int[] iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        j.f(iArr, "versionArray");
        this.f = z;
    }

    public final boolean b(e eVar) {
        boolean z;
        j.f(eVar, "metadataVersionFromLanguageVersion");
        e eVar2 = g;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 2 && i == 0 && eVar2.b == 1 && eVar2.c == 8) {
            return true;
        }
        if (!this.f) {
            eVar2 = h;
        }
        eVar2.getClass();
        boolean z2 = false;
        int i3 = eVar.b;
        int i4 = eVar2.b;
        if (i4 > i3 || (i4 >= i3 && eVar2.c > eVar.c)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eVar = eVar2;
        }
        if ((i2 == 1 && i == 0) || i2 == 0) {
            return false;
        }
        int i5 = eVar.b;
        if (i2 > i5 || (i2 >= i5 && i > eVar.c)) {
            z2 = true;
        }
        return !z2;
    }

    public e(int... iArr) {
        this(false, iArr);
    }
}
