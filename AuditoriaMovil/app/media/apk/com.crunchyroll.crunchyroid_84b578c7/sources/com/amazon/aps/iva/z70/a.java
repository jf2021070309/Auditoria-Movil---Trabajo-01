package com.amazon.aps.iva.z70;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: ComposeViewHolder.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.f0 {
    public a(Context context) {
        super(new ComposeView(context, null, 6));
    }

    public final void b1(com.amazon.aps.iva.v0.a aVar) {
        j.f(aVar, FirebaseAnalytics.Param.CONTENT);
        View view = this.itemView;
        j.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        ((ComposeView) view).setContent(aVar);
    }
}
