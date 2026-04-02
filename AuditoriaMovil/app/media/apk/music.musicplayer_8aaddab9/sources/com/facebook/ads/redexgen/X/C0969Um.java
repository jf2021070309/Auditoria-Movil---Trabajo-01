package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* renamed from: com.facebook.ads.redexgen.X.Um  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0969Um implements InterfaceC0648Hw {
    public static String[] A03 = {"zA1HDLVhPd9PsL9PenCbpcrAKXxlN0d6", "FLS1DqH1RbizqOpj", "1z8O9NEtb5xyjYGA", "8w8GUSv0BTEQmaLhHrYTkFjQIFXWxu0p", "o1jGjvwpoOOHSDmJh0w1BZ4ZQReO8O7V", "", "IXAYHKYtOagUrLCRc2OBPi2ErH2JE5Q2", "ufrZt7t49gDVq6vRzV1VlqPqnp3Kfu3W"};
    public HandlerC0642Hq<? extends InterfaceC0643Hr> A00;
    public IOException A01;
    public final ExecutorService A02;

    public C0969Um(String str) {
        this.A02 = C0676Iy.A0T(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hp != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Hr> */
    public final <T extends InterfaceC0643Hr> long A04(T loadable, InterfaceC0641Hp<T> interfaceC0641Hp, int i2) {
        Looper myLooper = Looper.myLooper();
        IJ.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0642Hq(this, myLooper, loadable, interfaceC0641Hp, i2, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i2) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HandlerC0642Hq<? extends InterfaceC0643Hr> handlerC0642Hq = this.A00;
            if (handlerC0642Hq != null) {
                if (A03[0].charAt(1) != 'f') {
                    String[] strArr = A03;
                    strArr[2] = "ShO16ogjgPVIHMzl";
                    strArr[1] = "8gZONBnlwtDMou1V";
                    if (i2 == Integer.MIN_VALUE) {
                        i2 = handlerC0642Hq.A03;
                    }
                    handlerC0642Hq.A05(i2);
                    return;
                }
                throw new RuntimeException();
            }
            return;
        }
        throw iOException;
    }

    public final void A07(@Nullable InterfaceC0644Hs interfaceC0644Hs) {
        HandlerC0642Hq<? extends InterfaceC0643Hr> handlerC0642Hq = this.A00;
        if (handlerC0642Hq != null) {
            handlerC0642Hq.A07(true);
        }
        if (interfaceC0644Hs != null) {
            this.A02.execute(new RunnableC0645Ht(interfaceC0644Hs));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
