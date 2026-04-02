package com.ellation.crunchyroll.ui.images;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: BestImageSizeModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/ui/images/BestImageSizeModel;", "", "requestCustomSizeUrl", "", "width", "", "height", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BestImageSizeModel {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: BestImageSizeModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/ui/images/BestImageSizeModel$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/ui/images/BestImageSizeModel;", "images", "", "Lcom/ellation/crunchyroll/ui/Image;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final BestImageSizeModel create(List<Image> list) {
            j.f(list, "images");
            return new BestImageSizeModelImpl(list);
        }
    }

    String requestCustomSizeUrl(int i, int i2);
}
