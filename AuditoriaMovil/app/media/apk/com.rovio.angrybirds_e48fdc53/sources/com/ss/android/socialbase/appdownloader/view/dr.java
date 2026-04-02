package com.ss.android.socialbase.appdownloader.view;

import android.app.Fragment;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.socialbase.appdownloader.q.g;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
/* loaded from: classes3.dex */
public class dr extends Fragment {
    public void dr() {
        try {
            startActivityForResult(bn(), 1000);
        } catch (Throwable th) {
            try {
                startActivityForResult(ge(), 1000);
            } catch (Throwable th2) {
                try {
                    startActivityForResult(o(), 1000);
                } catch (Throwable th3) {
                    startActivityForResult(g(), 1000);
                }
            }
        }
    }

    public Intent ge() {
        Context q = q();
        if (q == null) {
            return null;
        }
        String packageName = q.getPackageName();
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (lowerCase.contains(DownloadConstants.LOWER_OPPO)) {
                Intent intent = new Intent();
                intent.putExtra(DBDefinition.PACKAGE_NAME, packageName);
                intent.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity"));
                return intent;
            } else if (lowerCase.contains("vivo")) {
                Intent intent2 = new Intent();
                intent2.putExtra("packagename", packageName);
                if (Build.VERSION.SDK_INT >= 25) {
                    intent2.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"));
                } else {
                    intent2.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity"));
                }
                return intent2;
            } else if (lowerCase.contains("meizu") && Build.VERSION.SDK_INT < 25) {
                Intent intent3 = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                intent3.putExtra(DBDefinition.PACKAGE_NAME, packageName);
                intent3.setComponent(new ComponentName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity"));
                return intent3;
            }
        }
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + q.getPackageName()));
    }

    private Context q() {
        Context appContext = DownloadComponentManager.getAppContext();
        if (appContext == null && getActivity() != null && !getActivity().isFinishing()) {
            return getActivity().getApplicationContext();
        }
        return appContext;
    }

    public Intent o() {
        Context q = q();
        if (q == null) {
            return null;
        }
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + q.getPackageName()));
    }

    private Intent bn() {
        Context q = q();
        if (q == null) {
            return null;
        }
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        String packageName = q.getPackageName();
        intent.putExtra("package", packageName);
        intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
        intent.putExtra("app_package", packageName);
        int i = q.getApplicationInfo().uid;
        intent.putExtra("uid", i);
        intent.putExtra("app_uid", i);
        return intent;
    }

    public static Intent g() {
        return new Intent("android.settings.APPLICATION_SETTINGS");
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (g.dr()) {
            g.dr(true);
        } else {
            g.dr(false);
        }
    }
}
