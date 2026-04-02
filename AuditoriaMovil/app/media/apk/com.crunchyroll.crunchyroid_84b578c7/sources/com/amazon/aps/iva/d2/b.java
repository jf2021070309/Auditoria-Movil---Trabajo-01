package com.amazon.aps.iva.d2;

import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher b(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Object d(Bundle bundle) {
        return bundle.getParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", IContentCardsUpdateHandler.class);
    }
}
