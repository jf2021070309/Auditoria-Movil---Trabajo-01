package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.download.DownloadParams;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cn implements com.kwad.sdk.core.d<DownloadParams> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(DownloadParams downloadParams, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        downloadParams.mDownloadid = jSONObject.optString("mDownloadid");
        if (downloadParams.mDownloadid == JSONObject.NULL) {
            downloadParams.mDownloadid = "";
        }
        downloadParams.mAppName = jSONObject.optString("mAppName");
        if (downloadParams.mAppName == JSONObject.NULL) {
            downloadParams.mAppName = "";
        }
        downloadParams.mPkgname = jSONObject.optString("mPkgname");
        if (downloadParams.mPkgname == JSONObject.NULL) {
            downloadParams.mPkgname = "";
        }
        downloadParams.mVersion = jSONObject.optString("mVersion");
        if (downloadParams.mVersion == JSONObject.NULL) {
            downloadParams.mVersion = "";
        }
        downloadParams.mVersionCode = jSONObject.optString("mVersionCode");
        if (downloadParams.mVersionCode == JSONObject.NULL) {
            downloadParams.mVersionCode = "";
        }
        downloadParams.mAppSize = jSONObject.optLong("mAppSize");
        downloadParams.mFileMd5 = jSONObject.optString("mFileMd5");
        if (downloadParams.mFileMd5 == JSONObject.NULL) {
            downloadParams.mFileMd5 = "";
        }
        downloadParams.mFileUrl = jSONObject.optString("mFileUrl");
        if (downloadParams.mFileUrl == JSONObject.NULL) {
            downloadParams.mFileUrl = "";
        }
        downloadParams.mAppIcon = jSONObject.optString("mAppIcon");
        if (downloadParams.mAppIcon == JSONObject.NULL) {
            downloadParams.mAppIcon = "";
        }
        downloadParams.mShortDesc = jSONObject.optString("mShortDesc");
        if (downloadParams.mShortDesc == JSONObject.NULL) {
            downloadParams.mShortDesc = "";
        }
        downloadParams.mTaskId = jSONObject.optInt("mTaskId");
        downloadParams.filePath = jSONObject.optString("filePath");
        if (downloadParams.filePath == JSONObject.NULL) {
            downloadParams.filePath = "";
        }
        downloadParams.requestInstallPermission = jSONObject.optBoolean("requestInstallPermission");
        downloadParams.downloadEnablePause = jSONObject.optBoolean("downloadEnablePause");
        downloadParams.downloadPlace = jSONObject.optInt("downloadPlace");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(DownloadParams downloadParams, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (downloadParams.mDownloadid != null && !downloadParams.mDownloadid.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mDownloadid", downloadParams.mDownloadid);
        }
        if (downloadParams.mAppName != null && !downloadParams.mAppName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mAppName", downloadParams.mAppName);
        }
        if (downloadParams.mPkgname != null && !downloadParams.mPkgname.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mPkgname", downloadParams.mPkgname);
        }
        if (downloadParams.mVersion != null && !downloadParams.mVersion.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mVersion", downloadParams.mVersion);
        }
        if (downloadParams.mVersionCode != null && !downloadParams.mVersionCode.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mVersionCode", downloadParams.mVersionCode);
        }
        if (downloadParams.mAppSize != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mAppSize", downloadParams.mAppSize);
        }
        if (downloadParams.mFileMd5 != null && !downloadParams.mFileMd5.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mFileMd5", downloadParams.mFileMd5);
        }
        if (downloadParams.mFileUrl != null && !downloadParams.mFileUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mFileUrl", downloadParams.mFileUrl);
        }
        if (downloadParams.mAppIcon != null && !downloadParams.mAppIcon.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mAppIcon", downloadParams.mAppIcon);
        }
        if (downloadParams.mShortDesc != null && !downloadParams.mShortDesc.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mShortDesc", downloadParams.mShortDesc);
        }
        if (downloadParams.mTaskId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mTaskId", downloadParams.mTaskId);
        }
        if (downloadParams.filePath != null && !downloadParams.filePath.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "filePath", downloadParams.filePath);
        }
        if (downloadParams.requestInstallPermission) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestInstallPermission", downloadParams.requestInstallPermission);
        }
        if (downloadParams.downloadEnablePause) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadEnablePause", downloadParams.downloadEnablePause);
        }
        if (downloadParams.downloadPlace != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadPlace", downloadParams.downloadPlace);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(DownloadParams downloadParams, JSONObject jSONObject) {
        a2(downloadParams, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(DownloadParams downloadParams, JSONObject jSONObject) {
        return b2(downloadParams, jSONObject);
    }
}
