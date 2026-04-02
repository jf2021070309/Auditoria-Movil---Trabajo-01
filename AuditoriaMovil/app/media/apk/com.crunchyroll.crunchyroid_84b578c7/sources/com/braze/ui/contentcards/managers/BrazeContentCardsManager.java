package com.braze.ui.contentcards.managers;

import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.braze.ui.contentcards.listeners.DefaultContentCardsActionListener;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import kotlin.Metadata;
/* compiled from: BrazeContentCardsManager.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager;", "", "Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "value", "contentCardsActionListener", "Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "getContentCardsActionListener", "()Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "setContentCardsActionListener", "(Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;)V", "<init>", "()V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class BrazeContentCardsManager {
    public static final Companion Companion = new Companion(null);
    private static final e<BrazeContentCardsManager> instance$delegate = f.b(BrazeContentCardsManager$Companion$instance$2.INSTANCE);
    private IContentCardsActionListener contentCardsActionListener = new DefaultContentCardsActionListener();

    /* compiled from: BrazeContentCardsManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR!\u0010\t\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager$Companion;", "", "Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager;", "instance$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getInstance", "()Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager;", "getInstance$annotations", "()V", "instance", "<init>", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final BrazeContentCardsManager getInstance() {
            return (BrazeContentCardsManager) BrazeContentCardsManager.instance$delegate.getValue();
        }
    }

    public final IContentCardsActionListener getContentCardsActionListener() {
        return this.contentCardsActionListener;
    }
}
