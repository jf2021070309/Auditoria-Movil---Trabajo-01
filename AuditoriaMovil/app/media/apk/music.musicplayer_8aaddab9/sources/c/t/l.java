package c.t;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class l extends RecyclerView.a0 {
    public final Drawable u;
    public ColorStateList v;
    public final SparseArray<View> w;
    public boolean x;
    public boolean y;

    public l(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.w = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.u = view.getBackground();
        if (textView != null) {
            this.v = textView.getTextColors();
        }
    }

    public View y(int i2) {
        View view = this.w.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = this.f527b.findViewById(i2);
        if (findViewById != null) {
            this.w.put(i2, findViewById);
        }
        return findViewById;
    }
}
