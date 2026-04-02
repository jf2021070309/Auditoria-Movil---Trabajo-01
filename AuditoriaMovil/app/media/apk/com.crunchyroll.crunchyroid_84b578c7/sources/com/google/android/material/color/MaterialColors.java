package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.amazon.aps.iva.d3.a;
import com.amazon.aps.iva.g3.e;
import com.google.android.material.R;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;
/* loaded from: classes3.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    public static int compositeARGBWithAlpha(int i, int i2) {
        return e.h(i, (Color.alpha(i) * i2) / 255);
    }

    public static int getColor(View view, int i) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i));
    }

    private static int getColorRole(int i, int i2) {
        Hct fromInt = Hct.fromInt(i);
        fromInt.setTone(i2);
        return fromInt.toInt();
    }

    public static ColorRoles getColorRoles(Context context, int i) {
        return getColorRoles(i, isLightTheme(context));
    }

    public static ColorStateList getColorStateList(Context context, int i, ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        TypedValue resolve = MaterialAttributes.resolve(context, i);
        if (resolve != null) {
            colorStateList2 = resolveColorStateList(context, resolve);
        } else {
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        return colorStateList;
    }

    public static ColorStateList getColorStateListOrNull(Context context, int i) {
        TypedValue resolve = MaterialAttributes.resolve(context, i);
        if (resolve == null) {
            return null;
        }
        int i2 = resolve.resourceId;
        if (i2 != 0) {
            return a.getColorStateList(context, i2);
        }
        int i3 = resolve.data;
        if (i3 == 0) {
            return null;
        }
        return ColorStateList.valueOf(i3);
    }

    public static int getSurfaceContainerFromSeed(Context context, int i) {
        int i2;
        if (isLightTheme(context)) {
            i2 = TONE_SURFACE_CONTAINER_LIGHT;
        } else {
            i2 = 12;
        }
        return getColorRole(i, i2, 6);
    }

    public static int getSurfaceContainerHighFromSeed(Context context, int i) {
        int i2;
        if (isLightTheme(context)) {
            i2 = 92;
        } else {
            i2 = 17;
        }
        return getColorRole(i, i2, 6);
    }

    public static int harmonize(int i, int i2) {
        return Blend.harmonize(i, i2);
    }

    public static int harmonizeWithPrimary(Context context, int i) {
        return harmonize(i, getColor(context, R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(int i) {
        if (i != 0 && e.e(i) > 0.5d) {
            return true;
        }
        return false;
    }

    public static boolean isLightTheme(Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true);
    }

    public static int layer(View view, int i, int i2) {
        return layer(view, i, i2, 1.0f);
    }

    private static int resolveColor(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        if (i != 0) {
            return a.getColor(context, i);
        }
        return typedValue.data;
    }

    private static ColorStateList resolveColorStateList(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        if (i != 0) {
            return a.getColorStateList(context, i);
        }
        return ColorStateList.valueOf(typedValue.data);
    }

    public static ColorRoles getColorRoles(int i, boolean z) {
        if (z) {
            return new ColorRoles(getColorRole(i, TONE_ACCENT_LIGHT), getColorRole(i, 100), getColorRole(i, 90), getColorRole(i, 10));
        }
        return new ColorRoles(getColorRole(i, TONE_ACCENT_DARK), getColorRole(i, 20), getColorRole(i, TONE_ACCENT_CONTAINER_DARK), getColorRole(i, 90));
    }

    public static int layer(View view, int i, int i2, float f) {
        return layer(getColor(view, i), getColor(view, i2), f);
    }

    public static int getColor(Context context, int i, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i, str));
    }

    private static int getColorRole(int i, int i2, int i3) {
        Hct fromInt = Hct.fromInt(getColorRole(i, i2));
        fromInt.setChroma(i3);
        return fromInt.toInt();
    }

    public static int layer(int i, int i2, float f) {
        return layer(i, e.h(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int getColor(View view, int i, int i2) {
        return getColor(view.getContext(), i, i2);
    }

    public static int getColor(Context context, int i, int i2) {
        TypedValue resolve = MaterialAttributes.resolve(context, i);
        return resolve != null ? resolveColor(context, resolve) : i2;
    }

    public static int layer(int i, int i2) {
        return e.g(i2, i);
    }
}
