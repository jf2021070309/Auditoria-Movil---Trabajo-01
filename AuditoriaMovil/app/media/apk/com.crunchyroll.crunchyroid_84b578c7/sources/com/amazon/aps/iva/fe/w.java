package com.amazon.aps.iva.fe;

import com.amazon.aps.iva.ab0.d;
import com.crunchyroll.auth.screen.OtpActivity;
/* compiled from: PhoneNumberFormatter.kt */
/* loaded from: classes.dex */
public final class w implements v {
    public final com.amazon.aps.iva.ab0.d a;

    public w(OtpActivity otpActivity) {
        this.a = com.amazon.aps.iva.ab0.d.b(otpActivity);
    }

    @Override // com.amazon.aps.iva.fe.v
    public final String a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "phoneNumber");
        try {
            com.amazon.aps.iva.ab0.d dVar = this.a;
            String d = dVar.d(dVar.l(str, null), d.b.INTERNATIONAL);
            com.amazon.aps.iva.yb0.j.e(d, "{\n            phoneNumbe…L\n            )\n        }");
            return d;
        } catch (com.amazon.aps.iva.ab0.c unused) {
            return str;
        }
    }
}
