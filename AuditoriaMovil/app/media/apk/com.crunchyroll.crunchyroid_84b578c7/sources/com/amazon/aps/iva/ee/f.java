package com.amazon.aps.iva.ee;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.auth.screen.OtpActivity;
/* compiled from: OtpResultContract.kt */
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.i.a<a, Integer> {
    @Override // com.amazon.aps.iva.i.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        a aVar = (a) obj;
        j.f(componentActivity, "context");
        j.f(aVar, "input");
        Intent intent = new Intent(componentActivity, OtpActivity.class);
        intent.putExtra("opt_phone_number", aVar.a);
        intent.putExtra("opt_is_sign_in", aVar.b);
        intent.addFlags(131072);
        return intent;
    }

    @Override // com.amazon.aps.iva.i.a
    public final Integer c(int i, Intent intent) {
        return Integer.valueOf(i);
    }
}
