package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.c.c;
/* loaded from: classes.dex */
public final class r {

    /* loaded from: classes.dex */
    public interface a {
        b a();

        boolean a(String str);
    }

    /* loaded from: classes.dex */
    public enum b {
        Mraid,
        Video
    }

    /* renamed from: com.fyber.inneractive.sdk.util.r$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.Mraid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static boolean a(b bVar) {
        int i = AnonymousClass1.a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return c.a.a.c(com.fyber.inneractive.sdk.j.a.RETURNED_ADTYPE_VAST);
        }
        return c.a.a.c(com.fyber.inneractive.sdk.j.a.RETURNED_ADTYPE_HTML);
    }
}
