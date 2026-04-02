package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Xf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1037Xf extends L7 {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8U A01;
    public final /* synthetic */ InterfaceC04328s A02;
    public final /* synthetic */ AnonymousClass90 A03;
    public final /* synthetic */ String A04;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-37, -3, 30, 27, 46, 32, -39, 28, 43, 26, 44, 33, -39, 27, 30, 28, 26, 46, 44, 30, -39, 44, -2, 39, 47, 34, 43, 40, 39, 38, 30, 39, 45, -3, 26, 45, 26, 9, 43, 40, 47, 34, 29, 30, 43, -39, 39, 40, 45, -39, 34, 39, 35, 30, 28, 45, 30, 29, -46, -24, -19, -22, -97, -24, -14, -97, -19, -12, -21, -21, -96, 30, 33, 33, 38, 49, 38, 44, 43, 30, 41, 28, 38, 43, 35, 44, 45, 66, 45, 53, 56, 45, 46, 56, 49, 43, 48, 53, 63, 55, 43, 63, 60, 45, 47, 49, 62, 60, 62, 67, 64, 104, 91, 89, 101, 104, 90, 85, 90, 87, 106, 87, 88, 87, 105, 91, -18, -31, -19, -15, -31, -17, -16, -37, -27, -32, 44, 46, 27, 45, 50, 41, 30, 49, 51, 32, 50, 55, 46, 35, 29, 33, 45, 34, 35};
    }

    public C1037Xf(C8U c8u, String str, int i2, AnonymousClass90 anonymousClass90, InterfaceC04328s interfaceC04328s) {
        this.A01 = c8u;
        this.A04 = str;
        this.A00 = i2;
        this.A03 = anonymousClass90;
        this.A02 = interfaceC04328s;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        String stackTrace;
        Map<String, String> A4S;
        String A6p;
        AtomicReference atomicReference;
        try {
            if (C04338t.A0J(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            C0695Jr.A08(this.A01, EnumC0687Jj.A0A.toString() + A00(0, 1, 41) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                stackTrace = M3.A03(this.A01, cause);
            } else if (JS.A0R(this.A01)) {
                stackTrace = M3.A03(this.A01, this.A03);
            } else {
                stackTrace = A00(0, 0, 106) + this.A03.getMessage();
            }
            if (JS.A0V(this.A01)) {
                A4S = this.A01.A02().A4S();
            } else if (this.A02 != null) {
                A4S = this.A02.A6W();
            } else if (C04338t.A02) {
                String message = A00(1, 57, 65);
                C04338t.A0F(new RuntimeException(message, this.A03));
                A4S = new HashMap<>();
            } else {
                A4S = this.A01.A02().A4S();
            }
            A4S.put(A00(SyslogConstants.LOG_LOCAL1, 7, 65), this.A04);
            A4S.put(A00(143, 12, 70), String.valueOf(this.A00));
            JSONObject A02 = this.A03.A02();
            if (A02 != null) {
                A4S.put(A00(71, 15, 69), A02.toString());
            }
            if ((A00(106, 5, 99).equals(this.A04) || A00(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 15, 126).equals(this.A04)) && (A6p = this.A01.A02().A6p()) != null) {
                A4S.put(A00(86, 20, 84), A6p);
            }
            String A0A = this.A01.A0A();
            if (A0A != null && !TextUtils.isEmpty(A0A)) {
                A4S.put(A00(126, 10, 4), A0A);
            }
            atomicReference = C04338t.A0A;
            C8r c8r = (C8r) atomicReference.get();
            if (c8r == null) {
                C04338t.A0F(new RuntimeException(A00(58, 13, 7)));
            } else {
                c8r.AFl(stackTrace, A4S, this.A01);
            }
        } catch (Throwable th) {
            C04338t.A0F(th);
        }
    }
}
