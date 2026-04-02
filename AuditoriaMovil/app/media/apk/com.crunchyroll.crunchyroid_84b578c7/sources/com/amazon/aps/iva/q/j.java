package com.amazon.aps.iva.q;

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
import com.amazon.aps.iva.q.u0;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AppCompatDrawableManager.java */
/* loaded from: classes.dex */
public final class j {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static j c;
    public u0 a;

    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public class a implements u0.b {
        public final int[] a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        public final int[] b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        public final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i, int[] iArr) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(int i, Context context) {
            int c = y0.c(R.attr.colorControlHighlight, context);
            return new ColorStateList(new int[][]{y0.b, y0.d, y0.c, y0.f}, new int[]{y0.b(R.attr.colorButtonNormal, context), com.amazon.aps.iva.g3.e.g(c, i), com.amazon.aps.iva.g3.e.g(c, i), i});
        }

        public static LayerDrawable c(u0 u0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable e = u0Var.e(context, R.drawable.abc_star_black_48dp);
            Drawable e2 = u0Var.e(context, R.drawable.abc_star_half_black_48dp);
            if ((e instanceof BitmapDrawable) && e.getIntrinsicWidth() == dimensionPixelSize && e.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) e;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                e.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((e2 instanceof BitmapDrawable) && e2.getIntrinsicWidth() == dimensionPixelSize && e2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) e2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                e2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            int[] iArr = j0.a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = j.b;
            }
            mutate.setColorFilter(j.c(i, mode));
        }

        public final ColorStateList d(int i, Context context) {
            if (i == R.drawable.abc_edit_text_material) {
                return com.amazon.aps.iva.d3.a.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                return com.amazon.aps.iva.d3.a.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList d = y0.d(R.attr.colorSwitchThumbNormal, context);
                if (d != null && d.isStateful()) {
                    int[] iArr3 = y0.b;
                    iArr[0] = iArr3;
                    iArr2[0] = d.getColorForState(iArr3, 0);
                    iArr[1] = y0.e;
                    iArr2[1] = y0.c(R.attr.colorControlActivated, context);
                    iArr[2] = y0.f;
                    iArr2[2] = d.getDefaultColor();
                } else {
                    iArr[0] = y0.b;
                    iArr2[0] = y0.b(R.attr.colorSwitchThumbNormal, context);
                    iArr[1] = y0.e;
                    iArr2[1] = y0.c(R.attr.colorControlActivated, context);
                    iArr[2] = y0.f;
                    iArr2[2] = y0.c(R.attr.colorSwitchThumbNormal, context);
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(y0.c(R.attr.colorButtonNormal, context), context);
            } else {
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(0, context);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(y0.c(R.attr.colorAccent, context), context);
                }
                if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
                    if (a(i, this.b)) {
                        return y0.d(R.attr.colorControlNormal, context);
                    }
                    if (a(i, this.e)) {
                        return com.amazon.aps.iva.d3.a.getColorStateList(context, R.color.abc_tint_default);
                    }
                    if (a(i, this.f)) {
                        return com.amazon.aps.iva.d3.a.getColorStateList(context, R.color.abc_tint_btn_checkable);
                    }
                    if (i == R.drawable.abc_seekbar_thumb_material) {
                        return com.amazon.aps.iva.d3.a.getColorStateList(context, R.color.abc_tint_seek_thumb);
                    }
                    return null;
                }
                return com.amazon.aps.iva.d3.a.getColorStateList(context, R.color.abc_tint_spinner);
            }
        }
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (c == null) {
                d();
            }
            jVar = c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter g;
        synchronized (j.class) {
            g = u0.g(i, mode);
        }
        return g;
    }

    public static synchronized void d() {
        synchronized (j.class) {
            if (c == null) {
                j jVar = new j();
                c = jVar;
                jVar.a = u0.c();
                u0 u0Var = c.a;
                a aVar = new a();
                synchronized (u0Var) {
                    u0Var.e = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, b1 b1Var, int[] iArr) {
        boolean z;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = u0.f;
        int[] state = drawable.getState();
        int[] iArr2 = j0.a;
        if (drawable.mutate() == drawable) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z2 = b1Var.d;
            if (!z2 && !b1Var.c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z2) {
                colorStateList = b1Var.a;
            } else {
                colorStateList = null;
            }
            if (b1Var.c) {
                mode = b1Var.b;
            } else {
                mode = u0.f;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = u0.g(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.e(context, i);
    }
}
