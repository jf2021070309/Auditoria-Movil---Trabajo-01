package com.crunchyroll.trickscrubbing;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xn.k;
import com.amazon.aps.iva.xn.l;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yn.a;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: TrickScrubbingLayout.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/crunchyroll/trickscrubbing/TrickScrubbingLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/xn/l;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "", "position", "Lcom/amazon/aps/iva/kb0/q;", "setPosition", "Landroid/widget/ImageView;", "c", "Lcom/amazon/aps/iva/bc0/b;", "getPreviewImage", "()Landroid/widget/ImageView;", "previewImage", "", "getContainerWidth", "()I", "containerWidth", "getParentContainerWidth", "parentContainerWidth", "trick-scrubbing_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TrickScrubbingLayout extends g implements l, SeekBar.OnSeekBarChangeListener {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] d = {q.a(TrickScrubbingLayout.class, "previewImage", "getPreviewImage()Landroid/widget/ImageView;", 0)};
    public final k b;
    public final v c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrickScrubbingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final ImageView getPreviewImage() {
        return (ImageView) this.c.getValue(this, d[0]);
    }

    @Override // com.amazon.aps.iva.xn.l
    public final void Z9(Bitmap bitmap) {
        getPreviewImage().setImageBitmap(bitmap);
    }

    @Override // com.amazon.aps.iva.xn.l
    public final void f() {
        setVisibility(8);
    }

    @Override // com.amazon.aps.iva.xn.l
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // com.amazon.aps.iva.xn.l
    public int getParentContainerWidth() {
        ViewParent parent = getParent();
        j.d(parent, "null cannot be cast to non-null type android.view.View");
        return ((View) parent).getWidth();
    }

    @Override // com.amazon.aps.iva.xn.l
    public final boolean isVisible() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.xn.l
    public final void k() {
        setAlpha(0.0f);
        setVisibility(0);
        animate().setInterpolator(new DecelerateInterpolator()).alpha(1.0f).setDuration(300L).start();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        j.f(seekBar, "seekBar");
        int centerX = seekBar.getThumb().getBounds().centerX();
        k kVar = this.b;
        if (kVar.b) {
            float containerWidth = centerX - (kVar.getView().getContainerWidth() / 2.0f);
            if (containerWidth <= 0.0f) {
                kVar.getView().setPosition(0.0f);
            } else if (kVar.getView().getContainerWidth() + containerWidth >= kVar.getView().getParentContainerWidth()) {
                kVar.getView().setPosition(kVar.getView().getParentContainerWidth() - kVar.getView().getContainerWidth());
            } else {
                kVar.getView().setPosition(containerWidth);
            }
            if (!kVar.getView().isVisible()) {
                kVar.getView().k();
            }
            a aVar = kVar.c;
            if (aVar != null) {
                kVar.getView().Z9(aVar.a((int) TimeUnit.MILLISECONDS.toSeconds(i)));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        j.f(seekBar, "seekBar");
        this.b.b = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        j.f(seekBar, "seekBar");
        k kVar = this.b;
        kVar.b = false;
        kVar.getView().f();
    }

    @Override // com.amazon.aps.iva.xn.l
    public void setPosition(float f) {
        setX(f);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(this.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrickScrubbingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = new k(this);
        this.c = com.amazon.aps.iva.xw.g.c(R.id.trick_scrubbing_preview_image, this);
        View.inflate(context, R.layout.layout_trick_scrubbing, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.xn.j.a, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        getPreviewImage().setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
    }
}
