package net.hockeyapp.android.utils;

import com.umeng.analytics.pro.bg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.hockeyapp.android.objects.Feedback;
import net.hockeyapp.android.objects.FeedbackAttachment;
import net.hockeyapp.android.objects.FeedbackMessage;
import net.hockeyapp.android.objects.FeedbackResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class FeedbackParser {
    private FeedbackParser() {
    }

    /* loaded from: classes4.dex */
    private static class a {
        public static final FeedbackParser a = new FeedbackParser();

        private a() {
        }
    }

    public static FeedbackParser getInstance() {
        return a.a;
    }

    public FeedbackResponse parseFeedbackResponse(String str) {
        FeedbackResponse feedbackResponse;
        JSONException e;
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("feedback");
            Feedback feedback = new Feedback();
            JSONArray jSONArray = jSONObject2.getJSONArray("messages");
            ArrayList<FeedbackMessage> arrayList = null;
            if (jSONArray.length() > 0) {
                arrayList = new ArrayList<>();
                for (int i = 0; i < jSONArray.length(); i++) {
                    String str2 = jSONArray.getJSONObject(i).getString("subject").toString();
                    String str3 = jSONArray.getJSONObject(i).getString("text").toString();
                    String str4 = jSONArray.getJSONObject(i).getString("oem").toString();
                    String str5 = jSONArray.getJSONObject(i).getString("model").toString();
                    String str6 = jSONArray.getJSONObject(i).getString(bg.y).toString();
                    String str7 = jSONArray.getJSONObject(i).getString("created_at").toString();
                    int i2 = jSONArray.getJSONObject(i).getInt("id");
                    String str8 = jSONArray.getJSONObject(i).getString("token").toString();
                    int i3 = jSONArray.getJSONObject(i).getInt("via");
                    String str9 = jSONArray.getJSONObject(i).getString("user_string").toString();
                    String str10 = jSONArray.getJSONObject(i).getString("clean_text").toString();
                    String str11 = jSONArray.getJSONObject(i).getString("name").toString();
                    String str12 = jSONArray.getJSONObject(i).getString("app_id").toString();
                    JSONArray optJSONArray = jSONArray.getJSONObject(i).optJSONArray("attachments");
                    List<FeedbackAttachment> emptyList = Collections.emptyList();
                    if (optJSONArray != null) {
                        emptyList = new ArrayList<>();
                        for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                            int i5 = optJSONArray.getJSONObject(i4).getInt("id");
                            int i6 = optJSONArray.getJSONObject(i4).getInt("feedback_message_id");
                            String string = optJSONArray.getJSONObject(i4).getString("file_name");
                            String string2 = optJSONArray.getJSONObject(i4).getString("url");
                            String string3 = optJSONArray.getJSONObject(i4).getString("created_at");
                            String string4 = optJSONArray.getJSONObject(i4).getString("updated_at");
                            FeedbackAttachment feedbackAttachment = new FeedbackAttachment();
                            feedbackAttachment.setId(i5);
                            feedbackAttachment.setMessageId(i6);
                            feedbackAttachment.setFilename(string);
                            feedbackAttachment.setUrl(string2);
                            feedbackAttachment.setCreatedAt(string3);
                            feedbackAttachment.setUpdatedAt(string4);
                            emptyList.add(feedbackAttachment);
                        }
                    }
                    FeedbackMessage feedbackMessage = new FeedbackMessage();
                    feedbackMessage.setAppId(str12);
                    feedbackMessage.setCleanText(str10);
                    feedbackMessage.setCreatedAt(str7);
                    feedbackMessage.setId(i2);
                    feedbackMessage.setModel(str5);
                    feedbackMessage.setName(str11);
                    feedbackMessage.setOem(str4);
                    feedbackMessage.setOsVersion(str6);
                    feedbackMessage.setSubjec(str2);
                    feedbackMessage.setText(str3);
                    feedbackMessage.setToken(str8);
                    feedbackMessage.setUserString(str9);
                    feedbackMessage.setVia(i3);
                    feedbackMessage.setFeedbackAttachments(emptyList);
                    arrayList.add(feedbackMessage);
                }
            }
            feedback.setMessages(arrayList);
            try {
                feedback.setName(jSONObject2.getString("name").toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            try {
                feedback.setEmail(jSONObject2.getString("email").toString());
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            try {
                feedback.setId(jSONObject2.getInt("id"));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            try {
                feedback.setCreatedAt(jSONObject2.getString("created_at").toString());
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            feedbackResponse = new FeedbackResponse();
            try {
                feedbackResponse.setFeedback(feedback);
                try {
                    feedbackResponse.setStatus(jSONObject.getString("status").toString());
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
                try {
                    feedbackResponse.setToken(jSONObject.getString("token").toString());
                    return feedbackResponse;
                } catch (JSONException e7) {
                    e7.printStackTrace();
                    return feedbackResponse;
                }
            } catch (JSONException e8) {
                e = e8;
                e.printStackTrace();
                return feedbackResponse;
            }
        } catch (JSONException e9) {
            feedbackResponse = null;
            e = e9;
            e.printStackTrace();
            return feedbackResponse;
        }
    }
}
