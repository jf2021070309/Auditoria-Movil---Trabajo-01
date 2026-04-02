package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.annotation.Nullable;
import ch.qos.logback.core.rolling.helper.Compressor;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.7Y  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7Y {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{92, 88, 84, 82, 80};
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(android.graphics.BitmapFactory.Options r3, int r4, int r5) {
        /*
            int r1 = r3.outHeight
            int r0 = r3.outWidth
            r3 = 1
            if (r1 > r5) goto L9
            if (r0 <= r4) goto L18
        L9:
            int r2 = r1 / 2
            int r1 = r0 / 2
        Ld:
            int r0 = r2 / r3
            if (r0 < r5) goto L18
            int r0 = r1 / r3
            if (r0 < r4) goto L18
            int r3 = r3 * 2
            goto Ld
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C7Y.A00(android.graphics.BitmapFactory$Options, int, int):int");
    }

    @Nullable
    public static Bitmap A01(InputStream inputStream, int i2, int i3) throws IOException {
        if (Build.VERSION.SDK_INT < 19) {
            return BitmapFactory.decodeStream(inputStream);
        }
        C0N c0n = new C0N(inputStream);
        c0n.mark(Compressor.BUFFER_SIZE);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c0n, null, options);
        c0n.reset();
        if (!c0n.A00()) {
            options.inSampleSize = A00(options, i3, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c0n, null, options);
        }
        return BitmapFactory.decodeStream(c0n);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static Bitmap A02(String str, int i2, int i3, C8U c8u) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i3, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable th) {
            c8u.A06().A8y(A03(0, 5, 99), C04398z.A1W, new AnonymousClass90(th));
            return null;
        }
    }
}
