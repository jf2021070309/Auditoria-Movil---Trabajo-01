package com.ellation.crunchyroll.cast.dialog;

import android.content.Context;
import android.os.Bundle;
import com.amazon.aps.iva.e8.d;
import com.amazon.aps.iva.e8.e;
import com.amazon.aps.iva.e8.f;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: CustomMediaRouteDialogFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/cast/dialog/CustomMediaRouteDialogFactory;", "Lcom/amazon/aps/iva/e8/f;", "Lcom/amazon/aps/iva/e8/e;", "onCreateControllerDialogFragment", "Lcom/amazon/aps/iva/e8/d;", "onCreateChooserDialogFragment", "<init>", "()V", "CustomMediaRouteControllerDialogFragment", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CustomMediaRouteDialogFactory extends f {

    /* compiled from: CustomMediaRouteDialogFactory.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/cast/dialog/CustomMediaRouteDialogFactory$CustomMediaRouteControllerDialogFragment;", "Lcom/amazon/aps/iva/e8/e;", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/mediarouter/app/a;", "onCreateControllerDialog", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class CustomMediaRouteControllerDialogFragment extends e {
        public static final int $stable = 0;

        @Override // com.amazon.aps.iva.e8.e
        public androidx.mediarouter.app.a onCreateControllerDialog(Context context, Bundle bundle) {
            j.f(context, "context");
            return new CustomMediaRouteControllerDialog(context);
        }
    }

    @Override // com.amazon.aps.iva.e8.f
    public d onCreateChooserDialogFragment() {
        return new CastRouteChooserDialogFragment();
    }

    @Override // com.amazon.aps.iva.e8.f
    public e onCreateControllerDialogFragment() {
        return new CustomMediaRouteControllerDialogFragment();
    }
}
