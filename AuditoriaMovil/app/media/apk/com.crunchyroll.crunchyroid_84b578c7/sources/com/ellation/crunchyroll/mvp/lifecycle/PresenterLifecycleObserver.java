package com.ellation.crunchyroll.mvp.lifecycle;

import com.amazon.aps.iva.i5.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: PresenterLifecycleObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ellation/crunchyroll/mvp/lifecycle/PresenterLifecycleObserver;", "Lcom/amazon/aps/iva/i5/g;", "mvp_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class PresenterLifecycleObserver implements g {
    public final k b;

    public PresenterLifecycleObserver(k kVar) {
        j.f(kVar, "presenter");
        this.b = kVar;
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onCreate(o oVar) {
        j.f(oVar, "owner");
        this.b.onCreate();
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onDestroy(o oVar) {
        j.f(oVar, "owner");
        k kVar = this.b;
        kVar.onPreDestroy();
        kVar.onDestroy();
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onPause(o oVar) {
        j.f(oVar, "owner");
        this.b.onPause();
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onResume(o oVar) {
        this.b.onResume();
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onStart(o oVar) {
        j.f(oVar, "owner");
        this.b.onStart();
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onStop(o oVar) {
        j.f(oVar, "owner");
        this.b.onStop();
    }
}
