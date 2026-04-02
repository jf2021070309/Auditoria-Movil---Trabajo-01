package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.cM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1252cM implements C2I {
    public final SharedPreferences.Editor A00;

    public C1252cM(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final void A3M() {
        this.A00.apply();
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final C2I ADO(String str, long j2) {
        this.A00.putLong(str, j2);
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final C2I ADP(String str, @Nullable String str2) {
        this.A00.putString(str, str2);
        return this;
    }
}
