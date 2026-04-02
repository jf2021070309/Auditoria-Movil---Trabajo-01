package com.amazon.aps.iva.pe;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.crunchyroll.connectivity.ConnectionErrorBottomMessageLayout;
import com.ellation.crunchyroll.commenting.comments.inputview.CommentsInputLayout;
/* compiled from: LayoutBillingNotificationCardBinding.java */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a = 2;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;

    public d(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.b = constraintLayout;
        this.d = textView;
        this.c = imageView;
        this.e = textView2;
    }

    public final ConstraintLayout a() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (ConstraintLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        switch (this.a) {
            case 0:
                return a();
            case 1:
                return a();
            default:
                return (LinearLayout) this.b;
        }
    }

    public d(LinearLayout linearLayout, ConnectionErrorBottomMessageLayout connectionErrorBottomMessageLayout, CommentsInputLayout commentsInputLayout, FrameLayout frameLayout) {
        this.b = linearLayout;
        this.d = connectionErrorBottomMessageLayout;
        this.e = commentsInputLayout;
        this.c = frameLayout;
    }
}
