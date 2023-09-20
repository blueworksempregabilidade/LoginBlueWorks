package com.example.login_blueworks;
//1.1
public class Vancancy {

    public static final String TAG = "Vancancy Table";
    // Deixar em ordem da tabela
    // pergutar ao professor se na tabela vagas tem mais alguma coisa na tabela (ex:infos da vaga)
    // se tiver, tem que modificar "VancancyDao"
    private int mId;
    private String mName;
    public int mStatus;
    private long mImage;

    public Vancancy(String mName, int mStatus, long mImage) {
        this.mName = mName;
        this.mStatus = mStatus;
        this.mImage = mImage;
    }

    public Vancancy(int mId, String mName, int mStatus, long mImage) {
        this.mId = mId;
        this.mName = mName;
        this.mStatus = mStatus;
        this.mImage = mImage;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmStatus() {
        return mStatus;
    }

    public void setmStatus(int mStatus) {
        this.mStatus = mStatus;
    }

    public long getmImage() {
        return mImage;
    }

    public void setmImage(long mImage) {
        this.mImage = mImage;
    }
}
