package com.ellation.crunchyroll.ui.images;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.BestImage;
import com.ellation.crunchyroll.ui.Image;
import java.util.List;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BestImageSizeModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/ui/images/BestImageSizeModelImpl;", "Lcom/ellation/crunchyroll/ui/images/BestImageSizeModel;", "images", "", "Lcom/ellation/crunchyroll/ui/Image;", "(Ljava/util/List;)V", "requestCustomSizeUrl", "", "width", "", "height", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BestImageSizeModelImpl implements BestImageSizeModel {
    private final List<Image> images;

    public BestImageSizeModelImpl(List<Image> list) {
        j.f(list, "images");
        this.images = list;
    }

    @Override // com.ellation.crunchyroll.ui.images.BestImageSizeModel
    public String requestCustomSizeUrl(int i, int i2) {
        String url;
        Image findBestImageForSize = BestImage.Companion.findBestImageForSize(this.images, i);
        if (findBestImageForSize == null || (url = findBestImageForSize.getUrl()) == null) {
            return "";
        }
        return url;
    }
}
