package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.cast.framework.R;
import com.google.common.primitives.Ints;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzi {
    private final Rect zza = new Rect();
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final zzh zzf;

    public zzi(zzh zzhVar) {
        this.zzf = zzhVar;
        Resources resources = zzhVar.getResources();
        this.zzb = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_inner_radius);
        this.zzc = resources.getDimensionPixelOffset(R.dimen.cast_libraries_material_featurehighlight_inner_margin);
        this.zzd = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_text_max_width);
        this.zze = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_text_horizontal_offset);
    }

    private final int zzb(View view, int i, int i2, int i3, int i4) {
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = i4 - i;
        int i7 = i2 - i4;
        int i8 = i4 - (i3 / 2);
        if (i6 <= i7) {
            i5 = i8 + this.zze;
        } else {
            i5 = i8 - this.zze;
        }
        int i9 = marginLayoutParams.leftMargin;
        if (i5 - i9 < i) {
            return i + i9;
        }
        int i10 = marginLayoutParams.rightMargin;
        if (i5 + i3 + i10 > i2) {
            return (i2 - i3) - i10;
        }
        return i5;
    }

    private final void zzc(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.min((i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, this.zzd), Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
    }

    public final void zza(Rect rect, Rect rect2) {
        View zzb = this.zzf.zzb();
        if (!rect.isEmpty() && !rect2.isEmpty()) {
            int centerY = rect.centerY();
            int centerX = rect.centerX();
            int centerY2 = rect2.centerY();
            int height = rect.height();
            int i = this.zzb;
            int max = Math.max(i + i, height) / 2;
            int i2 = centerY + max;
            int i3 = this.zzc;
            if (centerY < centerY2) {
                int i4 = i2 + i3;
                zzc(zzb, rect2.width(), rect2.bottom - i4);
                int zzb2 = zzb(zzb, rect2.left, rect2.right, zzb.getMeasuredWidth(), centerX);
                zzb.layout(zzb2, i4, zzb.getMeasuredWidth() + zzb2, zzb.getMeasuredHeight() + i4);
            } else {
                int i5 = (centerY - max) - i3;
                zzc(zzb, rect2.width(), i5 - rect2.top);
                int zzb3 = zzb(zzb, rect2.left, rect2.right, zzb.getMeasuredWidth(), centerX);
                zzb.layout(zzb3, i5 - zzb.getMeasuredHeight(), zzb.getMeasuredWidth() + zzb3, i5);
            }
        } else {
            zzb.layout(0, 0, 0, 0);
        }
        this.zza.set(zzb.getLeft(), zzb.getTop(), zzb.getRight(), zzb.getBottom());
        zzh zzhVar = this.zzf;
        zzhVar.zzf().zzf(rect, this.zza);
        this.zzf.zzd().zzb(rect);
    }
}
