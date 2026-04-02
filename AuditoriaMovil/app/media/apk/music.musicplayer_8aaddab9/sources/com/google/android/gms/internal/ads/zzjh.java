package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* loaded from: classes.dex */
public final /* synthetic */ class zzjh implements Comparator {
    public static final Comparator zza = new zzjh();

    private zzjh() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        int i2 = zzjt.zza;
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }
}
