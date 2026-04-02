package com.amazon.aps.iva.gx;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import com.amazon.aps.iva.ph.a;
/* compiled from: DownloadingRoutersFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.zv.e {
    public final com.amazon.aps.iva.ph.a a;

    public e(com.amazon.aps.iva.ph.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.zv.e
    public final c a(Activity activity) {
        return new c(activity);
    }

    @Override // com.amazon.aps.iva.zv.e
    public final d b(Activity activity) {
        return new d(activity);
    }

    @Override // com.amazon.aps.iva.zv.e
    public final a c(h hVar) {
        return new a(hVar);
    }

    @Override // com.amazon.aps.iva.zv.e
    public final com.amazon.aps.iva.xh.b d(Fragment fragment, com.amazon.aps.iva.vw.a aVar) {
        return a.C0616a.a(this.a, fragment, null, null, aVar, null, 22);
    }

    @Override // com.amazon.aps.iva.zv.e
    public final b f(h hVar) {
        return new b(hVar);
    }
}
