package com.braze.ui.inappmessage.utils;

import android.content.Context;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.xe0.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye0.c;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.MessageType;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.models.inappmessage.IInAppMessageZippedAssetHtml;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.io.File;
import kotlin.Metadata;
/* compiled from: BackgroundInAppMessagePreparer.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0007J8\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u001b\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u001bH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/braze/ui/inappmessage/utils/BackgroundInAppMessagePreparer;", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessageToPrepare", "Lcom/amazon/aps/iva/kb0/q;", "prepareInAppMessageForDisplay", "prepareInAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageZippedAssetHtml;", "inAppMessageHtml", "", "prepareInAppMessageWithZippedAssetHtml", "inAppMessage", "prepareInAppMessageWithBitmapDownload", "", "localImageUrl", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "inAppMessageWithImage", "Lcom/braze/images/IBrazeImageLoader;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "handleLocalImage", "getViewBoundsByType", "displayPreparedInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/braze/models/inappmessage/InAppMessageHtml;", "prepareInAppMessageWithHtml", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BackgroundInAppMessagePreparer {
    public static final BackgroundInAppMessagePreparer INSTANCE = new BackgroundInAppMessagePreparer();

    /* compiled from: BackgroundInAppMessagePreparer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BackgroundInAppMessagePreparer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object displayPreparedInAppMessage(IInAppMessage iInAppMessage, d<? super q> dVar) {
        c cVar = r0.a;
        Object g = i.g(dVar, k.a, new BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2(this, iInAppMessage, null));
        if (g == a.COROUTINE_SUSPENDED) {
            return g;
        }
        return q.a;
    }

    private final BrazeViewBounds getViewBoundsByType(IInAppMessage iInAppMessage) {
        int i = WhenMappings.$EnumSwitchMapping$0[iInAppMessage.getMessageType().ordinal()];
        if (i != 3) {
            if (i != 4) {
                return BrazeViewBounds.NO_BOUNDS;
            }
            return BrazeViewBounds.IN_APP_MESSAGE_MODAL;
        }
        return BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP;
    }

    private final boolean handleLocalImage(String str, IInAppMessageWithImage iInAppMessageWithImage, IBrazeImageLoader iBrazeImageLoader, Context context, IInAppMessage iInAppMessage, BrazeViewBounds brazeViewBounds) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new BackgroundInAppMessagePreparer$handleLocalImage$1(str), 2, (Object) null);
        iInAppMessageWithImage.setBitmap(iBrazeImageLoader.getInAppMessageBitmapFromUrl(context, iInAppMessage, str, brazeViewBounds));
        if (iInAppMessageWithImage.getBitmap() != null) {
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new BackgroundInAppMessagePreparer$handleLocalImage$2(str), 3, (Object) null);
        iInAppMessageWithImage.setLocalImageUrl(null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInAppMessage prepareInAppMessage(IInAppMessage iInAppMessage) {
        if (iInAppMessage.isControl()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessage$1.INSTANCE, 3, (Object) null);
            return iInAppMessage;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessage$2.INSTANCE, 3, (Object) null);
        int i = WhenMappings.$EnumSwitchMapping$0[iInAppMessage.getMessageType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (!prepareInAppMessageWithBitmapDownload(iInAppMessage)) {
                    BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessage$4.INSTANCE, 2, (Object) null);
                    return null;
                }
            } else {
                prepareInAppMessageWithHtml((InAppMessageHtml) iInAppMessage);
            }
        } else if (!prepareInAppMessageWithZippedAssetHtml((IInAppMessageZippedAssetHtml) iInAppMessage)) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessage$3.INSTANCE, 2, (Object) null);
            return null;
        }
        return iInAppMessage;
    }

    public static final void prepareInAppMessageForDisplay(IInAppMessage iInAppMessage) {
        j.f(iInAppMessage, "inAppMessageToPrepare");
        i.d(BrazeCoroutineScope.INSTANCE, null, null, new BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(iInAppMessage, null), 3);
    }

    public static final boolean prepareInAppMessageWithBitmapDownload(IInAppMessage iInAppMessage) {
        boolean z;
        boolean z2;
        if (!(iInAppMessage instanceof IInAppMessageWithImage)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$1.INSTANCE, 3, (Object) null);
            return false;
        }
        IInAppMessageWithImage iInAppMessageWithImage = (IInAppMessageWithImage) iInAppMessage;
        if (iInAppMessageWithImage.getBitmap() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$2.INSTANCE, 2, (Object) null);
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = INSTANCE;
        BrazeViewBounds viewBoundsByType = backgroundInAppMessagePreparer.getViewBoundsByType(iInAppMessage);
        Context applicationContext = BrazeInAppMessageManager.Companion.getInstance().getApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, backgroundInAppMessagePreparer, BrazeLogger.Priority.W, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$3.INSTANCE, 2, (Object) null);
            return false;
        }
        IBrazeImageLoader imageLoader = Braze.Companion.getInstance(applicationContext).getImageLoader();
        String localImageUrl = iInAppMessageWithImage.getLocalImageUrl();
        if (localImageUrl != null && !m.b0(localImageUrl)) {
            z = false;
        } else {
            z = true;
        }
        if (!z && backgroundInAppMessagePreparer.handleLocalImage(localImageUrl, iInAppMessageWithImage, imageLoader, applicationContext, iInAppMessage, viewBoundsByType)) {
            return true;
        }
        String remoteImageUrl = iInAppMessageWithImage.getRemoteImageUrl();
        if (remoteImageUrl != null && !m.b0(remoteImageUrl)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, backgroundInAppMessagePreparer, BrazeLogger.Priority.I, (Throwable) null, new BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$4(remoteImageUrl), 2, (Object) null);
            iInAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(applicationContext, iInAppMessage, remoteImageUrl, viewBoundsByType));
            if (iInAppMessageWithImage.getBitmap() == null) {
                return false;
            }
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, backgroundInAppMessagePreparer, priority, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$5.INSTANCE, 2, (Object) null);
        if (!(iInAppMessageWithImage instanceof InAppMessageFull)) {
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, backgroundInAppMessagePreparer, priority, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$6.INSTANCE, 2, (Object) null);
        return false;
    }

    public static final boolean prepareInAppMessageWithZippedAssetHtml(IInAppMessageZippedAssetHtml iInAppMessageZippedAssetHtml) {
        boolean z;
        boolean z2;
        boolean z3;
        j.f(iInAppMessageZippedAssetHtml, "inAppMessageHtml");
        String localAssetsDirectoryUrl = iInAppMessageZippedAssetHtml.getLocalAssetsDirectoryUrl();
        if (localAssetsDirectoryUrl != null && !m.b0(localAssetsDirectoryUrl)) {
            z = false;
        } else {
            z = true;
        }
        if (!z && new File(localAssetsDirectoryUrl).exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, new BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$1(localAssetsDirectoryUrl), 2, (Object) null);
            return true;
        }
        String assetsZipRemoteUrl = iInAppMessageZippedAssetHtml.getAssetsZipRemoteUrl();
        if (assetsZipRemoteUrl != null && !m.b0(assetsZipRemoteUrl)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$2.INSTANCE, 2, (Object) null);
            return true;
        }
        Context applicationContext = BrazeInAppMessageManager.Companion.getInstance().getApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$3.INSTANCE, 2, (Object) null);
            return false;
        }
        String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(applicationContext), assetsZipRemoteUrl);
        if (localHtmlUrlFromRemoteUrl != null && !m.b0(localHtmlUrlFromRemoteUrl)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$4(localHtmlUrlFromRemoteUrl), 3, (Object) null);
            iInAppMessageZippedAssetHtml.setLocalAssetsDirectoryUrl(localHtmlUrlFromRemoteUrl);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$5(iInAppMessageZippedAssetHtml, localHtmlUrlFromRemoteUrl), 2, (Object) null);
        return false;
    }

    public final void prepareInAppMessageWithHtml(InAppMessageHtml inAppMessageHtml) {
        j.f(inAppMessageHtml, "inAppMessage");
        if (inAppMessageHtml.getLocalPrefetchedAssetPaths().isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$1.INSTANCE, 3, (Object) null);
            return;
        }
        String message = inAppMessageHtml.getMessage();
        if (message == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$2.INSTANCE, 3, (Object) null);
        } else {
            inAppMessageHtml.setMessage(WebContentUtils.replacePrefetchedUrlsWithLocalAssets(message, inAppMessageHtml.getLocalPrefetchedAssetPaths()));
        }
    }
}
