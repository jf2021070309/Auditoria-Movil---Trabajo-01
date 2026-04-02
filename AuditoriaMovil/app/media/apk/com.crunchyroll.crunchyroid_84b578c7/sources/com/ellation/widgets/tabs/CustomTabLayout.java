package com.ellation.widgets.tabs;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.w70.b;
import com.amazon.aps.iva.w70.e;
import com.amazon.aps.iva.w70.f;
import com.amazon.aps.iva.w70.g;
import com.amazon.aps.iva.w70.h;
import com.amazon.aps.iva.yb0.j;
import com.google.android.material.tabs.TabLayout;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: CustomTabLayout.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/ellation/widgets/tabs/CustomTabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/amazon/aps/iva/w70/f;", "", "position", "Lcom/amazon/aps/iva/kb0/q;", "setDefaultTab", "value", "getCurrentTabPosition", "()I", "setCurrentTabPosition", "(I)V", "currentTabPosition", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CustomTabLayout extends TabLayout implements f {
    public final e b;

    /* compiled from: CustomTabLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends g {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void onTabSelected(TabLayout.Tab tab) {
            j.f(tab, "tab");
            e eVar = CustomTabLayout.this.b;
            eVar.b.get(tab.getPosition()).b.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.w70.f
    public final void G(com.amazon.aps.iva.w70.a aVar, int i) {
        j.f(aVar, "tab");
        TabLayout.Tab newTab = newTab();
        Context context = getContext();
        j.e(context, "context");
        newTab.setCustomView(new b(context, aVar.a, 0));
        addTab(newTab, i);
        TabLayout.Tab tabAt = getTabAt(getSelectedTabPosition());
        if (tabAt != null) {
            tabAt.select();
        }
    }

    public final void b1(com.amazon.aps.iva.w70.a... aVarArr) {
        j.f(aVarArr, "tabs");
        com.amazon.aps.iva.w70.a[] aVarArr2 = (com.amazon.aps.iva.w70.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        e eVar = this.b;
        eVar.getClass();
        j.f(aVarArr2, "tabs");
        eVar.b = o.b0(aVarArr2);
        int length = aVarArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            eVar.a.G(aVarArr2[i], i2);
            i++;
            i2++;
        }
    }

    @Override // com.amazon.aps.iva.w70.f
    public int getCurrentTabPosition() {
        return getSelectedTabPosition();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        Object parcelable3;
        j.f(parcelable, "parcelable");
        Bundle bundle = (Bundle) parcelable;
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable3 = bundle.getParcelable("CUSTOM_TAB_STATE", h.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            parcelable2 = (h) bundle.getParcelable("CUSTOM_TAB_STATE");
        }
        h hVar = (h) parcelable2;
        j.c(hVar);
        setCurrentTabPosition(hVar.b);
        super.onRestoreInstanceState(hVar.c);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CUSTOM_TAB_STATE", new h(super.onSaveInstanceState(), getCurrentTabPosition()));
        return bundle;
    }

    @Override // com.amazon.aps.iva.w70.f
    public void setCurrentTabPosition(int i) {
        TabLayout.Tab tabAt = getTabAt(i);
        if (tabAt != null) {
            tabAt.select();
        }
    }

    public final void setDefaultTab(int i) {
        f fVar = this.b.a;
        if (fVar.getCurrentTabPosition() < 0) {
            fVar.setCurrentTabPosition(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = new e(this);
        addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }
}
