package com.ironsource.sdk.i;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.controller.w;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.b;
/* loaded from: classes2.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.sdk.i.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.a.a().length];
            a = iArr;
            try {
                int i = d.a.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                int i2 = d.a.b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                int i3 = d.a.c;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static boolean a(Activity activity) {
        int parseInt = Integer.parseInt(b.a().a.getString("back_button_state", "2"));
        if (AnonymousClass1.a[(parseInt == 0 ? d.a.a : parseInt == 1 ? d.a.b : d.a.c) - 1] != 3) {
            return false;
        }
        try {
            w wVar = (w) com.ironsource.sdk.d.b.a((Context) activity).a.a;
            if (wVar != null) {
                wVar.b(w.b("nativeNavigationPressed", w.a("action", "back", null, null, null, null, null, null, null, false)));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
