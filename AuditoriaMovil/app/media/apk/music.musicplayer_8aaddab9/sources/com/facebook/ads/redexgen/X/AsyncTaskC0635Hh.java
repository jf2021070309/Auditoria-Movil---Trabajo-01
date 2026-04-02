package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
/* renamed from: com.facebook.ads.redexgen.X.Hh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC0635Hh extends AsyncTask<R7, Void, InterfaceC0874Qu> implements R4 {
    public static byte[] A04;
    public InterfaceC0876Qw A00;
    public HF A01;
    public Exception A02;
    public Executor A03;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-18, 25, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, -2, 11, 29, 21, -54, 30, 11, 21, 15, 29, -54, 15, 34, 11, 13, 30, 22, 35, -54, 25, 24, 15, -54, 11, 28, 17, 31, 23, 15, 24, 30, -54, 25, 16, -54, 30, 35, 26, 15, -54, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, 15, 27, 27, 23, -25, 57, 44, 56, 60, 44, 58, 59, -25, 45, 40, 48, 51, 44, 43, 1, -25, -20, 58, 36, 80, 80, 76, -4, 78, 65, 79, 76, 75, 74, 79, 65, -4, 69, 79, -4, 74, 81, 72, 72, -67, -48, -34, -37, -38, -39, -34, -48, -91, -117, -112, -49, -117, -109, -112, -34, -108, -91, 117, -112, -34};
    }

    public AsyncTaskC0635Hh(HF hf, InterfaceC0876Qw interfaceC0876Qw, Executor executor) {
        this.A01 = hf;
        this.A00 = interfaceC0876Qw;
        this.A03 = executor;
    }

    private final InterfaceC0874Qu A00(R7... r7Arr) {
        if (C0726Kz.A02(this)) {
            return null;
        }
        try {
            if (r7Arr != null) {
                try {
                    if (r7Arr.length > 0) {
                        InterfaceC0874Qu A0J = this.A01.A0J(r7Arr[0]);
                        if (this.A01.A0K().A04() && A0J != null) {
                            String.format(Locale.US, A01(108, 21, 6), Integer.valueOf(A0J.A7Z()), A0J.getUrl(), A0J.A5o());
                        }
                        if (A0J != null) {
                            return A0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 119));
                    }
                } catch (Exception e2) {
                    this.A02 = e2;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 98), e2.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 69));
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
            return null;
        }
    }

    private final void A03(InterfaceC0874Qu interfaceC0874Qu) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.AAK(interfaceC0874Qu);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.R4
    public final void A5G(R7 r7) {
        super.executeOnExecutor(this.A03, r7);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ InterfaceC0874Qu doInBackground(R7[] r7Arr) {
        if (C0726Kz.A02(this)) {
            return null;
        }
        try {
            return A00(r7Arr);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.AAi(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(InterfaceC0874Qu interfaceC0874Qu) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            A03(interfaceC0874Qu);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
