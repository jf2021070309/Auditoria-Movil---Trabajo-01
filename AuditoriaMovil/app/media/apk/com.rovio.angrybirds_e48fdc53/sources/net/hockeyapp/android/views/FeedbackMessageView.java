package net.hockeyapp.android.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import net.hockeyapp.android.R;
import net.hockeyapp.android.objects.FeedbackAttachment;
import net.hockeyapp.android.objects.FeedbackMessage;
import net.hockeyapp.android.tasks.AttachmentDownloader;
/* loaded from: classes4.dex */
public class FeedbackMessageView extends LinearLayout {
    private TextView a;
    private TextView b;
    private TextView c;
    private AttachmentListView d;
    private FeedbackMessage e;
    private final Context f;

    public FeedbackMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = context;
        LayoutInflater.from(context).inflate(R.layout.hockeyapp_view_feedback_message, this);
        this.a = (TextView) findViewById(R.id.label_author);
        this.b = (TextView) findViewById(R.id.label_date);
        this.c = (TextView) findViewById(R.id.label_text);
        this.d = (AttachmentListView) findViewById(R.id.list_attachments);
    }

    public void setFeedbackMessage(FeedbackMessage feedbackMessage) {
        this.e = feedbackMessage;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(3, 3);
            Date parse = simpleDateFormat.parse(this.e.getCreatedAt());
            this.b.setText(dateTimeInstance.format(parse));
            this.b.setContentDescription(dateTimeInstance.format(parse));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.a.setText(this.e.getName());
        this.a.setContentDescription(this.e.getName());
        this.c.setText(this.e.getText());
        this.c.setContentDescription(this.e.getText());
        this.d.removeAllViews();
        for (FeedbackAttachment feedbackAttachment : this.e.getFeedbackAttachments()) {
            AttachmentView attachmentView = new AttachmentView(this.f, (ViewGroup) this.d, feedbackAttachment, false);
            AttachmentDownloader.getInstance().download(feedbackAttachment, attachmentView);
            this.d.addView(attachmentView);
        }
    }

    public void setIndex(int i) {
        if (i % 2 == 0) {
            setBackgroundColor(getResources().getColor(R.color.hockeyapp_background_light));
            this.a.setTextColor(getResources().getColor(R.color.hockeyapp_text_white));
            this.b.setTextColor(getResources().getColor(R.color.hockeyapp_text_white));
        } else {
            setBackgroundColor(getResources().getColor(R.color.hockeyapp_background_white));
            this.a.setTextColor(getResources().getColor(R.color.hockeyapp_text_light));
            this.b.setTextColor(getResources().getColor(R.color.hockeyapp_text_light));
        }
        this.c.setTextColor(getResources().getColor(R.color.hockeyapp_text_black));
    }
}
