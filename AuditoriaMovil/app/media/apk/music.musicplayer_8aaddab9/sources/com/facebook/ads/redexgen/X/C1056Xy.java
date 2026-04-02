package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Xy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1056Xy extends C7A<Long> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-41};
    }

    public C1056Xy(long j2, @Nullable AnonymousClass78 anonymousClass78, long j3) {
        super(j2, anonymousClass78, Long.valueOf(j3), AnonymousClass79.A09);
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final int A06() {
        return 8;
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 53), A07());
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.lang.Long> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final boolean A0A(C7A<Long> c7a) {
        return A07().equals(c7a.A07());
    }
}
