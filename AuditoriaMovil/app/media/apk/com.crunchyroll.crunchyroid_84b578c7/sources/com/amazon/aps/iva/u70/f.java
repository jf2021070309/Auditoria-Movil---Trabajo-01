package com.amazon.aps.iva.u70;

import android.content.res.Resources;
import android.widget.TextView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.R;
/* compiled from: ActionSnackbar.kt */
/* loaded from: classes2.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.l<androidx.constraintlayout.widget.c, q> {
    public final /* synthetic */ TextView h;
    public final /* synthetic */ TextView i;
    public final /* synthetic */ int j;
    public final /* synthetic */ TextView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TextView textView, TextView textView2, int i, TextView textView3) {
        super(1);
        this.h = textView;
        this.i = textView2;
        this.j = i;
        this.k = textView3;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(androidx.constraintlayout.widget.c cVar) {
        int i;
        androidx.constraintlayout.widget.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "$this$modifyConstraints");
        TextView textView = this.h;
        cVar2.e(textView.getId(), 4);
        int id = textView.getId();
        Resources resources = this.i.getContext().getResources();
        if (this.j == 2) {
            i = R.dimen.snackbar_margin_two_lines;
        } else {
            i = R.dimen.snackbar_margin_single_line;
        }
        cVar2.h(id, 3, 0, 3, resources.getDimensionPixelSize(i));
        cVar2.g(textView.getId(), 7, 0, 7);
        cVar2.g(this.k.getId(), 3, textView.getId(), 4);
        return q.a;
    }
}
