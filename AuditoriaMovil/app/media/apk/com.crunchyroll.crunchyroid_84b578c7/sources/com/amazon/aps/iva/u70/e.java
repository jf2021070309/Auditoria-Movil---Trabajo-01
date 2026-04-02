package com.amazon.aps.iva.u70;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.xw.w0;
/* compiled from: ViewExtensions.kt */
/* loaded from: classes2.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ ConstraintLayout d;
    public final /* synthetic */ TextView e;

    public e(TextView textView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout) {
        this.b = textView;
        this.c = textView2;
        this.d = constraintLayout;
        this.e = textView3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        View view = this.b;
        if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            TextView textView = (TextView) view;
            TextView textView2 = this.c;
            boolean z2 = true;
            if (textView2.getLayout().getWidth() >= ((int) TypedValue.applyDimension(1, 160.0f, textView2.getResources().getDisplayMetrics()))) {
                z = true;
            } else {
                z = false;
            }
            int lineCount = textView2.getLayout().getLineCount();
            int i = 0;
            while (true) {
                if (i < lineCount) {
                    if (textView2.getLayout().getEllipsisCount(i) > 0) {
                        break;
                    }
                    i++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z && z2) {
                ConstraintLayout constraintLayout = this.d;
                com.amazon.aps.iva.yb0.j.e(constraintLayout, "constraint");
                w0.b(constraintLayout, new f(textView2, textView, lineCount, this.e));
            }
        }
    }
}
