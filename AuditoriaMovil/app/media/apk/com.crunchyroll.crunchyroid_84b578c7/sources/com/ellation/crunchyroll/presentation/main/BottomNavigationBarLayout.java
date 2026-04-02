package com.ellation.crunchyroll.presentation.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.cx.m;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.jm.s;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.v10.j;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.y30.e0;
import com.amazon.aps.iva.y30.n0;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.application.e;
import com.ellation.crunchyroll.presentation.main.c;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: BottomNavigationBarLayout.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001b\u0010\u001d\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001b\u0010 \u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001b\u0010#\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/ellation/crunchyroll/presentation/main/BottomNavigationBarLayout;", "Landroid/widget/LinearLayout;", "Lcom/ellation/crunchyroll/presentation/main/b;", "Lcom/ellation/crunchyroll/presentation/main/c$a;", "uiModel", "Lcom/amazon/aps/iva/kb0/q;", "setAccountUiModel", "Lcom/amazon/aps/iva/v10/j;", "b", "Lcom/amazon/aps/iva/v10/j;", "getOnTabSelectedListener", "()Lcom/amazon/aps/iva/v10/j;", "setOnTabSelectedListener", "(Lcom/amazon/aps/iva/v10/j;)V", "onTabSelectedListener", "Lcom/ellation/crunchyroll/presentation/main/BottomNavigationTabItemLayout;", "d", "Lcom/amazon/aps/iva/bc0/b;", "getHomeTab", "()Lcom/ellation/crunchyroll/presentation/main/BottomNavigationTabItemLayout;", "homeTab", "e", "getMyListsTab", "myListsTab", "f", "getBrowseTab", "browseTab", "g", "getSimulcastTab", "simulcastTab", "h", "getCrStoreTab", "crStoreTab", "i", "getSettingsTab", "settingsTab", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BottomNavigationBarLayout extends LinearLayout implements b {
    public static final /* synthetic */ l<Object>[] k = {q.a(BottomNavigationBarLayout.class, "homeTab", "getHomeTab()Lcom/ellation/crunchyroll/presentation/main/BottomNavigationTabItemLayout;", 0), q.a(BottomNavigationBarLayout.class, "myListsTab", "getMyListsTab()Lcom/ellation/crunchyroll/presentation/main/BottomNavigationTabItemLayout;", 0), q.a(BottomNavigationBarLayout.class, "browseTab", "getBrowseTab()Lcom/ellation/crunchyroll/presentation/main/BottomNavigationTabItemLayout;", 0), q.a(BottomNavigationBarLayout.class, "simulcastTab", "getSimulcastTab()Lcom/ellation/crunchyroll/presentation/main/BottomNavigationTabItemLayout;", 0), q.a(BottomNavigationBarLayout.class, "crStoreTab", "getCrStoreTab()Lcom/ellation/crunchyroll/presentation/main/BottomNavigationTabItemLayout;", 0), q.a(BottomNavigationBarLayout.class, "settingsTab", "getSettingsTab()Lcom/ellation/crunchyroll/presentation/main/BottomNavigationTabItemLayout;", 0)};
    public j b;
    public final Map<Integer, BottomNavigationTabItemLayout> c;
    public final v d;
    public final v e;
    public final v f;
    public final v g;
    public final v h;
    public final v i;
    public final a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.d = g.c(R.id.tab_home, this);
        this.e = g.c(R.id.tab_my_lists, this);
        this.f = g.c(R.id.tab_browse, this);
        this.g = g.c(R.id.tab_simulcast, this);
        this.h = g.c(R.id.tab_cr_store, this);
        this.i = g.c(R.id.tab_settings, this);
        View.inflate(context, R.layout.layout_bottom_navigation_bar, this);
        Map<Integer, BottomNavigationTabItemLayout> U = i0.U(new com.amazon.aps.iva.kb0.j(0, getHomeTab()), new com.amazon.aps.iva.kb0.j(1, getMyListsTab()), new com.amazon.aps.iva.kb0.j(2, getBrowseTab()), new com.amazon.aps.iva.kb0.j(3, getSimulcastTab()), new com.amazon.aps.iva.kb0.j(32, getCrStoreTab()), new com.amazon.aps.iva.kb0.j(4, getSettingsTab()));
        for (Map.Entry<Integer, BottomNavigationTabItemLayout> entry : U.entrySet()) {
            entry.getValue().setOnClickListener(new s(2, this, entry));
        }
        this.c = U;
        n0 c = ((e0.a) context).mh().c();
        boolean hasSystemFeature = k.n(context).a.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
        m.b.getClass();
        m a = m.a.a();
        boolean a2 = ((d0) e.a()).B.a();
        com.amazon.aps.iva.yb0.j.f(c, "settingsViewModel");
        this.j = new a(this, c, a, a2, hasSystemFeature);
        com.amazon.aps.iva.yb0.j.f(getSettingsTab(), "button");
    }

    private final BottomNavigationTabItemLayout getBrowseTab() {
        return (BottomNavigationTabItemLayout) this.f.getValue(this, k[2]);
    }

    private final BottomNavigationTabItemLayout getCrStoreTab() {
        return (BottomNavigationTabItemLayout) this.h.getValue(this, k[4]);
    }

    private final BottomNavigationTabItemLayout getHomeTab() {
        return (BottomNavigationTabItemLayout) this.d.getValue(this, k[0]);
    }

    private final BottomNavigationTabItemLayout getMyListsTab() {
        return (BottomNavigationTabItemLayout) this.e.getValue(this, k[1]);
    }

    private final BottomNavigationTabItemLayout getSettingsTab() {
        return (BottomNavigationTabItemLayout) this.i.getValue(this, k[5]);
    }

    private final BottomNavigationTabItemLayout getSimulcastTab() {
        return (BottomNavigationTabItemLayout) this.g.getValue(this, k[3]);
    }

    @Override // com.ellation.crunchyroll.presentation.main.b
    public final void Db() {
        getSettingsTab().b();
    }

    @Override // com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    public final j getOnTabSelectedListener() {
        return this.b;
    }

    @Override // com.ellation.crunchyroll.presentation.main.b
    public final void o7() {
        getCrStoreTab().setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.ellation.crunchyroll.mvp.lifecycle.a.a(this.j, this);
    }

    @Override // com.ellation.crunchyroll.presentation.main.b
    public void setAccountUiModel(c.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "uiModel");
        getSettingsTab().setAccountUiModel(aVar);
    }

    public final void setOnTabSelectedListener(j jVar) {
        this.b = jVar;
    }

    @Override // com.ellation.crunchyroll.presentation.main.b
    public final void va() {
        getSettingsTab().a();
    }

    @Override // com.ellation.crunchyroll.presentation.main.b
    public final void ve() {
        getSimulcastTab().setVisibility(8);
    }

    @Override // com.ellation.crunchyroll.presentation.main.b
    public final void za() {
        getSimulcastTab().setVisibility(0);
    }

    @Override // com.ellation.crunchyroll.presentation.main.b
    public final void ze() {
        getCrStoreTab().setVisibility(8);
    }
}
