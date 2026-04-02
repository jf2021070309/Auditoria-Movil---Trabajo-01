package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Es  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0568Es implements Runnable {
    public static byte[] A02;
    public static String[] A03 = {"ygrR2oCQuDV4", "DNKcGXijWm6BAbsHYB9tJVHVwOJf9ZE7", "LXio5gucrx5pRKqWpkHtzDtUlmJWag3t", "79sxQvyKDcGCor525oKKoplIPAz2exYS", "G4RdIjdfwRebxnJM9f1GRZk4OR8ZnwMf", "KNt7Wd51BXMZnN1lzx9YZQc0XvITGZGG", "KZ351c6FjYQvk7DZPBJOKLteXh4ScOon", "e5Lfk6CJXwKq"};
    public final /* synthetic */ F0 A00;
    public final /* synthetic */ DownloadAction[] A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {56, 19, 11, 18, 16, 19, 29, 24, 49, 29, 18, 29, 27, 25, 14, 121, 76, 91, 90, 64, 90, 93, 64, 71, 78, 9, 72, 74, 93, 64, 70, 71, 90, 9, 79, 72, 64, 69, 76, 77, 7};
        if (A03[6].charAt(27) == 't') {
            throw new RuntimeException();
        }
        A03[3] = "P9OfQ9yL9WD45vqgxteLJEc4LCKor8r2";
        A02 = bArr;
    }

    static {
        A01();
    }

    public RunnableC0568Es(F0 f0, DownloadAction[] downloadActionArr) {
        this.A00 = f0;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0558Eg c0558Eg;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            try {
                c0558Eg = this.A00.A09;
                c0558Eg.A02(this.A01);
            } catch (IOException e2) {
                Log.e(A00(0, 15, 80), A00(15, 26, 5), e2);
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
            String[] strArr = A03;
            if (strArr[2].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            A03[5] = "LLc1NddejmN7rNF53s5OYYgeggfBVRnl";
        }
    }
}
