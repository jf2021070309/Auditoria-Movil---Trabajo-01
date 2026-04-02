package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.aH  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1127aH extends C03866m {
    public static byte[] A01;
    public final AudioManager A00;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{-22, -2, -19, -14, -8};
    }

    public C1127aH(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (AudioManager) context.getSystemService(A04(0, 5, 104));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A03(HashMap<Integer, C1128aI> hashMap) {
        return new C1055Xx(SystemClock.elapsedRealtime(), A02(), hashMap, AnonymousClass79.A06);
    }

    public final InterfaceC03956v A0G() {
        return new C1130aK(this);
    }

    public final InterfaceC03956v A0H() {
        return new C1133aN(this);
    }

    public final InterfaceC03956v A0I() {
        return new C1132aM(this);
    }

    public final InterfaceC03956v A0J() {
        return new C1131aL(this);
    }

    public final InterfaceC03956v A0K(List<C03946u> list) {
        return new C1129aJ(this, list);
    }
}
