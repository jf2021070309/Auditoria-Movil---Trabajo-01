package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.9A  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C9A extends AbstractC0775My {
    public static byte[] A01;
    public final /* synthetic */ C0825Ow A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-78, -65, -65, -68, -65};
    }

    public C9A(C0825Ow c0825Ow) {
        this.A00 = c0825Ow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC04429c
    /* renamed from: A02 */
    public final void A03(C0776Mz c0776Mz) {
        InterfaceC0824Ov interfaceC0824Ov;
        JSONObject A03;
        new Handler(Looper.getMainLooper()).post(new RunnableC0823Ou(this));
        interfaceC0824Ov = this.A00.A0B;
        A03 = this.A00.A03();
        interfaceC0824Ov.ACg(A00(0, 5, 60), A03);
    }
}
