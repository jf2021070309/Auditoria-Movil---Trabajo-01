package com.braze.push.support;

import android.text.Html;
import android.text.Spanned;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
/* compiled from: HtmlUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TAG", "", "getHtmlSpannedTextIfEnabled", "", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "android-sdk-ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HtmlUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("HtmlUtils");

    public static final CharSequence getHtmlSpannedTextIfEnabled(String str, BrazeConfigurationProvider brazeConfigurationProvider) {
        j.f(str, "<this>");
        j.f(brazeConfigurationProvider, "configurationProvider");
        if (m.b0(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (a) HtmlUtils$getHtmlSpannedTextIfEnabled$1.INSTANCE, 6, (Object) null);
            return str;
        } else if (brazeConfigurationProvider.isPushNotificationHtmlRenderingEnabled()) {
            Spanned fromHtml = Html.fromHtml(str, 0);
            j.e(fromHtml, "{\n        if (Build.VERS…tml(this)\n        }\n    }");
            return fromHtml;
        } else {
            return str;
        }
    }
}
