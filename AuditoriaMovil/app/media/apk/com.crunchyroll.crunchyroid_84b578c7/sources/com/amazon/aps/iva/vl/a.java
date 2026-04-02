package com.amazon.aps.iva.vl;

import com.crunchyroll.crunchyroid.R;
/* compiled from: ReportProblemOption.kt */
/* loaded from: classes2.dex */
public enum a {
    VIDEO_PROBLEM_OPTION("video_problem", R.string.video_problem),
    BUFFERING_PROBLEM("buffering_problem", R.string.buffering_problem),
    SUBS_ISSUE_OPTION("subtitle_problem", R.string.subtitle_problem),
    AUDIO_VIDEO_NOT_SYNCED("audio_video_not_synced", R.string.audio_sync_problem),
    SUBS_VIDEO_NOT_SYNCED("subs_video_not_synced", R.string.subs_sync_problem),
    ADS_ARE_ANNOYING("ads_are_annoying", R.string.ads_are_annoying),
    OTHER_PLAYBACK_ISSUE("other_playback_issue", R.string.other_playback_issue);
    
    private final String id;
    private final int titleResId;

    a(String str, int i) {
        this.id = str;
        this.titleResId = i;
    }

    public final String getId() {
        return this.id;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }
}
