package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
/* loaded from: assets/audience_network.dex */
public final class KG {
    public final AdErrorType A00;
    public final String A01;

    public KG(int i2, String str) {
        this(AdErrorType.adErrorTypeFromCode(i2), str);
    }

    public KG(AdErrorType adErrorType, @Nullable String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static KG A00(AdErrorType adErrorType) {
        return new KG(adErrorType, (String) null);
    }

    public static KG A01(AdErrorType adErrorType, @Nullable String str) {
        return new KG(adErrorType, str);
    }

    public static KG A02(KH kh) {
        return new KG(kh.A00(), kh.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
