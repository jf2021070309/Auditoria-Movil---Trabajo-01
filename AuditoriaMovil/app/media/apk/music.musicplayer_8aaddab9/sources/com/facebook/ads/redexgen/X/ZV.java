package com.facebook.ads.redexgen.X;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public class ZV implements AnonymousClass72<String> {
    public final String A00;
    public final boolean A01;

    public ZV(String str) {
        this.A00 = str;
        this.A01 = ZU.A01().hasSystemFeature(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    /* renamed from: A00 */
    public final JSONObject AFG(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final boolean A8S(Object obj) {
        ZV zv = (ZV) obj;
        return this.A00.equals(zv.A00) && this.A01 == zv.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final int AEu() {
        return this.A00.getBytes().length + 8;
    }
}
