package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public enum EndCreativeCode {
    UNSPECIFIED(0, "Unspecified close."),
    USER_INITIATED(1, "User initiated ad close."),
    AUTO_CLOSE(2, "Auto-close due to media playback completion."),
    PLAYER_INITIATED(3, "Player-initiated close before media playback completion."),
    CREATIVE_INITIATED(4, "Creative-initiated close."),
    NON_LINEAR_DURATION_COMPLETE(5, "Nonlinear duration complete.");
    
    private final int endCreativeCode;
    private final String endCreativeMessage;

    EndCreativeCode(int i, String str) {
        this.endCreativeCode = i;
        this.endCreativeMessage = str;
    }

    public int getEndCreativeCode() {
        return this.endCreativeCode;
    }

    public String getEndCreativeMessage() {
        return this.endCreativeMessage;
    }
}
