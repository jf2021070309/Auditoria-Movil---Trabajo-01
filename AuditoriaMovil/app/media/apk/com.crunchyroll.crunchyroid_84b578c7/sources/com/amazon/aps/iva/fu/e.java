package com.amazon.aps.iva.fu;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: CommentViewHolder.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final void a(RecyclerView.f0 f0Var, com.amazon.aps.iva.d9.a aVar) {
        int a;
        j.f(f0Var, "<this>");
        j.f(aVar, "viewBinding");
        View root = aVar.getRoot();
        j.e(root, "viewBinding.root");
        switch (f0Var.getItemViewType()) {
            case 12001:
            case 12003:
            case 12004:
                a = t0.a(R.dimen.comments_list_padding_horizontal, root);
                break;
            case 12002:
            case 12005:
                a = t0.a(R.dimen.comments_list_replies_padding_left, root);
                break;
            default:
                a = root.getPaddingStart();
                break;
        }
        root.setPaddingRelative(a, root.getPaddingTop(), t0.a(R.dimen.comments_list_padding_horizontal, root), root.getPaddingBottom());
    }
}
