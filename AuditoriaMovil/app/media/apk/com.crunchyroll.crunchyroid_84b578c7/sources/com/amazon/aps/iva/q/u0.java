package com.amazon.aps.iva.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.amazon.aps.iva.q.j;
import com.crunchyroll.crunchyroid.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class u0 {
    public static u0 g;
    public WeakHashMap<Context, com.amazon.aps.iva.x.i<ColorStateList>> a;
    public final WeakHashMap<Context, com.amazon.aps.iva.x.f<WeakReference<Drawable.ConstantState>>> b = new WeakHashMap<>(0);
    public TypedValue c;
    public boolean d;
    public b e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final a h = new a();

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class a extends com.amazon.aps.iva.x.g<Integer, PorterDuffColorFilter> {
        public a() {
            super(6);
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public static synchronized u0 c() {
        u0 u0Var;
        synchronized (u0.class) {
            if (g == null) {
                g = new u0();
            }
            u0Var = g;
        }
        return u0Var;
    }

    public static synchronized PorterDuffColorFilter g(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (u0.class) {
            a aVar = h;
            aVar.getClass();
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = aVar.get(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                aVar.getClass();
                aVar.put(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            com.amazon.aps.iva.x.f<WeakReference<Drawable.ConstantState>> fVar = this.b.get(context);
            if (fVar == null) {
                fVar = new com.amazon.aps.iva.x.f<>();
                this.b.put(context, fVar);
            }
            fVar.f(j, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable b(int r8, android.content.Context r9) {
        /*
            r7 = this;
            android.util.TypedValue r0 = r7.c
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.c = r0
        Lb:
            android.util.TypedValue r0 = r7.c
            android.content.res.Resources r1 = r9.getResources()
            r2 = 1
            r1.getValue(r8, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r1 = r7.d(r9, r3)
            if (r1 == 0) goto L26
            return r1
        L26:
            com.amazon.aps.iva.q.u0$b r1 = r7.e
            if (r1 != 0) goto L2b
            goto L73
        L2b:
            r1 = 2131230780(0x7f08003c, float:1.8077622E38)
            if (r8 != r1) goto L4c
            android.graphics.drawable.LayerDrawable r8 = new android.graphics.drawable.LayerDrawable
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r5 = 2131230779(0x7f08003b, float:1.807762E38)
            android.graphics.drawable.Drawable r5 = r7.e(r9, r5)
            r6 = 0
            r1[r6] = r5
            r5 = 2131230781(0x7f08003d, float:1.8077624E38)
            android.graphics.drawable.Drawable r5 = r7.e(r9, r5)
            r1[r2] = r5
            r8.<init>(r1)
            goto L74
        L4c:
            r1 = 2131230815(0x7f08005f, float:1.8077693E38)
            if (r8 != r1) goto L59
            r8 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r8 = com.amazon.aps.iva.q.j.a.c(r7, r9, r8)
            goto L74
        L59:
            r1 = 2131230814(0x7f08005e, float:1.8077691E38)
            if (r8 != r1) goto L66
            r8 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r8 = com.amazon.aps.iva.q.j.a.c(r7, r9, r8)
            goto L74
        L66:
            r1 = 2131230816(0x7f080060, float:1.8077695E38)
            if (r8 != r1) goto L73
            r8 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r8 = com.amazon.aps.iva.q.j.a.c(r7, r9, r8)
            goto L74
        L73:
            r8 = 0
        L74:
            if (r8 == 0) goto L7e
            int r0 = r0.changingConfigurations
            r8.setChangingConfigurations(r0)
            r7.a(r9, r3, r8)
        L7e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q.u0.b(int, android.content.Context):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable d(Context context, long j) {
        com.amazon.aps.iva.x.f<WeakReference<Drawable.ConstantState>> fVar = this.b.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) fVar.d(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.g(j);
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i) {
        return f(context, i, false);
    }

    public final synchronized Drawable f(Context context, int i, boolean z) {
        Drawable i2;
        if (!this.d) {
            boolean z2 = true;
            this.d = true;
            Drawable e = e(context, R.drawable.abc_vector_test);
            if (e != null) {
                if (!(e instanceof com.amazon.aps.iva.b9.f) && !"android.graphics.drawable.VectorDrawable".equals(e.getClass().getName())) {
                    z2 = false;
                }
            }
            this.d = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        i2 = i(i, context);
        if (i2 == null) {
            i2 = b(i, context);
        }
        if (i2 == null) {
            i2 = com.amazon.aps.iva.d3.a.getDrawable(context, i);
        }
        if (i2 != null) {
            i2 = j(context, i, z, i2);
        }
        if (i2 != null) {
            j0.a(i2);
        }
        return i2;
    }

    public final synchronized ColorStateList h(int i, Context context) {
        ColorStateList colorStateList;
        com.amazon.aps.iva.x.i<ColorStateList> iVar;
        try {
            WeakHashMap<Context, com.amazon.aps.iva.x.i<ColorStateList>> weakHashMap = this.a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (iVar = weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) iVar.d(i, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                b bVar = this.e;
                if (bVar != null) {
                    colorStateList2 = ((j.a) bVar).d(i, context);
                }
                if (colorStateList2 != null) {
                    if (this.a == null) {
                        this.a = new WeakHashMap<>();
                    }
                    com.amazon.aps.iva.x.i<ColorStateList> iVar2 = this.a.get(context);
                    if (iVar2 == null) {
                        iVar2 = new com.amazon.aps.iva.x.i<>();
                        this.a.put(context, iVar2);
                    }
                    iVar2.a(i, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    public final Drawable i(int i, Context context) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable j(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            r9 = this;
            android.content.res.ColorStateList r0 = r9.h(r11, r10)
            r1 = 0
            if (r0 == 0) goto L23
            int[] r10 = com.amazon.aps.iva.q.j0.a
            android.graphics.drawable.Drawable r13 = r13.mutate()
            com.amazon.aps.iva.h3.a.b.h(r13, r0)
            com.amazon.aps.iva.q.u0$b r10 = r9.e
            if (r10 != 0) goto L15
            goto L1c
        L15:
            r10 = 2131230829(0x7f08006d, float:1.8077722E38)
            if (r11 != r10) goto L1c
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L1c:
            if (r1 == 0) goto La6
            com.amazon.aps.iva.h3.a.b.i(r13, r1)
            goto La6
        L23:
            com.amazon.aps.iva.q.u0$b r0 = r9.e
            if (r0 == 0) goto L9d
            r0 = 2131230824(0x7f080068, float:1.8077712E38)
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            r3 = 16908303(0x102000f, float:2.387727E-38)
            r4 = 16908288(0x1020000, float:2.387723E-38)
            r5 = 2130968934(0x7f040166, float:1.7546536E38)
            r6 = 2130968936(0x7f040168, float:1.754654E38)
            if (r11 != r0) goto L61
            r0 = r13
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            android.graphics.drawable.Drawable r4 = r0.findDrawableByLayerId(r4)
            int r7 = com.amazon.aps.iva.q.y0.c(r6, r10)
            android.graphics.PorterDuff$Mode r8 = com.amazon.aps.iva.q.j.b
            com.amazon.aps.iva.q.j.a.e(r4, r7, r8)
            android.graphics.drawable.Drawable r3 = r0.findDrawableByLayerId(r3)
            int r4 = com.amazon.aps.iva.q.y0.c(r6, r10)
            com.amazon.aps.iva.q.j.a.e(r3, r4, r8)
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r2)
            int r2 = com.amazon.aps.iva.q.y0.c(r5, r10)
            com.amazon.aps.iva.q.j.a.e(r0, r2, r8)
            goto L99
        L61:
            r0 = 2131230815(0x7f08005f, float:1.8077693E38)
            if (r11 == r0) goto L73
            r0 = 2131230814(0x7f08005e, float:1.8077691E38)
            if (r11 == r0) goto L73
            r0 = 2131230816(0x7f080060, float:1.8077695E38)
            if (r11 != r0) goto L71
            goto L73
        L71:
            r0 = 0
            goto L9a
        L73:
            r0 = r13
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            android.graphics.drawable.Drawable r4 = r0.findDrawableByLayerId(r4)
            int r6 = com.amazon.aps.iva.q.y0.b(r6, r10)
            android.graphics.PorterDuff$Mode r7 = com.amazon.aps.iva.q.j.b
            com.amazon.aps.iva.q.j.a.e(r4, r6, r7)
            android.graphics.drawable.Drawable r3 = r0.findDrawableByLayerId(r3)
            int r4 = com.amazon.aps.iva.q.y0.c(r5, r10)
            com.amazon.aps.iva.q.j.a.e(r3, r4, r7)
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r2)
            int r2 = com.amazon.aps.iva.q.y0.c(r5, r10)
            com.amazon.aps.iva.q.j.a.e(r0, r2, r7)
        L99:
            r0 = 1
        L9a:
            if (r0 == 0) goto L9d
            goto La6
        L9d:
            boolean r10 = r9.k(r10, r11, r13)
            if (r10 != 0) goto La6
            if (r12 == 0) goto La6
            r13 = r1
        La6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q.u0.j(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            com.amazon.aps.iva.q.u0$b r0 = r6.e
            r1 = 0
            if (r0 == 0) goto L70
            com.amazon.aps.iva.q.j$a r0 = (com.amazon.aps.iva.q.j.a) r0
            android.graphics.PorterDuff$Mode r2 = com.amazon.aps.iva.q.j.b
            int[] r3 = r0.a
            boolean r3 = com.amazon.aps.iva.q.j.a.a(r8, r3)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L17
            r8 = 2130968936(0x7f040168, float:1.754654E38)
            goto L4a
        L17:
            int[] r3 = r0.c
            boolean r3 = com.amazon.aps.iva.q.j.a.a(r8, r3)
            if (r3 == 0) goto L23
            r8 = 2130968934(0x7f040166, float:1.7546536E38)
            goto L4a
        L23:
            int[] r0 = r0.d
            boolean r0 = com.amazon.aps.iva.q.j.a.a(r8, r0)
            if (r0 == 0) goto L2e
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L47
        L2e:
            r0 = 2131230801(0x7f080051, float:1.8077665E38)
            if (r8 != r0) goto L42
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            goto L52
        L42:
            r0 = 2131230783(0x7f08003f, float:1.8077629E38)
            if (r8 != r0) goto L4d
        L47:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L4a:
            r0 = r8
            r8 = r4
            goto L4f
        L4d:
            r8 = r1
            r0 = r8
        L4f:
            r3 = r2
            r2 = r0
            r0 = r5
        L52:
            if (r8 == 0) goto L6c
            int[] r8 = com.amazon.aps.iva.q.j0.a
            android.graphics.drawable.Drawable r8 = r9.mutate()
            int r7 = com.amazon.aps.iva.q.y0.c(r2, r7)
            android.graphics.PorterDuffColorFilter r7 = com.amazon.aps.iva.q.j.c(r7, r3)
            r8.setColorFilter(r7)
            if (r0 == r5) goto L6a
            r8.setAlpha(r0)
        L6a:
            r7 = r4
            goto L6d
        L6c:
            r7 = r1
        L6d:
            if (r7 == 0) goto L70
            r1 = r4
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q.u0.k(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
