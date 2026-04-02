package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;
/* loaded from: classes2.dex */
public final class n {
    private static n f;
    private int a = 1;
    private int b = 1;
    private int c = 1;
    private int d = 1;
    private com.ironsource.sdk.a.e e = new com.ironsource.sdk.a.e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.utils.n$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            a = iArr;
            try {
                iArr[IronSource.AD_UNIT.OFFERWALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private n() {
        d(this.a);
        e(this.b);
        f(this.d);
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            if (f == null) {
                f = new n();
            }
            nVar = f;
        }
        return nVar;
    }

    private static IronSource.AD_UNIT c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return IronSource.AD_UNIT.BANNER;
                }
                return IronSource.AD_UNIT.INTERSTITIAL;
            }
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        return IronSource.AD_UNIT.OFFERWALL;
    }

    private void d(int i) {
        this.a = i;
        this.e.b(i);
    }

    private void e(int i) {
        this.b = i;
        this.e.a(i);
    }

    private void f(int i) {
        this.d = i;
        this.e.c(i);
    }

    public final synchronized void a(int i) {
        a(c(i));
    }

    public final synchronized void a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return;
        }
        int i = AnonymousClass1.a[ad_unit.ordinal()];
        if (i == 1) {
            this.c++;
        } else if (i == 2) {
            d(this.a + 1);
        } else if (i == 3) {
            e(this.b + 1);
        } else {
            if (i == 4) {
                f(this.d + 1);
            }
        }
    }

    public final synchronized int b(int i) {
        return b(c(i));
    }

    public final synchronized int b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return -1;
        }
        int i = AnonymousClass1.a[ad_unit.ordinal()];
        if (i == 1) {
            return this.c;
        } else if (i == 2) {
            return this.a;
        } else if (i == 3) {
            return this.b;
        } else if (i != 4) {
            return -1;
        } else {
            return this.d;
        }
    }
}
