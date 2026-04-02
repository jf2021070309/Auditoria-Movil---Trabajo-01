package com.facebook.ads.redexgen.X;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Oz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0827Oz extends WebChromeClient {
    public static byte[] A01;
    public final /* synthetic */ P4 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-41, -44, -39, -48, -71, -32, -40, -51, -48, -35, 83, 75, 89, 89, 71, 77, 75, 68, 64, 70, 67, 52, 54, 26, 53};
    }

    public C0827Oz(P4 p4) {
        this.A00 = p4;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C0692Jo c0692Jo;
        C0820Or c0820Or;
        C1046Xo c1046Xo;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, 123), consoleMessage.message());
                jSONObject.put(A00(0, 10, 0), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            c0692Jo = this.A00.A0D;
            c0692Jo.A02(EnumC0691Jn.A0N, null);
            c0820Or = this.A00.A0E;
            c0820Or.A04(C04398z.A0v, jSONObject2);
            c1046Xo = this.A00.A0B;
            c1046Xo.A0D().A4y(jSONObject2);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
