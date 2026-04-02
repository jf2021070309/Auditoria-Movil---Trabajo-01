package net.hockeyapp.android.listeners;

import net.hockeyapp.android.tasks.SendFeedbackTask;
/* loaded from: classes4.dex */
public abstract class SendFeedbackListener {
    public void feedbackSuccessful(SendFeedbackTask sendFeedbackTask) {
    }

    public void feedbackFailed(SendFeedbackTask sendFeedbackTask, Boolean bool) {
    }
}
