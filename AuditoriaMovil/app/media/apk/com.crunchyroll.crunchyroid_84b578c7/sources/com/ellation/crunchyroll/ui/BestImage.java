package com.ellation.crunchyroll.ui;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: BestImage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ellation/crunchyroll/ui/BestImage;", "", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BestImage {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: BestImage.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/ui/BestImage$Companion;", "", "()V", "findBestImageForSize", "Lcom/ellation/crunchyroll/ui/Image;", "images", "", "desiredWidth", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Image findBestImageForSize(List<Image> list, int i) {
            boolean z;
            j.f(list, "images");
            ArrayList<Image> arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String url = ((Image) next).getUrl();
                if (url != null && url.length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            Image image = (Image) arrayList.get(0);
            for (Image image2 : arrayList) {
                int width = image2.getWidth();
                int width2 = image.getWidth();
                if (width2 >= i || width <= width2) {
                    if (i <= width && width < width2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
                image = image2;
            }
            return image;
        }
    }
}
