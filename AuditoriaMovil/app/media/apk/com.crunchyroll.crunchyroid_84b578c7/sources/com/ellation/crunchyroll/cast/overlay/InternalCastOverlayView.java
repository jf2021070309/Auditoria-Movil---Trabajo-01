package com.ellation.crunchyroll.cast.overlay;

import androidx.lifecycle.g;
import com.amazon.aps.iva.cf.a;
import com.amazon.aps.iva.cf.c;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.wy.h;
import com.ellation.crunchyroll.api.etp.model.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InternalCastOverlayLayout.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\b\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0007H&¨\u0006\u000f"}, d2 = {"Lcom/ellation/crunchyroll/cast/overlay/InternalCastOverlayView;", "Lcom/amazon/aps/iva/cf/c;", "Lcom/amazon/aps/iva/wy/h;", "Lcom/amazon/aps/iva/i5/o;", "", "Lcom/ellation/crunchyroll/api/etp/model/Image;", "images", "Lcom/amazon/aps/iva/kb0/q;", "loadCastPreviewImage", "setConnectingToCastDeviceText", "", "friendlyName", "setCastSessionFriendlyText", "showCastingLayout", "hideCastingLayout", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface InternalCastOverlayView extends c, h, o {
    @Override // com.amazon.aps.iva.i5.o
    /* synthetic */ g getLifecycle();

    void hideCastingLayout();

    void loadCastPreviewImage(List<Image> list);

    void setCastSessionFriendlyText(String str);

    void setConnectingToCastDeviceText();

    @Override // com.amazon.aps.iva.cf.c
    /* synthetic */ void setListener(a aVar);

    void showCastingLayout();
}
