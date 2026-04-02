package com.ellation.crunchyroll.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: WindowInsetsFrameLayout.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/ui/WindowInsetsFrameLayout;", "Lcom/amazon/aps/iva/wy/g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WindowInsetsFrameLayout extends g {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowInsetsFrameLayout(Context context) {
        this(context, null, 0, 6, null);
        j.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j.f(context, "context");
    }

    public /* synthetic */ WindowInsetsFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, e eVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.ellation.crunchyroll.ui.WindowInsetsFrameLayout.1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                j.f(view, "parent");
                j.f(view2, "child");
                WindowInsetsFrameLayout.this.requestApplyInsets();
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
                j.f(view, "parent");
                j.f(view2, "child");
                WindowInsetsFrameLayout.this.requestApplyInsets();
            }
        });
    }
}
