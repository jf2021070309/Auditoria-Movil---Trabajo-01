package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzblp extends RelativeLayout {
    private static final float[] zza = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzb;

    public zzblp(Context context, zzblo zzbloVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(zzbloVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zza, null, null));
        shapeDrawable.getPaint().setColor(zzbloVar.zze());
        setLayoutParams(layoutParams);
        com.google.android.gms.ads.internal.zzt.zze();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbloVar.zzb())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbloVar.zzb());
            textView.setTextColor(zzbloVar.zzf());
            textView.setTextSize(zzbloVar.zzg());
            zzber.zza();
            int zzs = zzcgm.zzs(context, 4);
            zzber.zza();
            textView.setPadding(zzs, 0, zzcgm.zzs(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzblr> zzd = zzbloVar.zzd();
        if (zzd != null && zzd.size() > 1) {
            this.zzb = new AnimationDrawable();
            for (zzblr zzblrVar : zzd) {
                try {
                    this.zzb.addFrame((Drawable) ObjectWrapper.unwrap(zzblrVar.zzb()), zzbloVar.zzh());
                } catch (Exception e2) {
                    zzcgt.zzg("Error while getting drawable.", e2);
                }
            }
            com.google.android.gms.ads.internal.zzt.zze();
            imageView.setBackground(this.zzb);
        } else if (zzd.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.unwrap(zzd.get(0).zzb()));
            } catch (Exception e3) {
                zzcgt.zzg("Error while getting drawable.", e3);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
