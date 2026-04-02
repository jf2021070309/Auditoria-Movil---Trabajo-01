package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import ch.qos.logback.classic.Level;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.4D  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4D {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final C4T A02;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{84, 83, 75, 92, 81, 84, 89, 29, 82, 79, 84, 88, 83, 73, 92, 73, 84, 82, 83};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i2);

    public C4D(C4T c4t) {
        this.A00 = Level.ALL_INT;
        this.A01 = new Rect();
        this.A02 = c4t;
    }

    public /* synthetic */ C4D(C4T c4t, C1231by c1231by) {
        this(c4t);
    }

    public static C4D A00(C4T c4t) {
        return new C1231by(c4t);
    }

    public static C4D A01(C4T c4t) {
        return new C1230bx(c4t);
    }

    public static C4D A02(C4T c4t, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return A01(c4t);
            }
            throw new IllegalArgumentException(A03(0, 19, 11));
        }
        return A00(c4t);
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
