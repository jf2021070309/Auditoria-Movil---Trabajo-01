package com.amazon.aps.iva.pu;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
/* compiled from: LayoutCommentRepliesButtonBinding.java */
/* loaded from: classes2.dex */
public final class f implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a;
    public final View b;
    public final View c;

    public /* synthetic */ f(View view, View view2, int i) {
        this.a = i;
        this.b = view;
        this.c = view2;
    }

    public static f a(View view) {
        ProgressBar progressBar = (ProgressBar) view;
        return new f(progressBar, progressBar, 1);
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                return (TextView) view;
            case 1:
                return (ProgressBar) view;
            default:
                return (LinearLayout) this.c;
        }
    }

    public f(LinearLayout linearLayout, TextView textView) {
        this.a = 2;
        this.c = linearLayout;
        this.b = textView;
    }
}
