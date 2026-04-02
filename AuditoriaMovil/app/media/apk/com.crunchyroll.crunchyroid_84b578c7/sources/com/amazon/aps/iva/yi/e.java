package com.amazon.aps.iva.yi;

import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.xb0.p;
import com.crunchyroll.onboarding.OnboardingV2Activity;
/* compiled from: OnboardingV2Feature.kt */
/* loaded from: classes.dex */
public final class e implements com.crunchyroll.onboarding.d {
    public final p<Context, o, f> a;
    public final com.amazon.aps.iva.xb0.l<o, d> b;
    public final com.amazon.aps.iva.xb0.l<o, n> c;
    public final com.amazon.aps.iva.xb0.a<Boolean> d;
    public final com.amazon.aps.iva.wh.f e;
    public final com.amazon.aps.iva.uh.a f;

    public e(com.amazon.aps.iva.mx.a aVar, com.amazon.aps.iva.mx.b bVar, com.amazon.aps.iva.mx.c cVar, com.amazon.aps.iva.mx.d dVar, com.amazon.aps.iva.wh.f fVar, com.amazon.aps.iva.uh.a aVar2) {
        this.a = aVar;
        this.b = bVar;
        this.c = cVar;
        this.d = dVar;
        this.e = fVar;
        this.f = aVar2;
    }

    @Override // com.crunchyroll.onboarding.d
    public final void a(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        int i = OnboardingV2Activity.o;
        context.startActivity(new Intent(context, OnboardingV2Activity.class));
    }
}
