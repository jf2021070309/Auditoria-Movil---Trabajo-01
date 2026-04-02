package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class Y7 implements InterfaceC03956v {
    public static byte[] A01;
    public final /* synthetic */ Y6 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{84, 91, 81, 71, 90, 92, 81, 27, 93, 84, 71, 81, 66, 84, 71, 80, 27, 64, 70, 87, 27, 84, 86, 65, 92, 90, 91, 27, 96, 102, 119, 106, 102, 97, 116, 97, 112, 28, 16, 17, 17, 26, 28, 11, 26, 27};
    }

    public Y7(Y6 y6) {
        this.A00 = y6;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        Context context;
        context = this.A00.A00;
        Intent intent = context.registerReceiver(null, new IntentFilter(A00(0, 37, 55)));
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            return this.A00.A0F(extras.getBoolean(A00(37, 9, 125)));
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
