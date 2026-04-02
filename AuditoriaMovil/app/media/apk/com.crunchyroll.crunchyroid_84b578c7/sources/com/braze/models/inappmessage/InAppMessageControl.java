package com.braze.models.inappmessage;

import bo.app.p1;
import bo.app.r1;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.enums.inappmessage.MessageType;
import com.braze.support.BrazeLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageControl;", "Lcom/braze/models/inappmessage/InAppMessageBase;", "", "logImpression", "Ljava/util/concurrent/atomic/AtomicBoolean;", "controlImpressionLogged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "Lcom/amazon/aps/iva/if0/c;", "jsonObject", "Lbo/app/r1;", "brazeManager", "<init>", "(Lcom/amazon/aps/iva/if0/c;Lbo/app/r1;)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class InAppMessageControl extends InAppMessageBase {
    private final AtomicBoolean controlImpressionLogged;

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Control impression already logged for this in-app message. Ignoring.";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Trigger Id not found (this is expected for test sends). Not logging in-app message control impression.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message control impression because the BrazeManager is null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Logging control in-app message impression event";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageControl(com.amazon.aps.iva.if0.c cVar, r1 r1Var) {
        super(cVar, r1Var, false, false, 12, null);
        j.f(cVar, "jsonObject");
        j.f(r1Var, "brazeManager");
        this.controlImpressionLogged = new AtomicBoolean(false);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.CONTROL;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        boolean z;
        p1 p1Var;
        if (this.controlImpressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
            return false;
        }
        String triggerId = getTriggerId();
        if (triggerId != null && triggerId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
            return false;
        } else if (getBrazeManager() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
            return false;
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, d.b, 2, (Object) null);
            String triggerId2 = getTriggerId();
            if (triggerId2 != null) {
                p1Var = bo.app.j.h.h(triggerId2);
            } else {
                p1Var = null;
            }
            if (p1Var != null) {
                r1 brazeManager = getBrazeManager();
                if (brazeManager != null) {
                    brazeManager.a(p1Var);
                }
                this.controlImpressionLogged.set(true);
            }
            return true;
        }
    }
}
