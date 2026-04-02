package com.kwad.sdk.crash.online.monitor.block.report;

import android.content.Context;
import android.database.Cursor;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.report.e;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends e {
    public static int Im = 1;
    private static volatile a aBa;

    private a(Context context) {
        super(new com.kwad.sdk.crash.online.monitor.block.a.a(context, Im));
    }

    public static a by(Context context) {
        if (aBa == null) {
            synchronized (a.class) {
                if (aBa == null) {
                    aBa = new a(context);
                }
            }
        }
        return aBa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.report.e
    /* renamed from: j */
    public synchronized BlockReportAction g(Cursor cursor) {
        try {
        } catch (JSONException e) {
            c.printStackTrace(e);
            return new BlockReportAction("");
        }
        return new BlockReportAction(new JSONObject(cursor.getString(0)));
    }

    @Override // com.kwad.sdk.core.report.e
    public final String BU() {
        return "ksad_block_actions";
    }

    @Override // com.kwad.sdk.core.report.e
    public final String BV() {
        return "select aLog from " + BU();
    }

    @Override // com.kwad.sdk.core.report.e
    public final String getTag() {
        return "perfMonitor.BlockReportDBManager";
    }
}
