package com.amazon.aps.iva.ln;

import android.app.Activity;
import android.content.Intent;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
/* compiled from: SingularLinkHandler.kt */
/* loaded from: classes2.dex */
public final class a implements w<Activity> {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> b;
    public final /* synthetic */ b c;

    public a(Intent intent, com.amazon.aps.iva.xb0.a<q> aVar, b bVar) {
        this.a = intent;
        this.b = aVar;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.i5.w
    public final void onChanged(Activity activity) {
        Activity activity2 = activity;
        if (activity2 != null) {
            activity2.startActivity(this.a);
            this.b.invoke();
            this.c.b.j(this);
        }
    }
}
