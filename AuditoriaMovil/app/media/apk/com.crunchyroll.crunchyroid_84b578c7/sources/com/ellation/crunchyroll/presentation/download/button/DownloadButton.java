package com.ellation.crunchyroll.presentation.download.button;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.amazon.aps.iva.d3.a;
import com.amazon.aps.iva.e.i;
import com.amazon.aps.iva.f3.f;
import com.amazon.aps.iva.rg.b;
import com.amazon.aps.iva.x00.c;
import com.amazon.aps.iva.x00.d;
import com.amazon.aps.iva.x00.e;
import com.amazon.aps.iva.x00.g;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.presentation.download.button.DownloadButton;
import kotlin.Metadata;
/* compiled from: DownloadButton.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/presentation/download/button/DownloadButton;", "Landroid/view/View;", "Lcom/amazon/aps/iva/x00/g;", "", "getProgress", "Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState;", "state", "Lcom/amazon/aps/iva/kb0/q;", "setState", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DownloadButton extends View implements g {
    public static final /* synthetic */ int p = 0;
    public DownloadButtonState b;
    public Drawable c;
    public final Handler d;
    public final Paint e;
    public Rect f;
    public RectF g;
    public float h;
    public final long i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public ValueAnimator n;
    public final e o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        this.b = DownloadButtonState.NotStarted.c;
        this.d = new Handler(Looper.getMainLooper());
        Paint paint = new Paint();
        this.e = paint;
        this.h = 270.0f;
        this.i = 1000L;
        this.j = 360.0f;
        this.k = 0.01f;
        this.l = 0.9f;
        this.m = 90.0f;
        this.n = new ValueAnimator();
        e eVar = new e(this);
        this.o = eVar;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(a.getColor(getContext(), R.color.cr_teal));
        paint.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R.dimen.download_button_stroke_width));
        Resources resources = getResources();
        int i = this.b.b;
        ThreadLocal<TypedValue> threadLocal = f.a;
        Drawable a = f.a.a(resources, i, null);
        j.c(a);
        this.c = a;
        eVar.onCreate();
    }

    public final int getProgress() {
        b bVar;
        Integer a;
        DownloadButtonState downloadButtonState = this.b;
        if (downloadButtonState instanceof b) {
            bVar = (b) downloadButtonState;
        } else {
            bVar = null;
        }
        if (bVar != null && (a = bVar.a()) != null) {
            return a.intValue();
        }
        return 0;
    }

    public static final void setState$lambda$2(DownloadButton downloadButton) {
        j.f(downloadButton, "this$0");
        downloadButton.invalidate();
    }

    @Override // com.amazon.aps.iva.rg.a
    public final void G(final com.amazon.aps.iva.fg.g gVar, final com.amazon.aps.iva.xb0.a<? extends PlayableAsset> aVar) {
        j.f(gVar, "videoDownloadModule");
        setOnClickListener(new View.OnClickListener() { // from class: com.amazon.aps.iva.x00.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = DownloadButton.p;
                com.amazon.aps.iva.xb0.a aVar2 = com.amazon.aps.iva.xb0.a.this;
                j.f(aVar2, "$getAsset");
                com.amazon.aps.iva.fg.g gVar2 = gVar;
                j.f(gVar2, "$videoDownloadModule");
                DownloadButton downloadButton = this;
                j.f(downloadButton, "this$0");
                PlayableAsset playableAsset = (PlayableAsset) aVar2.invoke();
                if (playableAsset != null) {
                    ((com.amazon.aps.iva.p00.j) gVar2).d().s6(playableAsset, downloadButton.b, downloadButton);
                }
            }
        });
    }

    @Override // com.amazon.aps.iva.x00.g
    public final void m7() {
        invalidate();
        this.h = 270.0f;
        this.n.cancel();
        this.n.removeAllUpdateListeners();
    }

    @Override // com.amazon.aps.iva.x00.g
    public final void m8() {
        if (this.n.isRunning()) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(270.0f, 370.0f);
        ofFloat.setDuration(this.i);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.addUpdateListener(new com.amazon.aps.iva.x00.a(this, 0));
        ofFloat.start();
        this.n = ofFloat;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        this.f = new Rect(getPaddingStart(), getPaddingTop(), getLayoutParams().width - getPaddingEnd(), getLayoutParams().height - getPaddingBottom());
        Context context = getContext();
        j.e(context, "context");
        float b = q.b(context, this.l);
        this.g = new RectF(getPaddingStart() + b, getPaddingTop() + b, (getLayoutParams().width - getPaddingEnd()) - b, (getLayoutParams().height - getPaddingBottom()) - b);
        DownloadButtonState downloadButtonState = this.b;
        e eVar = this.o;
        eVar.getClass();
        j.f(downloadButtonState, "state");
        if ((downloadButtonState instanceof b) && ((b) downloadButtonState).a() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eVar.getView().m8();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j.f(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = this.c;
        Rect rect = this.f;
        if (rect != null) {
            drawable.setBounds(rect);
            this.c.draw(canvas);
            Paint paint = this.e;
            DownloadButtonState downloadButtonState = this.b;
            c cVar = new c(canvas, paint, this);
            d dVar = new d(canvas, paint, this);
            this.o.getClass();
            j.f(downloadButtonState, "state");
            if (downloadButtonState instanceof b) {
                if (((b) downloadButtonState).a() == null) {
                    cVar.invoke();
                    return;
                } else {
                    dVar.invoke();
                    return;
                }
            }
            return;
        }
        j.m("drawableRect");
        throw null;
    }

    @Override // com.amazon.aps.iva.rg.a
    public void setState(DownloadButtonState downloadButtonState) {
        boolean z;
        j.f(downloadButtonState, "state");
        this.b = downloadButtonState;
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = f.a;
        Drawable a = f.a.a(resources, downloadButtonState.b, null);
        j.c(a);
        this.c = a;
        setContentDescription(getContext().getString(R.string.desc_download_button, downloadButtonState.getClass().getSimpleName()));
        e eVar = this.o;
        eVar.getClass();
        if ((downloadButtonState instanceof b) && ((b) downloadButtonState).a() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eVar.getView().m8();
        } else {
            eVar.getView().m7();
        }
        this.d.post(new i(this, 5));
    }
}
