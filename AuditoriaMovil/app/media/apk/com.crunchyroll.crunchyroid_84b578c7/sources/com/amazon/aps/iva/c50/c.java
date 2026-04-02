package com.amazon.aps.iva.c50;

import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: WatchlistItemLayout.kt */
/* loaded from: classes2.dex */
public interface c extends com.amazon.aps.iva.wy.h {
    void setItemState(String str);

    void setParentTitle(String str);

    void setThumbnailImage(List<Image> list);

    void t(Panel panel);
}
