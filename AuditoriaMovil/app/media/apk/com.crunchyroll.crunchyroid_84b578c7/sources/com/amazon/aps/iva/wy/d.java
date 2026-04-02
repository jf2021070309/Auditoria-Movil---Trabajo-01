package com.amazon.aps.iva.wy;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: BasePresenterDialog.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0013\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0004R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/amazon/aps/iva/wy/d;", "Landroidx/fragment/app/g;", "Lcom/amazon/aps/iva/wy/h;", "Lcom/amazon/aps/iva/cz/b;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/amazon/aps/iva/kb0/q;", "onViewCreated", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "", "result", "Ljava/io/Serializable;", "input", "setFragmentResult", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lcom/amazon/aps/iva/cz/c;", "register", "Lcom/amazon/aps/iva/cz/c;", "<init>", "(Ljava/lang/Integer;)V", "mvp_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class d extends androidx.fragment.app.g implements h, com.amazon.aps.iva.cz.b {
    public static final int $stable = 8;
    private final Integer layout;
    private final com.amazon.aps.iva.cz.c register;

    public d() {
        this(null, 1, null);
    }

    public static /* synthetic */ void setFragmentResult$default(d dVar, String str, Serializable serializable, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                serializable = null;
            }
            dVar.setFragmentResult(str, serializable);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFragmentResult");
    }

    public final Integer getLayout() {
        return this.layout;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        com.amazon.aps.iva.yb0.j.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        for (k kVar : this.register.b()) {
            kVar.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        Integer num = this.layout;
        if (num != null) {
            return layoutInflater.inflate(num.intValue(), viewGroup);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        com.amazon.aps.iva.cz.c cVar = this.register;
        k[] kVarArr = (k[]) setupPresenters().toArray(new k[0]);
        cVar.a((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
    }

    public final void setFragmentResult(String str, Serializable serializable) {
        com.amazon.aps.iva.yb0.j.f(str, "result");
        String tag = getTag();
        if (tag != null) {
            getParentFragmentManager().a0(com.amazon.aps.iva.k3.e.a(new com.amazon.aps.iva.kb0.j(str, serializable)), tag);
        }
    }

    public /* synthetic */ d(Integer num, int i, com.amazon.aps.iva.yb0.e eVar) {
        this((i & 1) != 0 ? null : num);
    }

    public d(Integer num) {
        this.layout = num;
        int i = com.amazon.aps.iva.cz.c.a;
        this.register = new com.amazon.aps.iva.cz.d(this);
    }
}
