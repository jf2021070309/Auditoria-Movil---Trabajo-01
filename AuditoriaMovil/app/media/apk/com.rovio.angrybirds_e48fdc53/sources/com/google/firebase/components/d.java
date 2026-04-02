package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
final class d implements e<Context> {
    private d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ d(byte b) {
        this();
    }

    @Override // com.google.firebase.components.e
    public final /* synthetic */ List a(Context context) {
        Bundle a2 = a2(context);
        if (a2 == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : a2.keySet()) {
            if ("com.google.firebase.components.ComponentRegistrar".equals(a2.get(str)) && str.startsWith("com.google.firebase.components:")) {
                arrayList.add(str.substring(31));
            }
        }
        return arrayList;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static Bundle a2(Context context) {
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", "ComponentDiscoveryService has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        return bundle;
    }
}
