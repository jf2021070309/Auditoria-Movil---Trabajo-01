package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: assets/audience_network.dex */
public final class RF extends AsyncTask<String, Void, RG> {
    public static byte[] A05;
    public static String[] A06 = {"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    public static final String A07;
    public static final Set<String> A08;
    public C8U A00;
    public InterfaceC0874Qu A01;
    public RE A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{48, 0, 3, 57, 33, 22, 22, 11, 22, 68, 11, 20, 1, 10, 13, 10, 3, 68, 17, 22, 8, 94, 68, 122, 117, 122, 119, 116, 124, 44, 55, 46, 46};
    }

    static {
        A04();
        A07 = RF.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 73));
        A08.add(A01(29, 4, 24));
    }

    public RF(C8U c8u) {
        this(c8u, null, null);
    }

    public RF(C8U c8u, Map<String, String> map) {
        this(c8u, map, null);
    }

    public RF(C8U c8u, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        this.A00 = c8u;
        Map<String, String> postData = map != null ? new HashMap<>(map) : null;
        this.A03 = postData;
        Map<String, String> extraData = map2 != null ? new HashMap<>(map2) : null;
        this.A04 = extraData;
    }

    private final RG A00(String... strArr) {
        if (C0726Kz.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String A02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        String url = entry.getValue();
                        A02 = A03(A02, entry.getKey(), url);
                    }
                }
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    if (i2 > 2) {
                        return null;
                    }
                    if (A06(A02)) {
                        return new RG(this.A01);
                    }
                    i2 = i3;
                }
            }
            return null;
        } catch (Throwable th) {
            if (A06[6].length() != 31) {
                A06[6] = "dO3qGWbyMuVAZQTwO1X30zVxIjEEo";
                C0726Kz.A00(th, this);
                return null;
            }
            throw new RuntimeException();
        }
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), C0743Ls.A01(this.A00.A02().A5h()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String A01 = A01(3, 1, 92);
        if (str.contains(A01)) {
            A01 = A01(1, 1, 124);
        }
        return str + A01 + str2 + A01(2, 1, 100) + URLEncoder.encode(str3);
    }

    private final void A05(RG rg) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.ADL(rg);
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A06(String str) {
        InterfaceC0874Qu AD7;
        InterfaceC0875Qv A00 = RD.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                AD7 = A00.AD7(str, new R9());
            } else {
                R9 r9 = new R9();
                r9.A05(this.A04);
                AD7 = A00.AD8(str, r9.A08());
            }
            this.A01 = AD7;
        } catch (Exception e2) {
            String str2 = A07;
            Log.e(str2, A01(4, 19, 62) + str, e2);
        }
        InterfaceC0874Qu interfaceC0874Qu = this.A01;
        return interfaceC0874Qu != null && interfaceC0874Qu.A7Z() == 200;
    }

    public final void A07(RE re) {
        this.A02 = re;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ RG doInBackground(String[] strArr) {
        if (C0726Kz.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        RE re = this.A02;
        if (re != null) {
            re.ADJ();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(RG rg) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            A05(rg);
        } catch (Throwable th) {
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            C0726Kz.A00(th, this);
        }
    }
}
