package com.amazon.aps.iva.l8;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: PreferenceViewHolder.java */
/* loaded from: classes.dex */
public final class g extends RecyclerView.f0 {
    public final Drawable b;
    public final ColorStateList c;
    public final SparseArray<View> d;
    public boolean e;
    public boolean f;

    public g(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.d = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.b = view.getBackground();
        if (textView != null) {
            this.c = textView.getTextColors();
        }
    }

    public final View b1(int i) {
        SparseArray<View> sparseArray = this.d;
        View view = sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            sparseArray.put(i, findViewById);
        }
        return findViewById;
    }
}
