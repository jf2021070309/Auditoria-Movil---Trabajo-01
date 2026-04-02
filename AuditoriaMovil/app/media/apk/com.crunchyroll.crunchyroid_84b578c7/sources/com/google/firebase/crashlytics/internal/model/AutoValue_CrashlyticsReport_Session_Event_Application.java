package com.google.firebase.crashlytics.internal.model;

import com.amazon.aps.iva.c80.a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {
    private final Boolean background;
    private final ImmutableList<CrashlyticsReport.CustomAttribute> customAttributes;
    private final CrashlyticsReport.Session.Event.Application.Execution execution;
    private final ImmutableList<CrashlyticsReport.CustomAttribute> internalKeys;
    private final int uiOrientation;

    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {
        private Boolean background;
        private ImmutableList<CrashlyticsReport.CustomAttribute> customAttributes;
        private CrashlyticsReport.Session.Event.Application.Execution execution;
        private ImmutableList<CrashlyticsReport.CustomAttribute> internalKeys;
        private Integer uiOrientation;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application build() {
            String str;
            if (this.execution == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (this.uiOrientation == null) {
                str = a.f(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(this.execution, this.customAttributes, this.internalKeys, this.background, this.uiOrientation.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setBackground(Boolean bool) {
            this.background = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(ImmutableList<CrashlyticsReport.CustomAttribute> immutableList) {
            this.customAttributes = immutableList;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setExecution(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution != null) {
                this.execution = execution;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(ImmutableList<CrashlyticsReport.CustomAttribute> immutableList) {
            this.internalKeys = immutableList;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i) {
            this.uiOrientation = Integer.valueOf(i);
            return this;
        }

        public Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event.Application application) {
            this.execution = application.getExecution();
            this.customAttributes = application.getCustomAttributes();
            this.internalKeys = application.getInternalKeys();
            this.background = application.getBackground();
            this.uiOrientation = Integer.valueOf(application.getUiOrientation());
        }
    }

    public boolean equals(Object obj) {
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList;
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
        if (this.execution.equals(application.getExecution()) && ((immutableList = this.customAttributes) != null ? immutableList.equals(application.getCustomAttributes()) : application.getCustomAttributes() == null) && ((immutableList2 = this.internalKeys) != null ? immutableList2.equals(application.getInternalKeys()) : application.getInternalKeys() == null) && ((bool = this.background) != null ? bool.equals(application.getBackground()) : application.getBackground() == null) && this.uiOrientation == application.getUiOrientation()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public Boolean getBackground() {
        return this.background;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public ImmutableList<CrashlyticsReport.CustomAttribute> getCustomAttributes() {
        return this.customAttributes;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public CrashlyticsReport.Session.Event.Application.Execution getExecution() {
        return this.execution;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public ImmutableList<CrashlyticsReport.CustomAttribute> getInternalKeys() {
        return this.internalKeys;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public int getUiOrientation() {
        return this.uiOrientation;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.execution.hashCode() ^ 1000003) * 1000003;
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList = this.customAttributes;
        int i = 0;
        if (immutableList == null) {
            hashCode = 0;
        } else {
            hashCode = immutableList.hashCode();
        }
        int i2 = (hashCode3 ^ hashCode) * 1000003;
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList2 = this.internalKeys;
        if (immutableList2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = immutableList2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Boolean bool = this.background;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((i3 ^ i) * 1000003) ^ this.uiOrientation;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.execution);
        sb.append(", customAttributes=");
        sb.append(this.customAttributes);
        sb.append(", internalKeys=");
        sb.append(this.internalKeys);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", uiOrientation=");
        return e.f(sb, this.uiOrientation, "}");
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution, ImmutableList<CrashlyticsReport.CustomAttribute> immutableList, ImmutableList<CrashlyticsReport.CustomAttribute> immutableList2, Boolean bool, int i) {
        this.execution = execution;
        this.customAttributes = immutableList;
        this.internalKeys = immutableList2;
        this.background = bool;
        this.uiOrientation = i;
    }
}
