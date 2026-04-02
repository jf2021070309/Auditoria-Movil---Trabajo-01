package com.amazon.aps.iva.e;

import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: OnBackPressedCallback.kt */
/* loaded from: classes.dex */
public abstract class m {
    private final CopyOnWriteArrayList<c> cancellables = new CopyOnWriteArrayList<>();
    private com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> enabledChangedCallback;
    private boolean isEnabled;

    public m(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "cancellable");
        this.cancellables.add(cVar);
    }

    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "backEvent");
    }

    public void handleOnBackStarted(b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        for (c cVar : this.cancellables) {
            cVar.cancel();
        }
    }

    public final void removeCancellable(c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "cancellable");
        this.cancellables.remove(cVar);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = this.enabledChangedCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        this.enabledChangedCallback = aVar;
    }

    public void handleOnBackCancelled() {
    }
}
