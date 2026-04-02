package com.amazon.aps.iva.tu;

import android.content.Context;
import android.widget.ImageView;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.crunchyroll.ui.images.BestImageSizeModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ImageUtilExtensions.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final void a(ImageUtil imageUtil, Context context, List list, ImageView imageView) {
        j.f(imageUtil, "<this>");
        j.f(list, "imageList");
        if (list.isEmpty()) {
            imageView.setImageBitmap(null);
            return;
        }
        BestImageSizeModel.Companion companion = BestImageSizeModel.Companion;
        List<Image> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (Image image : list2) {
            arrayList.add(new com.ellation.crunchyroll.ui.Image(image.getUrl(), image.getWidth(), image.getHeight()));
        }
        imageUtil.loadRoundImage(context, companion.create(arrayList), imageView, R.drawable.comment_avatar_placeholder, R.drawable.comment_avatar_failure);
    }
}
