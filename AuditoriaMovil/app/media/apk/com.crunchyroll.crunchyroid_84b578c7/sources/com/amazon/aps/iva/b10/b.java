package com.amazon.aps.iva.b10;

import android.content.Context;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DetailedNotificationHandler.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.b10.a {
    public final c a;

    /* compiled from: DetailedNotificationHandler.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e0.b.values().length];
            try {
                iArr[e0.b.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.b.INFO_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.b.IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.b.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e0.b.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e0.b.COMPLETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public b(Context context) {
        this.a = new d(context);
    }

    @Override // com.amazon.aps.iva.b10.a
    public final void f() {
        this.a.f();
    }

    @Override // com.amazon.aps.iva.b10.a
    public final void g(e0 e0Var, PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        int i = a.a[e0Var.g().ordinal()];
        c cVar = this.a;
        switch (i) {
            case 1:
            case 2:
                cVar.b(e0Var, playableAsset);
                return;
            case 3:
                if (e0Var.f() > 0.0d) {
                    cVar.c(e0Var, playableAsset);
                    return;
                } else {
                    cVar.b(e0Var, playableAsset);
                    return;
                }
            case 4:
                cVar.k(e0Var, playableAsset);
                return;
            case 5:
                cVar.j(e0Var, playableAsset);
                return;
            case 6:
                cVar.i(e0Var, playableAsset);
                return;
            default:
                return;
        }
    }

    @Override // com.amazon.aps.iva.b10.a
    public final void h(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "notificationId");
        this.a.a(str.hashCode());
    }
}
