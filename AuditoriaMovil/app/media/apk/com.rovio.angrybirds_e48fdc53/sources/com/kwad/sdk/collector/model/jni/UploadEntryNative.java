package com.kwad.sdk.collector.model.jni;

import com.kwad.sdk.collector.AppStatusNative;
import com.kwad.sdk.collector.model.e;
import com.kwad.sdk.utils.t;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class UploadEntryNative extends NativeObject implements e {
    public UploadEntryNative() {
        this.mPtr = AppStatusNative.nativeCreateUploadEntry();
    }

    public UploadEntryNative(long j) {
        this.mPtr = j;
    }

    private static String a(UploadEntryNative uploadEntryNative) {
        return AppStatusNative.uploadEntryGetPackageName(uploadEntryNative);
    }

    private String yK() {
        try {
            String uploadEntryGetPackageName = AppStatusNative.uploadEntryGetPackageName(this);
            String uploadEntryGetOriginFilePath = AppStatusNative.uploadEntryGetOriginFilePath(this);
            return uploadEntryGetOriginFilePath.substring(uploadEntryGetOriginFilePath.indexOf(uploadEntryGetPackageName)).replaceFirst(uploadEntryGetPackageName, "");
        } catch (Throwable th) {
            return null;
        }
    }

    @Override // com.kwad.sdk.collector.model.jni.NativeObject
    public void destroy() {
        if (this.mPtr != 0) {
            AppStatusNative.nativeDeleteUploadEntry(this.mPtr);
            this.mPtr = 0L;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UploadEntryNative uploadEntryNative = (UploadEntryNative) obj;
            String uploadEntryGetPackageName = AppStatusNative.uploadEntryGetPackageName(this);
            String uploadEntryGetOriginFilePath = AppStatusNative.uploadEntryGetOriginFilePath(this);
            if (uploadEntryGetPackageName == null ? a(uploadEntryNative) != null : !uploadEntryGetPackageName.equals(a(uploadEntryNative))) {
                return false;
            }
            String uploadEntryGetOriginFilePath2 = AppStatusNative.uploadEntryGetOriginFilePath(uploadEntryNative);
            if (uploadEntryGetOriginFilePath != null) {
                return uploadEntryGetOriginFilePath.equals(uploadEntryGetOriginFilePath2);
            }
            if (uploadEntryGetOriginFilePath2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String uploadEntryGetPackageName = AppStatusNative.uploadEntryGetPackageName(this);
        String uploadEntryGetOriginFilePath = AppStatusNative.uploadEntryGetOriginFilePath(this);
        return ((uploadEntryGetPackageName != null ? uploadEntryGetPackageName.hashCode() : 0) * 31) + (uploadEntryGetOriginFilePath != null ? uploadEntryGetOriginFilePath.hashCode() : 0);
    }

    @Override // com.kwad.sdk.core.b
    public void parseJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString(DBDefinition.PACKAGE_NAME);
        String optString2 = jSONObject.optString("originFilePath");
        AppStatusNative.uploadEntrySetPackageName(this, optString);
        AppStatusNative.uploadEntrySetOriginFilePath(this, optString2);
    }

    @Override // com.kwad.sdk.core.b
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, DBDefinition.PACKAGE_NAME, AppStatusNative.uploadEntryGetPackageName(this));
        t.putValue(jSONObject, "originFilePath", AppStatusNative.uploadEntryGetOriginFilePath(this));
        return jSONObject;
    }

    public String toString() {
        return "UploadEntry{packageName='" + AppStatusNative.uploadEntryGetPackageName(this) + "', originFile=" + AppStatusNative.uploadEntryGetOriginFilePath(this) + '}';
    }

    @Override // com.kwad.sdk.collector.model.e
    public final JSONObject yI() {
        try {
            JSONObject jSONObject = new JSONObject();
            t.putValue(jSONObject, DBDefinition.PACKAGE_NAME, AppStatusNative.uploadEntryGetPackageName(this));
            t.putValue(jSONObject, "content", com.kwad.sdk.collector.e.ck(AppStatusNative.uploadEntryGetOriginFilePath(this)));
            t.putValue(jSONObject, "fileName", yK());
            return jSONObject;
        } catch (Throwable th) {
            return null;
        }
    }
}
