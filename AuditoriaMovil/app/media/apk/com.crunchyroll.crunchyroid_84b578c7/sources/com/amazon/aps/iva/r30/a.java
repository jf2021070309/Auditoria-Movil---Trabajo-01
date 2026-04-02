package com.amazon.aps.iva.r30;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
/* compiled from: ContainerMetadataFormatter.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: ContainerMetadataFormatter.kt */
    /* renamed from: com.amazon.aps.iva.r30.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0662a {
        public static b a(Context context) {
            DurationFormatter create = DurationFormatter.Companion.create(context);
            j.f(context, "context");
            j.f(create, "durationFormatter");
            return new b(context, create);
        }
    }

    String a(Panel panel);

    String b(ContentContainer contentContainer);
}
