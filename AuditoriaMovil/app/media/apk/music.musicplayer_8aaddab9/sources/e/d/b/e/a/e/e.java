package e.d.b.e.a.e;

import android.content.Context;
import android.content.Intent;
import e.d.b.e.a.c.o;
/* loaded from: classes2.dex */
public final class e {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("ReviewService");

    /* renamed from: b  reason: collision with root package name */
    public final o<e.d.b.e.a.c.b> f7019b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7020c;

    public e(Context context) {
        this.f7020c = context.getPackageName();
        this.f7019b = new o<>(context, a, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), b.a);
    }
}
