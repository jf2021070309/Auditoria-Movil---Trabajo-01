package com.ss.android.socialbase.appdownloader.dr;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.DbJsonConstants;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import java.io.File;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class g {
    public static dr dr(Context context, String str, JSONObject jSONObject, DownloadInfo downloadInfo) {
        if (downloadInfo == null || context == null || jSONObject == null) {
            return null;
        }
        String savePath = downloadInfo.getSavePath();
        if (TextUtils.isEmpty(savePath) || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(savePath);
        DownloadSetting obtain = DownloadSetting.obtain(downloadInfo);
        if (str.equals("v1")) {
            return new wb(context, obtain, downloadInfo.getTargetFilePath());
        }
        if (str.equals("v2")) {
            return new t(context, obtain, file.getAbsolutePath());
        }
        if (str.equals("v3")) {
            return new yk(context, obtain, file.getAbsolutePath());
        }
        if (str.equals("o1")) {
            return new rb(context, obtain, file.getAbsolutePath());
        }
        if (str.equals("o2")) {
            return new xu(context, obtain, file.getAbsolutePath());
        }
        if (str.equals("o3")) {
            String dBJsonString = downloadInfo.getDBJsonString(DbJsonConstants.CONTENT_URI);
            if (TextUtils.isEmpty(dBJsonString)) {
                return null;
            }
            return new ll(context, obtain, file.getAbsolutePath(), dBJsonString, downloadInfo.getName());
        } else if (str.equals("custom")) {
            return new o(context, obtain, file.getAbsolutePath(), jSONObject);
        } else {
            if (!str.equals("vbi")) {
                return null;
            }
            IDownloadFileUriProvider downloadFileUriProvider = Downloader.getInstance(context).getDownloadFileUriProvider(downloadInfo.getId());
            String g = com.ss.android.socialbase.appdownloader.g.wb().g();
            return new cu(context, obtain, com.ss.android.socialbase.appdownloader.o.dr(downloadInfo.getId(), downloadFileUriProvider, context, g, new File(downloadInfo.getSavePath() + File.separator + downloadInfo.getName())).toString());
        }
    }

    public static boolean dr(Context context, String str, JSONObject jSONObject, DownloadSetting downloadSetting) {
        if (context == null || str == null) {
            return false;
        }
        dr drVar = null;
        String ge = com.ss.android.socialbase.appdownloader.o.ge();
        if (TextUtils.isEmpty(ge) || TextUtils.isEmpty(str)) {
            return false;
        }
        if (com.ss.android.socialbase.appdownloader.bn.q.o() && str.equals("v1")) {
            drVar = new wb(context, downloadSetting, ge);
        } else if (com.ss.android.socialbase.appdownloader.bn.q.o() && str.equals("v2")) {
            drVar = new t(context, downloadSetting, ge);
        } else if (com.ss.android.socialbase.appdownloader.bn.q.o() && str.equals("v3")) {
            drVar = new yk(context, downloadSetting, ge);
        } else if (com.ss.android.socialbase.appdownloader.bn.q.g() && str.equals("o1")) {
            drVar = new rb(context, downloadSetting, ge);
        } else if (com.ss.android.socialbase.appdownloader.bn.q.g() && str.equals("o2")) {
            drVar = new xu(context, downloadSetting, ge);
        } else if (com.ss.android.socialbase.appdownloader.bn.q.g() && str.equals("o3")) {
            drVar = new ll(context, downloadSetting, ge, ge, ge);
        } else if (com.ss.android.socialbase.appdownloader.bn.q.o() && str.equals("custom")) {
            drVar = new o(context, downloadSetting, ge, jSONObject);
        } else if (com.ss.android.socialbase.appdownloader.bn.q.o() && str.equals("vbi")) {
            drVar = new cu(context, downloadSetting, ge);
        }
        return drVar != null && drVar.dr();
    }
}
