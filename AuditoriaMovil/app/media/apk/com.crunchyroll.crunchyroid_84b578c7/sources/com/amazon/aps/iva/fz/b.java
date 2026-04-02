package com.amazon.aps.iva.fz;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.mf0.a;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: BrazeInAppMessageListener.kt */
/* loaded from: classes2.dex */
public final class b extends DefaultInAppMessageManagerListener {
    public final Context a;

    public b(Application application) {
        this.a = application;
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
    public final boolean onInAppMessageButtonClicked(IInAppMessage iInAppMessage, MessageButton messageButton) {
        List<ResolveInfo> queryIntentActivities;
        Object obj;
        PackageManager.ResolveInfoFlags of;
        com.amazon.aps.iva.yb0.j.f(iInAppMessage, "inAppMessage");
        com.amazon.aps.iva.yb0.j.f(messageButton, "button");
        if (iInAppMessage.getOpenUriInWebView()) {
            return false;
        }
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(false);
        if (messageButton.getUri() == null) {
            return false;
        }
        Uri uri = messageButton.getUri();
        com.amazon.aps.iva.yb0.j.c(uri);
        Intent addCategory = new Intent("android.intent.action.VIEW").setData(uri).addCategory("android.intent.category.DEFAULT");
        com.amazon.aps.iva.yb0.j.e(addCategory, "Intent(Intent.ACTION_VIE…ategory(CATEGORY_DEFAULT)");
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 33) {
            PackageManager packageManager = context.getPackageManager();
            of = PackageManager.ResolveInfoFlags.of((long) MediaStatus.COMMAND_FOLLOW);
            queryIntentActivities = packageManager.queryIntentActivities(addCategory, of);
        } else {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(addCategory, Cast.MAX_MESSAGE_LENGTH);
        }
        com.amazon.aps.iva.yb0.j.e(queryIntentActivities, "if (Build.VERSION.SDK_IN…H_DEFAULT_ONLY)\n        }");
        List<ResolveInfo> list = queryIntentActivities;
        ArrayList arrayList = new ArrayList(r.Y(list));
        for (ResolveInfo resolveInfo : list) {
            arrayList.add(resolveInfo.activityInfo.packageName);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (com.amazon.aps.iva.yb0.j.a((String) obj, context.getPackageName())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        addCategory.setPackage((String) obj);
        addCategory.setFlags(872415232);
        try {
            context.startActivity(addCategory);
            return true;
        } catch (ActivityNotFoundException unused) {
            a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
            Uri uri2 = messageButton.getUri();
            c0515a.a("Couldn't find an Activity to handle URI " + uri2, new Object[0]);
            return false;
        }
    }
}
