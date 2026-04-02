package com.amazon.aps.iva.c3;

import android.app.RemoteInput;
import android.os.Build;
/* compiled from: RemoteInput.java */
/* loaded from: classes.dex */
public final class d0 {

    /* compiled from: RemoteInput.java */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    public static RemoteInput a(d0 d0Var) {
        d0Var.getClass();
        RemoteInput.Builder addExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(addExtras, 0);
        }
        return addExtras.build();
    }
}
