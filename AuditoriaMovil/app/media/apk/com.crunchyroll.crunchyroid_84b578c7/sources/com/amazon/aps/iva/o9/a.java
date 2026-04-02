package com.amazon.aps.iva.o9;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.k9.n;
/* compiled from: SystemJobInfoConverter.java */
/* loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ int b = 0;
    public final ComponentName a;

    /* compiled from: SystemJobInfoConverter.java */
    /* renamed from: com.amazon.aps.iva.o9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0560a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n.values().length];
            a = iArr;
            try {
                iArr[n.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[n.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[n.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[n.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[n.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        m.e("SystemJobInfoConverter");
    }

    public a(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
