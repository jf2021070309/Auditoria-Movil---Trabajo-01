package com.braze.ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R$drawable;
import com.braze.ui.R$string;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.feed.BrazeImageSwitcher;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: BaseCardView.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 ,*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001,B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J&\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001J\u0018\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u0001J\"\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0004J\"\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H$R\u0014\u0010\u001b\u001a\u00020\u00148\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0016\u0010$\u001a\u00020#8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/braze/ui/widget/BaseCardView;", "Lcom/braze/models/cards/Card;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/widget/RelativeLayout;", "Landroid/widget/TextView;", "view", "", "text", "Lcom/amazon/aps/iva/kb0/q;", "setOptionalTextView", "Landroid/widget/ImageView;", "imageView", "imageUrl", "", "placeholderAspectRatio", "card", "setImageViewToUrl", "Lcom/braze/ui/feed/BrazeImageSwitcher;", "imageSwitcher", "setCardViewedIndicator", "Landroid/content/Context;", "context", "Lcom/braze/ui/actions/IAction;", "cardAction", "handleCardClick", "", "isClickHandled", "applicationContext", "Landroid/content/Context;", "classLogTag", "Ljava/lang/String;", "getClassLogTag", "()Ljava/lang/String;", "Lcom/braze/models/cards/Card;", "Lcom/braze/ui/feed/BrazeImageSwitcher;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "isUnreadCardVisualIndicatorEnabled", "Z", "isUnreadIndicatorEnabled", "()Z", "<init>", "(Landroid/content/Context;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class BaseCardView<T extends Card> extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    protected final Context applicationContext;
    protected T card;
    private final String classLogTag;
    protected BrazeConfigurationProvider configurationProvider;
    public BrazeImageSwitcher imageSwitcher;
    private final boolean isUnreadCardVisualIndicatorEnabled;

    /* compiled from: BaseCardView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braze/ui/widget/BaseCardView$Companion;", "", "()V", "ICON_READ_TAG", "", "ICON_UNREAD_TAG", "getUriActionForCard", "Lcom/braze/ui/actions/UriAction;", "card", "Lcom/braze/models/cards/Card;", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final UriAction getUriActionForCard(Card card) {
            j.f(card, "card");
            Bundle bundle = new Bundle();
            for (String str : card.getExtras().keySet()) {
                bundle.putString(str, card.getExtras().get(str));
            }
            String url = card.getUrl();
            if (url == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, BaseCardView$Companion$getUriActionForCard$1.INSTANCE, 2, (Object) null);
                return null;
            }
            return BrazeDeeplinkHandler.Companion.getInstance().createUriActionFromUrlString(url, bundle, card.getOpenUriInWebView(), card.getChannel());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardView(Context context) {
        super(context);
        j.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        j.e(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
        this.classLogTag = BrazeLogger.getBrazeLogTag(getClass());
        BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
        this.configurationProvider = brazeConfigurationProvider;
        this.isUnreadCardVisualIndicatorEnabled = brazeConfigurationProvider.isNewsfeedVisualIndicatorOn();
    }

    public static final UriAction getUriActionForCard(Card card) {
        return Companion.getUriActionForCard(card);
    }

    public final String getClassLogTag() {
        return this.classLogTag;
    }

    public final void handleCardClick(Context context, Card card, IAction iAction) {
        j.f(context, "context");
        j.f(card, "card");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new BaseCardView$handleCardClick$1(card), 2, (Object) null);
        card.setIndicatorHighlighted(true);
        if (!isClickHandled(context, card, iAction)) {
            if (iAction != null) {
                card.logClick();
                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new BaseCardView$handleCardClick$2(card), 2, (Object) null);
                if (iAction instanceof UriAction) {
                    BrazeDeeplinkHandler.Companion.getInstance().gotoUri(context, (UriAction) iAction);
                    return;
                }
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new BaseCardView$handleCardClick$3(card), 3, (Object) null);
                iAction.execute(context);
                return;
            }
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new BaseCardView$handleCardClick$4(card), 2, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new BaseCardView$handleCardClick$5(card), 3, (Object) null);
        card.logClick();
    }

    public abstract boolean isClickHandled(Context context, Card card, IAction iAction);

    public final boolean isUnreadIndicatorEnabled() {
        return this.isUnreadCardVisualIndicatorEnabled;
    }

    public final void setCardViewedIndicator(BrazeImageSwitcher brazeImageSwitcher, Card card) {
        j.f(card, "card");
        if (brazeImageSwitcher == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, BaseCardView$setCardViewedIndicator$1.INSTANCE, 2, (Object) null);
            return;
        }
        Object tag = brazeImageSwitcher.getTag(R$string.com_braze_image_is_read_tag_key);
        if (tag == null) {
            tag = "";
        }
        if (card.isIndicatorHighlighted()) {
            if (!j.a(tag, "icon_read")) {
                if (brazeImageSwitcher.getReadIcon() != null) {
                    brazeImageSwitcher.setImageDrawable(brazeImageSwitcher.getReadIcon());
                } else {
                    brazeImageSwitcher.setImageResource(R$drawable.com_braze_content_card_icon_read);
                }
                brazeImageSwitcher.setTag(R$string.com_braze_image_is_read_tag_key, "icon_read");
            }
        } else if (!j.a(tag, "icon_unread")) {
            if (brazeImageSwitcher.getUnReadIcon() != null) {
                brazeImageSwitcher.setImageDrawable(brazeImageSwitcher.getUnReadIcon());
            } else {
                brazeImageSwitcher.setImageResource(R$drawable.com_braze_content_card_icon_unread);
            }
            brazeImageSwitcher.setTag(R$string.com_braze_image_is_read_tag_key, "icon_unread");
        }
    }

    public final void setImageViewToUrl(final ImageView imageView, String str, final float f, Card card) {
        boolean z;
        j.f(imageView, "imageView");
        j.f(str, "imageUrl");
        j.f(card, "card");
        if (!j.a(str, imageView.getTag(R$string.com_braze_image_resize_tag_key))) {
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.braze.ui.widget.BaseCardView$setImageViewToUrl$1
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public boolean onPreDraw() {
                            imageView.getViewTreeObserver().removeOnPreDrawListener(this);
                            int width = imageView.getWidth();
                            imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, (int) (width / f)));
                            return true;
                        }
                    });
                }
            }
            imageView.setImageResource(17170445);
            Braze.Companion companion = Braze.Companion;
            Context context = getContext();
            j.e(context, "context");
            IBrazeImageLoader imageLoader = companion.getInstance(context).getImageLoader();
            Context context2 = getContext();
            j.e(context2, "context");
            imageLoader.renderUrlIntoCardView(context2, card, str, imageView, BrazeViewBounds.BASE_CARD_VIEW);
            imageView.setTag(R$string.com_braze_image_resize_tag_key, str);
        }
    }

    public final void setOptionalTextView(TextView textView, String str) {
        boolean z;
        j.f(textView, "view");
        if (str != null && !m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        textView.setText("");
        textView.setVisibility(8);
    }
}
