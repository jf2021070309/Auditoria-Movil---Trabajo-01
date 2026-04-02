package c.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import c.b.i.q0;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final class j {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public static j f1183b;

    /* renamed from: c  reason: collision with root package name */
    public q0 f1184c;

    /* loaded from: classes.dex */
    public class a implements q0.f {
        public final int[] a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f1185b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f1186c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f1187d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f1188e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f1189f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i2) {
            int c2 = v0.c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{v0.f1254b, v0.f1256d, v0.f1255c, v0.f1258f}, new int[]{v0.b(context, R.attr.colorButtonNormal), c.i.e.b.b(c2, i2), c.i.e.b.b(c2, i2), i2});
        }

        public final LayerDrawable c(q0 q0Var, Context context, int i2) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            Drawable f2 = q0Var.f(context, R.drawable.abc_star_black_48dp);
            Drawable f3 = q0Var.f(context, R.drawable.abc_star_half_black_48dp);
            if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) f2;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f2.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((f3 instanceof BitmapDrawable) && f3.getIntrinsicWidth() == dimensionPixelSize && f3.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f3;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f3.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public ColorStateList d(Context context, int i2) {
            if (i2 == R.drawable.abc_edit_text_material) {
                return c.b.d.a.a.a(context, R.color.abc_tint_edittext);
            }
            if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
                return c.b.d.a.a.a(context, R.color.abc_tint_switch_track);
            }
            if (i2 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList d2 = v0.d(context, R.attr.colorSwitchThumbNormal);
                if (d2 == null || !d2.isStateful()) {
                    iArr[0] = v0.f1254b;
                    iArr2[0] = v0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = v0.f1257e;
                    iArr2[1] = v0.c(context, R.attr.colorControlActivated);
                    iArr[2] = v0.f1258f;
                    iArr2[2] = v0.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = v0.f1254b;
                    iArr2[0] = d2.getColorForState(iArr[0], 0);
                    iArr[1] = v0.f1257e;
                    iArr2[1] = v0.c(context, R.attr.colorControlActivated);
                    iArr[2] = v0.f1258f;
                    iArr2[2] = d2.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, v0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i2 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i2 == R.drawable.abc_btn_colored_material) {
                    return b(context, v0.c(context, R.attr.colorAccent));
                }
                if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                    return c.b.d.a.a.a(context, R.color.abc_tint_spinner);
                }
                if (a(this.f1185b, i2)) {
                    return v0.d(context, R.attr.colorControlNormal);
                }
                if (a(this.f1188e, i2)) {
                    return c.b.d.a.a.a(context, R.color.abc_tint_default);
                }
                if (a(this.f1189f, i2)) {
                    return c.b.d.a.a.a(context, R.color.abc_tint_btn_checkable);
                }
                if (i2 == R.drawable.abc_seekbar_thumb_material) {
                    return c.b.d.a.a.a(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
        }

        public final void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.a;
            }
            drawable.setColorFilter(j.c(i2, mode));
        }
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f1183b == null) {
                e();
            }
            jVar = f1183b;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter c(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter h2;
        synchronized (j.class) {
            h2 = q0.h(i2, mode);
        }
        return h2;
    }

    public static synchronized void e() {
        synchronized (j.class) {
            if (f1183b == null) {
                j jVar = new j();
                f1183b = jVar;
                jVar.f1184c = q0.d();
                q0 q0Var = f1183b.f1184c;
                a aVar = new a();
                synchronized (q0Var) {
                    q0Var.f1227j = aVar;
                }
            }
        }
    }

    public static void f(Drawable drawable, y0 y0Var, int[] iArr) {
        PorterDuff.Mode mode = q0.a;
        if (!e0.a(drawable) || drawable.mutate() == drawable) {
            boolean z = y0Var.f1283d;
            if (z || y0Var.f1282c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? y0Var.a : null;
                PorterDuff.Mode mode2 = y0Var.f1282c ? y0Var.f1281b : q0.a;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilter = q0.h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public synchronized Drawable b(Context context, int i2) {
        return this.f1184c.f(context, i2);
    }

    public synchronized ColorStateList d(Context context, int i2) {
        return this.f1184c.i(context, i2);
    }
}
