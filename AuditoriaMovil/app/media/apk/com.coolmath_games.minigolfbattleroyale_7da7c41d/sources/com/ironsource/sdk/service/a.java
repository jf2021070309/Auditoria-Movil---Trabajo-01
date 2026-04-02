package com.ironsource.sdk.service;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/service/AdInstanceTimingService;", "", "()V", "instanceToTimingValuesMapping", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getInstanceToTimingValuesMapping", "()Ljava/util/HashMap;", "addTimingValueForInstance", "", "instance", "timingValue", "clearTimingValueForInstance", "getTimeElapsedForInstanceTimer", "getTimingValueForInstance", "sdk5_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class a {
    public static final a a = new a();
    private static final HashMap<String, Long> b = new HashMap<>();

    private a() {
    }

    public static long a(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long it = b.get(instance);
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            return it.longValue();
        }
        return -1L;
    }

    public static boolean a(String instance, long j) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if ((instance.length() == 0) || b.containsKey(instance)) {
            return false;
        }
        b.put(instance, Long.valueOf(j));
        return true;
    }

    public static boolean b(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (b.get(instance) != null) {
            b.remove(instance);
            return true;
        }
        return false;
    }

    public static long c(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long it = b.get(instance);
        if (it != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            return currentTimeMillis - it.longValue();
        }
        return -1L;
    }
}
