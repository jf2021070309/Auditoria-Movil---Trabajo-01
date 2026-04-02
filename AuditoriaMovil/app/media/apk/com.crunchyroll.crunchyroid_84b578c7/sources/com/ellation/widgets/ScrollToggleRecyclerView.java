package com.ellation.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: ScrollToggleRecyclerView.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002R\"\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ellation/widgets/ScrollToggleRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function1;", "", "Lcom/amazon/aps/iva/kb0/q;", "onVerticalScrollChange", "setVerticalScrollListener", "", "c", "Z", "isScrollEnabled", "()Z", "setScrollEnabled", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ScrollToggleRecyclerView extends RecyclerView {
    public static final /* synthetic */ int d = 0;
    public l<? super Integer, q> b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollToggleRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        this.c = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        j.f(motionEvent, "ev");
        if (!this.c && motionEvent.getAction() == 2) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrolled(int i, int i2) {
        l<? super Integer, q> lVar;
        super.onScrolled(i, i2);
        if (i2 != 0 && (lVar = this.b) != null) {
            lVar.invoke(Integer.valueOf(computeVerticalScrollOffset()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        j.f(view, "child");
        j.f(view2, "focused");
    }

    public final void setScrollEnabled(boolean z) {
        this.c = z;
    }

    public final void setVerticalScrollListener(l<? super Integer, q> lVar) {
        this.b = lVar;
    }
}
