package com.amazon.aps.iva.i;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class d extends a<Intent, com.amazon.aps.iva.h.a> {
    @Override // com.amazon.aps.iva.i.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Intent intent = (Intent) obj;
        j.f(componentActivity, "context");
        j.f(intent, "input");
        return intent;
    }

    @Override // com.amazon.aps.iva.i.a
    public final com.amazon.aps.iva.h.a c(int i, Intent intent) {
        return new com.amazon.aps.iva.h.a(i, intent);
    }
}
