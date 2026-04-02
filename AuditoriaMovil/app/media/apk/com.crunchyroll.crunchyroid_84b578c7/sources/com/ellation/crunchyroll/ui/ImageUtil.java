package com.ellation.crunchyroll.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.amazon.aps.iva.ec.f;
import com.amazon.aps.iva.ec.g;
import com.amazon.aps.iva.hd.e;
import com.amazon.aps.iva.nc.l;
import com.amazon.aps.iva.uc.i;
import com.amazon.aps.iva.uc.k;
import com.amazon.aps.iva.uc.m;
import com.amazon.aps.iva.yb0.j;
import com.bumptech.glide.a;
import com.ellation.crunchyroll.ui.images.BestImageSizeModel;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
/* compiled from: ImageUtil.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J4\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000bJ2\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bJ*\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\u0011\u001a\u00020\u000bH\u0007JK\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/ellation/crunchyroll/ui/ImageUtil;", "", "Landroid/content/Context;", "context", "", "imageUrl", "Landroid/widget/ImageView;", "imageView", "Lcom/amazon/aps/iva/kb0/q;", "loadImageIntoView", ImagesContract.URL, "", "failureRes", "placeholder", "loadRoundImage", "Lcom/ellation/crunchyroll/ui/images/BestImageSizeModel;", "image", "placeholderResId", "load", "errorDrawableRes", "errorBackgroundRes", "loadingBackgroundRes", "loadImageIntoCard", "(Landroid/content/Context;Lcom/ellation/crunchyroll/ui/images/BestImageSizeModel;Landroid/widget/ImageView;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "RATIO_16_9", "D", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ImageUtil {
    public static final int $stable = 0;
    public static final ImageUtil INSTANCE = new ImageUtil();
    public static final double RATIO_16_9 = 0.5625d;

    private ImageUtil() {
    }

    public static /* synthetic */ void load$default(ImageUtil imageUtil, Context context, BestImageSizeModel bestImageSizeModel, ImageView imageView, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        imageUtil.load(context, bestImageSizeModel, imageView, i);
    }

    public static /* synthetic */ void loadImageIntoCard$default(ImageUtil imageUtil, Context context, BestImageSizeModel bestImageSizeModel, ImageView imageView, Integer num, Integer num2, Integer num3, int i, Object obj) {
        Integer num4;
        Integer num5;
        Integer num6;
        if ((i & 8) != 0) {
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i & 16) != 0) {
            num5 = null;
        } else {
            num5 = num2;
        }
        if ((i & 32) != 0) {
            num6 = null;
        } else {
            num6 = num3;
        }
        imageUtil.loadImageIntoCard(context, bestImageSizeModel, imageView, num4, num5, num6);
    }

    @SuppressLint({"CheckResult"})
    public final void load(Context context, BestImageSizeModel bestImageSizeModel, ImageView imageView, int i) {
        j.f(context, "context");
        j.f(bestImageSizeModel, "image");
        j.f(imageView, "imageView");
        g b = a.b(context).b(context);
        b.getClass();
        f d = new f(b.b, b, Drawable.class, b.c).E(bestImageSizeModel).G(com.amazon.aps.iva.wc.g.b()).d(l.a);
        if (i != 0) {
            d.k(i);
        }
        d.B(imageView);
    }

    public final void loadImageIntoCard(Context context, BestImageSizeModel bestImageSizeModel, ImageView imageView, Integer num, Integer num2, Integer num3) {
        j.f(context, "context");
        j.f(imageView, "imageView");
        g b = a.b(context).b(context);
        b.getClass();
        f d = new f(b.b, b, Drawable.class, b.c).E(bestImageSizeModel).G(com.amazon.aps.iva.wc.g.b()).d(l.a);
        d.C(new CardDrawableImageViewTarget(imageView, num3, num, num2), null, d, e.a);
    }

    public final void loadImageIntoView(Context context, String str, ImageView imageView) {
        boolean z;
        j.f(context, "context");
        j.f(str, "imageUrl");
        j.f(imageView, "imageView");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            imageView.setImageDrawable(null);
            return;
        }
        g b = a.b(context).b(context);
        b.getClass();
        new f(b.b, b, Drawable.class, b.c).E(str).G(com.amazon.aps.iva.wc.g.b()).d(l.a).B(imageView);
    }

    public final void loadRoundImage(Context context, BestImageSizeModel bestImageSizeModel, ImageView imageView, int i, int i2) {
        j.f(context, "context");
        j.f(bestImageSizeModel, "image");
        j.f(imageView, "imageView");
        g b = a.b(context).b(context);
        b.getClass();
        f G = new f(b.b, b, Drawable.class, b.c).E(bestImageSizeModel).G(com.amazon.aps.iva.wc.g.b());
        G.getClass();
        f fVar = (f) G.u(m.c, new i());
        fVar.getClass();
        ((f) fVar.u(m.b, new k())).d(l.a).k(i).e(i2).B(imageView);
    }

    public final void loadRoundImage(Context context, String str, ImageView imageView, int i, int i2) {
        j.f(context, "context");
        j.f(imageView, "imageView");
        g b = a.b(context).b(context);
        b.getClass();
        f G = new f(b.b, b, Drawable.class, b.c).E(str).G(com.amazon.aps.iva.wc.g.b());
        G.getClass();
        f fVar = (f) G.u(m.c, new i());
        fVar.getClass();
        ((f) fVar.u(m.b, new k())).d(l.a).k(i2).e(i).B(imageView);
    }
}
