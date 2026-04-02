package com.amazon.aps.iva.m40;

import com.amazon.aps.iva.mt.m;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: ShowPageCtaTextFormatter.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: ShowPageCtaTextFormatter.kt */
    /* renamed from: com.amazon.aps.iva.m40.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0501a {
        public static b a(ShowPageActivity showPageActivity) {
            j.f(showPageActivity, "context");
            m mVar = new m(showPageActivity);
            j.f(showPageActivity, "context");
            return new b(showPageActivity, mVar);
        }
    }

    String a(String str, String str2);

    String b(String str, String str2);

    String c(String str, String str2);
}
