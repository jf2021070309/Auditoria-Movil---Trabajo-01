package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Nk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0787Nk implements View.OnClickListener {
    public static byte[] A02;
    public final /* synthetic */ C1046Xo A00;
    public final /* synthetic */ C0789Nm A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, 20, 33, 23, 37, 34, 28, 23, -31, 28, 33, 39, 24, 33, 39, -31, 20, 22, 39, 28, 34, 33, -31, 9, -4, -8, 10};
    }

    public View$OnClickListenerC0787Nk(C0789Nm c0789Nm, C1046Xo c1046Xo) {
        this.A01 = c0789Nm;
        this.A00 = c1046Xo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            str = this.A01.A06;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 35);
            str2 = this.A01.A06;
            if (!A00.equals(str2)) {
                String A002 = A00(11, 26, 113);
                str3 = this.A01.A06;
                Intent intent = new Intent(A002, Uri.parse(str3));
                intent.addFlags(268435456);
                this.A00.A0D().A8A();
                LL.A0B(this.A00, intent);
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
