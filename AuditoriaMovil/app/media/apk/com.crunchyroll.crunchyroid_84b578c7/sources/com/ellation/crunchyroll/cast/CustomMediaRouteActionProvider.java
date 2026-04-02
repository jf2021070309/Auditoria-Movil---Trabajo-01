package com.ellation.crunchyroll.cast;

import android.content.Context;
import com.amazon.aps.iva.e8.b;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.dialog.CustomMediaRouteDialogFactory;
import kotlin.Metadata;
/* compiled from: CustomMediaRouteActionProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/cast/CustomMediaRouteActionProvider;", "Lcom/amazon/aps/iva/e8/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class CustomMediaRouteActionProvider extends b {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomMediaRouteActionProvider(Context context) {
        super(context);
        j.f(context, "context");
        setDialogFactory(new CustomMediaRouteDialogFactory());
    }
}
