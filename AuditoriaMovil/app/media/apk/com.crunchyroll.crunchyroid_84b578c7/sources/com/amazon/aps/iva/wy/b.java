package com.amazon.aps.iva.wy;

import android.content.Intent;
import android.content.res.Configuration;
import com.amazon.aps.iva.wy.h;
/* compiled from: BasePresenter.kt */
/* loaded from: classes2.dex */
public abstract class b<V extends h> implements k {
    public static final int $stable = 8;
    private final j[] interactors;
    private final V view;

    public b(V v, j... jVarArr) {
        com.amazon.aps.iva.yb0.j.f(v, "view");
        com.amazon.aps.iva.yb0.j.f(jVarArr, "interactors");
        this.view = v;
        this.interactors = jVarArr;
    }

    public final V getView() {
        return this.view;
    }

    @Override // com.amazon.aps.iva.wy.k
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.amazon.aps.iva.wy.k
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.amazon.aps.iva.wy.k
    public void onCreate() {
    }

    @Override // com.amazon.aps.iva.wy.k
    public void onDestroy() {
    }

    @Override // com.amazon.aps.iva.wy.k
    public void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
    }

    @Override // com.amazon.aps.iva.wy.k
    public void onPause() {
    }

    @Override // com.amazon.aps.iva.wy.k
    public void onPreDestroy() {
        for (j jVar : this.interactors) {
            jVar.cancelRunningApiCalls();
        }
    }

    @Override // com.amazon.aps.iva.wy.k
    public void onResume() {
    }

    @Override // com.amazon.aps.iva.wy.k
    public void onStart() {
    }

    @Override // com.amazon.aps.iva.wy.k
    public void onStop() {
    }
}
