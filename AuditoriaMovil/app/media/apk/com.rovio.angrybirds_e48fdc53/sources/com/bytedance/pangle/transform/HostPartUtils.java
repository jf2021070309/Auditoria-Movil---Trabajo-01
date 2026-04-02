package com.bytedance.pangle.transform;

import android.support.v4.app.FragmentActivity;
/* loaded from: classes.dex */
public class HostPartUtils {
    private Class fragmentActivityClazz;

    /* loaded from: classes.dex */
    static class a {
        private static final HostPartUtils a = new HostPartUtils();
    }

    public HostPartUtils() {
        try {
            this.fragmentActivityClazz = FragmentActivity.class;
        } catch (Throwable th) {
        }
    }

    public static final Class getFragmentActivityClass() {
        return a.a.fragmentActivityClazz;
    }

    public static FragmentActivity getFragmentActivity(Object obj, String str) {
        return (FragmentActivity) ZeusTransformUtils._getActivity(obj, str);
    }
}
