package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
@TargetApi(14)
/* loaded from: assets/audience_network.dex */
public final class QZ {
    public static byte[] A02;
    public static String[] A03 = {"WzijvlAd9RP1HJzMxCKzeYHnMs2QP54v", "kfrqpsiELz0FvZTPYg", "hAwPDz", "OryCsPOoCbEZ1Kjw18", "JoqBI6chV", "rfkFyJ13DXugB3RLj6H", "rQvj", "kthZXjW83"};
    public final DN A00;
    public final C0981Uy A01 = new C0981Uy();

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-114, -104, -116, -114, -49, -51, -31, -33, -47, -114, -116, -90, -116, -114, -96, -86, -98, -96, -16, -29, -20, -30, -29, -16, -29, -16, -57, -20, -30, -29, -10, -96, -98, -72, -98, -96, -114, -23, 111, 114, -127, -68, 99, -75, -70, -79, -90, 99, 97, 123, 97, 99};
    }

    static {
        A02();
    }

    public QZ(C1046Xo c1046Xo) {
        this.A00 = AO.A00(new X8(c1046Xo), new BJ(new V5(this.A01)), new XA());
    }

    @VisibleForTesting
    public static String A01(AM am) {
        return A00(41, 11, 55) + am.A01 + A00(14, 22, 116) + am.A00 + A00(0, 14, 98) + am.getCause() + A00(36, 2, 98);
    }

    public static boolean A03() {
        if (A03[0].charAt(3) != 'z') {
            A03[6] = "p35x";
            return true;
        }
        throw new RuntimeException();
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A5q();
    }

    public final long A06() {
        return this.A00.A6E();
    }

    public final long A07() {
        return this.A00.A6Q();
    }

    @Nullable
    public final QX A08() {
        Format A0L = this.A00.A0L();
        if (A0L == null) {
            return null;
        }
        return new QX(A0L.A0F, A0L.A08);
    }

    public final void A09() {
        this.A00.ADj();
    }

    public final void A0A() {
        this.A00.AET();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f2) {
        this.A00.A0N(f2);
    }

    public final void A0D(long j2) {
        this.A00.AES(j2);
    }

    public final void A0E(Context context, Uri uri) {
        if (JQ.A1z(context, A03())) {
            this.A00.A0P(new VO(C0857Qd.A05(context).A0E(context)).A00(uri));
            return;
        }
        this.A00.A0P(new VO(new C0979Uw(context, C0676Iy.A0K(context, A00(38, 3, 4)), this.A01)).A00(uri));
    }

    public final void A0F(@Nullable Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0G(QW qw) {
        this.A00.A3D(new I6(this, qw));
    }

    public final void A0H(QY qy) {
        this.A00.A0Q(new IC(this, qy));
    }

    public final void A0I(boolean z) {
        this.A00.AEj(z);
    }

    public final boolean A0J() {
        return this.A00.A7C();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
