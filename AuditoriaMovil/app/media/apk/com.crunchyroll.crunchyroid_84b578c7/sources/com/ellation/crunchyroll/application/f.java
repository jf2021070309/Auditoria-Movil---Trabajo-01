package com.ellation.crunchyroll.application;

import android.content.Context;
import com.amazon.aps.iva.ct.j;
import com.amazon.aps.iva.ct.k;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: BenefitsStoreExtension.kt */
/* loaded from: classes2.dex */
public final class f {
    public static k a(com.amazon.aps.iva.ya0.f fVar, int i) {
        String str;
        Context context = fVar;
        if ((i & 1) != 0) {
            CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
            context = CrunchyrollApplication.a.a();
        }
        if ((i & 2) != 0) {
            com.amazon.aps.iva.ts.b.a.getClass();
            str = com.amazon.aps.iva.ts.a.e;
        } else {
            str = null;
        }
        j.f(context, "context");
        j.f(str, "environment");
        k kVar = j.a.a;
        if (kVar == null) {
            k kVar2 = new k(context, str);
            j.a.a = kVar2;
            return kVar2;
        }
        return kVar;
    }
}
