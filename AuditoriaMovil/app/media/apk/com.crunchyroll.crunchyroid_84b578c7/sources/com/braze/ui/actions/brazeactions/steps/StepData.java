package com.braze.ui.actions.brazeactions.steps;

import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.Channel;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
/* compiled from: StepData.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0010\b\u0080\b\u0018\u0000 /2\u00020\u0001:\u0001/B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b-\u0010.J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010)\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010(R\u001d\u0010,\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010(¨\u00060"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/StepData;", "", "", FirebaseAnalytics.Param.INDEX, "getArg$android_sdk_ui_release", "(I)Ljava/lang/Object;", "getArg", "Lcom/braze/models/outgoing/BrazeProperties;", "coerceArgToPropertiesOrNull", "fixedArgCount", "Lcom/amazon/aps/iva/ec0/j;", "rangedArgCount", "", "isArgCountInBounds", "isArgString", "isArgOptionalJsonObject", "", "toString", "Lcom/amazon/aps/iva/if0/c;", "srcJson", "Lcom/braze/enums/Channel;", "channel", "copy", "hashCode", "other", "equals", "Lcom/amazon/aps/iva/if0/c;", "getSrcJson", "()Lcom/amazon/aps/iva/if0/c;", "Lcom/braze/enums/Channel;", "getChannel", "()Lcom/braze/enums/Channel;", "", "args$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getArgs", "()Ljava/util/List;", "args", "firstArg$delegate", "getFirstArg", "()Ljava/lang/Object;", "firstArg", "secondArg$delegate", "getSecondArg", "secondArg", "<init>", "(Lcom/amazon/aps/iva/if0/c;Lcom/braze/enums/Channel;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class StepData {
    public static final Companion Companion = new Companion(null);
    private final e args$delegate;
    private final Channel channel;
    private final e firstArg$delegate;
    private final e secondArg$delegate;
    private final c srcJson;

    /* compiled from: StepData.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/StepData$Companion;", "", "()V", "ARGS", "", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }
    }

    public StepData(c cVar, Channel channel) {
        j.f(cVar, "srcJson");
        j.f(channel, "channel");
        this.srcJson = cVar;
        this.channel = channel;
        this.args$delegate = f.b(new StepData$args$2(this));
        this.firstArg$delegate = f.b(new StepData$firstArg$2(this));
        this.secondArg$delegate = f.b(new StepData$secondArg$2(this));
    }

    public static /* synthetic */ StepData copy$default(StepData stepData, c cVar, Channel channel, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = stepData.srcJson;
        }
        if ((i & 2) != 0) {
            channel = stepData.channel;
        }
        return stepData.copy(cVar, channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Object> getArgs() {
        return (List) this.args$delegate.getValue();
    }

    public static /* synthetic */ boolean isArgCountInBounds$default(StepData stepData, int i, com.amazon.aps.iva.ec0.j jVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            jVar = null;
        }
        return stepData.isArgCountInBounds(i, jVar);
    }

    public final BrazeProperties coerceArgToPropertiesOrNull(int i) {
        Object w0 = x.w0(i, getArgs());
        if (w0 != null && (w0 instanceof c)) {
            return new BrazeProperties((c) w0);
        }
        return null;
    }

    public final StepData copy(c cVar, Channel channel) {
        j.f(cVar, "srcJson");
        j.f(channel, "channel");
        return new StepData(cVar, channel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) obj;
        if (j.a(this.srcJson, stepData.srcJson) && this.channel == stepData.channel) {
            return true;
        }
        return false;
    }

    public final Object getArg$android_sdk_ui_release(int i) {
        return x.w0(i, getArgs());
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final Object getFirstArg() {
        return this.firstArg$delegate.getValue();
    }

    public final Object getSecondArg() {
        return this.secondArg$delegate.getValue();
    }

    public final c getSrcJson() {
        return this.srcJson;
    }

    public int hashCode() {
        return this.channel.hashCode() + (this.srcJson.hashCode() * 31);
    }

    public final boolean isArgCountInBounds(int i, com.amazon.aps.iva.ec0.j jVar) {
        if (i != -1 && getArgs().size() != i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new StepData$isArgCountInBounds$1(i, this), 3, (Object) null);
            return false;
        } else if (jVar != null && !jVar.j(getArgs().size())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new StepData$isArgCountInBounds$2(jVar, this), 3, (Object) null);
            return false;
        } else {
            return true;
        }
    }

    public final boolean isArgOptionalJsonObject(int i) {
        Object arg$android_sdk_ui_release = getArg$android_sdk_ui_release(i);
        if (arg$android_sdk_ui_release != null && !(arg$android_sdk_ui_release instanceof c)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new StepData$isArgOptionalJsonObject$1(i, this), 3, (Object) null);
            return false;
        }
        return true;
    }

    public final boolean isArgString(int i) {
        if (getArg$android_sdk_ui_release(i) instanceof String) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new StepData$isArgString$1(i, this), 3, (Object) null);
        return false;
    }

    public String toString() {
        return "Channel " + this.channel + " and json\n" + JsonUtils.getPrettyPrintedString(this.srcJson);
    }

    public /* synthetic */ StepData(c cVar, Channel channel, int i, com.amazon.aps.iva.yb0.e eVar) {
        this(cVar, (i & 2) != 0 ? Channel.UNKNOWN : channel);
    }
}
