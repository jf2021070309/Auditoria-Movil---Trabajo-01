package com.braze.ui.inappmessage.views;

import com.braze.enums.inappmessage.CropType;
import kotlin.Metadata;
/* compiled from: IInAppMessageImageView.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H&J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "Lcom/amazon/aps/iva/kb0/q;", "setCornersRadiiPx", "cornersRadius", "setCornersRadiusPx", "Lcom/braze/enums/inappmessage/CropType;", "cropType", "setInAppMessageImageCropType", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IInAppMessageImageView {
    void setCornersRadiiPx(float f, float f2, float f3, float f4);

    void setCornersRadiusPx(float f);

    void setInAppMessageImageCropType(CropType cropType);
}
