package com.ellation.crunchyroll.api.etp.content.model;

import com.ellation.crunchyroll.model.PlayheadTimeProviderKt;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: Playhead.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"playheadToPlaySec", "", "Lcom/ellation/crunchyroll/api/etp/content/model/Playhead;", "getPlayheadToPlaySec", "(Lcom/ellation/crunchyroll/api/etp/content/model/Playhead;)J", "api_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayheadKt {
    public static final long getPlayheadToPlaySec(Playhead playhead) {
        if (playhead != null && !playhead.isCompleted()) {
            return TimeUnit.MILLISECONDS.toSeconds(PlayheadTimeProviderKt.getPlayheadMs(playhead));
        }
        return 0L;
    }
}
