package com.ellation.crunchyroll.cast.dialog;

import android.content.Context;
import android.os.Bundle;
import com.amazon.aps.iva.e8.d;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: CastRouteChooserDialog.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/cast/dialog/CastRouteChooserDialogFragment;", "Lcom/amazon/aps/iva/e8/d;", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/ellation/crunchyroll/cast/dialog/CastRouteChooserDialog;", "onCreateChooserDialog", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastRouteChooserDialogFragment extends d {
    @Override // com.amazon.aps.iva.e8.d
    public CastRouteChooserDialog onCreateChooserDialog(Context context, Bundle bundle) {
        j.f(context, "context");
        return new CastRouteChooserDialog(context);
    }
}
