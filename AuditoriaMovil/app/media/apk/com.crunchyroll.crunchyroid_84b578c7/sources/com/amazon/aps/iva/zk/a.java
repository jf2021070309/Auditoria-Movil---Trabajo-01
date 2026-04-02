package com.amazon.aps.iva.zk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.List;
/* compiled from: ProgressDrawable.kt */
/* loaded from: classes2.dex */
public final class a extends LayerDrawable {
    public final Context b;
    public final List<Double> c;
    public final int d;
    public final com.amazon.aps.iva.al.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, List<Double> list, int i) {
        super(new Drawable[]{com.amazon.aps.iva.d3.a.getDrawable(context, R.drawable.seekbar_background), com.amazon.aps.iva.d3.a.getDrawable(context, R.drawable.seekbar_secondary), com.amazon.aps.iva.d3.a.getDrawable(context, R.drawable.seekbar_primary)});
        j.f(context, "context");
        this.b = context;
        this.c = list;
        this.d = i;
        this.e = new com.amazon.aps.iva.al.a(context, list, i);
        setId(0, 16908288);
        setId(1, 16908303);
        setId(2, 16908301);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        j.f(canvas, "canvas");
        super.draw(canvas);
        Rect bounds = getBounds();
        com.amazon.aps.iva.al.a aVar = this.e;
        aVar.setBounds(bounds);
        aVar.draw(canvas);
    }
}
