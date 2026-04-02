package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.facebook.appevents.AppEventsConstants;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.d;
/* loaded from: classes3.dex */
public class Defcon implements d {
    private static final int LEVEL_0 = 0;
    private static final int LEVEL_1 = 1;
    private static final int LEVEL_2 = 2;
    private static final int LEVEL_3 = 3;
    private static final long MILLIS_24_HOURS = 86400000;
    private static final long MILLIS_4_HOURS = 14400000;
    private static final long MILLIS_8_HOURS = 28800000;
    private static Defcon instanse = null;
    private int mLevel = 0;

    public static synchronized Defcon getService(Context context) {
        Defcon defcon;
        synchronized (Defcon.class) {
            if (instanse == null) {
                instanse = new Defcon();
                instanse.setLevel(Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", AppEventsConstants.EVENT_PARAM_VALUE_NO)).intValue());
            }
            defcon = instanse;
        }
        return defcon;
    }

    private Defcon() {
    }

    public int getLevel() {
        return this.mLevel;
    }

    public long getReqInterval() {
        int i = this.mLevel;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 86400000L;
                }
                return 0L;
            }
            return MILLIS_8_HOURS;
        }
        return MILLIS_4_HOURS;
    }

    public long getRetryInterval() {
        return this.mLevel == 0 ? 0L : 300000L;
    }

    public void setLevel(int i) {
        if (i >= 0 && i <= 3) {
            this.mLevel = i;
        }
    }

    public boolean isOpen() {
        return this.mLevel != 0;
    }

    @Override // com.umeng.commonsdk.statistics.internal.d
    public void onImprintChanged(ImprintHandler.a aVar) {
        setLevel(Integer.valueOf(aVar.a("defcon", String.valueOf(0))).intValue());
    }
}
