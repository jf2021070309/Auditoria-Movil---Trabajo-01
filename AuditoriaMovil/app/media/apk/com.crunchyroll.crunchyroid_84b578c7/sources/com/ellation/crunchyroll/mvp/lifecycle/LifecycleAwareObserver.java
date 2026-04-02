package com.ellation.crunchyroll.mvp.lifecycle;

import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: LifecycleAwareState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/mvp/lifecycle/LifecycleAwareObserver;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/amazon/aps/iva/i5/g;", "mvp_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class LifecycleAwareObserver<T> implements g {
    public final androidx.lifecycle.g b;
    public final l<T, q> c;
    public T d;

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleAwareObserver(androidx.lifecycle.g gVar, l<? super T, q> lVar) {
        j.f(gVar, "lifecycle");
        this.b = gVar;
        this.c = lVar;
        gVar.addObserver(this);
    }

    public abstract void a();

    @Override // com.amazon.aps.iva.i5.g
    public final void onDestroy(o oVar) {
        j.f(oVar, "owner");
        a();
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onResume(o oVar) {
        T t = this.d;
        if (t != null) {
            if (this.b.getCurrentState().isAtLeast(g.b.RESUMED)) {
                this.c.invoke(t);
                this.d = null;
                return;
            }
            this.d = t;
        }
    }
}
