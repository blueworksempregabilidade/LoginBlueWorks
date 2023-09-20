package com.example.login_blueworks;

// 1.0
public class User {

    public static final String TAG = "User Table";

    // Membros da classe = colunas da tabela

    @Override
    public String toString() {
        return "User{" +
                "mId=" + mId +
                ", mFullName='" + mFullName + '\'' +
                ", mUserName='" + mUserName + '\'' +
                ", mPassword='" + mPassword + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mApiKey='" + mApiKey + '\'' +
                ", mResetPasswordOtp='" + mResetPasswordOtp + '\'' +
                ", mResetPasswordCreatedAt=" + mResetPasswordCreatedAt +
                '}';
    }

    public User(String mFullName, String mUserName, String mPassword, String mEmail, String mApiKey, String mResetPasswordOtp, long mResetPasswordCreatedAt) {
        this.mFullName = mFullName;
        this.mUserName = mUserName;
        this.mPassword = mPassword;
        this.mEmail = mEmail;
        this.mApiKey = mApiKey;
        this.mResetPasswordOtp = mResetPasswordOtp;
        this.mResetPasswordCreatedAt = mResetPasswordCreatedAt;
    }

    public User(int mId, String mFullName, String mUserName, String mPassword, String mEmail, String mApiKey, String mResetPasswordOtp, long mResetPasswordCreatedAt) {
        this.mId = mId;
        this.mFullName = mFullName;
        this.mUserName = mUserName;
        this.mPassword = mPassword;
        this.mEmail = mEmail;
        this.mApiKey = mApiKey;
        this.mResetPasswordOtp = mResetPasswordOtp;
        this.mResetPasswordCreatedAt = mResetPasswordCreatedAt;
    }

    private int mId;
    private String mFullName;
    private String mUserName;
    private String mPassword;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmFullName() {
        return mFullName;
    }

    public void setmFullName(String mFullName) {
        this.mFullName = mFullName;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmApiKey() {
        return mApiKey;
    }

    public void setmApiKey(String mApiKey) {
        this.mApiKey = mApiKey;
    }

    public String getmResetPasswordOtp() {
        return mResetPasswordOtp;
    }

    public void setmResetPasswordOtp(String mResetPasswordOtp) {
        this.mResetPasswordOtp = mResetPasswordOtp;
    }

    public long getmResetPasswordCreatedAt() {
        return mResetPasswordCreatedAt;
    }

    public void setmResetPasswordCreatedAt(long mResetPasswordCreatedAt) {
        this.mResetPasswordCreatedAt = mResetPasswordCreatedAt;
    }

    private String mEmail;
    private String mApiKey;
    private String mResetPasswordOtp;
    private long mResetPasswordCreatedAt;





}
