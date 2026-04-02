package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.common.internal.Objects;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public class CastSeekBar extends View {
    public zze zza;
    public zzc zzb;
    public List zzc;
    public zzd zzd;
    private boolean zze;
    private Integer zzf;
    private final float zzg;
    private final float zzh;
    private final float zzi;
    private final float zzj;
    private final float zzk;
    private final Paint zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private int[] zzq;
    private Point zzr;
    private Runnable zzs;

    public CastSeekBar(Context context) {
        this(context, null);
    }

    private final int zzf(int i) {
        return (int) ((i / ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) * this.zza.zzb);
    }

    private final void zzg(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        this.zzl.setColor(i5);
        float f = i3;
        float f2 = i2 / f;
        float f3 = i / f;
        float f4 = i4;
        float f5 = this.zzi;
        canvas.drawRect(f3 * f4, -f5, f2 * f4, f5, this.zzl);
    }

    public final void zzh(int i) {
        zze zzeVar = this.zza;
        if (!zzeVar.zzf) {
            return;
        }
        int i2 = zzeVar.zzd;
        this.zzf = Integer.valueOf(Math.min(Math.max(i, i2), zzeVar.zze));
        zzd zzdVar = this.zzd;
        if (zzdVar != null) {
            zzdVar.zza(this, getProgress(), true);
        }
        Runnable runnable = this.zzs;
        if (runnable == null) {
            this.zzs = new Runnable() { // from class: com.google.android.gms.cast.framework.media.widget.zza
                @Override // java.lang.Runnable
                public final void run() {
                    CastSeekBar.this.sendAccessibilityEvent(4);
                }
            };
        } else {
            removeCallbacks(runnable);
        }
        postDelayed(this.zzs, 200L);
        postInvalidate();
    }

    public final void zzi() {
        this.zze = true;
        zzd zzdVar = this.zzd;
        if (zzdVar != null) {
            zzdVar.zzb(this);
        }
    }

    public final void zzj() {
        this.zze = false;
        zzd zzdVar = this.zzd;
        if (zzdVar != null) {
            zzdVar.zzc(this);
        }
    }

    public int getMaxProgress() {
        return this.zza.zzb;
    }

    public int getProgress() {
        Integer num = this.zzf;
        if (num != null) {
            return num.intValue();
        }
        return this.zza.zza;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Runnable runnable = this.zzs;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int save = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        zzc zzcVar = this.zzb;
        if (zzcVar == null) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int progress = getProgress();
            int save2 = canvas.save();
            canvas.translate(0.0f, ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
            zze zzeVar = this.zza;
            if (zzeVar.zzf) {
                int i2 = zzeVar.zzd;
                if (i2 > 0) {
                    zzg(canvas, 0, i2, zzeVar.zzb, measuredWidth, this.zzo);
                }
                zze zzeVar2 = this.zza;
                int i3 = zzeVar2.zzd;
                if (progress > i3) {
                    zzg(canvas, i3, progress, zzeVar2.zzb, measuredWidth, this.zzm);
                }
                zze zzeVar3 = this.zza;
                int i4 = zzeVar3.zze;
                if (i4 > progress) {
                    zzg(canvas, progress, i4, zzeVar3.zzb, measuredWidth, this.zzn);
                }
                zze zzeVar4 = this.zza;
                int i5 = zzeVar4.zzb;
                int i6 = zzeVar4.zze;
                if (i5 > i6) {
                    zzg(canvas, i6, i5, i5, measuredWidth, this.zzo);
                }
            } else {
                int max = Math.max(zzeVar.zzc, 0);
                if (max > 0) {
                    zzg(canvas, 0, max, this.zza.zzb, measuredWidth, this.zzo);
                }
                if (progress > max) {
                    zzg(canvas, max, progress, this.zza.zzb, measuredWidth, this.zzm);
                }
                int i7 = this.zza.zzb;
                if (i7 > progress) {
                    zzg(canvas, progress, i7, i7, measuredWidth, this.zzo);
                }
            }
            canvas.restoreToCount(save2);
            List<zzb> list = this.zzc;
            if (list != null && !list.isEmpty()) {
                this.zzl.setColor(this.zzp);
                int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int save3 = canvas.save();
                canvas.translate(0.0f, ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
                for (zzb zzbVar : list) {
                    if (zzbVar != null) {
                        int min = Math.min(zzbVar.zza, this.zza.zzb);
                        if (zzbVar.zzc) {
                            i = zzbVar.zzb;
                        } else {
                            i = 1;
                        }
                        float f2 = measuredWidth2;
                        float f3 = this.zza.zzb;
                        float f4 = this.zzk;
                        float f5 = ((i + min) * f2) / f3;
                        float f6 = (min * f2) / f3;
                        if (f5 - f6 < f4) {
                            f5 = f6 + f4;
                        }
                        if (f5 > f2) {
                            f = f2;
                        } else {
                            f = f5;
                        }
                        if (f - f6 < f4) {
                            f6 = f - f4;
                        }
                        float f7 = this.zzi;
                        canvas.drawRect(f6, -f7, f, f7, this.zzl);
                    }
                }
                canvas.restoreToCount(save3);
            }
            if (isEnabled() && this.zza.zzf) {
                this.zzl.setColor(this.zzm);
                int measuredWidth3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                int save4 = canvas.save();
                canvas.drawCircle((int) ((getProgress() / this.zza.zzb) * measuredWidth3), measuredHeight / 2.0f, this.zzj, this.zzl);
                canvas.restoreToCount(save4);
            }
        } else {
            int measuredWidth4 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int save5 = canvas.save();
            canvas.translate(0.0f, ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
            zzg(canvas, 0, zzcVar.zza, zzcVar.zzb, measuredWidth4, this.zzp);
            int i8 = this.zzo;
            int i9 = zzcVar.zza;
            int i10 = zzcVar.zzb;
            zzg(canvas, i9, i10, i10, measuredWidth4, i8);
            canvas.restoreToCount(save5);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.zzg + getPaddingLeft() + getPaddingRight()), i, 0), View.resolveSizeAndState((int) (this.zzh + getPaddingTop() + getPaddingBottom()), i2, 0));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.zza.zzf) {
            if (this.zzr == null) {
                this.zzr = new Point();
            }
            if (this.zzq == null) {
                this.zzq = new int[2];
            }
            getLocationOnScreen(this.zzq);
            this.zzr.set((((int) motionEvent.getRawX()) - this.zzq[0]) - getPaddingLeft(), ((int) motionEvent.getRawY()) - this.zzq[1]);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            this.zze = false;
                            this.zzf = null;
                            zzd zzdVar = this.zzd;
                            if (zzdVar != null) {
                                zzdVar.zza(this, getProgress(), true);
                                this.zzd.zzc(this);
                            }
                            postInvalidate();
                            return true;
                        }
                    } else {
                        zzh(zzf(this.zzr.x));
                        return true;
                    }
                } else {
                    zzh(zzf(this.zzr.x));
                    zzj();
                    return true;
                }
            } else {
                zzi();
                zzh(zzf(this.zzr.x));
                return true;
            }
        }
        return false;
    }

    public final void zzd(List list) {
        ArrayList arrayList;
        if (Objects.equal(this.zzc, list)) {
            return;
        }
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list);
        }
        this.zzc = arrayList;
        postInvalidate();
    }

    public final void zze(zze zzeVar) {
        if (!this.zze) {
            zze zzeVar2 = new zze();
            zzeVar2.zza = zzeVar.zza;
            zzeVar2.zzb = zzeVar.zzb;
            zzeVar2.zzc = zzeVar.zzc;
            zzeVar2.zzd = zzeVar.zzd;
            zzeVar2.zze = zzeVar.zze;
            zzeVar2.zzf = zzeVar.zzf;
            this.zza = zzeVar2;
            this.zzf = null;
            zzd zzdVar = this.zzd;
            if (zzdVar != null) {
                zzdVar.zza(this, getProgress(), false);
            }
            postInvalidate();
        }
    }

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzc = new ArrayList();
        setAccessibilityDelegate(new zzg(this, null));
        Paint paint = new Paint(1);
        this.zzl = paint;
        paint.setStyle(Paint.Style.FILL);
        this.zzg = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.zzh = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.zzi = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        this.zzj = context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size) / 2.0f;
        this.zzk = context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        zze zzeVar = new zze();
        this.zza = zzeVar;
        zzeVar.zzb = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.CastExpandedController, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.CastExpandedController_castSeekBarProgressAndThumbColor, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.CastExpandedController_castSeekBarSecondaryProgressColor, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(R.styleable.CastExpandedController_castSeekBarUnseekableProgressColor, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(R.styleable.CastExpandedController_castAdBreakMarkerColor, 0);
        this.zzm = context.getResources().getColor(resourceId);
        this.zzn = context.getResources().getColor(resourceId2);
        this.zzo = context.getResources().getColor(resourceId3);
        this.zzp = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }
}
