package com.ellation.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.amazon.aps.iva.d3.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import kotlin.Metadata;
/* compiled from: CrunchyrollSwipeRefreshLayout.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/widgets/CrunchyrollSwipeRefreshLayout;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CrunchyrollSwipeRefreshLayout extends SwipeRefreshLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrunchyrollSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        if (attributeSet != null) {
            setBackgroundColor(a.getColor(context, 17170445));
            int[] iArr = R.styleable.CrunchyrollSwipeRefreshLayout;
            j.e(iArr, "CrunchyrollSwipeRefreshLayout");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
            setColorSchemeColors(obtainStyledAttributes.getColor(R.styleable.CrunchyrollSwipeRefreshLayout_progressColor, 0));
            setProgressBackgroundColorSchemeColor(obtainStyledAttributes.getColor(R.styleable.CrunchyrollSwipeRefreshLayout_progressBackgroundColor, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
