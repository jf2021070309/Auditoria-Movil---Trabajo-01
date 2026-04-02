package com.google.firebase.crashlytics.internal.unity;

import android.content.Context;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
/* loaded from: classes2.dex */
public class ResourceUnityVersionProvider implements UnityVersionProvider {
    private static final String UNITY_EDITOR_VERSION = "com.google.firebase.crashlytics.unity_version";
    private static boolean isUnityVersionSet;
    private static String unityVersion;
    private final Context context;

    public static synchronized String resolveUnityEditorVersion(Context context) {
        synchronized (ResourceUnityVersionProvider.class) {
            if (isUnityVersionSet) {
                return unityVersion;
            }
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(context, UNITY_EDITOR_VERSION, "string");
            if (resourcesIdentifier != 0) {
                unityVersion = context.getResources().getString(resourcesIdentifier);
                isUnityVersionSet = true;
                Logger logger = Logger.getLogger();
                logger.v("Unity Editor version is: " + unityVersion);
            }
            return unityVersion;
        }
    }

    public ResourceUnityVersionProvider(Context context) {
        this.context = context;
    }

    @Override // com.google.firebase.crashlytics.internal.unity.UnityVersionProvider
    public String getUnityVersion() {
        return resolveUnityEditorVersion(this.context);
    }
}
