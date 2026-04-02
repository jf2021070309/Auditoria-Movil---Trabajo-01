package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.Nullable;
import ch.qos.logback.core.net.SyslogConstants;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;
@SuppressLint({"HardcodedIPAddressUse"})
/* renamed from: com.facebook.ads.redexgen.X.cr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1281cr implements Ki {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C02400s A0G = null;
    @SuppressLint({"StaticFieldLeak"})
    public static final C0711Kj A0H = null;
    public static final String A0I;
    @Nullable
    public InterfaceC02350n A00;
    @Nullable
    public InterfaceC02350n A01;
    @Nullable
    public C9H A04;
    @Nullable
    public C0709Kg A05;
    @Nullable
    public AbstractC02360o A06;
    public final C02641q A07;
    public final InterfaceC0684Jg A08;
    public final C02400s A09;
    public final C0711Kj A0A;
    public final C1046Xo A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    @Nullable
    public String A02 = null;

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, Byte.MAX_VALUE, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 62, 25, 17, 20, 29, 28, 88, 12, 23, 88, 17, 22, 17, 12, 17, 25, 20, 17, 2, 29, 88, 59, 23, 23, 19, 17, 29, 53, 25, 22, 25, 31, 29, 10, 86, 34, 3, 76, 1, 3, 30, 9, 76, 13, 8, 76, 15, 13, 2, 8, 5, 8, 13, 24, 9, 31, 66, 88, 125, 96, 97, 104, 47, 110, 107, 110, Byte.MAX_VALUE, 123, 106, 125, 47, 123, 118, Byte.MAX_VALUE, 106, 33, 42, 47, 107, 42, 39, 57, 46, 42, 47, 50, 107, 56, 63, 42, 57, 63, 46, 47, 76, 93, 68, 44, 59, 91, 94, 75, 94, 112, 93, 85, 90, 92, 75, 31, 86, 76, 31, 81, 74, 83, 83, 48, 59, 54, 39, 44, 37, 33, 48, 49, 10, 60, 49, 28, 23, 15, 16, 11, 22, 23, 20, 28, 23, 13, 89, 16, 10, 89, 28, 20, 9, 13, 0, 73, 93, 74, 94, 90, 74, 65, 76, 86, 112, 76, 78, 95, 95, 70, 65, 72, 71, 64, 88, 79, 66, 71, 74, 14, 94, 66, 79, 77, 75, 67, 75, 64, 90, 14, 71, 64, 14, 92, 75, 93, 94, 65, 64, 93, 75, 47, 44, 34, 39, 28, 55, 42, 46, 38, 28, 46, 48, 109, 122, 110, 106, 122, 108, 107, 64, 118, 123};
    }

    public abstract void A0J();

    public abstract void A0L(InterfaceC02350n interfaceC02350n, C9H c9h, C9F c9f, C02651r c02651r);

    static {
        A07();
        MN.A02();
        A0I = AbstractC1281cr.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC1281cr(C1046Xo c1046Xo, C02641q c02641q) {
        this.A0B = c1046Xo;
        this.A07 = c02641q;
        C0711Kj c0711Kj = A0H;
        if (c0711Kj != null) {
            this.A0A = c0711Kj;
        } else {
            this.A0A = new C0711Kj(this.A0B);
        }
        this.A0A.A0P(this);
        C02400s c02400s = A0G;
        if (c02400s != null) {
            this.A09 = c02400s;
        } else {
            this.A09 = new C02400s();
        }
        if (JQ.A0m(this.A0B)) {
            try {
                CookieManager.getInstance();
                if (Build.VERSION.SDK_INT < 21) {
                    CookieSyncManager.createInstance(this.A0B);
                }
            } catch (Exception e2) {
                Log.w(A0I, A06(48, 35, SyslogConstants.LOG_ALERT), e2);
            }
        }
        DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A08 = c1046Xo.A08();
        this.A0B.A0D().A4W();
    }

    private void A08(C0946To c0946To) {
        C9H A00 = c0946To.A00();
        if (A00 == null || A00.A05() == null) {
            String A06 = A06(214, 29, 38);
            KG kg = new KG(AdErrorType.NO_AD_PLACEMENT, A06);
            this.A0B.A0D().A4Y(kg.A03().getErrorCode(), A06);
            AbstractC02360o abstractC02360o = this.A06;
            if (abstractC02360o != null) {
                abstractC02360o.A0G(kg);
                return;
            }
            return;
        }
        this.A04 = A00;
        this.A00 = null;
        C9H c9h = this.A04;
        C9F A04 = c9h.A04();
        String A062 = A06(0, 0, 73);
        if (A04 == null) {
            KG A01 = KG.A01(AdErrorType.NO_FILL, A062);
            this.A0B.A0D().A4Y(A01.A03().getErrorCode(), A06(83, 22, 100));
            AbstractC02360o abstractC02360o2 = this.A06;
            if (abstractC02360o2 != null) {
                abstractC02360o2.A0G(A01);
                return;
            }
            return;
        }
        String A02 = A04.A02();
        InterfaceC02350n A002 = this.A09.A00(this.A0B, c9h.A05().A0D());
        if (A002 == null) {
            this.A0B.A06().A8y(A06(142, 3, 37), C04398z.A0S, new AnonymousClass90(A06(0, 22, 2), A02));
            AAh(KG.A00(AdErrorType.INTERNAL_ERROR));
            return;
        }
        AdPlacementType A003 = this.A07.A00();
        AdPlacementType adapterType = A002.A7A();
        if (A003 != adapterType) {
            KG A012 = KG.A01(AdErrorType.INTERNAL_ERROR, A062);
            this.A0B.A0D().A4Y(A012.A03().getErrorCode(), A06(105, 19, 7));
            AbstractC02360o abstractC02360o3 = this.A06;
            if (abstractC02360o3 != null) {
                abstractC02360o3.A0G(A012);
                return;
            }
            return;
        }
        this.A00 = A002;
        C9I A05 = c9h.A05();
        if (A05.A0F()) {
            this.A0B.A0D().AEH();
        }
        JSONObject A042 = A04.A04();
        if (A042 != null) {
            String optString = A042.optString(A06(255, 10, 23));
            String[] strArr = A0E;
            if (strArr[7].charAt(9) == strArr[3].charAt(9)) {
                throw new RuntimeException();
            }
            A0E[2] = "1RuNmZl7KBFjFJZQKSNoNNdaOG7UEv1P";
            this.A0B.A0D().AEm(optString);
            this.A0B.A0B(optString);
            C1045Xn A004 = C8T.A00();
            if (A004 != null) {
                A004.A0B(optString);
            }
            String requestId = A06(197, 17, 39);
            A0A(A042.optJSONObject(requestId));
            C02651r c02651r = new C02651r(A042, A05, this.A07.A08, A05.A0C());
            if (this.A05 == null) {
                String A063 = A06(177, 20, 113);
                KG A013 = KG.A01(AdErrorType.UNKNOWN_ERROR, A063);
                this.A0B.A0D().A4Y(A013.A03().getErrorCode(), A063);
                AbstractC02360o abstractC02360o4 = this.A06;
                if (abstractC02360o4 != null) {
                    abstractC02360o4.A0G(A013);
                    return;
                }
                return;
            }
            A0L(A002, c9h, A04, c02651r);
            return;
        }
        String A064 = A06(147, 18, 55);
        KG error = KG.A01(AdErrorType.UNKNOWN_ERROR, A064);
        this.A0B.A0D().A4Y(error.A03().getErrorCode(), A064);
        AbstractC02360o abstractC02360o5 = this.A06;
        if (abstractC02360o5 != null) {
            abstractC02360o5.A0G(error);
        }
    }

    private final void A09(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        this.A0B.A0D().A4Z(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            AAh(new KG(AdErrorType.API_NOT_SUPPORTED, A06(0, 0, 73)));
            return;
        }
        try {
            this.A05 = this.A07.A01(this.A0B, new KQ(this.A0B, str, this.A07.A08, this.A07.A07), adExperienceType);
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            this.A0A.A0O(this.A05);
        } catch (KH e2) {
            AAh(KG.A02(e2));
        }
    }

    private void A0A(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A06(165, 12, 93));
            C02420u.A0G(jSONObject);
        }
    }

    public final long A0B() {
        C9H c9h = this.A04;
        if (c9h != null) {
            return c9h.A03();
        }
        return -1L;
    }

    public final Handler A0C() {
        return A0F;
    }

    @Nullable
    public final C9I A0D() {
        C9H c9h = this.A04;
        if (c9h == null) {
            return null;
        }
        return c9h.A05();
    }

    @Nullable
    public final String A0E() {
        InterfaceC02350n interfaceC02350n = this.A01;
        if (interfaceC02350n == null) {
            return null;
        }
        return interfaceC02350n.A64();
    }

    public final void A0F() {
        String A64;
        this.A0B.A0D().A2e(MC.A01(this.A03));
        InterfaceC02350n interfaceC02350n = this.A01;
        if (interfaceC02350n == null || (A64 = interfaceC02350n.A64()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A06(243, 12, 75), MC.A04(this.A03));
        new C0692Jo(A64, this.A08).A02(EnumC0691Jn.A08, hashMap);
    }

    public final void A0G() {
        InterfaceC02350n interfaceC02350n = this.A01;
        String A06 = A06(142, 3, 37);
        if (interfaceC02350n == null) {
            String A062 = A06(22, 26, 7);
            this.A0B.A06().A8y(A06, C04398z.A0I, new AnonymousClass90(A062));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0D().A4Y(adErrorType.getErrorCode(), A062);
            AbstractC02360o abstractC02360o = this.A06;
            if (abstractC02360o != null) {
                abstractC02360o.A0G(KG.A01(adErrorType, adErrorType.getDefaultErrorMessage()));
            }
            this.A0B.A0D().A4b();
        } else if (this.A0C) {
            String A063 = A06(124, 18, 67);
            this.A0B.A06().A8y(A06, C04398z.A0E, new AnonymousClass90(A063));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0D().A4Y(adErrorType2.getErrorCode(), A063);
            AbstractC02360o abstractC02360o2 = this.A06;
            if (abstractC02360o2 != null) {
                abstractC02360o2.A0G(KG.A01(adErrorType2, adErrorType2.getDefaultErrorMessage()));
            }
            this.A0B.A0D().A4a();
        } else {
            if (!TextUtils.isEmpty(this.A01.A64())) {
                this.A08.A9H(this.A01.A64());
            }
            this.A0B.A0D().A4c();
            this.A0C = true;
            A0J();
        }
    }

    public final void A0H() {
        A0R(false);
    }

    public final void A0I() {
        String str = this.A02;
        if (str != null) {
            C02420u.A0D(str);
        }
    }

    public final void A0K(@Nullable InterfaceC02350n interfaceC02350n) {
        if (interfaceC02350n != null) {
            interfaceC02350n.onDestroy();
        }
    }

    public final void A0M(AbstractC02360o abstractC02360o) {
        this.A06 = abstractC02360o;
    }

    public final void A0N(C02651r c02651r) {
        this.A0B.A0D().A4V();
        String optString = c02651r.A03().optString(A06(145, 2, 71));
        if (!TextUtils.isEmpty(optString)) {
            new C0692Jo(optString, this.A08).A02(EnumC0691Jn.A04, null);
        }
    }

    public void A0O(@Nullable String str) {
        A09(str, null);
    }

    public final void A0P(@Nullable String str) {
        A0O(str);
    }

    public final void A0Q(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        A09(str, adExperienceType);
    }

    public void A0R(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0D().A4d();
        A0K(this.A01);
        this.A0C = false;
    }

    public final boolean A0S() {
        C9H c9h = this.A04;
        return c9h == null || c9h.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.Ki
    public final synchronized void AAh(KG kg) {
        A0C().post(new C1282cs(this, kg));
    }

    @Override // com.facebook.ads.redexgen.X.Ki
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void ACP(C0946To c0946To) {
        try {
            A08(c0946To);
        } catch (Exception e2) {
            this.A0B.A06().A8y(A06(142, 3, 37), C04398z.A0L, new AnonymousClass90(e2));
        }
    }
}
