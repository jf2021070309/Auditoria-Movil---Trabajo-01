package com.amazon.aps.iva.js;
/* compiled from: EventSourceProperty.kt */
/* loaded from: classes2.dex */
public enum i {
    CR_ANDROID("cr_android"),
    CR_VOD_GAMEVAULT("cr_vod_GameVault"),
    CR_VOD_ACQUISITION("cr_vod_Acquisition"),
    CR_VOD_PARENTAL_CONTROLS("cr_vod_parentalControls"),
    CR_VOD_FUNIMATION_MIGRATION("cr_vod_FunimationMigration"),
    CR_VOD_INTRO_OFFER("cr_vod_IntroOffer"),
    CR_VOD_STREAM_LIMIT("cr_vod_streamLimit");
    
    private final String value;

    i(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
