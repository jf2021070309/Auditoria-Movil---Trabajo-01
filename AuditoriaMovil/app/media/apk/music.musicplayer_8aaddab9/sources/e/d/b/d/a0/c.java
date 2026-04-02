package e.d.b.d.a0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.g.c.d;
import c.i.k.d0;
import e.d.b.d.w.g;
import e.d.b.d.w.h;
import e.d.b.d.w.j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class c extends ConstraintLayout {
    public final Runnable u;
    public int v;
    public g w;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.s();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.w = gVar;
        h hVar = new h(0.5f);
        j jVar = gVar.f6591c.a;
        Objects.requireNonNull(jVar);
        j.b bVar = new j.b(jVar);
        bVar.f6630e = hVar;
        bVar.f6631f = hVar;
        bVar.f6632g = hVar;
        bVar.f6633h = hVar;
        gVar.f6591c.a = bVar.a();
        gVar.invalidateSelf();
        this.w.q(ColorStateList.valueOf(-1));
        g gVar2 = this.w;
        AtomicInteger atomicInteger = d0.a;
        d0.c.q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.d.b.d.b.v, i2, 0);
        this.v = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.u = new a();
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            AtomicInteger atomicInteger = d0.a;
            view.setId(d0.d.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.u);
            handler.post(this.u);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        s();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.u);
            handler.post(this.u);
        }
    }

    public void s() {
        int childCount = getChildCount();
        int i2 = 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            if ("skip".equals(getChildAt(i3).getTag())) {
                i2++;
            }
        }
        c.g.c.d dVar = new c.g.c.d();
        dVar.c(this);
        float f2 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i5 = this.v;
                if (!dVar.f1846f.containsKey(Integer.valueOf(id))) {
                    dVar.f1846f.put(Integer.valueOf(id), new d.a());
                }
                d.b bVar = dVar.f1846f.get(Integer.valueOf(id)).f1849d;
                bVar.B = R.id.circle_center;
                bVar.C = i5;
                bVar.D = f2;
                f2 = (360.0f / (childCount - i2)) + f2;
            }
        }
        dVar.b(this, true);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        this.w.q(ColorStateList.valueOf(i2));
    }
}
