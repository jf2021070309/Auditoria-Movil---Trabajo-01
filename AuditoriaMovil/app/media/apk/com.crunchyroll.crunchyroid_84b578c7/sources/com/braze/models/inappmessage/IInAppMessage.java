package com.braze.models.inappmessage;

import android.net.Uri;
import com.amazon.aps.iva.if0.c;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.models.IPutIntoJson;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\u0006H&R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001d\u001a\u00020\u00188&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\u00020\u00188&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010#\u001a\u00020\u00188&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\"\u0010*\u001a\u00020\n8&@&X¦\u000e¢\u0006\u0012\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010.\u001a\u00020\n8&@&X¦\u000e¢\u0006\u0012\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010%\"\u0004\b,\u0010'R\u001c\u00101\u001a\u00020\u00188&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u0014\u00102\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010%R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001c\u0010@\u001a\u00020;8&@&X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010C\u001a\u00020\u00188&@&X¦\u000e¢\u0006\f\u001a\u0004\bA\u0010\u001a\"\u0004\bB\u0010\u001cR\u001e\u0010F\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010\u000f\"\u0004\bE\u0010\u0011R\u001c\u0010L\u001a\u00020G8&@&X¦\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010R\u001a\u00020M8&@&X¦\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001c\u0010X\u001a\u00020S8&@&X¦\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020\n8&@&X¦\u000e¢\u0006\u0012\u0012\u0004\b[\u0010)\u001a\u0004\bY\u0010%\"\u0004\bZ\u0010'R\u0014\u0010`\u001a\u00020]8&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006aÀ\u0006\u0001"}, d2 = {"Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/models/IPutIntoJson;", "Lcom/amazon/aps/iva/if0/c;", "", "", "remotePathToLocalAssetMap", "Lcom/amazon/aps/iva/kb0/q;", "setLocalPrefetchedAssetPaths", "", "getRemoteAssetPathsForPrefetch", "", "logImpression", "logClick", "onAfterClosed", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "message", "getExtras", "()Ljava/util/Map;", "setExtras", "(Ljava/util/Map;)V", "extras", "", "getDurationInMilliseconds", "()I", "setDurationInMilliseconds", "(I)V", "durationInMilliseconds", "getBackgroundColor", "setBackgroundColor", "backgroundColor", "getIconColor", "setIconColor", "iconColor", "getAnimateOut", "()Z", "setAnimateOut", "(Z)V", "getAnimateOut$annotations", "()V", "animateOut", "getAnimateIn", "setAnimateIn", "getAnimateIn$annotations", "animateIn", "getIconBackgroundColor", "setIconBackgroundColor", "iconBackgroundColor", "isControl", "Lcom/braze/enums/inappmessage/ClickAction;", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lcom/braze/enums/inappmessage/DismissType;", "getDismissType", "()Lcom/braze/enums/inappmessage/DismissType;", "setDismissType", "(Lcom/braze/enums/inappmessage/DismissType;)V", "dismissType", "getMessageTextColor", "setMessageTextColor", "messageTextColor", "getIcon", "setIcon", "icon", "Lcom/braze/enums/inappmessage/Orientation;", "getOrientation", "()Lcom/braze/enums/inappmessage/Orientation;", "setOrientation", "(Lcom/braze/enums/inappmessage/Orientation;)V", "orientation", "Lcom/braze/enums/inappmessage/CropType;", "getCropType", "()Lcom/braze/enums/inappmessage/CropType;", "setCropType", "(Lcom/braze/enums/inappmessage/CropType;)V", "cropType", "", "getExpirationTimestamp", "()J", "setExpirationTimestamp", "(J)V", "expirationTimestamp", "getOpenUriInWebView", "setOpenUriInWebView", "getOpenUriInWebView$annotations", "openUriInWebView", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IInAppMessage extends IPutIntoJson<c> {
    boolean getAnimateIn();

    boolean getAnimateOut();

    int getBackgroundColor();

    ClickAction getClickAction();

    CropType getCropType();

    DismissType getDismissType();

    int getDurationInMilliseconds();

    long getExpirationTimestamp();

    Map<String, String> getExtras();

    String getIcon();

    int getIconBackgroundColor();

    int getIconColor();

    String getMessage();

    int getMessageTextColor();

    MessageType getMessageType();

    boolean getOpenUriInWebView();

    Orientation getOrientation();

    List<String> getRemoteAssetPathsForPrefetch();

    Uri getUri();

    boolean isControl();

    boolean logClick();

    boolean logImpression();

    void onAfterClosed();

    void setAnimateIn(boolean z);

    void setAnimateOut(boolean z);

    void setExpirationTimestamp(long j);

    void setLocalPrefetchedAssetPaths(Map<String, String> map);
}
