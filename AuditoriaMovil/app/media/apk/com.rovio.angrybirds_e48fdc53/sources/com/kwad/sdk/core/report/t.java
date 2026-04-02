package com.kwad.sdk.core.report;

import android.content.Context;
/* loaded from: classes.dex */
public final class t extends d {
    public static int Im = 1;
    private static String asH = "CREATE TABLE IF NOT EXISTS ksad_actions (actionId varchar(60) primary key, aLog TEXT)";

    public t(Context context, int i) {
        super(context, "ksadrep.db", i, asH);
    }
}
