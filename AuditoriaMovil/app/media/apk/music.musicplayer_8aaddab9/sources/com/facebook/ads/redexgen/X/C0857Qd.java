package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.File;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Qd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0857Qd {
    public static C0857Qd A09;
    public static byte[] A0A;
    public static String[] A0B = {"688Ud0WFcmtoZguZNYMQvcz7Ljs", "nPELSPwzrl0V6IBXdfGSyJY", "V1hbmPEna1XhhewDQ0tbDQdr9h5aChAO", "TQqT5oCJg2dLoA7GlYM3aQ", "u27pUDvoszRTHHiSsQOFNRfLPBfceTs8", "ATiE4qOK4Q4Yex0MbemwEb7mKStAZOqp", "bMYeiabzwxfEm1FBemkFwtc", "vCUl1zlXyex2u5GmhzPd2ypZUlS"};
    public static final DownloadAction.Deserializer[] A0C;
    public F0 A00;
    @Nullable
    public I3 A01;
    public File A02;
    public boolean A03;
    public final Context A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final SparseArray<C0855Qb> A06 = new SparseArray<>();
    public final Runnable A08 = new RunnableC0854Qa(this);
    public final InterfaceC0569Et A07 = new I4(this);

    public static String A07(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0A = new byte[]{-103, -69, -14, -19, -34, -20, -77, -103, -69, -3, 20, 15, 0, 14, -69, -24, 19, 27, 18, 16, 19, 5, 8, 9, 8, -46, -60, -9, 24, 5, 24, 9, -34, -60, 27, 72, 72, 69, 72, 4, -10, 41, 74, 55, 74, 59, 16, -10, -44, -31, -13, -21, 33, 36, 46, 55, -19, 33, 35, 52, 41, 47, 46, 51, -40, -37, -27, -18, -92, -37, -26, -18, -27, -29, -26, -40, -37, -22, 33, 36, 51};
    }

    static {
        A0B();
        A0C = new DownloadAction.Deserializer[]{VV.A03};
    }

    @VisibleForTesting
    public C0857Qd(Context context, @Nullable F0 f0) {
        this.A04 = context;
        if (f0 != null) {
            this.A00 = f0;
            f0.A0Q(this.A07);
        }
        A01().A0P();
    }

    private synchronized F0 A01() {
        if (this.A00 == null) {
            this.A00 = new F0(new F5(A03(), A02()), 10, 5, new File(A06(), A07(52, 12, 89)), A0C);
            this.A00.A0Q(this.A07);
        }
        return this.A00;
    }

    private InterfaceC0973Uq A02() {
        return new C2N(A07(78, 3, 89), null);
    }

    private final synchronized I3 A03() {
        I3 i3;
        if (this.A01 == null) {
            this.A01 = new C0959Uc(new File(A06(), A07(64, 14, 16)), new BF(JQ.A0N(this.A04)));
        }
        i3 = this.A01;
        String[] strArr = A0B;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0B[5] = "O4H7XzH8kHHYhvbNpS10DOnxTEfi7R6X";
        return i3;
    }

    public static C0962Uf A04(C0979Uw c0979Uw, I3 i3) {
        return new C0962Uf(i3, c0979Uw, new C0975Us(), null, 2, null);
    }

    public static synchronized C0857Qd A05(Context context) {
        C0857Qd c0857Qd;
        synchronized (C0857Qd.class) {
            if (A09 == null) {
                A09 = new C0857Qd(context.getApplicationContext(), null);
            }
            c0857Qd = A09;
        }
        return c0857Qd;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A04.getCacheDir();
        }
        return this.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        C0575Ez[] A0S;
        for (C0575Ez c0575Ez : A01().A0S()) {
            int state = c0575Ez.A02;
            C0855Qb c0855Qb = this.A06.get(state);
            if (c0855Qb != null) {
                int i2 = c0575Ez.A01;
                if (i2 == 2 || c0575Ez.A03 > c0855Qb.A00) {
                    String str = A07(15, 19, 61) + i2 + A07(0, 8, 18) + c0575Ez.A03;
                    c0855Qb.A01.AAW();
                    this.A06.remove(state);
                } else if (i2 == 4 || i2 == 3) {
                    String str2 = A07(34, 14, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION) + i2;
                    c0855Qb.A01.AAg();
                    this.A06.remove(state);
                }
            }
            String str3 = A07(48, 4, 25) + state + A07(8, 7, 52) + c0575Ez.A03;
        }
    }

    private void A09() {
        if (!this.A03) {
            this.A03 = true;
            this.A05.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A05.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final InterfaceC0631Hd A0E(Context context) {
        return A04(new C0979Uw(context, (InterfaceC0651Hz<? super InterfaceC0632He>) null, A02()), A03());
    }

    public final void A0F(Uri uri, InterfaceC0856Qc interfaceC0856Qc, long j2) {
        this.A06.put(A01().A0O(new VV(uri, false, null, null)), new C0855Qb(interfaceC0856Qc, j2, null));
        A09();
    }
}
