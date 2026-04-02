package com.amazon.aps.iva.al;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.n;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: AdBreaksDrawable.kt */
/* loaded from: classes2.dex */
public final class a extends Drawable implements com.amazon.aps.iva.al.c {
    public static final /* synthetic */ l<Object>[] f = {q.a(a.class, "leftBounds", "getLeftBounds()I", 0), q.a(a.class, "rightBounds", "getRightBounds()I", 0), q.a(a.class, "topBounds", "getTopBounds()I", 0), q.a(a.class, "bottomBounds", "getBottomBounds()I", 0)};
    public Canvas b;
    public final Paint c;
    public final com.amazon.aps.iva.al.b d;
    public final com.amazon.aps.iva.y70.a e;

    public a(Context context, List<Double> list, int i) {
        j.f(context, "context");
        float dimension = context.getResources().getDimension(R.dimen.seek_bar_thickness);
        float dimension2 = context.getResources().getDimension(R.dimen.seek_bar_ad_slot_width);
        Paint paint = new Paint();
        paint.setColor(com.amazon.aps.iva.d3.a.getColor(context, R.color.seek_bar_ad));
        this.c = paint;
        this.d = new com.amazon.aps.iva.al.b(this, list == null ? z.b : list, i, dimension, dimension2);
        Rect bounds = getBounds();
        j.e(bounds, "bounds");
        w.O(new n(bounds) { // from class: com.amazon.aps.iva.al.a.b
            @Override // com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Integer.valueOf(((Rect) this.receiver).left);
            }

            @Override // com.amazon.aps.iva.fc0.i
            public final void set(Object obj) {
                ((Rect) this.receiver).left = ((Number) obj).intValue();
            }
        });
        Rect bounds2 = getBounds();
        j.e(bounds2, "bounds");
        w.O(new n(bounds2) { // from class: com.amazon.aps.iva.al.a.c
            @Override // com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Integer.valueOf(((Rect) this.receiver).right);
            }

            @Override // com.amazon.aps.iva.fc0.i
            public final void set(Object obj) {
                ((Rect) this.receiver).right = ((Number) obj).intValue();
            }
        });
        Rect bounds3 = getBounds();
        j.e(bounds3, "bounds");
        this.e = w.O(new n(bounds3) { // from class: com.amazon.aps.iva.al.a.d
            @Override // com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Integer.valueOf(((Rect) this.receiver).top);
            }

            @Override // com.amazon.aps.iva.fc0.i
            public final void set(Object obj) {
                ((Rect) this.receiver).top = ((Number) obj).intValue();
            }
        });
        Rect bounds4 = getBounds();
        j.e(bounds4, "bounds");
        w.O(new n(bounds4) { // from class: com.amazon.aps.iva.al.a.a
            @Override // com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Integer.valueOf(((Rect) this.receiver).bottom);
            }

            @Override // com.amazon.aps.iva.fc0.i
            public final void set(Object obj) {
                ((Rect) this.receiver).bottom = ((Number) obj).intValue();
            }
        });
    }

    @Override // com.amazon.aps.iva.al.c
    public final int a() {
        return getBounds().height();
    }

    @Override // com.amazon.aps.iva.al.c
    public final int b() {
        l<Object> lVar = f[2];
        com.amazon.aps.iva.y70.a aVar = this.e;
        aVar.getClass();
        j.f(lVar, "property");
        return ((Number) aVar.a.invoke()).intValue();
    }

    @Override // com.amazon.aps.iva.al.c
    public final int c() {
        return getBounds().width();
    }

    @Override // com.amazon.aps.iva.al.c
    public final void d(float f2, float f3, float f4, float f5) {
        Canvas canvas = this.b;
        if (canvas != null) {
            canvas.drawRect(f2, f3, f4, f5, this.c);
        } else {
            j.m("canvas");
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        boolean z;
        j.f(canvas, "canvas");
        this.b = canvas;
        com.amazon.aps.iva.al.b bVar = this.d;
        com.amazon.aps.iva.al.c cVar = bVar.a;
        float a = (cVar.a() / 2.0f) + cVar.b();
        float f2 = bVar.d / 2.0f;
        bVar.f = a - f2;
        bVar.g = f2 + a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = bVar.b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = bVar.c;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            double doubleValue = ((Number) next).doubleValue();
            if (0.0d <= doubleValue && doubleValue <= i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf((((float) ((Number) it2.next()).doubleValue()) / i) * cVar.c()));
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            float floatValue = ((Number) it3.next()).floatValue();
            cVar.d(floatValue, bVar.f, bVar.e + floatValue, bVar.g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
