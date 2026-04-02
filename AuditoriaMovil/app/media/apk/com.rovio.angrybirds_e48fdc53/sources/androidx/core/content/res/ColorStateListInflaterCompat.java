package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
/* loaded from: classes6.dex */
public final class ColorStateListInflaterCompat {
    private ColorStateListInflaterCompat() {
    }

    private static TypedArray obtainAttributes(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        return theme == null ? res.obtainAttributes(set, attrs) : theme.obtainStyledAttributes(set, attrs, 0, 0);
    }

    private static int modulateColorAlpha(int color, float alphaMod) {
        int alpha = Math.round(Color.alpha(color) * alphaMod);
        return (16777215 & color) | (alpha << 24);
    }
}
