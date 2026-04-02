package com.braze.support;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/braze/support/PackageUtils;", "", "Landroid/content/Context;", "context", "", "getResourcePackageName", "packageName", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PackageUtils {
    public static final PackageUtils INSTANCE = new PackageUtils();
    private static String packageName;

    private PackageUtils() {
    }

    public static final String getResourcePackageName(Context context) {
        j.f(context, "context");
        String str = packageName;
        if (str == null) {
            String packageName2 = context.getPackageName();
            packageName = packageName2;
            if (packageName2 == null) {
                return "unknown.package";
            }
            return packageName2;
        }
        return str;
    }
}
