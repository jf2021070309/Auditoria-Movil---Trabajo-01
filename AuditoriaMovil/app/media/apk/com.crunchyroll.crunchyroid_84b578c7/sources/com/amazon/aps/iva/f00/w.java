package com.amazon.aps.iva.f00;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: SeasonHeaderView.kt */
/* loaded from: classes2.dex */
public final class w extends com.amazon.aps.iva.wy.g {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] c = {com.amazon.aps.iva.k.q.a(w.class, "title", "getTitle()Landroid/widget/TextView;", 0)};
    public final com.amazon.aps.iva.xw.v b;

    public w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = com.amazon.aps.iva.xw.g.c(R.id.text_season, this);
        View.inflate(context, R.layout.list_item_season, this);
    }

    public final TextView getTitle() {
        return (TextView) this.b.getValue(this, c[0]);
    }
}
