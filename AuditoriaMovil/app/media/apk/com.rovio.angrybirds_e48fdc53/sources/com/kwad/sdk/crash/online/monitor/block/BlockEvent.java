package com.kwad.sdk.crash.online.monitor.block;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class BlockEvent extends com.kwad.sdk.core.response.a.a {
    public long blockTimeThreshold;
    public long blockDuration = 0;
    public long blockLoopInterval = 100;
    public long calcBlockOverhead = 0;
    public String currentActivity = "";
    public String processName = "";
    public List<a> stackTraceSample = new ArrayList();

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public long aAK;
        public boolean aAL = false;
        public String aAM;
        public long aAN;
        public int repeatCount;
    }
}
