package com.rovio.rcs.socialnetwork;

import java.util.HashMap;
/* loaded from: classes4.dex */
public class SocialServiceRequest {

    /* loaded from: classes4.dex */
    public interface Callback {
        void onCompleted(SocialServiceResponse socialServiceResponse);

        void onStarted(SocialServiceRequest socialServiceRequest);
    }

    /* loaded from: classes4.dex */
    public static final class SocialGetUserProfileRequest extends SocialServiceRequest {
    }

    /* loaded from: classes4.dex */
    public static final class SocialSharingRequest extends SocialServiceRequest {
        private SharingType a;
        private String b;
        private String c;
        private String d;
        private String e;

        /* loaded from: classes4.dex */
        public enum SharingType {
            SHARING_TYPE_STATUS,
            SHARING_TYPE_VIDEO,
            SHARING_TYPE_SCORE
        }

        public SocialSharingRequest(SharingType sharingType, String str, String str2, String str3, String str4) {
            this.a = sharingType;
            this.e = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public SharingType sharingType() {
            return this.a;
        }

        public String title() {
            return this.e;
        }

        public String text() {
            return this.b;
        }

        public void setText(String str) {
            this.b = str;
        }

        public String url() {
            return this.c;
        }

        public String imageURL() {
            return this.d;
        }
    }

    /* loaded from: classes4.dex */
    public static final class SocialGetFriendsRequest extends SocialServiceRequest {
        private String a;
        private RequestType b;

        /* loaded from: classes4.dex */
        public enum RequestType {
            ID_ONLY,
            FULL_PROFILE
        }

        public SocialGetFriendsRequest(String str, int i) {
            this.a = str;
            if (i == 0) {
                this.b = RequestType.ID_ONLY;
            } else {
                this.b = RequestType.FULL_PROFILE;
            }
        }

        public String getPagination() {
            return this.a;
        }

        public RequestType getRequestType() {
            return this.b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class SocialAppRequest extends SocialServiceRequest {
        private String[] a;
        private String b;
        private String c;
        private UserInteractionMode d;
        private HashMap<String, String> e;

        /* loaded from: classes4.dex */
        enum UserInteractionMode {
            PROMPT_CONFIRMATION_DIRECTED,
            PROMPT_CONFIRMATION_SUGGESTED,
            NO_CONFIRMATION
        }

        public SocialAppRequest(UserInteractionMode userInteractionMode, String[] strArr, String str, String str2, HashMap<String, String> hashMap) {
            this.a = strArr;
            this.b = str;
            this.c = str2;
            this.d = userInteractionMode;
            this.e = hashMap;
        }

        public String[] userIds() {
            return this.a;
        }

        public String title() {
            return this.b;
        }

        public String message() {
            return this.c;
        }

        public UserInteractionMode userInteractionMode() {
            return this.d;
        }

        public HashMap<String, String> customParams() {
            return this.e;
        }
    }

    /* loaded from: classes4.dex */
    public static final class SocialAppInviteRequest extends SocialServiceRequest {
        private String a;
        private String b;

        public SocialAppInviteRequest(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public String appLinkUrl() {
            return this.a;
        }

        public String previewImageUrl() {
            return this.b;
        }
    }
}
