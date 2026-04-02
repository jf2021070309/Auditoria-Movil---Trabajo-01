package com.ellation.crunchyroll.presentation.main.lists.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.g;
import com.amazon.aps.iva.ct.j;
import com.amazon.aps.iva.ct.k;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.y10.i;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yb0.t;
import com.amazon.aps.iva.z10.c;
import com.ellation.crunchyroll.application.e;
import com.ellation.crunchyroll.application.f;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
/* compiled from: MyListsTabLayout.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/ellation/crunchyroll/presentation/main/lists/tabs/MyListsTabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/amazon/aps/iva/z10/c;", "Lcom/amazon/aps/iva/i5/o;", "Lcom/amazon/aps/iva/z10/a;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/z10/a;", "presenter", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MyListsTabLayout extends TabLayout implements c, o {
    public final i b;
    public final m c;

    /* compiled from: MyListsTabLayout.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<q> {
        public a(com.amazon.aps.iva.z10.a aVar) {
            super(0, aVar, com.amazon.aps.iva.z10.a.class, "updateOfflineTabIcon", "updateOfflineTabIcon()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ((com.amazon.aps.iva.z10.a) this.receiver).w0();
            return q.a;
        }
    }

    /* compiled from: MyListsTabLayout.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.z10.a> {
        public b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.ellation.crunchyroll.presentation.main.lists.tabs.a] */
        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.z10.a invoke() {
            final k a = f.a(null, 3);
            ?? r0 = new t(a) { // from class: com.ellation.crunchyroll.presentation.main.lists.tabs.a
                @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                public final Object get() {
                    return Boolean.valueOf(((j) this.receiver).r());
                }
            };
            MyListsTabLayout myListsTabLayout = MyListsTabLayout.this;
            com.amazon.aps.iva.yb0.j.f(myListsTabLayout, "view");
            com.amazon.aps.iva.z10.b bVar = new com.amazon.aps.iva.z10.b(myListsTabLayout, r0);
            com.ellation.crunchyroll.mvp.lifecycle.a.b(bVar, myListsTabLayout);
            return bVar;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyListsTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(attributeSet, "attrs");
    }

    private final com.amazon.aps.iva.z10.a getPresenter() {
        return (com.amazon.aps.iva.z10.a) this.c.getValue();
    }

    @Override // com.amazon.aps.iva.z10.c
    public final void K3() {
        View view;
        TabLayout.Tab tabAt = getTabAt(this.b.a());
        if (tabAt != null) {
            view = tabAt.getCustomView();
        } else {
            view = null;
        }
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type com.ellation.widgets.tabs.CustomTabItemLayout");
        ImageView imageView = (ImageView) ((com.amazon.aps.iva.w70.b) view).b.c;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.tabImage");
        imageView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.z10.c
    public final void Ra() {
        View view;
        TabLayout.Tab tabAt = getTabAt(this.b.a());
        if (tabAt != null) {
            view = tabAt.getCustomView();
        } else {
            view = null;
        }
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type com.ellation.widgets.tabs.CustomTabItemLayout");
        ImageView imageView = (ImageView) ((com.amazon.aps.iva.w70.b) view).b.c;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.tabImage");
        imageView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i5.o
    public g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.google.android.material.tabs.TabLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e.c().getUserBenefitsChangeMonitor().a(this, new a(getPresenter()));
    }

    @Override // com.amazon.aps.iva.z10.c
    public final void t2() {
        int tabCount = getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = getTabAt(i);
            com.amazon.aps.iva.yb0.j.c(tabAt);
            Context context = getContext();
            com.amazon.aps.iva.yb0.j.e(context, "context");
            String valueOf = String.valueOf(tabAt.getText());
            com.amazon.aps.iva.wy.e eVar = this.b.a.get(i);
            com.amazon.aps.iva.yb0.j.d(eVar, "null cannot be cast to non-null type com.ellation.widgets.tabs.TabContainer");
            tabAt.setCustomView(new com.amazon.aps.iva.w70.b(context, valueOf, ((com.amazon.aps.iva.w70.i) eVar).G()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListsTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(attributeSet, "attrs");
        this.b = new i();
        this.c = com.amazon.aps.iva.kb0.f.b(new b());
    }
}
