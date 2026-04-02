package com.sdk.ksdk.util;

import java.util.Arrays;
/* loaded from: classes3.dex */
public class KuaishouAdConfig {
    private String appId;
    private String[] interactionId;
    private int interactionTimeClickCount = 3;
    private int rewardVideoTimeClickCount = 3;
    private String videoId;

    public KuaishouAdConfig(String appId, String[] interactionId, String videoId) {
        this.appId = appId;
        this.interactionId = interactionId;
        this.videoId = videoId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String[] getInteractionId() {
        return this.interactionId;
    }

    public void setInteractionId(String[] interactionId) {
        this.interactionId = interactionId;
    }

    public int getInteractionTimeClickCount() {
        return this.interactionTimeClickCount;
    }

    public void setInteractionTimeClickCount(int interactionTimeClickCount) {
        this.interactionTimeClickCount = interactionTimeClickCount;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public int getRewardVideoTimeClickCount() {
        return this.rewardVideoTimeClickCount;
    }

    public void setRewardVideoTimeClickCount(int rewardVideoTimeClickCount) {
        this.rewardVideoTimeClickCount = rewardVideoTimeClickCount;
    }

    public String toString() {
        return "KuaishouAdConfig{appId='" + this.appId + "', interactionId=" + Arrays.toString(this.interactionId) + ", videoId='" + this.videoId + "', interactionTimeClickCount=" + this.interactionTimeClickCount + ", rewardVideoTimeClickCount=" + this.rewardVideoTimeClickCount + '}';
    }
}
