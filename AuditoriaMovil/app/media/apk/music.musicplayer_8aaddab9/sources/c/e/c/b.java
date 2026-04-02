package c.e.c;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.CardView;
/* loaded from: classes.dex */
public class b implements e {
    @Override // c.e.c.e
    public void a(d dVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        f fVar = new f(colorStateList, f2);
        CardView.a aVar = (CardView.a) dVar;
        aVar.a = fVar;
        CardView.this.setBackgroundDrawable(fVar);
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(f3);
        n(dVar, f4);
    }

    @Override // c.e.c.e
    public void b(d dVar, float f2) {
        f o = o(dVar);
        if (f2 == o.a) {
            return;
        }
        o.a = f2;
        o.c(null);
        o.invalidateSelf();
    }

    @Override // c.e.c.e
    public float c(d dVar) {
        return CardView.this.getElevation();
    }

    @Override // c.e.c.e
    public float d(d dVar) {
        return o(dVar).a;
    }

    @Override // c.e.c.e
    public void e(d dVar) {
        n(dVar, o(dVar).f1613e);
    }

    @Override // c.e.c.e
    public void f(d dVar, float f2) {
        CardView.this.setElevation(f2);
    }

    @Override // c.e.c.e
    public float g(d dVar) {
        return o(dVar).f1613e;
    }

    @Override // c.e.c.e
    public ColorStateList h(d dVar) {
        return o(dVar).f1616h;
    }

    @Override // c.e.c.e
    public void i() {
    }

    @Override // c.e.c.e
    public float j(d dVar) {
        return o(dVar).a * 2.0f;
    }

    @Override // c.e.c.e
    public float k(d dVar) {
        return o(dVar).a * 2.0f;
    }

    @Override // c.e.c.e
    public void l(d dVar) {
        n(dVar, o(dVar).f1613e);
    }

    @Override // c.e.c.e
    public void m(d dVar, ColorStateList colorStateList) {
        f o = o(dVar);
        o.b(colorStateList);
        o.invalidateSelf();
    }

    @Override // c.e.c.e
    public void n(d dVar, float f2) {
        f o = o(dVar);
        CardView.a aVar = (CardView.a) dVar;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean a = aVar.a();
        if (f2 != o.f1613e || o.f1614f != useCompatPadding || o.f1615g != a) {
            o.f1613e = f2;
            o.f1614f = useCompatPadding;
            o.f1615g = a;
            o.c(null);
            o.invalidateSelf();
        }
        if (!CardView.this.getUseCompatPadding()) {
            aVar.b(0, 0, 0, 0);
            return;
        }
        float f3 = o(dVar).f1613e;
        float f4 = o(dVar).a;
        int ceil = (int) Math.ceil(g.a(f3, f4, aVar.a()));
        int ceil2 = (int) Math.ceil(g.b(f3, f4, aVar.a()));
        aVar.b(ceil, ceil2, ceil, ceil2);
    }

    public final f o(d dVar) {
        return (f) ((CardView.a) dVar).a;
    }
}
