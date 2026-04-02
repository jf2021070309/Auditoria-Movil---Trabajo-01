package com.amazon.aps.iva.mh;

import android.content.Context;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: AppLegalInfoRouter.kt */
/* loaded from: classes.dex */
public final class f implements e, com.amazon.aps.iva.k50.b {
    public final Context b;
    public final g c;
    public final /* synthetic */ com.amazon.aps.iva.k50.c d;

    public f(Context context, g gVar) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.b = context;
        this.c = gVar;
        this.d = new com.amazon.aps.iva.k50.c(context, "");
    }

    @Override // com.amazon.aps.iva.mh.e
    public final void a() {
        String b = this.c.b();
        Context context = this.b;
        String string = context.getString(R.string.privacy_policy);
        String string2 = context.getString(R.string.privacy_policy_open_fallback_dialog_message);
        com.amazon.aps.iva.yb0.j.e(string2, "getString(R.string.priva…_fallback_dialog_message)");
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.privacy_policy)");
        s1(b, string2, string);
    }

    @Override // com.amazon.aps.iva.mh.e
    public final void b() {
        String a = this.c.a();
        Context context = this.b;
        String string = context.getString(R.string.terms_of_service);
        String string2 = context.getString(R.string.terms_of_service_open_fallback_dialog_message);
        com.amazon.aps.iva.yb0.j.e(string2, "getString(R.string.terms…_fallback_dialog_message)");
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.terms_of_service)");
        s1(a, string2, string);
    }

    @Override // com.amazon.aps.iva.k50.b
    public final void r1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        this.d.r1(str);
    }

    @Override // com.amazon.aps.iva.k50.b
    public final void s1(String str, String str2, String str3) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        this.d.s1(str, str2, str3);
    }
}
