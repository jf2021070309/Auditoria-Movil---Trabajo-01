package com.vungle.publisher;

import android.content.Context;
/* loaded from: classes4.dex */
public class VunglePub extends VunglePubBase {
    private static final VunglePub n = new VunglePub();
    public static final String VERSION = VunglePubBase.VERSION;

    public static VunglePub getInstance() {
        return n;
    }

    VunglePub() {
    }

    @Override // com.vungle.publisher.VunglePubBase
    public void addEventListeners(VungleAdEventListener... vungleAdEventListenerArr) {
        super.addEventListeners(vungleAdEventListenerArr);
    }

    @Override // com.vungle.publisher.VunglePubBase
    public void clearEventListeners() {
        super.clearEventListeners();
    }

    @Override // com.vungle.publisher.VunglePubBase
    public void clearAndSetEventListeners(VungleAdEventListener... vungleAdEventListenerArr) {
        super.clearAndSetEventListeners(vungleAdEventListenerArr);
    }

    @Override // com.vungle.publisher.VunglePubBase
    public void removeEventListeners(VungleAdEventListener... vungleAdEventListenerArr) {
        super.removeEventListeners(vungleAdEventListenerArr);
    }

    @Override // com.vungle.publisher.VunglePubBase
    public void init(Context context, String str, String[] strArr, VungleInitListener vungleInitListener) {
        super.init(context, str, strArr, vungleInitListener);
    }

    @Override // com.vungle.publisher.VunglePubBase
    public AdConfig getGlobalAdConfig() {
        return super.getGlobalAdConfig();
    }

    @Override // com.vungle.publisher.VunglePubBase
    public boolean isInitialized() {
        return super.isInitialized();
    }

    @Override // com.vungle.publisher.VunglePubBase
    public boolean isAdPlayable(String str) {
        return super.isAdPlayable(str);
    }

    @Override // com.vungle.publisher.VunglePubBase
    public void loadAd(String str) {
    }

    @Override // com.vungle.publisher.VunglePubBase
    public void playAd(String str, AdConfig adConfig) {
        super.playAd(str, adConfig);
    }

    @Override // com.vungle.publisher.VunglePubBase
    public boolean closeFlexViewAd(String str) {
        return super.closeFlexViewAd(str);
    }
}
