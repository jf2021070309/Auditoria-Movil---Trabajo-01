package com.braze.ui.actions.brazeactions;

import android.net.Uri;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: BrazeActionUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u0004\u0018\u00010\u0000H\u0000\u001a\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u001e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¨\u0006\u000f"}, d2 = {"Lcom/braze/models/inappmessage/IInAppMessage;", "", "containsAnyPushPermissionBrazeActions", "containsInvalidBrazeAction", "Lcom/braze/models/cards/Card;", "", "Landroid/net/Uri;", "getAllUris", "Lcom/amazon/aps/iva/if0/c;", "json", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "getAllBrazeActionStepTypes", "actionType", "uriList", "doAnyTypesMatch", "android-sdk-ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeActionUtils {

    /* compiled from: BrazeActionUtils.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeActionParser.ActionType.values().length];
            try {
                iArr[BrazeActionParser.ActionType.CONTAINER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean containsAnyPushPermissionBrazeActions(IInAppMessage iInAppMessage) {
        j.f(iInAppMessage, "<this>");
        return doAnyTypesMatch(BrazeActionParser.ActionType.REQUEST_PUSH_PERMISSION, getAllUris(iInAppMessage));
    }

    public static final boolean containsInvalidBrazeAction(IInAppMessage iInAppMessage) {
        j.f(iInAppMessage, "<this>");
        return doAnyTypesMatch(BrazeActionParser.ActionType.INVALID, getAllUris(iInAppMessage));
    }

    public static final boolean doAnyTypesMatch(BrazeActionParser.ActionType actionType, List<? extends Uri> list) {
        boolean z;
        c cVar;
        j.f(actionType, "actionType");
        j.f(list, "uriList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (BrazeActionParser.INSTANCE.isBrazeActionUri((Uri) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.kb0.j brazeActionVersionAndJson$android_sdk_ui_release = BrazeActionParser.INSTANCE.getBrazeActionVersionAndJson$android_sdk_ui_release((Uri) it.next());
            if (brazeActionVersionAndJson$android_sdk_ui_release == null || (cVar = (c) brazeActionVersionAndJson$android_sdk_ui_release.c) == null) {
                cVar = new c();
            }
            arrayList2.add(cVar);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            t.d0(arrayList3, getAllBrazeActionStepTypes((c) it2.next()));
        }
        if (arrayList3.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            if (((BrazeActionParser.ActionType) it3.next()) == actionType) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ List getAllBrazeActionStepTypes(c cVar) {
        j.f(cVar, "json");
        ArrayList arrayList = new ArrayList();
        StepData stepData = new StepData(cVar, null, 2, null);
        BrazeActionParser.ActionType actionType$android_sdk_ui_release = BrazeActionParser.INSTANCE.getActionType$android_sdk_ui_release(stepData);
        if (WhenMappings.$EnumSwitchMapping$0[actionType$android_sdk_ui_release.ordinal()] == 1) {
            Iterator childStepIterator$android_sdk_ui_release = ContainerStep.INSTANCE.getChildStepIterator$android_sdk_ui_release(stepData);
            while (childStepIterator$android_sdk_ui_release.hasNext()) {
                arrayList.addAll(getAllBrazeActionStepTypes((c) childStepIterator$android_sdk_ui_release.next()));
            }
        } else {
            arrayList.add(actionType$android_sdk_ui_release);
        }
        return arrayList;
    }

    public static final /* synthetic */ List getAllUris(IInAppMessage iInAppMessage) {
        if (iInAppMessage == null) {
            return z.b;
        }
        ArrayList arrayList = new ArrayList();
        Uri uri = iInAppMessage.getUri();
        if (uri != null) {
            arrayList.add(uri);
        }
        if (iInAppMessage instanceof IInAppMessageImmersive) {
            ArrayList arrayList2 = new ArrayList();
            for (MessageButton messageButton : ((IInAppMessageImmersive) iInAppMessage).getMessageButtons()) {
                Uri uri2 = messageButton.getUri();
                if (uri2 != null) {
                    arrayList2.add(uri2);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public static final boolean containsInvalidBrazeAction(Card card) {
        j.f(card, "<this>");
        if (card.getUrl() != null) {
            return doAnyTypesMatch(BrazeActionParser.ActionType.INVALID, f1.J(Uri.parse(card.getUrl())));
        }
        return false;
    }
}
