package com.amazon.aps.iva.ly;

import android.content.Context;
import android.widget.ImageView;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.crunchyroll.ui.images.BestImageSizeModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ImageUtilExtensions.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final void a(ImageUtil imageUtil, Context context, List<Image> list, ImageView imageView, Integer num, Integer num2, Integer num3) {
        BestImageSizeModel bestImageSizeModel;
        j.f(imageUtil, "<this>");
        j.f(list, "imageList");
        j.f(imageView, "imageView");
        if (!list.isEmpty()) {
            BestImageSizeModel.Companion companion = BestImageSizeModel.Companion;
            List<Image> list2 = list;
            ArrayList arrayList = new ArrayList(r.Y(list2));
            for (Image image : list2) {
                arrayList.add(d(image));
            }
            bestImageSizeModel = companion.create(arrayList);
        } else {
            bestImageSizeModel = null;
            imageView.setImageBitmap(null);
        }
        imageUtil.loadImageIntoCard(context, bestImageSizeModel, imageView, num, num2, num3);
    }

    public static /* synthetic */ void b(ImageUtil imageUtil, Context context, List list, ImageView imageView, Integer num, Integer num2, Integer num3, int i) {
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
        a(imageUtil, context, list, imageView, num4, num5, num6);
    }

    public static final void c(ImageUtil imageUtil, Context context, List<Image> list, ImageView imageView, int i) {
        j.f(imageUtil, "<this>");
        j.f(context, "context");
        j.f(list, "imageList");
        j.f(imageView, "imageView");
        if (list.isEmpty()) {
            imageView.setImageBitmap(null);
            return;
        }
        BestImageSizeModel.Companion companion = BestImageSizeModel.Companion;
        List<Image> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (Image image : list2) {
            arrayList.add(d(image));
        }
        imageUtil.load(context, companion.create(arrayList), imageView, i);
    }

    public static final com.ellation.crunchyroll.ui.Image d(Image image) {
        return new com.ellation.crunchyroll.ui.Image(image.getUrl(), image.getWidth(), image.getHeight());
    }
}
