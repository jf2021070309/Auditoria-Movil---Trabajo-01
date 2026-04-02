package com.amazon.aps.iva.r70;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import com.ellation.crunchyroll.ui.databinding.LayoutRemoveItemBinding;
/* compiled from: SwipeToRemoveCallback.kt */
/* loaded from: classes2.dex */
public final class e extends q.g {
    public final Context c;
    public final l<Integer, com.amazon.aps.iva.kb0.q> d;
    public final ColorDrawable e;
    public final LayoutRemoveItemBinding f;

    public e(Context context, com.amazon.aps.iva.cv.b bVar) {
        j.f(context, "context");
        this.c = context;
        this.d = bVar;
        this.e = new ColorDrawable(com.amazon.aps.iva.d3.a.getColor(context, 17170444));
        LayoutRemoveItemBinding inflate = LayoutRemoveItemBinding.inflate(LayoutInflater.from(context));
        j.e(inflate, "inflate(inflater)");
        this.f = inflate;
        int[] iArr = R.styleable.SwipeToRemove;
        j.e(iArr, "SwipeToRemove");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.crunchyroll.crunchyroid.R.style.CrunchylistSwipeToRemoveStyle, iArr);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        this.e = new ColorDrawable(obtainStyledAttributes.getColor(R.styleable.SwipeToRemove_swipeBackgroundColor, -16777216));
        TextView textView = inflate.swipeToRemoveText;
        int color = obtainStyledAttributes.getColor(R.styleable.SwipeToRemove_swipeForegroundColor, -1);
        j.e(textView, "lambda$2$lambda$1");
        x.g0(textView, obtainStyledAttributes, R.styleable.SwipeToRemove_swipeText, -1);
        textView.setTextColor(color);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        j.e(compoundDrawables, "compoundDrawables");
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setTint(color);
            }
        }
        textView.setTextAppearance(obtainStyledAttributes.getResourceId(R.styleable.SwipeToRemove_swipeTextStyle, -1));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.recyclerview.widget.q.d
    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, float f, float f2, int i, boolean z) {
        int left;
        int right;
        int i2;
        j.f(canvas, "canvas");
        j.f(recyclerView, "recyclerView");
        j.f(f0Var, "viewHolder");
        super.onChildDraw(canvas, recyclerView, f0Var, f, f2, i, z);
        if (i == 1) {
            View view = f0Var.itemView;
            j.e(view, "viewHolder.itemView");
            Context context = this.c;
            if (com.amazon.aps.iva.xw.q.f(context)) {
                left = view.getRight();
            } else {
                left = view.getLeft();
            }
            int top = view.getTop();
            if (com.amazon.aps.iva.xw.q.f(context)) {
                right = view.getLeft();
            } else {
                right = view.getRight();
            }
            Rect rect = new Rect(left, top, right, view.getBottom());
            ColorDrawable colorDrawable = this.e;
            colorDrawable.setBounds(rect);
            colorDrawable.draw(canvas);
            int i3 = rect.right;
            LayoutRemoveItemBinding layoutRemoveItemBinding = this.f;
            FrameLayout root = layoutRemoveItemBinding.getRoot();
            j.e(root, "layoutRemoveItemBinding.root");
            int width = t0.c(root).width();
            if (com.amazon.aps.iva.xw.q.f(context)) {
                i2 = i3 + width;
            } else {
                i2 = i3 - width;
            }
            RectF rectF = new RectF(i2, rect.top, rect.right, rect.bottom);
            layoutRemoveItemBinding.getRoot().layout(0, 0, (int) rectF.width(), (int) rectF.height());
            float f3 = rectF.left;
            float f4 = rectF.top;
            int save = canvas.save();
            canvas.translate(f3, f4);
            try {
                layoutRemoveItemBinding.getRoot().draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // androidx.recyclerview.widget.q.d
    public final boolean onMove(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        j.f(recyclerView, "recyclerView");
        j.f(f0Var, "viewHolder");
        j.f(f0Var2, "target");
        return false;
    }

    @Override // androidx.recyclerview.widget.q.d
    public final void onSwiped(RecyclerView.f0 f0Var, int i) {
        j.f(f0Var, "viewHolder");
        this.d.invoke(Integer.valueOf(f0Var.getBindingAdapterPosition()));
    }
}
