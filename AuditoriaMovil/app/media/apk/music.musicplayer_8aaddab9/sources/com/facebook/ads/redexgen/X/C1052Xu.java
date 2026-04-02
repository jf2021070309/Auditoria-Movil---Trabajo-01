package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Xu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1052Xu extends C7A<C03806g> {
    public C1052Xu(long j2, @Nullable AnonymousClass78 anonymousClass78, C03806g c03806g) {
        super(j2, anonymousClass78, c03806g, AnonymousClass79.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final int A06() {
        return A07().A09();
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        return A07().A0A(jSONObject);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.biometric.model.TouchSignalRawValue> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final boolean A0A(C7A<C03806g> c7a) {
        return A07().A0B(c7a.A07());
    }
}
