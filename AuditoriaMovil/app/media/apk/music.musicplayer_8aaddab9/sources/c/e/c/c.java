package c.e.c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.CardView;
import java.util.Objects;
/* loaded from: classes.dex */
public class c implements e {
    public final RectF a = new RectF();

    @Override // c.e.c.e
    public void a(d dVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        g gVar = new g(context.getResources(), colorStateList, f2, f3, f4);
        CardView.a aVar = (CardView.a) dVar;
        gVar.q = aVar.a();
        gVar.invalidateSelf();
        aVar.a = gVar;
        CardView.this.setBackgroundDrawable(gVar);
        p(aVar);
    }

    @Override // c.e.c.e
    public void b(d dVar, float f2) {
        g o = o(dVar);
        Objects.requireNonNull(o);
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
        }
        float f3 = (int) (f2 + 0.5f);
        if (o.f1626h != f3) {
            o.f1626h = f3;
            o.f1632n = true;
            o.invalidateSelf();
        }
        p(dVar);
    }

    @Override // c.e.c.e
    public float c(d dVar) {
        return o(dVar).f1630l;
    }

    @Override // c.e.c.e
    public float d(d dVar) {
        return o(dVar).f1626h;
    }

    @Override // c.e.c.e
    public void e(d dVar) {
    }

    @Override // c.e.c.e
    public void f(d dVar, float f2) {
        g o = o(dVar);
        o.d(f2, o.f1628j);
    }

    @Override // c.e.c.e
    public float g(d dVar) {
        return o(dVar).f1628j;
    }

    @Override // c.e.c.e
    public ColorStateList h(d dVar) {
        return o(dVar).f1631m;
    }

    @Override // c.e.c.e
    public float j(d dVar) {
        g o = o(dVar);
        float f2 = o.f1628j;
        float f3 = (f2 * 1.5f) / 2.0f;
        return (((o.f1628j * 1.5f) + o.f1621c) * 2.0f) + (Math.max(f2, f3 + o.f1626h + o.f1621c) * 2.0f);
    }

    @Override // c.e.c.e
    public float k(d dVar) {
        g o = o(dVar);
        float f2 = o.f1628j;
        float f3 = f2 / 2.0f;
        return ((o.f1628j + o.f1621c) * 2.0f) + (Math.max(f2, f3 + o.f1626h + o.f1621c) * 2.0f);
    }

    @Override // c.e.c.e
    public void l(d dVar) {
        g o = o(dVar);
        CardView.a aVar = (CardView.a) dVar;
        o.q = aVar.a();
        o.invalidateSelf();
        p(aVar);
    }

    @Override // c.e.c.e
    public void m(d dVar, ColorStateList colorStateList) {
        g o = o(dVar);
        o.c(colorStateList);
        o.invalidateSelf();
    }

    @Override // c.e.c.e
    public void n(d dVar, float f2) {
        g o = o(dVar);
        o.d(o.f1630l, f2);
        p(dVar);
    }

    public final g o(d dVar) {
        return (g) ((CardView.a) dVar).a;
    }

    public void p(d dVar) {
        Rect rect = new Rect();
        o(dVar).getPadding(rect);
        int ceil = (int) Math.ceil(k(dVar));
        int ceil2 = (int) Math.ceil(j(dVar));
        CardView.a aVar = (CardView.a) dVar;
        CardView cardView = CardView.this;
        if (ceil > cardView.f272e) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(ceil);
        }
        CardView cardView2 = CardView.this;
        if (ceil2 > cardView2.f273f) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(ceil2);
        }
        ((CardView.a) dVar).b(rect.left, rect.top, rect.right, rect.bottom);
    }
}
