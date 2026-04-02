package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.SystemClock;
import android.view.OrientationEventListener;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.6Y  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6Y {
    @Nullable
    public static OrientationEventListener A02;
    public static String[] A03 = {"ciYSwpO57ig7", "AgXvWM7vBAP276b3F", "h3L2uX2266ICJ0F8mxeOzYeo", "sn1Bi96p4g3FJ3lBwfTgs4qOj566", "nEyUaJreiz", "9f6cxckTFidZYnVMHRSclm", "9nbfinSPxnf3N791gNAhDrqxfgbV", "EACetWGUN5dpVn0xkHaZeeKDOZ"};
    public final C6W A00;
    public final EnumC03996z A01;

    public C6Y(C6W c6w, EnumC03996z enumC03996z) {
        this.A00 = c6w;
        this.A01 = enumC03996z;
    }

    public final synchronized void A01() {
        if (A02 != null) {
            A02.disable();
            A02 = null;
        }
    }

    public final synchronized void A02(final Context context) {
        final AnonymousClass78 anonymousClass78;
        if (A02 != null) {
            String[] strArr = A03;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "WLHhaS1yyOUNNZKQvAoQ3Zw3xj";
            strArr2[1] = "prMYx6h4YCDadOhBb";
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        String packageName = context == null ? "" : context.getPackageName();
        if (this.A01 == EnumC03996z.A0G) {
            anonymousClass78 = null;
        } else {
            anonymousClass78 = new AnonymousClass78(packageName);
        }
        A02 = new OrientationEventListener(context, 3) { // from class: com.facebook.ads.redexgen.X.6X
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i2) {
                C6W c6w;
                Y0 y0 = new Y0(elapsedRealtime, anonymousClass78, i2);
                c6w = C6Y.this.A00;
                c6w.A02(y0, C6V.A0A);
            }
        };
        A02.enable();
    }
}
