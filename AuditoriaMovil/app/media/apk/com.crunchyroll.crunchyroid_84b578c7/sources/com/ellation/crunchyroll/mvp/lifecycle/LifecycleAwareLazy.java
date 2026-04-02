package com.ellation.crunchyroll.mvp.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: LifecycleAwareLazy.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/mvp/lifecycle/LifecycleAwareLazy;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/amazon/aps/iva/kb0/e;", "Ljava/io/Serializable;", "Lcom/amazon/aps/iva/i5/g;", "mvp_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LifecycleAwareLazy<T> implements e<T>, Serializable, g {
    public final o b;
    public final com.amazon.aps.iva.xb0.a<T> c;
    public Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleAwareLazy(o oVar, com.amazon.aps.iva.xb0.a<? extends T> aVar) {
        j.f(oVar, "owner");
        j.f(aVar, "initializer");
        this.b = oVar;
        this.c = aVar;
        this.d = com.amazon.aps.iva.cz.e.a;
    }

    public final o a() {
        o oVar = this.b;
        if (oVar instanceof Fragment) {
            oVar = ((Fragment) oVar).getViewLifecycleOwner();
        }
        j.e(oVar, "when (owner) {\n        i…      else -> owner\n    }");
        return oVar;
    }

    @Override // com.amazon.aps.iva.kb0.e
    public final T getValue() {
        if (this.d == com.amazon.aps.iva.cz.e.a) {
            this.d = this.c.invoke();
            if (a().getLifecycle().getCurrentState() != g.b.DESTROYED) {
                a().getLifecycle().addObserver(this);
            } else {
                throw new IllegalStateException("Initialization failed because lifecycle has been destroyed!");
            }
        }
        T t = (T) this.d;
        j.d(t, "null cannot be cast to non-null type T of com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy");
        return t;
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onDestroy(o oVar) {
        j.f(oVar, "owner");
        this.d = com.amazon.aps.iva.cz.e.a;
        a().getLifecycle().removeObserver(this);
    }

    public final String toString() {
        return this.d.toString();
    }
}
