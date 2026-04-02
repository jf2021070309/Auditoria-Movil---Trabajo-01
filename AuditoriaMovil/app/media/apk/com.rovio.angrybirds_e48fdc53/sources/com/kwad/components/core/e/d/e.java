package com.kwad.components.core.e.d;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.bj;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
/* loaded from: classes.dex */
public final class e {
    private static boolean Kp = false;

    private static void T(final AdTemplate adTemplate) {
        if (nS()) {
            return;
        }
        aw(true);
        int abs = Math.abs(com.kwad.sdk.core.config.d.zo());
        if (abs > 0) {
            bj.a(new Runnable() { // from class: com.kwad.components.core.e.d.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    e.aw(false);
                    com.kwad.sdk.core.c.b.AT();
                    if (com.kwad.sdk.core.c.b.isAppOnForeground()) {
                        return;
                    }
                    com.kwad.sdk.core.report.a.a(AdTemplate.this, "wxsmallapp", 1);
                }
            }, null, abs * 1000);
        } else {
            aw(false);
        }
    }

    public static int a(Context context, String str, String str2, String str3, AdTemplate adTemplate) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            com.kwad.sdk.core.report.a.k(adTemplate, 1);
            return -1;
        }
        Cursor cursor = null;
        try {
            try {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
                intent.setComponent(launchIntentForPackage.getComponent());
                context.startActivity(intent);
                Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram"), null, null, new String[]{str, str2, str3, AppEventsConstants.EVENT_PARAM_VALUE_NO, ""}, null);
                if (query != null) {
                    try {
                        com.kwad.sdk.crash.utils.b.closeQuietly(query);
                    } catch (Exception e) {
                        cursor = query;
                        com.kwad.sdk.core.report.a.k(adTemplate, 2);
                        com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                        return -1;
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                        throw th;
                    }
                }
                com.kwad.sdk.crash.utils.b.closeQuietly(query);
                com.kwad.sdk.core.report.a.a(adTemplate, "wxsmallapp", 1, (z.b) null);
                T(adTemplate);
                return 1;
            } catch (Exception e2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void aw(boolean z) {
        Kp = z;
    }

    public static int e(Context context, AdTemplate adTemplate) {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        if (com.kwad.sdk.core.response.b.a.M(ck) || com.kwad.sdk.core.response.b.a.N(ck)) {
            return 0;
        }
        return a(context, ck.adConversionInfo.smallAppJumpInfo.mediaSmallAppId, ck.adConversionInfo.smallAppJumpInfo.originId, ck.adConversionInfo.smallAppJumpInfo.smallAppJumpUrl, adTemplate);
    }

    private static boolean nS() {
        return Kp;
    }
}
