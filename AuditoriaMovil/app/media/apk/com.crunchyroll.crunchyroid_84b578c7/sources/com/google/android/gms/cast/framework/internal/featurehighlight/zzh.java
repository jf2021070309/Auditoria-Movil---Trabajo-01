package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.p3.e;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.internal.cast.zzeg;
import com.google.android.gms.internal.cast.zzep;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzh extends ViewGroup {
    Animator zza;
    private final int[] zzb;
    private final Rect zzc;
    private final Rect zzd;
    private final OuterHighlightDrawable zze;
    private final InnerZoneDrawable zzf;
    private View zzg;
    private final zzi zzh;
    private final e zzi;
    private e zzj;
    private zzg zzk;
    private boolean zzl;
    private HelpTextView zzm;

    public zzh(Context context) {
        super(context);
        this.zzb = new int[2];
        this.zzc = new Rect();
        this.zzd = new Rect();
        setId(R.id.cast_featurehighlight_view);
        setWillNotDraw(false);
        InnerZoneDrawable innerZoneDrawable = new InnerZoneDrawable(context);
        this.zzf = innerZoneDrawable;
        innerZoneDrawable.setCallback(this);
        OuterHighlightDrawable outerHighlightDrawable = new OuterHighlightDrawable(context);
        this.zze = outerHighlightDrawable;
        outerHighlightDrawable.setCallback(this);
        this.zzh = new zzi(this);
        e eVar = new e(context, new zza(this));
        this.zzi = eVar;
        eVar.a.a.setIsLongpressEnabled(false);
        setVisibility(8);
    }

    public static /* synthetic */ Animator zza(zzh zzhVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        InnerZoneDrawable innerZoneDrawable = zzhVar.zzf;
        ObjectAnimator duration = ObjectAnimator.ofFloat(innerZoneDrawable, "scale", 1.0f, 1.1f).setDuration(500L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(innerZoneDrawable, "scale", 1.1f, 1.0f).setDuration(500L);
        ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(innerZoneDrawable, PropertyValuesHolder.ofFloat("pulseScale", 1.1f, 2.0f), PropertyValuesHolder.ofFloat("pulseAlpha", 1.0f, 0.0f)).setDuration(500L);
        animatorSet.play(duration);
        animatorSet.play(duration2).with(duration3).after(duration);
        animatorSet.setInterpolator(zzep.zzb());
        animatorSet.setStartDelay(500L);
        zzeg.zzd(animatorSet, -1, null);
        return animatorSet;
    }

    private final void zzo(Animator animator) {
        Animator animator2 = this.zza;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.zza = animator;
        animator.start();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        this.zze.draw(canvas);
        this.zzf.draw(canvas);
        View view = this.zzg;
        if (view != null) {
            if (view.getParent() != null) {
                Bitmap createBitmap = Bitmap.createBitmap(this.zzg.getWidth(), this.zzg.getHeight(), Bitmap.Config.ARGB_8888);
                this.zzg.draw(new Canvas(createBitmap));
                int zzc = this.zze.zzc();
                int red = Color.red(zzc);
                int green = Color.green(zzc);
                int blue = Color.blue(zzc);
                for (int i = 0; i < createBitmap.getHeight(); i++) {
                    for (int i2 = 0; i2 < createBitmap.getWidth(); i2++) {
                        int pixel = createBitmap.getPixel(i2, i);
                        if (Color.alpha(pixel) != 0) {
                            createBitmap.setPixel(i2, i, Color.argb(Color.alpha(pixel), red, green, blue));
                        }
                    }
                }
                Rect rect = this.zzc;
                canvas.drawBitmap(createBitmap, rect.left, rect.top, (Paint) null);
            }
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Neither target view nor drawable was set");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.zzg;
        if (view != null) {
            if (view.getParent() != null) {
                int[] iArr = this.zzb;
                View view2 = this.zzg;
                getLocationInWindow(iArr);
                int i5 = iArr[0];
                int i6 = iArr[1];
                view2.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i5;
                iArr[1] = iArr[1] - i6;
            }
            Rect rect = this.zzc;
            int[] iArr2 = this.zzb;
            int i7 = iArr2[0];
            rect.set(i7, iArr2[1], this.zzg.getWidth() + i7, this.zzg.getHeight() + this.zzb[1]);
            this.zzd.set(i, i2, i3, i4);
            this.zze.setBounds(this.zzd);
            this.zzf.setBounds(this.zzd);
            this.zzh.zza(this.zzc, this.zzd);
            return;
        }
        throw new IllegalStateException("Target view must be set before layout");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(View.MeasureSpec.getSize(i), i), View.resolveSize(View.MeasureSpec.getSize(i2), i2));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.zzl = this.zzc.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            actionMasked = 0;
        }
        if (this.zzl) {
            e eVar = this.zzj;
            if (eVar != null) {
                eVar.a(motionEvent);
                if (actionMasked == 1) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.setAction(3);
                }
            }
            if (this.zzg.getParent() != null) {
                this.zzg.onTouchEvent(motionEvent);
            }
        } else {
            this.zzi.a(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.zze && drawable != this.zzf && drawable != null) {
            return false;
        }
        return true;
    }

    public final View zzb() {
        return this.zzm.asView();
    }

    public final InnerZoneDrawable zzd() {
        return this.zzf;
    }

    public final OuterHighlightDrawable zzf() {
        return this.zze;
    }

    public final void zzg(Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zzm.asView(), "alpha", 0.0f).setDuration(200L);
        duration.setInterpolator(zzep.zza());
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.zze, PropertyValuesHolder.ofFloat("scale", 1.125f), PropertyValuesHolder.ofInt("alpha", 0));
        ofPropertyValuesHolder.setInterpolator(zzep.zza());
        Animator duration2 = ofPropertyValuesHolder.setDuration(200L);
        Animator zza = this.zzf.zza();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, zza);
        animatorSet.addListener(new zze(this, runnable));
        zzo(animatorSet);
    }

    public final void zzh(Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zzm.asView(), "alpha", 0.0f).setDuration(200L);
        duration.setInterpolator(zzep.zza());
        float exactCenterX = this.zzc.exactCenterX() - this.zze.zza();
        float exactCenterY = this.zzc.exactCenterY() - this.zze.zzb();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.zze, PropertyValuesHolder.ofFloat("scale", 0.0f), PropertyValuesHolder.ofFloat("translationX", 0.0f, exactCenterX), PropertyValuesHolder.ofFloat("translationY", 0.0f, exactCenterY), PropertyValuesHolder.ofInt("alpha", 0));
        ofPropertyValuesHolder.setInterpolator(zzep.zza());
        Animator duration2 = ofPropertyValuesHolder.setDuration(200L);
        Animator zza = this.zzf.zza();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, zza);
        animatorSet.addListener(new zzf(this, runnable));
        zzo(animatorSet);
    }

    public final void zzi(View view, View view2, boolean z, zzg zzgVar) {
        this.zzg = view;
        this.zzk = zzgVar;
        e eVar = new e(getContext(), new zzb(this, view, true, zzgVar));
        this.zzj = eVar;
        eVar.a.a.setIsLongpressEnabled(false);
        setVisibility(4);
    }

    public final void zzj(int i) {
        this.zze.zze(i);
    }

    public final void zzk() {
        if (this.zzg != null) {
            setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.zzm.asView(), "alpha", 0.0f, 1.0f).setDuration(350L);
            duration.setInterpolator(zzep.zzc());
            float exactCenterX = this.zzc.exactCenterX() - this.zze.zza();
            float exactCenterY = this.zzc.exactCenterY() - this.zze.zzb();
            OuterHighlightDrawable outerHighlightDrawable = this.zze;
            InnerZoneDrawable innerZoneDrawable = this.zzf;
            Animator zzd = outerHighlightDrawable.zzd(exactCenterX, exactCenterY);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(innerZoneDrawable, PropertyValuesHolder.ofFloat("scale", 0.0f, 1.0f), PropertyValuesHolder.ofInt("alpha", 0, 255));
            ofPropertyValuesHolder.setInterpolator(zzep.zzc());
            Animator duration2 = ofPropertyValuesHolder.setDuration(350L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(duration, zzd, duration2);
            animatorSet.addListener(new zzd(this));
            zzo(animatorSet);
            return;
        }
        throw new IllegalStateException("Target view must be set before animation");
    }

    public final void zzl(Runnable runnable) {
        addOnLayoutChangeListener(new zzc(this, null));
    }

    public final void zzn(HelpTextView helpTextView) {
        helpTextView.getClass();
        this.zzm = helpTextView;
        addView(helpTextView.asView(), 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
