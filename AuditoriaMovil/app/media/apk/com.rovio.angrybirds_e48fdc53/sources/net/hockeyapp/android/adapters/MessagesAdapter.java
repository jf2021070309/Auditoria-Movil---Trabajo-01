package net.hockeyapp.android.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import net.hockeyapp.android.objects.FeedbackMessage;
import net.hockeyapp.android.views.FeedbackMessageView;
/* loaded from: classes4.dex */
public class MessagesAdapter extends BaseAdapter {
    private Context a;
    private ArrayList<FeedbackMessage> b;

    public MessagesAdapter(Context context, ArrayList<FeedbackMessage> arrayList) {
        this.a = context;
        this.b = arrayList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        FeedbackMessageView feedbackMessageView;
        FeedbackMessage feedbackMessage = this.b.get(i);
        if (view == null) {
            feedbackMessageView = new FeedbackMessageView(this.a, null);
        } else {
            feedbackMessageView = (FeedbackMessageView) view;
        }
        if (feedbackMessage != null) {
            feedbackMessageView.setFeedbackMessage(feedbackMessage);
        }
        feedbackMessageView.setIndex(i);
        return feedbackMessageView;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.b.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public void clear() {
        if (this.b != null) {
            this.b.clear();
        }
    }

    public void add(FeedbackMessage feedbackMessage) {
        if (feedbackMessage != null && this.b != null) {
            this.b.add(feedbackMessage);
        }
    }
}
