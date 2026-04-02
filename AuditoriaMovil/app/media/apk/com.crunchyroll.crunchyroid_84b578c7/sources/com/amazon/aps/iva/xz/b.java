package com.amazon.aps.iva.xz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BrowseAllButton.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class b extends LinearLayout implements d {
    public static final /* synthetic */ int c = 0;
    public final c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, com.amazon.aps.iva.vz.c cVar, com.amazon.aps.iva.ls.a aVar) {
        super(context);
        j.f(aVar, "screen");
        this.b = new c(this, cVar, aVar, new a(context));
        View.inflate(context, R.layout.view_all_button, this);
        setOnClickListener(new com.amazon.aps.iva.c8.j(this, 11));
    }
}
