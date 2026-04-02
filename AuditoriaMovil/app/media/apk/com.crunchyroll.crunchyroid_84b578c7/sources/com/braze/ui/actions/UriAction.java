package com.braze.ui.actions;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.support.UriUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: UriAction.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0004J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0004J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0004J\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0004J\"\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0005J7\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/braze/ui/actions/UriAction;", "Lcom/braze/ui/actions/IAction;", "Landroid/content/Context;", "context", "Lcom/amazon/aps/iva/kb0/q;", "execute", "Landroid/net/Uri;", "uri", "Landroid/os/Bundle;", "extras", "openUriWithWebViewActivity", "openUriWithActionView", "openUriWithWebViewActivityFromPush", "openUriWithActionViewFromPush", "Landroid/content/Intent;", "getWebViewActivityIntent", "getActionViewIntent", "targetIntent", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getIntentArrayWithConfiguredBackStack", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/content/Intent;Lcom/braze/configuration/BrazeConfigurationProvider;)[Landroid/content/Intent;", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "Lcom/braze/enums/Channel;", "channel", "Lcom/braze/enums/Channel;", "getChannel", "()Lcom/braze/enums/Channel;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "", "useWebView", "Z", "getUseWebView", "()Z", "setUseWebView", "(Z)V", "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;ZLcom/braze/enums/Channel;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class UriAction implements IAction {
    private final Channel channel;
    private final Bundle extras;
    private Uri uri;
    private boolean useWebView;

    public UriAction(Uri uri, Bundle bundle, boolean z, Channel channel) {
        j.f(uri, "uri");
        j.f(channel, "channel");
        this.uri = uri;
        this.extras = bundle;
        this.useWebView = z;
        this.channel = channel;
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(Context context) {
        j.f(context, "context");
        if (BrazeFileUtils.isLocalUri(this.uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new UriAction$execute$1(this), 3, (Object) null);
            return;
        }
        BrazeActionParser brazeActionParser = BrazeActionParser.INSTANCE;
        if (brazeActionParser.isBrazeActionUri(this.uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new UriAction$execute$2(this), 2, (Object) null);
            brazeActionParser.execute(context, this.uri, getChannel());
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new UriAction$execute$3(this), 3, (Object) null);
        if (this.useWebView && x.m0(BrazeFileUtils.REMOTE_SCHEMES, this.uri.getScheme())) {
            if (getChannel() == Channel.PUSH) {
                openUriWithWebViewActivityFromPush(context, this.uri, this.extras);
            } else {
                openUriWithWebViewActivity(context, this.uri, this.extras);
            }
        } else if (getChannel() == Channel.PUSH) {
            openUriWithActionViewFromPush(context, this.uri, this.extras);
        } else {
            openUriWithActionView(context, this.uri, this.extras);
        }
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public final Intent getActionViewIntent(Context context, Uri uri, Bundle bundle) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        j.f(context, "context");
        j.f(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            of = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
        } else {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        }
        j.e(queryIntentActivities, "if (Build.VERSION.SDK_IN…ties(intent, 0)\n        }");
        if (queryIntentActivities.size() > 1) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (j.a(next.activityInfo.packageName, context.getPackageName())) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new UriAction$getActionViewIntent$1(next), 3, (Object) null);
                    intent.setPackage(next.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final Intent[] getIntentArrayWithConfiguredBackStack(Context context, Bundle bundle, Intent intent, BrazeConfigurationProvider brazeConfigurationProvider) {
        boolean z;
        j.f(context, "context");
        j.f(intent, "targetIntent");
        j.f(brazeConfigurationProvider, "configurationProvider");
        Intent intent2 = null;
        if (brazeConfigurationProvider.isPushDeepLinkBackStackActivityEnabled()) {
            String pushDeepLinkBackStackActivityClassName = brazeConfigurationProvider.getPushDeepLinkBackStackActivityClassName();
            if (pushDeepLinkBackStackActivityClassName != null && !m.b0(pushDeepLinkBackStackActivityClassName)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, UriAction$getIntentArrayWithConfiguredBackStack$1.INSTANCE, 2, (Object) null);
                intent2 = UriUtils.getMainActivityIntent(context, bundle);
            } else if (UriUtils.isActivityRegisteredInManifest(context, pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new UriAction$getIntentArrayWithConfiguredBackStack$2(pushDeepLinkBackStackActivityClassName), 2, (Object) null);
                if (bundle != null) {
                    intent2 = new Intent().setClassName(context, pushDeepLinkBackStackActivityClassName).setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(bundle);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new UriAction$getIntentArrayWithConfiguredBackStack$4(pushDeepLinkBackStackActivityClassName), 2, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, UriAction$getIntentArrayWithConfiguredBackStack$5.INSTANCE, 2, (Object) null);
        }
        if (intent2 == null) {
            intent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
            return new Intent[]{intent};
        }
        return new Intent[]{intent2, intent};
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final boolean getUseWebView() {
        return this.useWebView;
    }

    public final Intent getWebViewActivityIntent(Context context, Uri uri, Bundle bundle) {
        boolean z;
        Intent intent;
        j.f(context, "context");
        j.f(uri, "uri");
        String customHtmlWebViewActivityClassName = new BrazeConfigurationProvider(context).getCustomHtmlWebViewActivityClassName();
        if (customHtmlWebViewActivityClassName != null && !m.b0(customHtmlWebViewActivityClassName)) {
            z = false;
        } else {
            z = true;
        }
        if (!z && UriUtils.isActivityRegisteredInManifest(context, customHtmlWebViewActivityClassName)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new UriAction$getWebViewActivityIntent$webViewActivityIntent$1(customHtmlWebViewActivityClassName), 3, (Object) null);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
            j.e(intent, "customWebViewActivityCla…ivityClassName)\n        }");
        } else {
            intent = new Intent(context, BrazeWebViewActivity.class);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra(ImagesContract.URL, uri.toString());
        return intent;
    }

    public void openUriWithActionView(Context context, Uri uri, Bundle bundle) {
        j.f(context, "context");
        j.f(uri, "uri");
        Intent actionViewIntent = getActionViewIntent(context, uri, bundle);
        actionViewIntent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        try {
            context.startActivity(actionViewIntent);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new UriAction$openUriWithActionView$1(uri, bundle));
        }
    }

    public final void openUriWithActionViewFromPush(Context context, Uri uri, Bundle bundle) {
        j.f(context, "context");
        j.f(uri, "uri");
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, bundle, getActionViewIntent(context, uri, bundle), new BrazeConfigurationProvider(context)));
        } catch (ActivityNotFoundException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new UriAction$openUriWithActionViewFromPush$1(uri));
        }
    }

    public final void openUriWithWebViewActivity(Context context, Uri uri, Bundle bundle) {
        j.f(context, "context");
        j.f(uri, "uri");
        Intent webViewActivityIntent = getWebViewActivityIntent(context, uri, bundle);
        webViewActivityIntent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        try {
            context.startActivity(webViewActivityIntent);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, UriAction$openUriWithWebViewActivity$1.INSTANCE);
        }
    }

    public final void openUriWithWebViewActivityFromPush(Context context, Uri uri, Bundle bundle) {
        j.f(context, "context");
        j.f(uri, "uri");
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, bundle, getWebViewActivityIntent(context, uri, bundle), new BrazeConfigurationProvider(context)));
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, UriAction$openUriWithWebViewActivityFromPush$1.INSTANCE);
        }
    }
}
