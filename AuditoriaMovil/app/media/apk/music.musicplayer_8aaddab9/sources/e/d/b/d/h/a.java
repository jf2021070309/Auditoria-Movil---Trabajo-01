package e.d.b.d.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import c.i.k.d0;
import com.google.android.material.button.MaterialButton;
import e.d.b.d.u.b;
import e.d.b.d.w.g;
import e.d.b.d.w.j;
import e.d.b.d.w.n;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class a {
    public static final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f6379b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialButton f6380c;

    /* renamed from: d  reason: collision with root package name */
    public j f6381d;

    /* renamed from: e  reason: collision with root package name */
    public int f6382e;

    /* renamed from: f  reason: collision with root package name */
    public int f6383f;

    /* renamed from: g  reason: collision with root package name */
    public int f6384g;

    /* renamed from: h  reason: collision with root package name */
    public int f6385h;

    /* renamed from: i  reason: collision with root package name */
    public int f6386i;

    /* renamed from: j  reason: collision with root package name */
    public int f6387j;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f6388k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f6389l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f6390m;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f6391n;
    public Drawable o;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s;
    public LayerDrawable t;
    public int u;

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = true;
        a = i2 >= 21;
        f6379b = (i2 < 21 || i2 > 22) ? false : false;
    }

    public a(MaterialButton materialButton, j jVar) {
        this.f6380c = materialButton;
        this.f6381d = jVar;
    }

    public n a() {
        LayerDrawable layerDrawable = this.t;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.t.getNumberOfLayers() > 2 ? (n) this.t.getDrawable(2) : (n) this.t.getDrawable(1);
    }

    public g b() {
        return c(false);
    }

    public final g c(boolean z) {
        LayerDrawable layerDrawable = this.t;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return a ? (g) ((LayerDrawable) ((InsetDrawable) this.t.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (g) this.t.getDrawable(!z ? 1 : 0);
    }

    public final g d() {
        return c(true);
    }

    public void e(j jVar) {
        this.f6381d = jVar;
        if (f6379b && !this.q) {
            MaterialButton materialButton = this.f6380c;
            AtomicInteger atomicInteger = d0.a;
            int f2 = d0.d.f(materialButton);
            int paddingTop = this.f6380c.getPaddingTop();
            int e2 = d0.d.e(this.f6380c);
            int paddingBottom = this.f6380c.getPaddingBottom();
            g();
            d0.d.k(this.f6380c, f2, paddingTop, e2, paddingBottom);
            return;
        }
        if (b() != null) {
            g b2 = b();
            b2.f6591c.a = jVar;
            b2.invalidateSelf();
        }
        if (d() != null) {
            g d2 = d();
            d2.f6591c.a = jVar;
            d2.invalidateSelf();
        }
        if (a() != null) {
            a().setShapeAppearanceModel(jVar);
        }
    }

    public final void f(int i2, int i3) {
        MaterialButton materialButton = this.f6380c;
        AtomicInteger atomicInteger = d0.a;
        int f2 = d0.d.f(materialButton);
        int paddingTop = this.f6380c.getPaddingTop();
        int e2 = d0.d.e(this.f6380c);
        int paddingBottom = this.f6380c.getPaddingBottom();
        int i4 = this.f6384g;
        int i5 = this.f6385h;
        this.f6385h = i3;
        this.f6384g = i2;
        if (!this.q) {
            g();
        }
        d0.d.k(this.f6380c, f2, (paddingTop + i2) - i4, e2, (paddingBottom + i3) - i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    public final void g() {
        InsetDrawable insetDrawable;
        MaterialButton materialButton = this.f6380c;
        g gVar = new g(this.f6381d);
        gVar.o(this.f6380c.getContext());
        c.i.a.j0(gVar, this.f6389l);
        PorterDuff.Mode mode = this.f6388k;
        if (mode != null) {
            c.i.a.k0(gVar, mode);
        }
        gVar.t(this.f6387j, this.f6390m);
        g gVar2 = new g(this.f6381d);
        gVar2.setTint(0);
        gVar2.s(this.f6387j, this.p ? e.d.b.d.a.B(this.f6380c, R.attr.colorSurface) : 0);
        if (a) {
            g gVar3 = new g(this.f6381d);
            this.o = gVar3;
            c.i.a.i0(gVar3, -1);
            ?? rippleDrawable = new RippleDrawable(b.a(this.f6391n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f6382e, this.f6384g, this.f6383f, this.f6385h), this.o);
            this.t = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            e.d.b.d.u.a aVar = new e.d.b.d.u.a(this.f6381d);
            this.o = aVar;
            c.i.a.j0(aVar, b.a(this.f6391n));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.o});
            this.t = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f6382e, this.f6384g, this.f6383f, this.f6385h);
        }
        materialButton.setInternalBackground(insetDrawable);
        g b2 = b();
        if (b2 != null) {
            b2.p(this.u);
        }
    }

    public final void h() {
        g b2 = b();
        g d2 = d();
        if (b2 != null) {
            b2.t(this.f6387j, this.f6390m);
            if (d2 != null) {
                d2.s(this.f6387j, this.p ? e.d.b.d.a.B(this.f6380c, R.attr.colorSurface) : 0);
            }
        }
    }
}
