package com.vungle.publisher;

import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class AdConfig implements p {
    private final o a = new o();

    @Inject
    public AdConfig() {
        setTransitionAnimationEnabled(true);
    }

    public o getDelegateAdConfig() {
        return this.a;
    }

    @Override // com.vungle.publisher.p
    public boolean isBackButtonImmediatelyEnabled() {
        return this.a.isBackButtonImmediatelyEnabled();
    }

    public void setBackButtonImmediatelyEnabled(boolean z) {
        this.a.a(z);
    }

    @Override // com.vungle.publisher.p
    public boolean isImmersiveMode() {
        return this.a.isImmersiveMode();
    }

    public void setImmersiveMode(boolean z) {
        this.a.b(z);
    }

    @Override // com.vungle.publisher.p
    public String getIncentivizedCancelDialogBodyText() {
        return this.a.getIncentivizedCancelDialogBodyText();
    }

    public void setIncentivizedCancelDialogBodyText(String str) {
        this.a.a(str);
    }

    @Override // com.vungle.publisher.p
    public String getIncentivizedCancelDialogCloseButtonText() {
        return this.a.getIncentivizedCancelDialogCloseButtonText();
    }

    public void setIncentivizedCancelDialogCloseButtonText(String str) {
        this.a.b(str);
    }

    @Override // com.vungle.publisher.p
    public String getIncentivizedCancelDialogKeepWatchingButtonText() {
        return this.a.getIncentivizedCancelDialogKeepWatchingButtonText();
    }

    public void setIncentivizedCancelDialogKeepWatchingButtonText(String str) {
        this.a.c(str);
    }

    @Override // com.vungle.publisher.p
    public String getIncentivizedCancelDialogTitle() {
        return this.a.getIncentivizedCancelDialogTitle();
    }

    public void setIncentivizedCancelDialogTitle(String str) {
        this.a.d(str);
    }

    @Override // com.vungle.publisher.p
    public String getIncentivizedUserId() {
        return this.a.getIncentivizedUserId();
    }

    public void setIncentivizedUserId(String str) {
        this.a.e(str);
    }

    @Override // com.vungle.publisher.p
    public Orientation getOrientation() {
        return this.a.getOrientation();
    }

    public void setOrientation(Orientation orientation) {
        this.a.a(orientation);
    }

    @Override // com.vungle.publisher.p
    public boolean isSoundEnabled() {
        return this.a.isSoundEnabled();
    }

    public void setSoundEnabled(boolean z) {
        this.a.c(z);
    }

    @Override // com.vungle.publisher.p
    public boolean isTransitionAnimationEnabled() {
        return this.a.isTransitionAnimationEnabled();
    }

    public void setTransitionAnimationEnabled(boolean z) {
        this.a.d(z);
    }

    public void setFlexViewCloseTimeInSec(int i) {
        this.a.a(i);
    }

    @Override // com.vungle.publisher.p
    public int getFlexViewCloseTimeInSec() {
        return this.a.getFlexViewCloseTimeInSec();
    }

    public void setOrdinalViewCount(int i) {
        this.a.b(i);
    }

    @Override // com.vungle.publisher.p
    public int getOrdinalViewCount() {
        return this.a.getOrdinalViewCount();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public String toString() {
        return this.a.toString();
    }
}
