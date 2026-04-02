package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;
/* loaded from: assets/audience_network.dex */
public class E4 extends AbstractC1042Xk<String> {
    public static byte[] A08;
    public static String[] A09 = {"l", "T0JdG9ZEnLfTeCeftC9G7d8cUsVG3XZb", "aLcPLzyPnyiGnlL0eBnocVG2Im", "W3EwFUE7CvVeZV", "t2q4fu0Y0bIBimY2SigNyotMmunbmEsF", "TUpEXXUjgi8xLksArOVlucAVZCM", "AqOn5F5Mae0spU5kh0gbanyLcs", "chqW8UrgIl8Ef4OOKimE4h"};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C04218d A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{-112, -115, -96, -115, -114, -115, -97, -111};
    }

    static {
        A02();
    }

    public E4(C04218d c04218d, String str, String str2, int i2, double d2, double d3, String str3, Map map) {
        this.A03 = c04218d;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i2;
        this.A01 = d2;
        this.A00 = d3;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC04238g
    @Nullable
    /* renamed from: A00 */
    public final String A03() {
        C1045Xn c1045Xn;
        Lock lock;
        C1045Xn c1045Xn2;
        Lock lock2;
        C1045Xn c1045Xn3;
        Lock lock3;
        C1045Xn c1045Xn4;
        C1044Xm c1044Xm;
        C1043Xl c1043Xl;
        C1045Xn c1045Xn5;
        Lock lock4;
        String A01 = A01(0, 8, 12);
        c1045Xn = this.A03.A01;
        c1045Xn.A06().A8F(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        lock = C04218d.A08;
        lock.lock();
        String[] strArr = A09;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[1] = "mqnyRlomjFPPGlBu5iJ3A4HRnrnsorAH";
        strArr2[4] = "vLAqNnzkqKgbXCY8NZfbbPBhHyGRm9s6";
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.A03.A0E();
                sQLiteDatabase.beginTransaction();
                c1044Xm = this.A03.A02;
                c1043Xl = this.A03.A03;
                String A0E = c1044Xm.A0E(c1043Xl.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e2) {
                        c1045Xn5 = this.A03.A01;
                        c1045Xn5.A06().A8y(A01, C04398z.A0q, new AnonymousClass90(e2));
                    }
                }
                lock4 = C04218d.A08;
                String[] strArr3 = A09;
                String str = strArr3[0];
                String eventId = strArr3[3];
                if (str.length() != eventId.length()) {
                    String[] strArr4 = A09;
                    strArr4[6] = "euwrYX6ZBvkkPfbLG6LTpx3NDj";
                    strArr4[2] = "qLYaMtYi2WKu9oTuT6ElhKmpF4";
                    lock4.unlock();
                    return A0E;
                }
                throw new RuntimeException();
            } catch (Exception e3) {
                A01(EnumC04228f.A06);
                c1045Xn2 = this.A03.A01;
                c1045Xn2.A06().A8y(A01, C04398z.A0p, new AnonymousClass90(e3));
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e4) {
                        c1045Xn3 = this.A03.A01;
                        c1045Xn3.A06().A8y(A01, C04398z.A0q, new AnonymousClass90(e4));
                    }
                }
                lock2 = C04218d.A08;
                lock2.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception e5) {
                    c1045Xn4 = this.A03.A01;
                    c1045Xn4.A06().A8y(A01, C04398z.A0q, new AnonymousClass90(e5));
                }
            }
            lock3 = C04218d.A08;
            lock3.unlock();
            throw th;
        }
    }
}
