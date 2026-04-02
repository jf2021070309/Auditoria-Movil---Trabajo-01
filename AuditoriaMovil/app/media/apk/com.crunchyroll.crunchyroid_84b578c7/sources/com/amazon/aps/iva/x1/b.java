package com.amazon.aps.iva.x1;

import com.amazon.aps.iva.kb0.h;
/* compiled from: TextActionModeCallback.android.kt */
/* loaded from: classes.dex */
public enum b {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);
    
    private final int id;
    private final int order;

    /* compiled from: TextActionModeCallback.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    b(int i) {
        this.id = i;
        this.order = i;
    }

    public final int getId() {
        return this.id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i = a.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return 17039373;
                    }
                    throw new h();
                }
                return 17039363;
            }
            return 17039371;
        }
        return 17039361;
    }
}
