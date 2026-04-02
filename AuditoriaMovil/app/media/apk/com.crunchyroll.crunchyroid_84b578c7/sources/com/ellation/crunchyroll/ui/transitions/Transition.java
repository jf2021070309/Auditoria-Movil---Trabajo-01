package com.ellation.crunchyroll.ui.transitions;

import android.view.View;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0012\u0010\fR\u0018\u0010\n\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/ellation/crunchyroll/ui/transitions/Transition;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "viwModelIn", "viewModelOut", "Lcom/amazon/aps/iva/kb0/q;", "setUpViews", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "transitionProgress", "viewModelIn", "update", "(FLjava/lang/Object;Ljava/lang/Object;)V", "model", "Landroid/view/View;", "provideViewIn", "(Ljava/lang/Object;)Landroid/view/View;", "provideViewOut", "modifyView", "Ljava/lang/Object;", "viewIn", "Landroid/view/View;", "getViewIn", "()Landroid/view/View;", "setViewIn", "(Landroid/view/View;)V", "viewOut", "getViewOut", "setViewOut", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class Transition<T> {
    public static final int $stable = 8;
    private View viewIn;
    private T viewModelIn;
    private T viewModelOut;
    private View viewOut;

    private final void setUpViews(T t, T t2) {
        if (!j.a(this.viewModelIn, t)) {
            this.viewIn = provideViewIn(t);
        }
        if (!j.a(this.viewModelOut, t2)) {
            this.viewOut = provideViewOut(t2);
        }
    }

    public final View getViewIn() {
        return this.viewIn;
    }

    public final View getViewOut() {
        return this.viewOut;
    }

    public abstract void modifyView(float f, T t, T t2);

    public abstract View provideViewIn(T t);

    public abstract View provideViewOut(T t);

    public final void setViewIn(View view) {
        this.viewIn = view;
    }

    public final void setViewOut(View view) {
        this.viewOut = view;
    }

    public void update(float f, T t, T t2) {
        setUpViews(t, t2);
        modifyView(Math.min(f, 100.0f), t, t2);
    }
}
