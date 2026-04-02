package com.ellation.crunchyroll.presentation.browse.tabs;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.g;
import com.amazon.aps.iva.b00.b;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.mvp.lifecycle.a;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
/* compiled from: BrowseTabLayout.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/tabs/BrowseTabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/amazon/aps/iva/b00/b;", "Lcom/amazon/aps/iva/i5/o;", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BrowseTabLayout extends TabLayout implements b, o {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrowseTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
    }

    @Override // com.amazon.aps.iva.i5.o
    public g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.b00.b
    public final void t2() {
        int tabCount = getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = getTabAt(i);
            j.c(tabAt);
            Context context = getContext();
            j.e(context, "context");
            tabAt.setCustomView(new com.amazon.aps.iva.w70.b(context, String.valueOf(tabAt.getText()), 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowseTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        a.b(new com.amazon.aps.iva.b00.a(this), this);
    }
}
