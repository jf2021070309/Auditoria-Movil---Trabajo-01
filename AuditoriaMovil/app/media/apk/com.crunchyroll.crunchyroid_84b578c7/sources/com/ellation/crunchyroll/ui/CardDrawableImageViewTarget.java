package com.ellation.crunchyroll.ui;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.amazon.aps.iva.d3.a;
import com.amazon.aps.iva.ed.e;
import com.amazon.aps.iva.fd.d;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: CardDrawableImageViewTarget.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0010\u0010\n\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\tH\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/ui/CardDrawableImageViewTarget;", "Lcom/amazon/aps/iva/ed/e;", "Landroid/graphics/drawable/Drawable;", "placeholder", "Lcom/amazon/aps/iva/kb0/q;", "onLoadStarted", "errorDrawable", "onLoadFailed", "resource", "Lcom/amazon/aps/iva/fd/d;", "transition", "onResourceReady", "", "loadingBackgroundRes", "Ljava/lang/Integer;", "errorDrawableRes", "errorBackgroundRes", "Landroid/widget/ImageView;", "view", "<init>", "(Landroid/widget/ImageView;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CardDrawableImageViewTarget extends e {
    public static final int $stable = 0;
    private final Integer errorBackgroundRes;
    private final Integer errorDrawableRes;
    private final Integer loadingBackgroundRes;

    public /* synthetic */ CardDrawableImageViewTarget(ImageView imageView, Integer num, Integer num2, Integer num3, int i, com.amazon.aps.iva.yb0.e eVar) {
        this(imageView, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }

    @Override // com.amazon.aps.iva.ed.f, com.amazon.aps.iva.ed.a, com.amazon.aps.iva.ed.h
    public void onLoadFailed(Drawable drawable) {
        if (this.errorBackgroundRes != null) {
            getView().setBackgroundColor(a.getColor(getView().getContext(), this.errorBackgroundRes.intValue()));
        }
        if (this.errorDrawableRes != null) {
            getView().setImageResource(this.errorDrawableRes.intValue());
            getView().setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    @Override // com.amazon.aps.iva.ed.f, com.amazon.aps.iva.ed.i, com.amazon.aps.iva.ed.a, com.amazon.aps.iva.ed.h
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        if (this.loadingBackgroundRes != null) {
            getView().setBackgroundColor(a.getColor(getView().getContext(), this.loadingBackgroundRes.intValue()));
        }
    }

    @Override // com.amazon.aps.iva.ed.f, com.amazon.aps.iva.ed.h
    public /* bridge */ /* synthetic */ void onResourceReady(Object obj, d dVar) {
        onResourceReady((Drawable) obj, (d<? super Drawable>) dVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDrawableImageViewTarget(ImageView imageView, Integer num, Integer num2, Integer num3) {
        super(imageView);
        j.f(imageView, "view");
        this.loadingBackgroundRes = num;
        this.errorDrawableRes = num2;
        this.errorBackgroundRes = num3;
    }

    public void onResourceReady(Drawable drawable, d<? super Drawable> dVar) {
        j.f(drawable, "resource");
        getView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        super.onResourceReady((CardDrawableImageViewTarget) drawable, (d<? super CardDrawableImageViewTarget>) dVar);
    }
}
