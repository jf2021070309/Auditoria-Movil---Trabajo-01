package com.braze.ui.inappmessage.config;

import kotlin.Metadata;
/* compiled from: BrazeInAppMessageParams.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\nR(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\u0004\u0012\u0004\b\u000e\u0010\n\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\bR(\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/braze/ui/inappmessage/config/BrazeInAppMessageParams;", "", "", "modalizedImageRadiusDp", "D", "getModalizedImageRadiusDp", "()D", "setModalizedImageRadiusDp", "(D)V", "getModalizedImageRadiusDp$annotations", "()V", "graphicModalMaxWidthDp", "getGraphicModalMaxWidthDp", "setGraphicModalMaxWidthDp", "getGraphicModalMaxWidthDp$annotations", "graphicModalMaxHeightDp", "getGraphicModalMaxHeightDp", "setGraphicModalMaxHeightDp", "getGraphicModalMaxHeightDp$annotations", "<init>", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeInAppMessageParams {
    public static final BrazeInAppMessageParams INSTANCE = new BrazeInAppMessageParams();
    private static double modalizedImageRadiusDp = 9.0d;
    private static double graphicModalMaxWidthDp = 290.0d;
    private static double graphicModalMaxHeightDp = 290.0d;

    private BrazeInAppMessageParams() {
    }

    public static final double getModalizedImageRadiusDp() {
        return modalizedImageRadiusDp;
    }
}
