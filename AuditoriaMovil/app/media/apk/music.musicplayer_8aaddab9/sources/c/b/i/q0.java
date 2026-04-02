package c.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import c.b.i.j;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import music.musicplayer.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: b  reason: collision with root package name */
    public static q0 f1219b;

    /* renamed from: d  reason: collision with root package name */
    public WeakHashMap<Context, c.f.i<ColorStateList>> f1221d;

    /* renamed from: e  reason: collision with root package name */
    public c.f.h<String, e> f1222e;

    /* renamed from: f  reason: collision with root package name */
    public c.f.i<String> f1223f;

    /* renamed from: g  reason: collision with root package name */
    public final WeakHashMap<Context, c.f.e<WeakReference<Drawable.ConstantState>>> f1224g = new WeakHashMap<>(0);

    /* renamed from: h  reason: collision with root package name */
    public TypedValue f1225h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1226i;

    /* renamed from: j  reason: collision with root package name */
    public f f1227j;
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static final c f1220c = new c(6);

    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // c.b.i.q0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return c.b.e.a.a.g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // c.b.i.q0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                c.a0.a.a.b bVar = new c.a0.a.a.b(context, null, null);
                bVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return bVar;
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends c.f.f<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // c.b.i.q0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e2) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                    return null;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // c.b.i.q0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return c.a0.a.a.g.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    public static synchronized q0 d() {
        q0 q0Var;
        synchronized (q0.class) {
            if (f1219b == null) {
                q0 q0Var2 = new q0();
                f1219b = q0Var2;
                j(q0Var2);
            }
            q0Var = f1219b;
        }
        return q0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (q0.class) {
            c cVar = f1220c;
            Objects.requireNonNull(cVar);
            int i3 = (i2 + 31) * 31;
            porterDuffColorFilter = cVar.get(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                Objects.requireNonNull(cVar);
                cVar.put(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(q0 q0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            q0Var.a("vector", new g());
            q0Var.a("animated-vector", new b());
            q0Var.a("animated-selector", new a());
            q0Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f1222e == null) {
            this.f1222e = new c.f.h<>();
        }
        this.f1222e.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            c.f.e<WeakReference<Drawable.ConstantState>> eVar = this.f1224g.get(context);
            if (eVar == null) {
                eVar = new c.f.e<>();
                this.f1224g.put(context, eVar);
            }
            eVar.g(j2, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    public final Drawable c(Context context, int i2) {
        if (this.f1225h == null) {
            this.f1225h = new TypedValue();
        }
        TypedValue typedValue = this.f1225h;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        f fVar = this.f1227j;
        LayerDrawable layerDrawable = null;
        if (fVar != null) {
            j.a aVar = (j.a) fVar;
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j2) {
        c.f.e<WeakReference<Drawable.ConstantState>> eVar = this.f1224g.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> f2 = eVar.f(j2, null);
        if (f2 != null) {
            Drawable.ConstantState constantState = f2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b2 = c.f.d.b(eVar.f1648c, eVar.f1650e, j2);
            if (b2 >= 0) {
                Object[] objArr = eVar.f1649d;
                Object obj = objArr[b2];
                Object obj2 = c.f.e.a;
                if (obj != obj2) {
                    objArr[b2] = obj2;
                    eVar.f1647b = true;
                }
            }
        }
        return null;
    }

    public synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    public synchronized Drawable g(Context context, int i2, boolean z) {
        Drawable k2;
        if (!this.f1226i) {
            boolean z2 = true;
            this.f1226i = true;
            Drawable f2 = f(context, R.drawable.abc_vector_test);
            if (f2 != null) {
                if (!(f2 instanceof c.a0.a.a.g) && !"android.graphics.drawable.VectorDrawable".equals(f2.getClass().getName())) {
                    z2 = false;
                }
            }
            this.f1226i = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        k2 = k(context, i2);
        if (k2 == null) {
            k2 = c(context, i2);
        }
        if (k2 == null) {
            k2 = c.i.d.a.c(context, i2);
        }
        if (k2 != null) {
            k2 = l(context, i2, z, k2);
        }
        if (k2 != null) {
            e0.b(k2);
        }
        return k2;
    }

    public synchronized ColorStateList i(Context context, int i2) {
        ColorStateList d2;
        c.f.i<ColorStateList> iVar;
        WeakHashMap<Context, c.f.i<ColorStateList>> weakHashMap = this.f1221d;
        ColorStateList colorStateList = null;
        d2 = (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) ? null : iVar.d(i2, null);
        if (d2 == null) {
            f fVar = this.f1227j;
            if (fVar != null) {
                colorStateList = ((j.a) fVar).d(context, i2);
            }
            if (colorStateList != null) {
                if (this.f1221d == null) {
                    this.f1221d = new WeakHashMap<>();
                }
                c.f.i<ColorStateList> iVar2 = this.f1221d.get(context);
                if (iVar2 == null) {
                    iVar2 = new c.f.i<>();
                    this.f1221d.put(context, iVar2);
                }
                iVar2.a(i2, colorStateList);
            }
            d2 = colorStateList;
        }
        return d2;
    }

    public final Drawable k(Context context, int i2) {
        int next;
        c.f.h<String, e> hVar = this.f1222e;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        c.f.i<String> iVar = this.f1223f;
        if (iVar != null) {
            String d2 = iVar.d(i2, null);
            if ("appcompat_skip_skip".equals(d2) || (d2 != null && this.f1222e.getOrDefault(d2, null) == null)) {
                return null;
            }
        } else {
            this.f1223f = new c.f.i<>();
        }
        if (this.f1225h == null) {
            this.f1225h = new TypedValue();
        }
        TypedValue typedValue = this.f1225h;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1223f.a(i2, name);
                e eVar = this.f1222e.get(name);
                if (eVar != null) {
                    e2 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (e2 != null) {
                    e2.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j2, e2);
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
        }
        if (e2 == null) {
            this.f1223f.a(i2, "appcompat_skip_skip");
        }
        return e2;
    }

    public final Drawable l(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList i3 = i(context, i2);
        PorterDuff.Mode mode = null;
        if (i3 != null) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable q0 = c.i.a.q0(drawable);
            c.i.a.j0(q0, i3);
            f fVar = this.f1227j;
            if (fVar != null) {
                j.a aVar = (j.a) fVar;
                if (i2 == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode != null) {
                c.i.a.k0(q0, mode);
                return q0;
            }
            return q0;
        }
        f fVar2 = this.f1227j;
        if (fVar2 != null) {
            j.a aVar2 = (j.a) fVar2;
            boolean z2 = true;
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c2 = v0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = j.a;
                aVar2.e(findDrawableByLayerId, c2, mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908303), v0.c(context, R.attr.colorControlNormal), mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908301), v0.c(context, R.attr.colorControlActivated), mode2);
            } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b2 = v0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = j.a;
                aVar2.e(findDrawableByLayerId2, b2, mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908303), v0.c(context, R.attr.colorControlActivated), mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908301), v0.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (m(context, i2, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            c.b.i.q0$f r0 = r7.f1227j
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L72
            c.b.i.j$a r0 = (c.b.i.j.a) r0
            java.util.Objects.requireNonNull(r0)
            android.graphics.PorterDuff$Mode r3 = c.b.i.j.a
            int[] r4 = r0.a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L1d
            r5 = 2130968809(0x7f0400e9, float:1.7546282E38)
            goto L49
        L1d:
            int[] r4 = r0.f1186c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L29
            r5 = 2130968807(0x7f0400e7, float:1.7546278E38)
            goto L49
        L29:
            int[] r4 = r0.f1187d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L34
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L49
        L34:
            r0 = 2131230773(0x7f080035, float:1.8077608E38)
            if (r9 != r0) goto L44
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L4b
        L44:
            r0 = 2131230755(0x7f080023, float:1.8077572E38)
            if (r9 != r0) goto L4d
        L49:
            r9 = r5
            r0 = -1
        L4b:
            r4 = 1
            goto L50
        L4d:
            r9 = 0
            r0 = -1
            r4 = 0
        L50:
            if (r4 == 0) goto L6e
            boolean r4 = c.b.i.e0.a(r10)
            if (r4 == 0) goto L5c
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L5c:
            int r8 = c.b.i.v0.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = c.b.i.j.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L6c
            r10.setAlpha(r0)
        L6c:
            r8 = 1
            goto L6f
        L6e:
            r8 = 0
        L6f:
            if (r8 == 0) goto L72
            goto L73
        L72:
            r1 = 0
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.i.q0.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
