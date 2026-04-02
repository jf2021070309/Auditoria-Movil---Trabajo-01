package com.rovio.fusion;
/* loaded from: classes2.dex */
public class ApplicationVersion {
    public static String getApplicationVersionString() {
        try {
            return Globals.getActivity().getPackageManager().getPackageInfo(Globals.getActivity().getPackageName(), 0).versionName;
        } catch (Exception e) {
            return "";
        }
    }
}
