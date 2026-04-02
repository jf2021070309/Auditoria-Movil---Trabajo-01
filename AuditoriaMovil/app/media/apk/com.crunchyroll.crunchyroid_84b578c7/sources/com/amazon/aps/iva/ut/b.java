package com.amazon.aps.iva.ut;

import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import java.util.Locale;
/* compiled from: CommentingDependencies.kt */
/* loaded from: classes2.dex */
public interface b {
    com.amazon.aps.iva.pm.a b();

    l<Fragment, com.amazon.aps.iva.lu.b> c();

    l<Fragment, com.amazon.aps.iva.iu.a> d();

    com.amazon.aps.iva.xb0.a<Locale> getGetLocale();

    TalkboxService getTalkboxService();
}
