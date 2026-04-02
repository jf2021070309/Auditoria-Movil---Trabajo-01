package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.cL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1251cL implements C2J {
    public final SharedPreferences A00;

    public C1251cL(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    public final C2I A56() {
        return new C1252cM(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    public final long A6t(String str, long j2) {
        return this.A00.getLong(str, j2);
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    @Nullable
    public final String A7b(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
