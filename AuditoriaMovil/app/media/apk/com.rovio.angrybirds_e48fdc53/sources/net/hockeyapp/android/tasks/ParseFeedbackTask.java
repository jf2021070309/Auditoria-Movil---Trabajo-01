package net.hockeyapp.android.tasks;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import net.hockeyapp.android.FeedbackActivity;
import net.hockeyapp.android.FeedbackManager;
import net.hockeyapp.android.FeedbackManagerListener;
import net.hockeyapp.android.objects.FeedbackMessage;
import net.hockeyapp.android.objects.FeedbackResponse;
import net.hockeyapp.android.utils.FeedbackParser;
import net.hockeyapp.android.utils.Util;
/* loaded from: classes4.dex */
public class ParseFeedbackTask extends AsyncTask<Void, Void, FeedbackResponse> {
    public static final String BUNDLE_PARSE_FEEDBACK_RESPONSE = "parse_feedback_response";
    public static final String ID_LAST_MESSAGE_PROCESSED = "idLastMessageProcessed";
    public static final String ID_LAST_MESSAGE_SEND = "idLastMessageSend";
    public static final int NEW_ANSWER_NOTIFICATION_ID = 2;
    public static final String PREFERENCES_NAME = "net.hockeyapp.android.feedback";
    private Context a;
    private String b;
    private Handler c;
    private String d;
    private String e = null;

    public ParseFeedbackTask(Context context, String str, Handler handler, String str2) {
        this.a = context;
        this.b = str;
        this.c = handler;
        this.d = str2;
    }

    public void setUrlString(String str) {
        this.e = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public FeedbackResponse doInBackground(Void... voidArr) {
        ArrayList<FeedbackMessage> messages;
        if (this.a == null || this.b == null) {
            return null;
        }
        FeedbackResponse parseFeedbackResponse = FeedbackParser.getInstance().parseFeedbackResponse(this.b);
        if (parseFeedbackResponse != null && parseFeedbackResponse.getFeedback() != null && (messages = parseFeedbackResponse.getFeedback().getMessages()) != null && !messages.isEmpty()) {
            a(messages);
            return parseFeedbackResponse;
        }
        return parseFeedbackResponse;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(FeedbackResponse feedbackResponse) {
        if (feedbackResponse != null && this.c != null) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putSerializable(BUNDLE_PARSE_FEEDBACK_RESPONSE, feedbackResponse);
            message.setData(bundle);
            this.c.sendMessage(message);
        }
    }

    private void a(ArrayList<FeedbackMessage> arrayList) {
        FeedbackMessage feedbackMessage = arrayList.get(arrayList.size() - 1);
        int id = feedbackMessage.getId();
        SharedPreferences sharedPreferences = this.a.getSharedPreferences(PREFERENCES_NAME, 0);
        if (this.d.equals("send")) {
            sharedPreferences.edit().putInt(ID_LAST_MESSAGE_SEND, id).putInt(ID_LAST_MESSAGE_PROCESSED, id).apply();
        } else if (this.d.equals("fetch")) {
            int i = sharedPreferences.getInt(ID_LAST_MESSAGE_SEND, -1);
            int i2 = sharedPreferences.getInt(ID_LAST_MESSAGE_PROCESSED, -1);
            if (id != i && id != i2) {
                sharedPreferences.edit().putInt(ID_LAST_MESSAGE_PROCESSED, id).apply();
                FeedbackManagerListener lastListener = FeedbackManager.getLastListener();
                if (!(lastListener != null ? lastListener.feedbackAnswered(feedbackMessage) : false)) {
                    a(this.a);
                }
            }
        }
    }

    private void a(Context context) {
        if (this.e != null) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            int identifier = context.getResources().getIdentifier("ic_menu_refresh", "drawable", "android");
            Class<? extends FeedbackActivity> cls = null;
            if (FeedbackManager.getLastListener() != null) {
                cls = FeedbackManager.getLastListener().getFeedbackActivityClass();
            }
            if (cls == null) {
                cls = FeedbackActivity.class;
            }
            Intent intent = new Intent();
            intent.setFlags(805306368);
            intent.setClass(context, cls);
            intent.putExtra("url", this.e);
            Notification createNotification = Util.createNotification(context, PendingIntent.getActivity(context, 0, intent, 1073741824), "HockeyApp Feedback", "A new answer to your feedback is available.", identifier);
            if (createNotification != null) {
                notificationManager.notify(2, createNotification);
            }
        }
    }
}
