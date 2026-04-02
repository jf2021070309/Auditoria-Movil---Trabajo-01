package com.braze.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J2\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J.\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J,\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lcom/braze/images/IBrazeImageLoader;", "", "Landroid/content/Context;", "context", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "", "imageUrl", "Landroid/widget/ImageView;", "imageView", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "Lcom/amazon/aps/iva/kb0/q;", "renderUrlIntoInAppMessageView", "Lcom/braze/models/cards/Card;", "card", "renderUrlIntoCardView", "Landroid/os/Bundle;", "extras", "Landroid/graphics/Bitmap;", "getPushBitmapFromUrl", "getInAppMessageBitmapFromUrl", "", "isOffline", "setOffline", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IBrazeImageLoader {
    Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage iInAppMessage, String str, BrazeViewBounds brazeViewBounds);

    Bitmap getPushBitmapFromUrl(Context context, Bundle bundle, String str, BrazeViewBounds brazeViewBounds);

    void renderUrlIntoCardView(Context context, Card card, String str, ImageView imageView, BrazeViewBounds brazeViewBounds);

    void renderUrlIntoInAppMessageView(Context context, IInAppMessage iInAppMessage, String str, ImageView imageView, BrazeViewBounds brazeViewBounds);

    void setOffline(boolean z);
}
