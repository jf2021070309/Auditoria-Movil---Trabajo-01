package com.rovio.rcs.socialnetwork;

import com.rovio.rcs.socialnetwork.SocialServiceUtils;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class SocialServiceObject {
    public JSONObject toJSON() {
        return new JSONObject();
    }

    /* loaded from: classes4.dex */
    public static final class SocialSharingResult extends SocialServiceObject {
        private String a;

        public SocialSharingResult(String str) {
            this.a = str;
        }

        public SocialSharingResult() {
            this.a = null;
        }

        public String sharedPostId() {
            return this.a;
        }

        public void setSharedPostId(String str) {
            this.a = str;
        }
    }

    /* loaded from: classes4.dex */
    public static final class SocialSendAppRequestResult extends SocialServiceObject {
        private boolean a = false;

        public boolean isCancelled() {
            return this.a;
        }

        public void setCancelled(boolean z) {
            this.a = z;
        }
    }

    /* loaded from: classes4.dex */
    public static final class SocialSendAppInviteRequestResult extends SocialServiceObject {
        private boolean a = false;

        public boolean isCancelled() {
            return this.a;
        }

        public void setCancelled(boolean z) {
            this.a = z;
        }
    }

    /* loaded from: classes4.dex */
    public static class SocialUser extends SocialServiceObject {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private HashMap<String, String> f;

        public SocialUser(String str) {
            this.a = str;
        }

        public SocialUser(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public String userId() {
            return this.a;
        }

        public String userName() {
            return this.b;
        }

        public String name() {
            return this.c;
        }

        public String profileImageURL() {
            return this.d;
        }

        public HashMap<String, String> customParams() {
            return this.f;
        }

        public String toString() {
            return serviceName() + " userId: " + userId() + ", userName: " + userName() + ", name: " + name() + ", profileImageURL: " + profileImageURL();
        }

        @Override // com.rovio.rcs.socialnetwork.SocialServiceObject
        public JSONObject toJSON() {
            JSONObject json = super.toJSON();
            try {
                if (this.a != null) {
                    json.put("userId", this.a);
                }
                if (this.b != null) {
                    json.put("userName", this.b);
                }
                if (this.c != null) {
                    json.put("name", this.c);
                }
                if (this.d != null) {
                    json.put("profileImageURL", this.d);
                }
                if (this.f != null) {
                    json.put("customParams", new JSONObject(this.f));
                }
            } catch (JSONException e) {
                SocialServiceUtils.Log.writeLine("SocialUser toJSON", e.getMessage());
            }
            return json;
        }

        public String serviceName() {
            return this.e;
        }

        public void setServiceName(String str) {
            this.e = str;
        }

        public void setProfileImageURL(String str) {
            this.d = str;
        }

        public void setUserName(String str) {
            this.b = str;
        }

        public void setName(String str) {
            this.c = str;
        }

        public void setCustomParams(HashMap<String, String> hashMap) {
            this.f = hashMap;
        }
    }

    /* loaded from: classes4.dex */
    public static final class SocialUserList extends SocialServiceObject {
        private List<SocialUser> a;

        public SocialUserList(List<SocialUser> list) {
            this.a = list;
        }

        public List<SocialUser> userList() {
            return this.a;
        }

        @Override // com.rovio.rcs.socialnetwork.SocialServiceObject
        public JSONObject toJSON() {
            JSONArray jSONArray = new JSONArray();
            for (SocialUser socialUser : this.a) {
                jSONArray.put(socialUser.toJSON());
            }
            JSONObject json = super.toJSON();
            try {
                json.putOpt("userList", jSONArray);
            } catch (JSONException e) {
                SocialServiceUtils.Log.writeLine("SocialUserList toJSON", e.getMessage());
            }
            return json;
        }
    }

    /* loaded from: classes4.dex */
    public static final class SocialUserProfile extends SocialUser {
        private String a;
        private String b;

        public SocialUserProfile(String str, String str2, String str3, String str4, String str5) {
            super(str, str2, str3, str4);
            this.a = str5;
        }

        public String accessToken() {
            return this.a;
        }

        public String appId() {
            return this.b;
        }

        public void setAppId(String str) {
            this.b = str;
        }

        @Override // com.rovio.rcs.socialnetwork.SocialServiceObject.SocialUser
        public String toString() {
            return super.toString() + ", accessToken = " + accessToken() + ", appId = " + appId();
        }

        @Override // com.rovio.rcs.socialnetwork.SocialServiceObject.SocialUser, com.rovio.rcs.socialnetwork.SocialServiceObject
        public JSONObject toJSON() {
            JSONObject json = super.toJSON();
            try {
                if (this.a != null) {
                    json.put("accessToken", this.a);
                }
                if (this.b != null) {
                    json.put("appId", this.b);
                }
            } catch (JSONException e) {
                SocialServiceUtils.Log.writeLine("SocialUser toJSON", e.getMessage());
            }
            return json;
        }
    }
}
