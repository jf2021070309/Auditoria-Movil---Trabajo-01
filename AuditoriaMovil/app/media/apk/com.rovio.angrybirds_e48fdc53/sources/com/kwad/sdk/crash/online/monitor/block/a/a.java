package com.kwad.sdk.crash.online.monitor.block.a;

import android.content.Context;
import com.kwad.sdk.core.report.d;
/* loaded from: classes.dex */
public final class a extends d {
    private static String asH = "CREATE TABLE IF NOT EXISTS ksad_block_actions (actionId varchar(60) primary key, aLog TEXT)";

    public a(Context context, int i) {
        super(context, "ksadBlock.db", i, asH);
    }
}
