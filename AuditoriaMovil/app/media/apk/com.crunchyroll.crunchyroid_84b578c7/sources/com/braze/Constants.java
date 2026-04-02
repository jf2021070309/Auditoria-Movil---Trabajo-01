package com.braze;

import android.os.Build;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/braze/Constants;", "", "", "isAmazonDevice", "Z", "()Z", "isAmazonDevice$annotations", "()V", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Constants {
    public static final Constants INSTANCE = new Constants();
    private static final boolean isAmazonDevice = j.a("Amazon", Build.MANUFACTURER);

    private Constants() {
    }

    public static final boolean isAmazonDevice() {
        return isAmazonDevice;
    }
}
