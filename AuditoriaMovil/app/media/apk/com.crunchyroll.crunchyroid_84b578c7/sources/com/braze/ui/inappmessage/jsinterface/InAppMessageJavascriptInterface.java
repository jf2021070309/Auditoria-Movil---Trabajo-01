package com.braze.ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.google.android.gms.ads.AdError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import kotlin.Metadata;
/* compiled from: InAppMessageJavascriptInterface.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b#\u0010$J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\u001c\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0007J6\u0010\u0011\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0014\u001a\u00020\u0005H\u0007J\b\u0010\u0015\u001a\u00020\u0005H\u0007J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8G¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/braze/ui/inappmessage/jsinterface/InAppMessageJavascriptInterface;", "", "", "userId", "sdkAuthSignature", "Lcom/amazon/aps/iva/kb0/q;", "changeUser", "requestImmediateDataFlush", "eventName", "propertiesJSON", "logCustomEventWithJSON", "productId", "", FirebaseAnalytics.Param.PRICE, "currencyCode", "", FirebaseAnalytics.Param.QUANTITY, "logPurchaseWithJSON", "buttonId", "logButtonClick", "logClick", "requestPushPermission", "Lcom/braze/models/outgoing/BrazeProperties;", "parseProperties", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "user", "Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "getUser", "()Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "<init>", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessageHtml;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InAppMessageJavascriptInterface {
    private final Context context;
    private final IInAppMessageHtml inAppMessage;
    private final InAppMessageUserJavascriptInterface user;

    public InAppMessageJavascriptInterface(Context context, IInAppMessageHtml iInAppMessageHtml) {
        j.f(context, "context");
        j.f(iInAppMessageHtml, "inAppMessage");
        this.context = context;
        this.inAppMessage = iInAppMessageHtml;
        this.user = new InAppMessageUserJavascriptInterface(context);
    }

    @JavascriptInterface
    public final void changeUser(String str, String str2) {
        j.f(str, "userId");
        Braze.Companion.getInstance(this.context).changeUser(str, str2);
    }

    @JavascriptInterface
    public final InAppMessageUserJavascriptInterface getUser() {
        return this.user;
    }

    @JavascriptInterface
    public final void logButtonClick(String str) {
        if (str != null) {
            this.inAppMessage.logButtonClick(str);
        }
    }

    @JavascriptInterface
    public final void logClick() {
        this.inAppMessage.logClick();
    }

    @JavascriptInterface
    public final void logCustomEventWithJSON(String str, String str2) {
        Braze.Companion.getInstance(this.context).logCustomEvent(str, parseProperties(str2));
    }

    @JavascriptInterface
    public final void logPurchaseWithJSON(String str, double d, String str2, int i, String str3) {
        Braze.Companion.getInstance(this.context).logPurchase(str, str2, new BigDecimal(String.valueOf(d)), i, parseProperties(str3));
    }

    public final BrazeProperties parseProperties(String str) {
        if (str != null) {
            try {
                if (!j.a(str, AdError.UNDEFINED_DOMAIN) && !j.a(str, "null")) {
                    return new BrazeProperties(new c(str));
                }
                return null;
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new InAppMessageJavascriptInterface$parseProperties$1(str));
                return null;
            }
        }
        return null;
    }

    @JavascriptInterface
    public final void requestImmediateDataFlush() {
        Braze.Companion.getInstance(this.context).requestImmediateDataFlush();
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeInAppMessageManager.Companion companion = BrazeInAppMessageManager.Companion;
        companion.getInstance().setShouldNextUnregisterBeSkipped(true);
        PermissionUtils.requestPushPermissionPrompt(companion.getInstance().getActivity());
    }
}
